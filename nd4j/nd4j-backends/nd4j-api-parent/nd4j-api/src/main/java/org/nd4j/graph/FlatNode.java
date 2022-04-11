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
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatNode extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FlatNode getRootAsFlatNode(ByteBuffer _bb) { return getRootAsFlatNode(_bb, new FlatNode()); }
  public static FlatNode getRootAsFlatNode(ByteBuffer _bb, FlatNode obj) { _bb.order(java.nio.ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FlatNode __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public byte opType() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public long opNum() { int o = __offset(10); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public org.nd4j.graph.FlatProperties properties(int j) { return properties(new org.nd4j.graph.FlatProperties(), j); }
  public org.nd4j.graph.FlatProperties properties(org.nd4j.graph.FlatProperties obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int propertiesLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public org.nd4j.graph.FlatProperties.Vector propertiesVector() { return propertiesVector(new org.nd4j.graph.FlatProperties.Vector()); }
  public org.nd4j.graph.FlatProperties.Vector propertiesVector(org.nd4j.graph.FlatProperties.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public int input(int j) { int o = __offset(14); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int inputLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public IntVector inputVector() { return inputVector(new IntVector()); }
  public IntVector inputVector(IntVector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer inputAsByteBuffer() { return __vector_as_bytebuffer(14, 4); }
  public ByteBuffer inputInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 4); }
  public org.nd4j.graph.IntPair inputPaired(int j) { return inputPaired(new org.nd4j.graph.IntPair(), j); }
  public org.nd4j.graph.IntPair inputPaired(org.nd4j.graph.IntPair obj, int j) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int inputPairedLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public org.nd4j.graph.IntPair.Vector inputPairedVector() { return inputPairedVector(new org.nd4j.graph.IntPair.Vector()); }
  public org.nd4j.graph.IntPair.Vector inputPairedVector(org.nd4j.graph.IntPair.Vector obj) { int o = __offset(16); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public int output(int j) { int o = __offset(18); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int outputLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public IntVector outputVector() { return outputVector(new IntVector()); }
  public IntVector outputVector(IntVector obj) { int o = __offset(18); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer outputAsByteBuffer() { return __vector_as_bytebuffer(18, 4); }
  public ByteBuffer outputInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 4); }
  public double extraParams(int j) { int o = __offset(20); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int extraParamsLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public DoubleVector extraParamsVector() { return extraParamsVector(new DoubleVector()); }
  public DoubleVector extraParamsVector(DoubleVector obj) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer extraParamsAsByteBuffer() { return __vector_as_bytebuffer(20, 8); }
  public ByteBuffer extraParamsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 8); }
  public long extraInteger(int j) { int o = __offset(22); return o != 0 ? bb.getLong(__vector(o) + j * 8) : 0; }
  public int extraIntegerLength() { int o = __offset(22); return o != 0 ? __vector_len(o) : 0; }
  public LongVector extraIntegerVector() { return extraIntegerVector(new LongVector()); }
  public LongVector extraIntegerVector(LongVector obj) { int o = __offset(22); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer extraIntegerAsByteBuffer() { return __vector_as_bytebuffer(22, 8); }
  public ByteBuffer extraIntegerInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 8); }
  public boolean extraBools(int j) { int o = __offset(24); return o != 0 ? 0!=bb.get(__vector(o) + j * 1) : false; }
  public int extraBoolsLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public BooleanVector extraBoolsVector() { return extraBoolsVector(new BooleanVector()); }
  public BooleanVector extraBoolsVector(BooleanVector obj) { int o = __offset(24); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer extraBoolsAsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public ByteBuffer extraBoolsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 24, 1); }
  public int dimensions(int j) { int o = __offset(26); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int dimensionsLength() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public IntVector dimensionsVector() { return dimensionsVector(new IntVector()); }
  public IntVector dimensionsVector(IntVector obj) { int o = __offset(26); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer dimensionsAsByteBuffer() { return __vector_as_bytebuffer(26, 4); }
  public ByteBuffer dimensionsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 26, 4); }
  public int device() { int o = __offset(28); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int scopeId() { int o = __offset(30); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String scopeName() { int o = __offset(32); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer scopeNameAsByteBuffer() { return __vector_as_bytebuffer(32, 1); }
  public ByteBuffer scopeNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 32, 1); }
  public String outputNames(int j) { int o = __offset(34); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int outputNamesLength() { int o = __offset(34); return o != 0 ? __vector_len(o) : 0; }
  public StringVector outputNamesVector() { return outputNamesVector(new StringVector()); }
  public StringVector outputNamesVector(StringVector obj) { int o = __offset(34); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String opName() { int o = __offset(36); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer opNameAsByteBuffer() { return __vector_as_bytebuffer(36, 1); }
  public ByteBuffer opNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 36, 1); }
  public byte outputTypes(int j) { int o = __offset(38); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int outputTypesLength() { int o = __offset(38); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector outputTypesVector() { return outputTypesVector(new ByteVector()); }
  public ByteVector outputTypesVector(ByteVector obj) { int o = __offset(38); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer outputTypesAsByteBuffer() { return __vector_as_bytebuffer(38, 1); }
  public ByteBuffer outputTypesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 38, 1); }
  public org.nd4j.graph.FlatArray scalar() { return scalar(new org.nd4j.graph.FlatArray()); }
  public org.nd4j.graph.FlatArray scalar(org.nd4j.graph.FlatArray obj) { int o = __offset(40); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String controlDeps(int j) { int o = __offset(42); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int controlDepsLength() { int o = __offset(42); return o != 0 ? __vector_len(o) : 0; }
  public StringVector controlDepsVector() { return controlDepsVector(new StringVector()); }
  public StringVector controlDepsVector(StringVector obj) { int o = __offset(42); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String varControlDeps(int j) { int o = __offset(44); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int varControlDepsLength() { int o = __offset(44); return o != 0 ? __vector_len(o) : 0; }
  public StringVector varControlDepsVector() { return varControlDepsVector(new StringVector()); }
  public StringVector varControlDepsVector(StringVector obj) { int o = __offset(44); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String controlDepFor(int j) { int o = __offset(46); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int controlDepForLength() { int o = __offset(46); return o != 0 ? __vector_len(o) : 0; }
  public StringVector controlDepForVector() { return controlDepForVector(new StringVector()); }
  public StringVector controlDepForVector(StringVector obj) { int o = __offset(46); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public byte extraTypes(int j) { int o = __offset(48); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int extraTypesLength() { int o = __offset(48); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector extraTypesVector() { return extraTypesVector(new ByteVector()); }
  public ByteVector extraTypesVector(ByteVector obj) { int o = __offset(48); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer extraTypesAsByteBuffer() { return __vector_as_bytebuffer(48, 1); }
  public ByteBuffer extraTypesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 48, 1); }
  public String extraStrings(int j) { int o = __offset(50); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int extraStringsLength() { int o = __offset(50); return o != 0 ? __vector_len(o) : 0; }
  public StringVector extraStringsVector() { return extraStringsVector(new StringVector()); }
  public StringVector extraStringsVector(StringVector obj) { int o = __offset(50); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createFlatNode(FlatBufferBuilder builder,
      int id,
      int nameOffset,
      byte opType,
      long opNum,
      int propertiesOffset,
      int inputOffset,
      int inputPairedOffset,
      int outputOffset,
      int extraParamsOffset,
      int extraIntegerOffset,
      int extraBoolsOffset,
      int dimensionsOffset,
      int device,
      int scope_id,
      int scope_nameOffset,
      int outputNamesOffset,
      int opNameOffset,
      int outputTypesOffset,
      int scalarOffset,
      int controlDepsOffset,
      int varControlDepsOffset,
      int controlDepForOffset,
      int extraTypesOffset,
      int extraStringsOffset) {
    builder.startTable(24);
    FlatNode.addOpNum(builder, opNum);
    FlatNode.addExtraStrings(builder, extraStringsOffset);
    FlatNode.addExtraTypes(builder, extraTypesOffset);
    FlatNode.addControlDepFor(builder, controlDepForOffset);
    FlatNode.addVarControlDeps(builder, varControlDepsOffset);
    FlatNode.addControlDeps(builder, controlDepsOffset);
    FlatNode.addScalar(builder, scalarOffset);
    FlatNode.addOutputTypes(builder, outputTypesOffset);
    FlatNode.addOpName(builder, opNameOffset);
    FlatNode.addOutputNames(builder, outputNamesOffset);
    FlatNode.addScopeName(builder, scope_nameOffset);
    FlatNode.addScopeId(builder, scope_id);
    FlatNode.addDevice(builder, device);
    FlatNode.addDimensions(builder, dimensionsOffset);
    FlatNode.addExtraBools(builder, extraBoolsOffset);
    FlatNode.addExtraInteger(builder, extraIntegerOffset);
    FlatNode.addExtraParams(builder, extraParamsOffset);
    FlatNode.addOutput(builder, outputOffset);
    FlatNode.addInputPaired(builder, inputPairedOffset);
    FlatNode.addInput(builder, inputOffset);
    FlatNode.addProperties(builder, propertiesOffset);
    FlatNode.addName(builder, nameOffset);
    FlatNode.addId(builder, id);
    FlatNode.addOpType(builder, opType);
    return FlatNode.endFlatNode(builder);
  }

  public static void startFlatNode(FlatBufferBuilder builder) { builder.startTable(24); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addOpType(FlatBufferBuilder builder, byte opType) { builder.addByte(2, opType, 0); }
  public static void addOpNum(FlatBufferBuilder builder, long opNum) { builder.addLong(3, opNum, 0L); }
  public static void addProperties(FlatBufferBuilder builder, int propertiesOffset) { builder.addOffset(4, propertiesOffset, 0); }
  public static int createPropertiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPropertiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addInput(FlatBufferBuilder builder, int inputOffset) { builder.addOffset(5, inputOffset, 0); }
  public static int createInputVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startInputVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addInputPaired(FlatBufferBuilder builder, int inputPairedOffset) { builder.addOffset(6, inputPairedOffset, 0); }
  public static int createInputPairedVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startInputPairedVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOutput(FlatBufferBuilder builder, int outputOffset) { builder.addOffset(7, outputOffset, 0); }
  public static int createOutputVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startOutputVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addExtraParams(FlatBufferBuilder builder, int extraParamsOffset) { builder.addOffset(8, extraParamsOffset, 0); }
  public static int createExtraParamsVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startExtraParamsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addExtraInteger(FlatBufferBuilder builder, int extraIntegerOffset) { builder.addOffset(9, extraIntegerOffset, 0); }
  public static int createExtraIntegerVector(FlatBufferBuilder builder, long[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addLong(data[i]); return builder.endVector(); }
  public static void startExtraIntegerVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addExtraBools(FlatBufferBuilder builder, int extraBoolsOffset) { builder.addOffset(10, extraBoolsOffset, 0); }
  public static int createExtraBoolsVector(FlatBufferBuilder builder, boolean[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addBoolean(data[i]); return builder.endVector(); }
  public static void startExtraBoolsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addDimensions(FlatBufferBuilder builder, int dimensionsOffset) { builder.addOffset(11, dimensionsOffset, 0); }
  public static int createDimensionsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startDimensionsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDevice(FlatBufferBuilder builder, int device) { builder.addInt(12, device, 0); }
  public static void addScopeId(FlatBufferBuilder builder, int scopeId) { builder.addInt(13, scopeId, 0); }
  public static void addScopeName(FlatBufferBuilder builder, int scopeNameOffset) { builder.addOffset(14, scopeNameOffset, 0); }
  public static void addOutputNames(FlatBufferBuilder builder, int outputNamesOffset) { builder.addOffset(15, outputNamesOffset, 0); }
  public static int createOutputNamesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startOutputNamesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOpName(FlatBufferBuilder builder, int opNameOffset) { builder.addOffset(16, opNameOffset, 0); }
  public static void addOutputTypes(FlatBufferBuilder builder, int outputTypesOffset) { builder.addOffset(17, outputTypesOffset, 0); }
  public static int createOutputTypesVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createOutputTypesVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startOutputTypesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addScalar(FlatBufferBuilder builder, int scalarOffset) { builder.addOffset(18, scalarOffset, 0); }
  public static void addControlDeps(FlatBufferBuilder builder, int controlDepsOffset) { builder.addOffset(19, controlDepsOffset, 0); }
  public static int createControlDepsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startControlDepsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addVarControlDeps(FlatBufferBuilder builder, int varControlDepsOffset) { builder.addOffset(20, varControlDepsOffset, 0); }
  public static int createVarControlDepsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startVarControlDepsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addControlDepFor(FlatBufferBuilder builder, int controlDepForOffset) { builder.addOffset(21, controlDepForOffset, 0); }
  public static int createControlDepForVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startControlDepForVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addExtraTypes(FlatBufferBuilder builder, int extraTypesOffset) { builder.addOffset(22, extraTypesOffset, 0); }
  public static int createExtraTypesVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createExtraTypesVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startExtraTypesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addExtraStrings(FlatBufferBuilder builder, int extraStringsOffset) { builder.addOffset(23, extraStringsOffset, 0); }
  public static int createExtraStringsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startExtraStringsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFlatNode(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFlatNodeBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFlatNodeBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FlatNode get(int j) { return get(new FlatNode(), j); }
    public FlatNode get(FlatNode obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

