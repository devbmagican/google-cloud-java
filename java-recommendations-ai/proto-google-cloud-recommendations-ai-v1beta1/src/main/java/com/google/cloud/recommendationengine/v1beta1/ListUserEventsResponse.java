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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for ListUserEvents method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.ListUserEventsResponse}
 */
public final class ListUserEventsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.ListUserEventsResponse)
    ListUserEventsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListUserEventsResponse.newBuilder() to construct.
  private ListUserEventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListUserEventsResponse() {
    userEvents_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListUserEventsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListUserEventsResponse(
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
                userEvents_ =
                    new java.util.ArrayList<
                        com.google.cloud.recommendationengine.v1beta1.UserEvent>();
                mutable_bitField0_ |= 0x00000001;
              }
              userEvents_.add(
                  input.readMessage(
                      com.google.cloud.recommendationengine.v1beta1.UserEvent.parser(),
                      extensionRegistry));
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
        userEvents_ = java.util.Collections.unmodifiableList(userEvents_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse.class,
            com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse.Builder.class);
  }

  public static final int USER_EVENTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> userEvents_;
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent>
      getUserEventsList() {
    return userEvents_;
  }
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
      getUserEventsOrBuilderList() {
    return userEvents_;
  }
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  @java.lang.Override
  public int getUserEventsCount() {
    return userEvents_.size();
  }
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEvents(int index) {
    return userEvents_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder getUserEventsOrBuilder(
      int index) {
    return userEvents_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If empty, the list is complete. If nonempty, the token to pass to the next
   * request's ListUserEvents.page_token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
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
   * If empty, the list is complete. If nonempty, the token to pass to the next
   * request's ListUserEvents.page_token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
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
    for (int i = 0; i < userEvents_.size(); i++) {
      output.writeMessage(1, userEvents_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, userEvents_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
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
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse other =
        (com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse) obj;

    if (!getUserEventsList().equals(other.getUserEventsList())) return false;
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
    if (getUserEventsCount() > 0) {
      hash = (37 * hash) + USER_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getUserEventsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parseFrom(
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
      com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse prototype) {
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
   * Response message for ListUserEvents method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.ListUserEventsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.ListUserEventsResponse)
      com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse.class,
              com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUserEventsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userEventsBuilder_ == null) {
        userEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userEventsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse build() {
      com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse result =
          new com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse(this);
      int from_bitField0_ = bitField0_;
      if (userEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userEvents_ = java.util.Collections.unmodifiableList(userEvents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userEvents_ = userEvents_;
      } else {
        result.userEvents_ = userEventsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse) {
        return mergeFrom(
            (com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse other) {
      if (other
          == com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
              .getDefaultInstance()) return this;
      if (userEventsBuilder_ == null) {
        if (!other.userEvents_.isEmpty()) {
          if (userEvents_.isEmpty()) {
            userEvents_ = other.userEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserEventsIsMutable();
            userEvents_.addAll(other.userEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.userEvents_.isEmpty()) {
          if (userEventsBuilder_.isEmpty()) {
            userEventsBuilder_.dispose();
            userEventsBuilder_ = null;
            userEvents_ = other.userEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userEventsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getUserEventsFieldBuilder()
                    : null;
          } else {
            userEventsBuilder_.addAllMessages(other.userEvents_);
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
      com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> userEvents_ =
        java.util.Collections.emptyList();

    private void ensureUserEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userEvents_ =
            new java.util.ArrayList<com.google.cloud.recommendationengine.v1beta1.UserEvent>(
                userEvents_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.UserEvent,
            com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder,
            com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
        userEventsBuilder_;

    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent>
        getUserEventsList() {
      if (userEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userEvents_);
      } else {
        return userEventsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public int getUserEventsCount() {
      if (userEventsBuilder_ == null) {
        return userEvents_.size();
      } else {
        return userEventsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEvents(int index) {
      if (userEventsBuilder_ == null) {
        return userEvents_.get(index);
      } else {
        return userEventsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder setUserEvents(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.set(index, value);
        onChanged();
      } else {
        userEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder setUserEvents(
        int index,
        com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder addUserEvents(com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.add(value);
        onChanged();
      } else {
        userEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder addUserEvents(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsIsMutable();
        userEvents_.add(index, value);
        onChanged();
      } else {
        userEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder addUserEvents(
        com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.add(builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder addUserEvents(
        int index,
        com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        userEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder addAllUserEvents(
        java.lang.Iterable<? extends com.google.cloud.recommendationengine.v1beta1.UserEvent>
            values) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, userEvents_);
        onChanged();
      } else {
        userEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder clearUserEvents() {
      if (userEventsBuilder_ == null) {
        userEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userEventsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public Builder removeUserEvents(int index) {
      if (userEventsBuilder_ == null) {
        ensureUserEventsIsMutable();
        userEvents_.remove(index);
        onChanged();
      } else {
        userEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder getUserEventsBuilder(
        int index) {
      return getUserEventsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder getUserEventsOrBuilder(
        int index) {
      if (userEventsBuilder_ == null) {
        return userEvents_.get(index);
      } else {
        return userEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
        getUserEventsOrBuilderList() {
      if (userEventsBuilder_ != null) {
        return userEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userEvents_);
      }
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder addUserEventsBuilder() {
      return getUserEventsFieldBuilder()
          .addBuilder(com.google.cloud.recommendationengine.v1beta1.UserEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder addUserEventsBuilder(
        int index) {
      return getUserEventsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.recommendationengine.v1beta1.UserEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The user events.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder>
        getUserEventsBuilderList() {
      return getUserEventsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.UserEvent,
            com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder,
            com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
        getUserEventsFieldBuilder() {
      if (userEventsBuilder_ == null) {
        userEventsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.recommendationengine.v1beta1.UserEvent,
                com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder,
                com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>(
                userEvents_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        userEvents_ = null;
      }
      return userEventsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If empty, the list is complete. If nonempty, the token to pass to the next
     * request's ListUserEvents.page_token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
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
     * If empty, the list is complete. If nonempty, the token to pass to the next
     * request's ListUserEvents.page_token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
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
     * If empty, the list is complete. If nonempty, the token to pass to the next
     * request's ListUserEvents.page_token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
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
     * If empty, the list is complete. If nonempty, the token to pass to the next
     * request's ListUserEvents.page_token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
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
     * If empty, the list is complete. If nonempty, the token to pass to the next
     * request's ListUserEvents.page_token.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.ListUserEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.ListUserEventsResponse)
  private static final com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse();
  }

  public static com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUserEventsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListUserEventsResponse>() {
        @java.lang.Override
        public ListUserEventsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListUserEventsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListUserEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUserEventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.ListUserEventsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
