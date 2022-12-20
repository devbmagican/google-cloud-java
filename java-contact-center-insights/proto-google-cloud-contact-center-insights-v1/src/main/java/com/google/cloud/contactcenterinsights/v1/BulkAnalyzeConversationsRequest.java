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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The request to analyze conversations in bulk.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest}
 */
public final class BulkAnalyzeConversationsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest)
    BulkAnalyzeConversationsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BulkAnalyzeConversationsRequest.newBuilder() to construct.
  private BulkAnalyzeConversationsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BulkAnalyzeConversationsRequest() {
    parent_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BulkAnalyzeConversationsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_BulkAnalyzeConversationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_BulkAnalyzeConversationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest.class,
            com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest.Builder
                .class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource to create analyses in.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource to create analyses in.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object filter_;
  /**
   *
   *
   * <pre>
   * Required. Filter used to select the subset of conversations to analyze.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Filter used to select the subset of conversations to analyze.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANALYSIS_PERCENTAGE_FIELD_NUMBER = 3;
  private float analysisPercentage_;
  /**
   *
   *
   * <pre>
   * Required. Percentage of selected conversation to analyze, between
   * [0, 100].
   * </pre>
   *
   * <code>float analysis_percentage = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The analysisPercentage.
   */
  @java.lang.Override
  public float getAnalysisPercentage() {
    return analysisPercentage_;
  }

  public static final int ANNOTATOR_SELECTOR_FIELD_NUMBER = 8;
  private com.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotatorSelector_;
  /**
   *
   *
   * <pre>
   * To select the annotators to run and the phrase matchers to use
   * (if any). If not specified, all annotators will be run.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
   *
   * @return Whether the annotatorSelector field is set.
   */
  @java.lang.Override
  public boolean hasAnnotatorSelector() {
    return annotatorSelector_ != null;
  }
  /**
   *
   *
   * <pre>
   * To select the annotators to run and the phrase matchers to use
   * (if any). If not specified, all annotators will be run.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
   *
   * @return The annotatorSelector.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.AnnotatorSelector getAnnotatorSelector() {
    return annotatorSelector_ == null
        ? com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.getDefaultInstance()
        : annotatorSelector_;
  }
  /**
   *
   *
   * <pre>
   * To select the annotators to run and the phrase matchers to use
   * (if any). If not specified, all annotators will be run.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.AnnotatorSelectorOrBuilder
      getAnnotatorSelectorOrBuilder() {
    return getAnnotatorSelector();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
    }
    if (java.lang.Float.floatToRawIntBits(analysisPercentage_) != 0) {
      output.writeFloat(3, analysisPercentage_);
    }
    if (annotatorSelector_ != null) {
      output.writeMessage(8, getAnnotatorSelector());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
    }
    if (java.lang.Float.floatToRawIntBits(analysisPercentage_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, analysisPercentage_);
    }
    if (annotatorSelector_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getAnnotatorSelector());
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
    if (!(obj
        instanceof com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest other =
        (com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getFilter().equals(other.getFilter())) return false;
    if (java.lang.Float.floatToIntBits(getAnalysisPercentage())
        != java.lang.Float.floatToIntBits(other.getAnalysisPercentage())) return false;
    if (hasAnnotatorSelector() != other.hasAnnotatorSelector()) return false;
    if (hasAnnotatorSelector()) {
      if (!getAnnotatorSelector().equals(other.getAnnotatorSelector())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + ANALYSIS_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getAnalysisPercentage());
    if (hasAnnotatorSelector()) {
      hash = (37 * hash) + ANNOTATOR_SELECTOR_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotatorSelector().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest prototype) {
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
   * The request to analyze conversations in bulk.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest)
      com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_BulkAnalyzeConversationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_BulkAnalyzeConversationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest.class,
              com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      filter_ = "";

      analysisPercentage_ = 0F;

      if (annotatorSelectorBuilder_ == null) {
        annotatorSelector_ = null;
      } else {
        annotatorSelector_ = null;
        annotatorSelectorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_BulkAnalyzeConversationsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest build() {
      com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
        buildPartial() {
      com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest result =
          new com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest(this);
      result.parent_ = parent_;
      result.filter_ = filter_;
      result.analysisPercentage_ = analysisPercentage_;
      if (annotatorSelectorBuilder_ == null) {
        result.annotatorSelector_ = annotatorSelector_;
      } else {
        result.annotatorSelector_ = annotatorSelectorBuilder_.build();
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
      if (other
          instanceof com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest) {
        return mergeFrom(
            (com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.getAnalysisPercentage() != 0F) {
        setAnalysisPercentage(other.getAnalysisPercentage());
      }
      if (other.hasAnnotatorSelector()) {
        mergeAnnotatorSelector(other.getAnnotatorSelector());
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                filter_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 29:
              {
                analysisPercentage_ = input.readFloat();

                break;
              } // case 29
            case 66:
              {
                input.readMessage(
                    getAnnotatorSelectorFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 66
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource to create analyses in.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource to create analyses in.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource to create analyses in.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource to create analyses in.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource to create analyses in.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * Required. Filter used to select the subset of conversations to analyze.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Filter used to select the subset of conversations to analyze.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Filter used to select the subset of conversations to analyze.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Filter used to select the subset of conversations to analyze.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {

      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Filter used to select the subset of conversations to analyze.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      filter_ = value;
      onChanged();
      return this;
    }

    private float analysisPercentage_;
    /**
     *
     *
     * <pre>
     * Required. Percentage of selected conversation to analyze, between
     * [0, 100].
     * </pre>
     *
     * <code>float analysis_percentage = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The analysisPercentage.
     */
    @java.lang.Override
    public float getAnalysisPercentage() {
      return analysisPercentage_;
    }
    /**
     *
     *
     * <pre>
     * Required. Percentage of selected conversation to analyze, between
     * [0, 100].
     * </pre>
     *
     * <code>float analysis_percentage = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The analysisPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setAnalysisPercentage(float value) {

      analysisPercentage_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Percentage of selected conversation to analyze, between
     * [0, 100].
     * </pre>
     *
     * <code>float analysis_percentage = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnalysisPercentage() {

      analysisPercentage_ = 0F;
      onChanged();
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotatorSelector_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.AnnotatorSelector,
            com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.Builder,
            com.google.cloud.contactcenterinsights.v1.AnnotatorSelectorOrBuilder>
        annotatorSelectorBuilder_;
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     *
     * @return Whether the annotatorSelector field is set.
     */
    public boolean hasAnnotatorSelector() {
      return annotatorSelectorBuilder_ != null || annotatorSelector_ != null;
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     *
     * @return The annotatorSelector.
     */
    public com.google.cloud.contactcenterinsights.v1.AnnotatorSelector getAnnotatorSelector() {
      if (annotatorSelectorBuilder_ == null) {
        return annotatorSelector_ == null
            ? com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.getDefaultInstance()
            : annotatorSelector_;
      } else {
        return annotatorSelectorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     */
    public Builder setAnnotatorSelector(
        com.google.cloud.contactcenterinsights.v1.AnnotatorSelector value) {
      if (annotatorSelectorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotatorSelector_ = value;
        onChanged();
      } else {
        annotatorSelectorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     */
    public Builder setAnnotatorSelector(
        com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.Builder builderForValue) {
      if (annotatorSelectorBuilder_ == null) {
        annotatorSelector_ = builderForValue.build();
        onChanged();
      } else {
        annotatorSelectorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     */
    public Builder mergeAnnotatorSelector(
        com.google.cloud.contactcenterinsights.v1.AnnotatorSelector value) {
      if (annotatorSelectorBuilder_ == null) {
        if (annotatorSelector_ != null) {
          annotatorSelector_ =
              com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.newBuilder(
                      annotatorSelector_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          annotatorSelector_ = value;
        }
        onChanged();
      } else {
        annotatorSelectorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     */
    public Builder clearAnnotatorSelector() {
      if (annotatorSelectorBuilder_ == null) {
        annotatorSelector_ = null;
        onChanged();
      } else {
        annotatorSelector_ = null;
        annotatorSelectorBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.Builder
        getAnnotatorSelectorBuilder() {

      onChanged();
      return getAnnotatorSelectorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.AnnotatorSelectorOrBuilder
        getAnnotatorSelectorOrBuilder() {
      if (annotatorSelectorBuilder_ != null) {
        return annotatorSelectorBuilder_.getMessageOrBuilder();
      } else {
        return annotatorSelector_ == null
            ? com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.getDefaultInstance()
            : annotatorSelector_;
      }
    }
    /**
     *
     *
     * <pre>
     * To select the annotators to run and the phrase matchers to use
     * (if any). If not specified, all annotators will be run.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.AnnotatorSelector annotator_selector = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.AnnotatorSelector,
            com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.Builder,
            com.google.cloud.contactcenterinsights.v1.AnnotatorSelectorOrBuilder>
        getAnnotatorSelectorFieldBuilder() {
      if (annotatorSelectorBuilder_ == null) {
        annotatorSelectorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.AnnotatorSelector,
                com.google.cloud.contactcenterinsights.v1.AnnotatorSelector.Builder,
                com.google.cloud.contactcenterinsights.v1.AnnotatorSelectorOrBuilder>(
                getAnnotatorSelector(), getParentForChildren(), isClean());
        annotatorSelector_ = null;
      }
      return annotatorSelectorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest)
  private static final com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkAnalyzeConversationsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BulkAnalyzeConversationsRequest>() {
        @java.lang.Override
        public BulkAnalyzeConversationsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BulkAnalyzeConversationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkAnalyzeConversationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.BulkAnalyzeConversationsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
