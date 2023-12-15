/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for
 * [ConversationDatasets.CreateConversationDataset][google.cloud.dialogflow.v2.ConversationDatasets.CreateConversationDataset].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationDatasetRequest}
 */
public final class CreateConversationDatasetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateConversationDatasetRequest)
    CreateConversationDatasetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConversationDatasetRequest.newBuilder() to construct.
  private CreateConversationDatasetRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConversationDatasetRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConversationDatasetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest.class,
            com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project to create conversation dataset for. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The project to create conversation dataset for. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int CONVERSATION_DATASET_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.ConversationDataset conversationDataset_;
  /**
   *
   *
   * <pre>
   * Required. The conversation dataset to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversationDataset field is set.
   */
  @java.lang.Override
  public boolean hasConversationDataset() {
    return conversationDataset_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation dataset to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversationDataset.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationDataset getConversationDataset() {
    return conversationDataset_ == null
        ? com.google.cloud.dialogflow.v2.ConversationDataset.getDefaultInstance()
        : conversationDataset_;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation dataset to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder
      getConversationDatasetOrBuilder() {
    return conversationDataset_ == null
        ? com.google.cloud.dialogflow.v2.ConversationDataset.getDefaultInstance()
        : conversationDataset_;
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
    if (conversationDataset_ != null) {
      output.writeMessage(2, getConversationDataset());
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
    if (conversationDataset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getConversationDataset());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest other =
        (com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasConversationDataset() != other.hasConversationDataset()) return false;
    if (hasConversationDataset()) {
      if (!getConversationDataset().equals(other.getConversationDataset())) return false;
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
    if (hasConversationDataset()) {
      hash = (37 * hash) + CONVERSATION_DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getConversationDataset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest prototype) {
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
   * The request message for
   * [ConversationDatasets.CreateConversationDataset][google.cloud.dialogflow.v2.ConversationDatasets.CreateConversationDataset].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationDatasetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateConversationDatasetRequest)
      com.google.cloud.dialogflow.v2.CreateConversationDatasetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest.class,
              com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      conversationDataset_ = null;
      if (conversationDatasetBuilder_ != null) {
        conversationDatasetBuilder_.dispose();
        conversationDatasetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_CreateConversationDatasetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest build() {
      com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest buildPartial() {
      com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest result =
          new com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conversationDataset_ =
            conversationDatasetBuilder_ == null
                ? conversationDataset_
                : conversationDatasetBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConversationDataset()) {
        mergeConversationDataset(other.getConversationDataset());
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
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getConversationDatasetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project to create conversation dataset for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The project to create conversation dataset for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The project to create conversation dataset for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project to create conversation dataset for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project to create conversation dataset for. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.ConversationDataset conversationDataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationDataset,
            com.google.cloud.dialogflow.v2.ConversationDataset.Builder,
            com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>
        conversationDatasetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the conversationDataset field is set.
     */
    public boolean hasConversationDataset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The conversationDataset.
     */
    public com.google.cloud.dialogflow.v2.ConversationDataset getConversationDataset() {
      if (conversationDatasetBuilder_ == null) {
        return conversationDataset_ == null
            ? com.google.cloud.dialogflow.v2.ConversationDataset.getDefaultInstance()
            : conversationDataset_;
      } else {
        return conversationDatasetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversationDataset(
        com.google.cloud.dialogflow.v2.ConversationDataset value) {
      if (conversationDatasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversationDataset_ = value;
      } else {
        conversationDatasetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversationDataset(
        com.google.cloud.dialogflow.v2.ConversationDataset.Builder builderForValue) {
      if (conversationDatasetBuilder_ == null) {
        conversationDataset_ = builderForValue.build();
      } else {
        conversationDatasetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConversationDataset(
        com.google.cloud.dialogflow.v2.ConversationDataset value) {
      if (conversationDatasetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && conversationDataset_ != null
            && conversationDataset_
                != com.google.cloud.dialogflow.v2.ConversationDataset.getDefaultInstance()) {
          getConversationDatasetBuilder().mergeFrom(value);
        } else {
          conversationDataset_ = value;
        }
      } else {
        conversationDatasetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConversationDataset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      conversationDataset_ = null;
      if (conversationDatasetBuilder_ != null) {
        conversationDatasetBuilder_.dispose();
        conversationDatasetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationDataset.Builder
        getConversationDatasetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConversationDatasetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder
        getConversationDatasetOrBuilder() {
      if (conversationDatasetBuilder_ != null) {
        return conversationDatasetBuilder_.getMessageOrBuilder();
      } else {
        return conversationDataset_ == null
            ? com.google.cloud.dialogflow.v2.ConversationDataset.getDefaultInstance()
            : conversationDataset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation dataset to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ConversationDataset conversation_dataset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationDataset,
            com.google.cloud.dialogflow.v2.ConversationDataset.Builder,
            com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>
        getConversationDatasetFieldBuilder() {
      if (conversationDatasetBuilder_ == null) {
        conversationDatasetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.ConversationDataset,
                com.google.cloud.dialogflow.v2.ConversationDataset.Builder,
                com.google.cloud.dialogflow.v2.ConversationDatasetOrBuilder>(
                getConversationDataset(), getParentForChildren(), isClean());
        conversationDataset_ = null;
      }
      return conversationDatasetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateConversationDatasetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateConversationDatasetRequest)
  private static final com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest();
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConversationDatasetRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConversationDatasetRequest>() {
        @java.lang.Override
        public CreateConversationDatasetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConversationDatasetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConversationDatasetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateConversationDatasetRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
