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
// source: google/cloud/dialogflow/cx/v3beta1/version.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [Versions.CompareVersions][google.cloud.dialogflow.cx.v3beta1.Versions.CompareVersions].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest}
 */
public final class CompareVersionsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest)
    CompareVersionsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CompareVersionsRequest.newBuilder() to construct.
  private CompareVersionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CompareVersionsRequest() {
    baseVersion_ = "";
    targetVersion_ = "";
    languageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CompareVersionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CompareVersionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CompareVersionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest.Builder.class);
  }

  public static final int BASE_VERSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object baseVersion_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the base flow version to compare with the target version.
   * Use version ID `0` to indicate the draft version of the specified flow.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/
   * &lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * </pre>
   *
   * <code>
   * string base_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The baseVersion.
   */
  @java.lang.Override
  public java.lang.String getBaseVersion() {
    java.lang.Object ref = baseVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the base flow version to compare with the target version.
   * Use version ID `0` to indicate the draft version of the specified flow.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/
   * &lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * </pre>
   *
   * <code>
   * string base_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for baseVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBaseVersionBytes() {
    java.lang.Object ref = baseVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      baseVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object targetVersion_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the target flow version to compare with the
   * base version. Use version ID `0` to indicate the draft version of the
   * specified flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * </pre>
   *
   * <code>
   * string target_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The targetVersion.
   */
  @java.lang.Override
  public java.lang.String getTargetVersion() {
    java.lang.Object ref = targetVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the target flow version to compare with the
   * base version. Use version ID `0` to indicate the draft version of the
   * specified flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
   * </pre>
   *
   * <code>
   * string target_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for targetVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTargetVersionBytes() {
    java.lang.Object ref = targetVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      targetVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object languageCode_ = "";
  /**
   *
   *
   * <pre>
   * The language to compare the flow versions for.
   *
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language) are
   * supported. Note: languages must be enabled in the agent before they can be
   * used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The languageCode.
   */
  @java.lang.Override
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The language to compare the flow versions for.
   *
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language) are
   * supported. Note: languages must be enabled in the agent before they can be
   * used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The bytes for languageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, baseVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, targetVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, baseVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, targetVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest) obj;

    if (!getBaseVersion().equals(other.getBaseVersion())) return false;
    if (!getTargetVersion().equals(other.getTargetVersion())) return false;
    if (!getLanguageCode().equals(other.getLanguageCode())) return false;
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
    hash = (37 * hash) + BASE_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getBaseVersion().hashCode();
    hash = (37 * hash) + TARGET_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getTargetVersion().hashCode();
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest prototype) {
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
   * The request message for
   * [Versions.CompareVersions][google.cloud.dialogflow.cx.v3beta1.Versions.CompareVersions].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest)
      com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CompareVersionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CompareVersionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      baseVersion_ = "";
      targetVersion_ = "";
      languageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.VersionProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CompareVersionsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseVersion_ = baseVersion_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.targetVersion_ = targetVersion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.languageCode_ = languageCode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest other) {
      if (other
          == com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest.getDefaultInstance())
        return this;
      if (!other.getBaseVersion().isEmpty()) {
        baseVersion_ = other.baseVersion_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTargetVersion().isEmpty()) {
        targetVersion_ = other.targetVersion_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        bitField0_ |= 0x00000004;
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
                baseVersion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                targetVersion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                languageCode_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object baseVersion_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the base flow version to compare with the target version.
     * Use version ID `0` to indicate the draft version of the specified flow.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/
     * &lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string base_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The baseVersion.
     */
    public java.lang.String getBaseVersion() {
      java.lang.Object ref = baseVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the base flow version to compare with the target version.
     * Use version ID `0` to indicate the draft version of the specified flow.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/
     * &lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string base_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for baseVersion.
     */
    public com.google.protobuf.ByteString getBaseVersionBytes() {
      java.lang.Object ref = baseVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        baseVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the base flow version to compare with the target version.
     * Use version ID `0` to indicate the draft version of the specified flow.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/
     * &lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string base_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The baseVersion to set.
     * @return This builder for chaining.
     */
    public Builder setBaseVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      baseVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the base flow version to compare with the target version.
     * Use version ID `0` to indicate the draft version of the specified flow.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/
     * &lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string base_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBaseVersion() {
      baseVersion_ = getDefaultInstance().getBaseVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the base flow version to compare with the target version.
     * Use version ID `0` to indicate the draft version of the specified flow.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/
     * &lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string base_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for baseVersion to set.
     * @return This builder for chaining.
     */
    public Builder setBaseVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      baseVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object targetVersion_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the target flow version to compare with the
     * base version. Use version ID `0` to indicate the draft version of the
     * specified flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string target_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The targetVersion.
     */
    public java.lang.String getTargetVersion() {
      java.lang.Object ref = targetVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the target flow version to compare with the
     * base version. Use version ID `0` to indicate the draft version of the
     * specified flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string target_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for targetVersion.
     */
    public com.google.protobuf.ByteString getTargetVersionBytes() {
      java.lang.Object ref = targetVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        targetVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the target flow version to compare with the
     * base version. Use version ID `0` to indicate the draft version of the
     * specified flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string target_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The targetVersion to set.
     * @return This builder for chaining.
     */
    public Builder setTargetVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the target flow version to compare with the
     * base version. Use version ID `0` to indicate the draft version of the
     * specified flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string target_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetVersion() {
      targetVersion_ = getDefaultInstance().getTargetVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the target flow version to compare with the
     * base version. Use version ID `0` to indicate the draft version of the
     * specified flow. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Version ID&gt;`.
     * </pre>
     *
     * <code>
     * string target_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for targetVersion to set.
     * @return This builder for chaining.
     */
    public Builder setTargetVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      targetVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * The language to compare the flow versions for.
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/docs/reference/language) are
     * supported. Note: languages must be enabled in the agent before they can be
     * used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     *
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The language to compare the flow versions for.
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/docs/reference/language) are
     * supported. Note: languages must be enabled in the agent before they can be
     * used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     *
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The language to compare the flow versions for.
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/docs/reference/language) are
     * supported. Note: languages must be enabled in the agent before they can be
     * used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     *
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      languageCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The language to compare the flow versions for.
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/docs/reference/language) are
     * supported. Note: languages must be enabled in the agent before they can be
     * used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {
      languageCode_ = getDefaultInstance().getLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The language to compare the flow versions for.
     *
     * If not specified, the agent's default language is used.
     * [Many
     * languages](https://cloud.google.com/dialogflow/docs/reference/language) are
     * supported. Note: languages must be enabled in the agent before they can be
     * used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     *
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      languageCode_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompareVersionsRequest> PARSER =
      new com.google.protobuf.AbstractParser<CompareVersionsRequest>() {
        @java.lang.Override
        public CompareVersionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompareVersionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompareVersionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.CompareVersionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
