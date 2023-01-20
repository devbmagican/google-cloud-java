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
// source: google/api/apikeys/v2/resources.proto

package com.google.api.apikeys.v2;

/**
 *
 *
 * <pre>
 * The IP addresses of callers that are allowed to use the key.
 * </pre>
 *
 * Protobuf type {@code google.api.apikeys.v2.ServerKeyRestrictions}
 */
public final class ServerKeyRestrictions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.apikeys.v2.ServerKeyRestrictions)
    ServerKeyRestrictionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ServerKeyRestrictions.newBuilder() to construct.
  private ServerKeyRestrictions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ServerKeyRestrictions() {
    allowedIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ServerKeyRestrictions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_ServerKeyRestrictions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_ServerKeyRestrictions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.apikeys.v2.ServerKeyRestrictions.class,
            com.google.api.apikeys.v2.ServerKeyRestrictions.Builder.class);
  }

  public static final int ALLOWED_IPS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList allowedIps_;
  /**
   *
   *
   * <pre>
   * A list of the caller IP addresses that are allowed to make API calls
   * with this key.
   * </pre>
   *
   * <code>repeated string allowed_ips = 1;</code>
   *
   * @return A list containing the allowedIps.
   */
  public com.google.protobuf.ProtocolStringList getAllowedIpsList() {
    return allowedIps_;
  }
  /**
   *
   *
   * <pre>
   * A list of the caller IP addresses that are allowed to make API calls
   * with this key.
   * </pre>
   *
   * <code>repeated string allowed_ips = 1;</code>
   *
   * @return The count of allowedIps.
   */
  public int getAllowedIpsCount() {
    return allowedIps_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of the caller IP addresses that are allowed to make API calls
   * with this key.
   * </pre>
   *
   * <code>repeated string allowed_ips = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The allowedIps at the given index.
   */
  public java.lang.String getAllowedIps(int index) {
    return allowedIps_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of the caller IP addresses that are allowed to make API calls
   * with this key.
   * </pre>
   *
   * <code>repeated string allowed_ips = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedIps at the given index.
   */
  public com.google.protobuf.ByteString getAllowedIpsBytes(int index) {
    return allowedIps_.getByteString(index);
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
    for (int i = 0; i < allowedIps_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowedIps_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedIps_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowedIps_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedIpsList().size();
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
    if (!(obj instanceof com.google.api.apikeys.v2.ServerKeyRestrictions)) {
      return super.equals(obj);
    }
    com.google.api.apikeys.v2.ServerKeyRestrictions other =
        (com.google.api.apikeys.v2.ServerKeyRestrictions) obj;

    if (!getAllowedIpsList().equals(other.getAllowedIpsList())) return false;
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
    if (getAllowedIpsCount() > 0) {
      hash = (37 * hash) + ALLOWED_IPS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedIpsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions parseFrom(
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

  public static Builder newBuilder(com.google.api.apikeys.v2.ServerKeyRestrictions prototype) {
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
   * The IP addresses of callers that are allowed to use the key.
   * </pre>
   *
   * Protobuf type {@code google.api.apikeys.v2.ServerKeyRestrictions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.apikeys.v2.ServerKeyRestrictions)
      com.google.api.apikeys.v2.ServerKeyRestrictionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_ServerKeyRestrictions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_ServerKeyRestrictions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.apikeys.v2.ServerKeyRestrictions.class,
              com.google.api.apikeys.v2.ServerKeyRestrictions.Builder.class);
    }

    // Construct using com.google.api.apikeys.v2.ServerKeyRestrictions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      allowedIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_ServerKeyRestrictions_descriptor;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.ServerKeyRestrictions getDefaultInstanceForType() {
      return com.google.api.apikeys.v2.ServerKeyRestrictions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.ServerKeyRestrictions build() {
      com.google.api.apikeys.v2.ServerKeyRestrictions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.ServerKeyRestrictions buildPartial() {
      com.google.api.apikeys.v2.ServerKeyRestrictions result =
          new com.google.api.apikeys.v2.ServerKeyRestrictions(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.api.apikeys.v2.ServerKeyRestrictions result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        allowedIps_ = allowedIps_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.allowedIps_ = allowedIps_;
    }

    private void buildPartial0(com.google.api.apikeys.v2.ServerKeyRestrictions result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.api.apikeys.v2.ServerKeyRestrictions) {
        return mergeFrom((com.google.api.apikeys.v2.ServerKeyRestrictions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.apikeys.v2.ServerKeyRestrictions other) {
      if (other == com.google.api.apikeys.v2.ServerKeyRestrictions.getDefaultInstance())
        return this;
      if (!other.allowedIps_.isEmpty()) {
        if (allowedIps_.isEmpty()) {
          allowedIps_ = other.allowedIps_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAllowedIpsIsMutable();
          allowedIps_.addAll(other.allowedIps_);
        }
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAllowedIpsIsMutable();
                allowedIps_.add(s);
                break;
              } // case 10
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

    private com.google.protobuf.LazyStringList allowedIps_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAllowedIpsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allowedIps_ = new com.google.protobuf.LazyStringArrayList(allowedIps_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @return A list containing the allowedIps.
     */
    public com.google.protobuf.ProtocolStringList getAllowedIpsList() {
      return allowedIps_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @return The count of allowedIps.
     */
    public int getAllowedIpsCount() {
      return allowedIps_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The allowedIps at the given index.
     */
    public java.lang.String getAllowedIps(int index) {
      return allowedIps_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the allowedIps at the given index.
     */
    public com.google.protobuf.ByteString getAllowedIpsBytes(int index) {
      return allowedIps_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The allowedIps to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedIps(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedIpsIsMutable();
      allowedIps_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @param value The allowedIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedIps(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedIpsIsMutable();
      allowedIps_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @param values The allowedIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedIps(java.lang.Iterable<java.lang.String> values) {
      ensureAllowedIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedIps_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowedIps() {
      allowedIps_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the caller IP addresses that are allowed to make API calls
     * with this key.
     * </pre>
     *
     * <code>repeated string allowed_ips = 1;</code>
     *
     * @param value The bytes of the allowedIps to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedIpsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAllowedIpsIsMutable();
      allowedIps_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.api.apikeys.v2.ServerKeyRestrictions)
  }

  // @@protoc_insertion_point(class_scope:google.api.apikeys.v2.ServerKeyRestrictions)
  private static final com.google.api.apikeys.v2.ServerKeyRestrictions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.apikeys.v2.ServerKeyRestrictions();
  }

  public static com.google.api.apikeys.v2.ServerKeyRestrictions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerKeyRestrictions> PARSER =
      new com.google.protobuf.AbstractParser<ServerKeyRestrictions>() {
        @java.lang.Override
        public ServerKeyRestrictions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServerKeyRestrictions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerKeyRestrictions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.apikeys.v2.ServerKeyRestrictions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
