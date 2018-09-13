// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 * <pre>
 * Response message for [KeyManagementService.AsymmetricDecrypt][google.cloud.kms.v1.KeyManagementService.AsymmetricDecrypt].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.AsymmetricDecryptResponse}
 */
public  final class AsymmetricDecryptResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.AsymmetricDecryptResponse)
    AsymmetricDecryptResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsymmetricDecryptResponse.newBuilder() to construct.
  private AsymmetricDecryptResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsymmetricDecryptResponse() {
    plaintext_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AsymmetricDecryptResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {

            plaintext_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_AsymmetricDecryptResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_AsymmetricDecryptResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.AsymmetricDecryptResponse.class, com.google.cloud.kms.v1.AsymmetricDecryptResponse.Builder.class);
  }

  public static final int PLAINTEXT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString plaintext_;
  /**
   * <pre>
   * The decrypted data originally encrypted with the matching public key.
   * </pre>
   *
   * <code>bytes plaintext = 1;</code>
   */
  public com.google.protobuf.ByteString getPlaintext() {
    return plaintext_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!plaintext_.isEmpty()) {
      output.writeBytes(1, plaintext_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!plaintext_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, plaintext_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.AsymmetricDecryptResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.AsymmetricDecryptResponse other = (com.google.cloud.kms.v1.AsymmetricDecryptResponse) obj;

    boolean result = true;
    result = result && getPlaintext()
        .equals(other.getPlaintext());
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
    hash = (37 * hash) + PLAINTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getPlaintext().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.kms.v1.AsymmetricDecryptResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Response message for [KeyManagementService.AsymmetricDecrypt][google.cloud.kms.v1.KeyManagementService.AsymmetricDecrypt].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.AsymmetricDecryptResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.AsymmetricDecryptResponse)
      com.google.cloud.kms.v1.AsymmetricDecryptResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_AsymmetricDecryptResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_AsymmetricDecryptResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.AsymmetricDecryptResponse.class, com.google.cloud.kms.v1.AsymmetricDecryptResponse.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.AsymmetricDecryptResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      plaintext_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_AsymmetricDecryptResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.AsymmetricDecryptResponse getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.AsymmetricDecryptResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.AsymmetricDecryptResponse build() {
      com.google.cloud.kms.v1.AsymmetricDecryptResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.AsymmetricDecryptResponse buildPartial() {
      com.google.cloud.kms.v1.AsymmetricDecryptResponse result = new com.google.cloud.kms.v1.AsymmetricDecryptResponse(this);
      result.plaintext_ = plaintext_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.AsymmetricDecryptResponse) {
        return mergeFrom((com.google.cloud.kms.v1.AsymmetricDecryptResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.AsymmetricDecryptResponse other) {
      if (other == com.google.cloud.kms.v1.AsymmetricDecryptResponse.getDefaultInstance()) return this;
      if (other.getPlaintext() != com.google.protobuf.ByteString.EMPTY) {
        setPlaintext(other.getPlaintext());
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
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.kms.v1.AsymmetricDecryptResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.AsymmetricDecryptResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString plaintext_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The decrypted data originally encrypted with the matching public key.
     * </pre>
     *
     * <code>bytes plaintext = 1;</code>
     */
    public com.google.protobuf.ByteString getPlaintext() {
      return plaintext_;
    }
    /**
     * <pre>
     * The decrypted data originally encrypted with the matching public key.
     * </pre>
     *
     * <code>bytes plaintext = 1;</code>
     */
    public Builder setPlaintext(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plaintext_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The decrypted data originally encrypted with the matching public key.
     * </pre>
     *
     * <code>bytes plaintext = 1;</code>
     */
    public Builder clearPlaintext() {
      
      plaintext_ = getDefaultInstance().getPlaintext();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.AsymmetricDecryptResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.AsymmetricDecryptResponse)
  private static final com.google.cloud.kms.v1.AsymmetricDecryptResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.AsymmetricDecryptResponse();
  }

  public static com.google.cloud.kms.v1.AsymmetricDecryptResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsymmetricDecryptResponse>
      PARSER = new com.google.protobuf.AbstractParser<AsymmetricDecryptResponse>() {
    @java.lang.Override
    public AsymmetricDecryptResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AsymmetricDecryptResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AsymmetricDecryptResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsymmetricDecryptResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.AsymmetricDecryptResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

