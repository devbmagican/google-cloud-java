// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

/**
 * <pre>
 * Stored in the
 * [google.longrunning.Operation.response][google.longrunning.Operation.response]
 * field returned by BatchTranslateText if at least one sentence is translated
 * successfully.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.BatchTranslateResponse}
 */
public final class BatchTranslateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.BatchTranslateResponse)
    BatchTranslateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchTranslateResponse.newBuilder() to construct.
  private BatchTranslateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchTranslateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchTranslateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.BatchTranslateResponse.class, com.google.cloud.translate.v3.BatchTranslateResponse.Builder.class);
  }

  public static final int TOTAL_CHARACTERS_FIELD_NUMBER = 1;
  private long totalCharacters_ = 0L;
  /**
   * <pre>
   * Total number of characters (Unicode codepoints).
   * </pre>
   *
   * <code>int64 total_characters = 1;</code>
   * @return The totalCharacters.
   */
  @java.lang.Override
  public long getTotalCharacters() {
    return totalCharacters_;
  }

  public static final int TRANSLATED_CHARACTERS_FIELD_NUMBER = 2;
  private long translatedCharacters_ = 0L;
  /**
   * <pre>
   * Number of successfully translated characters (Unicode codepoints).
   * </pre>
   *
   * <code>int64 translated_characters = 2;</code>
   * @return The translatedCharacters.
   */
  @java.lang.Override
  public long getTranslatedCharacters() {
    return translatedCharacters_;
  }

  public static final int FAILED_CHARACTERS_FIELD_NUMBER = 3;
  private long failedCharacters_ = 0L;
  /**
   * <pre>
   * Number of characters that have failed to process (Unicode codepoints).
   * </pre>
   *
   * <code>int64 failed_characters = 3;</code>
   * @return The failedCharacters.
   */
  @java.lang.Override
  public long getFailedCharacters() {
    return failedCharacters_;
  }

  public static final int SUBMIT_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp submitTime_;
  /**
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 4;</code>
   * @return Whether the submitTime field is set.
   */
  @java.lang.Override
  public boolean hasSubmitTime() {
    return submitTime_ != null;
  }
  /**
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 4;</code>
   * @return The submitTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getSubmitTime() {
    return submitTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
  }
  /**
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
    return submitTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp endTime_;
  /**
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
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
    if (totalCharacters_ != 0L) {
      output.writeInt64(1, totalCharacters_);
    }
    if (translatedCharacters_ != 0L) {
      output.writeInt64(2, translatedCharacters_);
    }
    if (failedCharacters_ != 0L) {
      output.writeInt64(3, failedCharacters_);
    }
    if (submitTime_ != null) {
      output.writeMessage(4, getSubmitTime());
    }
    if (endTime_ != null) {
      output.writeMessage(5, getEndTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalCharacters_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, totalCharacters_);
    }
    if (translatedCharacters_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, translatedCharacters_);
    }
    if (failedCharacters_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, failedCharacters_);
    }
    if (submitTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getSubmitTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getEndTime());
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
    if (!(obj instanceof com.google.cloud.translate.v3.BatchTranslateResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.BatchTranslateResponse other = (com.google.cloud.translate.v3.BatchTranslateResponse) obj;

    if (getTotalCharacters()
        != other.getTotalCharacters()) return false;
    if (getTranslatedCharacters()
        != other.getTranslatedCharacters()) return false;
    if (getFailedCharacters()
        != other.getFailedCharacters()) return false;
    if (hasSubmitTime() != other.hasSubmitTime()) return false;
    if (hasSubmitTime()) {
      if (!getSubmitTime()
          .equals(other.getSubmitTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime()
          .equals(other.getEndTime())) return false;
    }
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
    hash = (37 * hash) + TOTAL_CHARACTERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalCharacters());
    hash = (37 * hash) + TRANSLATED_CHARACTERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTranslatedCharacters());
    hash = (37 * hash) + FAILED_CHARACTERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFailedCharacters());
    if (hasSubmitTime()) {
      hash = (37 * hash) + SUBMIT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.BatchTranslateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.BatchTranslateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.BatchTranslateResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.translate.v3.BatchTranslateResponse prototype) {
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
   * Stored in the
   * [google.longrunning.Operation.response][google.longrunning.Operation.response]
   * field returned by BatchTranslateText if at least one sentence is translated
   * successfully.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.BatchTranslateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.BatchTranslateResponse)
      com.google.cloud.translate.v3.BatchTranslateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.BatchTranslateResponse.class, com.google.cloud.translate.v3.BatchTranslateResponse.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.BatchTranslateResponse.newBuilder()
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
      totalCharacters_ = 0L;
      translatedCharacters_ = 0L;
      failedCharacters_ = 0L;
      submitTime_ = null;
      if (submitTimeBuilder_ != null) {
        submitTimeBuilder_.dispose();
        submitTimeBuilder_ = null;
      }
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.BatchTranslateResponse getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.BatchTranslateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.BatchTranslateResponse build() {
      com.google.cloud.translate.v3.BatchTranslateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.BatchTranslateResponse buildPartial() {
      com.google.cloud.translate.v3.BatchTranslateResponse result = new com.google.cloud.translate.v3.BatchTranslateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.translate.v3.BatchTranslateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.totalCharacters_ = totalCharacters_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.translatedCharacters_ = translatedCharacters_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failedCharacters_ = failedCharacters_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.submitTime_ = submitTimeBuilder_ == null
            ? submitTime_
            : submitTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.endTime_ = endTimeBuilder_ == null
            ? endTime_
            : endTimeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.translate.v3.BatchTranslateResponse) {
        return mergeFrom((com.google.cloud.translate.v3.BatchTranslateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.BatchTranslateResponse other) {
      if (other == com.google.cloud.translate.v3.BatchTranslateResponse.getDefaultInstance()) return this;
      if (other.getTotalCharacters() != 0L) {
        setTotalCharacters(other.getTotalCharacters());
      }
      if (other.getTranslatedCharacters() != 0L) {
        setTranslatedCharacters(other.getTranslatedCharacters());
      }
      if (other.getFailedCharacters() != 0L) {
        setFailedCharacters(other.getFailedCharacters());
      }
      if (other.hasSubmitTime()) {
        mergeSubmitTime(other.getSubmitTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
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
            case 8: {
              totalCharacters_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              translatedCharacters_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              failedCharacters_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getSubmitTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getEndTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long totalCharacters_ ;
    /**
     * <pre>
     * Total number of characters (Unicode codepoints).
     * </pre>
     *
     * <code>int64 total_characters = 1;</code>
     * @return The totalCharacters.
     */
    @java.lang.Override
    public long getTotalCharacters() {
      return totalCharacters_;
    }
    /**
     * <pre>
     * Total number of characters (Unicode codepoints).
     * </pre>
     *
     * <code>int64 total_characters = 1;</code>
     * @param value The totalCharacters to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCharacters(long value) {

      totalCharacters_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of characters (Unicode codepoints).
     * </pre>
     *
     * <code>int64 total_characters = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCharacters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      totalCharacters_ = 0L;
      onChanged();
      return this;
    }

    private long translatedCharacters_ ;
    /**
     * <pre>
     * Number of successfully translated characters (Unicode codepoints).
     * </pre>
     *
     * <code>int64 translated_characters = 2;</code>
     * @return The translatedCharacters.
     */
    @java.lang.Override
    public long getTranslatedCharacters() {
      return translatedCharacters_;
    }
    /**
     * <pre>
     * Number of successfully translated characters (Unicode codepoints).
     * </pre>
     *
     * <code>int64 translated_characters = 2;</code>
     * @param value The translatedCharacters to set.
     * @return This builder for chaining.
     */
    public Builder setTranslatedCharacters(long value) {

      translatedCharacters_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of successfully translated characters (Unicode codepoints).
     * </pre>
     *
     * <code>int64 translated_characters = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTranslatedCharacters() {
      bitField0_ = (bitField0_ & ~0x00000002);
      translatedCharacters_ = 0L;
      onChanged();
      return this;
    }

    private long failedCharacters_ ;
    /**
     * <pre>
     * Number of characters that have failed to process (Unicode codepoints).
     * </pre>
     *
     * <code>int64 failed_characters = 3;</code>
     * @return The failedCharacters.
     */
    @java.lang.Override
    public long getFailedCharacters() {
      return failedCharacters_;
    }
    /**
     * <pre>
     * Number of characters that have failed to process (Unicode codepoints).
     * </pre>
     *
     * <code>int64 failed_characters = 3;</code>
     * @param value The failedCharacters to set.
     * @return This builder for chaining.
     */
    public Builder setFailedCharacters(long value) {

      failedCharacters_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of characters that have failed to process (Unicode codepoints).
     * </pre>
     *
     * <code>int64 failed_characters = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedCharacters() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failedCharacters_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp submitTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> submitTimeBuilder_;
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     * @return Whether the submitTime field is set.
     */
    public boolean hasSubmitTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     * @return The submitTime.
     */
    public com.google.protobuf.Timestamp getSubmitTime() {
      if (submitTimeBuilder_ == null) {
        return submitTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
      } else {
        return submitTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     */
    public Builder setSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        submitTime_ = value;
      } else {
        submitTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     */
    public Builder setSubmitTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (submitTimeBuilder_ == null) {
        submitTime_ = builderForValue.build();
      } else {
        submitTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     */
    public Builder mergeSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          submitTime_ != null &&
          submitTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getSubmitTimeBuilder().mergeFrom(value);
        } else {
          submitTime_ = value;
        }
      } else {
        submitTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     */
    public Builder clearSubmitTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      submitTime_ = null;
      if (submitTimeBuilder_ != null) {
        submitTimeBuilder_.dispose();
        submitTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getSubmitTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getSubmitTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
      if (submitTimeBuilder_ != null) {
        return submitTimeBuilder_.getMessageOrBuilder();
      } else {
        return submitTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
      }
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getSubmitTimeFieldBuilder() {
      if (submitTimeBuilder_ == null) {
        submitTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getSubmitTime(),
                getParentForChildren(),
                isClean());
        submitTime_ = null;
      }
      return submitTimeBuilder_;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endTimeBuilder_;
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     * @return The endTime.
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
      } else {
        endTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     */
    public Builder setEndTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          endTime_ != null &&
          endTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndTimeBuilder().mergeFrom(value);
        } else {
          endTime_ = value;
        }
      } else {
        endTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000010);
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     * <pre>
     * The time when the operation is finished and
     * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
     * set to true.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEndTime(),
                getParentForChildren(),
                isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.BatchTranslateResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.BatchTranslateResponse)
  private static final com.google.cloud.translate.v3.BatchTranslateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.BatchTranslateResponse();
  }

  public static com.google.cloud.translate.v3.BatchTranslateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchTranslateResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchTranslateResponse>() {
    @java.lang.Override
    public BatchTranslateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchTranslateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchTranslateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.BatchTranslateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

