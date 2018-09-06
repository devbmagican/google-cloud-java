// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * A public key format and data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.PublicKeyCredential}
 */
public  final class PublicKeyCredential extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.PublicKeyCredential)
    PublicKeyCredentialOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublicKeyCredential.newBuilder() to construct.
  private PublicKeyCredential(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublicKeyCredential() {
    format_ = 0;
    key_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PublicKeyCredential(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            format_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto.internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.ResourcesProto.internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.PublicKeyCredential.class, com.google.cloud.iot.v1.PublicKeyCredential.Builder.class);
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private int format_;
  /**
   * <pre>
   * The format of the key.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
   */
  public int getFormatValue() {
    return format_;
  }
  /**
   * <pre>
   * The format of the key.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
   */
  public com.google.cloud.iot.v1.PublicKeyFormat getFormat() {
    com.google.cloud.iot.v1.PublicKeyFormat result = com.google.cloud.iot.v1.PublicKeyFormat.valueOf(format_);
    return result == null ? com.google.cloud.iot.v1.PublicKeyFormat.UNRECOGNIZED : result;
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object key_;
  /**
   * <pre>
   * The key data.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The key data.
   * </pre>
   *
   * <code>string key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (format_ != com.google.cloud.iot.v1.PublicKeyFormat.UNSPECIFIED_PUBLIC_KEY_FORMAT.getNumber()) {
      output.writeEnum(1, format_);
    }
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (format_ != com.google.cloud.iot.v1.PublicKeyFormat.UNSPECIFIED_PUBLIC_KEY_FORMAT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, format_);
    }
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.PublicKeyCredential)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.PublicKeyCredential other = (com.google.cloud.iot.v1.PublicKeyCredential) obj;

    boolean result = true;
    result = result && format_ == other.format_;
    result = result && getKey()
        .equals(other.getKey());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + format_;
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.PublicKeyCredential parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.iot.v1.PublicKeyCredential prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A public key format and data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.PublicKeyCredential}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.PublicKeyCredential)
      com.google.cloud.iot.v1.PublicKeyCredentialOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iot.v1.ResourcesProto.internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.ResourcesProto.internal_static_google_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.PublicKeyCredential.class, com.google.cloud.iot.v1.PublicKeyCredential.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.PublicKeyCredential.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      format_ = 0;

      key_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iot.v1.ResourcesProto.internal_static_google_cloud_iot_v1_PublicKeyCredential_descriptor;
    }

    public com.google.cloud.iot.v1.PublicKeyCredential getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.PublicKeyCredential.getDefaultInstance();
    }

    public com.google.cloud.iot.v1.PublicKeyCredential build() {
      com.google.cloud.iot.v1.PublicKeyCredential result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.iot.v1.PublicKeyCredential buildPartial() {
      com.google.cloud.iot.v1.PublicKeyCredential result = new com.google.cloud.iot.v1.PublicKeyCredential(this);
      result.format_ = format_;
      result.key_ = key_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.PublicKeyCredential) {
        return mergeFrom((com.google.cloud.iot.v1.PublicKeyCredential)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.PublicKeyCredential other) {
      if (other == com.google.cloud.iot.v1.PublicKeyCredential.getDefaultInstance()) return this;
      if (other.format_ != 0) {
        setFormatValue(other.getFormatValue());
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.iot.v1.PublicKeyCredential parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.PublicKeyCredential) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int format_ = 0;
    /**
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     */
    public int getFormatValue() {
      return format_;
    }
    /**
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     */
    public Builder setFormatValue(int value) {
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     */
    public com.google.cloud.iot.v1.PublicKeyFormat getFormat() {
      com.google.cloud.iot.v1.PublicKeyFormat result = com.google.cloud.iot.v1.PublicKeyFormat.valueOf(format_);
      return result == null ? com.google.cloud.iot.v1.PublicKeyFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     */
    public Builder setFormat(com.google.cloud.iot.v1.PublicKeyFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     */
    public Builder clearFormat() {
      
      format_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
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
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.PublicKeyCredential)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.PublicKeyCredential)
  private static final com.google.cloud.iot.v1.PublicKeyCredential DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.PublicKeyCredential();
  }

  public static com.google.cloud.iot.v1.PublicKeyCredential getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicKeyCredential>
      PARSER = new com.google.protobuf.AbstractParser<PublicKeyCredential>() {
    public PublicKeyCredential parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PublicKeyCredential(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PublicKeyCredential> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicKeyCredential> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.iot.v1.PublicKeyCredential getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

