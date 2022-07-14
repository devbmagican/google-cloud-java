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
// source: google/cloud/notebooks/v1/managed_service.proto

package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Request for creating a Managed Notebook Runtime.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.CreateRuntimeRequest}
 */
public final class CreateRuntimeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.CreateRuntimeRequest)
    CreateRuntimeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateRuntimeRequest.newBuilder() to construct.
  private CreateRuntimeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateRuntimeRequest() {
    parent_ = "";
    runtimeId_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateRuntimeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateRuntimeRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              runtimeId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.notebooks.v1.Runtime.Builder subBuilder = null;
              if (runtime_ != null) {
                subBuilder = runtime_.toBuilder();
              }
              runtime_ =
                  input.readMessage(
                      com.google.cloud.notebooks.v1.Runtime.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(runtime_);
                runtime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              requestId_ = s;
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
    return com.google.cloud.notebooks.v1.ManagedNotebooksProto
        .internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.ManagedNotebooksProto
        .internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.CreateRuntimeRequest.class,
            com.google.cloud.notebooks.v1.CreateRuntimeRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
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
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
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

  public static final int RUNTIME_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object runtimeId_;
  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this Runtime.
   * </pre>
   *
   * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The runtimeId.
   */
  @java.lang.Override
  public java.lang.String getRuntimeId() {
    java.lang.Object ref = runtimeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runtimeId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this Runtime.
   * </pre>
   *
   * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for runtimeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRuntimeIdBytes() {
    java.lang.Object ref = runtimeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      runtimeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RUNTIME_FIELD_NUMBER = 3;
  private com.google.cloud.notebooks.v1.Runtime runtime_;
  /**
   *
   *
   * <pre>
   * Required. The Runtime to be created.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the runtime field is set.
   */
  @java.lang.Override
  public boolean hasRuntime() {
    return runtime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Runtime to be created.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The runtime.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.Runtime getRuntime() {
    return runtime_ == null ? com.google.cloud.notebooks.v1.Runtime.getDefaultInstance() : runtime_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Runtime to be created.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeOrBuilder getRuntimeOrBuilder() {
    return getRuntime();
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object requestId_;
  /**
   *
   *
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runtimeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, runtimeId_);
    }
    if (runtime_ != null) {
      output.writeMessage(3, getRuntime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, requestId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runtimeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, runtimeId_);
    }
    if (runtime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getRuntime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, requestId_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.CreateRuntimeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.CreateRuntimeRequest other =
        (com.google.cloud.notebooks.v1.CreateRuntimeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getRuntimeId().equals(other.getRuntimeId())) return false;
    if (hasRuntime() != other.hasRuntime()) return false;
    if (hasRuntime()) {
      if (!getRuntime().equals(other.getRuntime())) return false;
    }
    if (!getRequestId().equals(other.getRequestId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + RUNTIME_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuntimeId().hashCode();
    if (hasRuntime()) {
      hash = (37 * hash) + RUNTIME_FIELD_NUMBER;
      hash = (53 * hash) + getRuntime().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.notebooks.v1.CreateRuntimeRequest prototype) {
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
   * Request for creating a Managed Notebook Runtime.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.CreateRuntimeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.CreateRuntimeRequest)
      com.google.cloud.notebooks.v1.CreateRuntimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto
          .internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto
          .internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.CreateRuntimeRequest.class,
              com.google.cloud.notebooks.v1.CreateRuntimeRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.CreateRuntimeRequest.newBuilder()
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
      parent_ = "";

      runtimeId_ = "";

      if (runtimeBuilder_ == null) {
        runtime_ = null;
      } else {
        runtime_ = null;
        runtimeBuilder_ = null;
      }
      requestId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto
          .internal_static_google_cloud_notebooks_v1_CreateRuntimeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.CreateRuntimeRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.CreateRuntimeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.CreateRuntimeRequest build() {
      com.google.cloud.notebooks.v1.CreateRuntimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.CreateRuntimeRequest buildPartial() {
      com.google.cloud.notebooks.v1.CreateRuntimeRequest result =
          new com.google.cloud.notebooks.v1.CreateRuntimeRequest(this);
      result.parent_ = parent_;
      result.runtimeId_ = runtimeId_;
      if (runtimeBuilder_ == null) {
        result.runtime_ = runtime_;
      } else {
        result.runtime_ = runtimeBuilder_.build();
      }
      result.requestId_ = requestId_;
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
      if (other instanceof com.google.cloud.notebooks.v1.CreateRuntimeRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.CreateRuntimeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.CreateRuntimeRequest other) {
      if (other == com.google.cloud.notebooks.v1.CreateRuntimeRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getRuntimeId().isEmpty()) {
        runtimeId_ = other.runtimeId_;
        onChanged();
      }
      if (other.hasRuntime()) {
        mergeRuntime(other.getRuntime());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        onChanged();
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
      com.google.cloud.notebooks.v1.CreateRuntimeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.notebooks.v1.CreateRuntimeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
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
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
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
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
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
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
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
     * Required. Format:
     * `parent=projects/{project_id}/locations/{location}`
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

    private java.lang.Object runtimeId_ = "";
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this Runtime.
     * </pre>
     *
     * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The runtimeId.
     */
    public java.lang.String getRuntimeId() {
      java.lang.Object ref = runtimeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runtimeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this Runtime.
     * </pre>
     *
     * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for runtimeId.
     */
    public com.google.protobuf.ByteString getRuntimeIdBytes() {
      java.lang.Object ref = runtimeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        runtimeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this Runtime.
     * </pre>
     *
     * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The runtimeId to set.
     * @return This builder for chaining.
     */
    public Builder setRuntimeId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      runtimeId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this Runtime.
     * </pre>
     *
     * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRuntimeId() {

      runtimeId_ = getDefaultInstance().getRuntimeId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. User-defined unique ID of this Runtime.
     * </pre>
     *
     * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for runtimeId to set.
     * @return This builder for chaining.
     */
    public Builder setRuntimeIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      runtimeId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.notebooks.v1.Runtime runtime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.Runtime,
            com.google.cloud.notebooks.v1.Runtime.Builder,
            com.google.cloud.notebooks.v1.RuntimeOrBuilder>
        runtimeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the runtime field is set.
     */
    public boolean hasRuntime() {
      return runtimeBuilder_ != null || runtime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The runtime.
     */
    public com.google.cloud.notebooks.v1.Runtime getRuntime() {
      if (runtimeBuilder_ == null) {
        return runtime_ == null
            ? com.google.cloud.notebooks.v1.Runtime.getDefaultInstance()
            : runtime_;
      } else {
        return runtimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRuntime(com.google.cloud.notebooks.v1.Runtime value) {
      if (runtimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        runtime_ = value;
        onChanged();
      } else {
        runtimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRuntime(com.google.cloud.notebooks.v1.Runtime.Builder builderForValue) {
      if (runtimeBuilder_ == null) {
        runtime_ = builderForValue.build();
        onChanged();
      } else {
        runtimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRuntime(com.google.cloud.notebooks.v1.Runtime value) {
      if (runtimeBuilder_ == null) {
        if (runtime_ != null) {
          runtime_ =
              com.google.cloud.notebooks.v1.Runtime.newBuilder(runtime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          runtime_ = value;
        }
        onChanged();
      } else {
        runtimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRuntime() {
      if (runtimeBuilder_ == null) {
        runtime_ = null;
        onChanged();
      } else {
        runtime_ = null;
        runtimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v1.Runtime.Builder getRuntimeBuilder() {

      onChanged();
      return getRuntimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v1.RuntimeOrBuilder getRuntimeOrBuilder() {
      if (runtimeBuilder_ != null) {
        return runtimeBuilder_.getMessageOrBuilder();
      } else {
        return runtime_ == null
            ? com.google.cloud.notebooks.v1.Runtime.getDefaultInstance()
            : runtime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Runtime to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.Runtime,
            com.google.cloud.notebooks.v1.Runtime.Builder,
            com.google.cloud.notebooks.v1.RuntimeOrBuilder>
        getRuntimeFieldBuilder() {
      if (runtimeBuilder_ == null) {
        runtimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.notebooks.v1.Runtime,
                com.google.cloud.notebooks.v1.Runtime.Builder,
                com.google.cloud.notebooks.v1.RuntimeOrBuilder>(
                getRuntime(), getParentForChildren(), isClean());
        runtime_ = null;
      }
      return runtimeBuilder_;
    }

    private java.lang.Object requestId_ = "";
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     *
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     *
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     *
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {

      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     *
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      requestId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.CreateRuntimeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.CreateRuntimeRequest)
  private static final com.google.cloud.notebooks.v1.CreateRuntimeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.CreateRuntimeRequest();
  }

  public static com.google.cloud.notebooks.v1.CreateRuntimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRuntimeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateRuntimeRequest>() {
        @java.lang.Override
        public CreateRuntimeRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateRuntimeRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateRuntimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRuntimeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.CreateRuntimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
