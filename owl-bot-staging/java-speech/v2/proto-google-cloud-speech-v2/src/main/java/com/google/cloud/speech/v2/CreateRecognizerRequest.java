// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 * <pre>
 * Request message for the
 * [CreateRecognizer][google.cloud.speech.v2.Speech.CreateRecognizer] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.CreateRecognizerRequest}
 */
public final class CreateRecognizerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.CreateRecognizerRequest)
    CreateRecognizerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRecognizerRequest.newBuilder() to construct.
  private CreateRecognizerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRecognizerRequest() {
    recognizerId_ = "";
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRecognizerRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_CreateRecognizerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_CreateRecognizerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.CreateRecognizerRequest.class, com.google.cloud.speech.v2.CreateRecognizerRequest.Builder.class);
  }

  public static final int RECOGNIZER_FIELD_NUMBER = 1;
  private com.google.cloud.speech.v2.Recognizer recognizer_;
  /**
   * <pre>
   * Required. The Recognizer to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the recognizer field is set.
   */
  @java.lang.Override
  public boolean hasRecognizer() {
    return recognizer_ != null;
  }
  /**
   * <pre>
   * Required. The Recognizer to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The recognizer.
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.Recognizer getRecognizer() {
    return recognizer_ == null ? com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
  }
  /**
   * <pre>
   * Required. The Recognizer to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizerOrBuilder() {
    return recognizer_ == null ? com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 2;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * If set, validate the request and preview the Recognizer, but do not
   * actually create it.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  public static final int RECOGNIZER_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object recognizerId_ = "";
  /**
   * <pre>
   * The ID to use for the Recognizer, which will become the final component of
   * the Recognizer's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string recognizer_id = 3;</code>
   * @return The recognizerId.
   */
  @java.lang.Override
  public java.lang.String getRecognizerId() {
    java.lang.Object ref = recognizerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recognizerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID to use for the Recognizer, which will become the final component of
   * the Recognizer's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string recognizer_id = 3;</code>
   * @return The bytes for recognizerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecognizerIdBytes() {
    java.lang.Object ref = recognizerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recognizerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The project and location where this Recognizer will be created.
   * The expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The project and location where this Recognizer will be created.
   * The expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
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
    if (recognizer_ != null) {
      output.writeMessage(1, getRecognizer());
    }
    if (validateOnly_ != false) {
      output.writeBool(2, validateOnly_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recognizerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, recognizerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recognizer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecognizer());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, validateOnly_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recognizerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, recognizerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parent_);
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
    if (!(obj instanceof com.google.cloud.speech.v2.CreateRecognizerRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.CreateRecognizerRequest other = (com.google.cloud.speech.v2.CreateRecognizerRequest) obj;

    if (hasRecognizer() != other.hasRecognizer()) return false;
    if (hasRecognizer()) {
      if (!getRecognizer()
          .equals(other.getRecognizer())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
    if (!getRecognizerId()
        .equals(other.getRecognizerId())) return false;
    if (!getParent()
        .equals(other.getParent())) return false;
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
    if (hasRecognizer()) {
      hash = (37 * hash) + RECOGNIZER_FIELD_NUMBER;
      hash = (53 * hash) + getRecognizer().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (37 * hash) + RECOGNIZER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRecognizerId().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.CreateRecognizerRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v2.CreateRecognizerRequest prototype) {
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
   * Request message for the
   * [CreateRecognizer][google.cloud.speech.v2.Speech.CreateRecognizer] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.CreateRecognizerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.CreateRecognizerRequest)
      com.google.cloud.speech.v2.CreateRecognizerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_CreateRecognizerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_CreateRecognizerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.CreateRecognizerRequest.class, com.google.cloud.speech.v2.CreateRecognizerRequest.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.CreateRecognizerRequest.newBuilder()
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
      recognizer_ = null;
      if (recognizerBuilder_ != null) {
        recognizerBuilder_.dispose();
        recognizerBuilder_ = null;
      }
      validateOnly_ = false;
      recognizerId_ = "";
      parent_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_CreateRecognizerRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.CreateRecognizerRequest getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.CreateRecognizerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.CreateRecognizerRequest build() {
      com.google.cloud.speech.v2.CreateRecognizerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.CreateRecognizerRequest buildPartial() {
      com.google.cloud.speech.v2.CreateRecognizerRequest result = new com.google.cloud.speech.v2.CreateRecognizerRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v2.CreateRecognizerRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recognizer_ = recognizerBuilder_ == null
            ? recognizer_
            : recognizerBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.recognizerId_ = recognizerId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.parent_ = parent_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v2.CreateRecognizerRequest) {
        return mergeFrom((com.google.cloud.speech.v2.CreateRecognizerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.CreateRecognizerRequest other) {
      if (other == com.google.cloud.speech.v2.CreateRecognizerRequest.getDefaultInstance()) return this;
      if (other.hasRecognizer()) {
        mergeRecognizer(other.getRecognizer());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      if (!other.getRecognizerId().isEmpty()) {
        recognizerId_ = other.recognizerId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000008;
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
              input.readMessage(
                  getRecognizerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              recognizerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private com.google.cloud.speech.v2.Recognizer recognizer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v2.Recognizer, com.google.cloud.speech.v2.Recognizer.Builder, com.google.cloud.speech.v2.RecognizerOrBuilder> recognizerBuilder_;
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the recognizer field is set.
     */
    public boolean hasRecognizer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The recognizer.
     */
    public com.google.cloud.speech.v2.Recognizer getRecognizer() {
      if (recognizerBuilder_ == null) {
        return recognizer_ == null ? com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
      } else {
        return recognizerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRecognizer(com.google.cloud.speech.v2.Recognizer value) {
      if (recognizerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recognizer_ = value;
      } else {
        recognizerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRecognizer(
        com.google.cloud.speech.v2.Recognizer.Builder builderForValue) {
      if (recognizerBuilder_ == null) {
        recognizer_ = builderForValue.build();
      } else {
        recognizerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeRecognizer(com.google.cloud.speech.v2.Recognizer value) {
      if (recognizerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          recognizer_ != null &&
          recognizer_ != com.google.cloud.speech.v2.Recognizer.getDefaultInstance()) {
          getRecognizerBuilder().mergeFrom(value);
        } else {
          recognizer_ = value;
        }
      } else {
        recognizerBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRecognizer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recognizer_ = null;
      if (recognizerBuilder_ != null) {
        recognizerBuilder_.dispose();
        recognizerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v2.Recognizer.Builder getRecognizerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecognizerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizerOrBuilder() {
      if (recognizerBuilder_ != null) {
        return recognizerBuilder_.getMessageOrBuilder();
      } else {
        return recognizer_ == null ?
            com.google.cloud.speech.v2.Recognizer.getDefaultInstance() : recognizer_;
      }
    }
    /**
     * <pre>
     * Required. The Recognizer to create.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.Recognizer recognizer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v2.Recognizer, com.google.cloud.speech.v2.Recognizer.Builder, com.google.cloud.speech.v2.RecognizerOrBuilder> 
        getRecognizerFieldBuilder() {
      if (recognizerBuilder_ == null) {
        recognizerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v2.Recognizer, com.google.cloud.speech.v2.Recognizer.Builder, com.google.cloud.speech.v2.RecognizerOrBuilder>(
                getRecognizer(),
                getParentForChildren(),
                isClean());
        recognizer_ = null;
      }
      return recognizerBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If set, validate the request and preview the Recognizer, but do not
     * actually create it.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If set, validate the request and preview the Recognizer, but do not
     * actually create it.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, validate the request and preview the Recognizer, but do not
     * actually create it.
     * </pre>
     *
     * <code>bool validate_only = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validateOnly_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object recognizerId_ = "";
    /**
     * <pre>
     * The ID to use for the Recognizer, which will become the final component of
     * the Recognizer's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string recognizer_id = 3;</code>
     * @return The recognizerId.
     */
    public java.lang.String getRecognizerId() {
      java.lang.Object ref = recognizerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recognizerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the Recognizer, which will become the final component of
     * the Recognizer's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string recognizer_id = 3;</code>
     * @return The bytes for recognizerId.
     */
    public com.google.protobuf.ByteString
        getRecognizerIdBytes() {
      java.lang.Object ref = recognizerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recognizerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID to use for the Recognizer, which will become the final component of
     * the Recognizer's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string recognizer_id = 3;</code>
     * @param value The recognizerId to set.
     * @return This builder for chaining.
     */
    public Builder setRecognizerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      recognizerId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the Recognizer, which will become the final component of
     * the Recognizer's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string recognizer_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecognizerId() {
      recognizerId_ = getDefaultInstance().getRecognizerId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to use for the Recognizer, which will become the final component of
     * the Recognizer's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string recognizer_id = 3;</code>
     * @param value The bytes for recognizerId to set.
     * @return This builder for chaining.
     */
    public Builder setRecognizerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      recognizerId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The project and location where this Recognizer will be created.
     * The expected format is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The project and location where this Recognizer will be created.
     * The expected format is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The project and location where this Recognizer will be created.
     * The expected format is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project and location where this Recognizer will be created.
     * The expected format is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The project and location where this Recognizer will be created.
     * The expected format is `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.CreateRecognizerRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.CreateRecognizerRequest)
  private static final com.google.cloud.speech.v2.CreateRecognizerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.CreateRecognizerRequest();
  }

  public static com.google.cloud.speech.v2.CreateRecognizerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRecognizerRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRecognizerRequest>() {
    @java.lang.Override
    public CreateRecognizerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRecognizerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRecognizerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.CreateRecognizerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

