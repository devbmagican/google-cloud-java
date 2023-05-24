// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

/**
 * <pre>
 * Config for STREAMING_AUTOML_ACTION_RECOGNITION.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig}
 */
public final class StreamingAutomlActionRecognitionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig)
    StreamingAutomlActionRecognitionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamingAutomlActionRecognitionConfig.newBuilder() to construct.
  private StreamingAutomlActionRecognitionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamingAutomlActionRecognitionConfig() {
    modelName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamingAutomlActionRecognitionConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_StreamingAutomlActionRecognitionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_StreamingAutomlActionRecognitionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig.class, com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig.Builder.class);
  }

  public static final int MODEL_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object modelName_ = "";
  /**
   * <pre>
   * Resource name of AutoML model.
   * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string model_name = 1;</code>
   * @return The modelName.
   */
  @java.lang.Override
  public java.lang.String getModelName() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modelName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of AutoML model.
   * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string model_name = 1;</code>
   * @return The bytes for modelName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    java.lang.Object ref = modelName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, modelName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(modelName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, modelName_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig other = (com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig) obj;

    if (!getModelName()
        .equals(other.getModelName())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MODEL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getModelName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig prototype) {
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
   * Config for STREAMING_AUTOML_ACTION_RECOGNITION.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig)
      com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_StreamingAutomlActionRecognitionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_StreamingAutomlActionRecognitionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig.class, com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      modelName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_StreamingAutomlActionRecognitionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig build() {
      com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig buildPartial() {
      com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig result = new com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.modelName_ = modelName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig) {
        return mergeFrom((com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig other) {
      if (other == com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig.getDefaultInstance()) return this;
      if (!other.getModelName().isEmpty()) {
        modelName_ = other.modelName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              modelName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object modelName_ = "";
    /**
     * <pre>
     * Resource name of AutoML model.
     * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string model_name = 1;</code>
     * @return The modelName.
     */
    public java.lang.String getModelName() {
      java.lang.Object ref = modelName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modelName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of AutoML model.
     * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string model_name = 1;</code>
     * @return The bytes for modelName.
     */
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      java.lang.Object ref = modelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of AutoML model.
     * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string model_name = 1;</code>
     * @param value The modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      modelName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of AutoML model.
     * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string model_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelName() {
      modelName_ = getDefaultInstance().getModelName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of AutoML model.
     * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
     * </pre>
     *
     * <code>string model_name = 1;</code>
     * @param value The bytes for modelName to set.
     * @return This builder for chaining.
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      modelName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig)
  private static final com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig();
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingAutomlActionRecognitionConfig>
      PARSER = new com.google.protobuf.AbstractParser<StreamingAutomlActionRecognitionConfig>() {
    @java.lang.Override
    public StreamingAutomlActionRecognitionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<StreamingAutomlActionRecognitionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingAutomlActionRecognitionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.StreamingAutomlActionRecognitionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

