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
// source: google/cloud/workstations/v1beta/workstations.proto

package com.google.cloud.workstations.v1beta;

/**
 *
 *
 * <pre>
 * Request message for UpdateWorkstation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.workstations.v1beta.UpdateWorkstationRequest}
 */
public final class UpdateWorkstationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.workstations.v1beta.UpdateWorkstationRequest)
    UpdateWorkstationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateWorkstationRequest.newBuilder() to construct.
  private UpdateWorkstationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateWorkstationRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateWorkstationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.workstations.v1beta.WorkstationsProto
        .internal_static_google_cloud_workstations_v1beta_UpdateWorkstationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.workstations.v1beta.WorkstationsProto
        .internal_static_google_cloud_workstations_v1beta_UpdateWorkstationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.workstations.v1beta.UpdateWorkstationRequest.class,
            com.google.cloud.workstations.v1beta.UpdateWorkstationRequest.Builder.class);
  }

  public static final int WORKSTATION_FIELD_NUMBER = 1;
  private com.google.cloud.workstations.v1beta.Workstation workstation_;
  /**
   *
   *
   * <pre>
   * Required. Workstation to update.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workstation field is set.
   */
  @java.lang.Override
  public boolean hasWorkstation() {
    return workstation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Workstation to update.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workstation.
   */
  @java.lang.Override
  public com.google.cloud.workstations.v1beta.Workstation getWorkstation() {
    return workstation_ == null
        ? com.google.cloud.workstations.v1beta.Workstation.getDefaultInstance()
        : workstation_;
  }
  /**
   *
   *
   * <pre>
   * Required. Workstation to update.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.workstations.v1beta.WorkstationOrBuilder getWorkstationOrBuilder() {
    return workstation_ == null
        ? com.google.cloud.workstations.v1beta.Workstation.getDefaultInstance()
        : workstation_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask specifying which fields in the workstation configuration
   * should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
   * Required. Mask specifying which fields in the workstation configuration
   * should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
   * Required. Mask specifying which fields in the workstation configuration
   * should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;
  /**
   *
   *
   * <pre>
   * If set, validate the request and preview the review, but do not actually
   * apply it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 4;
  private boolean allowMissing_ = false;
  /**
   *
   *
   * <pre>
   * If set and the workstation configuration is not found, a new
   * workstation configuration is created. In this situation, update_mask
   * is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 4;</code>
   *
   * @return The allowMissing.
   */
  @java.lang.Override
  public boolean getAllowMissing() {
    return allowMissing_;
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
    if (workstation_ != null) {
      output.writeMessage(1, getWorkstation());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    if (allowMissing_ != false) {
      output.writeBool(4, allowMissing_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workstation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWorkstation());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, allowMissing_);
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
    if (!(obj instanceof com.google.cloud.workstations.v1beta.UpdateWorkstationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.workstations.v1beta.UpdateWorkstationRequest other =
        (com.google.cloud.workstations.v1beta.UpdateWorkstationRequest) obj;

    if (hasWorkstation() != other.hasWorkstation()) return false;
    if (hasWorkstation()) {
      if (!getWorkstation().equals(other.getWorkstation())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
    if (getAllowMissing() != other.getAllowMissing()) return false;
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
    if (hasWorkstation()) {
      hash = (37 * hash) + WORKSTATION_FIELD_NUMBER;
      hash = (53 * hash) + getWorkstation().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowMissing());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest parseFrom(
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
      com.google.cloud.workstations.v1beta.UpdateWorkstationRequest prototype) {
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
   * Request message for UpdateWorkstation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.workstations.v1beta.UpdateWorkstationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.workstations.v1beta.UpdateWorkstationRequest)
      com.google.cloud.workstations.v1beta.UpdateWorkstationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.workstations.v1beta.WorkstationsProto
          .internal_static_google_cloud_workstations_v1beta_UpdateWorkstationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.workstations.v1beta.WorkstationsProto
          .internal_static_google_cloud_workstations_v1beta_UpdateWorkstationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.workstations.v1beta.UpdateWorkstationRequest.class,
              com.google.cloud.workstations.v1beta.UpdateWorkstationRequest.Builder.class);
    }

    // Construct using com.google.cloud.workstations.v1beta.UpdateWorkstationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      workstation_ = null;
      if (workstationBuilder_ != null) {
        workstationBuilder_.dispose();
        workstationBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;
      allowMissing_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.workstations.v1beta.WorkstationsProto
          .internal_static_google_cloud_workstations_v1beta_UpdateWorkstationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1beta.UpdateWorkstationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.workstations.v1beta.UpdateWorkstationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1beta.UpdateWorkstationRequest build() {
      com.google.cloud.workstations.v1beta.UpdateWorkstationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.workstations.v1beta.UpdateWorkstationRequest buildPartial() {
      com.google.cloud.workstations.v1beta.UpdateWorkstationRequest result =
          new com.google.cloud.workstations.v1beta.UpdateWorkstationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.workstations.v1beta.UpdateWorkstationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workstation_ =
            workstationBuilder_ == null ? workstation_ : workstationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.allowMissing_ = allowMissing_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.workstations.v1beta.UpdateWorkstationRequest) {
        return mergeFrom((com.google.cloud.workstations.v1beta.UpdateWorkstationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.workstations.v1beta.UpdateWorkstationRequest other) {
      if (other
          == com.google.cloud.workstations.v1beta.UpdateWorkstationRequest.getDefaultInstance())
        return this;
      if (other.hasWorkstation()) {
        mergeWorkstation(other.getWorkstation());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
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
                input.readMessage(getWorkstationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                allowMissing_ = input.readBool();
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

    private com.google.cloud.workstations.v1beta.Workstation workstation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workstations.v1beta.Workstation,
            com.google.cloud.workstations.v1beta.Workstation.Builder,
            com.google.cloud.workstations.v1beta.WorkstationOrBuilder>
        workstationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the workstation field is set.
     */
    public boolean hasWorkstation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The workstation.
     */
    public com.google.cloud.workstations.v1beta.Workstation getWorkstation() {
      if (workstationBuilder_ == null) {
        return workstation_ == null
            ? com.google.cloud.workstations.v1beta.Workstation.getDefaultInstance()
            : workstation_;
      } else {
        return workstationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkstation(com.google.cloud.workstations.v1beta.Workstation value) {
      if (workstationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workstation_ = value;
      } else {
        workstationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkstation(
        com.google.cloud.workstations.v1beta.Workstation.Builder builderForValue) {
      if (workstationBuilder_ == null) {
        workstation_ = builderForValue.build();
      } else {
        workstationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWorkstation(com.google.cloud.workstations.v1beta.Workstation value) {
      if (workstationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && workstation_ != null
            && workstation_
                != com.google.cloud.workstations.v1beta.Workstation.getDefaultInstance()) {
          getWorkstationBuilder().mergeFrom(value);
        } else {
          workstation_ = value;
        }
      } else {
        workstationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWorkstation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      workstation_ = null;
      if (workstationBuilder_ != null) {
        workstationBuilder_.dispose();
        workstationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workstations.v1beta.Workstation.Builder getWorkstationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWorkstationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workstations.v1beta.WorkstationOrBuilder getWorkstationOrBuilder() {
      if (workstationBuilder_ != null) {
        return workstationBuilder_.getMessageOrBuilder();
      } else {
        return workstation_ == null
            ? com.google.cloud.workstations.v1beta.Workstation.getDefaultInstance()
            : workstation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workstation to update.
     * </pre>
     *
     * <code>
     * .google.cloud.workstations.v1beta.Workstation workstation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workstations.v1beta.Workstation,
            com.google.cloud.workstations.v1beta.Workstation.Builder,
            com.google.cloud.workstations.v1beta.WorkstationOrBuilder>
        getWorkstationFieldBuilder() {
      if (workstationBuilder_ == null) {
        workstationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.workstations.v1beta.Workstation,
                com.google.cloud.workstations.v1beta.Workstation.Builder,
                com.google.cloud.workstations.v1beta.WorkstationOrBuilder>(
                getWorkstation(), getParentForChildren(), isClean());
        workstation_ = null;
      }
      return workstationBuilder_;
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask specifying which fields in the workstation configuration
     * should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * apply it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
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
     * <code>bool validate_only = 3;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
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
     * <code>bool validate_only = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
      onChanged();
      return this;
    }

    private boolean allowMissing_;
    /**
     *
     *
     * <pre>
     * If set and the workstation configuration is not found, a new
     * workstation configuration is created. In this situation, update_mask
     * is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 4;</code>
     *
     * @return The allowMissing.
     */
    @java.lang.Override
    public boolean getAllowMissing() {
      return allowMissing_;
    }
    /**
     *
     *
     * <pre>
     * If set and the workstation configuration is not found, a new
     * workstation configuration is created. In this situation, update_mask
     * is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 4;</code>
     *
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {

      allowMissing_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set and the workstation configuration is not found, a new
     * workstation configuration is created. In this situation, update_mask
     * is ignored.
     * </pre>
     *
     * <code>bool allow_missing = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      bitField0_ = (bitField0_ & ~0x00000008);
      allowMissing_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.workstations.v1beta.UpdateWorkstationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.workstations.v1beta.UpdateWorkstationRequest)
  private static final com.google.cloud.workstations.v1beta.UpdateWorkstationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.workstations.v1beta.UpdateWorkstationRequest();
  }

  public static com.google.cloud.workstations.v1beta.UpdateWorkstationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWorkstationRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateWorkstationRequest>() {
        @java.lang.Override
        public UpdateWorkstationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWorkstationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWorkstationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.workstations.v1beta.UpdateWorkstationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
