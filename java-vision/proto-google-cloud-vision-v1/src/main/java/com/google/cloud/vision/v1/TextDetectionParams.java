/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * Parameters for text detections. This is used to control TEXT_DETECTION and
 * DOCUMENT_TEXT_DETECTION features.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.TextDetectionParams}
 */
public final class TextDetectionParams extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.TextDetectionParams)
    TextDetectionParamsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextDetectionParams.newBuilder() to construct.
  private TextDetectionParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextDetectionParams() {
    advancedOcrOptions_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextDetectionParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_TextDetectionParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_TextDetectionParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.TextDetectionParams.class,
            com.google.cloud.vision.v1.TextDetectionParams.Builder.class);
  }

  public static final int ENABLE_TEXT_DETECTION_CONFIDENCE_SCORE_FIELD_NUMBER = 9;
  private boolean enableTextDetectionConfidenceScore_ = false;
  /**
   *
   *
   * <pre>
   * By default, Cloud Vision API only includes confidence score for
   * DOCUMENT_TEXT_DETECTION result. Set the flag to true to include confidence
   * score for TEXT_DETECTION as well.
   * </pre>
   *
   * <code>bool enable_text_detection_confidence_score = 9;</code>
   *
   * @return The enableTextDetectionConfidenceScore.
   */
  @java.lang.Override
  public boolean getEnableTextDetectionConfidenceScore() {
    return enableTextDetectionConfidenceScore_;
  }

  public static final int ADVANCED_OCR_OPTIONS_FIELD_NUMBER = 11;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList advancedOcrOptions_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   *
   * @return A list containing the advancedOcrOptions.
   */
  public com.google.protobuf.ProtocolStringList getAdvancedOcrOptionsList() {
    return advancedOcrOptions_;
  }
  /**
   *
   *
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   *
   * @return The count of advancedOcrOptions.
   */
  public int getAdvancedOcrOptionsCount() {
    return advancedOcrOptions_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   *
   * @param index The index of the element to return.
   * @return The advancedOcrOptions at the given index.
   */
  public java.lang.String getAdvancedOcrOptions(int index) {
    return advancedOcrOptions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of advanced OCR options to fine-tune OCR behavior.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 11;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the advancedOcrOptions at the given index.
   */
  public com.google.protobuf.ByteString getAdvancedOcrOptionsBytes(int index) {
    return advancedOcrOptions_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (enableTextDetectionConfidenceScore_ != false) {
      output.writeBool(9, enableTextDetectionConfidenceScore_);
    }
    for (int i = 0; i < advancedOcrOptions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, advancedOcrOptions_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableTextDetectionConfidenceScore_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              9, enableTextDetectionConfidenceScore_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < advancedOcrOptions_.size(); i++) {
        dataSize += computeStringSizeNoTag(advancedOcrOptions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAdvancedOcrOptionsList().size();
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
    if (!(obj instanceof com.google.cloud.vision.v1.TextDetectionParams)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.TextDetectionParams other =
        (com.google.cloud.vision.v1.TextDetectionParams) obj;

    if (getEnableTextDetectionConfidenceScore() != other.getEnableTextDetectionConfidenceScore())
      return false;
    if (!getAdvancedOcrOptionsList().equals(other.getAdvancedOcrOptionsList())) return false;
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
    hash = (37 * hash) + ENABLE_TEXT_DETECTION_CONFIDENCE_SCORE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getEnableTextDetectionConfidenceScore());
    if (getAdvancedOcrOptionsCount() > 0) {
      hash = (37 * hash) + ADVANCED_OCR_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAdvancedOcrOptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.TextDetectionParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.vision.v1.TextDetectionParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Parameters for text detections. This is used to control TEXT_DETECTION and
   * DOCUMENT_TEXT_DETECTION features.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.TextDetectionParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.TextDetectionParams)
      com.google.cloud.vision.v1.TextDetectionParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_TextDetectionParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_TextDetectionParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.TextDetectionParams.class,
              com.google.cloud.vision.v1.TextDetectionParams.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.TextDetectionParams.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableTextDetectionConfidenceScore_ = false;
      advancedOcrOptions_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_TextDetectionParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.TextDetectionParams getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.TextDetectionParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.TextDetectionParams build() {
      com.google.cloud.vision.v1.TextDetectionParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.TextDetectionParams buildPartial() {
      com.google.cloud.vision.v1.TextDetectionParams result =
          new com.google.cloud.vision.v1.TextDetectionParams(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1.TextDetectionParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableTextDetectionConfidenceScore_ = enableTextDetectionConfidenceScore_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        advancedOcrOptions_.makeImmutable();
        result.advancedOcrOptions_ = advancedOcrOptions_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1.TextDetectionParams) {
        return mergeFrom((com.google.cloud.vision.v1.TextDetectionParams) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.TextDetectionParams other) {
      if (other == com.google.cloud.vision.v1.TextDetectionParams.getDefaultInstance()) return this;
      if (other.getEnableTextDetectionConfidenceScore() != false) {
        setEnableTextDetectionConfidenceScore(other.getEnableTextDetectionConfidenceScore());
      }
      if (!other.advancedOcrOptions_.isEmpty()) {
        if (advancedOcrOptions_.isEmpty()) {
          advancedOcrOptions_ = other.advancedOcrOptions_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAdvancedOcrOptionsIsMutable();
          advancedOcrOptions_.addAll(other.advancedOcrOptions_);
        }
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
            case 72:
              {
                enableTextDetectionConfidenceScore_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
            case 90:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAdvancedOcrOptionsIsMutable();
                advancedOcrOptions_.add(s);
                break;
              } // case 90
            default:
              {
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

    private boolean enableTextDetectionConfidenceScore_;
    /**
     *
     *
     * <pre>
     * By default, Cloud Vision API only includes confidence score for
     * DOCUMENT_TEXT_DETECTION result. Set the flag to true to include confidence
     * score for TEXT_DETECTION as well.
     * </pre>
     *
     * <code>bool enable_text_detection_confidence_score = 9;</code>
     *
     * @return The enableTextDetectionConfidenceScore.
     */
    @java.lang.Override
    public boolean getEnableTextDetectionConfidenceScore() {
      return enableTextDetectionConfidenceScore_;
    }
    /**
     *
     *
     * <pre>
     * By default, Cloud Vision API only includes confidence score for
     * DOCUMENT_TEXT_DETECTION result. Set the flag to true to include confidence
     * score for TEXT_DETECTION as well.
     * </pre>
     *
     * <code>bool enable_text_detection_confidence_score = 9;</code>
     *
     * @param value The enableTextDetectionConfidenceScore to set.
     * @return This builder for chaining.
     */
    public Builder setEnableTextDetectionConfidenceScore(boolean value) {

      enableTextDetectionConfidenceScore_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * By default, Cloud Vision API only includes confidence score for
     * DOCUMENT_TEXT_DETECTION result. Set the flag to true to include confidence
     * score for TEXT_DETECTION as well.
     * </pre>
     *
     * <code>bool enable_text_detection_confidence_score = 9;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableTextDetectionConfidenceScore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableTextDetectionConfidenceScore_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList advancedOcrOptions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureAdvancedOcrOptionsIsMutable() {
      if (!advancedOcrOptions_.isModifiable()) {
        advancedOcrOptions_ = new com.google.protobuf.LazyStringArrayList(advancedOcrOptions_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @return A list containing the advancedOcrOptions.
     */
    public com.google.protobuf.ProtocolStringList getAdvancedOcrOptionsList() {
      advancedOcrOptions_.makeImmutable();
      return advancedOcrOptions_;
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @return The count of advancedOcrOptions.
     */
    public int getAdvancedOcrOptionsCount() {
      return advancedOcrOptions_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @param index The index of the element to return.
     * @return The advancedOcrOptions at the given index.
     */
    public java.lang.String getAdvancedOcrOptions(int index) {
      return advancedOcrOptions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the advancedOcrOptions at the given index.
     */
    public com.google.protobuf.ByteString getAdvancedOcrOptionsBytes(int index) {
      return advancedOcrOptions_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @param index The index to set the value at.
     * @param value The advancedOcrOptions to set.
     * @return This builder for chaining.
     */
    public Builder setAdvancedOcrOptions(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAdvancedOcrOptionsIsMutable();
      advancedOcrOptions_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @param value The advancedOcrOptions to add.
     * @return This builder for chaining.
     */
    public Builder addAdvancedOcrOptions(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAdvancedOcrOptionsIsMutable();
      advancedOcrOptions_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @param values The advancedOcrOptions to add.
     * @return This builder for chaining.
     */
    public Builder addAllAdvancedOcrOptions(java.lang.Iterable<java.lang.String> values) {
      ensureAdvancedOcrOptionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, advancedOcrOptions_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAdvancedOcrOptions() {
      advancedOcrOptions_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of advanced OCR options to fine-tune OCR behavior.
     * </pre>
     *
     * <code>repeated string advanced_ocr_options = 11;</code>
     *
     * @param value The bytes of the advancedOcrOptions to add.
     * @return This builder for chaining.
     */
    public Builder addAdvancedOcrOptionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAdvancedOcrOptionsIsMutable();
      advancedOcrOptions_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.TextDetectionParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.TextDetectionParams)
  private static final com.google.cloud.vision.v1.TextDetectionParams DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.TextDetectionParams();
  }

  public static com.google.cloud.vision.v1.TextDetectionParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextDetectionParams> PARSER =
      new com.google.protobuf.AbstractParser<TextDetectionParams>() {
        @java.lang.Override
        public TextDetectionParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextDetectionParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextDetectionParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.TextDetectionParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
