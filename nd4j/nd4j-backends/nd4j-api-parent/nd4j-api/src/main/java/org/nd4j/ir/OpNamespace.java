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

public final class OpNamespace {
  private OpNamespace() {}
  public static void registerAllExtensions(
      org.nd4j.shade.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.nd4j.shade.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.nd4j.shade.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ArgDescriptorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.ArgDescriptor)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getNameBytes();

    /**
     * <code>float floatValue = 2;</code>
     */
    float getFloatValue();

    /**
     * <code>double doubleValue = 3;</code>
     */
    double getDoubleValue();

    /**
     * <code>int32 int32Value = 4;</code>
     */
    int getInt32Value();

    /**
     * <code>int64 int64Value = 5;</code>
     */
    long getInt64Value();

    /**
     * <code>bool boolValue = 6;</code>
     */
    boolean getBoolValue();

    /**
     * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
     */
    int getDataTypeValueValue();
    /**
     * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
     */
    org.nd4j.ir.TensorNamespace.DataType getDataTypeValue();

    /**
     * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
     */
    boolean hasInputValue();
    /**
     * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorProto getInputValue();
    /**
     * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder getInputValueOrBuilder();

    /**
     * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
     */
    boolean hasOutputValue();
    /**
     * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorProto getOutputValue();
    /**
     * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder getOutputValueOrBuilder();

    /**
     * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
     */
    int getArgTypeValue();
    /**
     * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
     */
    org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType getArgType();

    /**
     * <code>int32 argIndex = 11;</code>
     */
    int getArgIndex();

    /**
     * <code>string stringValue = 12;</code>
     */
    java.lang.String getStringValue();
    /**
     * <code>string stringValue = 12;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getStringValueBytes();

    /**
     * <code>bool argOptional = 13;</code>
     */
    boolean getArgOptional();

    /**
     * <code>bool convertBoolToInt = 14;</code>
     */
    boolean getConvertBoolToInt();

