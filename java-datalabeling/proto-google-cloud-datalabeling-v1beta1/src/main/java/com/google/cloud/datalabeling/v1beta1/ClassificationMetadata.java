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
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Metadata for classification annotations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ClassificationMetadata}
 */
public final class ClassificationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ClassificationMetadata)
    ClassificationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ClassificationMetadata.newBuilder() to construct.
  private ClassificationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClassificationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClassificationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ClassificationMetadata(
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
          case 8:
            {
              isMultiLabel_ = input.readBool();
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
    return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ClassificationMetadata.class,
            com.google.cloud.datalabeling.v1beta1.ClassificationMetadata.Builder.class);
  }

  public static final int IS_MULTI_LABEL_FIELD_NUMBER = 1;
  private boolean isMultiLabel_;
  /**
   *
   *
   * <pre>
   * Whether the classification task is multi-label or not.
   * </pre>
   *
   * <code>bool is_multi_label = 1;</code>
   *
   * @return The isMultiLabel.
   */
  @java.lang.Override
  public boolean getIsMultiLabel() {
    return isMultiLabel_;
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
    if (isMultiLabel_ != false) {
      output.writeBool(1, isMultiLabel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isMultiLabel_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isMultiLabel_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ClassificationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ClassificationMetadata other =
        (com.google.cloud.datalabeling.v1beta1.ClassificationMetadata) obj;

    if (getIsMultiLabel() != other.getIsMultiLabel()) return false;
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
    hash = (37 * hash) + IS_MULTI_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsMultiLabel());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.ClassificationMetadata prototype) {
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
   * Metadata for classification annotations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ClassificationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ClassificationMetadata)
      com.google.cloud.datalabeling.v1beta1.ClassificationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ClassificationMetadata.class,
              com.google.cloud.datalabeling.v1beta1.ClassificationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ClassificationMetadata.newBuilder()
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
      isMultiLabel_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ClassificationMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ClassificationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ClassificationMetadata build() {
      com.google.cloud.datalabeling.v1beta1.ClassificationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ClassificationMetadata buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ClassificationMetadata result =
          new com.google.cloud.datalabeling.v1beta1.ClassificationMetadata(this);
      result.isMultiLabel_ = isMultiLabel_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ClassificationMetadata) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ClassificationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.ClassificationMetadata other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ClassificationMetadata.getDefaultInstance())
        return this;
      if (other.getIsMultiLabel() != false) {
        setIsMultiLabel(other.getIsMultiLabel());
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
      com.google.cloud.datalabeling.v1beta1.ClassificationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.ClassificationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isMultiLabel_;
    /**
     *
     *
     * <pre>
     * Whether the classification task is multi-label or not.
     * </pre>
     *
     * <code>bool is_multi_label = 1;</code>
     *
     * @return The isMultiLabel.
     */
    @java.lang.Override
    public boolean getIsMultiLabel() {
      return isMultiLabel_;
    }
    /**
     *
     *
     * <pre>
     * Whether the classification task is multi-label or not.
     * </pre>
     *
     * <code>bool is_multi_label = 1;</code>
     *
     * @param value The isMultiLabel to set.
     * @return This builder for chaining.
     */
    public Builder setIsMultiLabel(boolean value) {

      isMultiLabel_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the classification task is multi-label or not.
     * </pre>
     *
     * <code>bool is_multi_label = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsMultiLabel() {

      isMultiLabel_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ClassificationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ClassificationMetadata)
  private static final com.google.cloud.datalabeling.v1beta1.ClassificationMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ClassificationMetadata();
  }

  public static com.google.cloud.datalabeling.v1beta1.ClassificationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClassificationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ClassificationMetadata>() {
        @java.lang.Override
        public ClassificationMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ClassificationMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ClassificationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClassificationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ClassificationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
