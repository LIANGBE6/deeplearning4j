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

package org.nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.nio.ByteOrder;

import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class UIGraphStructure extends Table {
  public static UIGraphStructure getRootAsUIGraphStructure(ByteBuffer _bb) { return getRootAsUIGraphStructure(_bb, new UIGraphStructure()); }
  public static UIGraphStructure getRootAsUIGraphStructure(ByteBuffer _bb, UIGraphStructure obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public UIGraphStructure __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String inputs(int j) { int o = __offset(4); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int inputsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public IntPair inputsPair(int j) { return inputsPair(new IntPair(), j); }
  public IntPair inputsPair(IntPair obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int inputsPairLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public String outputs(int j) { int o = __offset(8); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int outputsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public UIVariable variables(int j) { return variables(new UIVariable(), j); }
  public UIVariable variables(UIVariable obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int variablesLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public UIOp ops(int j) { return ops(new UIOp(), j); }
  public UIOp ops(UIOp obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int opsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }

  public static int createUIGraphStructure(FlatBufferBuilder builder,
      int inputsOffset,
      int inputsPairOffset,
      int outputsOffset,
      int variablesOffset,
      int opsOffset) {
    builder.startObject(5);
    UIGraphStructure.addOps(builder, opsOffset);
    UIGraphStructure.addVariables(builder, variablesOffset);
    UIGraphStructure.addOutputs(builder, outputsOffset);
    UIGraphStructure.addInputsPair(builder, inputsPairOffset);
    UIGraphStructure.addInputs(builder, inputsOffset);
    return UIGraphStructure.endUIGraphStructure(builder);
  }

  public static void startUIGraphStructure(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addInputs(FlatBufferBuilder builder, int inputsOffset) { builder.addOffset(0, inputsOffset, 0); }
  public static int createInputsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startInputsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addInputsPair(FlatBufferBuilder builder, int inputsPairOffset) { builder.addOffset(1, inputsPairOffset, 0); }
  public static int createInputsPairVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startInputsPairVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOutputs(FlatBufferBuilder builder, int outputsOffset) { builder.addOffset(2, outputsOffset, 0); }
  public static int createOutputsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startOutputsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addVariables(FlatBufferBuilder builder, int variablesOffset) { builder.addOffset(3, variablesOffset, 0); }
  public static int createVariablesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startVariablesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOps(FlatBufferBuilder builder, int opsOffset) { builder.addOffset(4, opsOffset, 0); }
  public static int createOpsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startOpsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endUIGraphStructure(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

