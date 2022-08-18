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
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Config for image classification human labeling task.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImageClassificationConfig}
 */
public final class ImageClassificationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ImageClassificationConfig)
    ImageClassificationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageClassificationConfig.newBuilder() to construct.
  private ImageClassificationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageClassificationConfig() {
    annotationSpecSet_ = "";
    answerAggregationType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageClassificationConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImageClassificationConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              annotationSpecSet_ = s;
              break;
            }
          case 16:
            {
              allowMultiLabel_ = input.readBool();
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              answerAggregationType_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig.class,
            com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig.Builder.class);
  }

  public static final int ANNOTATION_SPEC_SET_FIELD_NUMBER = 1;
  private volatile java.lang.Object annotationSpecSet_;
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The annotationSpecSet.
   */
  @java.lang.Override
  public java.lang.String getAnnotationSpecSet() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      annotationSpecSet_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for annotationSpecSet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAnnotationSpecSetBytes() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      annotationSpecSet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALLOW_MULTI_LABEL_FIELD_NUMBER = 2;
  private boolean allowMultiLabel_;
  /**
   *
   *
   * <pre>
   * Optional. If allow_multi_label is true, contributors are able to choose
   * multiple labels for one image.
   * </pre>
   *
   * <code>bool allow_multi_label = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowMultiLabel.
   */
  @java.lang.Override
  public boolean getAllowMultiLabel() {
    return allowMultiLabel_;
  }

  public static final int ANSWER_AGGREGATION_TYPE_FIELD_NUMBER = 3;
  private int answerAggregationType_;
  /**
   *
   *
   * <pre>
   * Optional. The type of how to aggregate answers.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for answerAggregationType.
   */
  @java.lang.Override
  public int getAnswerAggregationTypeValue() {
    return answerAggregationType_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The type of how to aggregate answers.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The answerAggregationType.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.StringAggregationType getAnswerAggregationType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datalabeling.v1beta1.StringAggregationType result =
        com.google.cloud.datalabeling.v1beta1.StringAggregationType.valueOf(answerAggregationType_);
    return result == null
        ? com.google.cloud.datalabeling.v1beta1.StringAggregationType.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecSet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, annotationSpecSet_);
    }
    if (allowMultiLabel_ != false) {
      output.writeBool(2, allowMultiLabel_);
    }
    if (answerAggregationType_
        != com.google.cloud.datalabeling.v1beta1.StringAggregationType
            .STRING_AGGREGATION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, answerAggregationType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(annotationSpecSet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, annotationSpecSet_);
    }
    if (allowMultiLabel_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, allowMultiLabel_);
    }
    if (answerAggregationType_
        != com.google.cloud.datalabeling.v1beta1.StringAggregationType
            .STRING_AGGREGATION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, answerAggregationType_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig other =
        (com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig) obj;

    if (!getAnnotationSpecSet().equals(other.getAnnotationSpecSet())) return false;
    if (getAllowMultiLabel() != other.getAllowMultiLabel()) return false;
    if (answerAggregationType_ != other.answerAggregationType_) return false;
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
    hash = (37 * hash) + ANNOTATION_SPEC_SET_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationSpecSet().hashCode();
    hash = (37 * hash) + ALLOW_MULTI_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowMultiLabel());
    hash = (37 * hash) + ANSWER_AGGREGATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + answerAggregationType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig prototype) {
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
   * Config for image classification human labeling task.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImageClassificationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ImageClassificationConfig)
      com.google.cloud.datalabeling.v1beta1.ImageClassificationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig.class,
              com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      annotationSpecSet_ = "";

      allowMultiLabel_ = false;

      answerAggregationType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig build() {
      com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig result =
          new com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig(this);
      result.annotationSpecSet_ = annotationSpecSet_;
      result.allowMultiLabel_ = allowMultiLabel_;
      result.answerAggregationType_ = answerAggregationType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig.getDefaultInstance())
        return this;
      if (!other.getAnnotationSpecSet().isEmpty()) {
        annotationSpecSet_ = other.annotationSpecSet_;
        onChanged();
      }
      if (other.getAllowMultiLabel() != false) {
        setAllowMultiLabel(other.getAllowMultiLabel());
      }
      if (other.answerAggregationType_ != 0) {
        setAnswerAggregationTypeValue(other.getAnswerAggregationTypeValue());
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
      com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object annotationSpecSet_ = "";
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The annotationSpecSet.
     */
    public java.lang.String getAnnotationSpecSet() {
      java.lang.Object ref = annotationSpecSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        annotationSpecSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for annotationSpecSet.
     */
    public com.google.protobuf.ByteString getAnnotationSpecSetBytes() {
      java.lang.Object ref = annotationSpecSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        annotationSpecSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSet(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      annotationSpecSet_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnnotationSpecSet() {

      annotationSpecSet_ = getDefaultInstance().getAnnotationSpecSet();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      annotationSpecSet_ = value;
      onChanged();
      return this;
    }

    private boolean allowMultiLabel_;
    /**
     *
     *
     * <pre>
     * Optional. If allow_multi_label is true, contributors are able to choose
     * multiple labels for one image.
     * </pre>
     *
     * <code>bool allow_multi_label = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The allowMultiLabel.
     */
    @java.lang.Override
    public boolean getAllowMultiLabel() {
      return allowMultiLabel_;
    }
    /**
     *
     *
     * <pre>
     * Optional. If allow_multi_label is true, contributors are able to choose
     * multiple labels for one image.
     * </pre>
     *
     * <code>bool allow_multi_label = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The allowMultiLabel to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMultiLabel(boolean value) {

      allowMultiLabel_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If allow_multi_label is true, contributors are able to choose
     * multiple labels for one image.
     * </pre>
     *
     * <code>bool allow_multi_label = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowMultiLabel() {

      allowMultiLabel_ = false;
      onChanged();
      return this;
    }

    private int answerAggregationType_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The type of how to aggregate answers.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for answerAggregationType.
     */
    @java.lang.Override
    public int getAnswerAggregationTypeValue() {
      return answerAggregationType_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of how to aggregate answers.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for answerAggregationType to set.
     * @return This builder for chaining.
     */
    public Builder setAnswerAggregationTypeValue(int value) {

      answerAggregationType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of how to aggregate answers.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The answerAggregationType.
     */
    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.StringAggregationType getAnswerAggregationType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datalabeling.v1beta1.StringAggregationType result =
          com.google.cloud.datalabeling.v1beta1.StringAggregationType.valueOf(
              answerAggregationType_);
      return result == null
          ? com.google.cloud.datalabeling.v1beta1.StringAggregationType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of how to aggregate answers.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The answerAggregationType to set.
     * @return This builder for chaining.
     */
    public Builder setAnswerAggregationType(
        com.google.cloud.datalabeling.v1beta1.StringAggregationType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      answerAggregationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of how to aggregate answers.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnswerAggregationType() {

      answerAggregationType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ImageClassificationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ImageClassificationConfig)
  private static final com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig();
  }

  public static com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageClassificationConfig> PARSER =
      new com.google.protobuf.AbstractParser<ImageClassificationConfig>() {
        @java.lang.Override
        public ImageClassificationConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImageClassificationConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImageClassificationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageClassificationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
