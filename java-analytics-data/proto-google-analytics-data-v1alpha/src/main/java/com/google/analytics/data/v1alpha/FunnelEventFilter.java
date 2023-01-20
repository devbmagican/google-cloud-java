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
 * Creates a filter that matches events of a single event name. If a parameter
 * filter expression is specified, only the subset of events that match both the
 * single event name and the parameter filter expressions match this event
 * filter.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.FunnelEventFilter}
 */
public final class FunnelEventFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.FunnelEventFilter)
    FunnelEventFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FunnelEventFilter.newBuilder() to construct.
  private FunnelEventFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FunnelEventFilter() {
    eventName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FunnelEventFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_FunnelEventFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_FunnelEventFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.FunnelEventFilter.class,
            com.google.analytics.data.v1alpha.FunnelEventFilter.Builder.class);
  }

  private int bitField0_;
  public static final int EVENT_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object eventName_ = "";
  /**
   *
   *
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   *
   * @return Whether the eventName field is set.
   */
  @java.lang.Override
  public boolean hasEventName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   *
   * @return The eventName.
   */
  @java.lang.Override
  public java.lang.String getEventName() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * This filter matches events of this single event name. Event name is
   * required.
   * </pre>
   *
   * <code>optional string event_name = 1;</code>
   *
   * @return The bytes for eventName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEventNameBytes() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      eventName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUNNEL_PARAMETER_FILTER_EXPRESSION_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.FunnelParameterFilterExpression
      funnelParameterFilterExpression_;
  /**
   *
   *
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>
   * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
   * </code>
   *
   * @return Whether the funnelParameterFilterExpression field is set.
   */
  @java.lang.Override
  public boolean hasFunnelParameterFilterExpression() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>
   * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
   * </code>
   *
   * @return The funnelParameterFilterExpression.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FunnelParameterFilterExpression
      getFunnelParameterFilterExpression() {
    return funnelParameterFilterExpression_ == null
        ? com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.getDefaultInstance()
        : funnelParameterFilterExpression_;
  }
  /**
   *
   *
   * <pre>
   * If specified, this filter matches events that match both the single event
   * name and the parameter filter expressions.
   * Inside the parameter filter expression, only parameter filters are
   * available.
   * </pre>
   *
   * <code>
   * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder
      getFunnelParameterFilterExpressionOrBuilder() {
    return funnelParameterFilterExpression_ == null
        ? com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.getDefaultInstance()
        : funnelParameterFilterExpression_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getFunnelParameterFilterExpression());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getFunnelParameterFilterExpression());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.FunnelEventFilter)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.FunnelEventFilter other =
        (com.google.analytics.data.v1alpha.FunnelEventFilter) obj;

    if (hasEventName() != other.hasEventName()) return false;
    if (hasEventName()) {
      if (!getEventName().equals(other.getEventName())) return false;
    }
    if (hasFunnelParameterFilterExpression() != other.hasFunnelParameterFilterExpression())
      return false;
    if (hasFunnelParameterFilterExpression()) {
      if (!getFunnelParameterFilterExpression().equals(other.getFunnelParameterFilterExpression()))
        return false;
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
    if (hasEventName()) {
      hash = (37 * hash) + EVENT_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getEventName().hashCode();
    }
    if (hasFunnelParameterFilterExpression()) {
      hash = (37 * hash) + FUNNEL_PARAMETER_FILTER_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getFunnelParameterFilterExpression().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.FunnelEventFilter prototype) {
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
   * Creates a filter that matches events of a single event name. If a parameter
   * filter expression is specified, only the subset of events that match both the
   * single event name and the parameter filter expressions match this event
   * filter.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.FunnelEventFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.FunnelEventFilter)
      com.google.analytics.data.v1alpha.FunnelEventFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FunnelEventFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FunnelEventFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.FunnelEventFilter.class,
              com.google.analytics.data.v1alpha.FunnelEventFilter.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.FunnelEventFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFunnelParameterFilterExpressionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eventName_ = "";
      funnelParameterFilterExpression_ = null;
      if (funnelParameterFilterExpressionBuilder_ != null) {
        funnelParameterFilterExpressionBuilder_.dispose();
        funnelParameterFilterExpressionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FunnelEventFilter_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FunnelEventFilter getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.FunnelEventFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FunnelEventFilter build() {
      com.google.analytics.data.v1alpha.FunnelEventFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FunnelEventFilter buildPartial() {
      com.google.analytics.data.v1alpha.FunnelEventFilter result =
          new com.google.analytics.data.v1alpha.FunnelEventFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.FunnelEventFilter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventName_ = eventName_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.funnelParameterFilterExpression_ =
            funnelParameterFilterExpressionBuilder_ == null
                ? funnelParameterFilterExpression_
                : funnelParameterFilterExpressionBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.FunnelEventFilter) {
        return mergeFrom((com.google.analytics.data.v1alpha.FunnelEventFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.FunnelEventFilter other) {
      if (other == com.google.analytics.data.v1alpha.FunnelEventFilter.getDefaultInstance())
        return this;
      if (other.hasEventName()) {
        eventName_ = other.eventName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasFunnelParameterFilterExpression()) {
        mergeFunnelParameterFilterExpression(other.getFunnelParameterFilterExpression());
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
                eventName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getFunnelParameterFilterExpressionFieldBuilder().getBuilder(),
                    extensionRegistry);
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

    private java.lang.Object eventName_ = "";
    /**
     *
     *
     * <pre>
     * This filter matches events of this single event name. Event name is
     * required.
     * </pre>
     *
     * <code>optional string event_name = 1;</code>
     *
     * @return Whether the eventName field is set.
     */
    public boolean hasEventName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * This filter matches events of this single event name. Event name is
     * required.
     * </pre>
     *
     * <code>optional string event_name = 1;</code>
     *
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This filter matches events of this single event name. Event name is
     * required.
     * </pre>
     *
     * <code>optional string event_name = 1;</code>
     *
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This filter matches events of this single event name. Event name is
     * required.
     * </pre>
     *
     * <code>optional string event_name = 1;</code>
     *
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This filter matches events of this single event name. Event name is
     * required.
     * </pre>
     *
     * <code>optional string event_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      eventName_ = getDefaultInstance().getEventName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This filter matches events of this single event name. Event name is
     * required.
     * </pre>
     *
     * <code>optional string event_name = 1;</code>
     *
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.FunnelParameterFilterExpression
        funnelParameterFilterExpression_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FunnelParameterFilterExpression,
            com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.Builder,
            com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder>
        funnelParameterFilterExpressionBuilder_;
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     *
     * @return Whether the funnelParameterFilterExpression field is set.
     */
    public boolean hasFunnelParameterFilterExpression() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     *
     * @return The funnelParameterFilterExpression.
     */
    public com.google.analytics.data.v1alpha.FunnelParameterFilterExpression
        getFunnelParameterFilterExpression() {
      if (funnelParameterFilterExpressionBuilder_ == null) {
        return funnelParameterFilterExpression_ == null
            ? com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.getDefaultInstance()
            : funnelParameterFilterExpression_;
      } else {
        return funnelParameterFilterExpressionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     */
    public Builder setFunnelParameterFilterExpression(
        com.google.analytics.data.v1alpha.FunnelParameterFilterExpression value) {
      if (funnelParameterFilterExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        funnelParameterFilterExpression_ = value;
      } else {
        funnelParameterFilterExpressionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     */
    public Builder setFunnelParameterFilterExpression(
        com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.Builder builderForValue) {
      if (funnelParameterFilterExpressionBuilder_ == null) {
        funnelParameterFilterExpression_ = builderForValue.build();
      } else {
        funnelParameterFilterExpressionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     */
    public Builder mergeFunnelParameterFilterExpression(
        com.google.analytics.data.v1alpha.FunnelParameterFilterExpression value) {
      if (funnelParameterFilterExpressionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && funnelParameterFilterExpression_ != null
            && funnelParameterFilterExpression_
                != com.google.analytics.data.v1alpha.FunnelParameterFilterExpression
                    .getDefaultInstance()) {
          getFunnelParameterFilterExpressionBuilder().mergeFrom(value);
        } else {
          funnelParameterFilterExpression_ = value;
        }
      } else {
        funnelParameterFilterExpressionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     */
    public Builder clearFunnelParameterFilterExpression() {
      bitField0_ = (bitField0_ & ~0x00000002);
      funnelParameterFilterExpression_ = null;
      if (funnelParameterFilterExpressionBuilder_ != null) {
        funnelParameterFilterExpressionBuilder_.dispose();
        funnelParameterFilterExpressionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.Builder
        getFunnelParameterFilterExpressionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFunnelParameterFilterExpressionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder
        getFunnelParameterFilterExpressionOrBuilder() {
      if (funnelParameterFilterExpressionBuilder_ != null) {
        return funnelParameterFilterExpressionBuilder_.getMessageOrBuilder();
      } else {
        return funnelParameterFilterExpression_ == null
            ? com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.getDefaultInstance()
            : funnelParameterFilterExpression_;
      }
    }
    /**
     *
     *
     * <pre>
     * If specified, this filter matches events that match both the single event
     * name and the parameter filter expressions.
     * Inside the parameter filter expression, only parameter filters are
     * available.
     * </pre>
     *
     * <code>
     * optional .google.analytics.data.v1alpha.FunnelParameterFilterExpression funnel_parameter_filter_expression = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.FunnelParameterFilterExpression,
            com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.Builder,
            com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder>
        getFunnelParameterFilterExpressionFieldBuilder() {
      if (funnelParameterFilterExpressionBuilder_ == null) {
        funnelParameterFilterExpressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.FunnelParameterFilterExpression,
                com.google.analytics.data.v1alpha.FunnelParameterFilterExpression.Builder,
                com.google.analytics.data.v1alpha.FunnelParameterFilterExpressionOrBuilder>(
                getFunnelParameterFilterExpression(), getParentForChildren(), isClean());
        funnelParameterFilterExpression_ = null;
      }
      return funnelParameterFilterExpressionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.FunnelEventFilter)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.FunnelEventFilter)
  private static final com.google.analytics.data.v1alpha.FunnelEventFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.FunnelEventFilter();
  }

  public static com.google.analytics.data.v1alpha.FunnelEventFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunnelEventFilter> PARSER =
      new com.google.protobuf.AbstractParser<FunnelEventFilter>() {
        @java.lang.Override
        public FunnelEventFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<FunnelEventFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunnelEventFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.FunnelEventFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
