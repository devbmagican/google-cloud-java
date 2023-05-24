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
// source: google/cloud/websecurityscanner/v1alpha/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1alpha;

/**
 *
 *
 * <pre>
 * Request for the `CreateScanConfig` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest}
 */
public final class CreateScanConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest)
    CreateScanConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateScanConfigRequest.newBuilder() to construct.
  private CreateScanConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateScanConfigRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateScanConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_CreateScanConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1alpha_CreateScanConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest.class,
            com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCAN_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.websecurityscanner.v1alpha.ScanConfig scanConfig_;
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the scanConfig field is set.
   */
  @java.lang.Override
  public boolean hasScanConfig() {
    return scanConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The scanConfig.
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.ScanConfig getScanConfig() {
    return scanConfig_ == null
        ? com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()
        : scanConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder getScanConfigOrBuilder() {
    return scanConfig_ == null
        ? com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()
        : scanConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (scanConfig_ != null) {
      output.writeMessage(2, getScanConfig());
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
    if (scanConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getScanConfig());
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest other =
        (com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasScanConfig() != other.hasScanConfig()) return false;
    if (hasScanConfig()) {
      if (!getScanConfig().equals(other.getScanConfig())) return false;
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
    if (hasScanConfig()) {
      hash = (37 * hash) + SCAN_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getScanConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest parseFrom(
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
      com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest prototype) {
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
   * Request for the `CreateScanConfig` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest)
      com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_CreateScanConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_CreateScanConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest.class,
              com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      scanConfig_ = null;
      if (scanConfigBuilder_ != null) {
        scanConfigBuilder_.dispose();
        scanConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1alpha_CreateScanConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest build() {
      com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest buildPartial() {
      com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest result =
          new com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.scanConfig_ = scanConfigBuilder_ == null ? scanConfig_ : scanConfigBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest) {
        return mergeFrom(
            (com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest other) {
      if (other
          == com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasScanConfig()) {
        mergeScanConfig(other.getScanConfig());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getScanConfigFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource name where the scan is created, which should be a
     * project resource name in the format 'projects/{projectId}'.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name where the scan is created, which should be a
     * project resource name in the format 'projects/{projectId}'.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name where the scan is created, which should be a
     * project resource name in the format 'projects/{projectId}'.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name where the scan is created, which should be a
     * project resource name in the format 'projects/{projectId}'.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name where the scan is created, which should be a
     * project resource name in the format 'projects/{projectId}'.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.websecurityscanner.v1alpha.ScanConfig scanConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
        scanConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the scanConfig field is set.
     */
    public boolean hasScanConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The scanConfig.
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig getScanConfig() {
      if (scanConfigBuilder_ == null) {
        return scanConfig_ == null
            ? com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()
            : scanConfig_;
      } else {
        return scanConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setScanConfig(com.google.cloud.websecurityscanner.v1alpha.ScanConfig value) {
      if (scanConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scanConfig_ = value;
      } else {
        scanConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setScanConfig(
        com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder builderForValue) {
      if (scanConfigBuilder_ == null) {
        scanConfig_ = builderForValue.build();
      } else {
        scanConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeScanConfig(com.google.cloud.websecurityscanner.v1alpha.ScanConfig value) {
      if (scanConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && scanConfig_ != null
            && scanConfig_
                != com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()) {
          getScanConfigBuilder().mergeFrom(value);
        } else {
          scanConfig_ = value;
        }
      } else {
        scanConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearScanConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      scanConfig_ = null;
      if (scanConfigBuilder_ != null) {
        scanConfigBuilder_.dispose();
        scanConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder getScanConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getScanConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder
        getScanConfigOrBuilder() {
      if (scanConfigBuilder_ != null) {
        return scanConfigBuilder_.getMessageOrBuilder();
      } else {
        return scanConfig_ == null
            ? com.google.cloud.websecurityscanner.v1alpha.ScanConfig.getDefaultInstance()
            : scanConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ScanConfig to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.websecurityscanner.v1alpha.ScanConfig scan_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
            com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>
        getScanConfigFieldBuilder() {
      if (scanConfigBuilder_ == null) {
        scanConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.websecurityscanner.v1alpha.ScanConfig,
                com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Builder,
                com.google.cloud.websecurityscanner.v1alpha.ScanConfigOrBuilder>(
                getScanConfig(), getParentForChildren(), isClean());
        scanConfig_ = null;
      }
      return scanConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest)
  private static final com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest();
  }

  public static com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateScanConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateScanConfigRequest>() {
        @java.lang.Override
        public CreateScanConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateScanConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateScanConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1alpha.CreateScanConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
