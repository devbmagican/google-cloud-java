// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1/resources.proto

package com.google.api.serviceusage.v1;

/**
 * <pre>
 * A service that is available for use by the consumer.
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1.Service}
 */
public final class Service extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1.Service)
    ServiceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Service.newBuilder() to construct.
  private Service(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Service() {
    name_ = "";
    parent_ = "";
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Service();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.serviceusage.v1.ResourcesProto.internal_static_google_api_serviceusage_v1_Service_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1.ResourcesProto.internal_static_google_api_serviceusage_v1_Service_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1.Service.class, com.google.api.serviceusage.v1.Service.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The resource name of the consumer and service.
   *
   * A valid name would be:
   * - projects/123/services/serviceusage.googleapis.com
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the consumer and service.
   *
   * A valid name would be:
   * - projects/123/services/serviceusage.googleapis.com
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * The resource name of the consumer.
   *
   * A valid name would be:
   * - projects/123
   * </pre>
   *
   * <code>string parent = 5;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the consumer.
   *
   * A valid name would be:
   * - projects/123
   * </pre>
   *
   * <code>string parent = 5;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private com.google.api.serviceusage.v1.ServiceConfig config_;
  /**
   * <pre>
   * The service configuration of the available service.
   * Some fields may be filtered out of the configuration in responses to
   * the `ListServices` method. These fields are present only in responses to
   * the `GetService` method.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * The service configuration of the available service.
   * Some fields may be filtered out of the configuration in responses to
   * the `ListServices` method. These fields are present only in responses to
   * the `GetService` method.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
   * @return The config.
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1.ServiceConfig getConfig() {
    return config_ == null ? com.google.api.serviceusage.v1.ServiceConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * The service configuration of the available service.
   * Some fields may be filtered out of the configuration in responses to
   * the `ListServices` method. These fields are present only in responses to
   * the `GetService` method.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1.ServiceConfigOrBuilder getConfigOrBuilder() {
    return config_ == null ? com.google.api.serviceusage.v1.ServiceConfig.getDefaultInstance() : config_;
  }

  public static final int STATE_FIELD_NUMBER = 4;
  private int state_ = 0;
  /**
   * <pre>
   * Whether or not the service has been enabled for use by the consumer.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.State state = 4;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Whether or not the service has been enabled for use by the consumer.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1.State state = 4;</code>
   * @return The state.
   */
  @java.lang.Override public com.google.api.serviceusage.v1.State getState() {
    com.google.api.serviceusage.v1.State result = com.google.api.serviceusage.v1.State.forNumber(state_);
    return result == null ? com.google.api.serviceusage.v1.State.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    if (state_ != com.google.api.serviceusage.v1.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, parent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
    }
    if (state_ != com.google.api.serviceusage.v1.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, parent_);
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
    if (!(obj instanceof com.google.api.serviceusage.v1.Service)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1.Service other = (com.google.api.serviceusage.v1.Service) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
    }
    if (state_ != other.state_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1.Service parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1.Service parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1.Service parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.serviceusage.v1.Service parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.serviceusage.v1.Service prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A service that is available for use by the consumer.
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1.Service}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1.Service)
      com.google.api.serviceusage.v1.ServiceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.serviceusage.v1.ResourcesProto.internal_static_google_api_serviceusage_v1_Service_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1.ResourcesProto.internal_static_google_api_serviceusage_v1_Service_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1.Service.class, com.google.api.serviceusage.v1.Service.Builder.class);
    }

    // Construct using com.google.api.serviceusage.v1.Service.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      parent_ = "";
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.serviceusage.v1.ResourcesProto.internal_static_google_api_serviceusage_v1_Service_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.Service getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1.Service.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.Service build() {
      com.google.api.serviceusage.v1.Service result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1.Service buildPartial() {
      com.google.api.serviceusage.v1.Service result = new com.google.api.serviceusage.v1.Service(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.serviceusage.v1.Service result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.config_ = configBuilder_ == null
            ? config_
            : configBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.state_ = state_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.serviceusage.v1.Service) {
        return mergeFrom((com.google.api.serviceusage.v1.Service)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.serviceusage.v1.Service other) {
      if (other == com.google.api.serviceusage.v1.Service.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
            case 10: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 18
            case 32: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
            default: {
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The resource name of the consumer and service.
     *
     * A valid name would be:
     * - projects/123/services/serviceusage.googleapis.com
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the consumer and service.
     *
     * A valid name would be:
     * - projects/123/services/serviceusage.googleapis.com
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the consumer and service.
     *
     * A valid name would be:
     * - projects/123/services/serviceusage.googleapis.com
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the consumer and service.
     *
     * A valid name would be:
     * - projects/123/services/serviceusage.googleapis.com
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the consumer and service.
     *
     * A valid name would be:
     * - projects/123/services/serviceusage.googleapis.com
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The resource name of the consumer.
     *
     * A valid name would be:
     * - projects/123
     * </pre>
     *
     * <code>string parent = 5;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the consumer.
     *
     * A valid name would be:
     * - projects/123
     * </pre>
     *
     * <code>string parent = 5;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the consumer.
     *
     * A valid name would be:
     * - projects/123
     * </pre>
     *
     * <code>string parent = 5;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the consumer.
     *
     * A valid name would be:
     * - projects/123
     * </pre>
     *
     * <code>string parent = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the consumer.
     *
     * A valid name would be:
     * - projects/123
     * </pre>
     *
     * <code>string parent = 5;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.api.serviceusage.v1.ServiceConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.serviceusage.v1.ServiceConfig, com.google.api.serviceusage.v1.ServiceConfig.Builder, com.google.api.serviceusage.v1.ServiceConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     * @return The config.
     */
    public com.google.api.serviceusage.v1.ServiceConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.google.api.serviceusage.v1.ServiceConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     */
    public Builder setConfig(com.google.api.serviceusage.v1.ServiceConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
      } else {
        configBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     */
    public Builder setConfig(
        com.google.api.serviceusage.v1.ServiceConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     */
    public Builder mergeConfig(com.google.api.serviceusage.v1.ServiceConfig value) {
      if (configBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          config_ != null &&
          config_ != com.google.api.serviceusage.v1.ServiceConfig.getDefaultInstance()) {
          getConfigBuilder().mergeFrom(value);
        } else {
          config_ = value;
        }
      } else {
        configBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     */
    public Builder clearConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     */
    public com.google.api.serviceusage.v1.ServiceConfig.Builder getConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     */
    public com.google.api.serviceusage.v1.ServiceConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.google.api.serviceusage.v1.ServiceConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * The service configuration of the available service.
     * Some fields may be filtered out of the configuration in responses to
     * the `ListServices` method. These fields are present only in responses to
     * the `GetService` method.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.ServiceConfig config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.serviceusage.v1.ServiceConfig, com.google.api.serviceusage.v1.ServiceConfig.Builder, com.google.api.serviceusage.v1.ServiceConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.serviceusage.v1.ServiceConfig, com.google.api.serviceusage.v1.ServiceConfig.Builder, com.google.api.serviceusage.v1.ServiceConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private int state_ = 0;
    /**
     * <pre>
     * Whether or not the service has been enabled for use by the consumer.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.State state = 4;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Whether or not the service has been enabled for use by the consumer.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.State state = 4;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not the service has been enabled for use by the consumer.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.State state = 4;</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.api.serviceusage.v1.State getState() {
      com.google.api.serviceusage.v1.State result = com.google.api.serviceusage.v1.State.forNumber(state_);
      return result == null ? com.google.api.serviceusage.v1.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Whether or not the service has been enabled for use by the consumer.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.State state = 4;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.api.serviceusage.v1.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not the service has been enabled for use by the consumer.
     * </pre>
     *
     * <code>.google.api.serviceusage.v1.State state = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000008);
      state_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1.Service)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1.Service)
  private static final com.google.api.serviceusage.v1.Service DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1.Service();
  }

  public static com.google.api.serviceusage.v1.Service getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Service>
      PARSER = new com.google.protobuf.AbstractParser<Service>() {
    @java.lang.Override
    public Service parsePartialFrom(
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

  public static com.google.protobuf.Parser<Service> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Service> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1.Service getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

