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

package org.nd4j.ir;

public final class MapperNamespace {
  private MapperNamespace() {}
  public static void registerAllExtensions(
      org.nd4j.shade.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.nd4j.shade.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.nd4j.shade.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code org.nd4j.ir.OpListType}
   */
  public enum OpListType
      implements org.nd4j.shade.protobuf.ProtocolMessageEnum {
    /**
     * <code>TARG = 0;</code>
     */
    TARG(0),
    /**
     * <code>IARG = 1;</code>
     */
    IARG(1),
    /**
     * <code>BARG = 2;</code>
     */
    BARG(2),
    /**
     * <code>DTYPEARG = 3;</code>
     */
    DTYPEARG(3),
    /**
     * <code>INPUTARG = 4;</code>
     */
    INPUTARG(4),
    /**
     * <code>OUTPUTARG = 5;</code>
     */
    OUTPUTARG(5),
    /**
     * <code>AXISARG = 6;</code>
     */
    AXISARG(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>TARG = 0;</code>
     */
    public static final int TARG_VALUE = 0;
    /**
     * <code>IARG = 1;</code>
     */
    public static final int IARG_VALUE = 1;
    /**
     * <code>BARG = 2;</code>
     */
    public static final int BARG_VALUE = 2;
    /**
     * <code>DTYPEARG = 3;</code>
     */
    public static final int DTYPEARG_VALUE = 3;
    /**
     * <code>INPUTARG = 4;</code>
     */
    public static final int INPUTARG_VALUE = 4;
    /**
     * <code>OUTPUTARG = 5;</code>
     */
    public static final int OUTPUTARG_VALUE = 5;
    /**
     * <code>AXISARG = 6;</code>
     */
    public static final int AXISARG_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OpListType valueOf(int value) {
      return forNumber(value);
    }

    public static OpListType forNumber(int value) {
      switch (value) {
        case 0: return TARG;
        case 1: return IARG;
        case 2: return BARG;
        case 3: return DTYPEARG;
        case 4: return INPUTARG;
        case 5: return OUTPUTARG;
        case 6: return AXISARG;
        default: return null;
      }
    }

    public static org.nd4j.shade.protobuf.Internal.EnumLiteMap<OpListType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.nd4j.shade.protobuf.Internal.EnumLiteMap<
        OpListType> internalValueMap =
          new org.nd4j.shade.protobuf.Internal.EnumLiteMap<OpListType>() {
            public OpListType findValueByNumber(int number) {
              return OpListType.forNumber(number);
            }
          };

    public final org.nd4j.shade.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final org.nd4j.shade.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final org.nd4j.shade.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.nd4j.ir.MapperNamespace.getDescriptor().getEnumTypes().get(0);
    }

    private static final OpListType[] VALUES = values();

    public static OpListType valueOf(
        org.nd4j.shade.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OpListType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:org.nd4j.ir.OpListType)
  }

