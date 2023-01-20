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
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [Webhooks.CreateWebhook][google.cloud.dialogflow.cx.v3beta1.Webhooks.CreateWebhook].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest}
 */
public final class CreateWebhookRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest)
    CreateWebhookRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWebhookRequest.newBuilder() to construct.
  private CreateWebhookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWebhookRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWebhookRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The agent to create a webhook for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
   * Required. The agent to create a webhook for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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

  public static final int WEBHOOK_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3beta1.Webhook webhook_;
  /**
   *
   *
   * <pre>
   * Required. The webhook to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the webhook field is set.
   */
  @java.lang.Override
  public boolean hasWebhook() {
    return webhook_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The webhook to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The webhook.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.Webhook getWebhook() {
    return webhook_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.Webhook.getDefaultInstance()
        : webhook_;
  }
  /**
   *
   *
   * <pre>
   * Required. The webhook to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder getWebhookOrBuilder() {
    return webhook_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.Webhook.getDefaultInstance()
        : webhook_;
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
    if (webhook_ != null) {
      output.writeMessage(2, getWebhook());
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
    if (webhook_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getWebhook());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasWebhook() != other.hasWebhook()) return false;
    if (hasWebhook()) {
      if (!getWebhook().equals(other.getWebhook())) return false;
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
    if (hasWebhook()) {
      hash = (37 * hash) + WEBHOOK_FIELD_NUMBER;
      hash = (53 * hash) + getWebhook().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest prototype) {
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
   * [Webhooks.CreateWebhook][google.cloud.dialogflow.cx.v3beta1.Webhooks.CreateWebhook].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest)
      com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      webhook_ = null;
      if (webhookBuilder_ != null) {
        webhookBuilder_.dispose();
        webhookBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.WebhookProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.webhook_ = webhookBuilder_ == null ? webhook_ : webhookBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasWebhook()) {
        mergeWebhook(other.getWebhook());
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
                input.readMessage(getWebhookFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The agent to create a webhook for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
     * Required. The agent to create a webhook for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
     * Required. The agent to create a webhook for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a webhook for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a webhook for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.cx.v3beta1.Webhook webhook_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Webhook,
            com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder>
        webhookBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the webhook field is set.
     */
    public boolean hasWebhook() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The webhook.
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Webhook getWebhook() {
      if (webhookBuilder_ == null) {
        return webhook_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.Webhook.getDefaultInstance()
            : webhook_;
      } else {
        return webhookBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWebhook(com.google.cloud.dialogflow.cx.v3beta1.Webhook value) {
      if (webhookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        webhook_ = value;
      } else {
        webhookBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWebhook(
        com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder builderForValue) {
      if (webhookBuilder_ == null) {
        webhook_ = builderForValue.build();
      } else {
        webhookBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWebhook(com.google.cloud.dialogflow.cx.v3beta1.Webhook value) {
      if (webhookBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && webhook_ != null
            && webhook_ != com.google.cloud.dialogflow.cx.v3beta1.Webhook.getDefaultInstance()) {
          getWebhookBuilder().mergeFrom(value);
        } else {
          webhook_ = value;
        }
      } else {
        webhookBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWebhook() {
      bitField0_ = (bitField0_ & ~0x00000002);
      webhook_ = null;
      if (webhookBuilder_ != null) {
        webhookBuilder_.dispose();
        webhookBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder getWebhookBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWebhookFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder getWebhookOrBuilder() {
      if (webhookBuilder_ != null) {
        return webhookBuilder_.getMessageOrBuilder();
      } else {
        return webhook_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.Webhook.getDefaultInstance()
            : webhook_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The webhook to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Webhook webhook = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Webhook,
            com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder>
        getWebhookFieldBuilder() {
      if (webhookBuilder_ == null) {
        webhookBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3beta1.Webhook,
                com.google.cloud.dialogflow.cx.v3beta1.Webhook.Builder,
                com.google.cloud.dialogflow.cx.v3beta1.WebhookOrBuilder>(
                getWebhook(), getParentForChildren(), isClean());
        webhook_ = null;
      }
      return webhookBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWebhookRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWebhookRequest>() {
        @java.lang.Override
        public CreateWebhookRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWebhookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWebhookRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.CreateWebhookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
