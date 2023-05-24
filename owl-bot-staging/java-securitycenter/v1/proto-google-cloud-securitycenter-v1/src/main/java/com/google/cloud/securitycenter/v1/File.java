// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/file.proto

package com.google.cloud.securitycenter.v1;

/**
 * <pre>
 * File information about the related binary/library used by an executable, or
 * the script used by a script interpreter
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.File}
 */
public final class File extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.File)
    FileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use File.newBuilder() to construct.
  private File(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private File() {
    path_ = "";
    sha256_ = "";
    contents_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new File();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.securitycenter.v1.FileProto.internal_static_google_cloud_securitycenter_v1_File_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.FileProto.internal_static_google_cloud_securitycenter_v1_File_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.File.class, com.google.cloud.securitycenter.v1.File.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <pre>
   * Absolute path of the file as a JSON encoded string.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Absolute path of the file as a JSON encoded string.
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private long size_ = 0L;
  /**
   * <pre>
   * Size of the file in bytes.
   * </pre>
   *
   * <code>int64 size = 2;</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }

  public static final int SHA256_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sha256_ = "";
  /**
   * <pre>
   * SHA256 hash of the first hashed_size bytes of the file encoded as a
   * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
   * of the entire file.
   * </pre>
   *
   * <code>string sha256 = 3;</code>
   * @return The sha256.
   */
  @java.lang.Override
  public java.lang.String getSha256() {
    java.lang.Object ref = sha256_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sha256_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * SHA256 hash of the first hashed_size bytes of the file encoded as a
   * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
   * of the entire file.
   * </pre>
   *
   * <code>string sha256 = 3;</code>
   * @return The bytes for sha256.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSha256Bytes() {
    java.lang.Object ref = sha256_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sha256_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASHED_SIZE_FIELD_NUMBER = 4;
  private long hashedSize_ = 0L;
  /**
   * <pre>
   * The length in bytes of the file prefix that was hashed.  If
   * hashed_size == size, any hashes reported represent the entire
   * file.
   * </pre>
   *
   * <code>int64 hashed_size = 4;</code>
   * @return The hashedSize.
   */
  @java.lang.Override
  public long getHashedSize() {
    return hashedSize_;
  }

  public static final int PARTIALLY_HASHED_FIELD_NUMBER = 5;
  private boolean partiallyHashed_ = false;
  /**
   * <pre>
   * True when the hash covers only a prefix of the file.
   * </pre>
   *
   * <code>bool partially_hashed = 5;</code>
   * @return The partiallyHashed.
   */
  @java.lang.Override
  public boolean getPartiallyHashed() {
    return partiallyHashed_;
  }

  public static final int CONTENTS_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object contents_ = "";
  /**
   * <pre>
   * Prefix of the file contents as a JSON encoded string.
   * (Currently only populated for Malicious Script Executed findings.)
   * </pre>
   *
   * <code>string contents = 6;</code>
   * @return The contents.
   */
  @java.lang.Override
  public java.lang.String getContents() {
    java.lang.Object ref = contents_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contents_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Prefix of the file contents as a JSON encoded string.
   * (Currently only populated for Malicious Script Executed findings.)
   * </pre>
   *
   * <code>string contents = 6;</code>
   * @return The bytes for contents.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentsBytes() {
    java.lang.Object ref = contents_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contents_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (size_ != 0L) {
      output.writeInt64(2, size_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha256_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sha256_);
    }
    if (hashedSize_ != 0L) {
      output.writeInt64(4, hashedSize_);
    }
    if (partiallyHashed_ != false) {
      output.writeBool(5, partiallyHashed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contents_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, contents_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, size_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha256_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sha256_);
    }
    if (hashedSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, hashedSize_);
    }
    if (partiallyHashed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, partiallyHashed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contents_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, contents_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.File)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.File other = (com.google.cloud.securitycenter.v1.File) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (getSize()
        != other.getSize()) return false;
    if (!getSha256()
        .equals(other.getSha256())) return false;
    if (getHashedSize()
        != other.getHashedSize()) return false;
    if (getPartiallyHashed()
        != other.getPartiallyHashed()) return false;
    if (!getContents()
        .equals(other.getContents())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    hash = (37 * hash) + SHA256_FIELD_NUMBER;
    hash = (53 * hash) + getSha256().hashCode();
    hash = (37 * hash) + HASHED_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHashedSize());
    hash = (37 * hash) + PARTIALLY_HASHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPartiallyHashed());
    hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
    hash = (53 * hash) + getContents().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.File parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.File parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.File parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.securitycenter.v1.File parseFrom(
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
  public static Builder newBuilder(com.google.cloud.securitycenter.v1.File prototype) {
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
   * File information about the related binary/library used by an executable, or
   * the script used by a script interpreter
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.File}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.File)
      com.google.cloud.securitycenter.v1.FileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.securitycenter.v1.FileProto.internal_static_google_cloud_securitycenter_v1_File_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.FileProto.internal_static_google_cloud_securitycenter_v1_File_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.File.class, com.google.cloud.securitycenter.v1.File.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.File.newBuilder()
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
      path_ = "";
      size_ = 0L;
      sha256_ = "";
      hashedSize_ = 0L;
      partiallyHashed_ = false;
      contents_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.FileProto.internal_static_google_cloud_securitycenter_v1_File_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.File getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.File.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.File build() {
      com.google.cloud.securitycenter.v1.File result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.File buildPartial() {
      com.google.cloud.securitycenter.v1.File result = new com.google.cloud.securitycenter.v1.File(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.File result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.path_ = path_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.size_ = size_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sha256_ = sha256_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.hashedSize_ = hashedSize_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.partiallyHashed_ = partiallyHashed_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.contents_ = contents_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1.File) {
        return mergeFrom((com.google.cloud.securitycenter.v1.File)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.File other) {
      if (other == com.google.cloud.securitycenter.v1.File.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (!other.getSha256().isEmpty()) {
        sha256_ = other.sha256_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getHashedSize() != 0L) {
        setHashedSize(other.getHashedSize());
      }
      if (other.getPartiallyHashed() != false) {
        setPartiallyHashed(other.getPartiallyHashed());
      }
      if (!other.getContents().isEmpty()) {
        contents_ = other.contents_;
        bitField0_ |= 0x00000020;
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
              path_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              size_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              sha256_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              hashedSize_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              partiallyHashed_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              contents_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Absolute path of the file as a JSON encoded string.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Absolute path of the file as a JSON encoded string.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Absolute path of the file as a JSON encoded string.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Absolute path of the file as a JSON encoded string.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Absolute path of the file as a JSON encoded string.
     * </pre>
     *
     * <code>string path = 1;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long size_ ;
    /**
     * <pre>
     * Size of the file in bytes.
     * </pre>
     *
     * <code>int64 size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <pre>
     * Size of the file in bytes.
     * </pre>
     *
     * <code>int64 size = 2;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {

      size_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Size of the file in bytes.
     * </pre>
     *
     * <code>int64 size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      size_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object sha256_ = "";
    /**
     * <pre>
     * SHA256 hash of the first hashed_size bytes of the file encoded as a
     * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
     * of the entire file.
     * </pre>
     *
     * <code>string sha256 = 3;</code>
     * @return The sha256.
     */
    public java.lang.String getSha256() {
      java.lang.Object ref = sha256_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sha256_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * SHA256 hash of the first hashed_size bytes of the file encoded as a
     * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
     * of the entire file.
     * </pre>
     *
     * <code>string sha256 = 3;</code>
     * @return The bytes for sha256.
     */
    public com.google.protobuf.ByteString
        getSha256Bytes() {
      java.lang.Object ref = sha256_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sha256_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * SHA256 hash of the first hashed_size bytes of the file encoded as a
     * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
     * of the entire file.
     * </pre>
     *
     * <code>string sha256 = 3;</code>
     * @param value The sha256 to set.
     * @return This builder for chaining.
     */
    public Builder setSha256(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sha256_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SHA256 hash of the first hashed_size bytes of the file encoded as a
     * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
     * of the entire file.
     * </pre>
     *
     * <code>string sha256 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSha256() {
      sha256_ = getDefaultInstance().getSha256();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * SHA256 hash of the first hashed_size bytes of the file encoded as a
     * hex string.  If hashed_size == size, sha256 represents the SHA256 hash
     * of the entire file.
     * </pre>
     *
     * <code>string sha256 = 3;</code>
     * @param value The bytes for sha256 to set.
     * @return This builder for chaining.
     */
    public Builder setSha256Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sha256_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long hashedSize_ ;
    /**
     * <pre>
     * The length in bytes of the file prefix that was hashed.  If
     * hashed_size == size, any hashes reported represent the entire
     * file.
     * </pre>
     *
     * <code>int64 hashed_size = 4;</code>
     * @return The hashedSize.
     */
    @java.lang.Override
    public long getHashedSize() {
      return hashedSize_;
    }
    /**
     * <pre>
     * The length in bytes of the file prefix that was hashed.  If
     * hashed_size == size, any hashes reported represent the entire
     * file.
     * </pre>
     *
     * <code>int64 hashed_size = 4;</code>
     * @param value The hashedSize to set.
     * @return This builder for chaining.
     */
    public Builder setHashedSize(long value) {

      hashedSize_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The length in bytes of the file prefix that was hashed.  If
     * hashed_size == size, any hashes reported represent the entire
     * file.
     * </pre>
     *
     * <code>int64 hashed_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHashedSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      hashedSize_ = 0L;
      onChanged();
      return this;
    }

    private boolean partiallyHashed_ ;
    /**
     * <pre>
     * True when the hash covers only a prefix of the file.
     * </pre>
     *
     * <code>bool partially_hashed = 5;</code>
     * @return The partiallyHashed.
     */
    @java.lang.Override
    public boolean getPartiallyHashed() {
      return partiallyHashed_;
    }
    /**
     * <pre>
     * True when the hash covers only a prefix of the file.
     * </pre>
     *
     * <code>bool partially_hashed = 5;</code>
     * @param value The partiallyHashed to set.
     * @return This builder for chaining.
     */
    public Builder setPartiallyHashed(boolean value) {

      partiallyHashed_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True when the hash covers only a prefix of the file.
     * </pre>
     *
     * <code>bool partially_hashed = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartiallyHashed() {
      bitField0_ = (bitField0_ & ~0x00000010);
      partiallyHashed_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object contents_ = "";
    /**
     * <pre>
     * Prefix of the file contents as a JSON encoded string.
     * (Currently only populated for Malicious Script Executed findings.)
     * </pre>
     *
     * <code>string contents = 6;</code>
     * @return The contents.
     */
    public java.lang.String getContents() {
      java.lang.Object ref = contents_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contents_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Prefix of the file contents as a JSON encoded string.
     * (Currently only populated for Malicious Script Executed findings.)
     * </pre>
     *
     * <code>string contents = 6;</code>
     * @return The bytes for contents.
     */
    public com.google.protobuf.ByteString
        getContentsBytes() {
      java.lang.Object ref = contents_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contents_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Prefix of the file contents as a JSON encoded string.
     * (Currently only populated for Malicious Script Executed findings.)
     * </pre>
     *
     * <code>string contents = 6;</code>
     * @param value The contents to set.
     * @return This builder for chaining.
     */
    public Builder setContents(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      contents_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Prefix of the file contents as a JSON encoded string.
     * (Currently only populated for Malicious Script Executed findings.)
     * </pre>
     *
     * <code>string contents = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearContents() {
      contents_ = getDefaultInstance().getContents();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Prefix of the file contents as a JSON encoded string.
     * (Currently only populated for Malicious Script Executed findings.)
     * </pre>
     *
     * <code>string contents = 6;</code>
     * @param value The bytes for contents to set.
     * @return This builder for chaining.
     */
    public Builder setContentsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      contents_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.File)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.File)
  private static final com.google.cloud.securitycenter.v1.File DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.File();
  }

  public static com.google.cloud.securitycenter.v1.File getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<File>
      PARSER = new com.google.protobuf.AbstractParser<File>() {
    @java.lang.Override
    public File parsePartialFrom(
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

  public static com.google.protobuf.Parser<File> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<File> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.File getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

