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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * A request message for Disks.GetIamPolicy. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetIamPolicyDiskRequest}
 */
public final class GetIamPolicyDiskRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetIamPolicyDiskRequest)
    GetIamPolicyDiskRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetIamPolicyDiskRequest.newBuilder() to construct.
  private GetIamPolicyDiskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetIamPolicyDiskRequest() {
    project_ = "";
    resource_ = "";
    zone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetIamPolicyDiskRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GetIamPolicyDiskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GetIamPolicyDiskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetIamPolicyDiskRequest.class,
            com.google.cloud.compute.v1.GetIamPolicyDiskRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OPTIONS_REQUESTED_POLICY_VERSION_FIELD_NUMBER = 499220029;
  private int optionsRequestedPolicyVersion_ = 0;
  /**
   *
   *
   * <pre>
   * Requested IAM Policy version.
   * </pre>
   *
   * <code>optional int32 options_requested_policy_version = 499220029;</code>
   *
   * @return Whether the optionsRequestedPolicyVersion field is set.
   */
  @java.lang.Override
  public boolean hasOptionsRequestedPolicyVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Requested IAM Policy version.
   * </pre>
   *
   * <code>optional int32 options_requested_policy_version = 499220029;</code>
   *
   * @return The optionsRequestedPolicyVersion.
   */
  @java.lang.Override
  public int getOptionsRequestedPolicyVersion() {
    return optionsRequestedPolicyVersion_;
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;

  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 195806222;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 3744684;

  @SuppressWarnings("serial")
  private volatile java.lang.Object zone_ = "";
  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      zone_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3744684, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(499220029, optionsRequestedPolicyVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3744684, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(
              499220029, optionsRequestedPolicyVersion_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetIamPolicyDiskRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetIamPolicyDiskRequest other =
        (com.google.cloud.compute.v1.GetIamPolicyDiskRequest) obj;

    if (hasOptionsRequestedPolicyVersion() != other.hasOptionsRequestedPolicyVersion())
      return false;
    if (hasOptionsRequestedPolicyVersion()) {
      if (getOptionsRequestedPolicyVersion() != other.getOptionsRequestedPolicyVersion())
        return false;
    }
    if (!getProject().equals(other.getProject())) return false;
    if (!getResource().equals(other.getResource())) return false;
    if (!getZone().equals(other.getZone())) return false;
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
    if (hasOptionsRequestedPolicyVersion()) {
      hash = (37 * hash) + OPTIONS_REQUESTED_POLICY_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsRequestedPolicyVersion();
    }
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.GetIamPolicyDiskRequest prototype) {
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
   * A request message for Disks.GetIamPolicy. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetIamPolicyDiskRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetIamPolicyDiskRequest)
      com.google.cloud.compute.v1.GetIamPolicyDiskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetIamPolicyDiskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetIamPolicyDiskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetIamPolicyDiskRequest.class,
              com.google.cloud.compute.v1.GetIamPolicyDiskRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetIamPolicyDiskRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      optionsRequestedPolicyVersion_ = 0;
      project_ = "";
      resource_ = "";
      zone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetIamPolicyDiskRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetIamPolicyDiskRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetIamPolicyDiskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetIamPolicyDiskRequest build() {
      com.google.cloud.compute.v1.GetIamPolicyDiskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetIamPolicyDiskRequest buildPartial() {
      com.google.cloud.compute.v1.GetIamPolicyDiskRequest result =
          new com.google.cloud.compute.v1.GetIamPolicyDiskRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.GetIamPolicyDiskRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.optionsRequestedPolicyVersion_ = optionsRequestedPolicyVersion_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resource_ = resource_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.zone_ = zone_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.GetIamPolicyDiskRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetIamPolicyDiskRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetIamPolicyDiskRequest other) {
      if (other == com.google.cloud.compute.v1.GetIamPolicyDiskRequest.getDefaultInstance())
        return this;
      if (other.hasOptionsRequestedPolicyVersion()) {
        setOptionsRequestedPolicyVersion(other.getOptionsRequestedPolicyVersion());
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        bitField0_ |= 0x00000008;
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
            case 29957474:
              {
                zone_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 29957474
            case 1566449778:
              {
                resource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 1566449778
            case 1820481738:
              {
                project_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1820481738
            case -301207064:
              {
                optionsRequestedPolicyVersion_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case -301207064
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

    private int optionsRequestedPolicyVersion_;
    /**
     *
     *
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     *
     * @return Whether the optionsRequestedPolicyVersion field is set.
     */
    @java.lang.Override
    public boolean hasOptionsRequestedPolicyVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     *
     * @return The optionsRequestedPolicyVersion.
     */
    @java.lang.Override
    public int getOptionsRequestedPolicyVersion() {
      return optionsRequestedPolicyVersion_;
    }
    /**
     *
     *
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     *
     * @param value The optionsRequestedPolicyVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOptionsRequestedPolicyVersion(int value) {

      optionsRequestedPolicyVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOptionsRequestedPolicyVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      optionsRequestedPolicyVersion_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      project_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resource_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resource_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     *
     *
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      zone_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      zone_ = getDefaultInstance().getZone();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      zone_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetIamPolicyDiskRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetIamPolicyDiskRequest)
  private static final com.google.cloud.compute.v1.GetIamPolicyDiskRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetIamPolicyDiskRequest();
  }

  public static com.google.cloud.compute.v1.GetIamPolicyDiskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetIamPolicyDiskRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetIamPolicyDiskRequest>() {
        @java.lang.Override
        public GetIamPolicyDiskRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetIamPolicyDiskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetIamPolicyDiskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetIamPolicyDiskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
