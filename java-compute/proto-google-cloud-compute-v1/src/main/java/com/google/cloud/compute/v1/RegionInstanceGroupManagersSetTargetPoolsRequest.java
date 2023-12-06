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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest}
 */
public final class RegionInstanceGroupManagersSetTargetPoolsRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest)
    RegionInstanceGroupManagersSetTargetPoolsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder() to construct.
  private RegionInstanceGroupManagersSetTargetPoolsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RegionInstanceGroupManagersSetTargetPoolsRequest() {
    fingerprint_ = "";
    targetPools_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RegionInstanceGroupManagersSetTargetPoolsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersSetTargetPoolsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersSetTargetPoolsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest.class,
            com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest.Builder
                .class);
  }

  private int bitField0_;
  public static final int FINGERPRINT_FIELD_NUMBER = 234678500;

  @SuppressWarnings("serial")
  private volatile java.lang.Object fingerprint_ = "";
  /**
   *
   *
   * <pre>
   * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  @java.lang.Override
  public boolean hasFingerprint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  @java.lang.Override
  public java.lang.String getFingerprint() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fingerprint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFingerprintBytes() {
    java.lang.Object ref = fingerprint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fingerprint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_POOLS_FIELD_NUMBER = 336072617;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList targetPools_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @return A list containing the targetPools.
   */
  public com.google.protobuf.ProtocolStringList getTargetPoolsList() {
    return targetPools_;
  }
  /**
   *
   *
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @return The count of targetPools.
   */
  public int getTargetPoolsCount() {
    return targetPools_.size();
  }
  /**
   *
   *
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @param index The index of the element to return.
   * @return The targetPools at the given index.
   */
  public java.lang.String getTargetPools(int index) {
    return targetPools_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
   * </pre>
   *
   * <code>repeated string target_pools = 336072617;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetPools at the given index.
   */
  public com.google.protobuf.ByteString getTargetPoolsBytes(int index) {
    return targetPools_.getByteString(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 234678500, fingerprint_);
    }
    for (int i = 0; i < targetPools_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 336072617, targetPools_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(234678500, fingerprint_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < targetPools_.size(); i++) {
        dataSize += computeStringSizeNoTag(targetPools_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getTargetPoolsList().size();
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
        instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest other =
        (com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest) obj;

    if (hasFingerprint() != other.hasFingerprint()) return false;
    if (hasFingerprint()) {
      if (!getFingerprint().equals(other.getFingerprint())) return false;
    }
    if (!getTargetPoolsList().equals(other.getTargetPoolsList())) return false;
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
    if (hasFingerprint()) {
      hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getFingerprint().hashCode();
    }
    if (getTargetPoolsCount() > 0) {
      hash = (37 * hash) + TARGET_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPoolsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      parseFrom(
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
      com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest)
      com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersSetTargetPoolsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersSetTargetPoolsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest.class,
              com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fingerprint_ = "";
      targetPools_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersSetTargetPoolsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest build() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
        buildPartial() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest result =
          new com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fingerprint_ = fingerprint_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        targetPools_.makeImmutable();
        result.targetPools_ = targetPools_;
      }
      result.bitField0_ |= to_bitField0_;
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
          instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest) {
        return mergeFrom(
            (com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest other) {
      if (other
          == com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
              .getDefaultInstance()) return this;
      if (other.hasFingerprint()) {
        fingerprint_ = other.fingerprint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.targetPools_.isEmpty()) {
        if (targetPools_.isEmpty()) {
          targetPools_ = other.targetPools_;
          bitField0_ |= 0x00000002;
        } else {
          ensureTargetPoolsIsMutable();
          targetPools_.addAll(other.targetPools_);
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
            case 1877428002:
              {
                fingerprint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1877428002
            case -1606386358:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureTargetPoolsIsMutable();
                targetPools_.add(s);
                break;
              } // case -1606386358
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

    private java.lang.Object fingerprint_ = "";
    /**
     *
     *
     * <pre>
     * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     *
     * @return Whether the fingerprint field is set.
     */
    public boolean hasFingerprint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     *
     * @return The fingerprint.
     */
    public java.lang.String getFingerprint() {
      java.lang.Object ref = fingerprint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fingerprint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     *
     * @return The bytes for fingerprint.
     */
    public com.google.protobuf.ByteString getFingerprintBytes() {
      java.lang.Object ref = fingerprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fingerprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     *
     * @param value The fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      fingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFingerprint() {
      fingerprint_ = getDefaultInstance().getFingerprint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool entries. This field is optional.
     * </pre>
     *
     * <code>optional string fingerprint = 234678500;</code>
     *
     * @param value The bytes for fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprintBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      fingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList targetPools_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureTargetPoolsIsMutable() {
      if (!targetPools_.isModifiable()) {
        targetPools_ = new com.google.protobuf.LazyStringArrayList(targetPools_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @return A list containing the targetPools.
     */
    public com.google.protobuf.ProtocolStringList getTargetPoolsList() {
      targetPools_.makeImmutable();
      return targetPools_;
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @return The count of targetPools.
     */
    public int getTargetPoolsCount() {
      return targetPools_.size();
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @param index The index of the element to return.
     * @return The targetPools at the given index.
     */
    public java.lang.String getTargetPools(int index) {
      return targetPools_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the targetPools at the given index.
     */
    public com.google.protobuf.ByteString getTargetPoolsBytes(int index) {
      return targetPools_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @param index The index to set the value at.
     * @param value The targetPools to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPools(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTargetPoolsIsMutable();
      targetPools_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @param value The targetPools to add.
     * @return This builder for chaining.
     */
    public Builder addTargetPools(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTargetPoolsIsMutable();
      targetPools_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @param values The targetPools to add.
     * @return This builder for chaining.
     */
    public Builder addAllTargetPools(java.lang.Iterable<java.lang.String> values) {
      ensureTargetPoolsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, targetPools_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetPools() {
      targetPools_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * </pre>
     *
     * <code>repeated string target_pools = 336072617;</code>
     *
     * @param value The bytes of the targetPools to add.
     * @return This builder for chaining.
     */
    public Builder addTargetPoolsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureTargetPoolsIsMutable();
      targetPools_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest)
  private static final com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest();
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionInstanceGroupManagersSetTargetPoolsRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<
              RegionInstanceGroupManagersSetTargetPoolsRequest>() {
            @java.lang.Override
            public RegionInstanceGroupManagersSetTargetPoolsRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<RegionInstanceGroupManagersSetTargetPoolsRequest>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionInstanceGroupManagersSetTargetPoolsRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
