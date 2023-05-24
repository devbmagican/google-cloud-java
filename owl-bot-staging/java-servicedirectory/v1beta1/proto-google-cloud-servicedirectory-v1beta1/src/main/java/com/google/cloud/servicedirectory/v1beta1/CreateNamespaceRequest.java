// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/registration_service.proto

package com.google.cloud.servicedirectory.v1beta1;

/**
 * <pre>
 * The request message for [RegistrationService.CreateNamespace][google.cloud.servicedirectory.v1beta1.RegistrationService.CreateNamespace].
 * </pre>
 *
 * Protobuf type {@code google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest}
 */
public final class CreateNamespaceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest)
    CreateNamespaceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNamespaceRequest.newBuilder() to construct.
  private CreateNamespaceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNamespaceRequest() {
    parent_ = "";
    namespaceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNamespaceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1beta1_CreateNamespaceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1beta1_CreateNamespaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest.class, com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The resource name of the project and location the namespace
   * will be created in.
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
   * Required. The resource name of the project and location the namespace
   * will be created in.
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

  public static final int NAMESPACE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object namespaceId_ = "";
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
   * <code>string namespace_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The namespaceId.
   */
  @java.lang.Override
  public java.lang.String getNamespaceId() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespaceId_ = s;
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
   * <code>string namespace_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for namespaceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceIdBytes() {
    java.lang.Object ref = namespaceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespaceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMESPACE_FIELD_NUMBER = 3;
  private com.google.cloud.servicedirectory.v1beta1.Namespace namespace_;
  /**
   * <pre>
   * Required. A namespace with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the namespace field is set.
   */
  @java.lang.Override
  public boolean hasNamespace() {
    return namespace_ != null;
  }
  /**
   * <pre>
   * Required. A namespace with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The namespace.
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.Namespace getNamespace() {
    return namespace_ == null ? com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance() : namespace_;
  }
  /**
   * <pre>
   * Required. A namespace with initial fields set.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder getNamespaceOrBuilder() {
    return namespace_ == null ? com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance() : namespace_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespaceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, namespaceId_);
    }
    if (namespace_ != null) {
      output.writeMessage(3, getNamespace());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespaceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, namespaceId_);
    }
    if (namespace_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getNamespace());
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
    if (!(obj instanceof com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest other = (com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getNamespaceId()
        .equals(other.getNamespaceId())) return false;
    if (hasNamespace() != other.hasNamespace()) return false;
    if (hasNamespace()) {
      if (!getNamespace()
          .equals(other.getNamespace())) return false;
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
    hash = (37 * hash) + NAMESPACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNamespaceId().hashCode();
    if (hasNamespace()) {
      hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
      hash = (53 * hash) + getNamespace().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest prototype) {
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
   * The request message for [RegistrationService.CreateNamespace][google.cloud.servicedirectory.v1beta1.RegistrationService.CreateNamespace].
   * </pre>
   *
   * Protobuf type {@code google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest)
      com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1beta1_CreateNamespaceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1beta1_CreateNamespaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest.class, com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest.Builder.class);
    }

    // Construct using com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest.newBuilder()
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
      namespaceId_ = "";
      namespace_ = null;
      if (namespaceBuilder_ != null) {
        namespaceBuilder_.dispose();
        namespaceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.servicedirectory.v1beta1.RegistrationServiceProto.internal_static_google_cloud_servicedirectory_v1beta1_CreateNamespaceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest getDefaultInstanceForType() {
      return com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest build() {
      com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest buildPartial() {
      com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest result = new com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.namespaceId_ = namespaceId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.namespace_ = namespaceBuilder_ == null
            ? namespace_
            : namespaceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest) {
        return mergeFrom((com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest other) {
      if (other == com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNamespaceId().isEmpty()) {
        namespaceId_ = other.namespaceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasNamespace()) {
        mergeNamespace(other.getNamespace());
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
              namespaceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getNamespaceFieldBuilder().getBuilder(),
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
     * Required. The resource name of the project and location the namespace
     * will be created in.
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
     * Required. The resource name of the project and location the namespace
     * will be created in.
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
     * Required. The resource name of the project and location the namespace
     * will be created in.
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
     * Required. The resource name of the project and location the namespace
     * will be created in.
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
     * Required. The resource name of the project and location the namespace
     * will be created in.
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

    private java.lang.Object namespaceId_ = "";
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
     * <code>string namespace_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The namespaceId.
     */
    public java.lang.String getNamespaceId() {
      java.lang.Object ref = namespaceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespaceId_ = s;
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
     * <code>string namespace_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for namespaceId.
     */
    public com.google.protobuf.ByteString
        getNamespaceIdBytes() {
      java.lang.Object ref = namespaceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespaceId_ = b;
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
     * <code>string namespace_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The namespaceId to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      namespaceId_ = value;
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
     * <code>string namespace_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespaceId() {
      namespaceId_ = getDefaultInstance().getNamespaceId();
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
     * <code>string namespace_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for namespaceId to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      namespaceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.servicedirectory.v1beta1.Namespace namespace_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.servicedirectory.v1beta1.Namespace, com.google.cloud.servicedirectory.v1beta1.Namespace.Builder, com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder> namespaceBuilder_;
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the namespace field is set.
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The namespace.
     */
    public com.google.cloud.servicedirectory.v1beta1.Namespace getNamespace() {
      if (namespaceBuilder_ == null) {
        return namespace_ == null ? com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance() : namespace_;
      } else {
        return namespaceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNamespace(com.google.cloud.servicedirectory.v1beta1.Namespace value) {
      if (namespaceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        namespace_ = value;
      } else {
        namespaceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNamespace(
        com.google.cloud.servicedirectory.v1beta1.Namespace.Builder builderForValue) {
      if (namespaceBuilder_ == null) {
        namespace_ = builderForValue.build();
      } else {
        namespaceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNamespace(com.google.cloud.servicedirectory.v1beta1.Namespace value) {
      if (namespaceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          namespace_ != null &&
          namespace_ != com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance()) {
          getNamespaceBuilder().mergeFrom(value);
        } else {
          namespace_ = value;
        }
      } else {
        namespaceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNamespace() {
      bitField0_ = (bitField0_ & ~0x00000004);
      namespace_ = null;
      if (namespaceBuilder_ != null) {
        namespaceBuilder_.dispose();
        namespaceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.servicedirectory.v1beta1.Namespace.Builder getNamespaceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getNamespaceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder getNamespaceOrBuilder() {
      if (namespaceBuilder_ != null) {
        return namespaceBuilder_.getMessageOrBuilder();
      } else {
        return namespace_ == null ?
            com.google.cloud.servicedirectory.v1beta1.Namespace.getDefaultInstance() : namespace_;
      }
    }
    /**
     * <pre>
     * Required. A namespace with initial fields set.
     * </pre>
     *
     * <code>.google.cloud.servicedirectory.v1beta1.Namespace namespace = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.servicedirectory.v1beta1.Namespace, com.google.cloud.servicedirectory.v1beta1.Namespace.Builder, com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder> 
        getNamespaceFieldBuilder() {
      if (namespaceBuilder_ == null) {
        namespaceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.servicedirectory.v1beta1.Namespace, com.google.cloud.servicedirectory.v1beta1.Namespace.Builder, com.google.cloud.servicedirectory.v1beta1.NamespaceOrBuilder>(
                getNamespace(),
                getParentForChildren(),
                isClean());
        namespace_ = null;
      }
      return namespaceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest)
  private static final com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest();
  }

  public static com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNamespaceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNamespaceRequest>() {
    @java.lang.Override
    public CreateNamespaceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateNamespaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNamespaceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.servicedirectory.v1beta1.CreateNamespaceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

