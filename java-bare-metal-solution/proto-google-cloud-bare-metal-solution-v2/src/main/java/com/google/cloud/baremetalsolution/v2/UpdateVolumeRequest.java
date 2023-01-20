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
// source: google/cloud/baremetalsolution/v2/volume.proto

package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message for updating a volume.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.UpdateVolumeRequest}
 */
public final class UpdateVolumeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.UpdateVolumeRequest)
    UpdateVolumeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateVolumeRequest.newBuilder() to construct.
  private UpdateVolumeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateVolumeRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateVolumeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.VolumeProto
        .internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.VolumeProto
        .internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest.class,
            com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest.Builder.class);
  }

  public static final int VOLUME_FIELD_NUMBER = 1;
  private com.google.cloud.baremetalsolution.v2.Volume volume_;
  /**
   *
   *
   * <pre>
   * Required. The volume to update.
   * The `name` field is used to identify the volume to update.
   * Format: projects/{project}/locations/{location}/volumes/{volume}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the volume field is set.
   */
  @java.lang.Override
  public boolean hasVolume() {
    return volume_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The volume to update.
   * The `name` field is used to identify the volume to update.
   * Format: projects/{project}/locations/{location}/volumes/{volume}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The volume.
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.Volume getVolume() {
    return volume_ == null
        ? com.google.cloud.baremetalsolution.v2.Volume.getDefaultInstance()
        : volume_;
  }
  /**
   *
   *
   * <pre>
   * Required. The volume to update.
   * The `name` field is used to identify the volume to update.
   * Format: projects/{project}/locations/{location}/volumes/{volume}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.VolumeOrBuilder getVolumeOrBuilder() {
    return volume_ == null
        ? com.google.cloud.baremetalsolution.v2.Volume.getDefaultInstance()
        : volume_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `snapshot_auto_delete_behavior`
   *   `snapshot_schedule_policy_name`
   *   'labels'
   *   'snapshot_enabled'
   *   'snapshot_reservation_detail.reserved_space_percent'
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `snapshot_auto_delete_behavior`
   *   `snapshot_schedule_policy_name`
   *   'labels'
   *   'snapshot_enabled'
   *   'snapshot_reservation_detail.reserved_space_percent'
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `snapshot_auto_delete_behavior`
   *   `snapshot_schedule_policy_name`
   *   'labels'
   *   'snapshot_enabled'
   *   'snapshot_reservation_detail.reserved_space_percent'
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (volume_ != null) {
      output.writeMessage(1, getVolume());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (volume_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getVolume());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest other =
        (com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest) obj;

    if (hasVolume() != other.hasVolume()) return false;
    if (hasVolume()) {
      if (!getVolume().equals(other.getVolume())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasVolume()) {
      hash = (37 * hash) + VOLUME_FIELD_NUMBER;
      hash = (53 * hash) + getVolume().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest parseFrom(
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
      com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest prototype) {
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
   * Message for updating a volume.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.UpdateVolumeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.UpdateVolumeRequest)
      com.google.cloud.baremetalsolution.v2.UpdateVolumeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.VolumeProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.VolumeProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest.class,
              com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      volume_ = null;
      if (volumeBuilder_ != null) {
        volumeBuilder_.dispose();
        volumeBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.VolumeProto
          .internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest build() {
      com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest buildPartial() {
      com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest result =
          new com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.volume_ = volumeBuilder_ == null ? volume_ : volumeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest other) {
      if (other == com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest.getDefaultInstance())
        return this;
      if (other.hasVolume()) {
        mergeVolume(other.getVolume());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getVolumeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.baremetalsolution.v2.Volume volume_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.Volume,
            com.google.cloud.baremetalsolution.v2.Volume.Builder,
            com.google.cloud.baremetalsolution.v2.VolumeOrBuilder>
        volumeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the volume field is set.
     */
    public boolean hasVolume() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The volume.
     */
    public com.google.cloud.baremetalsolution.v2.Volume getVolume() {
      if (volumeBuilder_ == null) {
        return volume_ == null
            ? com.google.cloud.baremetalsolution.v2.Volume.getDefaultInstance()
            : volume_;
      } else {
        return volumeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setVolume(com.google.cloud.baremetalsolution.v2.Volume value) {
      if (volumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volume_ = value;
      } else {
        volumeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setVolume(com.google.cloud.baremetalsolution.v2.Volume.Builder builderForValue) {
      if (volumeBuilder_ == null) {
        volume_ = builderForValue.build();
      } else {
        volumeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeVolume(com.google.cloud.baremetalsolution.v2.Volume value) {
      if (volumeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && volume_ != null
            && volume_ != com.google.cloud.baremetalsolution.v2.Volume.getDefaultInstance()) {
          getVolumeBuilder().mergeFrom(value);
        } else {
          volume_ = value;
        }
      } else {
        volumeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearVolume() {
      bitField0_ = (bitField0_ & ~0x00000001);
      volume_ = null;
      if (volumeBuilder_ != null) {
        volumeBuilder_.dispose();
        volumeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.Volume.Builder getVolumeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVolumeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.baremetalsolution.v2.VolumeOrBuilder getVolumeOrBuilder() {
      if (volumeBuilder_ != null) {
        return volumeBuilder_.getMessageOrBuilder();
      } else {
        return volume_ == null
            ? com.google.cloud.baremetalsolution.v2.Volume.getDefaultInstance()
            : volume_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The volume to update.
     * The `name` field is used to identify the volume to update.
     * Format: projects/{project}/locations/{location}/volumes/{volume}
     * </pre>
     *
     * <code>
     * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.Volume,
            com.google.cloud.baremetalsolution.v2.Volume.Builder,
            com.google.cloud.baremetalsolution.v2.VolumeOrBuilder>
        getVolumeFieldBuilder() {
      if (volumeBuilder_ == null) {
        volumeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.baremetalsolution.v2.Volume,
                com.google.cloud.baremetalsolution.v2.Volume.Builder,
                com.google.cloud.baremetalsolution.v2.VolumeOrBuilder>(
                getVolume(), getParentForChildren(), isClean());
        volume_ = null;
      }
      return volumeBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * The only currently supported fields are:
     *   `snapshot_auto_delete_behavior`
     *   `snapshot_schedule_policy_name`
     *   'labels'
     *   'snapshot_enabled'
     *   'snapshot_reservation_detail.reserved_space_percent'
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.UpdateVolumeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.UpdateVolumeRequest)
  private static final com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest();
  }

  public static com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateVolumeRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateVolumeRequest>() {
        @java.lang.Override
        public UpdateVolumeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateVolumeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateVolumeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
