/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * Response for `ListDevices`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.ListDevicesResponse}
 */
public final class ListDevicesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.ListDevicesResponse)
    ListDevicesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDevicesResponse.newBuilder() to construct.
  private ListDevicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDevicesResponse() {
    devices_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListDevicesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                devices_ = new java.util.ArrayList<com.google.cloud.iot.v1.Device>();
                mutable_bitField0_ |= 0x00000001;
              }
              devices_.add(
                  input.readMessage(com.google.cloud.iot.v1.Device.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        devices_ = java.util.Collections.unmodifiableList(devices_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDevicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDevicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.ListDevicesResponse.class,
            com.google.cloud.iot.v1.ListDevicesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DEVICES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.iot.v1.Device> devices_;
  /**
   *
   *
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  public java.util.List<com.google.cloud.iot.v1.Device> getDevicesList() {
    return devices_;
  }
  /**
   *
   *
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.iot.v1.DeviceOrBuilder>
      getDevicesOrBuilderList() {
    return devices_;
  }
  /**
   *
   *
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  public int getDevicesCount() {
    return devices_.size();
  }
  /**
   *
   *
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  public com.google.cloud.iot.v1.Device getDevices(int index) {
    return devices_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The devices that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
   */
  public com.google.cloud.iot.v1.DeviceOrBuilder getDevicesOrBuilder(int index) {
    return devices_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more devices that match the
   * request; this value should be passed in a new `ListDevicesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more devices that match the
   * request; this value should be passed in a new `ListDevicesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < devices_.size(); i++) {
      output.writeMessage(1, devices_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < devices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, devices_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.ListDevicesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.ListDevicesResponse other =
        (com.google.cloud.iot.v1.ListDevicesResponse) obj;

    if (!getDevicesList().equals(other.getDevicesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDevicesCount() > 0) {
      hash = (37 * hash) + DEVICES_FIELD_NUMBER;
      hash = (53 * hash) + getDevicesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.ListDevicesResponse prototype) {
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
   * Response for `ListDevices`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.ListDevicesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.ListDevicesResponse)
      com.google.cloud.iot.v1.ListDevicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDevicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDevicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.ListDevicesResponse.class,
              com.google.cloud.iot.v1.ListDevicesResponse.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.ListDevicesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDevicesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        devicesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDevicesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDevicesResponse getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.ListDevicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDevicesResponse build() {
      com.google.cloud.iot.v1.ListDevicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDevicesResponse buildPartial() {
      com.google.cloud.iot.v1.ListDevicesResponse result =
          new com.google.cloud.iot.v1.ListDevicesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (devicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          devices_ = java.util.Collections.unmodifiableList(devices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.devices_ = devices_;
      } else {
        result.devices_ = devicesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.iot.v1.ListDevicesResponse) {
        return mergeFrom((com.google.cloud.iot.v1.ListDevicesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.ListDevicesResponse other) {
      if (other == com.google.cloud.iot.v1.ListDevicesResponse.getDefaultInstance()) return this;
      if (devicesBuilder_ == null) {
        if (!other.devices_.isEmpty()) {
          if (devices_.isEmpty()) {
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDevicesIsMutable();
            devices_.addAll(other.devices_);
          }
          onChanged();
        }
      } else {
        if (!other.devices_.isEmpty()) {
          if (devicesBuilder_.isEmpty()) {
            devicesBuilder_.dispose();
            devicesBuilder_ = null;
            devices_ = other.devices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            devicesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDevicesFieldBuilder()
                    : null;
          } else {
            devicesBuilder_.addAllMessages(other.devices_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.cloud.iot.v1.ListDevicesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.ListDevicesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.iot.v1.Device> devices_ =
        java.util.Collections.emptyList();

    private void ensureDevicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        devices_ = new java.util.ArrayList<com.google.cloud.iot.v1.Device>(devices_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.Device,
            com.google.cloud.iot.v1.Device.Builder,
            com.google.cloud.iot.v1.DeviceOrBuilder>
        devicesBuilder_;

    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.Device> getDevicesList() {
      if (devicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(devices_);
      } else {
        return devicesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public int getDevicesCount() {
      if (devicesBuilder_ == null) {
        return devices_.size();
      } else {
        return devicesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public com.google.cloud.iot.v1.Device getDevices(int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);
      } else {
        return devicesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder setDevices(int index, com.google.cloud.iot.v1.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.set(index, value);
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder setDevices(int index, com.google.cloud.iot.v1.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.set(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder addDevices(com.google.cloud.iot.v1.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder addDevices(int index, com.google.cloud.iot.v1.Device value) {
      if (devicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDevicesIsMutable();
        devices_.add(index, value);
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder addDevices(com.google.cloud.iot.v1.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder addDevices(int index, com.google.cloud.iot.v1.Device.Builder builderForValue) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.add(index, builderForValue.build());
        onChanged();
      } else {
        devicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder addAllDevices(
        java.lang.Iterable<? extends com.google.cloud.iot.v1.Device> values) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, devices_);
        onChanged();
      } else {
        devicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder clearDevices() {
      if (devicesBuilder_ == null) {
        devices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        devicesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public Builder removeDevices(int index) {
      if (devicesBuilder_ == null) {
        ensureDevicesIsMutable();
        devices_.remove(index);
        onChanged();
      } else {
        devicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public com.google.cloud.iot.v1.Device.Builder getDevicesBuilder(int index) {
      return getDevicesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceOrBuilder getDevicesOrBuilder(int index) {
      if (devicesBuilder_ == null) {
        return devices_.get(index);
      } else {
        return devicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.iot.v1.DeviceOrBuilder>
        getDevicesOrBuilderList() {
      if (devicesBuilder_ != null) {
        return devicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(devices_);
      }
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public com.google.cloud.iot.v1.Device.Builder addDevicesBuilder() {
      return getDevicesFieldBuilder()
          .addBuilder(com.google.cloud.iot.v1.Device.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public com.google.cloud.iot.v1.Device.Builder addDevicesBuilder(int index) {
      return getDevicesFieldBuilder()
          .addBuilder(index, com.google.cloud.iot.v1.Device.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The devices that match the request.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.Device devices = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.Device.Builder> getDevicesBuilderList() {
      return getDevicesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.Device,
            com.google.cloud.iot.v1.Device.Builder,
            com.google.cloud.iot.v1.DeviceOrBuilder>
        getDevicesFieldBuilder() {
      if (devicesBuilder_ == null) {
        devicesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.iot.v1.Device,
                com.google.cloud.iot.v1.Device.Builder,
                com.google.cloud.iot.v1.DeviceOrBuilder>(
                devices_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        devices_ = null;
      }
      return devicesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more devices that match the
     * request; this value should be passed in a new `ListDevicesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more devices that match the
     * request; this value should be passed in a new `ListDevicesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more devices that match the
     * request; this value should be passed in a new `ListDevicesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more devices that match the
     * request; this value should be passed in a new `ListDevicesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more devices that match the
     * request; this value should be passed in a new `ListDevicesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.ListDevicesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.ListDevicesResponse)
  private static final com.google.cloud.iot.v1.ListDevicesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.ListDevicesResponse();
  }

  public static com.google.cloud.iot.v1.ListDevicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDevicesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDevicesResponse>() {
        @java.lang.Override
        public ListDevicesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListDevicesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListDevicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDevicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.ListDevicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
