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

package org.nd4j.parameterserver.status.play;

import org.junit.Test;
import org.nd4j.common.tests.BaseND4JTest;
import play.server.Server;

public class StatusServerTests extends BaseND4JTest {

    @Test(timeout = 20000L)
    public void runStatusServer() {
        Server server = StatusServer.startServer(new InMemoryStatusStorage(), 65236);
        server.stop();
    }

}
