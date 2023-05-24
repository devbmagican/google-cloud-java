// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 * <pre>
 * Request message for creating Security Health Analytics custom modules.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest}
 */
public final class CreateSecurityHealthAnalyticsCustomModuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest)
    CreateSecurityHealthAnalyticsCustomModuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSecurityHealthAnalyticsCustomModuleRequest.newBuilder() to construct.
  private CreateSecurityHealthAnalyticsCustomModuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSecurityHealthAnalyticsCustomModuleRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSecurityHealthAnalyticsCustomModuleRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_CreateSecurityHealthAnalyticsCustomModuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_CreateSecurityHealthAnalyticsCustomModuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest.class, com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Resource name of the new custom module's parent. Its format is
   * "organizations/{organization}/securityHealthAnalyticsSettings",
   * "folders/{folder}/securityHealthAnalyticsSettings", or
   * "projects/{project}/securityHealthAnalyticsSettings"
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Resource name of the new custom module's parent. Its format is
   * "organizations/{organization}/securityHealthAnalyticsSettings",
   * "folders/{folder}/securityHealthAnalyticsSettings", or
   * "projects/{project}/securityHealthAnalyticsSettings"
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE_FIELD_NUMBER = 2;
  private com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule_;
  /**
   * <pre>
   * Required. SecurityHealthAnalytics custom module to create. The provided
   * name is ignored and reset with provided parent information and
   * server-generated ID.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the securityHealthAnalyticsCustomModule field is set.
   */
  @java.lang.Override
  public boolean hasSecurityHealthAnalyticsCustomModule() {
    return securityHealthAnalyticsCustomModule_ != null;
  }
  /**
   * <pre>
   * Required. SecurityHealthAnalytics custom module to create. The provided
   * name is ignored and reset with provided parent information and
   * server-generated ID.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityHealthAnalyticsCustomModule.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule getSecurityHealthAnalyticsCustomModule() {
    return securityHealthAnalyticsCustomModule_ == null ? com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance() : securityHealthAnalyticsCustomModule_;
  }
  /**
   * <pre>
   * Required. SecurityHealthAnalytics custom module to create. The provided
   * name is ignored and reset with provided parent information and
   * server-generated ID.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder getSecurityHealthAnalyticsCustomModuleOrBuilder() {
    return securityHealthAnalyticsCustomModule_ == null ? com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance() : securityHealthAnalyticsCustomModule_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (securityHealthAnalyticsCustomModule_ != null) {
      output.writeMessage(2, getSecurityHealthAnalyticsCustomModule());
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
    if (securityHealthAnalyticsCustomModule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSecurityHealthAnalyticsCustomModule());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest other = (com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasSecurityHealthAnalyticsCustomModule() != other.hasSecurityHealthAnalyticsCustomModule()) return false;
    if (hasSecurityHealthAnalyticsCustomModule()) {
      if (!getSecurityHealthAnalyticsCustomModule()
          .equals(other.getSecurityHealthAnalyticsCustomModule())) return false;
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
    if (hasSecurityHealthAnalyticsCustomModule()) {
      hash = (37 * hash) + SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getSecurityHealthAnalyticsCustomModule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest prototype) {
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
   * Request message for creating Security Health Analytics custom modules.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest)
      com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_CreateSecurityHealthAnalyticsCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_CreateSecurityHealthAnalyticsCustomModuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest.class, com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest.newBuilder()
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
      parent_ = "";
      securityHealthAnalyticsCustomModule_ = null;
      if (securityHealthAnalyticsCustomModuleBuilder_ != null) {
        securityHealthAnalyticsCustomModuleBuilder_.dispose();
        securityHealthAnalyticsCustomModuleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService.internal_static_google_cloud_securitycenter_v1_CreateSecurityHealthAnalyticsCustomModuleRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest build() {
      com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest buildPartial() {
      com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest result = new com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.securityHealthAnalyticsCustomModule_ = securityHealthAnalyticsCustomModuleBuilder_ == null
            ? securityHealthAnalyticsCustomModule_
            : securityHealthAnalyticsCustomModuleBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest other) {
      if (other == com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSecurityHealthAnalyticsCustomModule()) {
        mergeSecurityHealthAnalyticsCustomModule(other.getSecurityHealthAnalyticsCustomModule());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSecurityHealthAnalyticsCustomModuleFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Resource name of the new custom module's parent. Its format is
     * "organizations/{organization}/securityHealthAnalyticsSettings",
     * "folders/{folder}/securityHealthAnalyticsSettings", or
     * "projects/{project}/securityHealthAnalyticsSettings"
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the new custom module's parent. Its format is
     * "organizations/{organization}/securityHealthAnalyticsSettings",
     * "folders/{folder}/securityHealthAnalyticsSettings", or
     * "projects/{project}/securityHealthAnalyticsSettings"
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the new custom module's parent. Its format is
     * "organizations/{organization}/securityHealthAnalyticsSettings",
     * "folders/{folder}/securityHealthAnalyticsSettings", or
     * "projects/{project}/securityHealthAnalyticsSettings"
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the new custom module's parent. Its format is
     * "organizations/{organization}/securityHealthAnalyticsSettings",
     * "folders/{folder}/securityHealthAnalyticsSettings", or
     * "projects/{project}/securityHealthAnalyticsSettings"
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the new custom module's parent. Its format is
     * "organizations/{organization}/securityHealthAnalyticsSettings",
     * "folders/{folder}/securityHealthAnalyticsSettings", or
     * "projects/{project}/securityHealthAnalyticsSettings"
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule securityHealthAnalyticsCustomModule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder, com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder> securityHealthAnalyticsCustomModuleBuilder_;
    /**
     * <pre>
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the securityHealthAnalyticsCustomModule field is set.
     */
    public boolean hasSecurityHealthAnalyticsCustomModule() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSecurityHealthAnalyticsCustomModule(
        com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder builderForValue) {
      if (securityHealthAnalyticsCustomModuleBuilder_ == null) {
        securityHealthAnalyticsCustomModule_ = builderForValue.build();
      } else {
        securityHealthAnalyticsCustomModuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSecurityHealthAnalyticsCustomModule(com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule value) {
      if (securityHealthAnalyticsCustomModuleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          securityHealthAnalyticsCustomModule_ != null &&
          securityHealthAnalyticsCustomModule_ != com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.getDefaultInstance()) {
          getSecurityHealthAnalyticsCustomModuleBuilder().mergeFrom(value);
        } else {
          securityHealthAnalyticsCustomModule_ = value;
        }
      } else {
        securityHealthAnalyticsCustomModuleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSecurityHealthAnalyticsCustomModule() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule.Builder getSecurityHealthAnalyticsCustomModuleBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSecurityHealthAnalyticsCustomModuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. SecurityHealthAnalytics custom module to create. The provided
     * name is ignored and reset with provided parent information and
     * server-generated ID.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest)
  private static final com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest();
  }

  public static com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSecurityHealthAnalyticsCustomModuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSecurityHealthAnalyticsCustomModuleRequest>() {
    @java.lang.Override
    public CreateSecurityHealthAnalyticsCustomModuleRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSecurityHealthAnalyticsCustomModuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSecurityHealthAnalyticsCustomModuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