    /**
     * <code>bool isArray = 15;</code>
     */
    boolean getIsArray();
  }
  /**
   * Protobuf type {@code org.nd4j.ir.ArgDescriptor}
   */
  public  static final class ArgDescriptor extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.ArgDescriptor)
      ArgDescriptorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ArgDescriptor.newBuilder() to construct.
    private ArgDescriptor(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ArgDescriptor() {
      name_ = "";
      dataTypeValue_ = 0;
      argType_ = 0;
      stringValue_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ArgDescriptor();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ArgDescriptor(
        org.nd4j.shade.protobuf.CodedInputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              name_ = s;
              break;
            }
            case 21: {

              floatValue_ = input.readFloat();
              break;
            }
            case 25: {

              doubleValue_ = input.readDouble();
              break;
            }
            case 32: {

              int32Value_ = input.readInt32();
              break;
            }
            case 40: {

              int64Value_ = input.readInt64();
              break;
            }
            case 48: {

              boolValue_ = input.readBool();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              dataTypeValue_ = rawValue;
              break;
            }
            case 66: {
              org.nd4j.ir.TensorNamespace.TensorProto.Builder subBuilder = null;
              if (inputValue_ != null) {
                subBuilder = inputValue_.toBuilder();
              }
              inputValue_ = input.readMessage(org.nd4j.ir.TensorNamespace.TensorProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inputValue_);
                inputValue_ = subBuilder.buildPartial();
              }

              break;
            }
            case 74: {
              org.nd4j.ir.TensorNamespace.TensorProto.Builder subBuilder = null;
              if (outputValue_ != null) {
                subBuilder = outputValue_.toBuilder();
              }
              outputValue_ = input.readMessage(org.nd4j.ir.TensorNamespace.TensorProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(outputValue_);
                outputValue_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {
              int rawValue = input.readEnum();

              argType_ = rawValue;
              break;
            }
            case 88: {

              argIndex_ = input.readInt32();
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              stringValue_ = s;
              break;
            }
            case 104: {

              argOptional_ = input.readBool();
              break;
            }
            case 112: {

              convertBoolToInt_ = input.readBool();
              break;
            }
            case 120: {

              isArray_ = input.readBool();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_ArgDescriptor_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_ArgDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.OpNamespace.ArgDescriptor.class, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder.class);
    }

    /**
     * Protobuf enum {@code org.nd4j.ir.ArgDescriptor.ArgType}
     */
    public enum ArgType
        implements org.nd4j.shade.protobuf.ProtocolMessageEnum {
      /**
       * <code>FLOAT = 0;</code>
       */
      FLOAT(0),
      /**
       * <code>DOUBLE = 1;</code>
       */
      DOUBLE(1),
      /**
       * <code>INT32 = 2;</code>
       */
      INT32(2),
      /**
       * <code>INT64 = 3;</code>
       */
      INT64(3),
      /**
       * <code>BOOL = 4;</code>
       */
      BOOL(4),
      /**
       * <code>DATA_TYPE = 5;</code>
       */
      DATA_TYPE(5),
      /**
       * <code>INPUT_TENSOR = 6;</code>
       */
      INPUT_TENSOR(6),
      /**
       * <code>OUTPUT_TENSOR = 7;</code>
       */
      OUTPUT_TENSOR(7),
      /**
       * <code>STRING = 8;</code>
       */
      STRING(8),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>FLOAT = 0;</code>
       */
      public static final int FLOAT_VALUE = 0;
      /**
       * <code>DOUBLE = 1;</code>
       */
      public static final int DOUBLE_VALUE = 1;
      /**
       * <code>INT32 = 2;</code>
       */
      public static final int INT32_VALUE = 2;
      /**
       * <code>INT64 = 3;</code>
       */
      public static final int INT64_VALUE = 3;
      /**
       * <code>BOOL = 4;</code>
       */
      public static final int BOOL_VALUE = 4;
      /**
       * <code>DATA_TYPE = 5;</code>
       */
      public static final int DATA_TYPE_VALUE = 5;
      /**
       * <code>INPUT_TENSOR = 6;</code>
       */
      public static final int INPUT_TENSOR_VALUE = 6;
      /**
       * <code>OUTPUT_TENSOR = 7;</code>
       */
      public static final int OUTPUT_TENSOR_VALUE = 7;
      /**
       * <code>STRING = 8;</code>
       */
      public static final int STRING_VALUE = 8;


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
      public static ArgType valueOf(int value) {
        return forNumber(value);
      }

      public static ArgType forNumber(int value) {
        switch (value) {
          case 0: return FLOAT;
          case 1: return DOUBLE;
          case 2: return INT32;
          case 3: return INT64;
          case 4: return BOOL;
          case 5: return DATA_TYPE;
          case 6: return INPUT_TENSOR;
          case 7: return OUTPUT_TENSOR;
          case 8: return STRING;
          default: return null;
        }
      }

      public static org.nd4j.shade.protobuf.Internal.EnumLiteMap<ArgType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.nd4j.shade.protobuf.Internal.EnumLiteMap<
          ArgType> internalValueMap =
            new org.nd4j.shade.protobuf.Internal.EnumLiteMap<ArgType>() {
              public ArgType findValueByNumber(int number) {
                return ArgType.forNumber(number);
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
        return org.nd4j.ir.OpNamespace.ArgDescriptor.getDescriptor().getEnumTypes().get(0);
      }

      private static final ArgType[] VALUES = values();

      public static ArgType valueOf(
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

      private ArgType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:org.nd4j.ir.ArgDescriptor.ArgType)
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int FLOATVALUE_FIELD_NUMBER = 2;
    private float floatValue_;
    /**
     * <code>float floatValue = 2;</code>
     */
    public float getFloatValue() {
      return floatValue_;
    }

    public static final int DOUBLEVALUE_FIELD_NUMBER = 3;
    private double doubleValue_;
    /**
     * <code>double doubleValue = 3;</code>
     */
    public double getDoubleValue() {
      return doubleValue_;
    }

    public static final int INT32VALUE_FIELD_NUMBER = 4;
    private int int32Value_;
    /**
     * <code>int32 int32Value = 4;</code>
     */
    public int getInt32Value() {
      return int32Value_;
    }

    public static final int INT64VALUE_FIELD_NUMBER = 5;
    private long int64Value_;
    /**
     * <code>int64 int64Value = 5;</code>
     */
    public long getInt64Value() {
      return int64Value_;
    }

    public static final int BOOLVALUE_FIELD_NUMBER = 6;
    private boolean boolValue_;
    /**
     * <code>bool boolValue = 6;</code>
     */
    public boolean getBoolValue() {
      return boolValue_;
    }

    public static final int DATATYPEVALUE_FIELD_NUMBER = 7;
    private int dataTypeValue_;
    /**
     * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
     */
    public int getDataTypeValueValue() {
      return dataTypeValue_;
    }
    /**
     * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
     */
    public org.nd4j.ir.TensorNamespace.DataType getDataTypeValue() {
      @SuppressWarnings("deprecation")
      org.nd4j.ir.TensorNamespace.DataType result = org.nd4j.ir.TensorNamespace.DataType.valueOf(dataTypeValue_);
      return result == null ? org.nd4j.ir.TensorNamespace.DataType.UNRECOGNIZED : result;
    }

    public static final int INPUTVALUE_FIELD_NUMBER = 8;
    private org.nd4j.ir.TensorNamespace.TensorProto inputValue_;
    /**
     * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
     */
    public boolean hasInputValue() {
      return inputValue_ != null;
    }
    /**
     * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorProto getInputValue() {
      return inputValue_ == null ? org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance() : inputValue_;
    }
    /**
     * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder getInputValueOrBuilder() {
      return getInputValue();
    }

    public static final int OUTPUTVALUE_FIELD_NUMBER = 9;
    private org.nd4j.ir.TensorNamespace.TensorProto outputValue_;
    /**
     * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
     */
    public boolean hasOutputValue() {
      return outputValue_ != null;
    }
    /**
     * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorProto getOutputValue() {
      return outputValue_ == null ? org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance() : outputValue_;
    }
    /**
     * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder getOutputValueOrBuilder() {
      return getOutputValue();
    }

    public static final int ARGTYPE_FIELD_NUMBER = 10;
    private int argType_;
    /**
     * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
     */
    public int getArgTypeValue() {
      return argType_;
    }
    /**
     * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
     */
    public org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType getArgType() {
      @SuppressWarnings("deprecation")
      org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType result = org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType.valueOf(argType_);
      return result == null ? org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType.UNRECOGNIZED : result;
    }

    public static final int ARGINDEX_FIELD_NUMBER = 11;
    private int argIndex_;
    /**
     * <code>int32 argIndex = 11;</code>
     */
    public int getArgIndex() {
      return argIndex_;
    }

    public static final int STRINGVALUE_FIELD_NUMBER = 12;
    private volatile java.lang.Object stringValue_;
    /**
     * <code>string stringValue = 12;</code>
     */
    public java.lang.String getStringValue() {
      java.lang.Object ref = stringValue_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stringValue_ = s;
        return s;
      }
    }
    /**
     * <code>string stringValue = 12;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = stringValue_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringValue_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int ARGOPTIONAL_FIELD_NUMBER = 13;
    private boolean argOptional_;
    /**
     * <code>bool argOptional = 13;</code>
     */
    public boolean getArgOptional() {
      return argOptional_;
    }

    public static final int CONVERTBOOLTOINT_FIELD_NUMBER = 14;
    private boolean convertBoolToInt_;
    /**
     * <code>bool convertBoolToInt = 14;</code>
     */
    public boolean getConvertBoolToInt() {
      return convertBoolToInt_;
    }

    public static final int ISARRAY_FIELD_NUMBER = 15;
    private boolean isArray_;
    /**
     * <code>bool isArray = 15;</code>
     */
    public boolean getIsArray() {
      return isArray_;
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
      if (!getNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (floatValue_ != 0F) {
        output.writeFloat(2, floatValue_);
      }
      if (doubleValue_ != 0D) {
        output.writeDouble(3, doubleValue_);
      }
      if (int32Value_ != 0) {
        output.writeInt32(4, int32Value_);
      }
      if (int64Value_ != 0L) {
        output.writeInt64(5, int64Value_);
      }
      if (boolValue_ != false) {
        output.writeBool(6, boolValue_);
      }
      if (dataTypeValue_ != org.nd4j.ir.TensorNamespace.DataType.UNDEFINED.getNumber()) {
        output.writeEnum(7, dataTypeValue_);
      }
      if (inputValue_ != null) {
        output.writeMessage(8, getInputValue());
      }
      if (outputValue_ != null) {
        output.writeMessage(9, getOutputValue());
      }
      if (argType_ != org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType.FLOAT.getNumber()) {
        output.writeEnum(10, argType_);
      }
      if (argIndex_ != 0) {
        output.writeInt32(11, argIndex_);
      }
      if (!getStringValueBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 12, stringValue_);
      }
      if (argOptional_ != false) {
        output.writeBool(13, argOptional_);
      }
      if (convertBoolToInt_ != false) {
        output.writeBool(14, convertBoolToInt_);
      }
      if (isArray_ != false) {
        output.writeBool(15, isArray_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (floatValue_ != 0F) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeFloatSize(2, floatValue_);
      }
      if (doubleValue_ != 0D) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeDoubleSize(3, doubleValue_);
      }
      if (int32Value_ != 0) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeInt32Size(4, int32Value_);
      }
      if (int64Value_ != 0L) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeInt64Size(5, int64Value_);
      }
      if (boolValue_ != false) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeBoolSize(6, boolValue_);
      }
      if (dataTypeValue_ != org.nd4j.ir.TensorNamespace.DataType.UNDEFINED.getNumber()) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeEnumSize(7, dataTypeValue_);
      }
      if (inputValue_ != null) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(8, getInputValue());
      }
      if (outputValue_ != null) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(9, getOutputValue());
      }
      if (argType_ != org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType.FLOAT.getNumber()) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeEnumSize(10, argType_);
      }
      if (argIndex_ != 0) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeInt32Size(11, argIndex_);
      }
      if (!getStringValueBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(12, stringValue_);
      }
      if (argOptional_ != false) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeBoolSize(13, argOptional_);
      }
      if (convertBoolToInt_ != false) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeBoolSize(14, convertBoolToInt_);
      }
      if (isArray_ != false) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeBoolSize(15, isArray_);
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
      if (!(obj instanceof org.nd4j.ir.OpNamespace.ArgDescriptor)) {
        return super.equals(obj);
      }
      org.nd4j.ir.OpNamespace.ArgDescriptor other = (org.nd4j.ir.OpNamespace.ArgDescriptor) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (java.lang.Float.floatToIntBits(getFloatValue())
          != java.lang.Float.floatToIntBits(
              other.getFloatValue())) return false;
      if (java.lang.Double.doubleToLongBits(getDoubleValue())
          != java.lang.Double.doubleToLongBits(
              other.getDoubleValue())) return false;
      if (getInt32Value()
          != other.getInt32Value()) return false;
      if (getInt64Value()
          != other.getInt64Value()) return false;
      if (getBoolValue()
          != other.getBoolValue()) return false;
      if (dataTypeValue_ != other.dataTypeValue_) return false;
      if (hasInputValue() != other.hasInputValue()) return false;
      if (hasInputValue()) {
        if (!getInputValue()
            .equals(other.getInputValue())) return false;
      }
      if (hasOutputValue() != other.hasOutputValue()) return false;
      if (hasOutputValue()) {
        if (!getOutputValue()
            .equals(other.getOutputValue())) return false;
      }
      if (argType_ != other.argType_) return false;
      if (getArgIndex()
          != other.getArgIndex()) return false;
      if (!getStringValue()
          .equals(other.getStringValue())) return false;
      if (getArgOptional()
          != other.getArgOptional()) return false;
      if (getConvertBoolToInt()
          != other.getConvertBoolToInt()) return false;
      if (getIsArray()
          != other.getIsArray()) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + FLOATVALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFloatValue());
      hash = (37 * hash) + DOUBLEVALUE_FIELD_NUMBER;
      hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getDoubleValue()));
      hash = (37 * hash) + INT32VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getInt32Value();
      hash = (37 * hash) + INT64VALUE_FIELD_NUMBER;
      hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashLong(
          getInt64Value());
      hash = (37 * hash) + BOOLVALUE_FIELD_NUMBER;
      hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashBoolean(
          getBoolValue());
      hash = (37 * hash) + DATATYPEVALUE_FIELD_NUMBER;
      hash = (53 * hash) + dataTypeValue_;
      if (hasInputValue()) {
        hash = (37 * hash) + INPUTVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getInputValue().hashCode();
      }
      if (hasOutputValue()) {
        hash = (37 * hash) + OUTPUTVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getOutputValue().hashCode();
      }
      hash = (37 * hash) + ARGTYPE_FIELD_NUMBER;
      hash = (53 * hash) + argType_;
      hash = (37 * hash) + ARGINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getArgIndex();
      hash = (37 * hash) + STRINGVALUE_FIELD_NUMBER;
      hash = (53 * hash) + getStringValue().hashCode();
      hash = (37 * hash) + ARGOPTIONAL_FIELD_NUMBER;
      hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashBoolean(
          getArgOptional());
      hash = (37 * hash) + CONVERTBOOLTOINT_FIELD_NUMBER;
      hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashBoolean(
          getConvertBoolToInt());
      hash = (37 * hash) + ISARRAY_FIELD_NUMBER;
      hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashBoolean(
          getIsArray());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.ArgDescriptor parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.OpNamespace.ArgDescriptor prototype) {
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
     * Protobuf type {@code org.nd4j.ir.ArgDescriptor}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.ArgDescriptor)
        org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_ArgDescriptor_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_ArgDescriptor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.OpNamespace.ArgDescriptor.class, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder.class);
      }

      // Construct using org.nd4j.ir.OpNamespace.ArgDescriptor.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        floatValue_ = 0F;

        doubleValue_ = 0D;

        int32Value_ = 0;

        int64Value_ = 0L;

        boolValue_ = false;

        dataTypeValue_ = 0;

        if (inputValueBuilder_ == null) {
          inputValue_ = null;
        } else {
          inputValue_ = null;
          inputValueBuilder_ = null;
        }
        if (outputValueBuilder_ == null) {
          outputValue_ = null;
        } else {
          outputValue_ = null;
          outputValueBuilder_ = null;
        }
        argType_ = 0;

        argIndex_ = 0;

        stringValue_ = "";

        argOptional_ = false;

        convertBoolToInt_ = false;

        isArray_ = false;

        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_ArgDescriptor_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.ArgDescriptor getDefaultInstanceForType() {
        return org.nd4j.ir.OpNamespace.ArgDescriptor.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.ArgDescriptor build() {
        org.nd4j.ir.OpNamespace.ArgDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.ArgDescriptor buildPartial() {
        org.nd4j.ir.OpNamespace.ArgDescriptor result = new org.nd4j.ir.OpNamespace.ArgDescriptor(this);
        result.name_ = name_;
        result.floatValue_ = floatValue_;
        result.doubleValue_ = doubleValue_;
        result.int32Value_ = int32Value_;
        result.int64Value_ = int64Value_;
        result.boolValue_ = boolValue_;
        result.dataTypeValue_ = dataTypeValue_;
        if (inputValueBuilder_ == null) {
          result.inputValue_ = inputValue_;
        } else {
          result.inputValue_ = inputValueBuilder_.build();
        }
        if (outputValueBuilder_ == null) {
          result.outputValue_ = outputValue_;
        } else {
          result.outputValue_ = outputValueBuilder_.build();
        }
        result.argType_ = argType_;
        result.argIndex_ = argIndex_;
        result.stringValue_ = stringValue_;
        result.argOptional_ = argOptional_;
        result.convertBoolToInt_ = convertBoolToInt_;
        result.isArray_ = isArray_;
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
        if (other instanceof org.nd4j.ir.OpNamespace.ArgDescriptor) {
          return mergeFrom((org.nd4j.ir.OpNamespace.ArgDescriptor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.OpNamespace.ArgDescriptor other) {
        if (other == org.nd4j.ir.OpNamespace.ArgDescriptor.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getFloatValue() != 0F) {
          setFloatValue(other.getFloatValue());
        }
        if (other.getDoubleValue() != 0D) {
          setDoubleValue(other.getDoubleValue());
        }
        if (other.getInt32Value() != 0) {
          setInt32Value(other.getInt32Value());
        }
        if (other.getInt64Value() != 0L) {
          setInt64Value(other.getInt64Value());
        }
        if (other.getBoolValue() != false) {
          setBoolValue(other.getBoolValue());
        }
        if (other.dataTypeValue_ != 0) {
          setDataTypeValueValue(other.getDataTypeValueValue());
        }
        if (other.hasInputValue()) {
          mergeInputValue(other.getInputValue());
        }
        if (other.hasOutputValue()) {
          mergeOutputValue(other.getOutputValue());
        }
        if (other.argType_ != 0) {
          setArgTypeValue(other.getArgTypeValue());
        }
        if (other.getArgIndex() != 0) {
          setArgIndex(other.getArgIndex());
        }
        if (!other.getStringValue().isEmpty()) {
          stringValue_ = other.stringValue_;
          onChanged();
        }
        if (other.getArgOptional() != false) {
          setArgOptional(other.getArgOptional());
        }
        if (other.getConvertBoolToInt() != false) {
          setConvertBoolToInt(other.getConvertBoolToInt());
        }
        if (other.getIsArray() != false) {
          setIsArray(other.getIsArray());
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
        org.nd4j.ir.OpNamespace.ArgDescriptor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.OpNamespace.ArgDescriptor) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private float floatValue_ ;
      /**
       * <code>float floatValue = 2;</code>
       */
      public float getFloatValue() {
        return floatValue_;
      }
      /**
       * <code>float floatValue = 2;</code>
       */
      public Builder setFloatValue(float value) {
        
        floatValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float floatValue = 2;</code>
       */
      public Builder clearFloatValue() {
        
        floatValue_ = 0F;
        onChanged();
        return this;
      }

      private double doubleValue_ ;
      /**
       * <code>double doubleValue = 3;</code>
       */
      public double getDoubleValue() {
        return doubleValue_;
      }
      /**
       * <code>double doubleValue = 3;</code>
       */
      public Builder setDoubleValue(double value) {
        
        doubleValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double doubleValue = 3;</code>
       */
      public Builder clearDoubleValue() {
        
        doubleValue_ = 0D;
        onChanged();
        return this;
      }

      private int int32Value_ ;
      /**
       * <code>int32 int32Value = 4;</code>
       */
      public int getInt32Value() {
        return int32Value_;
      }
      /**
       * <code>int32 int32Value = 4;</code>
       */
      public Builder setInt32Value(int value) {
        
        int32Value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 int32Value = 4;</code>
       */
      public Builder clearInt32Value() {
        
        int32Value_ = 0;
        onChanged();
        return this;
      }

      private long int64Value_ ;
      /**
       * <code>int64 int64Value = 5;</code>
       */
      public long getInt64Value() {
        return int64Value_;
      }
      /**
       * <code>int64 int64Value = 5;</code>
       */
      public Builder setInt64Value(long value) {
        
        int64Value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 int64Value = 5;</code>
       */
      public Builder clearInt64Value() {
        
        int64Value_ = 0L;
        onChanged();
        return this;
      }

      private boolean boolValue_ ;
      /**
       * <code>bool boolValue = 6;</code>
       */
      public boolean getBoolValue() {
        return boolValue_;
      }
      /**
       * <code>bool boolValue = 6;</code>
       */
      public Builder setBoolValue(boolean value) {
        
        boolValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool boolValue = 6;</code>
       */
      public Builder clearBoolValue() {
        
        boolValue_ = false;
        onChanged();
        return this;
      }

      private int dataTypeValue_ = 0;
      /**
       * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
       */
      public int getDataTypeValueValue() {
        return dataTypeValue_;
      }
      /**
       * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
       */
      public Builder setDataTypeValueValue(int value) {
        dataTypeValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
       */
      public org.nd4j.ir.TensorNamespace.DataType getDataTypeValue() {
        @SuppressWarnings("deprecation")
        org.nd4j.ir.TensorNamespace.DataType result = org.nd4j.ir.TensorNamespace.DataType.valueOf(dataTypeValue_);
        return result == null ? org.nd4j.ir.TensorNamespace.DataType.UNRECOGNIZED : result;
      }
      /**
       * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
       */
      public Builder setDataTypeValue(org.nd4j.ir.TensorNamespace.DataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dataTypeValue_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.org.nd4j.ir.DataType dataTypeValue = 7;</code>
       */
      public Builder clearDataTypeValue() {
        
        dataTypeValue_ = 0;
        onChanged();
        return this;
      }

      private org.nd4j.ir.TensorNamespace.TensorProto inputValue_;
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorProto, org.nd4j.ir.TensorNamespace.TensorProto.Builder, org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder> inputValueBuilder_;
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public boolean hasInputValue() {
        return inputValueBuilder_ != null || inputValue_ != null;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto getInputValue() {
        if (inputValueBuilder_ == null) {
          return inputValue_ == null ? org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance() : inputValue_;
        } else {
          return inputValueBuilder_.getMessage();
        }
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public Builder setInputValue(org.nd4j.ir.TensorNamespace.TensorProto value) {
        if (inputValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          inputValue_ = value;
          onChanged();
        } else {
          inputValueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public Builder setInputValue(
          org.nd4j.ir.TensorNamespace.TensorProto.Builder builderForValue) {
        if (inputValueBuilder_ == null) {
          inputValue_ = builderForValue.build();
          onChanged();
        } else {
          inputValueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public Builder mergeInputValue(org.nd4j.ir.TensorNamespace.TensorProto value) {
        if (inputValueBuilder_ == null) {
          if (inputValue_ != null) {
            inputValue_ =
              org.nd4j.ir.TensorNamespace.TensorProto.newBuilder(inputValue_).mergeFrom(value).buildPartial();
          } else {
            inputValue_ = value;
          }
          onChanged();
        } else {
          inputValueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public Builder clearInputValue() {
        if (inputValueBuilder_ == null) {
          inputValue_ = null;
          onChanged();
        } else {
          inputValue_ = null;
          inputValueBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto.Builder getInputValueBuilder() {
        
        onChanged();
        return getInputValueFieldBuilder().getBuilder();
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder getInputValueOrBuilder() {
        if (inputValueBuilder_ != null) {
          return inputValueBuilder_.getMessageOrBuilder();
        } else {
          return inputValue_ == null ?
              org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance() : inputValue_;
        }
      }
      /**
       * <code>.org.nd4j.ir.TensorProto inputValue = 8;</code>
       */
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorProto, org.nd4j.ir.TensorNamespace.TensorProto.Builder, org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder> 
          getInputValueFieldBuilder() {
        if (inputValueBuilder_ == null) {
          inputValueBuilder_ = new org.nd4j.shade.protobuf.SingleFieldBuilderV3<
              org.nd4j.ir.TensorNamespace.TensorProto, org.nd4j.ir.TensorNamespace.TensorProto.Builder, org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder>(
                  getInputValue(),
                  getParentForChildren(),
                  isClean());
          inputValue_ = null;
        }
        return inputValueBuilder_;
      }

      private org.nd4j.ir.TensorNamespace.TensorProto outputValue_;
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorProto, org.nd4j.ir.TensorNamespace.TensorProto.Builder, org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder> outputValueBuilder_;
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public boolean hasOutputValue() {
        return outputValueBuilder_ != null || outputValue_ != null;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto getOutputValue() {
        if (outputValueBuilder_ == null) {
          return outputValue_ == null ? org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance() : outputValue_;
        } else {
          return outputValueBuilder_.getMessage();
        }
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public Builder setOutputValue(org.nd4j.ir.TensorNamespace.TensorProto value) {
        if (outputValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          outputValue_ = value;
          onChanged();
        } else {
          outputValueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public Builder setOutputValue(
          org.nd4j.ir.TensorNamespace.TensorProto.Builder builderForValue) {
        if (outputValueBuilder_ == null) {
          outputValue_ = builderForValue.build();
          onChanged();
        } else {
          outputValueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public Builder mergeOutputValue(org.nd4j.ir.TensorNamespace.TensorProto value) {
        if (outputValueBuilder_ == null) {
          if (outputValue_ != null) {
            outputValue_ =
              org.nd4j.ir.TensorNamespace.TensorProto.newBuilder(outputValue_).mergeFrom(value).buildPartial();
          } else {
            outputValue_ = value;
          }
          onChanged();
        } else {
          outputValueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public Builder clearOutputValue() {
        if (outputValueBuilder_ == null) {
          outputValue_ = null;
          onChanged();
        } else {
          outputValue_ = null;
          outputValueBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto.Builder getOutputValueBuilder() {
        
        onChanged();
        return getOutputValueFieldBuilder().getBuilder();
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder getOutputValueOrBuilder() {
        if (outputValueBuilder_ != null) {
          return outputValueBuilder_.getMessageOrBuilder();
        } else {
          return outputValue_ == null ?
              org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance() : outputValue_;
        }
      }
      /**
       * <code>.org.nd4j.ir.TensorProto outputValue = 9;</code>
       */
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorProto, org.nd4j.ir.TensorNamespace.TensorProto.Builder, org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder> 
          getOutputValueFieldBuilder() {
        if (outputValueBuilder_ == null) {
          outputValueBuilder_ = new org.nd4j.shade.protobuf.SingleFieldBuilderV3<
              org.nd4j.ir.TensorNamespace.TensorProto, org.nd4j.ir.TensorNamespace.TensorProto.Builder, org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder>(
                  getOutputValue(),
                  getParentForChildren(),
                  isClean());
          outputValue_ = null;
        }
        return outputValueBuilder_;
      }

      private int argType_ = 0;
      /**
       * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
       */
      public int getArgTypeValue() {
        return argType_;
      }
      /**
       * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
       */
      public Builder setArgTypeValue(int value) {
        argType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType getArgType() {
        @SuppressWarnings("deprecation")
        org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType result = org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType.valueOf(argType_);
        return result == null ? org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType.UNRECOGNIZED : result;
      }
      /**
       * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
       */
      public Builder setArgType(org.nd4j.ir.OpNamespace.ArgDescriptor.ArgType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        argType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.org.nd4j.ir.ArgDescriptor.ArgType argType = 10;</code>
       */
      public Builder clearArgType() {
        
        argType_ = 0;
        onChanged();
        return this;
      }

      private int argIndex_ ;
      /**
       * <code>int32 argIndex = 11;</code>
       */
      public int getArgIndex() {
        return argIndex_;
      }
      /**
       * <code>int32 argIndex = 11;</code>
       */
      public Builder setArgIndex(int value) {
        
        argIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 argIndex = 11;</code>
       */
      public Builder clearArgIndex() {
        
        argIndex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object stringValue_ = "";
      /**
       * <code>string stringValue = 12;</code>
       */
      public java.lang.String getStringValue() {
        java.lang.Object ref = stringValue_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          stringValue_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string stringValue = 12;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getStringValueBytes() {
        java.lang.Object ref = stringValue_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          stringValue_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string stringValue = 12;</code>
       */
      public Builder setStringValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        stringValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string stringValue = 12;</code>
       */
      public Builder clearStringValue() {
        
        stringValue_ = getDefaultInstance().getStringValue();
        onChanged();
        return this;
      }
      /**
       * <code>string stringValue = 12;</code>
       */
      public Builder setStringValueBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        stringValue_ = value;
        onChanged();
        return this;
      }

      private boolean argOptional_ ;
      /**
       * <code>bool argOptional = 13;</code>
       */
      public boolean getArgOptional() {
        return argOptional_;
      }
      /**
       * <code>bool argOptional = 13;</code>
       */
      public Builder setArgOptional(boolean value) {
        
        argOptional_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool argOptional = 13;</code>
       */
      public Builder clearArgOptional() {
        
        argOptional_ = false;
        onChanged();
        return this;
      }

      private boolean convertBoolToInt_ ;
      /**
       * <code>bool convertBoolToInt = 14;</code>
       */
      public boolean getConvertBoolToInt() {
        return convertBoolToInt_;
      }
      /**
       * <code>bool convertBoolToInt = 14;</code>
       */
      public Builder setConvertBoolToInt(boolean value) {
        
        convertBoolToInt_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool convertBoolToInt = 14;</code>
       */
      public Builder clearConvertBoolToInt() {
        
        convertBoolToInt_ = false;
        onChanged();
        return this;
      }

      private boolean isArray_ ;
      /**
       * <code>bool isArray = 15;</code>
       */
      public boolean getIsArray() {
        return isArray_;
      }
      /**
       * <code>bool isArray = 15;</code>
       */
      public Builder setIsArray(boolean value) {
        
        isArray_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isArray = 15;</code>
       */
      public Builder clearIsArray() {
        
        isArray_ = false;
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.ArgDescriptor)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.ArgDescriptor)
    private static final org.nd4j.ir.OpNamespace.ArgDescriptor DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.OpNamespace.ArgDescriptor();
    }

    public static org.nd4j.ir.OpNamespace.ArgDescriptor getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<ArgDescriptor>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<ArgDescriptor>() {
      @java.lang.Override
      public ArgDescriptor parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new ArgDescriptor(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<ArgDescriptor> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<ArgDescriptor> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.OpNamespace.ArgDescriptor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface OpDescriptorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.OpDescriptor)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getNameBytes();

    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> 
        getArgDescriptorList();
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    org.nd4j.ir.OpNamespace.ArgDescriptor getArgDescriptor(int index);
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    int getArgDescriptorCount();
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    java.util.List<? extends org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
        getArgDescriptorOrBuilderList();
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder getArgDescriptorOrBuilder(
        int index);

    /**
     * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
     */
    int getOpDeclarationTypeValue();
    /**
     * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
     */
    org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType getOpDeclarationType();
  }
  /**
   * <pre>
   *Op descriptor
   * </pre>
   *
   * Protobuf type {@code org.nd4j.ir.OpDescriptor}
   */
  public  static final class OpDescriptor extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.OpDescriptor)
      OpDescriptorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpDescriptor.newBuilder() to construct.
    private OpDescriptor(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpDescriptor() {
      name_ = "";
      argDescriptor_ = java.util.Collections.emptyList();
      opDeclarationType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpDescriptor();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpDescriptor(
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

              name_ = s;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                argDescriptor_ = new java.util.ArrayList<org.nd4j.ir.OpNamespace.ArgDescriptor>();
                mutable_bitField0_ |= 0x00000001;
              }
              argDescriptor_.add(
                  input.readMessage(org.nd4j.ir.OpNamespace.ArgDescriptor.parser(), extensionRegistry));
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              opDeclarationType_ = rawValue;
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
          argDescriptor_ = java.util.Collections.unmodifiableList(argDescriptor_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptor_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.OpNamespace.OpDescriptor.class, org.nd4j.ir.OpNamespace.OpDescriptor.Builder.class);
    }

    /**
     * Protobuf enum {@code org.nd4j.ir.OpDescriptor.OpDeclarationType}
     */
    public enum OpDeclarationType
        implements org.nd4j.shade.protobuf.ProtocolMessageEnum {
      /**
       * <code>CUSTOM_OP_IMPL = 0;</code>
       */
      CUSTOM_OP_IMPL(0),
      /**
       * <code>BOOLEAN_OP_IMPL = 1;</code>
       */
      BOOLEAN_OP_IMPL(1),
      /**
       * <code>LIST_OP_IMPL = 2;</code>
       */
      LIST_OP_IMPL(2),
      /**
       * <code>LOGIC_OP_IMPL = 3;</code>
       */
      LOGIC_OP_IMPL(3),
      /**
       * <code>OP_IMPL = 4;</code>
       */
      OP_IMPL(4),
      /**
       * <code>DIVERGENT_OP_IMPL = 6;</code>
       */
      DIVERGENT_OP_IMPL(6),
      /**
       * <code>CONFIGURABLE_OP_IMPL = 7;</code>
       */
      CONFIGURABLE_OP_IMPL(7),
      /**
       * <code>REDUCTION_OP_IMPL = 8;</code>
       */
      REDUCTION_OP_IMPL(8),
      /**
       * <code>BROADCASTABLE_OP_IMPL = 9;</code>
       */
      BROADCASTABLE_OP_IMPL(9),
      /**
       * <code>BROADCASTABLE_BOOL_OP_IMPL = 10;</code>
       */
      BROADCASTABLE_BOOL_OP_IMPL(10),
      /**
       * <code>LEGACY_XYZ = 11;</code>
       */
      LEGACY_XYZ(11),
      /**
       * <code>PLATFORM_IMPL = 12;</code>
       */
      PLATFORM_IMPL(12),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>CUSTOM_OP_IMPL = 0;</code>
       */
      public static final int CUSTOM_OP_IMPL_VALUE = 0;
      /**
       * <code>BOOLEAN_OP_IMPL = 1;</code>
       */
      public static final int BOOLEAN_OP_IMPL_VALUE = 1;
      /**
       * <code>LIST_OP_IMPL = 2;</code>
       */
      public static final int LIST_OP_IMPL_VALUE = 2;
      /**
       * <code>LOGIC_OP_IMPL = 3;</code>
       */
      public static final int LOGIC_OP_IMPL_VALUE = 3;
      /**
       * <code>OP_IMPL = 4;</code>
       */
      public static final int OP_IMPL_VALUE = 4;
      /**
       * <code>DIVERGENT_OP_IMPL = 6;</code>
       */
      public static final int DIVERGENT_OP_IMPL_VALUE = 6;
      /**
       * <code>CONFIGURABLE_OP_IMPL = 7;</code>
       */
      public static final int CONFIGURABLE_OP_IMPL_VALUE = 7;
      /**
       * <code>REDUCTION_OP_IMPL = 8;</code>
       */
      public static final int REDUCTION_OP_IMPL_VALUE = 8;
      /**
       * <code>BROADCASTABLE_OP_IMPL = 9;</code>
       */
      public static final int BROADCASTABLE_OP_IMPL_VALUE = 9;
      /**
       * <code>BROADCASTABLE_BOOL_OP_IMPL = 10;</code>
       */
      public static final int BROADCASTABLE_BOOL_OP_IMPL_VALUE = 10;
      /**
       * <code>LEGACY_XYZ = 11;</code>
       */
      public static final int LEGACY_XYZ_VALUE = 11;
      /**
       * <code>PLATFORM_IMPL = 12;</code>
       */
      public static final int PLATFORM_IMPL_VALUE = 12;


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
      public static OpDeclarationType valueOf(int value) {
        return forNumber(value);
      }

      public static OpDeclarationType forNumber(int value) {
        switch (value) {
          case 0: return CUSTOM_OP_IMPL;
          case 1: return BOOLEAN_OP_IMPL;
          case 2: return LIST_OP_IMPL;
          case 3: return LOGIC_OP_IMPL;
          case 4: return OP_IMPL;
          case 6: return DIVERGENT_OP_IMPL;
          case 7: return CONFIGURABLE_OP_IMPL;
          case 8: return REDUCTION_OP_IMPL;
          case 9: return BROADCASTABLE_OP_IMPL;
          case 10: return BROADCASTABLE_BOOL_OP_IMPL;
          case 11: return LEGACY_XYZ;
          case 12: return PLATFORM_IMPL;
          default: return null;
        }
      }

      public static org.nd4j.shade.protobuf.Internal.EnumLiteMap<OpDeclarationType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.nd4j.shade.protobuf.Internal.EnumLiteMap<
          OpDeclarationType> internalValueMap =
            new org.nd4j.shade.protobuf.Internal.EnumLiteMap<OpDeclarationType>() {
              public OpDeclarationType findValueByNumber(int number) {
                return OpDeclarationType.forNumber(number);
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
        return org.nd4j.ir.OpNamespace.OpDescriptor.getDescriptor().getEnumTypes().get(0);
      }

      private static final OpDeclarationType[] VALUES = values();

      public static OpDeclarationType valueOf(
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

      private OpDeclarationType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:org.nd4j.ir.OpDescriptor.OpDeclarationType)
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int ARGDESCRIPTOR_FIELD_NUMBER = 2;
    private java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> argDescriptor_;
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    public java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> getArgDescriptorList() {
      return argDescriptor_;
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    public java.util.List<? extends org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
        getArgDescriptorOrBuilderList() {
      return argDescriptor_;
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    public int getArgDescriptorCount() {
      return argDescriptor_.size();
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    public org.nd4j.ir.OpNamespace.ArgDescriptor getArgDescriptor(int index) {
      return argDescriptor_.get(index);
    }
    /**
     * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
     */
    public org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder getArgDescriptorOrBuilder(
        int index) {
      return argDescriptor_.get(index);
    }

    public static final int OPDECLARATIONTYPE_FIELD_NUMBER = 3;
    private int opDeclarationType_;
    /**
     * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
     */
    public int getOpDeclarationTypeValue() {
      return opDeclarationType_;
    }
    /**
     * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
     */
    public org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType getOpDeclarationType() {
      @SuppressWarnings("deprecation")
      org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType result = org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType.valueOf(opDeclarationType_);
      return result == null ? org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType.UNRECOGNIZED : result;
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
      if (!getNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      for (int i = 0; i < argDescriptor_.size(); i++) {
        output.writeMessage(2, argDescriptor_.get(i));
      }
      if (opDeclarationType_ != org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType.CUSTOM_OP_IMPL.getNumber()) {
        output.writeEnum(3, opDeclarationType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      for (int i = 0; i < argDescriptor_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(2, argDescriptor_.get(i));
      }
      if (opDeclarationType_ != org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType.CUSTOM_OP_IMPL.getNumber()) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeEnumSize(3, opDeclarationType_);
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
      if (!(obj instanceof org.nd4j.ir.OpNamespace.OpDescriptor)) {
        return super.equals(obj);
      }
      org.nd4j.ir.OpNamespace.OpDescriptor other = (org.nd4j.ir.OpNamespace.OpDescriptor) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getArgDescriptorList()
          .equals(other.getArgDescriptorList())) return false;
      if (opDeclarationType_ != other.opDeclarationType_) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      if (getArgDescriptorCount() > 0) {
        hash = (37 * hash) + ARGDESCRIPTOR_FIELD_NUMBER;
        hash = (53 * hash) + getArgDescriptorList().hashCode();
      }
      hash = (37 * hash) + OPDECLARATIONTYPE_FIELD_NUMBER;
      hash = (53 * hash) + opDeclarationType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptor parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.OpNamespace.OpDescriptor prototype) {
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
     * <pre>
     *Op descriptor
     * </pre>
     *
     * Protobuf type {@code org.nd4j.ir.OpDescriptor}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.OpDescriptor)
        org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptor_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.OpNamespace.OpDescriptor.class, org.nd4j.ir.OpNamespace.OpDescriptor.Builder.class);
      }

      // Construct using org.nd4j.ir.OpNamespace.OpDescriptor.newBuilder()
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
          getArgDescriptorFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        if (argDescriptorBuilder_ == null) {
          argDescriptor_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          argDescriptorBuilder_.clear();
        }
        opDeclarationType_ = 0;

        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptor_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.OpDescriptor getDefaultInstanceForType() {
        return org.nd4j.ir.OpNamespace.OpDescriptor.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.OpDescriptor build() {
        org.nd4j.ir.OpNamespace.OpDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.OpDescriptor buildPartial() {
        org.nd4j.ir.OpNamespace.OpDescriptor result = new org.nd4j.ir.OpNamespace.OpDescriptor(this);
        int from_bitField0_ = bitField0_;
        result.name_ = name_;
        if (argDescriptorBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            argDescriptor_ = java.util.Collections.unmodifiableList(argDescriptor_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.argDescriptor_ = argDescriptor_;
        } else {
          result.argDescriptor_ = argDescriptorBuilder_.build();
        }
        result.opDeclarationType_ = opDeclarationType_;
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
        if (other instanceof org.nd4j.ir.OpNamespace.OpDescriptor) {
          return mergeFrom((org.nd4j.ir.OpNamespace.OpDescriptor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.OpNamespace.OpDescriptor other) {
        if (other == org.nd4j.ir.OpNamespace.OpDescriptor.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (argDescriptorBuilder_ == null) {
          if (!other.argDescriptor_.isEmpty()) {
            if (argDescriptor_.isEmpty()) {
              argDescriptor_ = other.argDescriptor_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureArgDescriptorIsMutable();
              argDescriptor_.addAll(other.argDescriptor_);
            }
            onChanged();
          }
        } else {
          if (!other.argDescriptor_.isEmpty()) {
            if (argDescriptorBuilder_.isEmpty()) {
              argDescriptorBuilder_.dispose();
              argDescriptorBuilder_ = null;
              argDescriptor_ = other.argDescriptor_;
              bitField0_ = (bitField0_ & ~0x00000001);
              argDescriptorBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getArgDescriptorFieldBuilder() : null;
            } else {
              argDescriptorBuilder_.addAllMessages(other.argDescriptor_);
            }
          }
        }
        if (other.opDeclarationType_ != 0) {
          setOpDeclarationTypeValue(other.getOpDeclarationTypeValue());
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
        org.nd4j.ir.OpNamespace.OpDescriptor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.OpNamespace.OpDescriptor) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> argDescriptor_ =
        java.util.Collections.emptyList();
      private void ensureArgDescriptorIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          argDescriptor_ = new java.util.ArrayList<org.nd4j.ir.OpNamespace.ArgDescriptor>(argDescriptor_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.OpNamespace.ArgDescriptor, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder, org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> argDescriptorBuilder_;

      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor> getArgDescriptorList() {
        if (argDescriptorBuilder_ == null) {
          return java.util.Collections.unmodifiableList(argDescriptor_);
        } else {
          return argDescriptorBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public int getArgDescriptorCount() {
        if (argDescriptorBuilder_ == null) {
          return argDescriptor_.size();
        } else {
          return argDescriptorBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor getArgDescriptor(int index) {
        if (argDescriptorBuilder_ == null) {
          return argDescriptor_.get(index);
        } else {
          return argDescriptorBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder setArgDescriptor(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor value) {
        if (argDescriptorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgDescriptorIsMutable();
          argDescriptor_.set(index, value);
          onChanged();
        } else {
          argDescriptorBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder setArgDescriptor(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder builderForValue) {
        if (argDescriptorBuilder_ == null) {
          ensureArgDescriptorIsMutable();
          argDescriptor_.set(index, builderForValue.build());
          onChanged();
        } else {
          argDescriptorBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder addArgDescriptor(org.nd4j.ir.OpNamespace.ArgDescriptor value) {
        if (argDescriptorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgDescriptorIsMutable();
          argDescriptor_.add(value);
          onChanged();
        } else {
          argDescriptorBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder addArgDescriptor(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor value) {
        if (argDescriptorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureArgDescriptorIsMutable();
          argDescriptor_.add(index, value);
          onChanged();
        } else {
          argDescriptorBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder addArgDescriptor(
          org.nd4j.ir.OpNamespace.ArgDescriptor.Builder builderForValue) {
        if (argDescriptorBuilder_ == null) {
          ensureArgDescriptorIsMutable();
          argDescriptor_.add(builderForValue.build());
          onChanged();
        } else {
          argDescriptorBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder addArgDescriptor(
          int index, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder builderForValue) {
        if (argDescriptorBuilder_ == null) {
          ensureArgDescriptorIsMutable();
          argDescriptor_.add(index, builderForValue.build());
          onChanged();
        } else {
          argDescriptorBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder addAllArgDescriptor(
          java.lang.Iterable<? extends org.nd4j.ir.OpNamespace.ArgDescriptor> values) {
        if (argDescriptorBuilder_ == null) {
          ensureArgDescriptorIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, argDescriptor_);
          onChanged();
        } else {
          argDescriptorBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder clearArgDescriptor() {
        if (argDescriptorBuilder_ == null) {
          argDescriptor_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          argDescriptorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public Builder removeArgDescriptor(int index) {
        if (argDescriptorBuilder_ == null) {
          ensureArgDescriptorIsMutable();
          argDescriptor_.remove(index);
          onChanged();
        } else {
          argDescriptorBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor.Builder getArgDescriptorBuilder(
          int index) {
        return getArgDescriptorFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder getArgDescriptorOrBuilder(
          int index) {
        if (argDescriptorBuilder_ == null) {
          return argDescriptor_.get(index);  } else {
          return argDescriptorBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public java.util.List<? extends org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
           getArgDescriptorOrBuilderList() {
        if (argDescriptorBuilder_ != null) {
          return argDescriptorBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(argDescriptor_);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor.Builder addArgDescriptorBuilder() {
        return getArgDescriptorFieldBuilder().addBuilder(
            org.nd4j.ir.OpNamespace.ArgDescriptor.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public org.nd4j.ir.OpNamespace.ArgDescriptor.Builder addArgDescriptorBuilder(
          int index) {
        return getArgDescriptorFieldBuilder().addBuilder(
            index, org.nd4j.ir.OpNamespace.ArgDescriptor.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.ArgDescriptor argDescriptor = 2;</code>
       */
      public java.util.List<org.nd4j.ir.OpNamespace.ArgDescriptor.Builder> 
           getArgDescriptorBuilderList() {
        return getArgDescriptorFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.OpNamespace.ArgDescriptor, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder, org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder> 
          getArgDescriptorFieldBuilder() {
        if (argDescriptorBuilder_ == null) {
          argDescriptorBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.OpNamespace.ArgDescriptor, org.nd4j.ir.OpNamespace.ArgDescriptor.Builder, org.nd4j.ir.OpNamespace.ArgDescriptorOrBuilder>(
                  argDescriptor_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          argDescriptor_ = null;
        }
        return argDescriptorBuilder_;
      }

      private int opDeclarationType_ = 0;
      /**
       * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
       */
      public int getOpDeclarationTypeValue() {
        return opDeclarationType_;
      }
      /**
       * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
       */
      public Builder setOpDeclarationTypeValue(int value) {
        opDeclarationType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
       */
      public org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType getOpDeclarationType() {
        @SuppressWarnings("deprecation")
        org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType result = org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType.valueOf(opDeclarationType_);
        return result == null ? org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType.UNRECOGNIZED : result;
      }
      /**
       * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
       */
      public Builder setOpDeclarationType(org.nd4j.ir.OpNamespace.OpDescriptor.OpDeclarationType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opDeclarationType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.org.nd4j.ir.OpDescriptor.OpDeclarationType opDeclarationType = 3;</code>
       */
      public Builder clearOpDeclarationType() {
        
        opDeclarationType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.OpDescriptor)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.OpDescriptor)
    private static final org.nd4j.ir.OpNamespace.OpDescriptor DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.OpNamespace.OpDescriptor();
    }

    public static org.nd4j.ir.OpNamespace.OpDescriptor getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<OpDescriptor>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<OpDescriptor>() {
      @java.lang.Override
      public OpDescriptor parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new OpDescriptor(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<OpDescriptor> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<OpDescriptor> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.OpNamespace.OpDescriptor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface OpDescriptorListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.OpDescriptorList)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    java.util.List<org.nd4j.ir.OpNamespace.OpDescriptor> 
        getOpListList();
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    org.nd4j.ir.OpNamespace.OpDescriptor getOpList(int index);
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    int getOpListCount();
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    java.util.List<? extends org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder> 
        getOpListOrBuilderList();
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder getOpListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code org.nd4j.ir.OpDescriptorList}
   */
  public  static final class OpDescriptorList extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.OpDescriptorList)
      OpDescriptorListOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpDescriptorList.newBuilder() to construct.
    private OpDescriptorList(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpDescriptorList() {
      opList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpDescriptorList();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpDescriptorList(
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
                opList_ = new java.util.ArrayList<org.nd4j.ir.OpNamespace.OpDescriptor>();
                mutable_bitField0_ |= 0x00000001;
              }
              opList_.add(
                  input.readMessage(org.nd4j.ir.OpNamespace.OpDescriptor.parser(), extensionRegistry));
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
          opList_ = java.util.Collections.unmodifiableList(opList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptorList_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptorList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.OpNamespace.OpDescriptorList.class, org.nd4j.ir.OpNamespace.OpDescriptorList.Builder.class);
    }

    public static final int OPLIST_FIELD_NUMBER = 1;
    private java.util.List<org.nd4j.ir.OpNamespace.OpDescriptor> opList_;
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    public java.util.List<org.nd4j.ir.OpNamespace.OpDescriptor> getOpListList() {
      return opList_;
    }
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    public java.util.List<? extends org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder> 
        getOpListOrBuilderList() {
      return opList_;
    }
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    public int getOpListCount() {
      return opList_.size();
    }
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    public org.nd4j.ir.OpNamespace.OpDescriptor getOpList(int index) {
      return opList_.get(index);
    }
    /**
     * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
     */
    public org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder getOpListOrBuilder(
        int index) {
      return opList_.get(index);
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
      for (int i = 0; i < opList_.size(); i++) {
        output.writeMessage(1, opList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < opList_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(1, opList_.get(i));
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
      if (!(obj instanceof org.nd4j.ir.OpNamespace.OpDescriptorList)) {
        return super.equals(obj);
      }
      org.nd4j.ir.OpNamespace.OpDescriptorList other = (org.nd4j.ir.OpNamespace.OpDescriptorList) obj;

      if (!getOpListList()
          .equals(other.getOpListList())) return false;
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
      if (getOpListCount() > 0) {
        hash = (37 * hash) + OPLIST_FIELD_NUMBER;
        hash = (53 * hash) + getOpListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.OpNamespace.OpDescriptorList parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.OpNamespace.OpDescriptorList prototype) {
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
     * Protobuf type {@code org.nd4j.ir.OpDescriptorList}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.OpDescriptorList)
        org.nd4j.ir.OpNamespace.OpDescriptorListOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptorList_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptorList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.OpNamespace.OpDescriptorList.class, org.nd4j.ir.OpNamespace.OpDescriptorList.Builder.class);
      }

      // Construct using org.nd4j.ir.OpNamespace.OpDescriptorList.newBuilder()
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
          getOpListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (opListBuilder_ == null) {
          opList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          opListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.OpNamespace.internal_static_org_nd4j_ir_OpDescriptorList_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.OpDescriptorList getDefaultInstanceForType() {
        return org.nd4j.ir.OpNamespace.OpDescriptorList.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.OpDescriptorList build() {
        org.nd4j.ir.OpNamespace.OpDescriptorList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.OpNamespace.OpDescriptorList buildPartial() {
        org.nd4j.ir.OpNamespace.OpDescriptorList result = new org.nd4j.ir.OpNamespace.OpDescriptorList(this);
        int from_bitField0_ = bitField0_;
        if (opListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            opList_ = java.util.Collections.unmodifiableList(opList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.opList_ = opList_;
        } else {
          result.opList_ = opListBuilder_.build();
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
        if (other instanceof org.nd4j.ir.OpNamespace.OpDescriptorList) {
          return mergeFrom((org.nd4j.ir.OpNamespace.OpDescriptorList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.OpNamespace.OpDescriptorList other) {
        if (other == org.nd4j.ir.OpNamespace.OpDescriptorList.getDefaultInstance()) return this;
        if (opListBuilder_ == null) {
          if (!other.opList_.isEmpty()) {
            if (opList_.isEmpty()) {
              opList_ = other.opList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOpListIsMutable();
              opList_.addAll(other.opList_);
            }
            onChanged();
          }
        } else {
          if (!other.opList_.isEmpty()) {
            if (opListBuilder_.isEmpty()) {
              opListBuilder_.dispose();
              opListBuilder_ = null;
              opList_ = other.opList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              opListBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOpListFieldBuilder() : null;
            } else {
              opListBuilder_.addAllMessages(other.opList_);
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
        org.nd4j.ir.OpNamespace.OpDescriptorList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.OpNamespace.OpDescriptorList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.nd4j.ir.OpNamespace.OpDescriptor> opList_ =
        java.util.Collections.emptyList();
      private void ensureOpListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          opList_ = new java.util.ArrayList<org.nd4j.ir.OpNamespace.OpDescriptor>(opList_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.OpNamespace.OpDescriptor, org.nd4j.ir.OpNamespace.OpDescriptor.Builder, org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder> opListBuilder_;

      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public java.util.List<org.nd4j.ir.OpNamespace.OpDescriptor> getOpListList() {
        if (opListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(opList_);
        } else {
          return opListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public int getOpListCount() {
        if (opListBuilder_ == null) {
          return opList_.size();
        } else {
          return opListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public org.nd4j.ir.OpNamespace.OpDescriptor getOpList(int index) {
        if (opListBuilder_ == null) {
          return opList_.get(index);
        } else {
          return opListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder setOpList(
          int index, org.nd4j.ir.OpNamespace.OpDescriptor value) {
        if (opListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpListIsMutable();
          opList_.set(index, value);
          onChanged();
        } else {
          opListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder setOpList(
          int index, org.nd4j.ir.OpNamespace.OpDescriptor.Builder builderForValue) {
        if (opListBuilder_ == null) {
          ensureOpListIsMutable();
          opList_.set(index, builderForValue.build());
          onChanged();
        } else {
          opListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder addOpList(org.nd4j.ir.OpNamespace.OpDescriptor value) {
        if (opListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpListIsMutable();
          opList_.add(value);
          onChanged();
        } else {
          opListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder addOpList(
          int index, org.nd4j.ir.OpNamespace.OpDescriptor value) {
        if (opListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOpListIsMutable();
          opList_.add(index, value);
          onChanged();
        } else {
          opListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder addOpList(
          org.nd4j.ir.OpNamespace.OpDescriptor.Builder builderForValue) {
        if (opListBuilder_ == null) {
          ensureOpListIsMutable();
          opList_.add(builderForValue.build());
          onChanged();
        } else {
          opListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder addOpList(
          int index, org.nd4j.ir.OpNamespace.OpDescriptor.Builder builderForValue) {
        if (opListBuilder_ == null) {
          ensureOpListIsMutable();
          opList_.add(index, builderForValue.build());
          onChanged();
        } else {
          opListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder addAllOpList(
          java.lang.Iterable<? extends org.nd4j.ir.OpNamespace.OpDescriptor> values) {
        if (opListBuilder_ == null) {
          ensureOpListIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, opList_);
          onChanged();
        } else {
          opListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder clearOpList() {
        if (opListBuilder_ == null) {
          opList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          opListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public Builder removeOpList(int index) {
        if (opListBuilder_ == null) {
          ensureOpListIsMutable();
          opList_.remove(index);
          onChanged();
        } else {
          opListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public org.nd4j.ir.OpNamespace.OpDescriptor.Builder getOpListBuilder(
          int index) {
        return getOpListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder getOpListOrBuilder(
          int index) {
        if (opListBuilder_ == null) {
          return opList_.get(index);  } else {
          return opListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public java.util.List<? extends org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder> 
           getOpListOrBuilderList() {
        if (opListBuilder_ != null) {
          return opListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(opList_);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public org.nd4j.ir.OpNamespace.OpDescriptor.Builder addOpListBuilder() {
        return getOpListFieldBuilder().addBuilder(
            org.nd4j.ir.OpNamespace.OpDescriptor.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public org.nd4j.ir.OpNamespace.OpDescriptor.Builder addOpListBuilder(
          int index) {
        return getOpListFieldBuilder().addBuilder(
            index, org.nd4j.ir.OpNamespace.OpDescriptor.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.OpDescriptor opList = 1;</code>
       */
      public java.util.List<org.nd4j.ir.OpNamespace.OpDescriptor.Builder> 
           getOpListBuilderList() {
        return getOpListFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.OpNamespace.OpDescriptor, org.nd4j.ir.OpNamespace.OpDescriptor.Builder, org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder> 
          getOpListFieldBuilder() {
        if (opListBuilder_ == null) {
          opListBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.OpNamespace.OpDescriptor, org.nd4j.ir.OpNamespace.OpDescriptor.Builder, org.nd4j.ir.OpNamespace.OpDescriptorOrBuilder>(
                  opList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          opList_ = null;
        }
        return opListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.OpDescriptorList)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.OpDescriptorList)
    private static final org.nd4j.ir.OpNamespace.OpDescriptorList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.OpNamespace.OpDescriptorList();
    }

    public static org.nd4j.ir.OpNamespace.OpDescriptorList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<OpDescriptorList>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<OpDescriptorList>() {
      @java.lang.Override
      public OpDescriptorList parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new OpDescriptorList(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<OpDescriptorList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<OpDescriptorList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.OpNamespace.OpDescriptorList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_ArgDescriptor_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_ArgDescriptor_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_OpDescriptor_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_OpDescriptor_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_OpDescriptorList_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_OpDescriptorList_fieldAccessorTable;

  public static org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010op.proto\022\013org.nd4j.ir\032\014tensor.proto\"\253\004" +
      "\n\rArgDescriptor\022\014\n\004name\030\001 \001(\t\022\022\n\nfloatVa" +
      "lue\030\002 \001(\002\022\023\n\013doubleValue\030\003 \001(\001\022\022\n\nint32V" +
      "alue\030\004 \001(\005\022\022\n\nint64Value\030\005 \001(\003\022\021\n\tboolVa" +
      "lue\030\006 \001(\010\022,\n\rdataTypeValue\030\007 \001(\0162\025.org.n" +
      "d4j.ir.DataType\022,\n\ninputValue\030\010 \001(\0132\030.or" +
      "g.nd4j.ir.TensorProto\022-\n\013outputValue\030\t \001" +
      "(\0132\030.org.nd4j.ir.TensorProto\0223\n\007argType\030" +
      "\n \001(\0162\".org.nd4j.ir.ArgDescriptor.ArgTyp" +
      "e\022\020\n\010argIndex\030\013 \001(\005\022\023\n\013stringValue\030\014 \001(\t" +
      "\022\023\n\013argOptional\030\r \001(\010\022\030\n\020convertBoolToIn" +
      "t\030\016 \001(\010\022\017\n\007isArray\030\017 \001(\010\"\200\001\n\007ArgType\022\t\n\005" +
      "FLOAT\020\000\022\n\n\006DOUBLE\020\001\022\t\n\005INT32\020\002\022\t\n\005INT64\020" +
      "\003\022\010\n\004BOOL\020\004\022\r\n\tDATA_TYPE\020\005\022\020\n\014INPUT_TENS" +
      "OR\020\006\022\021\n\rOUTPUT_TENSOR\020\007\022\n\n\006STRING\020\010\"\256\003\n\014" +
      "OpDescriptor\022\014\n\004name\030\001 \001(\t\0221\n\rargDescrip" +
      "tor\030\002 \003(\0132\032.org.nd4j.ir.ArgDescriptor\022F\n" +
      "\021opDeclarationType\030\003 \001(\0162+.org.nd4j.ir.O" +
      "pDescriptor.OpDeclarationType\"\224\002\n\021OpDecl" +
      "arationType\022\022\n\016CUSTOM_OP_IMPL\020\000\022\023\n\017BOOLE" +
      "AN_OP_IMPL\020\001\022\020\n\014LIST_OP_IMPL\020\002\022\021\n\rLOGIC_" +
      "OP_IMPL\020\003\022\013\n\007OP_IMPL\020\004\022\025\n\021DIVERGENT_OP_I" +
      "MPL\020\006\022\030\n\024CONFIGURABLE_OP_IMPL\020\007\022\025\n\021REDUC" +
      "TION_OP_IMPL\020\010\022\031\n\025BROADCASTABLE_OP_IMPL\020" +
      "\t\022\036\n\032BROADCASTABLE_BOOL_OP_IMPL\020\n\022\016\n\nLEG" +
      "ACY_XYZ\020\013\022\021\n\rPLATFORM_IMPL\020\014\"=\n\020OpDescri" +
      "ptorList\022)\n\006opList\030\001 \003(\0132\031.org.nd4j.ir.O" +
      "pDescriptorB\rB\013OpNamespaceb\006proto3"
    };
    descriptor = org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.nd4j.shade.protobuf.Descriptors.FileDescriptor[] {
          org.nd4j.ir.TensorNamespace.getDescriptor(),
        });
    internal_static_org_nd4j_ir_ArgDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_nd4j_ir_ArgDescriptor_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_ArgDescriptor_descriptor,
        new java.lang.String[] { "Name", "FloatValue", "DoubleValue", "Int32Value", "Int64Value", "BoolValue", "DataTypeValue", "InputValue", "OutputValue", "ArgType", "ArgIndex", "StringValue", "ArgOptional", "ConvertBoolToInt", "IsArray", });
    internal_static_org_nd4j_ir_OpDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_nd4j_ir_OpDescriptor_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_OpDescriptor_descriptor,
        new java.lang.String[] { "Name", "ArgDescriptor", "OpDeclarationType", });
    internal_static_org_nd4j_ir_OpDescriptorList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_nd4j_ir_OpDescriptorList_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_OpDescriptorList_descriptor,
        new java.lang.String[] { "OpList", });
    org.nd4j.ir.TensorNamespace.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
