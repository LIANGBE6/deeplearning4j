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

public final class TensorNamespace {
  private TensorNamespace() {}
  public static void registerAllExtensions(
      org.nd4j.shade.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.nd4j.shade.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.nd4j.shade.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code org.nd4j.ir.DataType}
   */
  public enum DataType
      implements org.nd4j.shade.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNDEFINED = 0;</code>
     */
    UNDEFINED(0),
    /**
     * <pre>
     * Basic types.
     * </pre>
     *
     * <code>FLOAT = 1;</code>
     */
    FLOAT(1),
    /**
     * <pre>
     * uint8_t
     * </pre>
     *
     * <code>UINT8 = 2;</code>
     */
    UINT8(2),
    /**
     * <pre>
     * int8_t
     * </pre>
     *
     * <code>INT8 = 3;</code>
     */
    INT8(3),
    /**
     * <pre>
     * uint16_t
     * </pre>
     *
     * <code>UINT16 = 4;</code>
     */
    UINT16(4),
    /**
     * <pre>
     * int16_t
     * </pre>
     *
     * <code>INT16 = 5;</code>
     */
    INT16(5),
    /**
     * <pre>
     * int32_t
     * </pre>
     *
     * <code>INT32 = 6;</code>
     */
    INT32(6),
    /**
     * <pre>
     * int64_t
     * </pre>
     *
     * <code>INT64 = 7;</code>
     */
    INT64(7),
    /**
     * <pre>
     * string
     * </pre>
     *
     * <code>STRING = 8;</code>
     */
    STRING(8),
    /**
     * <pre>
     * bool
     * </pre>
     *
     * <code>BOOL = 9;</code>
     */
    BOOL(9),
    /**
     * <pre>
     * IEEE754 half-precision floating-point format (16 bits wide).
     * This format has 1 sign bit, 5 exponent bits, and 10 mantissa bits.
     * </pre>
     *
     * <code>FLOAT16 = 10;</code>
     */
    FLOAT16(10),
    /**
     * <code>DOUBLE = 11;</code>
     */
    DOUBLE(11),
    /**
     * <code>UINT32 = 12;</code>
     */
    UINT32(12),
    /**
     * <code>UINT64 = 13;</code>
     */
    UINT64(13),
    /**
     * <pre>
     * complex with float32 real and imaginary components
     * </pre>
     *
     * <code>COMPLEX64 = 14;</code>
     */
    COMPLEX64(14),
    /**
     * <pre>
     * complex with float64 real and imaginary components
     * </pre>
     *
     * <code>COMPLEX128 = 15;</code>
     */
    COMPLEX128(15),
    /**
     * <pre>
     * Non-IEEE floating-point format based on IEEE754 single-precision
     * floating-point number truncated to 16 bits.
     * This format has 1 sign bit, 8 exponent bits, and 7 mantissa bits.
     * </pre>
     *
     * <code>BFLOAT16 = 16;</code>
     */
    BFLOAT16(16),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNDEFINED = 0;</code>
     */
    public static final int UNDEFINED_VALUE = 0;
    /**
     * <pre>
     * Basic types.
     * </pre>
     *
     * <code>FLOAT = 1;</code>
     */
    public static final int FLOAT_VALUE = 1;
    /**
     * <pre>
     * uint8_t
     * </pre>
     *
     * <code>UINT8 = 2;</code>
     */
    public static final int UINT8_VALUE = 2;
    /**
     * <pre>
     * int8_t
     * </pre>
     *
     * <code>INT8 = 3;</code>
     */
    public static final int INT8_VALUE = 3;
    /**
     * <pre>
     * uint16_t
     * </pre>
     *
     * <code>UINT16 = 4;</code>
     */
    public static final int UINT16_VALUE = 4;
    /**
     * <pre>
     * int16_t
     * </pre>
     *
     * <code>INT16 = 5;</code>
     */
    public static final int INT16_VALUE = 5;
    /**
     * <pre>
     * int32_t
     * </pre>
     *
     * <code>INT32 = 6;</code>
     */
    public static final int INT32_VALUE = 6;
    /**
     * <pre>
     * int64_t
     * </pre>
     *
     * <code>INT64 = 7;</code>
     */
    public static final int INT64_VALUE = 7;
    /**
     * <pre>
     * string
     * </pre>
     *
     * <code>STRING = 8;</code>
     */
    public static final int STRING_VALUE = 8;
    /**
     * <pre>
     * bool
     * </pre>
     *
     * <code>BOOL = 9;</code>
     */
    public static final int BOOL_VALUE = 9;
    /**
     * <pre>
     * IEEE754 half-precision floating-point format (16 bits wide).
     * This format has 1 sign bit, 5 exponent bits, and 10 mantissa bits.
     * </pre>
     *
     * <code>FLOAT16 = 10;</code>
     */
    public static final int FLOAT16_VALUE = 10;
    /**
     * <code>DOUBLE = 11;</code>
     */
    public static final int DOUBLE_VALUE = 11;
    /**
     * <code>UINT32 = 12;</code>
     */
    public static final int UINT32_VALUE = 12;
    /**
     * <code>UINT64 = 13;</code>
     */
    public static final int UINT64_VALUE = 13;
    /**
     * <pre>
     * complex with float32 real and imaginary components
     * </pre>
     *
     * <code>COMPLEX64 = 14;</code>
     */
    public static final int COMPLEX64_VALUE = 14;
    /**
     * <pre>
     * complex with float64 real and imaginary components
     * </pre>
     *
     * <code>COMPLEX128 = 15;</code>
     */
    public static final int COMPLEX128_VALUE = 15;
    /**
     * <pre>
     * Non-IEEE floating-point format based on IEEE754 single-precision
     * floating-point number truncated to 16 bits.
     * This format has 1 sign bit, 8 exponent bits, and 7 mantissa bits.
     * </pre>
     *
     * <code>BFLOAT16 = 16;</code>
     */
    public static final int BFLOAT16_VALUE = 16;


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
    public static DataType valueOf(int value) {
      return forNumber(value);
    }