  public interface MappingRuleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.MappingRule)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>string ruleName = 1;</code>
     */
    java.lang.String getRuleName();
    /**
     * <code>string ruleName = 1;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getRuleNameBytes();

    /**
     * <code>string functionName = 2;</code>
     */
    java.lang.String getFunctionName();
    /**
     * <code>string functionName = 2;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getFunctionNameBytes();

    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    java.util.List<java.lang.String>
        getInputStringAttrNameList();
    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    int getInputStringAttrNameCount();
    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    java.lang.String getInputStringAttrName(int index);
    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputStringAttrNameBytes(int index);

    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    java.util.List<java.lang.String>
        getOutputStringAttrNameList();
    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    int getOutputStringAttrNameCount();
    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    java.lang.String getOutputStringAttrName(int index);
    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOutputStringAttrNameBytes(int index);

    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    java.util.List<java.lang.String>
        getInputIntNameList();
    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    int getInputIntNameCount();
    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    java.lang.String getInputIntName(int index);
    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputIntNameBytes(int index);

    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    java.util.List<java.lang.String>
        getOutputIntNameList();
    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    int getOutputIntNameCount();
    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    java.lang.String getOutputIntName(int index);
    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOutputIntNameBytes(int index);

    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    java.util.List<java.lang.String>
        getInputFloatNameList();
    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    int getInputFloatNameCount();
    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    java.lang.String getInputFloatName(int index);
    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputFloatNameBytes(int index);

    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    java.util.List<java.lang.String>
        getOutputFloatNameList();
    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    int getOutputFloatNameCount();
    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    java.lang.String getOutputFloatName(int index);
    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOutputFloatNameBytes(int index);

    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    java.util.List<java.lang.String>
        getInputDoubleNameList();
    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    int getInputDoubleNameCount();
    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    java.lang.String getInputDoubleName(int index);
    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputDoubleNameBytes(int index);

    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    java.util.List<java.lang.String>
        getOutputDoubleNameList();
    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    int getOutputDoubleNameCount();
    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    java.lang.String getOutputDoubleName(int index);
    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOutputDoubleNameBytes(int index);

    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    java.util.List<java.lang.String>
        getInputBooleanNameList();
    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    int getInputBooleanNameCount();
    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    java.lang.String getInputBooleanName(int index);
    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputBooleanNameBytes(int index);

    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    java.util.List<java.lang.String>
        getOutputBooleanNameList();
    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    int getOutputBooleanNameCount();
    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    java.lang.String getOutputBooleanName(int index);
    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOutputBooleanNameBytes(int index);

    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    java.util.List<java.lang.String>
        getInputTensorNameList();
    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    int getInputTensorNameCount();
    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    java.lang.String getInputTensorName(int index);
    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputTensorNameBytes(int index);

    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    java.util.List<java.lang.String>
        getOutputTensorNameList();
    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    int getOutputTensorNameCount();
    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    java.lang.String getOutputTensorName(int index);
    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOutputTensorNameBytes(int index);

    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    java.util.List<java.lang.String>
        getInputDataTypeNameList();
    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    int getInputDataTypeNameCount();
    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    java.lang.String getInputDataTypeName(int index);
    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputDataTypeNameBytes(int index);

    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    java.util.List<java.lang.String>
        getOutputDataTypeNameList();
    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    int getOutputDataTypeNameCount();
    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    java.lang.String getOutputDataTypeName(int index);
    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOutputDataTypeNameBytes(int index);

    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */
    int getInputToOutputCount();
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */
    boolean containsInputToOutput(
        java.lang.String key);
    /**
     * Use {@link #getInputToOutputMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String>
    getInputToOutput();
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */
    java.util.Map<java.lang.String, java.lang.String>
    getInputToOutputMap();
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */

    java.lang.String getInputToOutputOrDefault(
        java.lang.String key,
        java.lang.String defaultValue);
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */

    java.lang.String getInputToOutputOrThrow(
        java.lang.String key);

    /**
     * <code>string ruleType = 18;</code>
     */
    java.lang.String getRuleType();
    /**
     * <code>string ruleType = 18;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getRuleTypeBytes();

    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    java.util.List<org.nd4j.ir.MapperNamespace.TransformerArgs> 
        getTransformerArgsList();
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    org.nd4j.ir.MapperNamespace.TransformerArgs getTransformerArgs(int index);
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    int getTransformerArgsCount();
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    java.util.List<? extends org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder> 
        getTransformerArgsOrBuilderList();
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder getTransformerArgsOrBuilder(
        int index);

    /**
     * <code>string inputFrameworkOpName = 20;</code>
     */
    java.lang.String getInputFrameworkOpName();
    /**
     * <code>string inputFrameworkOpName = 20;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputFrameworkOpNameBytes();
  }
  /**
   * Protobuf type {@code org.nd4j.ir.MappingRule}
   */
  public  static final class MappingRule extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.MappingRule)
      MappingRuleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MappingRule.newBuilder() to construct.
    private MappingRule(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MappingRule() {
      ruleName_ = "";
      functionName_ = "";
      inputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      outputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      inputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      outputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      inputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      outputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      inputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      outputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      inputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      outputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      inputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      outputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      inputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      outputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      ruleType_ = "";
      transformerArgs_ = java.util.Collections.emptyList();
      inputFrameworkOpName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MappingRule();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MappingRule(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.nd4j.shade.protobuf.UnknownFieldSet.Builder unknownFields =
          org.nd4j.shade.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              ruleName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              functionName_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                inputStringAttrName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              inputStringAttrName_.add(s);
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                outputStringAttrName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              outputStringAttrName_.add(s);
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                inputIntName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              inputIntName_.add(s);
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                outputIntName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              outputIntName_.add(s);
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                inputFloatName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000010;
              }
              inputFloatName_.add(s);
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000020) != 0)) {
                outputFloatName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000020;
              }
              outputFloatName_.add(s);
              break;
            }
            case 74: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000040) != 0)) {
                inputDoubleName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000040;
              }
              inputDoubleName_.add(s);
              break;
            }
            case 82: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000080) != 0)) {
                outputDoubleName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000080;
              }
              outputDoubleName_.add(s);
              break;
            }
            case 90: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000100) != 0)) {
                inputBooleanName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000100;
              }
              inputBooleanName_.add(s);
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000200) != 0)) {
                outputBooleanName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000200;
              }
              outputBooleanName_.add(s);
              break;
            }
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000400) != 0)) {
                inputTensorName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000400;
              }
              inputTensorName_.add(s);
              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000800) != 0)) {
                outputTensorName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000800;
              }
              outputTensorName_.add(s);
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00001000) != 0)) {
                inputDataTypeName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00001000;
              }
              inputDataTypeName_.add(s);
              break;
            }
            case 130: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00002000) != 0)) {
                outputDataTypeName_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00002000;
              }
              outputDataTypeName_.add(s);
              break;
            }
            case 138: {
              if (!((mutable_bitField0_ & 0x00004000) != 0)) {
                inputToOutput_ = org.nd4j.shade.protobuf.MapField.newMapField(
                    InputToOutputDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00004000;
              }
              org.nd4j.shade.protobuf.MapEntry<java.lang.String, java.lang.String>
              inputToOutput__ = input.readMessage(
                  InputToOutputDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              inputToOutput_.getMutableMap().put(
                  inputToOutput__.getKey(), inputToOutput__.getValue());
              break;
            }
            case 146: {
              java.lang.String s = input.readStringRequireUtf8();

              ruleType_ = s;
              break;
            }
            case 154: {
              if (!((mutable_bitField0_ & 0x00008000) != 0)) {
                transformerArgs_ = new java.util.ArrayList<org.nd4j.ir.MapperNamespace.TransformerArgs>();
                mutable_bitField0_ |= 0x00008000;
              }
              transformerArgs_.add(
                  input.readMessage(org.nd4j.ir.MapperNamespace.TransformerArgs.parser(), extensionRegistry));
              break;
            }
            case 162: {
              java.lang.String s = input.readStringRequireUtf8();

              inputFrameworkOpName_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.nd4j.shade.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          inputStringAttrName_ = inputStringAttrName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          outputStringAttrName_ = outputStringAttrName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          inputIntName_ = inputIntName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          outputIntName_ = outputIntName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000010) != 0)) {
          inputFloatName_ = inputFloatName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000020) != 0)) {
          outputFloatName_ = outputFloatName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000040) != 0)) {
          inputDoubleName_ = inputDoubleName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000080) != 0)) {
          outputDoubleName_ = outputDoubleName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000100) != 0)) {
          inputBooleanName_ = inputBooleanName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000200) != 0)) {
          outputBooleanName_ = outputBooleanName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000400) != 0)) {
          inputTensorName_ = inputTensorName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000800) != 0)) {
          outputTensorName_ = outputTensorName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00001000) != 0)) {
          inputDataTypeName_ = inputDataTypeName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00002000) != 0)) {
          outputDataTypeName_ = outputDataTypeName_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00008000) != 0)) {
          transformerArgs_ = java.util.Collections.unmodifiableList(transformerArgs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingRule_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected org.nd4j.shade.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 17:
          return internalGetInputToOutput();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.MapperNamespace.MappingRule.class, org.nd4j.ir.MapperNamespace.MappingRule.Builder.class);
    }

    public static final int RULENAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object ruleName_;
    /**
     * <code>string ruleName = 1;</code>
     */
    public java.lang.String getRuleName() {
      java.lang.Object ref = ruleName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleName_ = s;
        return s;
      }
    }
    /**
     * <code>string ruleName = 1;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getRuleNameBytes() {
      java.lang.Object ref = ruleName_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleName_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int FUNCTIONNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object functionName_;
    /**
     * <code>string functionName = 2;</code>
     */
    public java.lang.String getFunctionName() {
      java.lang.Object ref = functionName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        functionName_ = s;
        return s;
      }
    }
    /**
     * <code>string functionName = 2;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getFunctionNameBytes() {
      java.lang.Object ref = functionName_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        functionName_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int INPUTSTRINGATTRNAME_FIELD_NUMBER = 3;
    private org.nd4j.shade.protobuf.LazyStringList inputStringAttrName_;
    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getInputStringAttrNameList() {
      return inputStringAttrName_;
    }
    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    public int getInputStringAttrNameCount() {
      return inputStringAttrName_.size();
    }
    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    public java.lang.String getInputStringAttrName(int index) {
      return inputStringAttrName_.get(index);
    }
    /**
     * <code>repeated string inputStringAttrName = 3;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputStringAttrNameBytes(int index) {
      return inputStringAttrName_.getByteString(index);
    }

    public static final int OUTPUTSTRINGATTRNAME_FIELD_NUMBER = 4;
    private org.nd4j.shade.protobuf.LazyStringList outputStringAttrName_;
    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getOutputStringAttrNameList() {
      return outputStringAttrName_;
    }
    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    public int getOutputStringAttrNameCount() {
      return outputStringAttrName_.size();
    }
    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    public java.lang.String getOutputStringAttrName(int index) {
      return outputStringAttrName_.get(index);
    }
    /**
     * <code>repeated string outputStringAttrName = 4;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOutputStringAttrNameBytes(int index) {
      return outputStringAttrName_.getByteString(index);
    }

    public static final int INPUTINTNAME_FIELD_NUMBER = 5;
    private org.nd4j.shade.protobuf.LazyStringList inputIntName_;
    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getInputIntNameList() {
      return inputIntName_;
    }
    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    public int getInputIntNameCount() {
      return inputIntName_.size();
    }
    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    public java.lang.String getInputIntName(int index) {
      return inputIntName_.get(index);
    }
    /**
     * <code>repeated string inputIntName = 5;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputIntNameBytes(int index) {
      return inputIntName_.getByteString(index);
    }

    public static final int OUTPUTINTNAME_FIELD_NUMBER = 6;
    private org.nd4j.shade.protobuf.LazyStringList outputIntName_;
    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getOutputIntNameList() {
      return outputIntName_;
    }
    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    public int getOutputIntNameCount() {
      return outputIntName_.size();
    }
    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    public java.lang.String getOutputIntName(int index) {
      return outputIntName_.get(index);
    }
    /**
     * <code>repeated string outputIntName = 6;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOutputIntNameBytes(int index) {
      return outputIntName_.getByteString(index);
    }

    public static final int INPUTFLOATNAME_FIELD_NUMBER = 7;
    private org.nd4j.shade.protobuf.LazyStringList inputFloatName_;
    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getInputFloatNameList() {
      return inputFloatName_;
    }
    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    public int getInputFloatNameCount() {
      return inputFloatName_.size();
    }
    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    public java.lang.String getInputFloatName(int index) {
      return inputFloatName_.get(index);
    }
    /**
     * <code>repeated string inputFloatName = 7;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputFloatNameBytes(int index) {
      return inputFloatName_.getByteString(index);
    }

    public static final int OUTPUTFLOATNAME_FIELD_NUMBER = 8;
    private org.nd4j.shade.protobuf.LazyStringList outputFloatName_;
    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getOutputFloatNameList() {
      return outputFloatName_;
    }
    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    public int getOutputFloatNameCount() {
      return outputFloatName_.size();
    }
    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    public java.lang.String getOutputFloatName(int index) {
      return outputFloatName_.get(index);
    }
    /**
     * <code>repeated string outputFloatName = 8;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOutputFloatNameBytes(int index) {
      return outputFloatName_.getByteString(index);
    }

    public static final int INPUTDOUBLENAME_FIELD_NUMBER = 9;
    private org.nd4j.shade.protobuf.LazyStringList inputDoubleName_;
    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getInputDoubleNameList() {
      return inputDoubleName_;
    }
    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    public int getInputDoubleNameCount() {
      return inputDoubleName_.size();
    }
    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    public java.lang.String getInputDoubleName(int index) {
      return inputDoubleName_.get(index);
    }
    /**
     * <code>repeated string inputDoubleName = 9;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputDoubleNameBytes(int index) {
      return inputDoubleName_.getByteString(index);
    }

    public static final int OUTPUTDOUBLENAME_FIELD_NUMBER = 10;
    private org.nd4j.shade.protobuf.LazyStringList outputDoubleName_;
    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getOutputDoubleNameList() {
      return outputDoubleName_;
    }
    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    public int getOutputDoubleNameCount() {
      return outputDoubleName_.size();
    }
    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    public java.lang.String getOutputDoubleName(int index) {
      return outputDoubleName_.get(index);
    }
    /**
     * <code>repeated string outputDoubleName = 10;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOutputDoubleNameBytes(int index) {
      return outputDoubleName_.getByteString(index);
    }

    public static final int INPUTBOOLEANNAME_FIELD_NUMBER = 11;
    private org.nd4j.shade.protobuf.LazyStringList inputBooleanName_;
    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getInputBooleanNameList() {
      return inputBooleanName_;
    }
    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    public int getInputBooleanNameCount() {
      return inputBooleanName_.size();
    }
    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    public java.lang.String getInputBooleanName(int index) {
      return inputBooleanName_.get(index);
    }
    /**
     * <code>repeated string inputBooleanName = 11;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputBooleanNameBytes(int index) {
      return inputBooleanName_.getByteString(index);
    }

    public static final int OUTPUTBOOLEANNAME_FIELD_NUMBER = 12;
    private org.nd4j.shade.protobuf.LazyStringList outputBooleanName_;
    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getOutputBooleanNameList() {
      return outputBooleanName_;
    }
    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    public int getOutputBooleanNameCount() {
      return outputBooleanName_.size();
    }
    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    public java.lang.String getOutputBooleanName(int index) {
      return outputBooleanName_.get(index);
    }
    /**
     * <code>repeated string outputBooleanName = 12;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOutputBooleanNameBytes(int index) {
      return outputBooleanName_.getByteString(index);
    }

    public static final int INPUTTENSORNAME_FIELD_NUMBER = 13;
    private org.nd4j.shade.protobuf.LazyStringList inputTensorName_;
    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getInputTensorNameList() {
      return inputTensorName_;
    }
    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    public int getInputTensorNameCount() {
      return inputTensorName_.size();
    }
    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    public java.lang.String getInputTensorName(int index) {
      return inputTensorName_.get(index);
    }
    /**
     * <code>repeated string inputTensorName = 13;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputTensorNameBytes(int index) {
      return inputTensorName_.getByteString(index);
    }

    public static final int OUTPUTTENSORNAME_FIELD_NUMBER = 14;
    private org.nd4j.shade.protobuf.LazyStringList outputTensorName_;
    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getOutputTensorNameList() {
      return outputTensorName_;
    }
    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    public int getOutputTensorNameCount() {
      return outputTensorName_.size();
    }
    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    public java.lang.String getOutputTensorName(int index) {
      return outputTensorName_.get(index);
    }
    /**
     * <code>repeated string outputTensorName = 14;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOutputTensorNameBytes(int index) {
      return outputTensorName_.getByteString(index);
    }

    public static final int INPUTDATATYPENAME_FIELD_NUMBER = 15;
    private org.nd4j.shade.protobuf.LazyStringList inputDataTypeName_;
    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getInputDataTypeNameList() {
      return inputDataTypeName_;
    }
    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    public int getInputDataTypeNameCount() {
      return inputDataTypeName_.size();
    }
    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    public java.lang.String getInputDataTypeName(int index) {
      return inputDataTypeName_.get(index);
    }
    /**
     * <code>repeated string inputDataTypeName = 15;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputDataTypeNameBytes(int index) {
      return inputDataTypeName_.getByteString(index);
    }

    public static final int OUTPUTDATATYPENAME_FIELD_NUMBER = 16;
    private org.nd4j.shade.protobuf.LazyStringList outputDataTypeName_;
    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getOutputDataTypeNameList() {
      return outputDataTypeName_;
    }
    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    public int getOutputDataTypeNameCount() {
      return outputDataTypeName_.size();
    }
    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    public java.lang.String getOutputDataTypeName(int index) {
      return outputDataTypeName_.get(index);
    }
    /**
     * <code>repeated string outputDataTypeName = 16;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOutputDataTypeNameBytes(int index) {
      return outputDataTypeName_.getByteString(index);
    }

    public static final int INPUTTOOUTPUT_FIELD_NUMBER = 17;
    private static final class InputToOutputDefaultEntryHolder {
      static final org.nd4j.shade.protobuf.MapEntry<
          java.lang.String, java.lang.String> defaultEntry =
              org.nd4j.shade.protobuf.MapEntry
              .<java.lang.String, java.lang.String>newDefaultInstance(
                  org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingRule_InputToOutputEntry_descriptor, 
                  org.nd4j.shade.protobuf.WireFormat.FieldType.STRING,
                  "",
                  org.nd4j.shade.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private org.nd4j.shade.protobuf.MapField<
        java.lang.String, java.lang.String> inputToOutput_;
    private org.nd4j.shade.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetInputToOutput() {
      if (inputToOutput_ == null) {
        return org.nd4j.shade.protobuf.MapField.emptyMapField(
            InputToOutputDefaultEntryHolder.defaultEntry);
      }
      return inputToOutput_;
    }

    public int getInputToOutputCount() {
      return internalGetInputToOutput().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */

    public boolean containsInputToOutput(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetInputToOutput().getMap().containsKey(key);
    }
    /**
     * Use {@link #getInputToOutputMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getInputToOutput() {
      return getInputToOutputMap();
    }
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getInputToOutputMap() {
      return internalGetInputToOutput().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */

    public java.lang.String getInputToOutputOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetInputToOutput().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
     */

    public java.lang.String getInputToOutputOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetInputToOutput().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int RULETYPE_FIELD_NUMBER = 18;
    private volatile java.lang.Object ruleType_;
    /**
     * <code>string ruleType = 18;</code>
     */
    public java.lang.String getRuleType() {
      java.lang.Object ref = ruleType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleType_ = s;
        return s;
      }
    }
    /**
     * <code>string ruleType = 18;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getRuleTypeBytes() {
      java.lang.Object ref = ruleType_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleType_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int TRANSFORMERARGS_FIELD_NUMBER = 19;
    private java.util.List<org.nd4j.ir.MapperNamespace.TransformerArgs> transformerArgs_;
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    public java.util.List<org.nd4j.ir.MapperNamespace.TransformerArgs> getTransformerArgsList() {
      return transformerArgs_;
    }
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    public java.util.List<? extends org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder> 
        getTransformerArgsOrBuilderList() {
      return transformerArgs_;
    }
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    public int getTransformerArgsCount() {
      return transformerArgs_.size();
    }
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    public org.nd4j.ir.MapperNamespace.TransformerArgs getTransformerArgs(int index) {
      return transformerArgs_.get(index);
    }
    /**
     * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
     */
    public org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder getTransformerArgsOrBuilder(
        int index) {
      return transformerArgs_.get(index);
    }

    public static final int INPUTFRAMEWORKOPNAME_FIELD_NUMBER = 20;
    private volatile java.lang.Object inputFrameworkOpName_;
    /**
     * <code>string inputFrameworkOpName = 20;</code>
     */
    public java.lang.String getInputFrameworkOpName() {
      java.lang.Object ref = inputFrameworkOpName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputFrameworkOpName_ = s;
        return s;
      }
    }
    /**
     * <code>string inputFrameworkOpName = 20;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputFrameworkOpNameBytes() {
      java.lang.Object ref = inputFrameworkOpName_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputFrameworkOpName_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.nd4j.shade.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRuleNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 1, ruleName_);
      }
      if (!getFunctionNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 2, functionName_);
      }
      for (int i = 0; i < inputStringAttrName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 3, inputStringAttrName_.getRaw(i));
      }
      for (int i = 0; i < outputStringAttrName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 4, outputStringAttrName_.getRaw(i));
      }
      for (int i = 0; i < inputIntName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 5, inputIntName_.getRaw(i));
      }
      for (int i = 0; i < outputIntName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 6, outputIntName_.getRaw(i));
      }
      for (int i = 0; i < inputFloatName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 7, inputFloatName_.getRaw(i));
      }
      for (int i = 0; i < outputFloatName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 8, outputFloatName_.getRaw(i));
      }
      for (int i = 0; i < inputDoubleName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 9, inputDoubleName_.getRaw(i));
      }
      for (int i = 0; i < outputDoubleName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 10, outputDoubleName_.getRaw(i));
      }
      for (int i = 0; i < inputBooleanName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 11, inputBooleanName_.getRaw(i));
      }
      for (int i = 0; i < outputBooleanName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 12, outputBooleanName_.getRaw(i));
      }
      for (int i = 0; i < inputTensorName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 13, inputTensorName_.getRaw(i));
      }
      for (int i = 0; i < outputTensorName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 14, outputTensorName_.getRaw(i));
      }
      for (int i = 0; i < inputDataTypeName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 15, inputDataTypeName_.getRaw(i));
      }
      for (int i = 0; i < outputDataTypeName_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 16, outputDataTypeName_.getRaw(i));
      }
      org.nd4j.shade.protobuf.GeneratedMessageV3
        .serializeStringMapTo(
          output,
          internalGetInputToOutput(),
          InputToOutputDefaultEntryHolder.defaultEntry,
          17);
      if (!getRuleTypeBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 18, ruleType_);
      }
      for (int i = 0; i < transformerArgs_.size(); i++) {
        output.writeMessage(19, transformerArgs_.get(i));
      }
      if (!getInputFrameworkOpNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 20, inputFrameworkOpName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRuleNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(1, ruleName_);
      }
      if (!getFunctionNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(2, functionName_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputStringAttrName_.size(); i++) {
          dataSize += computeStringSizeNoTag(inputStringAttrName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInputStringAttrNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < outputStringAttrName_.size(); i++) {
          dataSize += computeStringSizeNoTag(outputStringAttrName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOutputStringAttrNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputIntName_.size(); i++) {
          dataSize += computeStringSizeNoTag(inputIntName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInputIntNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < outputIntName_.size(); i++) {
          dataSize += computeStringSizeNoTag(outputIntName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOutputIntNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputFloatName_.size(); i++) {
          dataSize += computeStringSizeNoTag(inputFloatName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInputFloatNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < outputFloatName_.size(); i++) {
          dataSize += computeStringSizeNoTag(outputFloatName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOutputFloatNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputDoubleName_.size(); i++) {
          dataSize += computeStringSizeNoTag(inputDoubleName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInputDoubleNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < outputDoubleName_.size(); i++) {
          dataSize += computeStringSizeNoTag(outputDoubleName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOutputDoubleNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputBooleanName_.size(); i++) {
          dataSize += computeStringSizeNoTag(inputBooleanName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInputBooleanNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < outputBooleanName_.size(); i++) {
          dataSize += computeStringSizeNoTag(outputBooleanName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOutputBooleanNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputTensorName_.size(); i++) {
          dataSize += computeStringSizeNoTag(inputTensorName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInputTensorNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < outputTensorName_.size(); i++) {
          dataSize += computeStringSizeNoTag(outputTensorName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOutputTensorNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputDataTypeName_.size(); i++) {
          dataSize += computeStringSizeNoTag(inputDataTypeName_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInputDataTypeNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < outputDataTypeName_.size(); i++) {
          dataSize += computeStringSizeNoTag(outputDataTypeName_.getRaw(i));
        }
        size += dataSize;
        size += 2 * getOutputDataTypeNameList().size();
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
           : internalGetInputToOutput().getMap().entrySet()) {
        org.nd4j.shade.protobuf.MapEntry<java.lang.String, java.lang.String>
        inputToOutput__ = InputToOutputDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += org.nd4j.shade.protobuf.CodedOutputStream
            .computeMessageSize(17, inputToOutput__);
      }
      if (!getRuleTypeBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(18, ruleType_);
      }
      for (int i = 0; i < transformerArgs_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(19, transformerArgs_.get(i));
      }
      if (!getInputFrameworkOpNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(20, inputFrameworkOpName_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.nd4j.ir.MapperNamespace.MappingRule)) {
        return super.equals(obj);
      }
      org.nd4j.ir.MapperNamespace.MappingRule other = (org.nd4j.ir.MapperNamespace.MappingRule) obj;

      if (!getRuleName()
          .equals(other.getRuleName())) return false;
      if (!getFunctionName()
          .equals(other.getFunctionName())) return false;
      if (!getInputStringAttrNameList()
          .equals(other.getInputStringAttrNameList())) return false;
      if (!getOutputStringAttrNameList()
          .equals(other.getOutputStringAttrNameList())) return false;
      if (!getInputIntNameList()
          .equals(other.getInputIntNameList())) return false;
      if (!getOutputIntNameList()
          .equals(other.getOutputIntNameList())) return false;
      if (!getInputFloatNameList()
          .equals(other.getInputFloatNameList())) return false;
      if (!getOutputFloatNameList()
          .equals(other.getOutputFloatNameList())) return false;
      if (!getInputDoubleNameList()
          .equals(other.getInputDoubleNameList())) return false;
      if (!getOutputDoubleNameList()
          .equals(other.getOutputDoubleNameList())) return false;
      if (!getInputBooleanNameList()
          .equals(other.getInputBooleanNameList())) return false;
      if (!getOutputBooleanNameList()
          .equals(other.getOutputBooleanNameList())) return false;
      if (!getInputTensorNameList()
          .equals(other.getInputTensorNameList())) return false;
      if (!getOutputTensorNameList()
          .equals(other.getOutputTensorNameList())) return false;
      if (!getInputDataTypeNameList()
          .equals(other.getInputDataTypeNameList())) return false;
      if (!getOutputDataTypeNameList()
          .equals(other.getOutputDataTypeNameList())) return false;
      if (!internalGetInputToOutput().equals(
          other.internalGetInputToOutput())) return false;
      if (!getRuleType()
          .equals(other.getRuleType())) return false;
      if (!getTransformerArgsList()
          .equals(other.getTransformerArgsList())) return false;
      if (!getInputFrameworkOpName()
          .equals(other.getInputFrameworkOpName())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RULENAME_FIELD_NUMBER;
      hash = (53 * hash) + getRuleName().hashCode();
      hash = (37 * hash) + FUNCTIONNAME_FIELD_NUMBER;
      hash = (53 * hash) + getFunctionName().hashCode();
      if (getInputStringAttrNameCount() > 0) {
        hash = (37 * hash) + INPUTSTRINGATTRNAME_FIELD_NUMBER;
        hash = (53 * hash) + getInputStringAttrNameList().hashCode();
      }
      if (getOutputStringAttrNameCount() > 0) {
        hash = (37 * hash) + OUTPUTSTRINGATTRNAME_FIELD_NUMBER;
        hash = (53 * hash) + getOutputStringAttrNameList().hashCode();
      }
      if (getInputIntNameCount() > 0) {
        hash = (37 * hash) + INPUTINTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getInputIntNameList().hashCode();
      }
      if (getOutputIntNameCount() > 0) {
        hash = (37 * hash) + OUTPUTINTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getOutputIntNameList().hashCode();
      }
      if (getInputFloatNameCount() > 0) {
        hash = (37 * hash) + INPUTFLOATNAME_FIELD_NUMBER;
        hash = (53 * hash) + getInputFloatNameList().hashCode();
      }
      if (getOutputFloatNameCount() > 0) {
        hash = (37 * hash) + OUTPUTFLOATNAME_FIELD_NUMBER;
        hash = (53 * hash) + getOutputFloatNameList().hashCode();
      }
      if (getInputDoubleNameCount() > 0) {
        hash = (37 * hash) + INPUTDOUBLENAME_FIELD_NUMBER;
        hash = (53 * hash) + getInputDoubleNameList().hashCode();
      }
      if (getOutputDoubleNameCount() > 0) {
        hash = (37 * hash) + OUTPUTDOUBLENAME_FIELD_NUMBER;
        hash = (53 * hash) + getOutputDoubleNameList().hashCode();
      }
      if (getInputBooleanNameCount() > 0) {
        hash = (37 * hash) + INPUTBOOLEANNAME_FIELD_NUMBER;
        hash = (53 * hash) + getInputBooleanNameList().hashCode();
      }
      if (getOutputBooleanNameCount() > 0) {
        hash = (37 * hash) + OUTPUTBOOLEANNAME_FIELD_NUMBER;
        hash = (53 * hash) + getOutputBooleanNameList().hashCode();
      }
      if (getInputTensorNameCount() > 0) {
        hash = (37 * hash) + INPUTTENSORNAME_FIELD_NUMBER;
        hash = (53 * hash) + getInputTensorNameList().hashCode();
      }
      if (getOutputTensorNameCount() > 0) {
        hash = (37 * hash) + OUTPUTTENSORNAME_FIELD_NUMBER;
        hash = (53 * hash) + getOutputTensorNameList().hashCode();
      }
      if (getInputDataTypeNameCount() > 0) {
        hash = (37 * hash) + INPUTDATATYPENAME_FIELD_NUMBER;
        hash = (53 * hash) + getInputDataTypeNameList().hashCode();
      }
      if (getOutputDataTypeNameCount() > 0) {
        hash = (37 * hash) + OUTPUTDATATYPENAME_FIELD_NUMBER;
        hash = (53 * hash) + getOutputDataTypeNameList().hashCode();
      }
      if (!internalGetInputToOutput().getMap().isEmpty()) {
        hash = (37 * hash) + INPUTTOOUTPUT_FIELD_NUMBER;
        hash = (53 * hash) + internalGetInputToOutput().hashCode();
      }
      hash = (37 * hash) + RULETYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRuleType().hashCode();
      if (getTransformerArgsCount() > 0) {
        hash = (37 * hash) + TRANSFORMERARGS_FIELD_NUMBER;
        hash = (53 * hash) + getTransformerArgsList().hashCode();
      }
      hash = (37 * hash) + INPUTFRAMEWORKOPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getInputFrameworkOpName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MappingRule parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.nd4j.ir.MapperNamespace.MappingRule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.nd4j.ir.MappingRule}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.MappingRule)
        org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingRule_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected org.nd4j.shade.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 17:
            return internalGetInputToOutput();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected org.nd4j.shade.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 17:
            return internalGetMutableInputToOutput();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingRule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.MapperNamespace.MappingRule.class, org.nd4j.ir.MapperNamespace.MappingRule.Builder.class);
      }

      // Construct using org.nd4j.ir.MapperNamespace.MappingRule.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.nd4j.shade.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getTransformerArgsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ruleName_ = "";

        functionName_ = "";

        inputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        outputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        inputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        outputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        inputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        outputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        inputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        outputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000080);
        inputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        outputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000200);
        inputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000400);
        outputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000800);
        inputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00001000);
        outputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00002000);
        internalGetMutableInputToOutput().clear();
        ruleType_ = "";

        if (transformerArgsBuilder_ == null) {
          transformerArgs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00008000);
        } else {
          transformerArgsBuilder_.clear();
        }
        inputFrameworkOpName_ = "";

        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingRule_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MappingRule getDefaultInstanceForType() {
        return org.nd4j.ir.MapperNamespace.MappingRule.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MappingRule build() {
        org.nd4j.ir.MapperNamespace.MappingRule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MappingRule buildPartial() {
        org.nd4j.ir.MapperNamespace.MappingRule result = new org.nd4j.ir.MapperNamespace.MappingRule(this);
        int from_bitField0_ = bitField0_;
        result.ruleName_ = ruleName_;
        result.functionName_ = functionName_;
        if (((bitField0_ & 0x00000001) != 0)) {
          inputStringAttrName_ = inputStringAttrName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inputStringAttrName_ = inputStringAttrName_;
        if (((bitField0_ & 0x00000002) != 0)) {
          outputStringAttrName_ = outputStringAttrName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.outputStringAttrName_ = outputStringAttrName_;
        if (((bitField0_ & 0x00000004) != 0)) {
          inputIntName_ = inputIntName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.inputIntName_ = inputIntName_;
        if (((bitField0_ & 0x00000008) != 0)) {
          outputIntName_ = outputIntName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.outputIntName_ = outputIntName_;
        if (((bitField0_ & 0x00000010) != 0)) {
          inputFloatName_ = inputFloatName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.inputFloatName_ = inputFloatName_;
        if (((bitField0_ & 0x00000020) != 0)) {
          outputFloatName_ = outputFloatName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.outputFloatName_ = outputFloatName_;
        if (((bitField0_ & 0x00000040) != 0)) {
          inputDoubleName_ = inputDoubleName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.inputDoubleName_ = inputDoubleName_;
        if (((bitField0_ & 0x00000080) != 0)) {
          outputDoubleName_ = outputDoubleName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000080);
        }
        result.outputDoubleName_ = outputDoubleName_;
        if (((bitField0_ & 0x00000100) != 0)) {
          inputBooleanName_ = inputBooleanName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000100);
        }
        result.inputBooleanName_ = inputBooleanName_;
        if (((bitField0_ & 0x00000200) != 0)) {
          outputBooleanName_ = outputBooleanName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000200);
        }
        result.outputBooleanName_ = outputBooleanName_;
        if (((bitField0_ & 0x00000400) != 0)) {
          inputTensorName_ = inputTensorName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000400);
        }
        result.inputTensorName_ = inputTensorName_;
        if (((bitField0_ & 0x00000800) != 0)) {
          outputTensorName_ = outputTensorName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000800);
        }
        result.outputTensorName_ = outputTensorName_;
        if (((bitField0_ & 0x00001000) != 0)) {
          inputDataTypeName_ = inputDataTypeName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00001000);
        }
        result.inputDataTypeName_ = inputDataTypeName_;
        if (((bitField0_ & 0x00002000) != 0)) {
          outputDataTypeName_ = outputDataTypeName_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00002000);
        }
        result.outputDataTypeName_ = outputDataTypeName_;
        result.inputToOutput_ = internalGetInputToOutput();
        result.inputToOutput_.makeImmutable();
        result.ruleType_ = ruleType_;
        if (transformerArgsBuilder_ == null) {
          if (((bitField0_ & 0x00008000) != 0)) {
            transformerArgs_ = java.util.Collections.unmodifiableList(transformerArgs_);
            bitField0_ = (bitField0_ & ~0x00008000);
          }
          result.transformerArgs_ = transformerArgs_;
        } else {
          result.transformerArgs_ = transformerArgsBuilder_.build();
        }
        result.inputFrameworkOpName_ = inputFrameworkOpName_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.nd4j.shade.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.nd4j.shade.protobuf.Message other) {
        if (other instanceof org.nd4j.ir.MapperNamespace.MappingRule) {
          return mergeFrom((org.nd4j.ir.MapperNamespace.MappingRule)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.MapperNamespace.MappingRule other) {
        if (other == org.nd4j.ir.MapperNamespace.MappingRule.getDefaultInstance()) return this;
        if (!other.getRuleName().isEmpty()) {
          ruleName_ = other.ruleName_;
          onChanged();
        }
        if (!other.getFunctionName().isEmpty()) {
          functionName_ = other.functionName_;
          onChanged();
        }
        if (!other.inputStringAttrName_.isEmpty()) {
          if (inputStringAttrName_.isEmpty()) {
            inputStringAttrName_ = other.inputStringAttrName_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInputStringAttrNameIsMutable();
            inputStringAttrName_.addAll(other.inputStringAttrName_);
          }
          onChanged();
        }
        if (!other.outputStringAttrName_.isEmpty()) {
          if (outputStringAttrName_.isEmpty()) {
            outputStringAttrName_ = other.outputStringAttrName_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOutputStringAttrNameIsMutable();
            outputStringAttrName_.addAll(other.outputStringAttrName_);
          }
          onChanged();
        }
        if (!other.inputIntName_.isEmpty()) {
          if (inputIntName_.isEmpty()) {
            inputIntName_ = other.inputIntName_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureInputIntNameIsMutable();
            inputIntName_.addAll(other.inputIntName_);
          }
          onChanged();
        }
        if (!other.outputIntName_.isEmpty()) {
          if (outputIntName_.isEmpty()) {
            outputIntName_ = other.outputIntName_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureOutputIntNameIsMutable();
            outputIntName_.addAll(other.outputIntName_);
          }
          onChanged();
        }
        if (!other.inputFloatName_.isEmpty()) {
          if (inputFloatName_.isEmpty()) {
            inputFloatName_ = other.inputFloatName_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureInputFloatNameIsMutable();
            inputFloatName_.addAll(other.inputFloatName_);
          }
          onChanged();
        }
        if (!other.outputFloatName_.isEmpty()) {
          if (outputFloatName_.isEmpty()) {
            outputFloatName_ = other.outputFloatName_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureOutputFloatNameIsMutable();
            outputFloatName_.addAll(other.outputFloatName_);
          }
          onChanged();
        }
        if (!other.inputDoubleName_.isEmpty()) {
          if (inputDoubleName_.isEmpty()) {
            inputDoubleName_ = other.inputDoubleName_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureInputDoubleNameIsMutable();
            inputDoubleName_.addAll(other.inputDoubleName_);
          }
          onChanged();
        }
        if (!other.outputDoubleName_.isEmpty()) {
          if (outputDoubleName_.isEmpty()) {
            outputDoubleName_ = other.outputDoubleName_;
            bitField0_ = (bitField0_ & ~0x00000080);
          } else {
            ensureOutputDoubleNameIsMutable();
            outputDoubleName_.addAll(other.outputDoubleName_);
          }
          onChanged();
        }
        if (!other.inputBooleanName_.isEmpty()) {
          if (inputBooleanName_.isEmpty()) {
            inputBooleanName_ = other.inputBooleanName_;
            bitField0_ = (bitField0_ & ~0x00000100);
          } else {
            ensureInputBooleanNameIsMutable();
            inputBooleanName_.addAll(other.inputBooleanName_);
          }
          onChanged();
        }
        if (!other.outputBooleanName_.isEmpty()) {
          if (outputBooleanName_.isEmpty()) {
            outputBooleanName_ = other.outputBooleanName_;
            bitField0_ = (bitField0_ & ~0x00000200);
          } else {
            ensureOutputBooleanNameIsMutable();
            outputBooleanName_.addAll(other.outputBooleanName_);
          }
          onChanged();
        }
        if (!other.inputTensorName_.isEmpty()) {
          if (inputTensorName_.isEmpty()) {
            inputTensorName_ = other.inputTensorName_;
            bitField0_ = (bitField0_ & ~0x00000400);
          } else {
            ensureInputTensorNameIsMutable();
            inputTensorName_.addAll(other.inputTensorName_);
          }
          onChanged();
        }
        if (!other.outputTensorName_.isEmpty()) {
          if (outputTensorName_.isEmpty()) {
            outputTensorName_ = other.outputTensorName_;
            bitField0_ = (bitField0_ & ~0x00000800);
          } else {
            ensureOutputTensorNameIsMutable();
            outputTensorName_.addAll(other.outputTensorName_);
          }
          onChanged();
        }
        if (!other.inputDataTypeName_.isEmpty()) {
          if (inputDataTypeName_.isEmpty()) {
            inputDataTypeName_ = other.inputDataTypeName_;
            bitField0_ = (bitField0_ & ~0x00001000);
          } else {
            ensureInputDataTypeNameIsMutable();
            inputDataTypeName_.addAll(other.inputDataTypeName_);
          }
          onChanged();
        }
        if (!other.outputDataTypeName_.isEmpty()) {
          if (outputDataTypeName_.isEmpty()) {
            outputDataTypeName_ = other.outputDataTypeName_;
            bitField0_ = (bitField0_ & ~0x00002000);
          } else {
            ensureOutputDataTypeNameIsMutable();
            outputDataTypeName_.addAll(other.outputDataTypeName_);
          }
          onChanged();
        }
        internalGetMutableInputToOutput().mergeFrom(
            other.internalGetInputToOutput());
        if (!other.getRuleType().isEmpty()) {
          ruleType_ = other.ruleType_;
          onChanged();
        }
        if (transformerArgsBuilder_ == null) {
          if (!other.transformerArgs_.isEmpty()) {
            if (transformerArgs_.isEmpty()) {
              transformerArgs_ = other.transformerArgs_;
              bitField0_ = (bitField0_ & ~0x00008000);
            } else {
              ensureTransformerArgsIsMutable();
              transformerArgs_.addAll(other.transformerArgs_);
            }
            onChanged();
          }
        } else {
          if (!other.transformerArgs_.isEmpty()) {
            if (transformerArgsBuilder_.isEmpty()) {
              transformerArgsBuilder_.dispose();
              transformerArgsBuilder_ = null;
              transformerArgs_ = other.transformerArgs_;
              bitField0_ = (bitField0_ & ~0x00008000);
              transformerArgsBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTransformerArgsFieldBuilder() : null;
            } else {
              transformerArgsBuilder_.addAllMessages(other.transformerArgs_);
            }
          }
        }
        if (!other.getInputFrameworkOpName().isEmpty()) {
          inputFrameworkOpName_ = other.inputFrameworkOpName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.nd4j.ir.MapperNamespace.MappingRule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.MapperNamespace.MappingRule) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object ruleName_ = "";
      /**
       * <code>string ruleName = 1;</code>
       */
      public java.lang.String getRuleName() {
        java.lang.Object ref = ruleName_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ruleName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string ruleName = 1;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getRuleNameBytes() {
        java.lang.Object ref = ruleName_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ruleName_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string ruleName = 1;</code>
       */
      public Builder setRuleName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ruleName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string ruleName = 1;</code>
       */
      public Builder clearRuleName() {
        
        ruleName_ = getDefaultInstance().getRuleName();
        onChanged();
        return this;
      }
      /**
       * <code>string ruleName = 1;</code>
       */
      public Builder setRuleNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ruleName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object functionName_ = "";
      /**
       * <code>string functionName = 2;</code>
       */
      public java.lang.String getFunctionName() {
        java.lang.Object ref = functionName_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          functionName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string functionName = 2;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getFunctionNameBytes() {
        java.lang.Object ref = functionName_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          functionName_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string functionName = 2;</code>
       */
      public Builder setFunctionName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        functionName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string functionName = 2;</code>
       */
      public Builder clearFunctionName() {
        
        functionName_ = getDefaultInstance().getFunctionName();
        onChanged();
        return this;
      }
      /**
       * <code>string functionName = 2;</code>
       */
      public Builder setFunctionNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        functionName_ = value;
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList inputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureInputStringAttrNameIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          inputStringAttrName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(inputStringAttrName_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getInputStringAttrNameList() {
        return inputStringAttrName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public int getInputStringAttrNameCount() {
        return inputStringAttrName_.size();
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public java.lang.String getInputStringAttrName(int index) {
        return inputStringAttrName_.get(index);
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputStringAttrNameBytes(int index) {
        return inputStringAttrName_.getByteString(index);
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public Builder setInputStringAttrName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputStringAttrNameIsMutable();
        inputStringAttrName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public Builder addInputStringAttrName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputStringAttrNameIsMutable();
        inputStringAttrName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public Builder addAllInputStringAttrName(
          java.lang.Iterable<java.lang.String> values) {
        ensureInputStringAttrNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputStringAttrName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public Builder clearInputStringAttrName() {
        inputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputStringAttrName = 3;</code>
       */
      public Builder addInputStringAttrNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureInputStringAttrNameIsMutable();
        inputStringAttrName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList outputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOutputStringAttrNameIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          outputStringAttrName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(outputStringAttrName_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getOutputStringAttrNameList() {
        return outputStringAttrName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public int getOutputStringAttrNameCount() {
        return outputStringAttrName_.size();
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public java.lang.String getOutputStringAttrName(int index) {
        return outputStringAttrName_.get(index);
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOutputStringAttrNameBytes(int index) {
        return outputStringAttrName_.getByteString(index);
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public Builder setOutputStringAttrName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputStringAttrNameIsMutable();
        outputStringAttrName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public Builder addOutputStringAttrName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputStringAttrNameIsMutable();
        outputStringAttrName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public Builder addAllOutputStringAttrName(
          java.lang.Iterable<java.lang.String> values) {
        ensureOutputStringAttrNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputStringAttrName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public Builder clearOutputStringAttrName() {
        outputStringAttrName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputStringAttrName = 4;</code>
       */
      public Builder addOutputStringAttrNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOutputStringAttrNameIsMutable();
        outputStringAttrName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList inputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureInputIntNameIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          inputIntName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(inputIntName_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getInputIntNameList() {
        return inputIntName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public int getInputIntNameCount() {
        return inputIntName_.size();
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public java.lang.String getInputIntName(int index) {
        return inputIntName_.get(index);
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputIntNameBytes(int index) {
        return inputIntName_.getByteString(index);
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public Builder setInputIntName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputIntNameIsMutable();
        inputIntName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public Builder addInputIntName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputIntNameIsMutable();
        inputIntName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public Builder addAllInputIntName(
          java.lang.Iterable<java.lang.String> values) {
        ensureInputIntNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputIntName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public Builder clearInputIntName() {
        inputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputIntName = 5;</code>
       */
      public Builder addInputIntNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureInputIntNameIsMutable();
        inputIntName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList outputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOutputIntNameIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          outputIntName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(outputIntName_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getOutputIntNameList() {
        return outputIntName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public int getOutputIntNameCount() {
        return outputIntName_.size();
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public java.lang.String getOutputIntName(int index) {
        return outputIntName_.get(index);
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOutputIntNameBytes(int index) {
        return outputIntName_.getByteString(index);
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public Builder setOutputIntName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputIntNameIsMutable();
        outputIntName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public Builder addOutputIntName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputIntNameIsMutable();
        outputIntName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public Builder addAllOutputIntName(
          java.lang.Iterable<java.lang.String> values) {
        ensureOutputIntNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputIntName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public Builder clearOutputIntName() {
        outputIntName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputIntName = 6;</code>
       */
      public Builder addOutputIntNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOutputIntNameIsMutable();
        outputIntName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList inputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureInputFloatNameIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          inputFloatName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(inputFloatName_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getInputFloatNameList() {
        return inputFloatName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public int getInputFloatNameCount() {
        return inputFloatName_.size();
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public java.lang.String getInputFloatName(int index) {
        return inputFloatName_.get(index);
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputFloatNameBytes(int index) {
        return inputFloatName_.getByteString(index);
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public Builder setInputFloatName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputFloatNameIsMutable();
        inputFloatName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public Builder addInputFloatName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputFloatNameIsMutable();
        inputFloatName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public Builder addAllInputFloatName(
          java.lang.Iterable<java.lang.String> values) {
        ensureInputFloatNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputFloatName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public Builder clearInputFloatName() {
        inputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputFloatName = 7;</code>
       */
      public Builder addInputFloatNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureInputFloatNameIsMutable();
        inputFloatName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList outputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOutputFloatNameIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          outputFloatName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(outputFloatName_);
          bitField0_ |= 0x00000020;
         }
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getOutputFloatNameList() {
        return outputFloatName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public int getOutputFloatNameCount() {
        return outputFloatName_.size();
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public java.lang.String getOutputFloatName(int index) {
        return outputFloatName_.get(index);
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOutputFloatNameBytes(int index) {
        return outputFloatName_.getByteString(index);
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public Builder setOutputFloatName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputFloatNameIsMutable();
        outputFloatName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public Builder addOutputFloatName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputFloatNameIsMutable();
        outputFloatName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public Builder addAllOutputFloatName(
          java.lang.Iterable<java.lang.String> values) {
        ensureOutputFloatNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputFloatName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public Builder clearOutputFloatName() {
        outputFloatName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputFloatName = 8;</code>
       */
      public Builder addOutputFloatNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOutputFloatNameIsMutable();
        outputFloatName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList inputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureInputDoubleNameIsMutable() {
        if (!((bitField0_ & 0x00000040) != 0)) {
          inputDoubleName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(inputDoubleName_);
          bitField0_ |= 0x00000040;
         }
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getInputDoubleNameList() {
        return inputDoubleName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public int getInputDoubleNameCount() {
        return inputDoubleName_.size();
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public java.lang.String getInputDoubleName(int index) {
        return inputDoubleName_.get(index);
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputDoubleNameBytes(int index) {
        return inputDoubleName_.getByteString(index);
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public Builder setInputDoubleName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputDoubleNameIsMutable();
        inputDoubleName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public Builder addInputDoubleName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputDoubleNameIsMutable();
        inputDoubleName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public Builder addAllInputDoubleName(
          java.lang.Iterable<java.lang.String> values) {
        ensureInputDoubleNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputDoubleName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public Builder clearInputDoubleName() {
        inputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDoubleName = 9;</code>
       */
      public Builder addInputDoubleNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureInputDoubleNameIsMutable();
        inputDoubleName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList outputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOutputDoubleNameIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          outputDoubleName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(outputDoubleName_);
          bitField0_ |= 0x00000080;
         }
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getOutputDoubleNameList() {
        return outputDoubleName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public int getOutputDoubleNameCount() {
        return outputDoubleName_.size();
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public java.lang.String getOutputDoubleName(int index) {
        return outputDoubleName_.get(index);
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOutputDoubleNameBytes(int index) {
        return outputDoubleName_.getByteString(index);
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public Builder setOutputDoubleName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputDoubleNameIsMutable();
        outputDoubleName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public Builder addOutputDoubleName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputDoubleNameIsMutable();
        outputDoubleName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public Builder addAllOutputDoubleName(
          java.lang.Iterable<java.lang.String> values) {
        ensureOutputDoubleNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputDoubleName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public Builder clearOutputDoubleName() {
        outputDoubleName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000080);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDoubleName = 10;</code>
       */
      public Builder addOutputDoubleNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOutputDoubleNameIsMutable();
        outputDoubleName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList inputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureInputBooleanNameIsMutable() {
        if (!((bitField0_ & 0x00000100) != 0)) {
          inputBooleanName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(inputBooleanName_);
          bitField0_ |= 0x00000100;
         }
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getInputBooleanNameList() {
        return inputBooleanName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public int getInputBooleanNameCount() {
        return inputBooleanName_.size();
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public java.lang.String getInputBooleanName(int index) {
        return inputBooleanName_.get(index);
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputBooleanNameBytes(int index) {
        return inputBooleanName_.getByteString(index);
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public Builder setInputBooleanName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputBooleanNameIsMutable();
        inputBooleanName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public Builder addInputBooleanName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputBooleanNameIsMutable();
        inputBooleanName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public Builder addAllInputBooleanName(
          java.lang.Iterable<java.lang.String> values) {
        ensureInputBooleanNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputBooleanName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public Builder clearInputBooleanName() {
        inputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputBooleanName = 11;</code>
       */
      public Builder addInputBooleanNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureInputBooleanNameIsMutable();
        inputBooleanName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList outputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOutputBooleanNameIsMutable() {
        if (!((bitField0_ & 0x00000200) != 0)) {
          outputBooleanName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(outputBooleanName_);
          bitField0_ |= 0x00000200;
         }
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getOutputBooleanNameList() {
        return outputBooleanName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public int getOutputBooleanNameCount() {
        return outputBooleanName_.size();
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public java.lang.String getOutputBooleanName(int index) {
        return outputBooleanName_.get(index);
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOutputBooleanNameBytes(int index) {
        return outputBooleanName_.getByteString(index);
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public Builder setOutputBooleanName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputBooleanNameIsMutable();
        outputBooleanName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public Builder addOutputBooleanName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputBooleanNameIsMutable();
        outputBooleanName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public Builder addAllOutputBooleanName(
          java.lang.Iterable<java.lang.String> values) {
        ensureOutputBooleanNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputBooleanName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public Builder clearOutputBooleanName() {
        outputBooleanName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000200);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputBooleanName = 12;</code>
       */
      public Builder addOutputBooleanNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOutputBooleanNameIsMutable();
        outputBooleanName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList inputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureInputTensorNameIsMutable() {
        if (!((bitField0_ & 0x00000400) != 0)) {
          inputTensorName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(inputTensorName_);
          bitField0_ |= 0x00000400;
         }
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getInputTensorNameList() {
        return inputTensorName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public int getInputTensorNameCount() {
        return inputTensorName_.size();
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public java.lang.String getInputTensorName(int index) {
        return inputTensorName_.get(index);
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputTensorNameBytes(int index) {
        return inputTensorName_.getByteString(index);
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public Builder setInputTensorName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputTensorNameIsMutable();
        inputTensorName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public Builder addInputTensorName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputTensorNameIsMutable();
        inputTensorName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public Builder addAllInputTensorName(
          java.lang.Iterable<java.lang.String> values) {
        ensureInputTensorNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputTensorName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public Builder clearInputTensorName() {
        inputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000400);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputTensorName = 13;</code>
       */
      public Builder addInputTensorNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureInputTensorNameIsMutable();
        inputTensorName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList outputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOutputTensorNameIsMutable() {
        if (!((bitField0_ & 0x00000800) != 0)) {
          outputTensorName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(outputTensorName_);
          bitField0_ |= 0x00000800;
         }
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getOutputTensorNameList() {
        return outputTensorName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public int getOutputTensorNameCount() {
        return outputTensorName_.size();
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public java.lang.String getOutputTensorName(int index) {
        return outputTensorName_.get(index);
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOutputTensorNameBytes(int index) {
        return outputTensorName_.getByteString(index);
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public Builder setOutputTensorName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputTensorNameIsMutable();
        outputTensorName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public Builder addOutputTensorName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputTensorNameIsMutable();
        outputTensorName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public Builder addAllOutputTensorName(
          java.lang.Iterable<java.lang.String> values) {
        ensureOutputTensorNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputTensorName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public Builder clearOutputTensorName() {
        outputTensorName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000800);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputTensorName = 14;</code>
       */
      public Builder addOutputTensorNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOutputTensorNameIsMutable();
        outputTensorName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList inputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureInputDataTypeNameIsMutable() {
        if (!((bitField0_ & 0x00001000) != 0)) {
          inputDataTypeName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(inputDataTypeName_);
          bitField0_ |= 0x00001000;
         }
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getInputDataTypeNameList() {
        return inputDataTypeName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public int getInputDataTypeNameCount() {
        return inputDataTypeName_.size();
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public java.lang.String getInputDataTypeName(int index) {
        return inputDataTypeName_.get(index);
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputDataTypeNameBytes(int index) {
        return inputDataTypeName_.getByteString(index);
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public Builder setInputDataTypeName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputDataTypeNameIsMutable();
        inputDataTypeName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public Builder addInputDataTypeName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureInputDataTypeNameIsMutable();
        inputDataTypeName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public Builder addAllInputDataTypeName(
          java.lang.Iterable<java.lang.String> values) {
        ensureInputDataTypeNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputDataTypeName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public Builder clearInputDataTypeName() {
        inputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00001000);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string inputDataTypeName = 15;</code>
       */
      public Builder addInputDataTypeNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureInputDataTypeNameIsMutable();
        inputDataTypeName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.LazyStringList outputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOutputDataTypeNameIsMutable() {
        if (!((bitField0_ & 0x00002000) != 0)) {
          outputDataTypeName_ = new org.nd4j.shade.protobuf.LazyStringArrayList(outputDataTypeName_);
          bitField0_ |= 0x00002000;
         }
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getOutputDataTypeNameList() {
        return outputDataTypeName_.getUnmodifiableView();
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public int getOutputDataTypeNameCount() {
        return outputDataTypeName_.size();
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public java.lang.String getOutputDataTypeName(int index) {
        return outputDataTypeName_.get(index);
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOutputDataTypeNameBytes(int index) {
        return outputDataTypeName_.getByteString(index);
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public Builder setOutputDataTypeName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputDataTypeNameIsMutable();
        outputDataTypeName_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public Builder addOutputDataTypeName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOutputDataTypeNameIsMutable();
        outputDataTypeName_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public Builder addAllOutputDataTypeName(
          java.lang.Iterable<java.lang.String> values) {
        ensureOutputDataTypeNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputDataTypeName_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public Builder clearOutputDataTypeName() {
        outputDataTypeName_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00002000);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string outputDataTypeName = 16;</code>
       */
      public Builder addOutputDataTypeNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOutputDataTypeNameIsMutable();
        outputDataTypeName_.add(value);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.MapField<
          java.lang.String, java.lang.String> inputToOutput_;
      private org.nd4j.shade.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetInputToOutput() {
        if (inputToOutput_ == null) {
          return org.nd4j.shade.protobuf.MapField.emptyMapField(
              InputToOutputDefaultEntryHolder.defaultEntry);
        }
        return inputToOutput_;
      }
      private org.nd4j.shade.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetMutableInputToOutput() {
        onChanged();;
        if (inputToOutput_ == null) {
          inputToOutput_ = org.nd4j.shade.protobuf.MapField.newMapField(
              InputToOutputDefaultEntryHolder.defaultEntry);
        }
        if (!inputToOutput_.isMutable()) {
          inputToOutput_ = inputToOutput_.copy();
        }
        return inputToOutput_;
      }

      public int getInputToOutputCount() {
        return internalGetInputToOutput().getMap().size();
      }
      /**
       * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
       */

      public boolean containsInputToOutput(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        return internalGetInputToOutput().getMap().containsKey(key);
      }
      /**
       * Use {@link #getInputToOutputMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getInputToOutput() {
        return getInputToOutputMap();
      }
      /**
       * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
       */

      public java.util.Map<java.lang.String, java.lang.String> getInputToOutputMap() {
        return internalGetInputToOutput().getMap();
      }
      /**
       * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
       */

      public java.lang.String getInputToOutputOrDefault(
          java.lang.String key,
          java.lang.String defaultValue) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetInputToOutput().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
       */

      public java.lang.String getInputToOutputOrThrow(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetInputToOutput().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearInputToOutput() {
        internalGetMutableInputToOutput().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
       */

      public Builder removeInputToOutput(
          java.lang.String key) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableInputToOutput().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String>
      getMutableInputToOutput() {
        return internalGetMutableInputToOutput().getMutableMap();
      }
      /**
       * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
       */
      public Builder putInputToOutput(
          java.lang.String key,
          java.lang.String value) {
        if (key == null) { throw new java.lang.NullPointerException(); }
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableInputToOutput().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;string, string&gt; inputToOutput = 17;</code>
       */

      public Builder putAllInputToOutput(
          java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableInputToOutput().getMutableMap()
            .putAll(values);
        return this;
      }

      private java.lang.Object ruleType_ = "";
      /**
       * <code>string ruleType = 18;</code>
       */
      public java.lang.String getRuleType() {
        java.lang.Object ref = ruleType_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ruleType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string ruleType = 18;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getRuleTypeBytes() {
        java.lang.Object ref = ruleType_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ruleType_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string ruleType = 18;</code>
       */
      public Builder setRuleType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ruleType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string ruleType = 18;</code>
       */
      public Builder clearRuleType() {
        
        ruleType_ = getDefaultInstance().getRuleType();
        onChanged();
        return this;
      }
      /**
       * <code>string ruleType = 18;</code>
       */
      public Builder setRuleTypeBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ruleType_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.nd4j.ir.MapperNamespace.TransformerArgs> transformerArgs_ =
        java.util.Collections.emptyList();
      private void ensureTransformerArgsIsMutable() {
        if (!((bitField0_ & 0x00008000) != 0)) {
          transformerArgs_ = new java.util.ArrayList<org.nd4j.ir.MapperNamespace.TransformerArgs>(transformerArgs_);
          bitField0_ |= 0x00008000;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.MapperNamespace.TransformerArgs, org.nd4j.ir.MapperNamespace.TransformerArgs.Builder, org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder> transformerArgsBuilder_;

      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public java.util.List<org.nd4j.ir.MapperNamespace.TransformerArgs> getTransformerArgsList() {
        if (transformerArgsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(transformerArgs_);
        } else {
          return transformerArgsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public int getTransformerArgsCount() {
        if (transformerArgsBuilder_ == null) {
          return transformerArgs_.size();
        } else {
          return transformerArgsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public org.nd4j.ir.MapperNamespace.TransformerArgs getTransformerArgs(int index) {
        if (transformerArgsBuilder_ == null) {
          return transformerArgs_.get(index);
        } else {
          return transformerArgsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder setTransformerArgs(
          int index, org.nd4j.ir.MapperNamespace.TransformerArgs value) {
        if (transformerArgsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTransformerArgsIsMutable();
          transformerArgs_.set(index, value);
          onChanged();
        } else {
          transformerArgsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder setTransformerArgs(
          int index, org.nd4j.ir.MapperNamespace.TransformerArgs.Builder builderForValue) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.set(index, builderForValue.build());
          onChanged();
        } else {
          transformerArgsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder addTransformerArgs(org.nd4j.ir.MapperNamespace.TransformerArgs value) {
        if (transformerArgsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(value);
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder addTransformerArgs(
          int index, org.nd4j.ir.MapperNamespace.TransformerArgs value) {
        if (transformerArgsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(index, value);
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder addTransformerArgs(
          org.nd4j.ir.MapperNamespace.TransformerArgs.Builder builderForValue) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(builderForValue.build());
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder addTransformerArgs(
          int index, org.nd4j.ir.MapperNamespace.TransformerArgs.Builder builderForValue) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(index, builderForValue.build());
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder addAllTransformerArgs(
          java.lang.Iterable<? extends org.nd4j.ir.MapperNamespace.TransformerArgs> values) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, transformerArgs_);
          onChanged();
        } else {
          transformerArgsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder clearTransformerArgs() {
        if (transformerArgsBuilder_ == null) {
          transformerArgs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00008000);
          onChanged();
        } else {
          transformerArgsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public Builder removeTransformerArgs(int index) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.remove(index);
          onChanged();
        } else {
          transformerArgsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public org.nd4j.ir.MapperNamespace.TransformerArgs.Builder getTransformerArgsBuilder(
          int index) {
        return getTransformerArgsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder getTransformerArgsOrBuilder(
          int index) {
        if (transformerArgsBuilder_ == null) {
          return transformerArgs_.get(index);  } else {
          return transformerArgsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public java.util.List<? extends org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder> 
           getTransformerArgsOrBuilderList() {
        if (transformerArgsBuilder_ != null) {
          return transformerArgsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(transformerArgs_);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public org.nd4j.ir.MapperNamespace.TransformerArgs.Builder addTransformerArgsBuilder() {
        return getTransformerArgsFieldBuilder().addBuilder(
            org.nd4j.ir.MapperNamespace.TransformerArgs.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public org.nd4j.ir.MapperNamespace.TransformerArgs.Builder addTransformerArgsBuilder(
          int index) {
        return getTransformerArgsFieldBuilder().addBuilder(
            index, org.nd4j.ir.MapperNamespace.TransformerArgs.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.TransformerArgs transformerArgs = 19;</code>
       */
      public java.util.List<org.nd4j.ir.MapperNamespace.TransformerArgs.Builder> 
           getTransformerArgsBuilderList() {
        return getTransformerArgsFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.MapperNamespace.TransformerArgs, org.nd4j.ir.MapperNamespace.TransformerArgs.Builder, org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder> 
          getTransformerArgsFieldBuilder() {
        if (transformerArgsBuilder_ == null) {
          transformerArgsBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.MapperNamespace.TransformerArgs, org.nd4j.ir.MapperNamespace.TransformerArgs.Builder, org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder>(
                  transformerArgs_,
                  ((bitField0_ & 0x00008000) != 0),
                  getParentForChildren(),
                  isClean());
          transformerArgs_ = null;
        }
        return transformerArgsBuilder_;
      }

      private java.lang.Object inputFrameworkOpName_ = "";
      /**
       * <code>string inputFrameworkOpName = 20;</code>
       */
      public java.lang.String getInputFrameworkOpName() {
        java.lang.Object ref = inputFrameworkOpName_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          inputFrameworkOpName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string inputFrameworkOpName = 20;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputFrameworkOpNameBytes() {
        java.lang.Object ref = inputFrameworkOpName_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          inputFrameworkOpName_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string inputFrameworkOpName = 20;</code>
       */
      public Builder setInputFrameworkOpName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        inputFrameworkOpName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string inputFrameworkOpName = 20;</code>
       */
      public Builder clearInputFrameworkOpName() {
        
        inputFrameworkOpName_ = getDefaultInstance().getInputFrameworkOpName();
        onChanged();
        return this;
      }
      /**
       * <code>string inputFrameworkOpName = 20;</code>
       */
      public Builder setInputFrameworkOpNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        inputFrameworkOpName_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.MappingRule)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.MappingRule)
    private static final org.nd4j.ir.MapperNamespace.MappingRule DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.MapperNamespace.MappingRule();
    }

    public static org.nd4j.ir.MapperNamespace.MappingRule getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<MappingRule>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<MappingRule>() {
      @java.lang.Override
      public MappingRule parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new MappingRule(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<MappingRule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<MappingRule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.MapperNamespace.MappingRule getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TransformerArgsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.TransformerArgs)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>string key = 1;</code>
     */
    java.lang.String getKey();
    /**
     * <code>string key = 1;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getKeyBytes();

    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> 
        getTransformerArgsList();
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    org.nd4j.ir.OpNamespace.ArgDescriptor getTransformerArgs(int index);
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    int getTransformerArgsCount();
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    java.util.List<? extends org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
        getTransformerArgsOrBuilderList();
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder getTransformerArgsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code org.nd4j.ir.TransformerArgs}
   */
  public  static final class TransformerArgs extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.TransformerArgs)
      TransformerArgsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransformerArgs.newBuilder() to construct.
    private TransformerArgs(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransformerArgs() {
      key_ = "";
      transformerArgs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TransformerArgs();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransformerArgs(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.nd4j.shade.protobuf.UnknownFieldSet.Builder unknownFields =
          org.nd4j.shade.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              key_ = s;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                transformerArgs_ = new java.util.ArrayList<org.nd4j.ir.OpNamespace.ArgDescriptor>();
                mutable_bitField0_ |= 0x00000001;
              }
              transformerArgs_.add(
                  input.readMessage(org.nd4j.ir.OpNamespace.ArgDescriptor.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.nd4j.shade.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          transformerArgs_ = java.util.Collections.unmodifiableList(transformerArgs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_TransformerArgs_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_TransformerArgs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.MapperNamespace.TransformerArgs.class, org.nd4j.ir.MapperNamespace.TransformerArgs.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private volatile java.lang.Object key_;
    /**
     * <code>string key = 1;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      }
    }
    /**
     * <code>string key = 1;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int TRANSFORMERARGS_FIELD_NUMBER = 2;
    private java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> transformerArgs_;
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    public java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> getTransformerArgsList() {
      return transformerArgs_;
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    public java.util.List<? extends org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
        getTransformerArgsOrBuilderList() {
      return transformerArgs_;
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    public int getTransformerArgsCount() {
      return transformerArgs_.size();
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    public org.nd4j.ir.OpNamespace.ArgDescriptor getTransformerArgs(int index) {
      return transformerArgs_.get(index);
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
     */
    public org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder getTransformerArgsOrBuilder(
        int index) {
      return transformerArgs_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.nd4j.shade.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getKeyBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
      }
      for (int i = 0; i < transformerArgs_.size(); i++) {
        output.writeMessage(2, transformerArgs_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getKeyBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
      }
      for (int i = 0; i < transformerArgs_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(2, transformerArgs_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.nd4j.ir.MapperNamespace.TransformerArgs)) {
        return super.equals(obj);
      }
      org.nd4j.ir.MapperNamespace.TransformerArgs other = (org.nd4j.ir.MapperNamespace.TransformerArgs) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
      if (!getTransformerArgsList()
          .equals(other.getTransformerArgsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
      if (getTransformerArgsCount() > 0) {
        hash = (37 * hash) + TRANSFORMERARGS_FIELD_NUMBER;
        hash = (53 * hash) + getTransformerArgsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.TransformerArgs parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.nd4j.ir.MapperNamespace.TransformerArgs prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.nd4j.ir.TransformerArgs}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.TransformerArgs)
        org.nd4j.ir.MapperNamespace.TransformerArgsOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_TransformerArgs_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_TransformerArgs_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.MapperNamespace.TransformerArgs.class, org.nd4j.ir.MapperNamespace.TransformerArgs.Builder.class);
      }

      // Construct using org.nd4j.ir.MapperNamespace.TransformerArgs.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.nd4j.shade.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getTransformerArgsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        key_ = "";

        if (transformerArgsBuilder_ == null) {
          transformerArgs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          transformerArgsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_TransformerArgs_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.TransformerArgs getDefaultInstanceForType() {
        return org.nd4j.ir.MapperNamespace.TransformerArgs.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.TransformerArgs build() {
        org.nd4j.ir.MapperNamespace.TransformerArgs result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.TransformerArgs buildPartial() {
        org.nd4j.ir.MapperNamespace.TransformerArgs result = new org.nd4j.ir.MapperNamespace.TransformerArgs(this);
        int from_bitField0_ = bitField0_;
        result.key_ = key_;
        if (transformerArgsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            transformerArgs_ = java.util.Collections.unmodifiableList(transformerArgs_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.transformerArgs_ = transformerArgs_;
        } else {
          result.transformerArgs_ = transformerArgsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.nd4j.shade.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.nd4j.shade.protobuf.Message other) {
        if (other instanceof org.nd4j.ir.MapperNamespace.TransformerArgs) {
          return mergeFrom((org.nd4j.ir.MapperNamespace.TransformerArgs)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.MapperNamespace.TransformerArgs other) {
        if (other == org.nd4j.ir.MapperNamespace.TransformerArgs.getDefaultInstance()) return this;
        if (!other.getKey().isEmpty()) {
          key_ = other.key_;
          onChanged();
        }
        if (transformerArgsBuilder_ == null) {
          if (!other.transformerArgs_.isEmpty()) {
            if (transformerArgs_.isEmpty()) {
              transformerArgs_ = other.transformerArgs_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTransformerArgsIsMutable();
              transformerArgs_.addAll(other.transformerArgs_);
            }
            onChanged();
          }
        } else {
          if (!other.transformerArgs_.isEmpty()) {
            if (transformerArgsBuilder_.isEmpty()) {
              transformerArgsBuilder_.dispose();
              transformerArgsBuilder_ = null;
              transformerArgs_ = other.transformerArgs_;
              bitField0_ = (bitField0_ & ~0x00000001);
              transformerArgsBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTransformerArgsFieldBuilder() : null;
            } else {
              transformerArgsBuilder_.addAllMessages(other.transformerArgs_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.nd4j.ir.MapperNamespace.TransformerArgs parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.MapperNamespace.TransformerArgs) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object key_ = "";
      /**
       * <code>string key = 1;</code>
       */
      public java.lang.String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string key = 1;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getKeyBytes() {
        java.lang.Object ref = key_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          key_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string key = 1;</code>
       */
      public Builder setKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string key = 1;</code>
       */
      public Builder clearKey() {
        
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      /**
       * <code>string key = 1;</code>
       */
      public Builder setKeyBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        key_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> transformerArgs_ =
        java.util.Collections.emptyList();
      private void ensureTransformerArgsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          transformerArgs_ = new java.util.ArrayList<org.nd4j.ir.OpNamespace.ArgDescriptor>(transformerArgs_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.OpNamespace.ArgDescriptor, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder, org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> transformerArgsBuilder_;

      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> getTransformerArgsList() {
        if (transformerArgsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(transformerArgs_);
        } else {
          return transformerArgsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public int getTransformerArgsCount() {
        if (transformerArgsBuilder_ == null) {
          return transformerArgs_.size();
        } else {
          return transformerArgsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor getTransformerArgs(int index) {
        if (transformerArgsBuilder_ == null) {
          return transformerArgs_.get(index);
        } else {
          return transformerArgsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder setTransformerArgs(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor value) {
        if (transformerArgsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTransformerArgsIsMutable();
          transformerArgs_.set(index, value);
          onChanged();
        } else {
          transformerArgsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder setTransformerArgs(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder builderForValue) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.set(index, builderForValue.build());
          onChanged();
        } else {
          transformerArgsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder addTransformerArgs(org.nd4j.ir.OpNamespace.ArgDescriptor value) {
        if (transformerArgsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(value);
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder addTransformerArgs(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor value) {
        if (transformerArgsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(index, value);
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder addTransformerArgs(
          org.nd4j.ir.OpNamespace.ArgDescriptor.Builder builderForValue) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(builderForValue.build());
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder addTransformerArgs(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder builderForValue) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.add(index, builderForValue.build());
          onChanged();
        } else {
          transformerArgsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder addAllTransformerArgs(
          java.lang.Iterable<? extends org.nd4j.ir.OpNamespace.ArgDescriptor> values) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, transformerArgs_);
          onChanged();
        } else {
          transformerArgsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder clearTransformerArgs() {
        if (transformerArgsBuilder_ == null) {
          transformerArgs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          transformerArgsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public Builder removeTransformerArgs(int index) {
        if (transformerArgsBuilder_ == null) {
          ensureTransformerArgsIsMutable();
          transformerArgs_.remove(index);
          onChanged();
        } else {
          transformerArgsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor.Builder getTransformerArgsBuilder(
          int index) {
        return getTransformerArgsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder getTransformerArgsOrBuilder(
          int index) {
        if (transformerArgsBuilder_ == null) {
          return transformerArgs_.get(index);  } else {
          return transformerArgsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public java.util.List<? extends org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
           getTransformerArgsOrBuilderList() {
        if (transformerArgsBuilder_ != null) {
          return transformerArgsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(transformerArgs_);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor.Builder addTransformerArgsBuilder() {
        return getTransformerArgsFieldBuilder().addBuilder(
            org.nd4j.ir.OpNamespace.ArgDescriptor.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor.Builder addTransformerArgsBuilder(
          int index) {
        return getTransformerArgsFieldBuilder().addBuilder(
            index, org.nd4j.ir.OpNamespace.ArgDescriptor.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor transformerArgs = 2;</code>
       */
      public java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor.Builder> 
           getTransformerArgsBuilderList() {
        return getTransformerArgsFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.OpNamespace.ArgDescriptor, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder, org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
          getTransformerArgsFieldBuilder() {
        if (transformerArgsBuilder_ == null) {
          transformerArgsBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.OpNamespace.ArgDescriptor, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder, org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder>(
                  transformerArgs_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          transformerArgs_ = null;
        }
        return transformerArgsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.TransformerArgs)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.TransformerArgs)
    private static final org.nd4j.ir.MapperNamespace.TransformerArgs DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.MapperNamespace.TransformerArgs();
    }

    public static org.nd4j.ir.MapperNamespace.TransformerArgs getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<TransformerArgs>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<TransformerArgs>() {
      @java.lang.Override
      public TransformerArgs parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new TransformerArgs(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<TransformerArgs> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<TransformerArgs> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.MapperNamespace.TransformerArgs getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MappingDefinitionSetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.MappingDefinitionSet)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    java.util.List<org.nd4j.ir.MapperNamespace.MapperDeclaration> 
        getMappingsList();
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    org.nd4j.ir.MapperNamespace.MapperDeclaration getMappings(int index);
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    int getMappingsCount();
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    java.util.List<? extends org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder> 
        getMappingsOrBuilderList();
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder getMappingsOrBuilder(
        int index);

    /**
     * <code>repeated string name = 2;</code>
     */
    java.util.List<java.lang.String>
        getNameList();
    /**
     * <code>repeated string name = 2;</code>
     */
    int getNameCount();
    /**
     * <code>repeated string name = 2;</code>
     */
    java.lang.String getName(int index);
    /**
     * <code>repeated string name = 2;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getNameBytes(int index);
  }
  /**
   * Protobuf type {@code org.nd4j.ir.MappingDefinitionSet}
   */
  public  static final class MappingDefinitionSet extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.MappingDefinitionSet)
      MappingDefinitionSetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MappingDefinitionSet.newBuilder() to construct.
    private MappingDefinitionSet(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MappingDefinitionSet() {
      mappings_ = java.util.Collections.emptyList();
      name_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MappingDefinitionSet();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MappingDefinitionSet(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.nd4j.shade.protobuf.UnknownFieldSet.Builder unknownFields =
          org.nd4j.shade.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mappings_ = new java.util.ArrayList<org.nd4j.ir.MapperNamespace.MapperDeclaration>();
                mutable_bitField0_ |= 0x00000001;
              }
              mappings_.add(
                  input.readMessage(org.nd4j.ir.MapperNamespace.MapperDeclaration.parser(), extensionRegistry));
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                name_ = new org.nd4j.shade.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              name_.add(s);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.nd4j.shade.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          mappings_ = java.util.Collections.unmodifiableList(mappings_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          name_ = name_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingDefinitionSet_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingDefinitionSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.MapperNamespace.MappingDefinitionSet.class, org.nd4j.ir.MapperNamespace.MappingDefinitionSet.Builder.class);
    }

    public static final int MAPPINGS_FIELD_NUMBER = 1;
    private java.util.List<org.nd4j.ir.MapperNamespace.MapperDeclaration> mappings_;
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    public java.util.List<org.nd4j.ir.MapperNamespace.MapperDeclaration> getMappingsList() {
      return mappings_;
    }
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    public java.util.List<? extends org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder> 
        getMappingsOrBuilderList() {
      return mappings_;
    }
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    public int getMappingsCount() {
      return mappings_.size();
    }
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    public org.nd4j.ir.MapperNamespace.MapperDeclaration getMappings(int index) {
      return mappings_.get(index);
    }
    /**
     * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
     */
    public org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder getMappingsOrBuilder(
        int index) {
      return mappings_.get(index);
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private org.nd4j.shade.protobuf.LazyStringList name_;
    /**
     * <code>repeated string name = 2;</code>
     */
    public org.nd4j.shade.protobuf.ProtocolStringList
        getNameList() {
      return name_;
    }
    /**
     * <code>repeated string name = 2;</code>
     */
    public int getNameCount() {
      return name_.size();
    }
    /**
     * <code>repeated string name = 2;</code>
     */
    public java.lang.String getName(int index) {
      return name_.get(index);
    }
    /**
     * <code>repeated string name = 2;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getNameBytes(int index) {
      return name_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.nd4j.shade.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < mappings_.size(); i++) {
        output.writeMessage(1, mappings_.get(i));
      }
      for (int i = 0; i < name_.size(); i++) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 2, name_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < mappings_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(1, mappings_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < name_.size(); i++) {
          dataSize += computeStringSizeNoTag(name_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getNameList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.nd4j.ir.MapperNamespace.MappingDefinitionSet)) {
        return super.equals(obj);
      }
      org.nd4j.ir.MapperNamespace.MappingDefinitionSet other = (org.nd4j.ir.MapperNamespace.MappingDefinitionSet) obj;

      if (!getMappingsList()
          .equals(other.getMappingsList())) return false;
      if (!getNameList()
          .equals(other.getNameList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getMappingsCount() > 0) {
        hash = (37 * hash) + MAPPINGS_FIELD_NUMBER;
        hash = (53 * hash) + getMappingsList().hashCode();
      }
      if (getNameCount() > 0) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getNameList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.nd4j.ir.MapperNamespace.MappingDefinitionSet prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.nd4j.ir.MappingDefinitionSet}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.MappingDefinitionSet)
        org.nd4j.ir.MapperNamespace.MappingDefinitionSetOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingDefinitionSet_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingDefinitionSet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.MapperNamespace.MappingDefinitionSet.class, org.nd4j.ir.MapperNamespace.MappingDefinitionSet.Builder.class);
      }

      // Construct using org.nd4j.ir.MapperNamespace.MappingDefinitionSet.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.nd4j.shade.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getMappingsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (mappingsBuilder_ == null) {
          mappings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          mappingsBuilder_.clear();
        }
        name_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MappingDefinitionSet_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MappingDefinitionSet getDefaultInstanceForType() {
        return org.nd4j.ir.MapperNamespace.MappingDefinitionSet.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MappingDefinitionSet build() {
        org.nd4j.ir.MapperNamespace.MappingDefinitionSet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MappingDefinitionSet buildPartial() {
        org.nd4j.ir.MapperNamespace.MappingDefinitionSet result = new org.nd4j.ir.MapperNamespace.MappingDefinitionSet(this);
        int from_bitField0_ = bitField0_;
        if (mappingsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            mappings_ = java.util.Collections.unmodifiableList(mappings_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.mappings_ = mappings_;
        } else {
          result.mappings_ = mappingsBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          name_ = name_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.name_ = name_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.nd4j.shade.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.nd4j.shade.protobuf.Message other) {
        if (other instanceof org.nd4j.ir.MapperNamespace.MappingDefinitionSet) {
          return mergeFrom((org.nd4j.ir.MapperNamespace.MappingDefinitionSet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.MapperNamespace.MappingDefinitionSet other) {
        if (other == org.nd4j.ir.MapperNamespace.MappingDefinitionSet.getDefaultInstance()) return this;
        if (mappingsBuilder_ == null) {
          if (!other.mappings_.isEmpty()) {
            if (mappings_.isEmpty()) {
              mappings_ = other.mappings_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMappingsIsMutable();
              mappings_.addAll(other.mappings_);
            }
            onChanged();
          }
        } else {
          if (!other.mappings_.isEmpty()) {
            if (mappingsBuilder_.isEmpty()) {
              mappingsBuilder_.dispose();
              mappingsBuilder_ = null;
              mappings_ = other.mappings_;
              bitField0_ = (bitField0_ & ~0x00000001);
              mappingsBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMappingsFieldBuilder() : null;
            } else {
              mappingsBuilder_.addAllMessages(other.mappings_);
            }
          }
        }
        if (!other.name_.isEmpty()) {
          if (name_.isEmpty()) {
            name_ = other.name_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNameIsMutable();
            name_.addAll(other.name_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.nd4j.ir.MapperNamespace.MappingDefinitionSet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.MapperNamespace.MappingDefinitionSet) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.nd4j.ir.MapperNamespace.MapperDeclaration> mappings_ =
        java.util.Collections.emptyList();
      private void ensureMappingsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mappings_ = new java.util.ArrayList<org.nd4j.ir.MapperNamespace.MapperDeclaration>(mappings_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.MapperNamespace.MapperDeclaration, org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder, org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder> mappingsBuilder_;

      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public java.util.List<org.nd4j.ir.MapperNamespace.MapperDeclaration> getMappingsList() {
        if (mappingsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mappings_);
        } else {
          return mappingsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public int getMappingsCount() {
        if (mappingsBuilder_ == null) {
          return mappings_.size();
        } else {
          return mappingsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public org.nd4j.ir.MapperNamespace.MapperDeclaration getMappings(int index) {
        if (mappingsBuilder_ == null) {
          return mappings_.get(index);
        } else {
          return mappingsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder setMappings(
          int index, org.nd4j.ir.MapperNamespace.MapperDeclaration value) {
        if (mappingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMappingsIsMutable();
          mappings_.set(index, value);
          onChanged();
        } else {
          mappingsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder setMappings(
          int index, org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder builderForValue) {
        if (mappingsBuilder_ == null) {
          ensureMappingsIsMutable();
          mappings_.set(index, builderForValue.build());
          onChanged();
        } else {
          mappingsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder addMappings(org.nd4j.ir.MapperNamespace.MapperDeclaration value) {
        if (mappingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMappingsIsMutable();
          mappings_.add(value);
          onChanged();
        } else {
          mappingsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder addMappings(
          int index, org.nd4j.ir.MapperNamespace.MapperDeclaration value) {
        if (mappingsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMappingsIsMutable();
          mappings_.add(index, value);
          onChanged();
        } else {
          mappingsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder addMappings(
          org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder builderForValue) {
        if (mappingsBuilder_ == null) {
          ensureMappingsIsMutable();
          mappings_.add(builderForValue.build());
          onChanged();
        } else {
          mappingsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder addMappings(
          int index, org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder builderForValue) {
        if (mappingsBuilder_ == null) {
          ensureMappingsIsMutable();
          mappings_.add(index, builderForValue.build());
          onChanged();
        } else {
          mappingsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder addAllMappings(
          java.lang.Iterable<? extends org.nd4j.ir.MapperNamespace.MapperDeclaration> values) {
        if (mappingsBuilder_ == null) {
          ensureMappingsIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, mappings_);
          onChanged();
        } else {
          mappingsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder clearMappings() {
        if (mappingsBuilder_ == null) {
          mappings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          mappingsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public Builder removeMappings(int index) {
        if (mappingsBuilder_ == null) {
          ensureMappingsIsMutable();
          mappings_.remove(index);
          onChanged();
        } else {
          mappingsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder getMappingsBuilder(
          int index) {
        return getMappingsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder getMappingsOrBuilder(
          int index) {
        if (mappingsBuilder_ == null) {
          return mappings_.get(index);  } else {
          return mappingsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public java.util.List<? extends org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder> 
           getMappingsOrBuilderList() {
        if (mappingsBuilder_ != null) {
          return mappingsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mappings_);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder addMappingsBuilder() {
        return getMappingsFieldBuilder().addBuilder(
            org.nd4j.ir.MapperNamespace.MapperDeclaration.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder addMappingsBuilder(
          int index) {
        return getMappingsFieldBuilder().addBuilder(
            index, org.nd4j.ir.MapperNamespace.MapperDeclaration.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.MapperDeclaration mappings = 1;</code>
       */
      public java.util.List<org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder> 
           getMappingsBuilderList() {
        return getMappingsFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.MapperNamespace.MapperDeclaration, org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder, org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder> 
          getMappingsFieldBuilder() {
        if (mappingsBuilder_ == null) {
          mappingsBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.MapperNamespace.MapperDeclaration, org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder, org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder>(
                  mappings_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          mappings_ = null;
        }
        return mappingsBuilder_;
      }

      private org.nd4j.shade.protobuf.LazyStringList name_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
      private void ensureNameIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          name_ = new org.nd4j.shade.protobuf.LazyStringArrayList(name_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public org.nd4j.shade.protobuf.ProtocolStringList
          getNameList() {
        return name_.getUnmodifiableView();
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public int getNameCount() {
        return name_.size();
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public java.lang.String getName(int index) {
        return name_.get(index);
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getNameBytes(int index) {
        return name_.getByteString(index);
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public Builder setName(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
        name_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public Builder addName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
        name_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public Builder addAllName(
          java.lang.Iterable<java.lang.String> values) {
        ensureNameIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, name_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public Builder clearName() {
        name_ = org.nd4j.shade.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string name = 2;</code>
       */
      public Builder addNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureNameIsMutable();
        name_.add(value);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.MappingDefinitionSet)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.MappingDefinitionSet)
    private static final org.nd4j.ir.MapperNamespace.MappingDefinitionSet DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.MapperNamespace.MappingDefinitionSet();
    }

    public static org.nd4j.ir.MapperNamespace.MappingDefinitionSet getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<MappingDefinitionSet>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<MappingDefinitionSet>() {
      @java.lang.Override
      public MappingDefinitionSet parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new MappingDefinitionSet(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<MappingDefinitionSet> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<MappingDefinitionSet> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.MapperNamespace.MappingDefinitionSet getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MapperDeclarationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.MapperDeclaration)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>string frameworkName = 1;</code>
     */
    java.lang.String getFrameworkName();
    /**
     * <code>string frameworkName = 1;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getFrameworkNameBytes();

    /**
     * <code>string opName = 2;</code>
     */
    java.lang.String getOpName();
    /**
     * <code>string opName = 2;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getOpNameBytes();

    /**
     * <code>string inputFrameworkOpName = 3;</code>
     */
    java.lang.String getInputFrameworkOpName();
    /**
     * <code>string inputFrameworkOpName = 3;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getInputFrameworkOpNameBytes();

    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    java.util.List<org.nd4j.ir.MapperNamespace.MappingRule> 
        getRuleList();
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    org.nd4j.ir.MapperNamespace.MappingRule getRule(int index);
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    int getRuleCount();
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    java.util.List<? extends org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder> 
        getRuleOrBuilderList();
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder getRuleOrBuilder(
        int index);

    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */
    int getIndexOverridesCount();
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */
    boolean containsIndexOverrides(
        long key);
    /**
     * Use {@link #getIndexOverridesMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Long, java.lang.Long>
    getIndexOverrides();
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */
    java.util.Map<java.lang.Long, java.lang.Long>
    getIndexOverridesMap();
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */

    long getIndexOverridesOrDefault(
        long key,
        long defaultValue);
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */

    long getIndexOverridesOrThrow(
        long key);
  }
  /**
   * Protobuf type {@code org.nd4j.ir.MapperDeclaration}
   */
  public  static final class MapperDeclaration extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.MapperDeclaration)
      MapperDeclarationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MapperDeclaration.newBuilder() to construct.
    private MapperDeclaration(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MapperDeclaration() {
      frameworkName_ = "";
      opName_ = "";
      inputFrameworkOpName_ = "";
      rule_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MapperDeclaration();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MapperDeclaration(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.nd4j.shade.protobuf.UnknownFieldSet.Builder unknownFields =
          org.nd4j.shade.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              frameworkName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              opName_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              inputFrameworkOpName_ = s;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                rule_ = new java.util.ArrayList<org.nd4j.ir.MapperNamespace.MappingRule>();
                mutable_bitField0_ |= 0x00000001;
              }
              rule_.add(
                  input.readMessage(org.nd4j.ir.MapperNamespace.MappingRule.parser(), extensionRegistry));
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                indexOverrides_ = org.nd4j.shade.protobuf.MapField.newMapField(
                    IndexOverridesDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000002;
              }
              org.nd4j.shade.protobuf.MapEntry<java.lang.Long, java.lang.Long>
              indexOverrides__ = input.readMessage(
                  IndexOverridesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              indexOverrides_.getMutableMap().put(
                  indexOverrides__.getKey(), indexOverrides__.getValue());
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.nd4j.shade.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          rule_ = java.util.Collections.unmodifiableList(rule_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MapperDeclaration_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected org.nd4j.shade.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetIndexOverrides();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MapperDeclaration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.MapperNamespace.MapperDeclaration.class, org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder.class);
    }

    public static final int FRAMEWORKNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object frameworkName_;
    /**
     * <code>string frameworkName = 1;</code>
     */
    public java.lang.String getFrameworkName() {
      java.lang.Object ref = frameworkName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        frameworkName_ = s;
        return s;
      }
    }
    /**
     * <code>string frameworkName = 1;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getFrameworkNameBytes() {
      java.lang.Object ref = frameworkName_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        frameworkName_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int OPNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object opName_;
    /**
     * <code>string opName = 2;</code>
     */
    public java.lang.String getOpName() {
      java.lang.Object ref = opName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        opName_ = s;
        return s;
      }
    }
    /**
     * <code>string opName = 2;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getOpNameBytes() {
      java.lang.Object ref = opName_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        opName_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int INPUTFRAMEWORKOPNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object inputFrameworkOpName_;
    /**
     * <code>string inputFrameworkOpName = 3;</code>
     */
    public java.lang.String getInputFrameworkOpName() {
      java.lang.Object ref = inputFrameworkOpName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputFrameworkOpName_ = s;
        return s;
      }
    }
    /**
     * <code>string inputFrameworkOpName = 3;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getInputFrameworkOpNameBytes() {
      java.lang.Object ref = inputFrameworkOpName_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputFrameworkOpName_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int RULE_FIELD_NUMBER = 4;
    private java.util.List<org.nd4j.ir.MapperNamespace.MappingRule> rule_;
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    public java.util.List<org.nd4j.ir.MapperNamespace.MappingRule> getRuleList() {
      return rule_;
    }
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    public java.util.List<? extends org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder> 
        getRuleOrBuilderList() {
      return rule_;
    }
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    public int getRuleCount() {
      return rule_.size();
    }
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    public org.nd4j.ir.MapperNamespace.MappingRule getRule(int index) {
      return rule_.get(index);
    }
    /**
     * <pre>
     *the rules to apply for attributes
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
     */
    public org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder getRuleOrBuilder(
        int index) {
      return rule_.get(index);
    }

    public static final int INDEXOVERRIDES_FIELD_NUMBER = 5;
    private static final class IndexOverridesDefaultEntryHolder {
      static final org.nd4j.shade.protobuf.MapEntry<
          java.lang.Long, java.lang.Long> defaultEntry =
              org.nd4j.shade.protobuf.MapEntry
              .<java.lang.Long, java.lang.Long>newDefaultInstance(
                  org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MapperDeclaration_IndexOverridesEntry_descriptor, 
                  org.nd4j.shade.protobuf.WireFormat.FieldType.INT64,
                  0L,
                  org.nd4j.shade.protobuf.WireFormat.FieldType.INT64,
                  0L);
    }
    private org.nd4j.shade.protobuf.MapField<
        java.lang.Long, java.lang.Long> indexOverrides_;
    private org.nd4j.shade.protobuf.MapField<java.lang.Long, java.lang.Long>
    internalGetIndexOverrides() {
      if (indexOverrides_ == null) {
        return org.nd4j.shade.protobuf.MapField.emptyMapField(
            IndexOverridesDefaultEntryHolder.defaultEntry);
      }
      return indexOverrides_;
    }

    public int getIndexOverridesCount() {
      return internalGetIndexOverrides().getMap().size();
    }
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */

    public boolean containsIndexOverrides(
        long key) {
      
      return internalGetIndexOverrides().getMap().containsKey(key);
    }
    /**
     * Use {@link #getIndexOverridesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Long> getIndexOverrides() {
      return getIndexOverridesMap();
    }
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */

    public java.util.Map<java.lang.Long, java.lang.Long> getIndexOverridesMap() {
      return internalGetIndexOverrides().getMap();
    }
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */

    public long getIndexOverridesOrDefault(
        long key,
        long defaultValue) {
      
      java.util.Map<java.lang.Long, java.lang.Long> map =
          internalGetIndexOverrides().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
     */

    public long getIndexOverridesOrThrow(
        long key) {
      
      java.util.Map<java.lang.Long, java.lang.Long> map =
          internalGetIndexOverrides().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.nd4j.shade.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getFrameworkNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 1, frameworkName_);
      }
      if (!getOpNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 2, opName_);
      }
      if (!getInputFrameworkOpNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 3, inputFrameworkOpName_);
      }
      for (int i = 0; i < rule_.size(); i++) {
        output.writeMessage(4, rule_.get(i));
      }
      org.nd4j.shade.protobuf.GeneratedMessageV3
        .serializeLongMapTo(
          output,
          internalGetIndexOverrides(),
          IndexOverridesDefaultEntryHolder.defaultEntry,
          5);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFrameworkNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(1, frameworkName_);
      }
      if (!getOpNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(2, opName_);
      }
      if (!getInputFrameworkOpNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(3, inputFrameworkOpName_);
      }
      for (int i = 0; i < rule_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(4, rule_.get(i));
      }
      for (java.util.Map.Entry<java.lang.Long, java.lang.Long> entry
           : internalGetIndexOverrides().getMap().entrySet()) {
        org.nd4j.shade.protobuf.MapEntry<java.lang.Long, java.lang.Long>
        indexOverrides__ = IndexOverridesDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += org.nd4j.shade.protobuf.CodedOutputStream
            .computeMessageSize(5, indexOverrides__);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.nd4j.ir.MapperNamespace.MapperDeclaration)) {
        return super.equals(obj);
      }
      org.nd4j.ir.MapperNamespace.MapperDeclaration other = (org.nd4j.ir.MapperNamespace.MapperDeclaration) obj;

      if (!getFrameworkName()
          .equals(other.getFrameworkName())) return false;
      if (!getOpName()
          .equals(other.getOpName())) return false;
      if (!getInputFrameworkOpName()
          .equals(other.getInputFrameworkOpName())) return false;
      if (!getRuleList()
          .equals(other.getRuleList())) return false;
      if (!internalGetIndexOverrides().equals(
          other.internalGetIndexOverrides())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FRAMEWORKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getFrameworkName().hashCode();
      hash = (37 * hash) + OPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getOpName().hashCode();
      hash = (37 * hash) + INPUTFRAMEWORKOPNAME_FIELD_NUMBER;
      hash = (53 * hash) + getInputFrameworkOpName().hashCode();
      if (getRuleCount() > 0) {
        hash = (37 * hash) + RULE_FIELD_NUMBER;
        hash = (53 * hash) + getRuleList().hashCode();
      }
      if (!internalGetIndexOverrides().getMap().isEmpty()) {
        hash = (37 * hash) + INDEXOVERRIDES_FIELD_NUMBER;
        hash = (53 * hash) + internalGetIndexOverrides().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.MapperNamespace.MapperDeclaration parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.nd4j.ir.MapperNamespace.MapperDeclaration prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.nd4j.ir.MapperDeclaration}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.MapperDeclaration)
        org.nd4j.ir.MapperNamespace.MapperDeclarationOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MapperDeclaration_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected org.nd4j.shade.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetIndexOverrides();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected org.nd4j.shade.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetMutableIndexOverrides();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MapperDeclaration_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.MapperNamespace.MapperDeclaration.class, org.nd4j.ir.MapperNamespace.MapperDeclaration.Builder.class);
      }

      // Construct using org.nd4j.ir.MapperNamespace.MapperDeclaration.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.nd4j.shade.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.nd4j.shade.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getRuleFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        frameworkName_ = "";

        opName_ = "";

        inputFrameworkOpName_ = "";

        if (ruleBuilder_ == null) {
          rule_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ruleBuilder_.clear();
        }
        internalGetMutableIndexOverrides().clear();
        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.MapperNamespace.internal_static_org_nd4j_ir_MapperDeclaration_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MapperDeclaration getDefaultInstanceForType() {
        return org.nd4j.ir.MapperNamespace.MapperDeclaration.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MapperDeclaration build() {
        org.nd4j.ir.MapperNamespace.MapperDeclaration result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.MapperNamespace.MapperDeclaration buildPartial() {
        org.nd4j.ir.MapperNamespace.MapperDeclaration result = new org.nd4j.ir.MapperNamespace.MapperDeclaration(this);
        int from_bitField0_ = bitField0_;
        result.frameworkName_ = frameworkName_;
        result.opName_ = opName_;
        result.inputFrameworkOpName_ = inputFrameworkOpName_;
        if (ruleBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            rule_ = java.util.Collections.unmodifiableList(rule_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.rule_ = rule_;
        } else {
          result.rule_ = ruleBuilder_.build();
        }
        result.indexOverrides_ = internalGetIndexOverrides();
        result.indexOverrides_.makeImmutable();
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.nd4j.shade.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.nd4j.shade.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.nd4j.shade.protobuf.Message other) {
        if (other instanceof org.nd4j.ir.MapperNamespace.MapperDeclaration) {
          return mergeFrom((org.nd4j.ir.MapperNamespace.MapperDeclaration)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.MapperNamespace.MapperDeclaration other) {
        if (other == org.nd4j.ir.MapperNamespace.MapperDeclaration.getDefaultInstance()) return this;
        if (!other.getFrameworkName().isEmpty()) {
          frameworkName_ = other.frameworkName_;
          onChanged();
        }
        if (!other.getOpName().isEmpty()) {
          opName_ = other.opName_;
          onChanged();
        }
        if (!other.getInputFrameworkOpName().isEmpty()) {
          inputFrameworkOpName_ = other.inputFrameworkOpName_;
          onChanged();
        }
        if (ruleBuilder_ == null) {
          if (!other.rule_.isEmpty()) {
            if (rule_.isEmpty()) {
              rule_ = other.rule_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRuleIsMutable();
              rule_.addAll(other.rule_);
            }
            onChanged();
          }
        } else {
          if (!other.rule_.isEmpty()) {
            if (ruleBuilder_.isEmpty()) {
              ruleBuilder_.dispose();
              ruleBuilder_ = null;
              rule_ = other.rule_;
              bitField0_ = (bitField0_ & ~0x00000001);
              ruleBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRuleFieldBuilder() : null;
            } else {
              ruleBuilder_.addAllMessages(other.rule_);
            }
          }
        }
        internalGetMutableIndexOverrides().mergeFrom(
            other.internalGetIndexOverrides());
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.nd4j.ir.MapperNamespace.MapperDeclaration parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.MapperNamespace.MapperDeclaration) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object frameworkName_ = "";
      /**
       * <code>string frameworkName = 1;</code>
       */
      public java.lang.String getFrameworkName() {
        java.lang.Object ref = frameworkName_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          frameworkName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string frameworkName = 1;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getFrameworkNameBytes() {
        java.lang.Object ref = frameworkName_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          frameworkName_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string frameworkName = 1;</code>
       */
      public Builder setFrameworkName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        frameworkName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string frameworkName = 1;</code>
       */
      public Builder clearFrameworkName() {
        
        frameworkName_ = getDefaultInstance().getFrameworkName();
        onChanged();
        return this;
      }
      /**
       * <code>string frameworkName = 1;</code>
       */
      public Builder setFrameworkNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        frameworkName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object opName_ = "";
      /**
       * <code>string opName = 2;</code>
       */
      public java.lang.String getOpName() {
        java.lang.Object ref = opName_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          opName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string opName = 2;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getOpNameBytes() {
        java.lang.Object ref = opName_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          opName_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string opName = 2;</code>
       */
      public Builder setOpName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        opName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string opName = 2;</code>
       */
      public Builder clearOpName() {
        
        opName_ = getDefaultInstance().getOpName();
        onChanged();
        return this;
      }
      /**
       * <code>string opName = 2;</code>
       */
      public Builder setOpNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        opName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object inputFrameworkOpName_ = "";
      /**
       * <code>string inputFrameworkOpName = 3;</code>
       */
      public java.lang.String getInputFrameworkOpName() {
        java.lang.Object ref = inputFrameworkOpName_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          inputFrameworkOpName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string inputFrameworkOpName = 3;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getInputFrameworkOpNameBytes() {
        java.lang.Object ref = inputFrameworkOpName_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          inputFrameworkOpName_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string inputFrameworkOpName = 3;</code>
       */
      public Builder setInputFrameworkOpName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        inputFrameworkOpName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string inputFrameworkOpName = 3;</code>
       */
      public Builder clearInputFrameworkOpName() {
        
        inputFrameworkOpName_ = getDefaultInstance().getInputFrameworkOpName();
        onChanged();
        return this;
      }
      /**
       * <code>string inputFrameworkOpName = 3;</code>
       */
      public Builder setInputFrameworkOpNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        inputFrameworkOpName_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.nd4j.ir.MapperNamespace.MappingRule> rule_ =
        java.util.Collections.emptyList();
      private void ensureRuleIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          rule_ = new java.util.ArrayList<org.nd4j.ir.MapperNamespace.MappingRule>(rule_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.MapperNamespace.MappingRule, org.nd4j.ir.MapperNamespace.MappingRule.Builder, org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder> ruleBuilder_;

      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public java.util.List<org.nd4j.ir.MapperNamespace.MappingRule> getRuleList() {
        if (ruleBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rule_);
        } else {
          return ruleBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public int getRuleCount() {
        if (ruleBuilder_ == null) {
          return rule_.size();
        } else {
          return ruleBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public org.nd4j.ir.MapperNamespace.MappingRule getRule(int index) {
        if (ruleBuilder_ == null) {
          return rule_.get(index);
        } else {
          return ruleBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder setRule(
          int index, org.nd4j.ir.MapperNamespace.MappingRule value) {
        if (ruleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRuleIsMutable();
          rule_.set(index, value);
          onChanged();
        } else {
          ruleBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder setRule(
          int index, org.nd4j.ir.MapperNamespace.MappingRule.Builder builderForValue) {
        if (ruleBuilder_ == null) {
          ensureRuleIsMutable();
          rule_.set(index, builderForValue.build());
          onChanged();
        } else {
          ruleBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder addRule(org.nd4j.ir.MapperNamespace.MappingRule value) {
        if (ruleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRuleIsMutable();
          rule_.add(value);
          onChanged();
        } else {
          ruleBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder addRule(
          int index, org.nd4j.ir.MapperNamespace.MappingRule value) {
        if (ruleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRuleIsMutable();
          rule_.add(index, value);
          onChanged();
        } else {
          ruleBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder addRule(
          org.nd4j.ir.MapperNamespace.MappingRule.Builder builderForValue) {
        if (ruleBuilder_ == null) {
          ensureRuleIsMutable();
          rule_.add(builderForValue.build());
          onChanged();
        } else {
          ruleBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder addRule(
          int index, org.nd4j.ir.MapperNamespace.MappingRule.Builder builderForValue) {
        if (ruleBuilder_ == null) {
          ensureRuleIsMutable();
          rule_.add(index, builderForValue.build());
          onChanged();
        } else {
          ruleBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder addAllRule(
          java.lang.Iterable<? extends org.nd4j.ir.MapperNamespace.MappingRule> values) {
        if (ruleBuilder_ == null) {
          ensureRuleIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, rule_);
          onChanged();
        } else {
          ruleBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder clearRule() {
        if (ruleBuilder_ == null) {
          rule_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          ruleBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public Builder removeRule(int index) {
        if (ruleBuilder_ == null) {
          ensureRuleIsMutable();
          rule_.remove(index);
          onChanged();
        } else {
          ruleBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public org.nd4j.ir.MapperNamespace.MappingRule.Builder getRuleBuilder(
          int index) {
        return getRuleFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder getRuleOrBuilder(
          int index) {
        if (ruleBuilder_ == null) {
          return rule_.get(index);  } else {
          return ruleBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public java.util.List<? extends org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder> 
           getRuleOrBuilderList() {
        if (ruleBuilder_ != null) {
          return ruleBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rule_);
        }
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public org.nd4j.ir.MapperNamespace.MappingRule.Builder addRuleBuilder() {
        return getRuleFieldBuilder().addBuilder(
            org.nd4j.ir.MapperNamespace.MappingRule.getDefaultInstance());
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public org.nd4j.ir.MapperNamespace.MappingRule.Builder addRuleBuilder(
          int index) {
        return getRuleFieldBuilder().addBuilder(
            index, org.nd4j.ir.MapperNamespace.MappingRule.getDefaultInstance());
      }
      /**
       * <pre>
       *the rules to apply for attributes
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.MappingRule rule = 4;</code>
       */
      public java.util.List<org.nd4j.ir.MapperNamespace.MappingRule.Builder> 
           getRuleBuilderList() {
        return getRuleFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.MapperNamespace.MappingRule, org.nd4j.ir.MapperNamespace.MappingRule.Builder, org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder> 
          getRuleFieldBuilder() {
        if (ruleBuilder_ == null) {
          ruleBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.MapperNamespace.MappingRule, org.nd4j.ir.MapperNamespace.MappingRule.Builder, org.nd4j.ir.MapperNamespace.MappingRuleOrBuilder>(
                  rule_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          rule_ = null;
        }
        return ruleBuilder_;
      }

      private org.nd4j.shade.protobuf.MapField<
          java.lang.Long, java.lang.Long> indexOverrides_;
      private org.nd4j.shade.protobuf.MapField<java.lang.Long, java.lang.Long>
      internalGetIndexOverrides() {
        if (indexOverrides_ == null) {
          return org.nd4j.shade.protobuf.MapField.emptyMapField(
              IndexOverridesDefaultEntryHolder.defaultEntry);
        }
        return indexOverrides_;
      }
      private org.nd4j.shade.protobuf.MapField<java.lang.Long, java.lang.Long>
      internalGetMutableIndexOverrides() {
        onChanged();;
        if (indexOverrides_ == null) {
          indexOverrides_ = org.nd4j.shade.protobuf.MapField.newMapField(
              IndexOverridesDefaultEntryHolder.defaultEntry);
        }
        if (!indexOverrides_.isMutable()) {
          indexOverrides_ = indexOverrides_.copy();
        }
        return indexOverrides_;
      }

      public int getIndexOverridesCount() {
        return internalGetIndexOverrides().getMap().size();
      }
      /**
       * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
       */

      public boolean containsIndexOverrides(
          long key) {
        
        return internalGetIndexOverrides().getMap().containsKey(key);
      }
      /**
       * Use {@link #getIndexOverridesMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, java.lang.Long> getIndexOverrides() {
        return getIndexOverridesMap();
      }
      /**
       * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
       */

      public java.util.Map<java.lang.Long, java.lang.Long> getIndexOverridesMap() {
        return internalGetIndexOverrides().getMap();
      }
      /**
       * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
       */

      public long getIndexOverridesOrDefault(
          long key,
          long defaultValue) {
        
        java.util.Map<java.lang.Long, java.lang.Long> map =
            internalGetIndexOverrides().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
       */

      public long getIndexOverridesOrThrow(
          long key) {
        
        java.util.Map<java.lang.Long, java.lang.Long> map =
            internalGetIndexOverrides().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearIndexOverrides() {
        internalGetMutableIndexOverrides().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
       */

      public Builder removeIndexOverrides(
          long key) {
        
        internalGetMutableIndexOverrides().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, java.lang.Long>
      getMutableIndexOverrides() {
        return internalGetMutableIndexOverrides().getMutableMap();
      }
      /**
       * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
       */
      public Builder putIndexOverrides(
          long key,
          long value) {
        
        
        internalGetMutableIndexOverrides().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;int64, int64&gt; indexOverrides = 5;</code>
       */

      public Builder putAllIndexOverrides(
          java.util.Map<java.lang.Long, java.lang.Long> values) {
        internalGetMutableIndexOverrides().getMutableMap()
            .putAll(values);
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.nd4j.shade.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.MapperDeclaration)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.MapperDeclaration)
    private static final org.nd4j.ir.MapperNamespace.MapperDeclaration DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.MapperNamespace.MapperDeclaration();
    }

    public static org.nd4j.ir.MapperNamespace.MapperDeclaration getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<MapperDeclaration>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<MapperDeclaration>() {
      @java.lang.Override
      public MapperDeclaration parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new MapperDeclaration(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<MapperDeclaration> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<MapperDeclaration> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.MapperNamespace.MapperDeclaration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_MappingRule_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_MappingRule_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_MappingRule_InputToOutputEntry_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_MappingRule_InputToOutputEntry_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_TransformerArgs_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_TransformerArgs_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_MappingDefinitionSet_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_MappingDefinitionSet_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_MapperDeclaration_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_MapperDeclaration_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_MapperDeclaration_IndexOverridesEntry_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_MapperDeclaration_IndexOverridesEntry_fieldAccessorTable;

  public static org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014mapper.proto\022\013org.nd4j.ir\032\010op.proto\"\201\005" +
      "\n\013MappingRule\022\020\n\010ruleName\030\001 \001(\t\022\024\n\014funct" +
      "ionName\030\002 \001(\t\022\033\n\023inputStringAttrName\030\003 \003" +
      "(\t\022\034\n\024outputStringAttrName\030\004 \003(\t\022\024\n\014inpu" +
      "tIntName\030\005 \003(\t\022\025\n\routputIntName\030\006 \003(\t\022\026\n" +
      "\016inputFloatName\030\007 \003(\t\022\027\n\017outputFloatName" +
      "\030\010 \003(\t\022\027\n\017inputDoubleName\030\t \003(\t\022\030\n\020outpu" +
      "tDoubleName\030\n \003(\t\022\030\n\020inputBooleanName\030\013 " +
      "\003(\t\022\031\n\021outputBooleanName\030\014 \003(\t\022\027\n\017inputT" +
      "ensorName\030\r \003(\t\022\030\n\020outputTensorName\030\016 \003(" +
      "\t\022\031\n\021inputDataTypeName\030\017 \003(\t\022\032\n\022outputDa" +
      "taTypeName\030\020 \003(\t\022B\n\rinputToOutput\030\021 \003(\0132" +
      "+.org.nd4j.ir.MappingRule.InputToOutputE" +
      "ntry\022\020\n\010ruleType\030\022 \001(\t\0225\n\017transformerArg" +
      "s\030\023 \003(\0132\034.org.nd4j.ir.TransformerArgs\022\034\n" +
      "\024inputFrameworkOpName\030\024 \001(\t\0324\n\022InputToOu" +
      "tputEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001\"S\n\017TransformerArgs\022\013\n\003key\030\001 \001(\t\0223\n\017tra" +
      "nsformerArgs\030\002 \003(\0132\032.org.nd4j.ir.ArgDesc" +
      "riptor\"V\n\024MappingDefinitionSet\0220\n\010mappin" +
      "gs\030\001 \003(\0132\036.org.nd4j.ir.MapperDeclaration" +
      "\022\014\n\004name\030\002 \003(\t\"\203\002\n\021MapperDeclaration\022\025\n\r" +
      "frameworkName\030\001 \001(\t\022\016\n\006opName\030\002 \001(\t\022\034\n\024i" +
      "nputFrameworkOpName\030\003 \001(\t\022&\n\004rule\030\004 \003(\0132" +
      "\030.org.nd4j.ir.MappingRule\022J\n\016indexOverri" +
      "des\030\005 \003(\01322.org.nd4j.ir.MapperDeclaratio" +
      "n.IndexOverridesEntry\0325\n\023IndexOverridesE" +
      "ntry\022\013\n\003key\030\001 \001(\003\022\r\n\005value\030\002 \001(\003:\0028\001*b\n\n" +
      "OpListType\022\010\n\004TARG\020\000\022\010\n\004IARG\020\001\022\010\n\004BARG\020\002" +
      "\022\014\n\010DTYPEARG\020\003\022\014\n\010INPUTARG\020\004\022\r\n\tOUTPUTAR" +
      "G\020\005\022\013\n\007AXISARG\020\006B\021B\017MapperNamespaceb\006pro" +
      "to3"
    };
    descriptor = org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.nd4j.shade.protobuf.Descriptors.FileDescriptor[] {
          org.nd4j.ir.OpNamespace.getDescriptor(),
        });
    internal_static_org_nd4j_ir_MappingRule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_nd4j_ir_MappingRule_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_MappingRule_descriptor,
        new java.lang.String[] { "RuleName", "FunctionName", "InputStringAttrName", "OutputStringAttrName", "InputIntName", "OutputIntName", "InputFloatName", "OutputFloatName", "InputDoubleName", "OutputDoubleName", "InputBooleanName", "OutputBooleanName", "InputTensorName", "OutputTensorName", "InputDataTypeName", "OutputDataTypeName", "InputToOutput", "RuleType", "TransformerArgs", "InputFrameworkOpName", });
    internal_static_org_nd4j_ir_MappingRule_InputToOutputEntry_descriptor =
      internal_static_org_nd4j_ir_MappingRule_descriptor.getNestedTypes().get(0);
    internal_static_org_nd4j_ir_MappingRule_InputToOutputEntry_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_MappingRule_InputToOutputEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_org_nd4j_ir_TransformerArgs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_nd4j_ir_TransformerArgs_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_TransformerArgs_descriptor,
        new java.lang.String[] { "Key", "TransformerArgs", });
    internal_static_org_nd4j_ir_MappingDefinitionSet_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_nd4j_ir_MappingDefinitionSet_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_MappingDefinitionSet_descriptor,
        new java.lang.String[] { "Mappings", "Name", });
    internal_static_org_nd4j_ir_MapperDeclaration_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_nd4j_ir_MapperDeclaration_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_MapperDeclaration_descriptor,
        new java.lang.String[] { "FrameworkName", "OpName", "InputFrameworkOpName", "Rule", "IndexOverrides", });
    internal_static_org_nd4j_ir_MapperDeclaration_IndexOverridesEntry_descriptor =
      internal_static_org_nd4j_ir_MapperDeclaration_descriptor.getNestedTypes().get(0);
    internal_static_org_nd4j_ir_MapperDeclaration_IndexOverridesEntry_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_MapperDeclaration_IndexOverridesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.nd4j.ir.OpNamespace.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
