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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * Specifies which users are excluded in this segment.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.UserSegmentExclusion}
 */
public final class UserSegmentExclusion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.UserSegmentExclusion)
    UserSegmentExclusionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserSegmentExclusion.newBuilder() to construct.
  private UserSegmentExclusion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserSegmentExclusion() {
    userExclusionDuration_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserSegmentExclusion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_UserSegmentExclusion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_UserSegmentExclusion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.UserSegmentExclusion.class,
            com.google.analytics.data.v1alpha.UserSegmentExclusion.Builder.class);
  }

  public static final int USER_EXCLUSION_DURATION_FIELD_NUMBER = 1;
  private int userExclusionDuration_ = 0;
  /**
   *
   *
   * <pre>
   * Specifies how long an exclusion will last if a user matches the
   * `userExclusionCriteria`.
   * Optional. If unspecified, `userExclusionDuration` of
   * `USER_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;</code>
   *
   * @return The enum numeric value on the wire for userExclusionDuration.
   */
  @java.lang.Override
  public int getUserExclusionDurationValue() {
    return userExclusionDuration_;
  }
  /**
   *
   *
   * <pre>
   * Specifies how long an exclusion will last if a user matches the
   * `userExclusionCriteria`.
   * Optional. If unspecified, `userExclusionDuration` of
   * `USER_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;</code>
   *
   * @return The userExclusionDuration.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserExclusionDuration getUserExclusionDuration() {
    com.google.analytics.data.v1alpha.UserExclusionDuration result =
        com.google.analytics.data.v1alpha.UserExclusionDuration.forNumber(userExclusionDuration_);
    return result == null
        ? com.google.analytics.data.v1alpha.UserExclusionDuration.UNRECOGNIZED
        : result;
  }

  public static final int USER_EXCLUSION_CRITERIA_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.UserSegmentCriteria userExclusionCriteria_;
  /**
   *
   *
   * <pre>
   * If a user meets this condition, the user is excluded from membership in
   * the segment for the `userExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
   *
   * @return Whether the userExclusionCriteria field is set.
   */
  @java.lang.Override
  public boolean hasUserExclusionCriteria() {
    return userExclusionCriteria_ != null;
  }
  /**
   *
   *
   * <pre>
   * If a user meets this condition, the user is excluded from membership in
   * the segment for the `userExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
   *
   * @return The userExclusionCriteria.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentCriteria getUserExclusionCriteria() {
    return userExclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
        : userExclusionCriteria_;
  }
  /**
   *
   *
   * <pre>
   * If a user meets this condition, the user is excluded from membership in
   * the segment for the `userExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder
      getUserExclusionCriteriaOrBuilder() {
    return userExclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
        : userExclusionCriteria_;
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
    if (userExclusionDuration_
        != com.google.analytics.data.v1alpha.UserExclusionDuration
            .USER_EXCLUSION_DURATION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, userExclusionDuration_);
    }
    if (userExclusionCriteria_ != null) {
      output.writeMessage(2, getUserExclusionCriteria());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userExclusionDuration_
        != com.google.analytics.data.v1alpha.UserExclusionDuration
            .USER_EXCLUSION_DURATION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, userExclusionDuration_);
    }
    if (userExclusionCriteria_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUserExclusionCriteria());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.UserSegmentExclusion)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.UserSegmentExclusion other =
        (com.google.analytics.data.v1alpha.UserSegmentExclusion) obj;

    if (userExclusionDuration_ != other.userExclusionDuration_) return false;
    if (hasUserExclusionCriteria() != other.hasUserExclusionCriteria()) return false;
    if (hasUserExclusionCriteria()) {
      if (!getUserExclusionCriteria().equals(other.getUserExclusionCriteria())) return false;
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
    hash = (37 * hash) + USER_EXCLUSION_DURATION_FIELD_NUMBER;
    hash = (53 * hash) + userExclusionDuration_;
    if (hasUserExclusionCriteria()) {
      hash = (37 * hash) + USER_EXCLUSION_CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + getUserExclusionCriteria().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion parseFrom(
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
      com.google.analytics.data.v1alpha.UserSegmentExclusion prototype) {
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
   * Specifies which users are excluded in this segment.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.UserSegmentExclusion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.UserSegmentExclusion)
      com.google.analytics.data.v1alpha.UserSegmentExclusionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegmentExclusion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegmentExclusion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.UserSegmentExclusion.class,
              com.google.analytics.data.v1alpha.UserSegmentExclusion.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.UserSegmentExclusion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userExclusionDuration_ = 0;
      userExclusionCriteria_ = null;
      if (userExclusionCriteriaBuilder_ != null) {
        userExclusionCriteriaBuilder_.dispose();
        userExclusionCriteriaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegmentExclusion_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegmentExclusion getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.UserSegmentExclusion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegmentExclusion build() {
      com.google.analytics.data.v1alpha.UserSegmentExclusion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegmentExclusion buildPartial() {
      com.google.analytics.data.v1alpha.UserSegmentExclusion result =
          new com.google.analytics.data.v1alpha.UserSegmentExclusion(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.UserSegmentExclusion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userExclusionDuration_ = userExclusionDuration_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userExclusionCriteria_ =
            userExclusionCriteriaBuilder_ == null
                ? userExclusionCriteria_
                : userExclusionCriteriaBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.UserSegmentExclusion) {
        return mergeFrom((com.google.analytics.data.v1alpha.UserSegmentExclusion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.UserSegmentExclusion other) {
      if (other == com.google.analytics.data.v1alpha.UserSegmentExclusion.getDefaultInstance())
        return this;
      if (other.userExclusionDuration_ != 0) {
        setUserExclusionDurationValue(other.getUserExclusionDurationValue());
      }
      if (other.hasUserExclusionCriteria()) {
        mergeUserExclusionCriteria(other.getUserExclusionCriteria());
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
            case 8:
              {
                userExclusionDuration_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getUserExclusionCriteriaFieldBuilder().getBuilder(), extensionRegistry);
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

    private int userExclusionDuration_ = 0;
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a user matches the
     * `userExclusionCriteria`.
     * Optional. If unspecified, `userExclusionDuration` of
     * `USER_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for userExclusionDuration.
     */
    @java.lang.Override
    public int getUserExclusionDurationValue() {
      return userExclusionDuration_;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a user matches the
     * `userExclusionCriteria`.
     * Optional. If unspecified, `userExclusionDuration` of
     * `USER_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for userExclusionDuration to set.
     * @return This builder for chaining.
     */
    public Builder setUserExclusionDurationValue(int value) {
      userExclusionDuration_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a user matches the
     * `userExclusionCriteria`.
     * Optional. If unspecified, `userExclusionDuration` of
     * `USER_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;
     * </code>
     *
     * @return The userExclusionDuration.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserExclusionDuration getUserExclusionDuration() {
      com.google.analytics.data.v1alpha.UserExclusionDuration result =
          com.google.analytics.data.v1alpha.UserExclusionDuration.forNumber(userExclusionDuration_);
      return result == null
          ? com.google.analytics.data.v1alpha.UserExclusionDuration.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a user matches the
     * `userExclusionCriteria`.
     * Optional. If unspecified, `userExclusionDuration` of
     * `USER_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;
     * </code>
     *
     * @param value The userExclusionDuration to set.
     * @return This builder for chaining.
     */
    public Builder setUserExclusionDuration(
        com.google.analytics.data.v1alpha.UserExclusionDuration value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      userExclusionDuration_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies how long an exclusion will last if a user matches the
     * `userExclusionCriteria`.
     * Optional. If unspecified, `userExclusionDuration` of
     * `USER_EXCLUSION_TEMPORARY` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUserExclusionDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userExclusionDuration_ = 0;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.UserSegmentCriteria userExclusionCriteria_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.UserSegmentCriteria,
            com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder>
        userExclusionCriteriaBuilder_;
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     *
     * @return Whether the userExclusionCriteria field is set.
     */
    public boolean hasUserExclusionCriteria() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     *
     * @return The userExclusionCriteria.
     */
    public com.google.analytics.data.v1alpha.UserSegmentCriteria getUserExclusionCriteria() {
      if (userExclusionCriteriaBuilder_ == null) {
        return userExclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
            : userExclusionCriteria_;
      } else {
        return userExclusionCriteriaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     */
    public Builder setUserExclusionCriteria(
        com.google.analytics.data.v1alpha.UserSegmentCriteria value) {
      if (userExclusionCriteriaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userExclusionCriteria_ = value;
      } else {
        userExclusionCriteriaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     */
    public Builder setUserExclusionCriteria(
        com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder builderForValue) {
      if (userExclusionCriteriaBuilder_ == null) {
        userExclusionCriteria_ = builderForValue.build();
      } else {
        userExclusionCriteriaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     */
    public Builder mergeUserExclusionCriteria(
        com.google.analytics.data.v1alpha.UserSegmentCriteria value) {
      if (userExclusionCriteriaBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && userExclusionCriteria_ != null
            && userExclusionCriteria_
                != com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()) {
          getUserExclusionCriteriaBuilder().mergeFrom(value);
        } else {
          userExclusionCriteria_ = value;
        }
      } else {
        userExclusionCriteriaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     */
    public Builder clearUserExclusionCriteria() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userExclusionCriteria_ = null;
      if (userExclusionCriteriaBuilder_ != null) {
        userExclusionCriteriaBuilder_.dispose();
        userExclusionCriteriaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     */
    public com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder
        getUserExclusionCriteriaBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUserExclusionCriteriaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     */
    public com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder
        getUserExclusionCriteriaOrBuilder() {
      if (userExclusionCriteriaBuilder_ != null) {
        return userExclusionCriteriaBuilder_.getMessageOrBuilder();
      } else {
        return userExclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
            : userExclusionCriteria_;
      }
    }
    /**
     *
     *
     * <pre>
     * If a user meets this condition, the user is excluded from membership in
     * the segment for the `userExclusionDuration`.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.UserSegmentCriteria,
            com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder>
        getUserExclusionCriteriaFieldBuilder() {
      if (userExclusionCriteriaBuilder_ == null) {
        userExclusionCriteriaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.UserSegmentCriteria,
                com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder,
                com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder>(
                getUserExclusionCriteria(), getParentForChildren(), isClean());
        userExclusionCriteria_ = null;
      }
      return userExclusionCriteriaBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.UserSegmentExclusion)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.UserSegmentExclusion)
  private static final com.google.analytics.data.v1alpha.UserSegmentExclusion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.UserSegmentExclusion();
  }

  public static com.google.analytics.data.v1alpha.UserSegmentExclusion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserSegmentExclusion> PARSER =
      new com.google.protobuf.AbstractParser<UserSegmentExclusion>() {
        @java.lang.Override
        public UserSegmentExclusion parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserSegmentExclusion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserSegmentExclusion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentExclusion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
