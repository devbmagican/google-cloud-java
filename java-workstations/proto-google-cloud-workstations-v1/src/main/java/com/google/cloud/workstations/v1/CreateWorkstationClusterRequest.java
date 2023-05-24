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
// source: google/cloud/workstations/v1/workstations.proto

package com.google.cloud.workstations.v1;

/**
 *
 *
 * <pre>
 * Message for creating a CreateWorkstationCluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.workstations.v1.CreateWorkstationClusterRequest}
 */
public final class CreateWorkstationClusterRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.workstations.v1.CreateWorkstationClusterRequest)
    CreateWorkstationClusterRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWorkstationClusterRequest.newBuilder() to construct.
  private CreateWorkstationClusterRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWorkstationClusterRequest() {
    parent_ = "";
    workstationClusterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWorkstationClusterRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.workstations.v1.WorkstationsProto
        .internal_static_google_cloud_workstations_v1_CreateWorkstationClusterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.workstations.v1.WorkstationsProto
        .internal_static_google_cloud_workstations_v1_CreateWorkstationClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.workstations.v1.CreateWorkstationClusterRequest.class,
            com.google.cloud.workstations.v1.CreateWorkstationClusterRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
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
   * Required. Parent resource name.
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

  public static final int WORKSTATION_CLUSTER_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object workstationClusterId_ = "";
  /**
   *
   *
   * <pre>
   * Required. ID to use for the workstation cluster.
   * </pre>
   *
   * <code>string workstation_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The workstationClusterId.
   */
  @java.lang.Override
  public java.lang.String getWorkstationClusterId() {
    java.lang.Object ref = workstationClusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workstationClusterId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. ID to use for the workstation cluster.
   * </pre>
   *
   * <code>string workstation_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for workstationClusterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWorkstationClusterIdBytes() {
    java.lang.Object ref = workstationClusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      workstationClusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKSTATION_CLUSTER_FIELD_NUMBER = 3;
  private com.google.cloud.workstations.v1.WorkstationCluster workstationCluster_;
  /**
   *
   *
   * <pre>
   * Required. Workstation cluster to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workstationCluster field is set.
   */
  @java.lang.Override
  public boolean hasWorkstationCluster() {
    return workstationCluster_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Workstation cluster to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workstationCluster.
   */
  @java.lang.Override
  public com.google.cloud.workstations.v1.WorkstationCluster getWorkstationCluster() {
    return workstationCluster_ == null
        ? com.google.cloud.workstations.v1.WorkstationCluster.getDefaultInstance()
        : workstationCluster_;
  }
  /**
   *
   *
   * <pre>
   * Required. Workstation cluster to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.workstations.v1.WorkstationClusterOrBuilder
      getWorkstationClusterOrBuilder() {
    return workstationCluster_ == null
        ? com.google.cloud.workstations.v1.WorkstationCluster.getDefaultInstance()
        : workstationCluster_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * If set, validate the request and preview the review, but do not actually
   * apply it.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workstationClusterId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, workstationClusterId_);
    }
    if (workstationCluster_ != null) {
      output.writeMessage(3, getWorkstationCluster());
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workstationClusterId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, workstationClusterId_);
    }
    if (workstationCluster_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getWorkstationCluster());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.workstations.v1.CreateWorkstationClusterRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.workstations.v1.CreateWorkstationClusterRequest other =
        (com.google.cloud.workstations.v1.CreateWorkstationClusterRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getWorkstationClusterId().equals(other.getWorkstationClusterId())) return false;
    if (hasWorkstationCluster() != other.hasWorkstationCluster()) return false;
    if (hasWorkstationCluster()) {
      if (!getWorkstationCluster().equals(other.getWorkstationCluster())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    hash = (37 * hash) + WORKSTATION_CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkstationClusterId().hashCode();
    if (hasWorkstationCluster()) {
      hash = (37 * hash) + WORKSTATION_CLUSTER_FIELD_NUMBER;
      hash = (53 * hash) + getWorkstationCluster().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest parseFrom(
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
      com.google.cloud.workstations.v1.CreateWorkstationClusterRequest prototype) {
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
   * Message for creating a CreateWorkstationCluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.workstations.v1.CreateWorkstationClusterRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.workstations.v1.CreateWorkstationClusterRequest)
      com.google.cloud.workstations.v1.CreateWorkstationClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.workstations.v1.WorkstationsProto
          .internal_static_google_cloud_workstations_v1_CreateWorkstationClusterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.workstations.v1.WorkstationsProto
          .internal_static_google_cloud_workstations_v1_CreateWorkstationClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.workstations.v1.CreateWorkstationClusterRequest.class,
              com.google.cloud.workstations.v1.CreateWorkstationClusterRequest.Builder.class);
    }

    // Construct using com.google.cloud.workstations.v1.CreateWorkstationClusterRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      workstationClusterId_ = "";
      workstationCluster_ = null;
      if (workstationClusterBuilder_ != null) {
        workstationClusterBuilder_.dispose();
        workstationClusterBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.workstations.v1.WorkstationsProto
          .internal_static_google_cloud_workstations_v1_CreateWorkstationClusterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1.CreateWorkstationClusterRequest
        getDefaultInstanceForType() {
      return com.google.cloud.workstations.v1.CreateWorkstationClusterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1.CreateWorkstationClusterRequest build() {
      com.google.cloud.workstations.v1.CreateWorkstationClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1.CreateWorkstationClusterRequest buildPartial() {
      com.google.cloud.workstations.v1.CreateWorkstationClusterRequest result =
          new com.google.cloud.workstations.v1.CreateWorkstationClusterRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.workstations.v1.CreateWorkstationClusterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.workstationClusterId_ = workstationClusterId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.workstationCluster_ =
            workstationClusterBuilder_ == null
                ? workstationCluster_
                : workstationClusterBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.workstations.v1.CreateWorkstationClusterRequest) {
        return mergeFrom((com.google.cloud.workstations.v1.CreateWorkstationClusterRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.workstations.v1.CreateWorkstationClusterRequest other) {
      if (other
          == com.google.cloud.workstations.v1.CreateWorkstationClusterRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getWorkstationClusterId().isEmpty()) {
        workstationClusterId_ = other.workstationClusterId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasWorkstationCluster()) {
        mergeWorkstationCluster(other.getWorkstationCluster());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                workstationClusterId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getWorkstationClusterFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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
     * Required. Parent resource name.
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
     * Required. Parent resource name.
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
     * Required. Parent resource name.
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
     * Required. Parent resource name.
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
     * Required. Parent resource name.
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

    private java.lang.Object workstationClusterId_ = "";
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation cluster.
     * </pre>
     *
     * <code>string workstation_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The workstationClusterId.
     */
    public java.lang.String getWorkstationClusterId() {
      java.lang.Object ref = workstationClusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workstationClusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation cluster.
     * </pre>
     *
     * <code>string workstation_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for workstationClusterId.
     */
    public com.google.protobuf.ByteString getWorkstationClusterIdBytes() {
      java.lang.Object ref = workstationClusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        workstationClusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation cluster.
     * </pre>
     *
     * <code>string workstation_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The workstationClusterId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkstationClusterId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      workstationClusterId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation cluster.
     * </pre>
     *
     * <code>string workstation_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWorkstationClusterId() {
      workstationClusterId_ = getDefaultInstance().getWorkstationClusterId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID to use for the workstation cluster.
     * </pre>
     *
     * <code>string workstation_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for workstationClusterId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkstationClusterIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      workstationClusterId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.workstations.v1.WorkstationCluster workstationCluster_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workstations.v1.WorkstationCluster,
            com.google.cloud.workstations.v1.WorkstationCluster.Builder,
            com.google.cloud.workstations.v1.WorkstationClusterOrBuilder>
        workstationClusterBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the workstationCluster field is set.
     */
    public boolean hasWorkstationCluster() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The workstationCluster.
     */
    public com.google.cloud.workstations.v1.WorkstationCluster getWorkstationCluster() {
      if (workstationClusterBuilder_ == null) {
        return workstationCluster_ == null
            ? com.google.cloud.workstations.v1.WorkstationCluster.getDefaultInstance()
            : workstationCluster_;
      } else {
        return workstationClusterBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkstationCluster(
        com.google.cloud.workstations.v1.WorkstationCluster value) {
      if (workstationClusterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workstationCluster_ = value;
      } else {
        workstationClusterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkstationCluster(
        com.google.cloud.workstations.v1.WorkstationCluster.Builder builderForValue) {
      if (workstationClusterBuilder_ == null) {
        workstationCluster_ = builderForValue.build();
      } else {
        workstationClusterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWorkstationCluster(
        com.google.cloud.workstations.v1.WorkstationCluster value) {
      if (workstationClusterBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && workstationCluster_ != null
            && workstationCluster_
                != com.google.cloud.workstations.v1.WorkstationCluster.getDefaultInstance()) {
          getWorkstationClusterBuilder().mergeFrom(value);
        } else {
          workstationCluster_ = value;
        }
      } else {
        workstationClusterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWorkstationCluster() {
      bitField0_ = (bitField0_ & ~0x00000004);
      workstationCluster_ = null;
      if (workstationClusterBuilder_ != null) {
        workstationClusterBuilder_.dispose();
        workstationClusterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workstations.v1.WorkstationCluster.Builder
        getWorkstationClusterBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getWorkstationClusterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workstations.v1.WorkstationClusterOrBuilder
        getWorkstationClusterOrBuilder() {
      if (workstationClusterBuilder_ != null) {
        return workstationClusterBuilder_.getMessageOrBuilder();
      } else {
        return workstationCluster_ == null
            ? com.google.cloud.workstations.v1.WorkstationCluster.getDefaultInstance()
            : workstationCluster_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation cluster to create.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1.WorkstationCluster workstation_cluster = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workstations.v1.WorkstationCluster,
            com.google.cloud.workstations.v1.WorkstationCluster.Builder,
            com.google.cloud.workstations.v1.WorkstationClusterOrBuilder>
        getWorkstationClusterFieldBuilder() {
      if (workstationClusterBuilder_ == null) {
        workstationClusterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.workstations.v1.WorkstationCluster,
                com.google.cloud.workstations.v1.WorkstationCluster.Builder,
                com.google.cloud.workstations.v1.WorkstationClusterOrBuilder>(
                getWorkstationCluster(), getParentForChildren(), isClean());
        workstationCluster_ = null;
      }
      return workstationClusterBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * apply it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * apply it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * apply it.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.workstations.v1.CreateWorkstationClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.workstations.v1.CreateWorkstationClusterRequest)
  private static final com.google.cloud.workstations.v1.CreateWorkstationClusterRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.workstations.v1.CreateWorkstationClusterRequest();
  }

  public static com.google.cloud.workstations.v1.CreateWorkstationClusterRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkstationClusterRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWorkstationClusterRequest>() {
        @java.lang.Override
        public CreateWorkstationClusterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateWorkstationClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkstationClusterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.workstations.v1.CreateWorkstationClusterRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
