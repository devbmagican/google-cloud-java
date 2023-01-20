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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * A request to update an `AccessLevel`.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest}
 */
public final class UpdateAccessLevelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest)
    UpdateAccessLevelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateAccessLevelRequest.newBuilder() to construct.
  private UpdateAccessLevelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateAccessLevelRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateAccessLevelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessLevelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessLevelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest.class,
            com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest.Builder.class);
  }

  public static final int ACCESS_LEVEL_FIELD_NUMBER = 1;
  private com.google.identity.accesscontextmanager.v1.AccessLevel accessLevel_;
  /**
   *
   *
   * <pre>
   * Required. The updated [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
   * correctness of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the accessLevel field is set.
   */
  @java.lang.Override
  public boolean hasAccessLevel() {
    return accessLevel_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
   * correctness of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The accessLevel.
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevel() {
    return accessLevel_ == null
        ? com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance()
        : accessLevel_;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
   * correctness of the [Access Level]
   * [google.identity.accesscontextmanager.v1.AccessLevel] is a
   * precondition for creation.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder
      getAccessLevelOrBuilder() {
    return accessLevel_ == null
        ? com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance()
        : accessLevel_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask to control which fields get updated. Must be non-empty.
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
   * Required. Mask to control which fields get updated. Must be non-empty.
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
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
    if (accessLevel_ != null) {
      output.writeMessage(1, getAccessLevel());
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
    if (accessLevel_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAccessLevel());
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest other =
        (com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest) obj;

    if (hasAccessLevel() != other.hasAccessLevel()) return false;
    if (hasAccessLevel()) {
      if (!getAccessLevel().equals(other.getAccessLevel())) return false;
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
    if (hasAccessLevel()) {
      hash = (37 * hash) + ACCESS_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getAccessLevel().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest parseFrom(
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
      com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest prototype) {
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
   * A request to update an `AccessLevel`.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest)
      com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessLevelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessLevelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest.class,
              com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest.Builder.class);
    }

    // Construct using
    // com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accessLevel_ = null;
      if (accessLevelBuilder_ != null) {
        accessLevelBuilder_.dispose();
        accessLevelBuilder_ = null;
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
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessLevelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
        getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest build() {
      com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest buildPartial() {
      com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest result =
          new com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessLevel_ =
            accessLevelBuilder_ == null ? accessLevel_ : accessLevelBuilder_.build();
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
      if (other instanceof com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest) {
        return mergeFrom(
            (com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest other) {
      if (other
          == com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
              .getDefaultInstance()) return this;
      if (other.hasAccessLevel()) {
        mergeAccessLevel(other.getAccessLevel());
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
                input.readMessage(getAccessLevelFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.identity.accesscontextmanager.v1.AccessLevel accessLevel_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessLevel,
            com.google.identity.accesscontextmanager.v1.AccessLevel.Builder,
            com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>
        accessLevelBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the accessLevel field is set.
     */
    public boolean hasAccessLevel() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The accessLevel.
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel getAccessLevel() {
      if (accessLevelBuilder_ == null) {
        return accessLevel_ == null
            ? com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance()
            : accessLevel_;
      } else {
        return accessLevelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAccessLevel(com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessLevel_ = value;
      } else {
        accessLevelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAccessLevel(
        com.google.identity.accesscontextmanager.v1.AccessLevel.Builder builderForValue) {
      if (accessLevelBuilder_ == null) {
        accessLevel_ = builderForValue.build();
      } else {
        accessLevelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAccessLevel(com.google.identity.accesscontextmanager.v1.AccessLevel value) {
      if (accessLevelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && accessLevel_ != null
            && accessLevel_
                != com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance()) {
          getAccessLevelBuilder().mergeFrom(value);
        } else {
          accessLevel_ = value;
        }
      } else {
        accessLevelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAccessLevel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accessLevel_ = null;
      if (accessLevelBuilder_ != null) {
        accessLevelBuilder_.dispose();
        accessLevelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevel.Builder getAccessLevelBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAccessLevelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder
        getAccessLevelOrBuilder() {
      if (accessLevelBuilder_ != null) {
        return accessLevelBuilder_.getMessageOrBuilder();
      } else {
        return accessLevel_ == null
            ? com.google.identity.accesscontextmanager.v1.AccessLevel.getDefaultInstance()
            : accessLevel_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel]. Syntactic
     * correctness of the [Access Level]
     * [google.identity.accesscontextmanager.v1.AccessLevel] is a
     * precondition for creation.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessLevel access_level = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessLevel,
            com.google.identity.accesscontextmanager.v1.AccessLevel.Builder,
            com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>
        getAccessLevelFieldBuilder() {
      if (accessLevelBuilder_ == null) {
        accessLevelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.identity.accesscontextmanager.v1.AccessLevel,
                com.google.identity.accesscontextmanager.v1.AccessLevel.Builder,
                com.google.identity.accesscontextmanager.v1.AccessLevelOrBuilder>(
                getAccessLevel(), getParentForChildren(), isClean());
        accessLevel_ = null;
      }
      return accessLevelBuilder_;
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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
     * Required. Mask to control which fields get updated. Must be non-empty.
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest)
  private static final com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest();
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAccessLevelRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateAccessLevelRequest>() {
        @java.lang.Override
        public UpdateAccessLevelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAccessLevelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAccessLevelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.UpdateAccessLevelRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
