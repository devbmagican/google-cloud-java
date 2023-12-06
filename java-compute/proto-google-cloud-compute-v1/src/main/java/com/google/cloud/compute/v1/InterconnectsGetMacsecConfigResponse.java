/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Response for the InterconnectsGetMacsecConfigRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse}
 */
public final class InterconnectsGetMacsecConfigResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse)
    InterconnectsGetMacsecConfigResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectsGetMacsecConfigResponse.newBuilder() to construct.
  private InterconnectsGetMacsecConfigResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectsGetMacsecConfigResponse() {
    etag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectsGetMacsecConfigResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectsGetMacsecConfigResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectsGetMacsecConfigResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse.class,
            com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ETAG_FIELD_NUMBER = 3123477;

  @SuppressWarnings("serial")
  private volatile java.lang.Object etag_ = "";
  /**
   *
   *
   * <pre>
   * end_interface: MixerGetResponseWithEtagBuilder
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return Whether the etag field is set.
   */
  @java.lang.Override
  public boolean hasEtag() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * end_interface: MixerGetResponseWithEtagBuilder
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return The etag.
   */
  @java.lang.Override
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etag_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * end_interface: MixerGetResponseWithEtagBuilder
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return The bytes for etag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      etag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 139315229;
  private com.google.cloud.compute.v1.InterconnectMacsecConfig result_;
  /**
   * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
   *
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
   *
   * @return The result.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectMacsecConfig getResult() {
    return result_ == null
        ? com.google.cloud.compute.v1.InterconnectMacsecConfig.getDefaultInstance()
        : result_;
  }
  /** <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectMacsecConfigOrBuilder getResultOrBuilder() {
    return result_ == null
        ? com.google.cloud.compute.v1.InterconnectMacsecConfig.getDefaultInstance()
        : result_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3123477, etag_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(139315229, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3123477, etag_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(139315229, getResult());
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse other =
        (com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse) obj;

    if (hasEtag() != other.hasEtag()) return false;
    if (hasEtag()) {
      if (!getEtag().equals(other.getEtag())) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult().equals(other.getResult())) return false;
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
    if (hasEtag()) {
      hash = (37 * hash) + ETAG_FIELD_NUMBER;
      hash = (53 * hash) + getEtag().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse parseFrom(
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
      com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse prototype) {
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
   * Response for the InterconnectsGetMacsecConfigRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse)
      com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectsGetMacsecConfigResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectsGetMacsecConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse.class,
              com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResultFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      etag_ = "";
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectsGetMacsecConfigResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse build() {
      com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse buildPartial() {
      com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse result =
          new com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.etag_ = etag_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.result_ = resultBuilder_ == null ? result_ : resultBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse other) {
      if (other
          == com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse.getDefaultInstance())
        return this;
      if (other.hasEtag()) {
        etag_ = other.etag_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
            case 24987818:
              {
                etag_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 24987818
            case 1114521834:
              {
                input.readMessage(getResultFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 1114521834
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

    private java.lang.Object etag_ = "";
    /**
     *
     *
     * <pre>
     * end_interface: MixerGetResponseWithEtagBuilder
     * </pre>
     *
     * <code>optional string etag = 3123477;</code>
     *
     * @return Whether the etag field is set.
     */
    public boolean hasEtag() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * end_interface: MixerGetResponseWithEtagBuilder
     * </pre>
     *
     * <code>optional string etag = 3123477;</code>
     *
     * @return The etag.
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * end_interface: MixerGetResponseWithEtagBuilder
     * </pre>
     *
     * <code>optional string etag = 3123477;</code>
     *
     * @return The bytes for etag.
     */
    public com.google.protobuf.ByteString getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * end_interface: MixerGetResponseWithEtagBuilder
     * </pre>
     *
     * <code>optional string etag = 3123477;</code>
     *
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      etag_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * end_interface: MixerGetResponseWithEtagBuilder
     * </pre>
     *
     * <code>optional string etag = 3123477;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEtag() {
      etag_ = getDefaultInstance().getEtag();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * end_interface: MixerGetResponseWithEtagBuilder
     * </pre>
     *
     * <code>optional string etag = 3123477;</code>
     *
     * @param value The bytes for etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      etag_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.InterconnectMacsecConfig result_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InterconnectMacsecConfig,
            com.google.cloud.compute.v1.InterconnectMacsecConfig.Builder,
            com.google.cloud.compute.v1.InterconnectMacsecConfigOrBuilder>
        resultBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     *
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     *
     * @return The result.
     */
    public com.google.cloud.compute.v1.InterconnectMacsecConfig getResult() {
      if (resultBuilder_ == null) {
        return result_ == null
            ? com.google.cloud.compute.v1.InterconnectMacsecConfig.getDefaultInstance()
            : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     */
    public Builder setResult(com.google.cloud.compute.v1.InterconnectMacsecConfig value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     */
    public Builder setResult(
        com.google.cloud.compute.v1.InterconnectMacsecConfig.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     */
    public Builder mergeResult(com.google.cloud.compute.v1.InterconnectMacsecConfig value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && result_ != null
            && result_
                != com.google.cloud.compute.v1.InterconnectMacsecConfig.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000002);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     */
    public com.google.cloud.compute.v1.InterconnectMacsecConfig.Builder getResultBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     */
    public com.google.cloud.compute.v1.InterconnectMacsecConfigOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null
            ? com.google.cloud.compute.v1.InterconnectMacsecConfig.getDefaultInstance()
            : result_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InterconnectMacsecConfig,
            com.google.cloud.compute.v1.InterconnectMacsecConfig.Builder,
            com.google.cloud.compute.v1.InterconnectMacsecConfigOrBuilder>
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.InterconnectMacsecConfig,
                com.google.cloud.compute.v1.InterconnectMacsecConfig.Builder,
                com.google.cloud.compute.v1.InterconnectMacsecConfigOrBuilder>(
                getResult(), getParentForChildren(), isClean());
        result_ = null;
      }
      return resultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse)
  private static final com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse();
  }

  public static com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectsGetMacsecConfigResponse> PARSER =
      new com.google.protobuf.AbstractParser<InterconnectsGetMacsecConfigResponse>() {
        @java.lang.Override
        public InterconnectsGetMacsecConfigResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<InterconnectsGetMacsecConfigResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectsGetMacsecConfigResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
