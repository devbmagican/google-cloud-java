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
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [AuthorizeEnvironment][google.cloud.shell.v1.CloudShellService.AuthorizeEnvironment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.shell.v1.AuthorizeEnvironmentRequest}
 */
public final class AuthorizeEnvironmentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
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
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AuthorizeEnvironmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AuthorizeEnvironmentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              accessToken_ = s;
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (expireTime_ != null) {
                subBuilder = expireTime_.toBuilder();
              }
              expireTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(expireTime_);
                expireTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              idToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.class,
            com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Name of the resource that should receive the credentials, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the resource that should receive the credentials, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object accessToken_;
  /**
   *
   *
   * <pre>
   * The OAuth access token that should be sent to the environment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   *
   * @return The accessToken.
   */
  @java.lang.Override
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The OAuth access token that should be sent to the environment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   *
   * @return The bytes for accessToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object idToken_;
  /**
   *
   *
   * <pre>
   * The OAuth ID token that should be sent to the environment.
   * </pre>
   *
   * <code>string id_token = 4;</code>
   *
   * @return The idToken.
   */
  @java.lang.Override
  public java.lang.String getIdToken() {
    java.lang.Object ref = idToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The OAuth ID token that should be sent to the environment.
   * </pre>
   *
   * <code>string id_token = 4;</code>
   *
   * @return The bytes for idToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdTokenBytes() {
    java.lang.Object ref = idToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      idToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   *
   *
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   *
   * @return Whether the expireTime field is set.
   */
  @java.lang.Override
  public boolean hasExpireTime() {
    return expireTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   *
   * @return The expireTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   *
   *
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return getExpireTime();
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
    unknownFields.writeTo(output);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getExpireTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(idToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, idToken_);
    }
    size += unknownFields.getSerializedSize();
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
    com.google.cloud.shell.v1.AuthorizeEnvironmentRequest other =
        (com.google.cloud.shell.v1.AuthorizeEnvironmentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getAccessToken().equals(other.getAccessToken())) return false;
    if (!getIdToken().equals(other.getIdToken())) return false;
    if (hasExpireTime() != other.hasExpireTime()) return false;
    if (hasExpireTime()) {
      if (!getExpireTime().equals(other.getExpireTime())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
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
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parseFrom(
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
      com.google.cloud.shell.v1.AuthorizeEnvironmentRequest prototype) {
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
   * Request message for
   * [AuthorizeEnvironment][google.cloud.shell.v1.CloudShellService.AuthorizeEnvironment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.shell.v1.AuthorizeEnvironmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.shell.v1.AuthorizeEnvironmentRequest)
      com.google.cloud.shell.v1.AuthorizeEnvironmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.class,
              com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      accessToken_ = "";

      idToken_ = "";

      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_AuthorizeEnvironmentRequest_descriptor;
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
      com.google.cloud.shell.v1.AuthorizeEnvironmentRequest result =
          new com.google.cloud.shell.v1.AuthorizeEnvironmentRequest(this);
      result.name_ = name_;
      result.accessToken_ = accessToken_;
      result.idToken_ = idToken_;
      if (expireTimeBuilder_ == null) {
        result.expireTime_ = expireTime_;
      } else {
        result.expireTime_ = expireTimeBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.shell.v1.AuthorizeEnvironmentRequest) {
        return mergeFrom((com.google.cloud.shell.v1.AuthorizeEnvironmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.shell.v1.AuthorizeEnvironmentRequest other) {
      if (other == com.google.cloud.shell.v1.AuthorizeEnvironmentRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        onChanged();
      }
      if (!other.getIdToken().isEmpty()) {
        idToken_ = other.idToken_;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.shell.v1.AuthorizeEnvironmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.shell.v1.AuthorizeEnvironmentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should receive the credentials, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object accessToken_ = "";
    /**
     *
     *
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @return The accessToken.
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @return The bytes for accessToken.
     */
    public com.google.protobuf.ByteString getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @param value The accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      accessToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccessToken() {

      accessToken_ = getDefaultInstance().getAccessToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth access token that should be sent to the environment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @param value The bytes for accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      accessToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object idToken_ = "";
    /**
     *
     *
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     *
     * @return The idToken.
     */
    public java.lang.String getIdToken() {
      java.lang.Object ref = idToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     *
     * @return The bytes for idToken.
     */
    public com.google.protobuf.ByteString getIdTokenBytes() {
      java.lang.Object ref = idToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        idToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     *
     * @param value The idToken to set.
     * @return This builder for chaining.
     */
    public Builder setIdToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      idToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIdToken() {

      idToken_ = getDefaultInstance().getIdToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The OAuth ID token that should be sent to the environment.
     * </pre>
     *
     * <code>string id_token = 4;</code>
     *
     * @param value The bytes for idToken to set.
     * @return This builder for chaining.
     */
    public Builder setIdTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      idToken_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expireTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        expireTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     *
     * @return Whether the expireTime field is set.
     */
    public boolean hasExpireTime() {
      return expireTimeBuilder_ != null || expireTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     *
     * @return The expireTime.
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
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
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (expireTime_ != null) {
          expireTime_ =
              com.google.protobuf.Timestamp.newBuilder(expireTime_).mergeFrom(value).buildPartial();
        } else {
          expireTime_ = value;
        }
        onChanged();
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public Builder clearExpireTime() {
      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
        onChanged();
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {

      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
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
        return expireTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : expireTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the credentials expire. If not set, defaults to one hour from
     * when the server received the request.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(), getParentForChildren(), isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
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

  private static final com.google.protobuf.Parser<AuthorizeEnvironmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<AuthorizeEnvironmentRequest>() {
        @java.lang.Override
        public AuthorizeEnvironmentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AuthorizeEnvironmentRequest(input, extensionRegistry);
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
