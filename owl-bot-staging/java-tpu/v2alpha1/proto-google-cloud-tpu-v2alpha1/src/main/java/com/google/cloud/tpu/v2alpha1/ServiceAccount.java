// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

/**
 * <pre>
 * A service account.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.ServiceAccount}
 */
public final class ServiceAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.ServiceAccount)
    ServiceAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServiceAccount.newBuilder() to construct.
  private ServiceAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceAccount() {
    email_ = "";
    scope_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServiceAccount();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_ServiceAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_ServiceAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.ServiceAccount.class, com.google.cloud.tpu.v2alpha1.ServiceAccount.Builder.class);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   * <pre>
   * Email address of the service account. If empty, default Compute service
   * account will be used.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Email address of the service account. If empty, default Compute service
   * account will be used.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList scope_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The list of scopes to be made available for this service account. If empty,
   * access to all Cloud APIs will be allowed.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   * @return A list containing the scope.
   */
  public com.google.protobuf.ProtocolStringList
      getScopeList() {
    return scope_;
  }
  /**
   * <pre>
   * The list of scopes to be made available for this service account. If empty,
   * access to all Cloud APIs will be allowed.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   * @return The count of scope.
   */
  public int getScopeCount() {
    return scope_.size();
  }
  /**
   * <pre>
   * The list of scopes to be made available for this service account. If empty,
   * access to all Cloud APIs will be allowed.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   * @param index The index of the element to return.
   * @return The scope at the given index.
   */
  public java.lang.String getScope(int index) {
    return scope_.get(index);
  }
  /**
   * <pre>
   * The list of scopes to be made available for this service account. If empty,
   * access to all Cloud APIs will be allowed.
   * </pre>
   *
   * <code>repeated string scope = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scope at the given index.
   */
  public com.google.protobuf.ByteString
      getScopeBytes(int index) {
    return scope_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, email_);
    }
    for (int i = 0; i < scope_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scope_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, email_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < scope_.size(); i++) {
        dataSize += computeStringSizeNoTag(scope_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScopeList().size();
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.ServiceAccount)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.ServiceAccount other = (com.google.cloud.tpu.v2alpha1.ServiceAccount) obj;

    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getScopeList()
        .equals(other.getScopeList())) return false;
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
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    if (getScopeCount() > 0) {
      hash = (37 * hash) + SCOPE_FIELD_NUMBER;
      hash = (53 * hash) + getScopeList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.ServiceAccount parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.ServiceAccount prototype) {
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
   * A service account.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.ServiceAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.ServiceAccount)
      com.google.cloud.tpu.v2alpha1.ServiceAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_ServiceAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_ServiceAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.ServiceAccount.class, com.google.cloud.tpu.v2alpha1.ServiceAccount.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.ServiceAccount.newBuilder()
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
      email_ = "";
      scope_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_ServiceAccount_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.ServiceAccount getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.ServiceAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.ServiceAccount build() {
      com.google.cloud.tpu.v2alpha1.ServiceAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.ServiceAccount buildPartial() {
      com.google.cloud.tpu.v2alpha1.ServiceAccount result = new com.google.cloud.tpu.v2alpha1.ServiceAccount(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.ServiceAccount result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.email_ = email_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        scope_.makeImmutable();
        result.scope_ = scope_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tpu.v2alpha1.ServiceAccount) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.ServiceAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.ServiceAccount other) {
      if (other == com.google.cloud.tpu.v2alpha1.ServiceAccount.getDefaultInstance()) return this;
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.scope_.isEmpty()) {
        if (scope_.isEmpty()) {
          scope_ = other.scope_;
          bitField0_ |= 0x00000002;
        } else {
          ensureScopeIsMutable();
          scope_.addAll(other.scope_);
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
            case 10: {
              email_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureScopeIsMutable();
              scope_.add(s);
              break;
            } // case 18
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

    private java.lang.Object email_ = "";
    /**
     * <pre>
     * Email address of the service account. If empty, default Compute service
     * account will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Email address of the service account. If empty, default Compute service
     * account will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Email address of the service account. If empty, default Compute service
     * account will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Email address of the service account. If empty, default Compute service
     * account will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Email address of the service account. If empty, default Compute service
     * account will be used.
     * </pre>
     *
     * <code>string email = 1;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList scope_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureScopeIsMutable() {
      if (!scope_.isModifiable()) {
        scope_ = new com.google.protobuf.LazyStringArrayList(scope_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @return A list containing the scope.
     */
    public com.google.protobuf.ProtocolStringList
        getScopeList() {
      scope_.makeImmutable();
      return scope_;
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @return The count of scope.
     */
    public int getScopeCount() {
      return scope_.size();
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @param index The index of the element to return.
     * @return The scope at the given index.
     */
    public java.lang.String getScope(int index) {
      return scope_.get(index);
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the scope at the given index.
     */
    public com.google.protobuf.ByteString
        getScopeBytes(int index) {
      return scope_.getByteString(index);
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @param index The index to set the value at.
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopeIsMutable();
      scope_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @param value The scope to add.
     * @return This builder for chaining.
     */
    public Builder addScope(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopeIsMutable();
      scope_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @param values The scope to add.
     * @return This builder for chaining.
     */
    public Builder addAllScope(
        java.lang.Iterable<java.lang.String> values) {
      ensureScopeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scope_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      scope_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of scopes to be made available for this service account. If empty,
     * access to all Cloud APIs will be allowed.
     * </pre>
     *
     * <code>repeated string scope = 2;</code>
     * @param value The bytes of the scope to add.
     * @return This builder for chaining.
     */
    public Builder addScopeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureScopeIsMutable();
      scope_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.ServiceAccount)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.ServiceAccount)
  private static final com.google.cloud.tpu.v2alpha1.ServiceAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.ServiceAccount();
  }

  public static com.google.cloud.tpu.v2alpha1.ServiceAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceAccount>
      PARSER = new com.google.protobuf.AbstractParser<ServiceAccount>() {
    @java.lang.Override
    public ServiceAccount parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.ServiceAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

