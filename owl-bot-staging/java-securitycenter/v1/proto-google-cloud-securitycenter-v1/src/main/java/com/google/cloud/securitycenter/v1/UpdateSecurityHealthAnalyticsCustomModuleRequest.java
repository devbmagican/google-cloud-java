// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 * <pre>
 * Request message for updating Security Health Analytics custom modules.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest}
 */
public final class UpdateSecurityHealthAnalyticsCustomModuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest)
    UpdateSecurityHealthAnalyticsCustomModuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSecurityHealthAnalyticsCustomModuleRequest.newBuilder() to construct.
  private UpdateSecurityHealthAnalyticsCustomModuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSecurityHealthAnalyticsCustomModuleRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSecurityHealthAnalyticsCustomModuleRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSecurityHealthAnalyticsCustomModuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSecurityHealthAnalyticsCustomModuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest.class, com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest.Builder.class);
  }

  public static final int SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE_FIELD_NUMBER = 1;
  private com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule_;
  /**
   * <pre>
   * Required. The SecurityHealthAnalytics custom module to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the securityHealthAnalyticsCustomModule field is set.
   */
  @java.lang.Override
  public boolean hasSecurityHealthAnalyticsCustomModule() {
    return securityHealthAnalyticsCustomModule_ != null;
  }
  /**
   * <pre>
   * Required. The SecurityHealthAnalytics custom module to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityHealthAnalyticsCustomModule.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule getSecurityHealthAnalyticsCustomModule() {
    return securityHealthAnalyticsCustomModule_ == null ? com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance() : securityHealthAnalyticsCustomModule_;
  }
  /**
   * <pre>
   * Required. The SecurityHealthAnalytics custom module to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder getSecurityHealthAnalyticsCustomModuleOrBuilder() {
    return securityHealthAnalyticsCustomModule_ == null ? com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance() : securityHealthAnalyticsCustomModule_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The list of fields to update.
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (securityHealthAnalyticsCustomModule_ != null) {
      output.writeMessage(1, getSecurityHealthAnalyticsCustomModule());
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
    if (securityHealthAnalyticsCustomModule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSecurityHealthAnalyticsCustomModule());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest other = (com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest) obj;

    if (hasSecurityHealthAnalyticsCustomModule() != other.hasSecurityHealthAnalyticsCustomModule()) return false;
    if (hasSecurityHealthAnalyticsCustomModule()) {
      if (!getSecurityHealthAnalyticsCustomModule()
          .equals(other.getSecurityHealthAnalyticsCustomModule())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasSecurityHealthAnalyticsCustomModule()) {
      hash = (37 * hash) + SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityHealthAnalyticsCustomModule().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for updating Security Health Analytics custom modules.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest)
      com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSecurityHealthAnalyticsCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSecurityHealthAnalyticsCustomModuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest.class, com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      securityHealthAnalyticsCustomModule_ = null;
      if (securityHealthAnalyticsCustomModuleBuilder_ != null) {
        securityHealthAnalyticsCustomModuleBuilder_.dispose();
        securityHealthAnalyticsCustomModuleBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_UpdateSecurityHealthAnalyticsCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest build() {
      com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest buildPartial() {
      com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest result = new com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.securityHealthAnalyticsCustomModule_ = securityHealthAnalyticsCustomModuleBuilder_ == null
            ? securityHealthAnalyticsCustomModule_
            : securityHealthAnalyticsCustomModuleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest other) {
      if (other == com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest.getDefaultInstance()) return this;
      if (other.hasSecurityHealthAnalyticsCustomModule()) {
        mergeSecurityHealthAnalyticsCustomModule(other.getSecurityHealthAnalyticsCustomModule());
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
            case 10: {
              input.readMessage(
                  getSecurityHealthAnalyticsCustomModuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder> securityHealthAnalyticsCustomModuleBuilder_;
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the securityHealthAnalyticsCustomModule field is set.
     */
    public boolean hasSecurityHealthAnalyticsCustomModule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The securityHealthAnalyticsCustomModule.
     */
    public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule getSecurityHealthAnalyticsCustomModule() {
      if (securityHealthAnalyticsCustomModuleBuilder_ == null) {
        return securityHealthAnalyticsCustomModule_ == null ? com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance() : securityHealthAnalyticsCustomModule_;
      } else {
        return securityHealthAnalyticsCustomModuleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecurityHealthAnalyticsCustomModule(com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule value) {
      if (securityHealthAnalyticsCustomModuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        securityHealthAnalyticsCustomModule_ = value;
      } else {
        securityHealthAnalyticsCustomModuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecurityHealthAnalyticsCustomModule(
        com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder builderForValue) {
      if (securityHealthAnalyticsCustomModuleBuilder_ == null) {
        securityHealthAnalyticsCustomModule_ = builderForValue.build();
      } else {
        securityHealthAnalyticsCustomModuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSecurityHealthAnalyticsCustomModule(com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule value) {
      if (securityHealthAnalyticsCustomModuleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          securityHealthAnalyticsCustomModule_ != null &&
          securityHealthAnalyticsCustomModule_ != com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance()) {
          getSecurityHealthAnalyticsCustomModuleBuilder().mergeFrom(value);
        } else {
          securityHealthAnalyticsCustomModule_ = value;
        }
      } else {
        securityHealthAnalyticsCustomModuleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSecurityHealthAnalyticsCustomModule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      securityHealthAnalyticsCustomModule_ = null;
      if (securityHealthAnalyticsCustomModuleBuilder_ != null) {
        securityHealthAnalyticsCustomModuleBuilder_.dispose();
        securityHealthAnalyticsCustomModuleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder getSecurityHealthAnalyticsCustomModuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSecurityHealthAnalyticsCustomModuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder getSecurityHealthAnalyticsCustomModuleOrBuilder() {
      if (securityHealthAnalyticsCustomModuleBuilder_ != null) {
        return securityHealthAnalyticsCustomModuleBuilder_.getMessageOrBuilder();
      } else {
        return securityHealthAnalyticsCustomModule_ == null ?
            com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance() : securityHealthAnalyticsCustomModule_;
      }
    }
    /**
     * <pre>
     * Required. The SecurityHealthAnalytics custom module to update.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder> 
        getSecurityHealthAnalyticsCustomModuleFieldBuilder() {
      if (securityHealthAnalyticsCustomModuleBuilder_ == null) {
        securityHealthAnalyticsCustomModuleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder>(
                getSecurityHealthAnalyticsCustomModule(),
                getParentForChildren(),
                isClean());
        securityHealthAnalyticsCustomModule_ = null;
      }
      return securityHealthAnalyticsCustomModuleBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The list of fields to update.
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
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
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
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
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
     * <pre>
     * The list of fields to update.
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
     * <pre>
     * The list of fields to update.
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
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest)
  private static final com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest();
  }

  public static com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSecurityHealthAnalyticsCustomModuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSecurityHealthAnalyticsCustomModuleRequest>() {
    @java.lang.Override
    public UpdateSecurityHealthAnalyticsCustomModuleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSecurityHealthAnalyticsCustomModuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSecurityHealthAnalyticsCustomModuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

