/*
 *  ******************************************************************************
 *  *
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Apache License, Version 2.0 which is available at
 *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *
 *  *  See the NOTICE file distributed with this work for additional
 *  *  information regarding copyright ownership.
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *  * SPDX-License-Identifier: Apache-2.0
 *  *****************************************************************************
 */

package org.deeplearning4j.spark.impl.graph.scoring;

import lombok.extern.slf4j.Slf4j;
import org.apache.spark.api.java.function.DoubleFlatMapFunction;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.broadcast.Broadcast;
import org.deeplearning4j.nn.conf.ComputationGraphConfiguration;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.api.MultiDataSet;
import org.nd4j.linalg.factory.Nd4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.val;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


@Slf4j
public class ScoreExamplesFunction implements DoubleFlatMapFunction<Iterator<MultiDataSet>> {

    private final Broadcast<INDArray> params;
    private final Broadcast<String> jsonConfig;
    private final boolean addRegularization;
    private final int batchSize;

    public ScoreExamplesFunction(Broadcast<INDArray> params, Broadcast<String> jsonConfig,
                    boolean addRegularizationTerms, int batchSize) {
        this.params = params;
        this.jsonConfig = jsonConfig;
        this.addRegularization = addRegularizationTerms;
        this.batchSize = batchSize;
    }


    @Override
    public Iterator<Double> call(Iterator<MultiDataSet> iterator) throws Exception {
        if (!iterator.hasNext()) {
            return Collections.emptyIterator();
        }

        ComputationGraph network = new ComputationGraph(ComputationGraphConfiguration.fromJson(jsonConfig.getValue()));
        network.init();
        INDArray val = params.value().unsafeDuplication();
        if (val.length() != network.numParams(false))
            throw new IllegalStateException(
                            "Network did not have same number of parameters as the broadcast set parameters");
        network.setParams(val);

        List<Double> ret = new ArrayList<>();

        List<MultiDataSet> collect = new ArrayList<>(batchSize);
        int totalCount = 0;
        while (iterator.hasNext()) {
            collect.clear();
            int nExamples = 0;
            while (iterator.hasNext() && nExamples < batchSize) {
                MultiDataSet ds = iterator.next();
                val n = ds.getFeatures(0).size(0);
                collect.add(ds);
                nExamples += n;
            }
            totalCount += nExamples;


            MultiDataSet data = org.nd4j.linalg.dataset.MultiDataSet.merge(collect);


            INDArray scores = network.scoreExamples(data, addRegularization);
            double[] doubleScores = scores.data().asDouble();

            for (double doubleScore : doubleScores) {
                ret.add(doubleScore);
            }
        }

        Nd4j.getExecutioner().commit();

        if (log.isDebugEnabled()) {
            log.debug("Scored {} examples ", totalCount);
        }

        return ret.iterator();
    }
}
