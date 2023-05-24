// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/histogram.proto

package com.google.cloud.talent.v4;

/**
 * <pre>
 * The histogram request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.HistogramQuery}
 */
public final class HistogramQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.HistogramQuery)
    HistogramQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistogramQuery.newBuilder() to construct.
  private HistogramQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistogramQuery() {
    histogramQuery_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistogramQuery();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.talent.v4.HistogramProto.internal_static_google_cloud_talent_v4_HistogramQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.HistogramProto.internal_static_google_cloud_talent_v4_HistogramQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.HistogramQuery.class, com.google.cloud.talent.v4.HistogramQuery.Builder.class);
  }

  public static final int HISTOGRAM_QUERY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object histogramQuery_ = "";
  /**
   * <pre>
   * An expression specifies a histogram request against matching jobs for
   * searches.
   *
   * See
   * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4.SearchJobsRequest.histogram_queries]
   * for details about syntax.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   * @return The histogramQuery.
   */
  @java.lang.Override
  public java.lang.String getHistogramQuery() {
    java.lang.Object ref = histogramQuery_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      histogramQuery_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An expression specifies a histogram request against matching jobs for
   * searches.
   *
   * See
   * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4.SearchJobsRequest.histogram_queries]
   * for details about syntax.
   * </pre>
   *
   * <code>string histogram_query = 1;</code>
   * @return The bytes for histogramQuery.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHistogramQueryBytes() {
    java.lang.Object ref = histogramQuery_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      histogramQuery_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(histogramQuery_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, histogramQuery_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(histogramQuery_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, histogramQuery_);
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
    if (!(obj instanceof com.google.cloud.talent.v4.HistogramQuery)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.HistogramQuery other = (com.google.cloud.talent.v4.HistogramQuery) obj;

    if (!getHistogramQuery()
        .equals(other.getHistogramQuery())) return false;
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
    hash = (37 * hash) + HISTOGRAM_QUERY_FIELD_NUMBER;
    hash = (53 * hash) + getHistogramQuery().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.HistogramQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.HistogramQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.HistogramQuery parseFrom(
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
  public static Builder newBuilder(com.google.cloud.talent.v4.HistogramQuery prototype) {
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
   * The histogram request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.HistogramQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.HistogramQuery)
      com.google.cloud.talent.v4.HistogramQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4.HistogramProto.internal_static_google_cloud_talent_v4_HistogramQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.HistogramProto.internal_static_google_cloud_talent_v4_HistogramQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.HistogramQuery.class, com.google.cloud.talent.v4.HistogramQuery.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.HistogramQuery.newBuilder()
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
      histogramQuery_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4.HistogramProto.internal_static_google_cloud_talent_v4_HistogramQuery_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.HistogramQuery getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.HistogramQuery.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.HistogramQuery build() {
      com.google.cloud.talent.v4.HistogramQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.HistogramQuery buildPartial() {
      com.google.cloud.talent.v4.HistogramQuery result = new com.google.cloud.talent.v4.HistogramQuery(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.talent.v4.HistogramQuery result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.histogramQuery_ = histogramQuery_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4.HistogramQuery) {
        return mergeFrom((com.google.cloud.talent.v4.HistogramQuery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.HistogramQuery other) {
      if (other == com.google.cloud.talent.v4.HistogramQuery.getDefaultInstance()) return this;
      if (!other.getHistogramQuery().isEmpty()) {
        histogramQuery_ = other.histogramQuery_;
        bitField0_ |= 0x00000001;
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
              histogramQuery_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object histogramQuery_ = "";
    /**
     * <pre>
     * An expression specifies a histogram request against matching jobs for
     * searches.
     *
     * See
     * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4.SearchJobsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @return The histogramQuery.
     */
    public java.lang.String getHistogramQuery() {
      java.lang.Object ref = histogramQuery_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        histogramQuery_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching jobs for
     * searches.
     *
     * See
     * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4.SearchJobsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @return The bytes for histogramQuery.
     */
    public com.google.protobuf.ByteString
        getHistogramQueryBytes() {
      java.lang.Object ref = histogramQuery_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        histogramQuery_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching jobs for
     * searches.
     *
     * See
     * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4.SearchJobsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @param value The histogramQuery to set.
     * @return This builder for chaining.
     */
    public Builder setHistogramQuery(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      histogramQuery_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching jobs for
     * searches.
     *
     * See
     * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4.SearchJobsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHistogramQuery() {
      histogramQuery_ = getDefaultInstance().getHistogramQuery();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An expression specifies a histogram request against matching jobs for
     * searches.
     *
     * See
     * [SearchJobsRequest.histogram_queries][google.cloud.talent.v4.SearchJobsRequest.histogram_queries]
     * for details about syntax.
     * </pre>
     *
     * <code>string histogram_query = 1;</code>
     * @param value The bytes for histogramQuery to set.
     * @return This builder for chaining.
     */
    public Builder setHistogramQueryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      histogramQuery_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.HistogramQuery)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.HistogramQuery)
  private static final com.google.cloud.talent.v4.HistogramQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.HistogramQuery();
  }

  public static com.google.cloud.talent.v4.HistogramQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistogramQuery>
      PARSER = new com.google.protobuf.AbstractParser<HistogramQuery>() {
    @java.lang.Override
    public HistogramQuery parsePartialFrom(
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

  public static com.google.protobuf.Parser<HistogramQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistogramQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.HistogramQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