    public static DataType forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED;
        case 1: return FLOAT;
        case 2: return UINT8;
        case 3: return INT8;
        case 4: return UINT16;
        case 5: return INT16;
        case 6: return INT32;
        case 7: return INT64;
        case 8: return STRING;
        case 9: return BOOL;
        case 10: return FLOAT16;
        case 11: return DOUBLE;
        case 12: return UINT32;
        case 13: return UINT64;
        case 14: return COMPLEX64;
        case 15: return COMPLEX128;
        case 16: return BFLOAT16;
        default: return null;
      }
    }

    public static org.nd4j.shade.protobuf.Internal.EnumLiteMap<DataType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.nd4j.shade.protobuf.Internal.EnumLiteMap<
        DataType> internalValueMap =
          new org.nd4j.shade.protobuf.Internal.EnumLiteMap<DataType>() {
            public DataType findValueByNumber(int number) {
              return DataType.forNumber(number);
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
      return org.nd4j.ir.TensorNamespace.getDescriptor().getEnumTypes().get(0);
    }

    private static final DataType[] VALUES = values();

    public static DataType valueOf(
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

    private DataType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:org.nd4j.ir.DataType)
  }

  public interface StringStringEntryProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.StringStringEntryProto)
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
     * <code>string value = 2;</code>
     */
    java.lang.String getValue();
    /**
     * <code>string value = 2;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getValueBytes();
  }
  /**
   * <pre>
   * StringStringEntryProto follows the pattern for cross-proto-version maps.
   * See https://developers.google.com/protocol-buffers/docs/proto3#maps
   * </pre>
   *
   * Protobuf type {@code org.nd4j.ir.StringStringEntryProto}
   */
  public  static final class StringStringEntryProto extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.StringStringEntryProto)
      StringStringEntryProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StringStringEntryProto.newBuilder() to construct.
    private StringStringEntryProto(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StringStringEntryProto() {
      key_ = "";
      value_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StringStringEntryProto();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StringStringEntryProto(
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

              key_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              value_ = s;
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
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_StringStringEntryProto_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_StringStringEntryProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.TensorNamespace.StringStringEntryProto.class, org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder.class);
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

    public static final int VALUE_FIELD_NUMBER = 2;
    private volatile java.lang.Object value_;
    /**
     * <code>string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 2;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
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
      if (!getKeyBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
      }
      if (!getValueBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
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
      if (!getValueBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
      if (!(obj instanceof org.nd4j.ir.TensorNamespace.StringStringEntryProto)) {
        return super.equals(obj);
      }
      org.nd4j.ir.TensorNamespace.StringStringEntryProto other = (org.nd4j.ir.TensorNamespace.StringStringEntryProto) obj;

      if (!getKey()
          .equals(other.getKey())) return false;
      if (!getValue()
          .equals(other.getValue())) return false;
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
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.TensorNamespace.StringStringEntryProto prototype) {
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
     * StringStringEntryProto follows the pattern for cross-proto-version maps.
     * See https://developers.google.com/protocol-buffers/docs/proto3#maps
     * </pre>
     *
     * Protobuf type {@code org.nd4j.ir.StringStringEntryProto}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.StringStringEntryProto)
        org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_StringStringEntryProto_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_StringStringEntryProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.StringStringEntryProto.class, org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder.class);
      }

      // Construct using org.nd4j.ir.TensorNamespace.StringStringEntryProto.newBuilder()
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
        key_ = "";

        value_ = "";

        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_StringStringEntryProto_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.StringStringEntryProto getDefaultInstanceForType() {
        return org.nd4j.ir.TensorNamespace.StringStringEntryProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.StringStringEntryProto build() {
        org.nd4j.ir.TensorNamespace.StringStringEntryProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.StringStringEntryProto buildPartial() {
        org.nd4j.ir.TensorNamespace.StringStringEntryProto result = new org.nd4j.ir.TensorNamespace.StringStringEntryProto(this);
        result.key_ = key_;
        result.value_ = value_;
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
        if (other instanceof org.nd4j.ir.TensorNamespace.StringStringEntryProto) {
          return mergeFrom((org.nd4j.ir.TensorNamespace.StringStringEntryProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.TensorNamespace.StringStringEntryProto other) {
        if (other == org.nd4j.ir.TensorNamespace.StringStringEntryProto.getDefaultInstance()) return this;
        if (!other.getKey().isEmpty()) {
          key_ = other.key_;
          onChanged();
        }
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
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
        org.nd4j.ir.TensorNamespace.StringStringEntryProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.TensorNamespace.StringStringEntryProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private java.lang.Object value_ = "";
      /**
       * <code>string value = 2;</code>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 2;</code>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       */
      public Builder clearValue() {
        
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>string value = 2;</code>
       */
      public Builder setValueBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        value_ = value;
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.StringStringEntryProto)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.StringStringEntryProto)
    private static final org.nd4j.ir.TensorNamespace.StringStringEntryProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.StringStringEntryProto();
    }

    public static org.nd4j.ir.TensorNamespace.StringStringEntryProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<StringStringEntryProto>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<StringStringEntryProto>() {
      @java.lang.Override
      public StringStringEntryProto parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new StringStringEntryProto(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<StringStringEntryProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<StringStringEntryProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.TensorNamespace.StringStringEntryProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TypeProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.TypeProto)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The type of a tensor.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
     */
    boolean hasTensorType();
    /**
     * <pre>
     * The type of a tensor.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
     */
    org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor getTensorType();
    /**
     * <pre>
     * The type of a tensor.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
     */
    org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptorOrBuilder getTensorTypeOrBuilder();

    public org.nd4j.ir.TensorNamespace.TypeProto.ValueCase getValueCase();
  }
  /**
   * <pre>
   * Define the types.
   * </pre>
   *
   * Protobuf type {@code org.nd4j.ir.TypeProto}
   */
  public  static final class TypeProto extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.TypeProto)
      TypeProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TypeProto.newBuilder() to construct.
    private TypeProto(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TypeProto() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TypeProto();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TypeProto(
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
              org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder subBuilder = null;
              if (valueCase_ == 1) {
                subBuilder = ((org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_).toBuilder();
              }
              value_ =
                  input.readMessage(org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_);
                value_ = subBuilder.buildPartial();
              }
              valueCase_ = 1;
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
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.TensorNamespace.TypeProto.class, org.nd4j.ir.TensorNamespace.TypeProto.Builder.class);
    }

    public interface TensorDescriptorOrBuilder extends
        // @@protoc_insertion_point(interface_extends:org.nd4j.ir.TypeProto.TensorDescriptor)
        org.nd4j.shade.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * This field MUST NOT have the value of UNDEFINED
       * This field MUST be present for this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
       */
      int getElemTypeValue();
      /**
       * <pre>
       * This field MUST NOT have the value of UNDEFINED
       * This field MUST be present for this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
       */
      org.nd4j.ir.TensorNamespace.DataType getElemType();

      /**
       * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
       */
      boolean hasShape();
      /**
       * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
       */
      org.nd4j.ir.TensorNamespace.TensorShapeProto getShape();
      /**
       * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
       */
      org.nd4j.ir.TensorNamespace.TensorShapeProtoOrBuilder getShapeOrBuilder();
    }
    /**
     * Protobuf type {@code org.nd4j.ir.TypeProto.TensorDescriptor}
     */
    public  static final class TensorDescriptor extends
        org.nd4j.shade.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:org.nd4j.ir.TypeProto.TensorDescriptor)
        TensorDescriptorOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use TensorDescriptor.newBuilder() to construct.
      private TensorDescriptor(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private TensorDescriptor() {
        elemType_ = 0;
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new TensorDescriptor();
      }

      @java.lang.Override
      public final org.nd4j.shade.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private TensorDescriptor(
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
              case 8: {
                int rawValue = input.readEnum();

                elemType_ = rawValue;
                break;
              }
              case 18: {
                org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder subBuilder = null;
                if (shape_ != null) {
                  subBuilder = shape_.toBuilder();
                }
                shape_ = input.readMessage(org.nd4j.ir.TensorNamespace.TensorShapeProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(shape_);
                  shape_ = subBuilder.buildPartial();
                }

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
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.class, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder.class);
      }

      public static final int ELEM_TYPE_FIELD_NUMBER = 1;
      private int elemType_;
      /**
       * <pre>
       * This field MUST NOT have the value of UNDEFINED
       * This field MUST be present for this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
       */
      public int getElemTypeValue() {
        return elemType_;
      }
      /**
       * <pre>
       * This field MUST NOT have the value of UNDEFINED
       * This field MUST be present for this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.DataType getElemType() {
        @SuppressWarnings("deprecation")
        org.nd4j.ir.TensorNamespace.DataType result = org.nd4j.ir.TensorNamespace.DataType.valueOf(elemType_);
        return result == null ? org.nd4j.ir.TensorNamespace.DataType.UNRECOGNIZED : result;
      }

      public static final int SHAPE_FIELD_NUMBER = 2;
      private org.nd4j.ir.TensorNamespace.TensorShapeProto shape_;
      /**
       * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
       */
      public boolean hasShape() {
        return shape_ != null;
      }
      /**
       * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorShapeProto getShape() {
        return shape_ == null ? org.nd4j.ir.TensorNamespace.TensorShapeProto.getDefaultInstance() : shape_;
      }
      /**
       * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorShapeProtoOrBuilder getShapeOrBuilder() {
        return getShape();
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
        if (elemType_ != org.nd4j.ir.TensorNamespace.DataType.UNDEFINED.getNumber()) {
          output.writeEnum(1, elemType_);
        }
        if (shape_ != null) {
          output.writeMessage(2, getShape());
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (elemType_ != org.nd4j.ir.TensorNamespace.DataType.UNDEFINED.getNumber()) {
          size += org.nd4j.shade.protobuf.CodedOutputStream
            .computeEnumSize(1, elemType_);
        }
        if (shape_ != null) {
          size += org.nd4j.shade.protobuf.CodedOutputStream
            .computeMessageSize(2, getShape());
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
        if (!(obj instanceof org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor)) {
          return super.equals(obj);
        }
        org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor other = (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) obj;

        if (elemType_ != other.elemType_) return false;
        if (hasShape() != other.hasShape()) return false;
        if (hasShape()) {
          if (!getShape()
              .equals(other.getShape())) return false;
        }
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
        hash = (37 * hash) + ELEM_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + elemType_;
        if (hasShape()) {
          hash = (37 * hash) + SHAPE_FIELD_NUMBER;
          hash = (53 * hash) + getShape().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
          java.nio.ByteBuffer data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
          java.nio.ByteBuffer data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
          org.nd4j.shade.protobuf.ByteString data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
          org.nd4j.shade.protobuf.ByteString data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(byte[] data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
          byte[] data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
          java.io.InputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseDelimitedFrom(
          java.io.InputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
          org.nd4j.shade.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parseFrom(
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
      public static Builder newBuilder(org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor prototype) {
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
       * Protobuf type {@code org.nd4j.ir.TypeProto.TensorDescriptor}
       */
      public static final class Builder extends
          org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:org.nd4j.ir.TypeProto.TensorDescriptor)
          org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptorOrBuilder {
        public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_descriptor;
        }

        @java.lang.Override
        protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.class, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder.class);
        }

        // Construct using org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.newBuilder()
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
          elemType_ = 0;

          if (shapeBuilder_ == null) {
            shape_ = null;
          } else {
            shape_ = null;
            shapeBuilder_ = null;
          }
          return this;
        }

        @java.lang.Override
        public org.nd4j.shade.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_descriptor;
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor getDefaultInstanceForType() {
          return org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance();
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor build() {
          org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor buildPartial() {
          org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor result = new org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor(this);
          result.elemType_ = elemType_;
          if (shapeBuilder_ == null) {
            result.shape_ = shape_;
          } else {
            result.shape_ = shapeBuilder_.build();
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
          if (other instanceof org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) {
            return mergeFrom((org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor other) {
          if (other == org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance()) return this;
          if (other.elemType_ != 0) {
            setElemTypeValue(other.getElemTypeValue());
          }
          if (other.hasShape()) {
            mergeShape(other.getShape());
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
          org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private int elemType_ = 0;
        /**
         * <pre>
         * This field MUST NOT have the value of UNDEFINED
         * This field MUST be present for this version of the IR.
         * </pre>
         *
         * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
         */
        public int getElemTypeValue() {
          return elemType_;
        }
        /**
         * <pre>
         * This field MUST NOT have the value of UNDEFINED
         * This field MUST be present for this version of the IR.
         * </pre>
         *
         * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
         */
        public Builder setElemTypeValue(int value) {
          elemType_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * This field MUST NOT have the value of UNDEFINED
         * This field MUST be present for this version of the IR.
         * </pre>
         *
         * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
         */
        public org.nd4j.ir.TensorNamespace.DataType getElemType() {
          @SuppressWarnings("deprecation")
          org.nd4j.ir.TensorNamespace.DataType result = org.nd4j.ir.TensorNamespace.DataType.valueOf(elemType_);
          return result == null ? org.nd4j.ir.TensorNamespace.DataType.UNRECOGNIZED : result;
        }
        /**
         * <pre>
         * This field MUST NOT have the value of UNDEFINED
         * This field MUST be present for this version of the IR.
         * </pre>
         *
         * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
         */
        public Builder setElemType(org.nd4j.ir.TensorNamespace.DataType value) {
          if (value == null) {
            throw new NullPointerException();
          }
          
          elemType_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * This field MUST NOT have the value of UNDEFINED
         * This field MUST be present for this version of the IR.
         * </pre>
         *
         * <code>.org.nd4j.ir.DataType elem_type = 1;</code>
         */
        public Builder clearElemType() {
          
          elemType_ = 0;
          onChanged();
          return this;
        }

        private org.nd4j.ir.TensorNamespace.TensorShapeProto shape_;
        private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
            org.nd4j.ir.TensorNamespace.TensorShapeProto, org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder, org.nd4j.ir.TensorNamespace.TensorShapeProtoOrBuilder> shapeBuilder_;
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public boolean hasShape() {
          return shapeBuilder_ != null || shape_ != null;
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public org.nd4j.ir.TensorNamespace.TensorShapeProto getShape() {
          if (shapeBuilder_ == null) {
            return shape_ == null ? org.nd4j.ir.TensorNamespace.TensorShapeProto.getDefaultInstance() : shape_;
          } else {
            return shapeBuilder_.getMessage();
          }
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public Builder setShape(org.nd4j.ir.TensorNamespace.TensorShapeProto value) {
          if (shapeBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            shape_ = value;
            onChanged();
          } else {
            shapeBuilder_.setMessage(value);
          }

          return this;
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public Builder setShape(
            org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder builderForValue) {
          if (shapeBuilder_ == null) {
            shape_ = builderForValue.build();
            onChanged();
          } else {
            shapeBuilder_.setMessage(builderForValue.build());
          }

          return this;
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public Builder mergeShape(org.nd4j.ir.TensorNamespace.TensorShapeProto value) {
          if (shapeBuilder_ == null) {
            if (shape_ != null) {
              shape_ =
                org.nd4j.ir.TensorNamespace.TensorShapeProto.newBuilder(shape_).mergeFrom(value).buildPartial();
            } else {
              shape_ = value;
            }
            onChanged();
          } else {
            shapeBuilder_.mergeFrom(value);
          }

          return this;
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public Builder clearShape() {
          if (shapeBuilder_ == null) {
            shape_ = null;
            onChanged();
          } else {
            shape_ = null;
            shapeBuilder_ = null;
          }

          return this;
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder getShapeBuilder() {
          
          onChanged();
          return getShapeFieldBuilder().getBuilder();
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        public org.nd4j.ir.TensorNamespace.TensorShapeProtoOrBuilder getShapeOrBuilder() {
          if (shapeBuilder_ != null) {
            return shapeBuilder_.getMessageOrBuilder();
          } else {
            return shape_ == null ?
                org.nd4j.ir.TensorNamespace.TensorShapeProto.getDefaultInstance() : shape_;
          }
        }
        /**
         * <code>.org.nd4j.ir.TensorShapeProto shape = 2;</code>
         */
        private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
            org.nd4j.ir.TensorNamespace.TensorShapeProto, org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder, org.nd4j.ir.TensorNamespace.TensorShapeProtoOrBuilder> 
            getShapeFieldBuilder() {
          if (shapeBuilder_ == null) {
            shapeBuilder_ = new org.nd4j.shade.protobuf.SingleFieldBuilderV3<
                org.nd4j.ir.TensorNamespace.TensorShapeProto, org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder, org.nd4j.ir.TensorNamespace.TensorShapeProtoOrBuilder>(
                    getShape(),
                    getParentForChildren(),
                    isClean());
            shape_ = null;
          }
          return shapeBuilder_;
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


        // @@protoc_insertion_point(builder_scope:org.nd4j.ir.TypeProto.TensorDescriptor)
      }

      // @@protoc_insertion_point(class_scope:org.nd4j.ir.TypeProto.TensorDescriptor)
      private static final org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor();
      }

      public static org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final org.nd4j.shade.protobuf.Parser<TensorDescriptor>
          PARSER = new org.nd4j.shade.protobuf.AbstractParser<TensorDescriptor>() {
        @java.lang.Override
        public TensorDescriptor parsePartialFrom(
            org.nd4j.shade.protobuf.CodedInputStream input,
            org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
            throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
          return new TensorDescriptor(input, extensionRegistry);
        }
      };

      public static org.nd4j.shade.protobuf.Parser<TensorDescriptor> parser() {
        return PARSER;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Parser<TensorDescriptor> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int valueCase_ = 0;
    private java.lang.Object value_;
    public enum ValueCase
        implements org.nd4j.shade.protobuf.Internal.EnumLite {
      TENSOR_TYPE(1),
      VALUE_NOT_SET(0);
      private final int value;
      private ValueCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ValueCase valueOf(int value) {
        return forNumber(value);
      }

      public static ValueCase forNumber(int value) {
        switch (value) {
          case 1: return TENSOR_TYPE;
          case 0: return VALUE_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ValueCase
    getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public static final int TENSOR_TYPE_FIELD_NUMBER = 1;
    /**
     * <pre>
     * The type of a tensor.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
     */
    public boolean hasTensorType() {
      return valueCase_ == 1;
    }
    /**
     * <pre>
     * The type of a tensor.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
     */
    public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor getTensorType() {
      if (valueCase_ == 1) {
         return (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_;
      }
      return org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance();
    }
    /**
     * <pre>
     * The type of a tensor.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
     */
    public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptorOrBuilder getTensorTypeOrBuilder() {
      if (valueCase_ == 1) {
         return (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_;
      }
      return org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance();
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
      if (valueCase_ == 1) {
        output.writeMessage(1, (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (valueCase_ == 1) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(1, (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_);
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
      if (!(obj instanceof org.nd4j.ir.TensorNamespace.TypeProto)) {
        return super.equals(obj);
      }
      org.nd4j.ir.TensorNamespace.TypeProto other = (org.nd4j.ir.TensorNamespace.TypeProto) obj;

      if (!getValueCase().equals(other.getValueCase())) return false;
      switch (valueCase_) {
        case 1:
          if (!getTensorType()
              .equals(other.getTensorType())) return false;
          break;
        case 0:
        default:
      }
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
      switch (valueCase_) {
        case 1:
          hash = (37 * hash) + TENSOR_TYPE_FIELD_NUMBER;
          hash = (53 * hash) + getTensorType().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TypeProto parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.TensorNamespace.TypeProto prototype) {
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
     * Define the types.
     * </pre>
     *
     * Protobuf type {@code org.nd4j.ir.TypeProto}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.TypeProto)
        org.nd4j.ir.TensorNamespace.TypeProtoOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.TypeProto.class, org.nd4j.ir.TensorNamespace.TypeProto.Builder.class);
      }

      // Construct using org.nd4j.ir.TensorNamespace.TypeProto.newBuilder()
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
        valueCase_ = 0;
        value_ = null;
        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TypeProto_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TypeProto getDefaultInstanceForType() {
        return org.nd4j.ir.TensorNamespace.TypeProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TypeProto build() {
        org.nd4j.ir.TensorNamespace.TypeProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TypeProto buildPartial() {
        org.nd4j.ir.TensorNamespace.TypeProto result = new org.nd4j.ir.TensorNamespace.TypeProto(this);
        if (valueCase_ == 1) {
          if (tensorTypeBuilder_ == null) {
            result.value_ = value_;
          } else {
            result.value_ = tensorTypeBuilder_.build();
          }
        }
        result.valueCase_ = valueCase_;
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
        if (other instanceof org.nd4j.ir.TensorNamespace.TypeProto) {
          return mergeFrom((org.nd4j.ir.TensorNamespace.TypeProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.TensorNamespace.TypeProto other) {
        if (other == org.nd4j.ir.TensorNamespace.TypeProto.getDefaultInstance()) return this;
        switch (other.getValueCase()) {
          case TENSOR_TYPE: {
            mergeTensorType(other.getTensorType());
            break;
          }
          case VALUE_NOT_SET: {
            break;
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
        org.nd4j.ir.TensorNamespace.TypeProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.TensorNamespace.TypeProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int valueCase_ = 0;
      private java.lang.Object value_;
      public ValueCase
          getValueCase() {
        return ValueCase.forNumber(
            valueCase_);
      }

      public Builder clearValue() {
        valueCase_ = 0;
        value_ = null;
        onChanged();
        return this;
      }


      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptorOrBuilder> tensorTypeBuilder_;
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public boolean hasTensorType() {
        return valueCase_ == 1;
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor getTensorType() {
        if (tensorTypeBuilder_ == null) {
          if (valueCase_ == 1) {
            return (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_;
          }
          return org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance();
        } else {
          if (valueCase_ == 1) {
            return tensorTypeBuilder_.getMessage();
          }
          return org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance();
        }
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public Builder setTensorType(org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor value) {
        if (tensorTypeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          tensorTypeBuilder_.setMessage(value);
        }
        valueCase_ = 1;
        return this;
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public Builder setTensorType(
          org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder builderForValue) {
        if (tensorTypeBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          tensorTypeBuilder_.setMessage(builderForValue.build());
        }
        valueCase_ = 1;
        return this;
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public Builder mergeTensorType(org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor value) {
        if (tensorTypeBuilder_ == null) {
          if (valueCase_ == 1 &&
              value_ != org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance()) {
            value_ = org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.newBuilder((org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_)
                .mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          if (valueCase_ == 1) {
            tensorTypeBuilder_.mergeFrom(value);
          }
          tensorTypeBuilder_.setMessage(value);
        }
        valueCase_ = 1;
        return this;
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public Builder clearTensorType() {
        if (tensorTypeBuilder_ == null) {
          if (valueCase_ == 1) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
        } else {
          if (valueCase_ == 1) {
            valueCase_ = 0;
            value_ = null;
          }
          tensorTypeBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder getTensorTypeBuilder() {
        return getTensorTypeFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptorOrBuilder getTensorTypeOrBuilder() {
        if ((valueCase_ == 1) && (tensorTypeBuilder_ != null)) {
          return tensorTypeBuilder_.getMessageOrBuilder();
        } else {
          if (valueCase_ == 1) {
            return (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_;
          }
          return org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance();
        }
      }
      /**
       * <pre>
       * The type of a tensor.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto.TensorDescriptor tensor_type = 1;</code>
       */
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptorOrBuilder> 
          getTensorTypeFieldBuilder() {
        if (tensorTypeBuilder_ == null) {
          if (!(valueCase_ == 1)) {
            value_ = org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.getDefaultInstance();
          }
          tensorTypeBuilder_ = new org.nd4j.shade.protobuf.SingleFieldBuilderV3<
              org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor.Builder, org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptorOrBuilder>(
                  (org.nd4j.ir.TensorNamespace.TypeProto.TensorDescriptor) value_,
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        valueCase_ = 1;
        onChanged();;
        return tensorTypeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.TypeProto)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.TypeProto)
    private static final org.nd4j.ir.TensorNamespace.TypeProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.TypeProto();
    }

    public static org.nd4j.ir.TensorNamespace.TypeProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<TypeProto>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<TypeProto>() {
      @java.lang.Override
      public TypeProto parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new TypeProto(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<TypeProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<TypeProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.TensorNamespace.TypeProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TensorShapeProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.TensorShapeProto)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    java.util.List<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension> 
        getDimList();
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension getDim(int index);
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    int getDimCount();
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    java.util.List<? extends org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder> 
        getDimOrBuilderList();
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder getDimOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Defines a tensor shape. A dimension can be either an integer value
   * or a symbolic variable. A symbolic variable represents an unknown
   * dimension.
   * </pre>
   *
   * Protobuf type {@code org.nd4j.ir.TensorShapeProto}
   */
  public  static final class TensorShapeProto extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.TensorShapeProto)
      TensorShapeProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TensorShapeProto.newBuilder() to construct.
    private TensorShapeProto(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TensorShapeProto() {
      dim_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TensorShapeProto();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TensorShapeProto(
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
                dim_ = new java.util.ArrayList<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension>();
                mutable_bitField0_ |= 0x00000001;
              }
              dim_.add(
                  input.readMessage(org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.parser(), extensionRegistry));
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
          dim_ = java.util.Collections.unmodifiableList(dim_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.TensorNamespace.TensorShapeProto.class, org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder.class);
    }

    public interface DimensionOrBuilder extends
        // @@protoc_insertion_point(interface_extends:org.nd4j.ir.TensorShapeProto.Dimension)
        org.nd4j.shade.protobuf.MessageOrBuilder {

      /**
       * <code>int64 dim_value = 1;</code>
       */
      long getDimValue();

      /**
       * <pre>
       * namespace Shape
       * </pre>
       *
       * <code>string dim_param = 2;</code>
       */
      java.lang.String getDimParam();
      /**
       * <pre>
       * namespace Shape
       * </pre>
       *
       * <code>string dim_param = 2;</code>
       */
      org.nd4j.shade.protobuf.ByteString
          getDimParamBytes();

      public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.ValueCase getValueCase();
    }
    /**
     * Protobuf type {@code org.nd4j.ir.TensorShapeProto.Dimension}
     */
    public  static final class Dimension extends
        org.nd4j.shade.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:org.nd4j.ir.TensorShapeProto.Dimension)
        DimensionOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Dimension.newBuilder() to construct.
      private Dimension(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Dimension() {
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new Dimension();
      }

      @java.lang.Override
      public final org.nd4j.shade.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Dimension(
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
              case 8: {
                valueCase_ = 1;
                value_ = input.readInt64();
                break;
              }
              case 18: {
                java.lang.String s = input.readStringRequireUtf8();
                valueCase_ = 2;
                value_ = s;
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
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_Dimension_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_Dimension_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.class, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder.class);
      }

      private int valueCase_ = 0;
      private java.lang.Object value_;
      public enum ValueCase
          implements org.nd4j.shade.protobuf.Internal.EnumLite {
        DIM_VALUE(1),
        DIM_PARAM(2),
        VALUE_NOT_SET(0);
        private final int value;
        private ValueCase(int value) {
          this.value = value;
        }
        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static ValueCase valueOf(int value) {
          return forNumber(value);
        }

        public static ValueCase forNumber(int value) {
          switch (value) {
            case 1: return DIM_VALUE;
            case 2: return DIM_PARAM;
            case 0: return VALUE_NOT_SET;
            default: return null;
          }
        }
        public int getNumber() {
          return this.value;
        }
      };

      public ValueCase
      getValueCase() {
        return ValueCase.forNumber(
            valueCase_);
      }

      public static final int DIM_VALUE_FIELD_NUMBER = 1;
      /**
       * <code>int64 dim_value = 1;</code>
       */
      public long getDimValue() {
        if (valueCase_ == 1) {
          return (java.lang.Long) value_;
        }
        return 0L;
      }

      public static final int DIM_PARAM_FIELD_NUMBER = 2;
      /**
       * <pre>
       * namespace Shape
       * </pre>
       *
       * <code>string dim_param = 2;</code>
       */
      public java.lang.String getDimParam() {
        java.lang.Object ref = "";
        if (valueCase_ == 2) {
          ref = value_;
        }
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          org.nd4j.shade.protobuf.ByteString bs = 
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (valueCase_ == 2) {
            value_ = s;
          }
          return s;
        }
      }
      /**
       * <pre>
       * namespace Shape
       * </pre>
       *
       * <code>string dim_param = 2;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getDimParamBytes() {
        java.lang.Object ref = "";
        if (valueCase_ == 2) {
          ref = value_;
        }
        if (ref instanceof java.lang.String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (valueCase_ == 2) {
            value_ = b;
          }
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
        if (valueCase_ == 1) {
          output.writeInt64(
              1, (long)((java.lang.Long) value_));
        }
        if (valueCase_ == 2) {
          org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (valueCase_ == 1) {
          size += org.nd4j.shade.protobuf.CodedOutputStream
            .computeInt64Size(
                1, (long)((java.lang.Long) value_));
        }
        if (valueCase_ == 2) {
          size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
        if (!(obj instanceof org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension)) {
          return super.equals(obj);
        }
        org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension other = (org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension) obj;

        if (!getValueCase().equals(other.getValueCase())) return false;
        switch (valueCase_) {
          case 1:
            if (getDimValue()
                != other.getDimValue()) return false;
            break;
          case 2:
            if (!getDimParam()
                .equals(other.getDimParam())) return false;
            break;
          case 0:
          default:
        }
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
        switch (valueCase_) {
          case 1:
            hash = (37 * hash) + DIM_VALUE_FIELD_NUMBER;
            hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashLong(
                getDimValue());
            break;
          case 2:
            hash = (37 * hash) + DIM_PARAM_FIELD_NUMBER;
            hash = (53 * hash) + getDimParam().hashCode();
            break;
          case 0:
          default:
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
          java.nio.ByteBuffer data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
          java.nio.ByteBuffer data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
          org.nd4j.shade.protobuf.ByteString data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
          org.nd4j.shade.protobuf.ByteString data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(byte[] data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
          byte[] data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
          java.io.InputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseDelimitedFrom(
          java.io.InputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
          org.nd4j.shade.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parseFrom(
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
      public static Builder newBuilder(org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension prototype) {
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
       * Protobuf type {@code org.nd4j.ir.TensorShapeProto.Dimension}
       */
      public static final class Builder extends
          org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:org.nd4j.ir.TensorShapeProto.Dimension)
          org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder {
        public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_Dimension_descriptor;
        }

        @java.lang.Override
        protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_Dimension_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.class, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder.class);
        }

        // Construct using org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.newBuilder()
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
          valueCase_ = 0;
          value_ = null;
          return this;
        }

        @java.lang.Override
        public org.nd4j.shade.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_Dimension_descriptor;
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension getDefaultInstanceForType() {
          return org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.getDefaultInstance();
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension build() {
          org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension buildPartial() {
          org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension result = new org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension(this);
          if (valueCase_ == 1) {
            result.value_ = value_;
          }
          if (valueCase_ == 2) {
            result.value_ = value_;
          }
          result.valueCase_ = valueCase_;
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
          if (other instanceof org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension) {
            return mergeFrom((org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension other) {
          if (other == org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.getDefaultInstance()) return this;
          switch (other.getValueCase()) {
            case DIM_VALUE: {
              setDimValue(other.getDimValue());
              break;
            }
            case DIM_PARAM: {
              valueCase_ = 2;
              value_ = other.value_;
              onChanged();
              break;
            }
            case VALUE_NOT_SET: {
              break;
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
          org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int valueCase_ = 0;
        private java.lang.Object value_;
        public ValueCase
            getValueCase() {
          return ValueCase.forNumber(
              valueCase_);
        }

        public Builder clearValue() {
          valueCase_ = 0;
          value_ = null;
          onChanged();
          return this;
        }


        /**
         * <code>int64 dim_value = 1;</code>
         */
        public long getDimValue() {
          if (valueCase_ == 1) {
            return (java.lang.Long) value_;
          }
          return 0L;
        }
        /**
         * <code>int64 dim_value = 1;</code>
         */
        public Builder setDimValue(long value) {
          valueCase_ = 1;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>int64 dim_value = 1;</code>
         */
        public Builder clearDimValue() {
          if (valueCase_ == 1) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }

        /**
         * <pre>
         * namespace Shape
         * </pre>
         *
         * <code>string dim_param = 2;</code>
         */
        public java.lang.String getDimParam() {
          java.lang.Object ref = "";
          if (valueCase_ == 2) {
            ref = value_;
          }
          if (!(ref instanceof java.lang.String)) {
            org.nd4j.shade.protobuf.ByteString bs =
                (org.nd4j.shade.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (valueCase_ == 2) {
              value_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <pre>
         * namespace Shape
         * </pre>
         *
         * <code>string dim_param = 2;</code>
         */
        public org.nd4j.shade.protobuf.ByteString
            getDimParamBytes() {
          java.lang.Object ref = "";
          if (valueCase_ == 2) {
            ref = value_;
          }
          if (ref instanceof String) {
            org.nd4j.shade.protobuf.ByteString b = 
                org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            if (valueCase_ == 2) {
              value_ = b;
            }
            return b;
          } else {
            return (org.nd4j.shade.protobuf.ByteString) ref;
          }
        }
        /**
         * <pre>
         * namespace Shape
         * </pre>
         *
         * <code>string dim_param = 2;</code>
         */
        public Builder setDimParam(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 2;
          value_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * namespace Shape
         * </pre>
         *
         * <code>string dim_param = 2;</code>
         */
        public Builder clearDimParam() {
          if (valueCase_ == 2) {
            valueCase_ = 0;
            value_ = null;
            onChanged();
          }
          return this;
        }
        /**
         * <pre>
         * namespace Shape
         * </pre>
         *
         * <code>string dim_param = 2;</code>
         */
        public Builder setDimParamBytes(
            org.nd4j.shade.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
          valueCase_ = 2;
          value_ = value;
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


        // @@protoc_insertion_point(builder_scope:org.nd4j.ir.TensorShapeProto.Dimension)
      }

      // @@protoc_insertion_point(class_scope:org.nd4j.ir.TensorShapeProto.Dimension)
      private static final org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension();
      }

      public static org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final org.nd4j.shade.protobuf.Parser<Dimension>
          PARSER = new org.nd4j.shade.protobuf.AbstractParser<Dimension>() {
        @java.lang.Override
        public Dimension parsePartialFrom(
            org.nd4j.shade.protobuf.CodedInputStream input,
            org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
            throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
          return new Dimension(input, extensionRegistry);
        }
      };

      public static org.nd4j.shade.protobuf.Parser<Dimension> parser() {
        return PARSER;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Parser<Dimension> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public static final int DIM_FIELD_NUMBER = 1;
    private java.util.List<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension> dim_;
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    public java.util.List<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension> getDimList() {
      return dim_;
    }
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    public java.util.List<? extends org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder> 
        getDimOrBuilderList() {
      return dim_;
    }
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    public int getDimCount() {
      return dim_.size();
    }
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension getDim(int index) {
      return dim_.get(index);
    }
    /**
     * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder getDimOrBuilder(
        int index) {
      return dim_.get(index);
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
      for (int i = 0; i < dim_.size(); i++) {
        output.writeMessage(1, dim_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < dim_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(1, dim_.get(i));
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
      if (!(obj instanceof org.nd4j.ir.TensorNamespace.TensorShapeProto)) {
        return super.equals(obj);
      }
      org.nd4j.ir.TensorNamespace.TensorShapeProto other = (org.nd4j.ir.TensorNamespace.TensorShapeProto) obj;

      if (!getDimList()
          .equals(other.getDimList())) return false;
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
      if (getDimCount() > 0) {
        hash = (37 * hash) + DIM_FIELD_NUMBER;
        hash = (53 * hash) + getDimList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TensorShapeProto parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.TensorNamespace.TensorShapeProto prototype) {
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
     * Defines a tensor shape. A dimension can be either an integer value
     * or a symbolic variable. A symbolic variable represents an unknown
     * dimension.
     * </pre>
     *
     * Protobuf type {@code org.nd4j.ir.TensorShapeProto}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.TensorShapeProto)
        org.nd4j.ir.TensorNamespace.TensorShapeProtoOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.TensorShapeProto.class, org.nd4j.ir.TensorNamespace.TensorShapeProto.Builder.class);
      }

      // Construct using org.nd4j.ir.TensorNamespace.TensorShapeProto.newBuilder()
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
          getDimFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (dimBuilder_ == null) {
          dim_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          dimBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorShapeProto_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorShapeProto getDefaultInstanceForType() {
        return org.nd4j.ir.TensorNamespace.TensorShapeProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorShapeProto build() {
        org.nd4j.ir.TensorNamespace.TensorShapeProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorShapeProto buildPartial() {
        org.nd4j.ir.TensorNamespace.TensorShapeProto result = new org.nd4j.ir.TensorNamespace.TensorShapeProto(this);
        int from_bitField0_ = bitField0_;
        if (dimBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            dim_ = java.util.Collections.unmodifiableList(dim_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.dim_ = dim_;
        } else {
          result.dim_ = dimBuilder_.build();
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
        if (other instanceof org.nd4j.ir.TensorNamespace.TensorShapeProto) {
          return mergeFrom((org.nd4j.ir.TensorNamespace.TensorShapeProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.TensorNamespace.TensorShapeProto other) {
        if (other == org.nd4j.ir.TensorNamespace.TensorShapeProto.getDefaultInstance()) return this;
        if (dimBuilder_ == null) {
          if (!other.dim_.isEmpty()) {
            if (dim_.isEmpty()) {
              dim_ = other.dim_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDimIsMutable();
              dim_.addAll(other.dim_);
            }
            onChanged();
          }
        } else {
          if (!other.dim_.isEmpty()) {
            if (dimBuilder_.isEmpty()) {
              dimBuilder_.dispose();
              dimBuilder_ = null;
              dim_ = other.dim_;
              bitField0_ = (bitField0_ & ~0x00000001);
              dimBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDimFieldBuilder() : null;
            } else {
              dimBuilder_.addAllMessages(other.dim_);
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
        org.nd4j.ir.TensorNamespace.TensorShapeProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.TensorNamespace.TensorShapeProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension> dim_ =
        java.util.Collections.emptyList();
      private void ensureDimIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dim_ = new java.util.ArrayList<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension>(dim_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder, org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder> dimBuilder_;

      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public java.util.List<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension> getDimList() {
        if (dimBuilder_ == null) {
          return java.util.Collections.unmodifiableList(dim_);
        } else {
          return dimBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public int getDimCount() {
        if (dimBuilder_ == null) {
          return dim_.size();
        } else {
          return dimBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension getDim(int index) {
        if (dimBuilder_ == null) {
          return dim_.get(index);
        } else {
          return dimBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder setDim(
          int index, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension value) {
        if (dimBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDimIsMutable();
          dim_.set(index, value);
          onChanged();
        } else {
          dimBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder setDim(
          int index, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder builderForValue) {
        if (dimBuilder_ == null) {
          ensureDimIsMutable();
          dim_.set(index, builderForValue.build());
          onChanged();
        } else {
          dimBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder addDim(org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension value) {
        if (dimBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDimIsMutable();
          dim_.add(value);
          onChanged();
        } else {
          dimBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder addDim(
          int index, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension value) {
        if (dimBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDimIsMutable();
          dim_.add(index, value);
          onChanged();
        } else {
          dimBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder addDim(
          org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder builderForValue) {
        if (dimBuilder_ == null) {
          ensureDimIsMutable();
          dim_.add(builderForValue.build());
          onChanged();
        } else {
          dimBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder addDim(
          int index, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder builderForValue) {
        if (dimBuilder_ == null) {
          ensureDimIsMutable();
          dim_.add(index, builderForValue.build());
          onChanged();
        } else {
          dimBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder addAllDim(
          java.lang.Iterable<? extends org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension> values) {
        if (dimBuilder_ == null) {
          ensureDimIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, dim_);
          onChanged();
        } else {
          dimBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder clearDim() {
        if (dimBuilder_ == null) {
          dim_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          dimBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public Builder removeDim(int index) {
        if (dimBuilder_ == null) {
          ensureDimIsMutable();
          dim_.remove(index);
          onChanged();
        } else {
          dimBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder getDimBuilder(
          int index) {
        return getDimFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder getDimOrBuilder(
          int index) {
        if (dimBuilder_ == null) {
          return dim_.get(index);  } else {
          return dimBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public java.util.List<? extends org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder> 
           getDimOrBuilderList() {
        if (dimBuilder_ != null) {
          return dimBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(dim_);
        }
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder addDimBuilder() {
        return getDimFieldBuilder().addBuilder(
            org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder addDimBuilder(
          int index) {
        return getDimFieldBuilder().addBuilder(
            index, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.getDefaultInstance());
      }
      /**
       * <code>repeated .org.nd4j.ir.TensorShapeProto.Dimension dim = 1;</code>
       */
      public java.util.List<org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder> 
           getDimBuilderList() {
        return getDimFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder, org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder> 
          getDimFieldBuilder() {
        if (dimBuilder_ == null) {
          dimBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension, org.nd4j.ir.TensorNamespace.TensorShapeProto.Dimension.Builder, org.nd4j.ir.TensorNamespace.TensorShapeProto.DimensionOrBuilder>(
                  dim_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          dim_ = null;
        }
        return dimBuilder_;
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.TensorShapeProto)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.TensorShapeProto)
    private static final org.nd4j.ir.TensorNamespace.TensorShapeProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.TensorShapeProto();
    }

    public static org.nd4j.ir.TensorNamespace.TensorShapeProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<TensorShapeProto>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<TensorShapeProto>() {
      @java.lang.Override
      public TensorShapeProto parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new TensorShapeProto(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<TensorShapeProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<TensorShapeProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.TensorNamespace.TensorShapeProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ValueInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.ValueInfoProto)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto type = 2;</code>
     */
    boolean hasType();
    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto type = 2;</code>
     */
    org.nd4j.ir.TensorNamespace.TypeProto getType();
    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto type = 2;</code>
     */
    org.nd4j.ir.TensorNamespace.TypeProtoOrBuilder getTypeOrBuilder();

    /**
     * <pre>
     * A human-readable documentation for this value. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 3;</code>
     */
    java.lang.String getDocString();
    /**
     * <pre>
     * A human-readable documentation for this value. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 3;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getDocStringBytes();
  }
  /**
   * <pre>
   * Defines information on value, including the name, the type, and
   * the shape of the value.
   * </pre>
   *
   * Protobuf type {@code org.nd4j.ir.ValueInfoProto}
   */
  public  static final class ValueInfoProto extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.ValueInfoProto)
      ValueInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ValueInfoProto.newBuilder() to construct.
    private ValueInfoProto(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ValueInfoProto() {
      name_ = "";
      docString_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ValueInfoProto();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ValueInfoProto(
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
            case 18: {
              org.nd4j.ir.TensorNamespace.TypeProto.Builder subBuilder = null;
              if (type_ != null) {
                subBuilder = type_.toBuilder();
              }
              type_ = input.readMessage(org.nd4j.ir.TensorNamespace.TypeProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(type_);
                type_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              docString_ = s;
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
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_ValueInfoProto_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_ValueInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.TensorNamespace.ValueInfoProto.class, org.nd4j.ir.TensorNamespace.ValueInfoProto.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
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
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
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

    public static final int TYPE_FIELD_NUMBER = 2;
    private org.nd4j.ir.TensorNamespace.TypeProto type_;
    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto type = 2;</code>
     */
    public boolean hasType() {
      return type_ != null;
    }
    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto type = 2;</code>
     */
    public org.nd4j.ir.TensorNamespace.TypeProto getType() {
      return type_ == null ? org.nd4j.ir.TensorNamespace.TypeProto.getDefaultInstance() : type_;
    }
    /**
     * <pre>
     * This field MUST be present in this version of the IR.
     * </pre>
     *
     * <code>.org.nd4j.ir.TypeProto type = 2;</code>
     */
    public org.nd4j.ir.TensorNamespace.TypeProtoOrBuilder getTypeOrBuilder() {
      return getType();
    }

    public static final int DOC_STRING_FIELD_NUMBER = 3;
    private volatile java.lang.Object docString_;
    /**
     * <pre>
     * A human-readable documentation for this value. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 3;</code>
     */
    public java.lang.String getDocString() {
      java.lang.Object ref = docString_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        docString_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * A human-readable documentation for this value. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 3;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getDocStringBytes() {
      java.lang.Object ref = docString_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        docString_ = b;
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
      if (!getNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (type_ != null) {
        output.writeMessage(2, getType());
      }
      if (!getDocStringBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 3, docString_);
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
      if (type_ != null) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(2, getType());
      }
      if (!getDocStringBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(3, docString_);
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
      if (!(obj instanceof org.nd4j.ir.TensorNamespace.ValueInfoProto)) {
        return super.equals(obj);
      }
      org.nd4j.ir.TensorNamespace.ValueInfoProto other = (org.nd4j.ir.TensorNamespace.ValueInfoProto) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (!getType()
            .equals(other.getType())) return false;
      }
      if (!getDocString()
          .equals(other.getDocString())) return false;
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
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      hash = (37 * hash) + DOC_STRING_FIELD_NUMBER;
      hash = (53 * hash) + getDocString().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.ValueInfoProto parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.TensorNamespace.ValueInfoProto prototype) {
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
     * Defines information on value, including the name, the type, and
     * the shape of the value.
     * </pre>
     *
     * Protobuf type {@code org.nd4j.ir.ValueInfoProto}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.ValueInfoProto)
        org.nd4j.ir.TensorNamespace.ValueInfoProtoOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_ValueInfoProto_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_ValueInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.ValueInfoProto.class, org.nd4j.ir.TensorNamespace.ValueInfoProto.Builder.class);
      }

      // Construct using org.nd4j.ir.TensorNamespace.ValueInfoProto.newBuilder()
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

        if (typeBuilder_ == null) {
          type_ = null;
        } else {
          type_ = null;
          typeBuilder_ = null;
        }
        docString_ = "";

        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_ValueInfoProto_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.ValueInfoProto getDefaultInstanceForType() {
        return org.nd4j.ir.TensorNamespace.ValueInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.ValueInfoProto build() {
        org.nd4j.ir.TensorNamespace.ValueInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.ValueInfoProto buildPartial() {
        org.nd4j.ir.TensorNamespace.ValueInfoProto result = new org.nd4j.ir.TensorNamespace.ValueInfoProto(this);
        result.name_ = name_;
        if (typeBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = typeBuilder_.build();
        }
        result.docString_ = docString_;
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
        if (other instanceof org.nd4j.ir.TensorNamespace.ValueInfoProto) {
          return mergeFrom((org.nd4j.ir.TensorNamespace.ValueInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.TensorNamespace.ValueInfoProto other) {
        if (other == org.nd4j.ir.TensorNamespace.ValueInfoProto.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.hasType()) {
          mergeType(other.getType());
        }
        if (!other.getDocString().isEmpty()) {
          docString_ = other.docString_;
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
        org.nd4j.ir.TensorNamespace.ValueInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.TensorNamespace.ValueInfoProto) e.getUnfinishedMessage();
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
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
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
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
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
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
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
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
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

      private org.nd4j.ir.TensorNamespace.TypeProto type_;
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TypeProto, org.nd4j.ir.TensorNamespace.TypeProto.Builder, org.nd4j.ir.TensorNamespace.TypeProtoOrBuilder> typeBuilder_;
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public boolean hasType() {
        return typeBuilder_ != null || type_ != null;
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public org.nd4j.ir.TensorNamespace.TypeProto getType() {
        if (typeBuilder_ == null) {
          return type_ == null ? org.nd4j.ir.TensorNamespace.TypeProto.getDefaultInstance() : type_;
        } else {
          return typeBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public Builder setType(org.nd4j.ir.TensorNamespace.TypeProto value) {
        if (typeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          typeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public Builder setType(
          org.nd4j.ir.TensorNamespace.TypeProto.Builder builderForValue) {
        if (typeBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          typeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public Builder mergeType(org.nd4j.ir.TensorNamespace.TypeProto value) {
        if (typeBuilder_ == null) {
          if (type_ != null) {
            type_ =
              org.nd4j.ir.TensorNamespace.TypeProto.newBuilder(type_).mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          typeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public Builder clearType() {
        if (typeBuilder_ == null) {
          type_ = null;
          onChanged();
        } else {
          type_ = null;
          typeBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public org.nd4j.ir.TensorNamespace.TypeProto.Builder getTypeBuilder() {
        
        onChanged();
        return getTypeFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      public org.nd4j.ir.TensorNamespace.TypeProtoOrBuilder getTypeOrBuilder() {
        if (typeBuilder_ != null) {
          return typeBuilder_.getMessageOrBuilder();
        } else {
          return type_ == null ?
              org.nd4j.ir.TensorNamespace.TypeProto.getDefaultInstance() : type_;
        }
      }
      /**
       * <pre>
       * This field MUST be present in this version of the IR.
       * </pre>
       *
       * <code>.org.nd4j.ir.TypeProto type = 2;</code>
       */
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TypeProto, org.nd4j.ir.TensorNamespace.TypeProto.Builder, org.nd4j.ir.TensorNamespace.TypeProtoOrBuilder> 
          getTypeFieldBuilder() {
        if (typeBuilder_ == null) {
          typeBuilder_ = new org.nd4j.shade.protobuf.SingleFieldBuilderV3<
              org.nd4j.ir.TensorNamespace.TypeProto, org.nd4j.ir.TensorNamespace.TypeProto.Builder, org.nd4j.ir.TensorNamespace.TypeProtoOrBuilder>(
                  getType(),
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        return typeBuilder_;
      }

      private java.lang.Object docString_ = "";
      /**
       * <pre>
       * A human-readable documentation for this value. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 3;</code>
       */
      public java.lang.String getDocString() {
        java.lang.Object ref = docString_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          docString_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * A human-readable documentation for this value. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 3;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getDocStringBytes() {
        java.lang.Object ref = docString_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          docString_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * A human-readable documentation for this value. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 3;</code>
       */
      public Builder setDocString(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        docString_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A human-readable documentation for this value. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 3;</code>
       */
      public Builder clearDocString() {
        
        docString_ = getDefaultInstance().getDocString();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A human-readable documentation for this value. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 3;</code>
       */
      public Builder setDocStringBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        docString_ = value;
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.ValueInfoProto)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.ValueInfoProto)
    private static final org.nd4j.ir.TensorNamespace.ValueInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.ValueInfoProto();
    }

    public static org.nd4j.ir.TensorNamespace.ValueInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<ValueInfoProto>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<ValueInfoProto>() {
      @java.lang.Override
      public ValueInfoProto parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new ValueInfoProto(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<ValueInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<ValueInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.TensorNamespace.ValueInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TensorProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.nd4j.ir.TensorProto)
      org.nd4j.shade.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The shape of the tensor.
     * </pre>
     *
     * <code>repeated int64 dims = 1;</code>
     */
    java.util.List<java.lang.Long> getDimsList();
    /**
     * <pre>
     * The shape of the tensor.
     * </pre>
     *
     * <code>repeated int64 dims = 1;</code>
     */
    int getDimsCount();
    /**
     * <pre>
     * The shape of the tensor.
     * </pre>
     *
     * <code>repeated int64 dims = 1;</code>
     */
    long getDims(int index);

    /**
     * <pre>
     * The data type of the tensor.
     * This field MUST have a valid TensorProto.DataType value
     * </pre>
     *
     * <code>int32 data_type = 2;</code>
     */
    int getDataType();

    /**
     * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
     */
    boolean hasSegment();
    /**
     * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorProto.Segment getSegment();
    /**
     * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorProto.SegmentOrBuilder getSegmentOrBuilder();

    /**
     * <pre>
     * For float and complex64 values
     * Complex64 tensors are encoded as a single array of floats,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
     * </pre>
     *
     * <code>repeated float float_data = 4 [packed = true];</code>
     */
    java.util.List<java.lang.Float> getFloatDataList();
    /**
     * <pre>
     * For float and complex64 values
     * Complex64 tensors are encoded as a single array of floats,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
     * </pre>
     *
     * <code>repeated float float_data = 4 [packed = true];</code>
     */
    int getFloatDataCount();
    /**
     * <pre>
     * For float and complex64 values
     * Complex64 tensors are encoded as a single array of floats,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
     * </pre>
     *
     * <code>repeated float float_data = 4 [packed = true];</code>
     */
    float getFloatData(int index);

    /**
     * <pre>
     * For int32, uint8, int8, uint16, int16, bool, and float16 values
     * float16 values must be bit-wise converted to an uint16_t prior
     * to writing to the buffer.
     * When this field is present, the data_type field MUST be
     * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
     * </pre>
     *
     * <code>repeated int32 int32_data = 5 [packed = true];</code>
     */
    java.util.List<java.lang.Integer> getInt32DataList();
    /**
     * <pre>
     * For int32, uint8, int8, uint16, int16, bool, and float16 values
     * float16 values must be bit-wise converted to an uint16_t prior
     * to writing to the buffer.
     * When this field is present, the data_type field MUST be
     * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
     * </pre>
     *
     * <code>repeated int32 int32_data = 5 [packed = true];</code>
     */
    int getInt32DataCount();
    /**
     * <pre>
     * For int32, uint8, int8, uint16, int16, bool, and float16 values
     * float16 values must be bit-wise converted to an uint16_t prior
     * to writing to the buffer.
     * When this field is present, the data_type field MUST be
     * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
     * </pre>
     *
     * <code>repeated int32 int32_data = 5 [packed = true];</code>
     */
    int getInt32Data(int index);

    /**
     * <pre>
     * For strings.
     * Each element of string_data is a UTF-8 encoded Unicode
     * string. No trailing null, no leading BOM. The protobuf "string"
     * scalar type is not used to match ML community conventions.
     * When this field is present, the data_type field MUST be STRING
     * </pre>
     *
     * <code>repeated bytes string_data = 6;</code>
     */
    java.util.List<org.nd4j.shade.protobuf.ByteString> getStringDataList();
    /**
     * <pre>
     * For strings.
     * Each element of string_data is a UTF-8 encoded Unicode
     * string. No trailing null, no leading BOM. The protobuf "string"
     * scalar type is not used to match ML community conventions.
     * When this field is present, the data_type field MUST be STRING
     * </pre>
     *
     * <code>repeated bytes string_data = 6;</code>
     */
    int getStringDataCount();
    /**
     * <pre>
     * For strings.
     * Each element of string_data is a UTF-8 encoded Unicode
     * string. No trailing null, no leading BOM. The protobuf "string"
     * scalar type is not used to match ML community conventions.
     * When this field is present, the data_type field MUST be STRING
     * </pre>
     *
     * <code>repeated bytes string_data = 6;</code>
     */
    org.nd4j.shade.protobuf.ByteString getStringData(int index);

    /**
     * <pre>
     * For int64.
     * When this field is present, the data_type field MUST be INT64
     * </pre>
     *
     * <code>repeated int64 int64_data = 7 [packed = true];</code>
     */
    java.util.List<java.lang.Long> getInt64DataList();
    /**
     * <pre>
     * For int64.
     * When this field is present, the data_type field MUST be INT64
     * </pre>
     *
     * <code>repeated int64 int64_data = 7 [packed = true];</code>
     */
    int getInt64DataCount();
    /**
     * <pre>
     * For int64.
     * When this field is present, the data_type field MUST be INT64
     * </pre>
     *
     * <code>repeated int64 int64_data = 7 [packed = true];</code>
     */
    long getInt64Data(int index);

    /**
     * <pre>
     * Optionally, a name for the tensor.
     * </pre>
     *
     * <code>string name = 8;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * Optionally, a name for the tensor.
     * </pre>
     *
     * <code>string name = 8;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * A human-readable documentation for this tensor. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 12;</code>
     */
    java.lang.String getDocString();
    /**
     * <pre>
     * A human-readable documentation for this tensor. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 12;</code>
     */
    org.nd4j.shade.protobuf.ByteString
        getDocStringBytes();

    /**
     * <pre>
     * Serializations can either use one of the fields above, or use this
     * raw bytes field. The only exception is the string case, where one is
     * required to store the content in the repeated bytes string_data field.
     * When this raw_data field is used to store tensor value, elements MUST
     * be stored in as fixed-width, little-endian order.
     * Floating-point data types MUST be stored in IEEE 754 format.
     * Complex64 elements must be written as two consecutive FLOAT values, real component first.
     * Complex128 elements must be written as two consecutive DOUBLE values, real component first.
     * Boolean type MUST be written one byte per tensor element (00000001 for true, 00000000 for false).
     * Note: the advantage of specific field rather than the raw_data field is
     * that in some cases (e.g. int data), protobuf does a better packing via
     * variable length storage, and may lead to smaller binary footprint.
     * When this field is present, the data_type field MUST NOT be STRING or UNDEFINED
     * </pre>
     *
     * <code>bytes raw_data = 9;</code>
     */
    org.nd4j.shade.protobuf.ByteString getRawData();

    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    java.util.List<org.nd4j.ir.TensorNamespace.StringStringEntryProto> 
        getExternalDataList();
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    org.nd4j.ir.TensorNamespace.StringStringEntryProto getExternalData(int index);
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    int getExternalDataCount();
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    java.util.List<? extends org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder> 
        getExternalDataOrBuilderList();
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder getExternalDataOrBuilder(
        int index);

    /**
     * <pre>
     * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
     * </pre>
     *
     * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
     */
    int getDataLocationValue();
    /**
     * <pre>
     * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
     * </pre>
     *
     * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
     */
    org.nd4j.ir.TensorNamespace.TensorProto.DataLocation getDataLocation();

    /**
     * <pre>
     * For double
     * Complex128 tensors are encoded as a single array of doubles,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
     * </pre>
     *
     * <code>repeated double double_data = 10 [packed = true];</code>
     */
    java.util.List<java.lang.Double> getDoubleDataList();
    /**
     * <pre>
     * For double
     * Complex128 tensors are encoded as a single array of doubles,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
     * </pre>
     *
     * <code>repeated double double_data = 10 [packed = true];</code>
     */
    int getDoubleDataCount();
    /**
     * <pre>
     * For double
     * Complex128 tensors are encoded as a single array of doubles,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
     * </pre>
     *
     * <code>repeated double double_data = 10 [packed = true];</code>
     */
    double getDoubleData(int index);

    /**
     * <pre>
     * For uint64 and uint32 values
     * When this field is present, the data_type field MUST be
     * UINT32 or UINT64
     * </pre>
     *
     * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
     */
    java.util.List<java.lang.Long> getUint64DataList();
    /**
     * <pre>
     * For uint64 and uint32 values
     * When this field is present, the data_type field MUST be
     * UINT32 or UINT64
     * </pre>
     *
     * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
     */
    int getUint64DataCount();
    /**
     * <pre>
     * For uint64 and uint32 values
     * When this field is present, the data_type field MUST be
     * UINT32 or UINT64
     * </pre>
     *
     * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
     */
    long getUint64Data(int index);

    /**
     * <pre>
     * For half values (tensorflow compatibility)
     * </pre>
     *
     * <code>repeated int32 half_val = 15 [packed = true];</code>
     */
    java.util.List<java.lang.Integer> getHalfValList();
    /**
     * <pre>
     * For half values (tensorflow compatibility)
     * </pre>
     *
     * <code>repeated int32 half_val = 15 [packed = true];</code>
     */
    int getHalfValCount();
    /**
     * <pre>
     * For half values (tensorflow compatibility)
     * </pre>
     *
     * <code>repeated int32 half_val = 15 [packed = true];</code>
     */
    int getHalfVal(int index);

    /**
     * <pre>
     *boolean values
     * </pre>
     *
     * <code>repeated bool bool_val = 16 [packed = true];</code>
     */
    java.util.List<java.lang.Boolean> getBoolValList();
    /**
     * <pre>
     *boolean values
     * </pre>
     *
     * <code>repeated bool bool_val = 16 [packed = true];</code>
     */
    int getBoolValCount();
    /**
     * <pre>
     *boolean values
     * </pre>
     *
     * <code>repeated bool bool_val = 16 [packed = true];</code>
     */
    boolean getBoolVal(int index);
  }
  /**
   * <pre>
   * Tensors
   * A serialized tensor value.
   * </pre>
   *
   * Protobuf type {@code org.nd4j.ir.TensorProto}
   */
  public  static final class TensorProto extends
      org.nd4j.shade.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.nd4j.ir.TensorProto)
      TensorProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TensorProto.newBuilder() to construct.
    private TensorProto(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TensorProto() {
      dims_ = emptyLongList();
      floatData_ = emptyFloatList();
      int32Data_ = emptyIntList();
      stringData_ = java.util.Collections.emptyList();
      int64Data_ = emptyLongList();
      name_ = "";
      docString_ = "";
      rawData_ = org.nd4j.shade.protobuf.ByteString.EMPTY;
      externalData_ = java.util.Collections.emptyList();
      dataLocation_ = 0;
      doubleData_ = emptyDoubleList();
      uint64Data_ = emptyLongList();
      halfVal_ = emptyIntList();
      boolVal_ = emptyBooleanList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TensorProto();
    }

    @java.lang.Override
    public final org.nd4j.shade.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TensorProto(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dims_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              dims_.addLong(input.readInt64());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                dims_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                dims_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 16: {

              dataType_ = input.readInt32();
              break;
            }
            case 26: {
              org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder subBuilder = null;
              if (segment_ != null) {
                subBuilder = segment_.toBuilder();
              }
              segment_ = input.readMessage(org.nd4j.ir.TensorNamespace.TensorProto.Segment.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(segment_);
                segment_ = subBuilder.buildPartial();
              }

              break;
            }
            case 37: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                floatData_ = newFloatList();
                mutable_bitField0_ |= 0x00000002;
              }
              floatData_.addFloat(input.readFloat());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                floatData_ = newFloatList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                floatData_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                int32Data_ = newIntList();
                mutable_bitField0_ |= 0x00000004;
              }
              int32Data_.addInt(input.readInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) != 0) && input.getBytesUntilLimit() > 0) {
                int32Data_ = newIntList();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                int32Data_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                stringData_ = new java.util.ArrayList<org.nd4j.shade.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000008;
              }
              stringData_.add(input.readBytes());
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                int64Data_ = newLongList();
                mutable_bitField0_ |= 0x00000010;
              }
              int64Data_.addLong(input.readInt64());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000010) != 0) && input.getBytesUntilLimit() > 0) {
                int64Data_ = newLongList();
                mutable_bitField0_ |= 0x00000010;
              }
              while (input.getBytesUntilLimit() > 0) {
                int64Data_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 74: {

              rawData_ = input.readBytes();
              break;
            }
            case 81: {
              if (!((mutable_bitField0_ & 0x00000040) != 0)) {
                doubleData_ = newDoubleList();
                mutable_bitField0_ |= 0x00000040;
              }
              doubleData_.addDouble(input.readDouble());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000040) != 0) && input.getBytesUntilLimit() > 0) {
                doubleData_ = newDoubleList();
                mutable_bitField0_ |= 0x00000040;
              }
              while (input.getBytesUntilLimit() > 0) {
                doubleData_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000080) != 0)) {
                uint64Data_ = newLongList();
                mutable_bitField0_ |= 0x00000080;
              }
              uint64Data_.addLong(input.readUInt64());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000080) != 0) && input.getBytesUntilLimit() > 0) {
                uint64Data_ = newLongList();
                mutable_bitField0_ |= 0x00000080;
              }
              while (input.getBytesUntilLimit() > 0) {
                uint64Data_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              docString_ = s;
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000020) != 0)) {
                externalData_ = new java.util.ArrayList<org.nd4j.ir.TensorNamespace.StringStringEntryProto>();
                mutable_bitField0_ |= 0x00000020;
              }
              externalData_.add(
                  input.readMessage(org.nd4j.ir.TensorNamespace.StringStringEntryProto.parser(), extensionRegistry));
              break;
            }
            case 112: {
              int rawValue = input.readEnum();

              dataLocation_ = rawValue;
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000100) != 0)) {
                halfVal_ = newIntList();
                mutable_bitField0_ |= 0x00000100;
              }
              halfVal_.addInt(input.readInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000100) != 0) && input.getBytesUntilLimit() > 0) {
                halfVal_ = newIntList();
                mutable_bitField0_ |= 0x00000100;
              }
              while (input.getBytesUntilLimit() > 0) {
                halfVal_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 128: {
              if (!((mutable_bitField0_ & 0x00000200) != 0)) {
                boolVal_ = newBooleanList();
                mutable_bitField0_ |= 0x00000200;
              }
              boolVal_.addBoolean(input.readBool());
              break;
            }
            case 130: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000200) != 0) && input.getBytesUntilLimit() > 0) {
                boolVal_ = newBooleanList();
                mutable_bitField0_ |= 0x00000200;
              }
              while (input.getBytesUntilLimit() > 0) {
                boolVal_.addBoolean(input.readBool());
              }
              input.popLimit(limit);
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
          dims_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          floatData_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          int32Data_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          stringData_ = java.util.Collections.unmodifiableList(stringData_); // C
        }
        if (((mutable_bitField0_ & 0x00000010) != 0)) {
          int64Data_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000040) != 0)) {
          doubleData_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000080) != 0)) {
          uint64Data_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000020) != 0)) {
          externalData_ = java.util.Collections.unmodifiableList(externalData_);
        }
        if (((mutable_bitField0_ & 0x00000100) != 0)) {
          halfVal_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000200) != 0)) {
          boolVal_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_descriptor;
    }

    @java.lang.Override
    protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nd4j.ir.TensorNamespace.TensorProto.class, org.nd4j.ir.TensorNamespace.TensorProto.Builder.class);
    }

    /**
     * <pre>
     * Location of the data for this tensor. MUST be one of:
     * - DEFAULT - data stored inside the protobuf message. Data is stored in raw_data (if set) otherwise in type-specified field.
     * - EXTERNAL - data stored in an external location as described by external_data field.
     * </pre>
     *
     * Protobuf enum {@code org.nd4j.ir.TensorProto.DataLocation}
     */
    public enum DataLocation
        implements org.nd4j.shade.protobuf.ProtocolMessageEnum {
      /**
       * <code>DEFAULT = 0;</code>
       */
      DEFAULT(0),
      /**
       * <code>EXTERNAL = 1;</code>
       */
      EXTERNAL(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>DEFAULT = 0;</code>
       */
      public static final int DEFAULT_VALUE = 0;
      /**
       * <code>EXTERNAL = 1;</code>
       */
      public static final int EXTERNAL_VALUE = 1;


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
      public static DataLocation valueOf(int value) {
        return forNumber(value);
      }

      public static DataLocation forNumber(int value) {
        switch (value) {
          case 0: return DEFAULT;
          case 1: return EXTERNAL;
          default: return null;
        }
      }

      public static org.nd4j.shade.protobuf.Internal.EnumLiteMap<DataLocation>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.nd4j.shade.protobuf.Internal.EnumLiteMap<
          DataLocation> internalValueMap =
            new org.nd4j.shade.protobuf.Internal.EnumLiteMap<DataLocation>() {
              public DataLocation findValueByNumber(int number) {
                return DataLocation.forNumber(number);
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
        return org.nd4j.ir.TensorNamespace.TensorProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final DataLocation[] VALUES = values();

      public static DataLocation valueOf(
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

      private DataLocation(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:org.nd4j.ir.TensorProto.DataLocation)
    }

    public interface SegmentOrBuilder extends
        // @@protoc_insertion_point(interface_extends:org.nd4j.ir.TensorProto.Segment)
        org.nd4j.shade.protobuf.MessageOrBuilder {

      /**
       * <code>int64 begin = 1;</code>
       */
      long getBegin();

      /**
       * <code>int64 end = 2;</code>
       */
      long getEnd();
    }
    /**
     * <pre>
     * For very large tensors, we may want to store them in chunks, in which
     * case the following fields will specify the segment that is stored in
     * the current TensorProto.
     * </pre>
     *
     * Protobuf type {@code org.nd4j.ir.TensorProto.Segment}
     */
    public  static final class Segment extends
        org.nd4j.shade.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:org.nd4j.ir.TensorProto.Segment)
        SegmentOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Segment.newBuilder() to construct.
      private Segment(org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Segment() {
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new Segment();
      }

      @java.lang.Override
      public final org.nd4j.shade.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Segment(
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
              case 8: {

                begin_ = input.readInt64();
                break;
              }
              case 16: {

                end_ = input.readInt64();
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
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_Segment_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_Segment_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.TensorProto.Segment.class, org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder.class);
      }

      public static final int BEGIN_FIELD_NUMBER = 1;
      private long begin_;
      /**
       * <code>int64 begin = 1;</code>
       */
      public long getBegin() {
        return begin_;
      }

      public static final int END_FIELD_NUMBER = 2;
      private long end_;
      /**
       * <code>int64 end = 2;</code>
       */
      public long getEnd() {
        return end_;
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
        if (begin_ != 0L) {
          output.writeInt64(1, begin_);
        }
        if (end_ != 0L) {
          output.writeInt64(2, end_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (begin_ != 0L) {
          size += org.nd4j.shade.protobuf.CodedOutputStream
            .computeInt64Size(1, begin_);
        }
        if (end_ != 0L) {
          size += org.nd4j.shade.protobuf.CodedOutputStream
            .computeInt64Size(2, end_);
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
        if (!(obj instanceof org.nd4j.ir.TensorNamespace.TensorProto.Segment)) {
          return super.equals(obj);
        }
        org.nd4j.ir.TensorNamespace.TensorProto.Segment other = (org.nd4j.ir.TensorNamespace.TensorProto.Segment) obj;

        if (getBegin()
            != other.getBegin()) return false;
        if (getEnd()
            != other.getEnd()) return false;
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
        hash = (37 * hash) + BEGIN_FIELD_NUMBER;
        hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashLong(
            getBegin());
        hash = (37 * hash) + END_FIELD_NUMBER;
        hash = (53 * hash) + org.nd4j.shade.protobuf.Internal.hashLong(
            getEnd());
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
          java.nio.ByteBuffer data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
          java.nio.ByteBuffer data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
          org.nd4j.shade.protobuf.ByteString data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
          org.nd4j.shade.protobuf.ByteString data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(byte[] data)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
          byte[] data,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
          java.io.InputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseDelimitedFrom(
          java.io.InputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
          org.nd4j.shade.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return org.nd4j.shade.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment parseFrom(
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
      public static Builder newBuilder(org.nd4j.ir.TensorNamespace.TensorProto.Segment prototype) {
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
       * For very large tensors, we may want to store them in chunks, in which
       * case the following fields will specify the segment that is stored in
       * the current TensorProto.
       * </pre>
       *
       * Protobuf type {@code org.nd4j.ir.TensorProto.Segment}
       */
      public static final class Builder extends
          org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:org.nd4j.ir.TensorProto.Segment)
          org.nd4j.ir.TensorNamespace.TensorProto.SegmentOrBuilder {
        public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_Segment_descriptor;
        }

        @java.lang.Override
        protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_Segment_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  org.nd4j.ir.TensorNamespace.TensorProto.Segment.class, org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder.class);
        }

        // Construct using org.nd4j.ir.TensorNamespace.TensorProto.Segment.newBuilder()
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
          begin_ = 0L;

          end_ = 0L;

          return this;
        }

        @java.lang.Override
        public org.nd4j.shade.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_Segment_descriptor;
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TensorProto.Segment getDefaultInstanceForType() {
          return org.nd4j.ir.TensorNamespace.TensorProto.Segment.getDefaultInstance();
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TensorProto.Segment build() {
          org.nd4j.ir.TensorNamespace.TensorProto.Segment result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public org.nd4j.ir.TensorNamespace.TensorProto.Segment buildPartial() {
          org.nd4j.ir.TensorNamespace.TensorProto.Segment result = new org.nd4j.ir.TensorNamespace.TensorProto.Segment(this);
          result.begin_ = begin_;
          result.end_ = end_;
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
          if (other instanceof org.nd4j.ir.TensorNamespace.TensorProto.Segment) {
            return mergeFrom((org.nd4j.ir.TensorNamespace.TensorProto.Segment)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(org.nd4j.ir.TensorNamespace.TensorProto.Segment other) {
          if (other == org.nd4j.ir.TensorNamespace.TensorProto.Segment.getDefaultInstance()) return this;
          if (other.getBegin() != 0L) {
            setBegin(other.getBegin());
          }
          if (other.getEnd() != 0L) {
            setEnd(other.getEnd());
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
          org.nd4j.ir.TensorNamespace.TensorProto.Segment parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (org.nd4j.ir.TensorNamespace.TensorProto.Segment) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private long begin_ ;
        /**
         * <code>int64 begin = 1;</code>
         */
        public long getBegin() {
          return begin_;
        }
        /**
         * <code>int64 begin = 1;</code>
         */
        public Builder setBegin(long value) {
          
          begin_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>int64 begin = 1;</code>
         */
        public Builder clearBegin() {
          
          begin_ = 0L;
          onChanged();
          return this;
        }

        private long end_ ;
        /**
         * <code>int64 end = 2;</code>
         */
        public long getEnd() {
          return end_;
        }
        /**
         * <code>int64 end = 2;</code>
         */
        public Builder setEnd(long value) {
          
          end_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>int64 end = 2;</code>
         */
        public Builder clearEnd() {
          
          end_ = 0L;
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


        // @@protoc_insertion_point(builder_scope:org.nd4j.ir.TensorProto.Segment)
      }

      // @@protoc_insertion_point(class_scope:org.nd4j.ir.TensorProto.Segment)
      private static final org.nd4j.ir.TensorNamespace.TensorProto.Segment DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.TensorProto.Segment();
      }

      public static org.nd4j.ir.TensorNamespace.TensorProto.Segment getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final org.nd4j.shade.protobuf.Parser<Segment>
          PARSER = new org.nd4j.shade.protobuf.AbstractParser<Segment>() {
        @java.lang.Override
        public Segment parsePartialFrom(
            org.nd4j.shade.protobuf.CodedInputStream input,
            org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
            throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
          return new Segment(input, extensionRegistry);
        }
      };

      public static org.nd4j.shade.protobuf.Parser<Segment> parser() {
        return PARSER;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Parser<Segment> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorProto.Segment getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public static final int DIMS_FIELD_NUMBER = 1;
    private org.nd4j.shade.protobuf.Internal.LongList dims_;
    /**
     * <pre>
     * The shape of the tensor.
     * </pre>
     *
     * <code>repeated int64 dims = 1;</code>
     */
    public java.util.List<java.lang.Long>
        getDimsList() {
      return dims_;
    }
    /**
     * <pre>
     * The shape of the tensor.
     * </pre>
     *
     * <code>repeated int64 dims = 1;</code>
     */
    public int getDimsCount() {
      return dims_.size();
    }
    /**
     * <pre>
     * The shape of the tensor.
     * </pre>
     *
     * <code>repeated int64 dims = 1;</code>
     */
    public long getDims(int index) {
      return dims_.getLong(index);
    }
    private int dimsMemoizedSerializedSize = -1;

    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private int dataType_;
    /**
     * <pre>
     * The data type of the tensor.
     * This field MUST have a valid TensorProto.DataType value
     * </pre>
     *
     * <code>int32 data_type = 2;</code>
     */
    public int getDataType() {
      return dataType_;
    }

    public static final int SEGMENT_FIELD_NUMBER = 3;
    private org.nd4j.ir.TensorNamespace.TensorProto.Segment segment_;
    /**
     * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
     */
    public boolean hasSegment() {
      return segment_ != null;
    }
    /**
     * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorProto.Segment getSegment() {
      return segment_ == null ? org.nd4j.ir.TensorNamespace.TensorProto.Segment.getDefaultInstance() : segment_;
    }
    /**
     * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorProto.SegmentOrBuilder getSegmentOrBuilder() {
      return getSegment();
    }

    public static final int FLOAT_DATA_FIELD_NUMBER = 4;
    private org.nd4j.shade.protobuf.Internal.FloatList floatData_;
    /**
     * <pre>
     * For float and complex64 values
     * Complex64 tensors are encoded as a single array of floats,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
     * </pre>
     *
     * <code>repeated float float_data = 4 [packed = true];</code>
     */
    public java.util.List<java.lang.Float>
        getFloatDataList() {
      return floatData_;
    }
    /**
     * <pre>
     * For float and complex64 values
     * Complex64 tensors are encoded as a single array of floats,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
     * </pre>
     *
     * <code>repeated float float_data = 4 [packed = true];</code>
     */
    public int getFloatDataCount() {
      return floatData_.size();
    }
    /**
     * <pre>
     * For float and complex64 values
     * Complex64 tensors are encoded as a single array of floats,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
     * </pre>
     *
     * <code>repeated float float_data = 4 [packed = true];</code>
     */
    public float getFloatData(int index) {
      return floatData_.getFloat(index);
    }
    private int floatDataMemoizedSerializedSize = -1;

    public static final int INT32_DATA_FIELD_NUMBER = 5;
    private org.nd4j.shade.protobuf.Internal.IntList int32Data_;
    /**
     * <pre>
     * For int32, uint8, int8, uint16, int16, bool, and float16 values
     * float16 values must be bit-wise converted to an uint16_t prior
     * to writing to the buffer.
     * When this field is present, the data_type field MUST be
     * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
     * </pre>
     *
     * <code>repeated int32 int32_data = 5 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getInt32DataList() {
      return int32Data_;
    }
    /**
     * <pre>
     * For int32, uint8, int8, uint16, int16, bool, and float16 values
     * float16 values must be bit-wise converted to an uint16_t prior
     * to writing to the buffer.
     * When this field is present, the data_type field MUST be
     * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
     * </pre>
     *
     * <code>repeated int32 int32_data = 5 [packed = true];</code>
     */
    public int getInt32DataCount() {
      return int32Data_.size();
    }
    /**
     * <pre>
     * For int32, uint8, int8, uint16, int16, bool, and float16 values
     * float16 values must be bit-wise converted to an uint16_t prior
     * to writing to the buffer.
     * When this field is present, the data_type field MUST be
     * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
     * </pre>
     *
     * <code>repeated int32 int32_data = 5 [packed = true];</code>
     */
    public int getInt32Data(int index) {
      return int32Data_.getInt(index);
    }
    private int int32DataMemoizedSerializedSize = -1;

    public static final int STRING_DATA_FIELD_NUMBER = 6;
    private java.util.List<org.nd4j.shade.protobuf.ByteString> stringData_;
    /**
     * <pre>
     * For strings.
     * Each element of string_data is a UTF-8 encoded Unicode
     * string. No trailing null, no leading BOM. The protobuf "string"
     * scalar type is not used to match ML community conventions.
     * When this field is present, the data_type field MUST be STRING
     * </pre>
     *
     * <code>repeated bytes string_data = 6;</code>
     */
    public java.util.List<org.nd4j.shade.protobuf.ByteString>
        getStringDataList() {
      return stringData_;
    }
    /**
     * <pre>
     * For strings.
     * Each element of string_data is a UTF-8 encoded Unicode
     * string. No trailing null, no leading BOM. The protobuf "string"
     * scalar type is not used to match ML community conventions.
     * When this field is present, the data_type field MUST be STRING
     * </pre>
     *
     * <code>repeated bytes string_data = 6;</code>
     */
    public int getStringDataCount() {
      return stringData_.size();
    }
    /**
     * <pre>
     * For strings.
     * Each element of string_data is a UTF-8 encoded Unicode
     * string. No trailing null, no leading BOM. The protobuf "string"
     * scalar type is not used to match ML community conventions.
     * When this field is present, the data_type field MUST be STRING
     * </pre>
     *
     * <code>repeated bytes string_data = 6;</code>
     */
    public org.nd4j.shade.protobuf.ByteString getStringData(int index) {
      return stringData_.get(index);
    }

    public static final int INT64_DATA_FIELD_NUMBER = 7;
    private org.nd4j.shade.protobuf.Internal.LongList int64Data_;
    /**
     * <pre>
     * For int64.
     * When this field is present, the data_type field MUST be INT64
     * </pre>
     *
     * <code>repeated int64 int64_data = 7 [packed = true];</code>
     */
    public java.util.List<java.lang.Long>
        getInt64DataList() {
      return int64Data_;
    }
    /**
     * <pre>
     * For int64.
     * When this field is present, the data_type field MUST be INT64
     * </pre>
     *
     * <code>repeated int64 int64_data = 7 [packed = true];</code>
     */
    public int getInt64DataCount() {
      return int64Data_.size();
    }
    /**
     * <pre>
     * For int64.
     * When this field is present, the data_type field MUST be INT64
     * </pre>
     *
     * <code>repeated int64 int64_data = 7 [packed = true];</code>
     */
    public long getInt64Data(int index) {
      return int64Data_.getLong(index);
    }
    private int int64DataMemoizedSerializedSize = -1;

    public static final int NAME_FIELD_NUMBER = 8;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Optionally, a name for the tensor.
     * </pre>
     *
     * <code>string name = 8;</code>
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
     * <pre>
     * Optionally, a name for the tensor.
     * </pre>
     *
     * <code>string name = 8;</code>
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

    public static final int DOC_STRING_FIELD_NUMBER = 12;
    private volatile java.lang.Object docString_;
    /**
     * <pre>
     * A human-readable documentation for this tensor. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 12;</code>
     */
    public java.lang.String getDocString() {
      java.lang.Object ref = docString_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.nd4j.shade.protobuf.ByteString bs = 
            (org.nd4j.shade.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        docString_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * A human-readable documentation for this tensor. Markdown is allowed.
     * </pre>
     *
     * <code>string doc_string = 12;</code>
     */
    public org.nd4j.shade.protobuf.ByteString
        getDocStringBytes() {
      java.lang.Object ref = docString_;
      if (ref instanceof java.lang.String) {
        org.nd4j.shade.protobuf.ByteString b = 
            org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        docString_ = b;
        return b;
      } else {
        return (org.nd4j.shade.protobuf.ByteString) ref;
      }
    }

    public static final int RAW_DATA_FIELD_NUMBER = 9;
    private org.nd4j.shade.protobuf.ByteString rawData_;
    /**
     * <pre>
     * Serializations can either use one of the fields above, or use this
     * raw bytes field. The only exception is the string case, where one is
     * required to store the content in the repeated bytes string_data field.
     * When this raw_data field is used to store tensor value, elements MUST
     * be stored in as fixed-width, little-endian order.
     * Floating-point data types MUST be stored in IEEE 754 format.
     * Complex64 elements must be written as two consecutive FLOAT values, real component first.
     * Complex128 elements must be written as two consecutive DOUBLE values, real component first.
     * Boolean type MUST be written one byte per tensor element (00000001 for true, 00000000 for false).
     * Note: the advantage of specific field rather than the raw_data field is
     * that in some cases (e.g. int data), protobuf does a better packing via
     * variable length storage, and may lead to smaller binary footprint.
     * When this field is present, the data_type field MUST NOT be STRING or UNDEFINED
     * </pre>
     *
     * <code>bytes raw_data = 9;</code>
     */
    public org.nd4j.shade.protobuf.ByteString getRawData() {
      return rawData_;
    }

    public static final int EXTERNAL_DATA_FIELD_NUMBER = 13;
    private java.util.List<org.nd4j.ir.TensorNamespace.StringStringEntryProto> externalData_;
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    public java.util.List<org.nd4j.ir.TensorNamespace.StringStringEntryProto> getExternalDataList() {
      return externalData_;
    }
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    public java.util.List<? extends org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder> 
        getExternalDataOrBuilderList() {
      return externalData_;
    }
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    public int getExternalDataCount() {
      return externalData_.size();
    }
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    public org.nd4j.ir.TensorNamespace.StringStringEntryProto getExternalData(int index) {
      return externalData_.get(index);
    }
    /**
     * <pre>
     * Data can be stored inside the protobuf file using type-specific fields or raw_data.
     * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
     * external_data stores key-value pairs describing data location. Recognized keys are:
     * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
     *                           protobuf model was stored
     * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
     *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
     * - "length" (optional) - number of bytes containing data. Integer stored as string.
     * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
     * </pre>
     *
     * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
     */
    public org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder getExternalDataOrBuilder(
        int index) {
      return externalData_.get(index);
    }

    public static final int DATA_LOCATION_FIELD_NUMBER = 14;
    private int dataLocation_;
    /**
     * <pre>
     * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
     * </pre>
     *
     * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
     */
    public int getDataLocationValue() {
      return dataLocation_;
    }
    /**
     * <pre>
     * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
     * </pre>
     *
     * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
     */
    public org.nd4j.ir.TensorNamespace.TensorProto.DataLocation getDataLocation() {
      @SuppressWarnings("deprecation")
      org.nd4j.ir.TensorNamespace.TensorProto.DataLocation result = org.nd4j.ir.TensorNamespace.TensorProto.DataLocation.valueOf(dataLocation_);
      return result == null ? org.nd4j.ir.TensorNamespace.TensorProto.DataLocation.UNRECOGNIZED : result;
    }

    public static final int DOUBLE_DATA_FIELD_NUMBER = 10;
    private org.nd4j.shade.protobuf.Internal.DoubleList doubleData_;
    /**
     * <pre>
     * For double
     * Complex128 tensors are encoded as a single array of doubles,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
     * </pre>
     *
     * <code>repeated double double_data = 10 [packed = true];</code>
     */
    public java.util.List<java.lang.Double>
        getDoubleDataList() {
      return doubleData_;
    }
    /**
     * <pre>
     * For double
     * Complex128 tensors are encoded as a single array of doubles,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
     * </pre>
     *
     * <code>repeated double double_data = 10 [packed = true];</code>
     */
    public int getDoubleDataCount() {
      return doubleData_.size();
    }
    /**
     * <pre>
     * For double
     * Complex128 tensors are encoded as a single array of doubles,
     * with the real components appearing in odd numbered positions,
     * and the corresponding imaginary component appearing in the
     * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
     * is encoded as [1.0, 2.0 ,3.0 ,4.0]
     * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
     * </pre>
     *
     * <code>repeated double double_data = 10 [packed = true];</code>
     */
    public double getDoubleData(int index) {
      return doubleData_.getDouble(index);
    }
    private int doubleDataMemoizedSerializedSize = -1;

    public static final int UINT64_DATA_FIELD_NUMBER = 11;
    private org.nd4j.shade.protobuf.Internal.LongList uint64Data_;
    /**
     * <pre>
     * For uint64 and uint32 values
     * When this field is present, the data_type field MUST be
     * UINT32 or UINT64
     * </pre>
     *
     * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
     */
    public java.util.List<java.lang.Long>
        getUint64DataList() {
      return uint64Data_;
    }
    /**
     * <pre>
     * For uint64 and uint32 values
     * When this field is present, the data_type field MUST be
     * UINT32 or UINT64
     * </pre>
     *
     * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
     */
    public int getUint64DataCount() {
      return uint64Data_.size();
    }
    /**
     * <pre>
     * For uint64 and uint32 values
     * When this field is present, the data_type field MUST be
     * UINT32 or UINT64
     * </pre>
     *
     * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
     */
    public long getUint64Data(int index) {
      return uint64Data_.getLong(index);
    }
    private int uint64DataMemoizedSerializedSize = -1;

    public static final int HALF_VAL_FIELD_NUMBER = 15;
    private org.nd4j.shade.protobuf.Internal.IntList halfVal_;
    /**
     * <pre>
     * For half values (tensorflow compatibility)
     * </pre>
     *
     * <code>repeated int32 half_val = 15 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getHalfValList() {
      return halfVal_;
    }
    /**
     * <pre>
     * For half values (tensorflow compatibility)
     * </pre>
     *
     * <code>repeated int32 half_val = 15 [packed = true];</code>
     */
    public int getHalfValCount() {
      return halfVal_.size();
    }
    /**
     * <pre>
     * For half values (tensorflow compatibility)
     * </pre>
     *
     * <code>repeated int32 half_val = 15 [packed = true];</code>
     */
    public int getHalfVal(int index) {
      return halfVal_.getInt(index);
    }
    private int halfValMemoizedSerializedSize = -1;

    public static final int BOOL_VAL_FIELD_NUMBER = 16;
    private org.nd4j.shade.protobuf.Internal.BooleanList boolVal_;
    /**
     * <pre>
     *boolean values
     * </pre>
     *
     * <code>repeated bool bool_val = 16 [packed = true];</code>
     */
    public java.util.List<java.lang.Boolean>
        getBoolValList() {
      return boolVal_;
    }
    /**
     * <pre>
     *boolean values
     * </pre>
     *
     * <code>repeated bool bool_val = 16 [packed = true];</code>
     */
    public int getBoolValCount() {
      return boolVal_.size();
    }
    /**
     * <pre>
     *boolean values
     * </pre>
     *
     * <code>repeated bool bool_val = 16 [packed = true];</code>
     */
    public boolean getBoolVal(int index) {
      return boolVal_.getBoolean(index);
    }
    private int boolValMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getDimsList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(dimsMemoizedSerializedSize);
      }
      for (int i = 0; i < dims_.size(); i++) {
        output.writeInt64NoTag(dims_.getLong(i));
      }
      if (dataType_ != 0) {
        output.writeInt32(2, dataType_);
      }
      if (segment_ != null) {
        output.writeMessage(3, getSegment());
      }
      if (getFloatDataList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(floatDataMemoizedSerializedSize);
      }
      for (int i = 0; i < floatData_.size(); i++) {
        output.writeFloatNoTag(floatData_.getFloat(i));
      }
      if (getInt32DataList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(int32DataMemoizedSerializedSize);
      }
      for (int i = 0; i < int32Data_.size(); i++) {
        output.writeInt32NoTag(int32Data_.getInt(i));
      }
      for (int i = 0; i < stringData_.size(); i++) {
        output.writeBytes(6, stringData_.get(i));
      }
      if (getInt64DataList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(int64DataMemoizedSerializedSize);
      }
      for (int i = 0; i < int64Data_.size(); i++) {
        output.writeInt64NoTag(int64Data_.getLong(i));
      }
      if (!getNameBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 8, name_);
      }
      if (!rawData_.isEmpty()) {
        output.writeBytes(9, rawData_);
      }
      if (getDoubleDataList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(doubleDataMemoizedSerializedSize);
      }
      for (int i = 0; i < doubleData_.size(); i++) {
        output.writeDoubleNoTag(doubleData_.getDouble(i));
      }
      if (getUint64DataList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(uint64DataMemoizedSerializedSize);
      }
      for (int i = 0; i < uint64Data_.size(); i++) {
        output.writeUInt64NoTag(uint64Data_.getLong(i));
      }
      if (!getDocStringBytes().isEmpty()) {
        org.nd4j.shade.protobuf.GeneratedMessageV3.writeString(output, 12, docString_);
      }
      for (int i = 0; i < externalData_.size(); i++) {
        output.writeMessage(13, externalData_.get(i));
      }
      if (dataLocation_ != org.nd4j.ir.TensorNamespace.TensorProto.DataLocation.DEFAULT.getNumber()) {
        output.writeEnum(14, dataLocation_);
      }
      if (getHalfValList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(halfValMemoizedSerializedSize);
      }
      for (int i = 0; i < halfVal_.size(); i++) {
        output.writeInt32NoTag(halfVal_.getInt(i));
      }
      if (getBoolValList().size() > 0) {
        output.writeUInt32NoTag(130);
        output.writeUInt32NoTag(boolValMemoizedSerializedSize);
      }
      for (int i = 0; i < boolVal_.size(); i++) {
        output.writeBoolNoTag(boolVal_.getBoolean(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < dims_.size(); i++) {
          dataSize += org.nd4j.shade.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(dims_.getLong(i));
        }
        size += dataSize;
        if (!getDimsList().isEmpty()) {
          size += 1;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dimsMemoizedSerializedSize = dataSize;
      }
      if (dataType_ != 0) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeInt32Size(2, dataType_);
      }
      if (segment_ != null) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(3, getSegment());
      }
      {
        int dataSize = 0;
        dataSize = 4 * getFloatDataList().size();
        size += dataSize;
        if (!getFloatDataList().isEmpty()) {
          size += 1;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        floatDataMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < int32Data_.size(); i++) {
          dataSize += org.nd4j.shade.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(int32Data_.getInt(i));
        }
        size += dataSize;
        if (!getInt32DataList().isEmpty()) {
          size += 1;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        int32DataMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < stringData_.size(); i++) {
          dataSize += org.nd4j.shade.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(stringData_.get(i));
        }
        size += dataSize;
        size += 1 * getStringDataList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < int64Data_.size(); i++) {
          dataSize += org.nd4j.shade.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(int64Data_.getLong(i));
        }
        size += dataSize;
        if (!getInt64DataList().isEmpty()) {
          size += 1;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        int64DataMemoizedSerializedSize = dataSize;
      }
      if (!getNameBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(8, name_);
      }
      if (!rawData_.isEmpty()) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeBytesSize(9, rawData_);
      }
      {
        int dataSize = 0;
        dataSize = 8 * getDoubleDataList().size();
        size += dataSize;
        if (!getDoubleDataList().isEmpty()) {
          size += 1;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        doubleDataMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < uint64Data_.size(); i++) {
          dataSize += org.nd4j.shade.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(uint64Data_.getLong(i));
        }
        size += dataSize;
        if (!getUint64DataList().isEmpty()) {
          size += 1;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        uint64DataMemoizedSerializedSize = dataSize;
      }
      if (!getDocStringBytes().isEmpty()) {
        size += org.nd4j.shade.protobuf.GeneratedMessageV3.computeStringSize(12, docString_);
      }
      for (int i = 0; i < externalData_.size(); i++) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeMessageSize(13, externalData_.get(i));
      }
      if (dataLocation_ != org.nd4j.ir.TensorNamespace.TensorProto.DataLocation.DEFAULT.getNumber()) {
        size += org.nd4j.shade.protobuf.CodedOutputStream
          .computeEnumSize(14, dataLocation_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < halfVal_.size(); i++) {
          dataSize += org.nd4j.shade.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(halfVal_.getInt(i));
        }
        size += dataSize;
        if (!getHalfValList().isEmpty()) {
          size += 1;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        halfValMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        dataSize = 1 * getBoolValList().size();
        size += dataSize;
        if (!getBoolValList().isEmpty()) {
          size += 2;
          size += org.nd4j.shade.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        boolValMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof org.nd4j.ir.TensorNamespace.TensorProto)) {
        return super.equals(obj);
      }
      org.nd4j.ir.TensorNamespace.TensorProto other = (org.nd4j.ir.TensorNamespace.TensorProto) obj;

      if (!getDimsList()
          .equals(other.getDimsList())) return false;
      if (getDataType()
          != other.getDataType()) return false;
      if (hasSegment() != other.hasSegment()) return false;
      if (hasSegment()) {
        if (!getSegment()
            .equals(other.getSegment())) return false;
      }
      if (!getFloatDataList()
          .equals(other.getFloatDataList())) return false;
      if (!getInt32DataList()
          .equals(other.getInt32DataList())) return false;
      if (!getStringDataList()
          .equals(other.getStringDataList())) return false;
      if (!getInt64DataList()
          .equals(other.getInt64DataList())) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!getDocString()
          .equals(other.getDocString())) return false;
      if (!getRawData()
          .equals(other.getRawData())) return false;
      if (!getExternalDataList()
          .equals(other.getExternalDataList())) return false;
      if (dataLocation_ != other.dataLocation_) return false;
      if (!getDoubleDataList()
          .equals(other.getDoubleDataList())) return false;
      if (!getUint64DataList()
          .equals(other.getUint64DataList())) return false;
      if (!getHalfValList()
          .equals(other.getHalfValList())) return false;
      if (!getBoolValList()
          .equals(other.getBoolValList())) return false;
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
      if (getDimsCount() > 0) {
        hash = (37 * hash) + DIMS_FIELD_NUMBER;
        hash = (53 * hash) + getDimsList().hashCode();
      }
      hash = (37 * hash) + DATA_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getDataType();
      if (hasSegment()) {
        hash = (37 * hash) + SEGMENT_FIELD_NUMBER;
        hash = (53 * hash) + getSegment().hashCode();
      }
      if (getFloatDataCount() > 0) {
        hash = (37 * hash) + FLOAT_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getFloatDataList().hashCode();
      }
      if (getInt32DataCount() > 0) {
        hash = (37 * hash) + INT32_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getInt32DataList().hashCode();
      }
      if (getStringDataCount() > 0) {
        hash = (37 * hash) + STRING_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getStringDataList().hashCode();
      }
      if (getInt64DataCount() > 0) {
        hash = (37 * hash) + INT64_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getInt64DataList().hashCode();
      }
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + DOC_STRING_FIELD_NUMBER;
      hash = (53 * hash) + getDocString().hashCode();
      hash = (37 * hash) + RAW_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getRawData().hashCode();
      if (getExternalDataCount() > 0) {
        hash = (37 * hash) + EXTERNAL_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getExternalDataList().hashCode();
      }
      hash = (37 * hash) + DATA_LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + dataLocation_;
      if (getDoubleDataCount() > 0) {
        hash = (37 * hash) + DOUBLE_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getDoubleDataList().hashCode();
      }
      if (getUint64DataCount() > 0) {
        hash = (37 * hash) + UINT64_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getUint64DataList().hashCode();
      }
      if (getHalfValCount() > 0) {
        hash = (37 * hash) + HALF_VAL_FIELD_NUMBER;
        hash = (53 * hash) + getHalfValList().hashCode();
      }
      if (getBoolValCount() > 0) {
        hash = (37 * hash) + BOOL_VAL_FIELD_NUMBER;
        hash = (53 * hash) + getBoolValList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
        java.nio.ByteBuffer data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
        org.nd4j.shade.protobuf.ByteString data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(byte[] data)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
        byte[] data,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseDelimitedFrom(
        java.io.InputStream input,
        org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
        org.nd4j.shade.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.nd4j.shade.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.nd4j.ir.TensorNamespace.TensorProto parseFrom(
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
    public static Builder newBuilder(org.nd4j.ir.TensorNamespace.TensorProto prototype) {
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
     * Tensors
     * A serialized tensor value.
     * </pre>
     *
     * Protobuf type {@code org.nd4j.ir.TensorProto}
     */
    public static final class Builder extends
        org.nd4j.shade.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.nd4j.ir.TensorProto)
        org.nd4j.ir.TensorNamespace.TensorProtoOrBuilder {
      public static final org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_descriptor;
      }

      @java.lang.Override
      protected org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.nd4j.ir.TensorNamespace.TensorProto.class, org.nd4j.ir.TensorNamespace.TensorProto.Builder.class);
      }

      // Construct using org.nd4j.ir.TensorNamespace.TensorProto.newBuilder()
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
          getExternalDataFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dims_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dataType_ = 0;

        if (segmentBuilder_ == null) {
          segment_ = null;
        } else {
          segment_ = null;
          segmentBuilder_ = null;
        }
        floatData_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        int32Data_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
        stringData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        int64Data_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000010);
        name_ = "";

        docString_ = "";

        rawData_ = org.nd4j.shade.protobuf.ByteString.EMPTY;

        if (externalDataBuilder_ == null) {
          externalData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          externalDataBuilder_.clear();
        }
        dataLocation_ = 0;

        doubleData_ = emptyDoubleList();
        bitField0_ = (bitField0_ & ~0x00000040);
        uint64Data_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000080);
        halfVal_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000100);
        boolVal_ = emptyBooleanList();
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      @java.lang.Override
      public org.nd4j.shade.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.nd4j.ir.TensorNamespace.internal_static_org_nd4j_ir_TensorProto_descriptor;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorProto getDefaultInstanceForType() {
        return org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorProto build() {
        org.nd4j.ir.TensorNamespace.TensorProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.nd4j.ir.TensorNamespace.TensorProto buildPartial() {
        org.nd4j.ir.TensorNamespace.TensorProto result = new org.nd4j.ir.TensorNamespace.TensorProto(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          dims_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dims_ = dims_;
        result.dataType_ = dataType_;
        if (segmentBuilder_ == null) {
          result.segment_ = segment_;
        } else {
          result.segment_ = segmentBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          floatData_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.floatData_ = floatData_;
        if (((bitField0_ & 0x00000004) != 0)) {
          int32Data_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.int32Data_ = int32Data_;
        if (((bitField0_ & 0x00000008) != 0)) {
          stringData_ = java.util.Collections.unmodifiableList(stringData_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.stringData_ = stringData_;
        if (((bitField0_ & 0x00000010) != 0)) {
          int64Data_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.int64Data_ = int64Data_;
        result.name_ = name_;
        result.docString_ = docString_;
        result.rawData_ = rawData_;
        if (externalDataBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0)) {
            externalData_ = java.util.Collections.unmodifiableList(externalData_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.externalData_ = externalData_;
        } else {
          result.externalData_ = externalDataBuilder_.build();
        }
        result.dataLocation_ = dataLocation_;
        if (((bitField0_ & 0x00000040) != 0)) {
          doubleData_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.doubleData_ = doubleData_;
        if (((bitField0_ & 0x00000080) != 0)) {
          uint64Data_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000080);
        }
        result.uint64Data_ = uint64Data_;
        if (((bitField0_ & 0x00000100) != 0)) {
          halfVal_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000100);
        }
        result.halfVal_ = halfVal_;
        if (((bitField0_ & 0x00000200) != 0)) {
          boolVal_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000200);
        }
        result.boolVal_ = boolVal_;
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
        if (other instanceof org.nd4j.ir.TensorNamespace.TensorProto) {
          return mergeFrom((org.nd4j.ir.TensorNamespace.TensorProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.nd4j.ir.TensorNamespace.TensorProto other) {
        if (other == org.nd4j.ir.TensorNamespace.TensorProto.getDefaultInstance()) return this;
        if (!other.dims_.isEmpty()) {
          if (dims_.isEmpty()) {
            dims_ = other.dims_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDimsIsMutable();
            dims_.addAll(other.dims_);
          }
          onChanged();
        }
        if (other.getDataType() != 0) {
          setDataType(other.getDataType());
        }
        if (other.hasSegment()) {
          mergeSegment(other.getSegment());
        }
        if (!other.floatData_.isEmpty()) {
          if (floatData_.isEmpty()) {
            floatData_ = other.floatData_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFloatDataIsMutable();
            floatData_.addAll(other.floatData_);
          }
          onChanged();
        }
        if (!other.int32Data_.isEmpty()) {
          if (int32Data_.isEmpty()) {
            int32Data_ = other.int32Data_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureInt32DataIsMutable();
            int32Data_.addAll(other.int32Data_);
          }
          onChanged();
        }
        if (!other.stringData_.isEmpty()) {
          if (stringData_.isEmpty()) {
            stringData_ = other.stringData_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureStringDataIsMutable();
            stringData_.addAll(other.stringData_);
          }
          onChanged();
        }
        if (!other.int64Data_.isEmpty()) {
          if (int64Data_.isEmpty()) {
            int64Data_ = other.int64Data_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureInt64DataIsMutable();
            int64Data_.addAll(other.int64Data_);
          }
          onChanged();
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getDocString().isEmpty()) {
          docString_ = other.docString_;
          onChanged();
        }
        if (other.getRawData() != org.nd4j.shade.protobuf.ByteString.EMPTY) {
          setRawData(other.getRawData());
        }
        if (externalDataBuilder_ == null) {
          if (!other.externalData_.isEmpty()) {
            if (externalData_.isEmpty()) {
              externalData_ = other.externalData_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureExternalDataIsMutable();
              externalData_.addAll(other.externalData_);
            }
            onChanged();
          }
        } else {
          if (!other.externalData_.isEmpty()) {
            if (externalDataBuilder_.isEmpty()) {
              externalDataBuilder_.dispose();
              externalDataBuilder_ = null;
              externalData_ = other.externalData_;
              bitField0_ = (bitField0_ & ~0x00000020);
              externalDataBuilder_ = 
                org.nd4j.shade.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getExternalDataFieldBuilder() : null;
            } else {
              externalDataBuilder_.addAllMessages(other.externalData_);
            }
          }
        }
        if (other.dataLocation_ != 0) {
          setDataLocationValue(other.getDataLocationValue());
        }
        if (!other.doubleData_.isEmpty()) {
          if (doubleData_.isEmpty()) {
            doubleData_ = other.doubleData_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureDoubleDataIsMutable();
            doubleData_.addAll(other.doubleData_);
          }
          onChanged();
        }
        if (!other.uint64Data_.isEmpty()) {
          if (uint64Data_.isEmpty()) {
            uint64Data_ = other.uint64Data_;
            bitField0_ = (bitField0_ & ~0x00000080);
          } else {
            ensureUint64DataIsMutable();
            uint64Data_.addAll(other.uint64Data_);
          }
          onChanged();
        }
        if (!other.halfVal_.isEmpty()) {
          if (halfVal_.isEmpty()) {
            halfVal_ = other.halfVal_;
            bitField0_ = (bitField0_ & ~0x00000100);
          } else {
            ensureHalfValIsMutable();
            halfVal_.addAll(other.halfVal_);
          }
          onChanged();
        }
        if (!other.boolVal_.isEmpty()) {
          if (boolVal_.isEmpty()) {
            boolVal_ = other.boolVal_;
            bitField0_ = (bitField0_ & ~0x00000200);
          } else {
            ensureBoolValIsMutable();
            boolVal_.addAll(other.boolVal_);
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
        org.nd4j.ir.TensorNamespace.TensorProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.nd4j.shade.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.nd4j.ir.TensorNamespace.TensorProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.nd4j.shade.protobuf.Internal.LongList dims_ = emptyLongList();
      private void ensureDimsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dims_ = mutableCopy(dims_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <pre>
       * The shape of the tensor.
       * </pre>
       *
       * <code>repeated int64 dims = 1;</code>
       */
      public java.util.List<java.lang.Long>
          getDimsList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(dims_) : dims_;
      }
      /**
       * <pre>
       * The shape of the tensor.
       * </pre>
       *
       * <code>repeated int64 dims = 1;</code>
       */
      public int getDimsCount() {
        return dims_.size();
      }
      /**
       * <pre>
       * The shape of the tensor.
       * </pre>
       *
       * <code>repeated int64 dims = 1;</code>
       */
      public long getDims(int index) {
        return dims_.getLong(index);
      }
      /**
       * <pre>
       * The shape of the tensor.
       * </pre>
       *
       * <code>repeated int64 dims = 1;</code>
       */
      public Builder setDims(
          int index, long value) {
        ensureDimsIsMutable();
        dims_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The shape of the tensor.
       * </pre>
       *
       * <code>repeated int64 dims = 1;</code>
       */
      public Builder addDims(long value) {
        ensureDimsIsMutable();
        dims_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The shape of the tensor.
       * </pre>
       *
       * <code>repeated int64 dims = 1;</code>
       */
      public Builder addAllDims(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureDimsIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, dims_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The shape of the tensor.
       * </pre>
       *
       * <code>repeated int64 dims = 1;</code>
       */
      public Builder clearDims() {
        dims_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dataType_ ;
      /**
       * <pre>
       * The data type of the tensor.
       * This field MUST have a valid TensorProto.DataType value
       * </pre>
       *
       * <code>int32 data_type = 2;</code>
       */
      public int getDataType() {
        return dataType_;
      }
      /**
       * <pre>
       * The data type of the tensor.
       * This field MUST have a valid TensorProto.DataType value
       * </pre>
       *
       * <code>int32 data_type = 2;</code>
       */
      public Builder setDataType(int value) {
        
        dataType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The data type of the tensor.
       * This field MUST have a valid TensorProto.DataType value
       * </pre>
       *
       * <code>int32 data_type = 2;</code>
       */
      public Builder clearDataType() {
        
        dataType_ = 0;
        onChanged();
        return this;
      }

      private org.nd4j.ir.TensorNamespace.TensorProto.Segment segment_;
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorProto.Segment, org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder, org.nd4j.ir.TensorNamespace.TensorProto.SegmentOrBuilder> segmentBuilder_;
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public boolean hasSegment() {
        return segmentBuilder_ != null || segment_ != null;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto.Segment getSegment() {
        if (segmentBuilder_ == null) {
          return segment_ == null ? org.nd4j.ir.TensorNamespace.TensorProto.Segment.getDefaultInstance() : segment_;
        } else {
          return segmentBuilder_.getMessage();
        }
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public Builder setSegment(org.nd4j.ir.TensorNamespace.TensorProto.Segment value) {
        if (segmentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          segment_ = value;
          onChanged();
        } else {
          segmentBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public Builder setSegment(
          org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder builderForValue) {
        if (segmentBuilder_ == null) {
          segment_ = builderForValue.build();
          onChanged();
        } else {
          segmentBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public Builder mergeSegment(org.nd4j.ir.TensorNamespace.TensorProto.Segment value) {
        if (segmentBuilder_ == null) {
          if (segment_ != null) {
            segment_ =
              org.nd4j.ir.TensorNamespace.TensorProto.Segment.newBuilder(segment_).mergeFrom(value).buildPartial();
          } else {
            segment_ = value;
          }
          onChanged();
        } else {
          segmentBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public Builder clearSegment() {
        if (segmentBuilder_ == null) {
          segment_ = null;
          onChanged();
        } else {
          segment_ = null;
          segmentBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder getSegmentBuilder() {
        
        onChanged();
        return getSegmentFieldBuilder().getBuilder();
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto.SegmentOrBuilder getSegmentOrBuilder() {
        if (segmentBuilder_ != null) {
          return segmentBuilder_.getMessageOrBuilder();
        } else {
          return segment_ == null ?
              org.nd4j.ir.TensorNamespace.TensorProto.Segment.getDefaultInstance() : segment_;
        }
      }
      /**
       * <code>.org.nd4j.ir.TensorProto.Segment segment = 3;</code>
       */
      private org.nd4j.shade.protobuf.SingleFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.TensorProto.Segment, org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder, org.nd4j.ir.TensorNamespace.TensorProto.SegmentOrBuilder> 
          getSegmentFieldBuilder() {
        if (segmentBuilder_ == null) {
          segmentBuilder_ = new org.nd4j.shade.protobuf.SingleFieldBuilderV3<
              org.nd4j.ir.TensorNamespace.TensorProto.Segment, org.nd4j.ir.TensorNamespace.TensorProto.Segment.Builder, org.nd4j.ir.TensorNamespace.TensorProto.SegmentOrBuilder>(
                  getSegment(),
                  getParentForChildren(),
                  isClean());
          segment_ = null;
        }
        return segmentBuilder_;
      }

      private org.nd4j.shade.protobuf.Internal.FloatList floatData_ = emptyFloatList();
      private void ensureFloatDataIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          floatData_ = mutableCopy(floatData_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       * For float and complex64 values
       * Complex64 tensors are encoded as a single array of floats,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
       * </pre>
       *
       * <code>repeated float float_data = 4 [packed = true];</code>
       */
      public java.util.List<java.lang.Float>
          getFloatDataList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(floatData_) : floatData_;
      }
      /**
       * <pre>
       * For float and complex64 values
       * Complex64 tensors are encoded as a single array of floats,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
       * </pre>
       *
       * <code>repeated float float_data = 4 [packed = true];</code>
       */
      public int getFloatDataCount() {
        return floatData_.size();
      }
      /**
       * <pre>
       * For float and complex64 values
       * Complex64 tensors are encoded as a single array of floats,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
       * </pre>
       *
       * <code>repeated float float_data = 4 [packed = true];</code>
       */
      public float getFloatData(int index) {
        return floatData_.getFloat(index);
      }
      /**
       * <pre>
       * For float and complex64 values
       * Complex64 tensors are encoded as a single array of floats,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
       * </pre>
       *
       * <code>repeated float float_data = 4 [packed = true];</code>
       */
      public Builder setFloatData(
          int index, float value) {
        ensureFloatDataIsMutable();
        floatData_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For float and complex64 values
       * Complex64 tensors are encoded as a single array of floats,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
       * </pre>
       *
       * <code>repeated float float_data = 4 [packed = true];</code>
       */
      public Builder addFloatData(float value) {
        ensureFloatDataIsMutable();
        floatData_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For float and complex64 values
       * Complex64 tensors are encoded as a single array of floats,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
       * </pre>
       *
       * <code>repeated float float_data = 4 [packed = true];</code>
       */
      public Builder addAllFloatData(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureFloatDataIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, floatData_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For float and complex64 values
       * Complex64 tensors are encoded as a single array of floats,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be FLOAT or COMPLEX64.
       * </pre>
       *
       * <code>repeated float float_data = 4 [packed = true];</code>
       */
      public Builder clearFloatData() {
        floatData_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.Internal.IntList int32Data_ = emptyIntList();
      private void ensureInt32DataIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          int32Data_ = mutableCopy(int32Data_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <pre>
       * For int32, uint8, int8, uint16, int16, bool, and float16 values
       * float16 values must be bit-wise converted to an uint16_t prior
       * to writing to the buffer.
       * When this field is present, the data_type field MUST be
       * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
       * </pre>
       *
       * <code>repeated int32 int32_data = 5 [packed = true];</code>
       */
      public java.util.List<java.lang.Integer>
          getInt32DataList() {
        return ((bitField0_ & 0x00000004) != 0) ?
                 java.util.Collections.unmodifiableList(int32Data_) : int32Data_;
      }
      /**
       * <pre>
       * For int32, uint8, int8, uint16, int16, bool, and float16 values
       * float16 values must be bit-wise converted to an uint16_t prior
       * to writing to the buffer.
       * When this field is present, the data_type field MUST be
       * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
       * </pre>
       *
       * <code>repeated int32 int32_data = 5 [packed = true];</code>
       */
      public int getInt32DataCount() {
        return int32Data_.size();
      }
      /**
       * <pre>
       * For int32, uint8, int8, uint16, int16, bool, and float16 values
       * float16 values must be bit-wise converted to an uint16_t prior
       * to writing to the buffer.
       * When this field is present, the data_type field MUST be
       * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
       * </pre>
       *
       * <code>repeated int32 int32_data = 5 [packed = true];</code>
       */
      public int getInt32Data(int index) {
        return int32Data_.getInt(index);
      }
      /**
       * <pre>
       * For int32, uint8, int8, uint16, int16, bool, and float16 values
       * float16 values must be bit-wise converted to an uint16_t prior
       * to writing to the buffer.
       * When this field is present, the data_type field MUST be
       * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
       * </pre>
       *
       * <code>repeated int32 int32_data = 5 [packed = true];</code>
       */
      public Builder setInt32Data(
          int index, int value) {
        ensureInt32DataIsMutable();
        int32Data_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For int32, uint8, int8, uint16, int16, bool, and float16 values
       * float16 values must be bit-wise converted to an uint16_t prior
       * to writing to the buffer.
       * When this field is present, the data_type field MUST be
       * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
       * </pre>
       *
       * <code>repeated int32 int32_data = 5 [packed = true];</code>
       */
      public Builder addInt32Data(int value) {
        ensureInt32DataIsMutable();
        int32Data_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For int32, uint8, int8, uint16, int16, bool, and float16 values
       * float16 values must be bit-wise converted to an uint16_t prior
       * to writing to the buffer.
       * When this field is present, the data_type field MUST be
       * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
       * </pre>
       *
       * <code>repeated int32 int32_data = 5 [packed = true];</code>
       */
      public Builder addAllInt32Data(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureInt32DataIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, int32Data_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For int32, uint8, int8, uint16, int16, bool, and float16 values
       * float16 values must be bit-wise converted to an uint16_t prior
       * to writing to the buffer.
       * When this field is present, the data_type field MUST be
       * INT32, INT16, INT8, UINT16, UINT8, BOOL, or FLOAT16
       * </pre>
       *
       * <code>repeated int32 int32_data = 5 [packed = true];</code>
       */
      public Builder clearInt32Data() {
        int32Data_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      private java.util.List<org.nd4j.shade.protobuf.ByteString> stringData_ = java.util.Collections.emptyList();
      private void ensureStringDataIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          stringData_ = new java.util.ArrayList<org.nd4j.shade.protobuf.ByteString>(stringData_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <pre>
       * For strings.
       * Each element of string_data is a UTF-8 encoded Unicode
       * string. No trailing null, no leading BOM. The protobuf "string"
       * scalar type is not used to match ML community conventions.
       * When this field is present, the data_type field MUST be STRING
       * </pre>
       *
       * <code>repeated bytes string_data = 6;</code>
       */
      public java.util.List<org.nd4j.shade.protobuf.ByteString>
          getStringDataList() {
        return ((bitField0_ & 0x00000008) != 0) ?
                 java.util.Collections.unmodifiableList(stringData_) : stringData_;
      }
      /**
       * <pre>
       * For strings.
       * Each element of string_data is a UTF-8 encoded Unicode
       * string. No trailing null, no leading BOM. The protobuf "string"
       * scalar type is not used to match ML community conventions.
       * When this field is present, the data_type field MUST be STRING
       * </pre>
       *
       * <code>repeated bytes string_data = 6;</code>
       */
      public int getStringDataCount() {
        return stringData_.size();
      }
      /**
       * <pre>
       * For strings.
       * Each element of string_data is a UTF-8 encoded Unicode
       * string. No trailing null, no leading BOM. The protobuf "string"
       * scalar type is not used to match ML community conventions.
       * When this field is present, the data_type field MUST be STRING
       * </pre>
       *
       * <code>repeated bytes string_data = 6;</code>
       */
      public org.nd4j.shade.protobuf.ByteString getStringData(int index) {
        return stringData_.get(index);
      }
      /**
       * <pre>
       * For strings.
       * Each element of string_data is a UTF-8 encoded Unicode
       * string. No trailing null, no leading BOM. The protobuf "string"
       * scalar type is not used to match ML community conventions.
       * When this field is present, the data_type field MUST be STRING
       * </pre>
       *
       * <code>repeated bytes string_data = 6;</code>
       */
      public Builder setStringData(
          int index, org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStringDataIsMutable();
        stringData_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For strings.
       * Each element of string_data is a UTF-8 encoded Unicode
       * string. No trailing null, no leading BOM. The protobuf "string"
       * scalar type is not used to match ML community conventions.
       * When this field is present, the data_type field MUST be STRING
       * </pre>
       *
       * <code>repeated bytes string_data = 6;</code>
       */
      public Builder addStringData(org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStringDataIsMutable();
        stringData_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For strings.
       * Each element of string_data is a UTF-8 encoded Unicode
       * string. No trailing null, no leading BOM. The protobuf "string"
       * scalar type is not used to match ML community conventions.
       * When this field is present, the data_type field MUST be STRING
       * </pre>
       *
       * <code>repeated bytes string_data = 6;</code>
       */
      public Builder addAllStringData(
          java.lang.Iterable<? extends org.nd4j.shade.protobuf.ByteString> values) {
        ensureStringDataIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, stringData_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For strings.
       * Each element of string_data is a UTF-8 encoded Unicode
       * string. No trailing null, no leading BOM. The protobuf "string"
       * scalar type is not used to match ML community conventions.
       * When this field is present, the data_type field MUST be STRING
       * </pre>
       *
       * <code>repeated bytes string_data = 6;</code>
       */
      public Builder clearStringData() {
        stringData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.Internal.LongList int64Data_ = emptyLongList();
      private void ensureInt64DataIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          int64Data_ = mutableCopy(int64Data_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <pre>
       * For int64.
       * When this field is present, the data_type field MUST be INT64
       * </pre>
       *
       * <code>repeated int64 int64_data = 7 [packed = true];</code>
       */
      public java.util.List<java.lang.Long>
          getInt64DataList() {
        return ((bitField0_ & 0x00000010) != 0) ?
                 java.util.Collections.unmodifiableList(int64Data_) : int64Data_;
      }
      /**
       * <pre>
       * For int64.
       * When this field is present, the data_type field MUST be INT64
       * </pre>
       *
       * <code>repeated int64 int64_data = 7 [packed = true];</code>
       */
      public int getInt64DataCount() {
        return int64Data_.size();
      }
      /**
       * <pre>
       * For int64.
       * When this field is present, the data_type field MUST be INT64
       * </pre>
       *
       * <code>repeated int64 int64_data = 7 [packed = true];</code>
       */
      public long getInt64Data(int index) {
        return int64Data_.getLong(index);
      }
      /**
       * <pre>
       * For int64.
       * When this field is present, the data_type field MUST be INT64
       * </pre>
       *
       * <code>repeated int64 int64_data = 7 [packed = true];</code>
       */
      public Builder setInt64Data(
          int index, long value) {
        ensureInt64DataIsMutable();
        int64Data_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For int64.
       * When this field is present, the data_type field MUST be INT64
       * </pre>
       *
       * <code>repeated int64 int64_data = 7 [packed = true];</code>
       */
      public Builder addInt64Data(long value) {
        ensureInt64DataIsMutable();
        int64Data_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For int64.
       * When this field is present, the data_type field MUST be INT64
       * </pre>
       *
       * <code>repeated int64 int64_data = 7 [packed = true];</code>
       */
      public Builder addAllInt64Data(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureInt64DataIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, int64Data_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For int64.
       * When this field is present, the data_type field MUST be INT64
       * </pre>
       *
       * <code>repeated int64 int64_data = 7 [packed = true];</code>
       */
      public Builder clearInt64Data() {
        int64Data_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Optionally, a name for the tensor.
       * </pre>
       *
       * <code>string name = 8;</code>
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
       * <pre>
       * Optionally, a name for the tensor.
       * </pre>
       *
       * <code>string name = 8;</code>
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
       * <pre>
       * Optionally, a name for the tensor.
       * </pre>
       *
       * <code>string name = 8;</code>
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
       * <pre>
       * Optionally, a name for the tensor.
       * </pre>
       *
       * <code>string name = 8;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Optionally, a name for the tensor.
       * </pre>
       *
       * <code>string name = 8;</code>
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

      private java.lang.Object docString_ = "";
      /**
       * <pre>
       * A human-readable documentation for this tensor. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 12;</code>
       */
      public java.lang.String getDocString() {
        java.lang.Object ref = docString_;
        if (!(ref instanceof java.lang.String)) {
          org.nd4j.shade.protobuf.ByteString bs =
              (org.nd4j.shade.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          docString_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * A human-readable documentation for this tensor. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 12;</code>
       */
      public org.nd4j.shade.protobuf.ByteString
          getDocStringBytes() {
        java.lang.Object ref = docString_;
        if (ref instanceof String) {
          org.nd4j.shade.protobuf.ByteString b = 
              org.nd4j.shade.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          docString_ = b;
          return b;
        } else {
          return (org.nd4j.shade.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * A human-readable documentation for this tensor. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 12;</code>
       */
      public Builder setDocString(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        docString_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A human-readable documentation for this tensor. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 12;</code>
       */
      public Builder clearDocString() {
        
        docString_ = getDefaultInstance().getDocString();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * A human-readable documentation for this tensor. Markdown is allowed.
       * </pre>
       *
       * <code>string doc_string = 12;</code>
       */
      public Builder setDocStringBytes(
          org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        docString_ = value;
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.ByteString rawData_ = org.nd4j.shade.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Serializations can either use one of the fields above, or use this
       * raw bytes field. The only exception is the string case, where one is
       * required to store the content in the repeated bytes string_data field.
       * When this raw_data field is used to store tensor value, elements MUST
       * be stored in as fixed-width, little-endian order.
       * Floating-point data types MUST be stored in IEEE 754 format.
       * Complex64 elements must be written as two consecutive FLOAT values, real component first.
       * Complex128 elements must be written as two consecutive DOUBLE values, real component first.
       * Boolean type MUST be written one byte per tensor element (00000001 for true, 00000000 for false).
       * Note: the advantage of specific field rather than the raw_data field is
       * that in some cases (e.g. int data), protobuf does a better packing via
       * variable length storage, and may lead to smaller binary footprint.
       * When this field is present, the data_type field MUST NOT be STRING or UNDEFINED
       * </pre>
       *
       * <code>bytes raw_data = 9;</code>
       */
      public org.nd4j.shade.protobuf.ByteString getRawData() {
        return rawData_;
      }
      /**
       * <pre>
       * Serializations can either use one of the fields above, or use this
       * raw bytes field. The only exception is the string case, where one is
       * required to store the content in the repeated bytes string_data field.
       * When this raw_data field is used to store tensor value, elements MUST
       * be stored in as fixed-width, little-endian order.
       * Floating-point data types MUST be stored in IEEE 754 format.
       * Complex64 elements must be written as two consecutive FLOAT values, real component first.
       * Complex128 elements must be written as two consecutive DOUBLE values, real component first.
       * Boolean type MUST be written one byte per tensor element (00000001 for true, 00000000 for false).
       * Note: the advantage of specific field rather than the raw_data field is
       * that in some cases (e.g. int data), protobuf does a better packing via
       * variable length storage, and may lead to smaller binary footprint.
       * When this field is present, the data_type field MUST NOT be STRING or UNDEFINED
       * </pre>
       *
       * <code>bytes raw_data = 9;</code>
       */
      public Builder setRawData(org.nd4j.shade.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        rawData_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Serializations can either use one of the fields above, or use this
       * raw bytes field. The only exception is the string case, where one is
       * required to store the content in the repeated bytes string_data field.
       * When this raw_data field is used to store tensor value, elements MUST
       * be stored in as fixed-width, little-endian order.
       * Floating-point data types MUST be stored in IEEE 754 format.
       * Complex64 elements must be written as two consecutive FLOAT values, real component first.
       * Complex128 elements must be written as two consecutive DOUBLE values, real component first.
       * Boolean type MUST be written one byte per tensor element (00000001 for true, 00000000 for false).
       * Note: the advantage of specific field rather than the raw_data field is
       * that in some cases (e.g. int data), protobuf does a better packing via
       * variable length storage, and may lead to smaller binary footprint.
       * When this field is present, the data_type field MUST NOT be STRING or UNDEFINED
       * </pre>
       *
       * <code>bytes raw_data = 9;</code>
       */
      public Builder clearRawData() {
        
        rawData_ = getDefaultInstance().getRawData();
        onChanged();
        return this;
      }

      private java.util.List<org.nd4j.ir.TensorNamespace.StringStringEntryProto> externalData_ =
        java.util.Collections.emptyList();
      private void ensureExternalDataIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          externalData_ = new java.util.ArrayList<org.nd4j.ir.TensorNamespace.StringStringEntryProto>(externalData_);
          bitField0_ |= 0x00000020;
         }
      }

      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.StringStringEntryProto, org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder, org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder> externalDataBuilder_;

      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public java.util.List<org.nd4j.ir.TensorNamespace.StringStringEntryProto> getExternalDataList() {
        if (externalDataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(externalData_);
        } else {
          return externalDataBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public int getExternalDataCount() {
        if (externalDataBuilder_ == null) {
          return externalData_.size();
        } else {
          return externalDataBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public org.nd4j.ir.TensorNamespace.StringStringEntryProto getExternalData(int index) {
        if (externalDataBuilder_ == null) {
          return externalData_.get(index);
        } else {
          return externalDataBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder setExternalData(
          int index, org.nd4j.ir.TensorNamespace.StringStringEntryProto value) {
        if (externalDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExternalDataIsMutable();
          externalData_.set(index, value);
          onChanged();
        } else {
          externalDataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder setExternalData(
          int index, org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder builderForValue) {
        if (externalDataBuilder_ == null) {
          ensureExternalDataIsMutable();
          externalData_.set(index, builderForValue.build());
          onChanged();
        } else {
          externalDataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder addExternalData(org.nd4j.ir.TensorNamespace.StringStringEntryProto value) {
        if (externalDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExternalDataIsMutable();
          externalData_.add(value);
          onChanged();
        } else {
          externalDataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder addExternalData(
          int index, org.nd4j.ir.TensorNamespace.StringStringEntryProto value) {
        if (externalDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExternalDataIsMutable();
          externalData_.add(index, value);
          onChanged();
        } else {
          externalDataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder addExternalData(
          org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder builderForValue) {
        if (externalDataBuilder_ == null) {
          ensureExternalDataIsMutable();
          externalData_.add(builderForValue.build());
          onChanged();
        } else {
          externalDataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder addExternalData(
          int index, org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder builderForValue) {
        if (externalDataBuilder_ == null) {
          ensureExternalDataIsMutable();
          externalData_.add(index, builderForValue.build());
          onChanged();
        } else {
          externalDataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder addAllExternalData(
          java.lang.Iterable<? extends org.nd4j.ir.TensorNamespace.StringStringEntryProto> values) {
        if (externalDataBuilder_ == null) {
          ensureExternalDataIsMutable();
          org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
              values, externalData_);
          onChanged();
        } else {
          externalDataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder clearExternalData() {
        if (externalDataBuilder_ == null) {
          externalData_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          externalDataBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public Builder removeExternalData(int index) {
        if (externalDataBuilder_ == null) {
          ensureExternalDataIsMutable();
          externalData_.remove(index);
          onChanged();
        } else {
          externalDataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder getExternalDataBuilder(
          int index) {
        return getExternalDataFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder getExternalDataOrBuilder(
          int index) {
        if (externalDataBuilder_ == null) {
          return externalData_.get(index);  } else {
          return externalDataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public java.util.List<? extends org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder> 
           getExternalDataOrBuilderList() {
        if (externalDataBuilder_ != null) {
          return externalDataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(externalData_);
        }
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder addExternalDataBuilder() {
        return getExternalDataFieldBuilder().addBuilder(
            org.nd4j.ir.TensorNamespace.StringStringEntryProto.getDefaultInstance());
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder addExternalDataBuilder(
          int index) {
        return getExternalDataFieldBuilder().addBuilder(
            index, org.nd4j.ir.TensorNamespace.StringStringEntryProto.getDefaultInstance());
      }
      /**
       * <pre>
       * Data can be stored inside the protobuf file using type-specific fields or raw_data.
       * Alternatively, raw bytes data can be stored in an external file, using the external_data field.
       * external_data stores key-value pairs describing data location. Recognized keys are:
       * - "location" (required) - POSIX filesystem path relative to the directory where the ONNX
       *                           protobuf model was stored
       * - "offset" (optional) - position of byte at which stored data begins. Integer stored as string.
       *                         Offset values SHOULD be multiples 4096 (page size) to enable mmap support.
       * - "length" (optional) - number of bytes containing data. Integer stored as string.
       * - "checksum" (optional) - SHA1 digest of file specified in under 'location' key.
       * </pre>
       *
       * <code>repeated .org.nd4j.ir.StringStringEntryProto external_data = 13;</code>
       */
      public java.util.List<org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder> 
           getExternalDataBuilderList() {
        return getExternalDataFieldBuilder().getBuilderList();
      }
      private org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
          org.nd4j.ir.TensorNamespace.StringStringEntryProto, org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder, org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder> 
          getExternalDataFieldBuilder() {
        if (externalDataBuilder_ == null) {
          externalDataBuilder_ = new org.nd4j.shade.protobuf.RepeatedFieldBuilderV3<
              org.nd4j.ir.TensorNamespace.StringStringEntryProto, org.nd4j.ir.TensorNamespace.StringStringEntryProto.Builder, org.nd4j.ir.TensorNamespace.StringStringEntryProtoOrBuilder>(
                  externalData_,
                  ((bitField0_ & 0x00000020) != 0),
                  getParentForChildren(),
                  isClean());
          externalData_ = null;
        }
        return externalDataBuilder_;
      }

      private int dataLocation_ = 0;
      /**
       * <pre>
       * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
       * </pre>
       *
       * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
       */
      public int getDataLocationValue() {
        return dataLocation_;
      }
      /**
       * <pre>
       * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
       * </pre>
       *
       * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
       */
      public Builder setDataLocationValue(int value) {
        dataLocation_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
       * </pre>
       *
       * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
       */
      public org.nd4j.ir.TensorNamespace.TensorProto.DataLocation getDataLocation() {
        @SuppressWarnings("deprecation")
        org.nd4j.ir.TensorNamespace.TensorProto.DataLocation result = org.nd4j.ir.TensorNamespace.TensorProto.DataLocation.valueOf(dataLocation_);
        return result == null ? org.nd4j.ir.TensorNamespace.TensorProto.DataLocation.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
       * </pre>
       *
       * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
       */
      public Builder setDataLocation(org.nd4j.ir.TensorNamespace.TensorProto.DataLocation value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dataLocation_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If value not set, data is stored in raw_data (if set) otherwise in type-specified field.
       * </pre>
       *
       * <code>.org.nd4j.ir.TensorProto.DataLocation data_location = 14;</code>
       */
      public Builder clearDataLocation() {
        
        dataLocation_ = 0;
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.Internal.DoubleList doubleData_ = emptyDoubleList();
      private void ensureDoubleDataIsMutable() {
        if (!((bitField0_ & 0x00000040) != 0)) {
          doubleData_ = mutableCopy(doubleData_);
          bitField0_ |= 0x00000040;
         }
      }
      /**
       * <pre>
       * For double
       * Complex128 tensors are encoded as a single array of doubles,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
       * </pre>
       *
       * <code>repeated double double_data = 10 [packed = true];</code>
       */
      public java.util.List<java.lang.Double>
          getDoubleDataList() {
        return ((bitField0_ & 0x00000040) != 0) ?
                 java.util.Collections.unmodifiableList(doubleData_) : doubleData_;
      }
      /**
       * <pre>
       * For double
       * Complex128 tensors are encoded as a single array of doubles,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
       * </pre>
       *
       * <code>repeated double double_data = 10 [packed = true];</code>
       */
      public int getDoubleDataCount() {
        return doubleData_.size();
      }
      /**
       * <pre>
       * For double
       * Complex128 tensors are encoded as a single array of doubles,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
       * </pre>
       *
       * <code>repeated double double_data = 10 [packed = true];</code>
       */
      public double getDoubleData(int index) {
        return doubleData_.getDouble(index);
      }
      /**
       * <pre>
       * For double
       * Complex128 tensors are encoded as a single array of doubles,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
       * </pre>
       *
       * <code>repeated double double_data = 10 [packed = true];</code>
       */
      public Builder setDoubleData(
          int index, double value) {
        ensureDoubleDataIsMutable();
        doubleData_.setDouble(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For double
       * Complex128 tensors are encoded as a single array of doubles,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
       * </pre>
       *
       * <code>repeated double double_data = 10 [packed = true];</code>
       */
      public Builder addDoubleData(double value) {
        ensureDoubleDataIsMutable();
        doubleData_.addDouble(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For double
       * Complex128 tensors are encoded as a single array of doubles,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
       * </pre>
       *
       * <code>repeated double double_data = 10 [packed = true];</code>
       */
      public Builder addAllDoubleData(
          java.lang.Iterable<? extends java.lang.Double> values) {
        ensureDoubleDataIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, doubleData_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For double
       * Complex128 tensors are encoded as a single array of doubles,
       * with the real components appearing in odd numbered positions,
       * and the corresponding imaginary component appearing in the
       * subsequent even numbered position. (e.g., [1.0 + 2.0i, 3.0 + 4.0i]
       * is encoded as [1.0, 2.0 ,3.0 ,4.0]
       * When this field is present, the data_type field MUST be DOUBLE or COMPLEX128
       * </pre>
       *
       * <code>repeated double double_data = 10 [packed = true];</code>
       */
      public Builder clearDoubleData() {
        doubleData_ = emptyDoubleList();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.Internal.LongList uint64Data_ = emptyLongList();
      private void ensureUint64DataIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          uint64Data_ = mutableCopy(uint64Data_);
          bitField0_ |= 0x00000080;
         }
      }
      /**
       * <pre>
       * For uint64 and uint32 values
       * When this field is present, the data_type field MUST be
       * UINT32 or UINT64
       * </pre>
       *
       * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
       */
      public java.util.List<java.lang.Long>
          getUint64DataList() {
        return ((bitField0_ & 0x00000080) != 0) ?
                 java.util.Collections.unmodifiableList(uint64Data_) : uint64Data_;
      }
      /**
       * <pre>
       * For uint64 and uint32 values
       * When this field is present, the data_type field MUST be
       * UINT32 or UINT64
       * </pre>
       *
       * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
       */
      public int getUint64DataCount() {
        return uint64Data_.size();
      }
      /**
       * <pre>
       * For uint64 and uint32 values
       * When this field is present, the data_type field MUST be
       * UINT32 or UINT64
       * </pre>
       *
       * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
       */
      public long getUint64Data(int index) {
        return uint64Data_.getLong(index);
      }
      /**
       * <pre>
       * For uint64 and uint32 values
       * When this field is present, the data_type field MUST be
       * UINT32 or UINT64
       * </pre>
       *
       * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
       */
      public Builder setUint64Data(
          int index, long value) {
        ensureUint64DataIsMutable();
        uint64Data_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For uint64 and uint32 values
       * When this field is present, the data_type field MUST be
       * UINT32 or UINT64
       * </pre>
       *
       * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
       */
      public Builder addUint64Data(long value) {
        ensureUint64DataIsMutable();
        uint64Data_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For uint64 and uint32 values
       * When this field is present, the data_type field MUST be
       * UINT32 or UINT64
       * </pre>
       *
       * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
       */
      public Builder addAllUint64Data(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureUint64DataIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, uint64Data_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For uint64 and uint32 values
       * When this field is present, the data_type field MUST be
       * UINT32 or UINT64
       * </pre>
       *
       * <code>repeated uint64 uint64_data = 11 [packed = true];</code>
       */
      public Builder clearUint64Data() {
        uint64Data_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000080);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.Internal.IntList halfVal_ = emptyIntList();
      private void ensureHalfValIsMutable() {
        if (!((bitField0_ & 0x00000100) != 0)) {
          halfVal_ = mutableCopy(halfVal_);
          bitField0_ |= 0x00000100;
         }
      }
      /**
       * <pre>
       * For half values (tensorflow compatibility)
       * </pre>
       *
       * <code>repeated int32 half_val = 15 [packed = true];</code>
       */
      public java.util.List<java.lang.Integer>
          getHalfValList() {
        return ((bitField0_ & 0x00000100) != 0) ?
                 java.util.Collections.unmodifiableList(halfVal_) : halfVal_;
      }
      /**
       * <pre>
       * For half values (tensorflow compatibility)
       * </pre>
       *
       * <code>repeated int32 half_val = 15 [packed = true];</code>
       */
      public int getHalfValCount() {
        return halfVal_.size();
      }
      /**
       * <pre>
       * For half values (tensorflow compatibility)
       * </pre>
       *
       * <code>repeated int32 half_val = 15 [packed = true];</code>
       */
      public int getHalfVal(int index) {
        return halfVal_.getInt(index);
      }
      /**
       * <pre>
       * For half values (tensorflow compatibility)
       * </pre>
       *
       * <code>repeated int32 half_val = 15 [packed = true];</code>
       */
      public Builder setHalfVal(
          int index, int value) {
        ensureHalfValIsMutable();
        halfVal_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For half values (tensorflow compatibility)
       * </pre>
       *
       * <code>repeated int32 half_val = 15 [packed = true];</code>
       */
      public Builder addHalfVal(int value) {
        ensureHalfValIsMutable();
        halfVal_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For half values (tensorflow compatibility)
       * </pre>
       *
       * <code>repeated int32 half_val = 15 [packed = true];</code>
       */
      public Builder addAllHalfVal(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureHalfValIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, halfVal_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * For half values (tensorflow compatibility)
       * </pre>
       *
       * <code>repeated int32 half_val = 15 [packed = true];</code>
       */
      public Builder clearHalfVal() {
        halfVal_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000100);
        onChanged();
        return this;
      }

      private org.nd4j.shade.protobuf.Internal.BooleanList boolVal_ = emptyBooleanList();
      private void ensureBoolValIsMutable() {
        if (!((bitField0_ & 0x00000200) != 0)) {
          boolVal_ = mutableCopy(boolVal_);
          bitField0_ |= 0x00000200;
         }
      }
      /**
       * <pre>
       *boolean values
       * </pre>
       *
       * <code>repeated bool bool_val = 16 [packed = true];</code>
       */
      public java.util.List<java.lang.Boolean>
          getBoolValList() {
        return ((bitField0_ & 0x00000200) != 0) ?
                 java.util.Collections.unmodifiableList(boolVal_) : boolVal_;
      }
      /**
       * <pre>
       *boolean values
       * </pre>
       *
       * <code>repeated bool bool_val = 16 [packed = true];</code>
       */
      public int getBoolValCount() {
        return boolVal_.size();
      }
      /**
       * <pre>
       *boolean values
       * </pre>
       *
       * <code>repeated bool bool_val = 16 [packed = true];</code>
       */
      public boolean getBoolVal(int index) {
        return boolVal_.getBoolean(index);
      }
      /**
       * <pre>
       *boolean values
       * </pre>
       *
       * <code>repeated bool bool_val = 16 [packed = true];</code>
       */
      public Builder setBoolVal(
          int index, boolean value) {
        ensureBoolValIsMutable();
        boolVal_.setBoolean(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *boolean values
       * </pre>
       *
       * <code>repeated bool bool_val = 16 [packed = true];</code>
       */
      public Builder addBoolVal(boolean value) {
        ensureBoolValIsMutable();
        boolVal_.addBoolean(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *boolean values
       * </pre>
       *
       * <code>repeated bool bool_val = 16 [packed = true];</code>
       */
      public Builder addAllBoolVal(
          java.lang.Iterable<? extends java.lang.Boolean> values) {
        ensureBoolValIsMutable();
        org.nd4j.shade.protobuf.AbstractMessageLite.Builder.addAll(
            values, boolVal_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *boolean values
       * </pre>
       *
       * <code>repeated bool bool_val = 16 [packed = true];</code>
       */
      public Builder clearBoolVal() {
        boolVal_ = emptyBooleanList();
        bitField0_ = (bitField0_ & ~0x00000200);
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


      // @@protoc_insertion_point(builder_scope:org.nd4j.ir.TensorProto)
    }

    // @@protoc_insertion_point(class_scope:org.nd4j.ir.TensorProto)
    private static final org.nd4j.ir.TensorNamespace.TensorProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.nd4j.ir.TensorNamespace.TensorProto();
    }

    public static org.nd4j.ir.TensorNamespace.TensorProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final org.nd4j.shade.protobuf.Parser<TensorProto>
        PARSER = new org.nd4j.shade.protobuf.AbstractParser<TensorProto>() {
      @java.lang.Override
      public TensorProto parsePartialFrom(
          org.nd4j.shade.protobuf.CodedInputStream input,
          org.nd4j.shade.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.nd4j.shade.protobuf.InvalidProtocolBufferException {
        return new TensorProto(input, extensionRegistry);
      }
    };

    public static org.nd4j.shade.protobuf.Parser<TensorProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.shade.protobuf.Parser<TensorProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.nd4j.ir.TensorNamespace.TensorProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_StringStringEntryProto_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_StringStringEntryProto_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_TypeProto_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_TypeProto_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_TensorShapeProto_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_TensorShapeProto_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_TensorShapeProto_Dimension_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_TensorShapeProto_Dimension_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_ValueInfoProto_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_ValueInfoProto_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_TensorProto_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_TensorProto_fieldAccessorTable;
  private static final org.nd4j.shade.protobuf.Descriptors.Descriptor
    internal_static_org_nd4j_ir_TensorProto_Segment_descriptor;
  private static final 
    org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_nd4j_ir_TensorProto_Segment_fieldAccessorTable;

  public static org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014tensor.proto\022\013org.nd4j.ir\"4\n\026StringStr" +
      "ingEntryProto\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(" +
      "\t\"\300\001\n\tTypeProto\022>\n\013tensor_type\030\001 \001(\0132\'.o" +
      "rg.nd4j.ir.TypeProto.TensorDescriptorH\000\032" +
      "j\n\020TensorDescriptor\022(\n\telem_type\030\001 \001(\0162\025" +
      ".org.nd4j.ir.DataType\022,\n\005shape\030\002 \001(\0132\035.o" +
      "rg.nd4j.ir.TensorShapeProtoB\007\n\005value\"\210\001\n" +
      "\020TensorShapeProto\0224\n\003dim\030\001 \003(\0132\'.org.nd4" +
      "j.ir.TensorShapeProto.Dimension\032>\n\tDimen" +
      "sion\022\023\n\tdim_value\030\001 \001(\003H\000\022\023\n\tdim_param\030\002" +
      " \001(\tH\000B\007\n\005value\"X\n\016ValueInfoProto\022\014\n\004nam" +
      "e\030\001 \001(\t\022$\n\004type\030\002 \001(\0132\026.org.nd4j.ir.Type" +
      "Proto\022\022\n\ndoc_string\030\003 \001(\t\"\234\004\n\013TensorProt" +
      "o\022\014\n\004dims\030\001 \003(\003\022\021\n\tdata_type\030\002 \001(\005\0221\n\007se" +
      "gment\030\003 \001(\0132 .org.nd4j.ir.TensorProto.Se" +
      "gment\022\026\n\nfloat_data\030\004 \003(\002B\002\020\001\022\026\n\nint32_d" +
      "ata\030\005 \003(\005B\002\020\001\022\023\n\013string_data\030\006 \003(\014\022\026\n\nin" +
      "t64_data\030\007 \003(\003B\002\020\001\022\014\n\004name\030\010 \001(\t\022\022\n\ndoc_" +
      "string\030\014 \001(\t\022\020\n\010raw_data\030\t \001(\014\022:\n\rextern" +
      "al_data\030\r \003(\0132#.org.nd4j.ir.StringString" +
      "EntryProto\022<\n\rdata_location\030\016 \001(\0162%.org." +
      "nd4j.ir.TensorProto.DataLocation\022\027\n\013doub" +
      "le_data\030\n \003(\001B\002\020\001\022\027\n\013uint64_data\030\013 \003(\004B\002" +
      "\020\001\022\024\n\010half_val\030\017 \003(\005B\002\020\001\022\024\n\010bool_val\030\020 \003" +
      "(\010B\002\020\001\032%\n\007Segment\022\r\n\005begin\030\001 \001(\003\022\013\n\003end\030" +
      "\002 \001(\003\")\n\014DataLocation\022\013\n\007DEFAULT\020\000\022\014\n\010EX" +
      "TERNAL\020\001*\332\001\n\010DataType\022\r\n\tUNDEFINED\020\000\022\t\n\005" +
      "FLOAT\020\001\022\t\n\005UINT8\020\002\022\010\n\004INT8\020\003\022\n\n\006UINT16\020\004" +
      "\022\t\n\005INT16\020\005\022\t\n\005INT32\020\006\022\t\n\005INT64\020\007\022\n\n\006STR" +
      "ING\020\010\022\010\n\004BOOL\020\t\022\013\n\007FLOAT16\020\n\022\n\n\006DOUBLE\020\013" +
      "\022\n\n\006UINT32\020\014\022\n\n\006UINT64\020\r\022\r\n\tCOMPLEX64\020\016\022" +
      "\016\n\nCOMPLEX128\020\017\022\014\n\010BFLOAT16\020\020B\021B\017TensorN" +
      "amespaceb\006proto3"
    };
    descriptor = org.nd4j.shade.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.nd4j.shade.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_nd4j_ir_StringStringEntryProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_nd4j_ir_StringStringEntryProto_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_StringStringEntryProto_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_org_nd4j_ir_TypeProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_nd4j_ir_TypeProto_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_TypeProto_descriptor,
        new java.lang.String[] { "TensorType", "Value", });
    internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_descriptor =
      internal_static_org_nd4j_ir_TypeProto_descriptor.getNestedTypes().get(0);
    internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_TypeProto_TensorDescriptor_descriptor,
        new java.lang.String[] { "ElemType", "Shape", });
    internal_static_org_nd4j_ir_TensorShapeProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_nd4j_ir_TensorShapeProto_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_TensorShapeProto_descriptor,
        new java.lang.String[] { "Dim", });
    internal_static_org_nd4j_ir_TensorShapeProto_Dimension_descriptor =
      internal_static_org_nd4j_ir_TensorShapeProto_descriptor.getNestedTypes().get(0);
    internal_static_org_nd4j_ir_TensorShapeProto_Dimension_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_TensorShapeProto_Dimension_descriptor,
        new java.lang.String[] { "DimValue", "DimParam", "Value", });
    internal_static_org_nd4j_ir_ValueInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_nd4j_ir_ValueInfoProto_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_ValueInfoProto_descriptor,
        new java.lang.String[] { "Name", "Type", "DocString", });
    internal_static_org_nd4j_ir_TensorProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_nd4j_ir_TensorProto_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_TensorProto_descriptor,
        new java.lang.String[] { "Dims", "DataType", "Segment", "FloatData", "Int32Data", "StringData", "Int64Data", "Name", "DocString", "RawData", "ExternalData", "DataLocation", "DoubleData", "Uint64Data", "HalfVal", "BoolVal", });
    internal_static_org_nd4j_ir_TensorProto_Segment_descriptor =
      internal_static_org_nd4j_ir_TensorProto_descriptor.getNestedTypes().get(0);
    internal_static_org_nd4j_ir_TensorProto_Segment_fieldAccessorTable = new
      org.nd4j.shade.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_nd4j_ir_TensorProto_Segment_descriptor,
        new java.lang.String[] { "Begin", "End", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
