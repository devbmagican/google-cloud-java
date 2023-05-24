// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

/**
 * <pre>
 * Request message for
 * [AuthorizeEnvironment][google.cloud.shell.v1.CloudShellService.AuthorizeEnvironment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.shell.v1.AuthorizeEnvironmentRequest}
 */
public final class AuthorizeEnvironmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.shell.v1.AuthorizeEnvironmentRequest)
    AuthorizeEnvironmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthorizeEnvironmentRequest.newBuilder() to construct.
  private AuthorizeEnvironmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthorizeEnvironmentRequest() {
    name_ = "";
    accessToken_ = "";
    idToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthorizeEnvironmentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.class, com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Name of the resource that should receive the credentials, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the resource that should receive the credentials, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accessToken_ = "";
  /**
   * <pre>
   * The OAuth access token that should be sent to the environment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   * @return The accessToken.
   */
  @java.lang.Override
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The OAuth access token that should be sent to the environment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   * @return The bytes for accessToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_TOKEN_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object idToken_ = "";
  /**
   * <pre>
   * The OAuth ID token that should be sent to the environment.
   * </pre>
   *
   * <code>string id_token = 4;</code>
   * @return The idToken.
   */
  @java.lang.Override
  public java.lang.String getIdToken() {
    java.lang.Object ref = idToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The OAuth ID token that should be sent to the environment.
   * </pre>
   *
   * <code>string id_token = 4;</code>
   * @return The bytes for idToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdTokenBytes() {
    java.lang.Object ref = idToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   * @return Whether the expireTime field is set.
   */
  @java.lang.Override
  public boolean hasExpireTime() {
    return expireTime_ != null;
  }
  /**
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   * @return The expireTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accessToken_);
    }
    if (expireTime_ != null) {
      output.writeMessage(3, getExpireTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(idToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, idToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accessToken_);
    }
    if (expireTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExpireTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(idToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, idToken_);
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
    if (!(obj instanceof com.google.cloud.shell.v1.AuthorizeEnvironmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.shell.v1.AuthorizeEnvironmentRequest other = (com.google.cloud.shell.v1.AuthorizeEnvironmentRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getAccessToken()
        .equals(other.getAccessToken())) return false;
    if (!getIdToken()
        .equals(other.getIdToken())) return false;
    if (hasExpireTime() != other.hasExpireTime()) return false;
    if (hasExpireTime()) {
      if (!getExpireTime()
          .equals(other.getExpireTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    hash = (37 * hash) + ID_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getIdToken().hashCode();
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.shell.v1.AuthorizeEnvironmentRequest prototype) {
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
   * Request message for
   * [AuthorizeEnvironment][google.cloud.shell.v1.CloudShellService.AuthorizeEnvironment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.shell.v1.AuthorizeEnvironmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.shell.v1.AuthorizeEnvironmentRequest)
      com.google.cloud.shell.v1.AuthorizeEnvironmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.class, com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.newBuilder()
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
      name_ = "";
      accessToken_ = "";
      idToken_ = "";
      expireTime_ = null;
      if (expireTimeBuilder_ != null) {
        expireTimeBuilder_.dispose();
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.AuthorizeEnvironmentRequest getDefaultInstanceForType() {
      return com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.AuthorizeEnvironmentRequest build() {
      com.google.cloud.shell.v1.AuthorizeEnvironmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.AuthorizeEnvironmentRequest buildPartial() {
      com.google.cloud.shell.v1.AuthorizeEnvironmentRequest result = new com.google.cloud.shell.v1.AuthorizeEnvironmentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.shell.v1.AuthorizeEnvironmentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accessToken_ = accessToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.idToken_ = idToken_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.expireTime_ = expireTimeBuilder_ == null
            ? expireTime_
            : expireTimeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.shell.v1.AuthorizeEnvironmentRequest) {
        return mergeFrom((com.google.cloud.shell.v1.AuthorizeEnvironmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.shell.v1.AuthorizeEnvironmentRequest other) {
      if (other == com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getIdToken().isEmpty()) {
        idToken_ = other.idToken_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              accessToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getExpireTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 26
            case 34: {
              idToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object accessToken_ = "";
    /**
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     * @return The accessToken.
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     * @return The bytes for accessToken.
     */
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     * @param value The accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accessToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessToken() {
      accessToken_ = getDefaultInstance().getAccessToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     * @param value The bytes for accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accessToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object idToken_ = "";
    /**
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     * @return The idToken.
     */
    public java.lang.String getIdToken() {
      java.lang.Object ref = idToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     * @return The bytes for idToken.
     */
    public com.google.protobuf.ByteString
        getIdTokenBytes() {
      java.lang.Object ref = idToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     * @param value The idToken to set.
     * @return This builder for chaining.
     */
    public Builder setIdToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      idToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdToken() {
      idToken_ = getDefaultInstance().getIdToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     * @param value The bytes for idToken to set.
     * @return This builder for chaining.
     */
    public Builder setIdTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      idToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expireTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expireTimeBuilder_;
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     * @return Whether the expireTime field is set.
     */
    public boolean hasExpireTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     * @return The expireTime.
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expireTime_ = value;
      } else {
        expireTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder setExpireTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          expireTime_ != null &&
          expireTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getExpireTimeBuilder().mergeFrom(value);
        } else {
          expireTime_ = value;
        }
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder clearExpireTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      expireTime_ = null;
      if (expireTimeBuilder_ != null) {
        expireTimeBuilder_.dispose();
        expireTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      if (expireTimeBuilder_ != null) {
        return expireTimeBuilder_.getMessageOrBuilder();
      } else {
        return expireTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      }
    }
    /**
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(),
                getParentForChildren(),
                isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.shell.v1.AuthorizeEnvironmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.shell.v1.AuthorizeEnvironmentRequest)
  private static final com.google.cloud.shell.v1.AuthorizeEnvironmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.shell.v1.AuthorizeEnvironmentRequest();
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthorizeEnvironmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthorizeEnvironmentRequest>() {
    @java.lang.Override
    public AuthorizeEnvironmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthorizeEnvironmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthorizeEnvironmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.shell.v1.AuthorizeEnvironmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

