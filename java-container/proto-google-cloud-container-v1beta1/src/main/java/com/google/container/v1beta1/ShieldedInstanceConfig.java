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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * A set of Shielded Instance options.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.ShieldedInstanceConfig}
 */
public final class ShieldedInstanceConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.ShieldedInstanceConfig)
    ShieldedInstanceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ShieldedInstanceConfig.newBuilder() to construct.
  private ShieldedInstanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ShieldedInstanceConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ShieldedInstanceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ShieldedInstanceConfig(
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
          case 8:
            {
              enableSecureBoot_ = input.readBool();
              break;
            }
          case 16:
            {
              enableIntegrityMonitoring_ = input.readBool();
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
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ShieldedInstanceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ShieldedInstanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.ShieldedInstanceConfig.class,
            com.google.container.v1beta1.ShieldedInstanceConfig.Builder.class);
  }

  public static final int ENABLE_SECURE_BOOT_FIELD_NUMBER = 1;
  private boolean enableSecureBoot_;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has Secure Boot enabled.
   * Secure Boot helps ensure that the system only runs authentic software by
   * verifying the digital signature of all boot components, and halting the
   * boot process if signature verification fails.
   * </pre>
   *
   * <code>bool enable_secure_boot = 1;</code>
   *
   * @return The enableSecureBoot.
   */
  @java.lang.Override
  public boolean getEnableSecureBoot() {
    return enableSecureBoot_;
  }

  public static final int ENABLE_INTEGRITY_MONITORING_FIELD_NUMBER = 2;
  private boolean enableIntegrityMonitoring_;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has integrity monitoring enabled.
   * Enables monitoring and attestation of the boot integrity of the instance.
   * The attestation is performed against the integrity policy baseline. This
   * baseline is initially derived from the implicitly trusted boot image when
   * the instance is created.
   * </pre>
   *
   * <code>bool enable_integrity_monitoring = 2;</code>
   *
   * @return The enableIntegrityMonitoring.
   */
  @java.lang.Override
  public boolean getEnableIntegrityMonitoring() {
    return enableIntegrityMonitoring_;
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
    if (enableSecureBoot_ != false) {
      output.writeBool(1, enableSecureBoot_);
    }
    if (enableIntegrityMonitoring_ != false) {
      output.writeBool(2, enableIntegrityMonitoring_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableSecureBoot_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableSecureBoot_);
    }
    if (enableIntegrityMonitoring_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, enableIntegrityMonitoring_);
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
    if (!(obj instanceof com.google.container.v1beta1.ShieldedInstanceConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.ShieldedInstanceConfig other =
        (com.google.container.v1beta1.ShieldedInstanceConfig) obj;

    if (getEnableSecureBoot() != other.getEnableSecureBoot()) return false;
    if (getEnableIntegrityMonitoring() != other.getEnableIntegrityMonitoring()) return false;
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
    hash = (37 * hash) + ENABLE_SECURE_BOOT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableSecureBoot());
    hash = (37 * hash) + ENABLE_INTEGRITY_MONITORING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableIntegrityMonitoring());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.ShieldedInstanceConfig prototype) {
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
   * A set of Shielded Instance options.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.ShieldedInstanceConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.ShieldedInstanceConfig)
      com.google.container.v1beta1.ShieldedInstanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ShieldedInstanceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ShieldedInstanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.ShieldedInstanceConfig.class,
              com.google.container.v1beta1.ShieldedInstanceConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.ShieldedInstanceConfig.newBuilder()
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
      enableSecureBoot_ = false;

      enableIntegrityMonitoring_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ShieldedInstanceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ShieldedInstanceConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.ShieldedInstanceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.ShieldedInstanceConfig build() {
      com.google.container.v1beta1.ShieldedInstanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ShieldedInstanceConfig buildPartial() {
      com.google.container.v1beta1.ShieldedInstanceConfig result =
          new com.google.container.v1beta1.ShieldedInstanceConfig(this);
      result.enableSecureBoot_ = enableSecureBoot_;
      result.enableIntegrityMonitoring_ = enableIntegrityMonitoring_;
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
      if (other instanceof com.google.container.v1beta1.ShieldedInstanceConfig) {
        return mergeFrom((com.google.container.v1beta1.ShieldedInstanceConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.ShieldedInstanceConfig other) {
      if (other == com.google.container.v1beta1.ShieldedInstanceConfig.getDefaultInstance())
        return this;
      if (other.getEnableSecureBoot() != false) {
        setEnableSecureBoot(other.getEnableSecureBoot());
      }
      if (other.getEnableIntegrityMonitoring() != false) {
        setEnableIntegrityMonitoring(other.getEnableIntegrityMonitoring());
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
      com.google.container.v1beta1.ShieldedInstanceConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.container.v1beta1.ShieldedInstanceConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableSecureBoot_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled.
     * Secure Boot helps ensure that the system only runs authentic software by
     * verifying the digital signature of all boot components, and halting the
     * boot process if signature verification fails.
     * </pre>
     *
     * <code>bool enable_secure_boot = 1;</code>
     *
     * @return The enableSecureBoot.
     */
    @java.lang.Override
    public boolean getEnableSecureBoot() {
      return enableSecureBoot_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled.
     * Secure Boot helps ensure that the system only runs authentic software by
     * verifying the digital signature of all boot components, and halting the
     * boot process if signature verification fails.
     * </pre>
     *
     * <code>bool enable_secure_boot = 1;</code>
     *
     * @param value The enableSecureBoot to set.
     * @return This builder for chaining.
     */
    public Builder setEnableSecureBoot(boolean value) {

      enableSecureBoot_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled.
     * Secure Boot helps ensure that the system only runs authentic software by
     * verifying the digital signature of all boot components, and halting the
     * boot process if signature verification fails.
     * </pre>
     *
     * <code>bool enable_secure_boot = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableSecureBoot() {

      enableSecureBoot_ = false;
      onChanged();
      return this;
    }

    private boolean enableIntegrityMonitoring_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled.
     * Enables monitoring and attestation of the boot integrity of the instance.
     * The attestation is performed against the integrity policy baseline. This
     * baseline is initially derived from the implicitly trusted boot image when
     * the instance is created.
     * </pre>
     *
     * <code>bool enable_integrity_monitoring = 2;</code>
     *
     * @return The enableIntegrityMonitoring.
     */
    @java.lang.Override
    public boolean getEnableIntegrityMonitoring() {
      return enableIntegrityMonitoring_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled.
     * Enables monitoring and attestation of the boot integrity of the instance.
     * The attestation is performed against the integrity policy baseline. This
     * baseline is initially derived from the implicitly trusted boot image when
     * the instance is created.
     * </pre>
     *
     * <code>bool enable_integrity_monitoring = 2;</code>
     *
     * @param value The enableIntegrityMonitoring to set.
     * @return This builder for chaining.
     */
    public Builder setEnableIntegrityMonitoring(boolean value) {

      enableIntegrityMonitoring_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled.
     * Enables monitoring and attestation of the boot integrity of the instance.
     * The attestation is performed against the integrity policy baseline. This
     * baseline is initially derived from the implicitly trusted boot image when
     * the instance is created.
     * </pre>
     *
     * <code>bool enable_integrity_monitoring = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableIntegrityMonitoring() {

      enableIntegrityMonitoring_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.ShieldedInstanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.ShieldedInstanceConfig)
  private static final com.google.container.v1beta1.ShieldedInstanceConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.ShieldedInstanceConfig();
  }

  public static com.google.container.v1beta1.ShieldedInstanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShieldedInstanceConfig> PARSER =
      new com.google.protobuf.AbstractParser<ShieldedInstanceConfig>() {
        @java.lang.Override
        public ShieldedInstanceConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ShieldedInstanceConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ShieldedInstanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShieldedInstanceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.ShieldedInstanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
