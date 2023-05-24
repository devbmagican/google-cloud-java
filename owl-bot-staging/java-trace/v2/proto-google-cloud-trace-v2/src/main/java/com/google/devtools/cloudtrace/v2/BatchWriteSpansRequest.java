// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v2/tracing.proto

package com.google.devtools.cloudtrace.v2;

/**
 * <pre>
 * The request message for the `BatchWriteSpans` method.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v2.BatchWriteSpansRequest}
 */
public final class BatchWriteSpansRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
    BatchWriteSpansRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchWriteSpansRequest.newBuilder() to construct.
  private BatchWriteSpansRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchWriteSpansRequest() {
    name_ = "";
    spans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchWriteSpansRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.class, com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The name of the project where the spans belong. The format is
   * `projects/[PROJECT_ID]`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
   * Required. The name of the project where the spans belong. The format is
   * `projects/[PROJECT_ID]`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

  public static final int SPANS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.cloudtrace.v2.Span> spans_;
  /**
   * <pre>
   * Required. A list of new spans. The span names must not match existing
   * spans, otherwise the results are undefined.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.cloudtrace.v2.Span> getSpansList() {
    return spans_;
  }
  /**
   * <pre>
   * Required. A list of new spans. The span names must not match existing
   * spans, otherwise the results are undefined.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.cloudtrace.v2.SpanOrBuilder> 
      getSpansOrBuilderList() {
    return spans_;
  }
  /**
   * <pre>
   * Required. A list of new spans. The span names must not match existing
   * spans, otherwise the results are undefined.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getSpansCount() {
    return spans_.size();
  }
  /**
   * <pre>
   * Required. A list of new spans. The span names must not match existing
   * spans, otherwise the results are undefined.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.Span getSpans(int index) {
    return spans_.get(index);
  }
  /**
   * <pre>
   * Required. A list of new spans. The span names must not match existing
   * spans, otherwise the results are undefined.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.SpanOrBuilder getSpansOrBuilder(
      int index) {
    return spans_.get(index);
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
    for (int i = 0; i < spans_.size(); i++) {
      output.writeMessage(2, spans_.get(i));
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
    for (int i = 0; i < spans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, spans_.get(i));
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest other = (com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getSpansList()
        .equals(other.getSpansList())) return false;
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
    if (getSpansCount() > 0) {
      hash = (37 * hash) + SPANS_FIELD_NUMBER;
      hash = (53 * hash) + getSpansList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest prototype) {
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
   * The request message for the `BatchWriteSpans` method.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v2.BatchWriteSpansRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
      com.google.devtools.cloudtrace.v2.BatchWriteSpansRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.class, com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.newBuilder()
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
      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
      } else {
        spans_ = null;
        spansBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.cloudtrace.v2.TracingProto.internal_static_google_devtools_cloudtrace_v2_BatchWriteSpansRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest build() {
      com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest buildPartial() {
      com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest result = new com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest result) {
      if (spansBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          spans_ = java.util.Collections.unmodifiableList(spans_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.spans_ = spans_;
      } else {
        result.spans_ = spansBuilder_.build();
      }
    }

    private void buildPartial0(com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest) {
        return mergeFrom((com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest other) {
      if (other == com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (spansBuilder_ == null) {
        if (!other.spans_.isEmpty()) {
          if (spans_.isEmpty()) {
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSpansIsMutable();
            spans_.addAll(other.spans_);
          }
          onChanged();
        }
      } else {
        if (!other.spans_.isEmpty()) {
          if (spansBuilder_.isEmpty()) {
            spansBuilder_.dispose();
            spansBuilder_ = null;
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000002);
            spansBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSpansFieldBuilder() : null;
          } else {
            spansBuilder_.addAllMessages(other.spans_);
          }
        }
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
              com.google.devtools.cloudtrace.v2.Span m =
                  input.readMessage(
                      com.google.devtools.cloudtrace.v2.Span.parser(),
                      extensionRegistry);
              if (spansBuilder_ == null) {
                ensureSpansIsMutable();
                spans_.add(m);
              } else {
                spansBuilder_.addMessage(m);
              }
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The name of the project where the spans belong. The format is
     * `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The name of the project where the spans belong. The format is
     * `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The name of the project where the spans belong. The format is
     * `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The name of the project where the spans belong. The format is
     * `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The name of the project where the spans belong. The format is
     * `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

    private java.util.List<com.google.devtools.cloudtrace.v2.Span> spans_ =
      java.util.Collections.emptyList();
    private void ensureSpansIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        spans_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v2.Span>(spans_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.Span, com.google.devtools.cloudtrace.v2.Span.Builder, com.google.devtools.cloudtrace.v2.SpanOrBuilder> spansBuilder_;

    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v2.Span> getSpansList() {
      if (spansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(spans_);
      } else {
        return spansBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getSpansCount() {
      if (spansBuilder_ == null) {
        return spans_.size();
      } else {
        return spansBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.cloudtrace.v2.Span getSpans(int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);
      } else {
        return spansBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSpans(
        int index, com.google.devtools.cloudtrace.v2.Span value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.set(index, value);
        onChanged();
      } else {
        spansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSpans(
        int index, com.google.devtools.cloudtrace.v2.Span.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.set(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addSpans(com.google.devtools.cloudtrace.v2.Span value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(value);
        onChanged();
      } else {
        spansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addSpans(
        int index, com.google.devtools.cloudtrace.v2.Span value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(index, value);
        onChanged();
      } else {
        spansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addSpans(
        com.google.devtools.cloudtrace.v2.Span.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addSpans(
        int index, com.google.devtools.cloudtrace.v2.Span.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllSpans(
        java.lang.Iterable<? extends com.google.devtools.cloudtrace.v2.Span> values) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, spans_);
        onChanged();
      } else {
        spansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSpans() {
      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        spansBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeSpans(int index) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.remove(index);
        onChanged();
      } else {
        spansBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.cloudtrace.v2.Span.Builder getSpansBuilder(
        int index) {
      return getSpansFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.cloudtrace.v2.SpanOrBuilder getSpansOrBuilder(
        int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);  } else {
        return spansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.devtools.cloudtrace.v2.SpanOrBuilder> 
         getSpansOrBuilderList() {
      if (spansBuilder_ != null) {
        return spansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(spans_);
      }
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.cloudtrace.v2.Span.Builder addSpansBuilder() {
      return getSpansFieldBuilder().addBuilder(
          com.google.devtools.cloudtrace.v2.Span.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.cloudtrace.v2.Span.Builder addSpansBuilder(
        int index) {
      return getSpansFieldBuilder().addBuilder(
          index, com.google.devtools.cloudtrace.v2.Span.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of new spans. The span names must not match existing
     * spans, otherwise the results are undefined.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v2.Span spans = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v2.Span.Builder> 
         getSpansBuilderList() {
      return getSpansFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.cloudtrace.v2.Span, com.google.devtools.cloudtrace.v2.Span.Builder, com.google.devtools.cloudtrace.v2.SpanOrBuilder> 
        getSpansFieldBuilder() {
      if (spansBuilder_ == null) {
        spansBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.Span, com.google.devtools.cloudtrace.v2.Span.Builder, com.google.devtools.cloudtrace.v2.SpanOrBuilder>(
                spans_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        spans_ = null;
      }
      return spansBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v2.BatchWriteSpansRequest)
  private static final com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest();
  }

  public static com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchWriteSpansRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchWriteSpansRequest>() {
    @java.lang.Override
    public BatchWriteSpansRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchWriteSpansRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchWriteSpansRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.BatchWriteSpansRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

