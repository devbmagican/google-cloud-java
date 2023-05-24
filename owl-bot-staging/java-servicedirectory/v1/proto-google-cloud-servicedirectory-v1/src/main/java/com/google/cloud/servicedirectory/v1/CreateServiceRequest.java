// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1/registration_service.proto

package com.google.cloud.servicedirectory.v1;

/**
 * <pre>
 * The request message for
 * [RegistrationService.CreateService][google.cloud.servicedirectory.v1.RegistrationService.CreateService].
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1.CreateServiceRequest}
 */
public final class CreateServiceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1.CreateServiceRequest)
    CreateServiceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateServiceRequest.newBuilder() to construct.
  private CreateServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateServiceRequest() {
    parent_ = "";
    serviceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateServiceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1.CreateServiceRequest.class, com.google.cloud.servicedirectory.v1.CreateServiceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the namespace this service will belong to.
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
   * Required. The resource name of the namespace this service will belong to.
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

  public static final int SERVICE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceId_ = "";
  /**
   * <pre>
   * Required. The Resource ID must be 1-63 characters long, and comply with
   * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   * Specifically, the name must be 1-63 characters long and match the regular
   * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which
   * cannot be a dash.
   * </pre>
   *
   * <code>string service_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The serviceId.
   */
  @java.lang.Override
  public java.lang.String getServiceId() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The Resource ID must be 1-63 characters long, and comply with
   * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
   * Specifically, the name must be 1-63 characters long and match the regular
   * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which
   * cannot be a dash.
   * </pre>
   *
   * <code>string service_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for serviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceIdBytes() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_FIELD_NUMBER = 3;
  private com.google.cloud.servicedirectory.v1.Service service_;
  /**
   * <pre>
   * Required. A service  with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the service field is set.
   */
  @java.lang.Override
  public boolean hasService() {
    return service_ != null;
  }
  /**
   * <pre>
   * Required. A service  with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The service.
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.Service getService() {
    return service_ == null ? com.google.cloud.servicedirectory.v1.Service.getDefaultInstance() : service_;
  }
  /**
   * <pre>
   * Required. A service  with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.ServiceOrBuilder getServiceOrBuilder() {
    return service_ == null ? com.google.cloud.servicedirectory.v1.Service.getDefaultInstance() : service_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceId_);
    }
    if (service_ != null) {
      output.writeMessage(3, getService());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceId_);
    }
    if (service_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getService());
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
    if (!(obj instanceof com.google.cloud.servicedirectory.v1.CreateServiceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1.CreateServiceRequest other = (com.google.cloud.servicedirectory.v1.CreateServiceRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getServiceId()
        .equals(other.getServiceId())) return false;
    if (hasService() != other.hasService()) return false;
    if (hasService()) {
      if (!getService()
          .equals(other.getService())) return false;
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
    hash = (37 * hash) + SERVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceId().hashCode();
    if (hasService()) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.servicedirectory.v1.CreateServiceRequest prototype) {
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
   * The request message for
   * [RegistrationService.CreateService][google.cloud.servicedirectory.v1.RegistrationService.CreateService].
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1.CreateServiceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1.CreateServiceRequest)
      com.google.cloud.servicedirectory.v1.CreateServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1.CreateServiceRequest.class, com.google.cloud.servicedirectory.v1.CreateServiceRequest.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1.CreateServiceRequest.newBuilder()
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
      serviceId_ = "";
      service_ = null;
      if (serviceBuilder_ != null) {
        serviceBuilder_.dispose();
        serviceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1_CreateServiceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.CreateServiceRequest getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1.CreateServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.CreateServiceRequest build() {
      com.google.cloud.servicedirectory.v1.CreateServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1.CreateServiceRequest buildPartial() {
      com.google.cloud.servicedirectory.v1.CreateServiceRequest result = new com.google.cloud.servicedirectory.v1.CreateServiceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.servicedirectory.v1.CreateServiceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serviceId_ = serviceId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.service_ = serviceBuilder_ == null
            ? service_
            : serviceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.servicedirectory.v1.CreateServiceRequest) {
        return mergeFrom((com.google.cloud.servicedirectory.v1.CreateServiceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.servicedirectory.v1.CreateServiceRequest other) {
      if (other == com.google.cloud.servicedirectory.v1.CreateServiceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getServiceId().isEmpty()) {
        serviceId_ = other.serviceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasService()) {
        mergeService(other.getService());
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
              serviceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getServiceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * Required. The resource name of the namespace this service will belong to.
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
     * Required. The resource name of the namespace this service will belong to.
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
     * Required. The resource name of the namespace this service will belong to.
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
     * Required. The resource name of the namespace this service will belong to.
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
     * Required. The resource name of the namespace this service will belong to.
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

    private java.lang.Object serviceId_ = "";
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string service_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The serviceId.
     */
    public java.lang.String getServiceId() {
      java.lang.Object ref = serviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string service_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for serviceId.
     */
    public com.google.protobuf.ByteString
        getServiceIdBytes() {
      java.lang.Object ref = serviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string service_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string service_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceId() {
      serviceId_ = getDefaultInstance().getServiceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Resource ID must be 1-63 characters long, and comply with
     * &lt;a href="https://www.ietf.org/rfc/rfc1035.txt" target="_blank"&gt;RFC1035&lt;/a&gt;.
     * Specifically, the name must be 1-63 characters long and match the regular
     * expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit, except the last character, which
     * cannot be a dash.
     * </pre>
     *
     * <code>string service_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.servicedirectory.v1.Service service_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.servicedirectory.v1.Service, com.google.cloud.servicedirectory.v1.Service.Builder, com.google.cloud.servicedirectory.v1.ServiceOrBuilder> serviceBuilder_;
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the service field is set.
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The service.
     */
    public com.google.cloud.servicedirectory.v1.Service getService() {
      if (serviceBuilder_ == null) {
        return service_ == null ? com.google.cloud.servicedirectory.v1.Service.getDefaultInstance() : service_;
      } else {
        return serviceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setService(com.google.cloud.servicedirectory.v1.Service value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        service_ = value;
      } else {
        serviceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setService(
        com.google.cloud.servicedirectory.v1.Service.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        service_ = builderForValue.build();
      } else {
        serviceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeService(com.google.cloud.servicedirectory.v1.Service value) {
      if (serviceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          service_ != null &&
          service_ != com.google.cloud.servicedirectory.v1.Service.getDefaultInstance()) {
          getServiceBuilder().mergeFrom(value);
        } else {
          service_ = value;
        }
      } else {
        serviceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearService() {
      bitField0_ = (bitField0_ & ~0x00000004);
      service_ = null;
      if (serviceBuilder_ != null) {
        serviceBuilder_.dispose();
        serviceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.servicedirectory.v1.Service.Builder getServiceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getServiceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.servicedirectory.v1.ServiceOrBuilder getServiceOrBuilder() {
      if (serviceBuilder_ != null) {
        return serviceBuilder_.getMessageOrBuilder();
      } else {
        return service_ == null ?
            com.google.cloud.servicedirectory.v1.Service.getDefaultInstance() : service_;
      }
    }
    /**
     * <pre>
     * Required. A service  with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1.Service service = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.servicedirectory.v1.Service, com.google.cloud.servicedirectory.v1.Service.Builder, com.google.cloud.servicedirectory.v1.ServiceOrBuilder> 
        getServiceFieldBuilder() {
      if (serviceBuilder_ == null) {
        serviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.servicedirectory.v1.Service, com.google.cloud.servicedirectory.v1.Service.Builder, com.google.cloud.servicedirectory.v1.ServiceOrBuilder>(
                getService(),
                getParentForChildren(),
                isClean());
        service_ = null;
      }
      return serviceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1.CreateServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1.CreateServiceRequest)
  private static final com.google.cloud.servicedirectory.v1.CreateServiceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1.CreateServiceRequest();
  }

  public static com.google.cloud.servicedirectory.v1.CreateServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateServiceRequest>() {
    @java.lang.Override
    public CreateServiceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1.CreateServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

