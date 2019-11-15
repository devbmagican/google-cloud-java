/*
 * Copyright 2019 Google LLC
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
// source: google/monitoring/v3/metric.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * A single data point in a time series.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.Point}
 */
public final class Point extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.Point)
    PointOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Point.newBuilder() to construct.
  private Point(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Point() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Point(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              com.google.monitoring.v3.TimeInterval.Builder subBuilder = null;
              if (interval_ != null) {
                subBuilder = interval_.toBuilder();
              }
              interval_ =
                  input.readMessage(
                      com.google.monitoring.v3.TimeInterval.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(interval_);
                interval_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.monitoring.v3.TypedValue.Builder subBuilder = null;
              if (value_ != null) {
                subBuilder = value_.toBuilder();
              }
              value_ =
                  input.readMessage(
                      com.google.monitoring.v3.TypedValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }

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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.MetricProto
        .internal_static_google_monitoring_v3_Point_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricProto
        .internal_static_google_monitoring_v3_Point_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.Point.class, com.google.monitoring.v3.Point.Builder.class);
  }

  public static final int INTERVAL_FIELD_NUMBER = 1;
  private com.google.monitoring.v3.TimeInterval interval_;
  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time is optional, but if it is supplied, it must equal the
   * end time.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   */
  public boolean hasInterval() {
    return interval_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time is optional, but if it is supplied, it must equal the
   * end time.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   */
  public com.google.monitoring.v3.TimeInterval getInterval() {
    return interval_ == null
        ? com.google.monitoring.v3.TimeInterval.getDefaultInstance()
        : interval_;
  }
  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time is optional, but if it is supplied, it must equal the
   * end time.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   */
  public com.google.monitoring.v3.TimeIntervalOrBuilder getIntervalOrBuilder() {
    return getInterval();
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.TypedValue value_;
  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   */
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   */
  public com.google.monitoring.v3.TypedValue getValue() {
    return value_ == null ? com.google.monitoring.v3.TypedValue.getDefaultInstance() : value_;
  }
  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   */
  public com.google.monitoring.v3.TypedValueOrBuilder getValueOrBuilder() {
    return getValue();
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
    if (interval_ != null) {
      output.writeMessage(1, getInterval());
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (interval_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInterval());
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getValue());
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
    if (!(obj instanceof com.google.monitoring.v3.Point)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.Point other = (com.google.monitoring.v3.Point) obj;

    if (hasInterval() != other.hasInterval()) return false;
    if (hasInterval()) {
      if (!getInterval().equals(other.getInterval())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue().equals(other.getValue())) return false;
    }
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
    if (hasInterval()) {
      hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getInterval().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.Point parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.Point parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.Point parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.Point parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.Point parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.Point parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.Point parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.Point parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.Point parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.Point parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.Point parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.Point parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.Point prototype) {
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
   * A single data point in a time series.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.Point}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.Point)
      com.google.monitoring.v3.PointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MetricProto
          .internal_static_google_monitoring_v3_Point_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricProto
          .internal_static_google_monitoring_v3_Point_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.Point.class, com.google.monitoring.v3.Point.Builder.class);
    }

    // Construct using com.google.monitoring.v3.Point.newBuilder()
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
      if (intervalBuilder_ == null) {
        interval_ = null;
      } else {
        interval_ = null;
        intervalBuilder_ = null;
      }
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.MetricProto
          .internal_static_google_monitoring_v3_Point_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.Point getDefaultInstanceForType() {
      return com.google.monitoring.v3.Point.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.Point build() {
      com.google.monitoring.v3.Point result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.Point buildPartial() {
      com.google.monitoring.v3.Point result = new com.google.monitoring.v3.Point(this);
      if (intervalBuilder_ == null) {
        result.interval_ = interval_;
      } else {
        result.interval_ = intervalBuilder_.build();
      }
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
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
      if (other instanceof com.google.monitoring.v3.Point) {
        return mergeFrom((com.google.monitoring.v3.Point) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.Point other) {
      if (other == com.google.monitoring.v3.Point.getDefaultInstance()) return this;
      if (other.hasInterval()) {
        mergeInterval(other.getInterval());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
      com.google.monitoring.v3.Point parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.Point) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.monitoring.v3.TimeInterval interval_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeInterval,
            com.google.monitoring.v3.TimeInterval.Builder,
            com.google.monitoring.v3.TimeIntervalOrBuilder>
        intervalBuilder_;
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public boolean hasInterval() {
      return intervalBuilder_ != null || interval_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public com.google.monitoring.v3.TimeInterval getInterval() {
      if (intervalBuilder_ == null) {
        return interval_ == null
            ? com.google.monitoring.v3.TimeInterval.getDefaultInstance()
            : interval_;
      } else {
        return intervalBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public Builder setInterval(com.google.monitoring.v3.TimeInterval value) {
      if (intervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        interval_ = value;
        onChanged();
      } else {
        intervalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public Builder setInterval(com.google.monitoring.v3.TimeInterval.Builder builderForValue) {
      if (intervalBuilder_ == null) {
        interval_ = builderForValue.build();
        onChanged();
      } else {
        intervalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public Builder mergeInterval(com.google.monitoring.v3.TimeInterval value) {
      if (intervalBuilder_ == null) {
        if (interval_ != null) {
          interval_ =
              com.google.monitoring.v3.TimeInterval.newBuilder(interval_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          interval_ = value;
        }
        onChanged();
      } else {
        intervalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public Builder clearInterval() {
      if (intervalBuilder_ == null) {
        interval_ = null;
        onChanged();
      } else {
        interval_ = null;
        intervalBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public com.google.monitoring.v3.TimeInterval.Builder getIntervalBuilder() {

      onChanged();
      return getIntervalFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    public com.google.monitoring.v3.TimeIntervalOrBuilder getIntervalOrBuilder() {
      if (intervalBuilder_ != null) {
        return intervalBuilder_.getMessageOrBuilder();
      } else {
        return interval_ == null
            ? com.google.monitoring.v3.TimeInterval.getDefaultInstance()
            : interval_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time is optional, but if it is supplied, it must equal the
     * end time.  For `DELTA` metrics, the start
     * and end time should specify a non-zero interval, with subsequent points
     * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
     * metrics, the start and end time should specify a non-zero interval, with
     * subsequent points specifying the same start time and increasing end times,
     * until an event resets the cumulative value to zero and sets a new start
     * time for the following points.
     * </pre>
     *
     * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TimeInterval,
            com.google.monitoring.v3.TimeInterval.Builder,
            com.google.monitoring.v3.TimeIntervalOrBuilder>
        getIntervalFieldBuilder() {
      if (intervalBuilder_ == null) {
        intervalBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.TimeInterval,
                com.google.monitoring.v3.TimeInterval.Builder,
                com.google.monitoring.v3.TimeIntervalOrBuilder>(
                getInterval(), getParentForChildren(), isClean());
        interval_ = null;
      }
      return intervalBuilder_;
    }

    private com.google.monitoring.v3.TypedValue value_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TypedValue,
            com.google.monitoring.v3.TypedValue.Builder,
            com.google.monitoring.v3.TypedValueOrBuilder>
        valueBuilder_;
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public com.google.monitoring.v3.TypedValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.monitoring.v3.TypedValue.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public Builder setValue(com.google.monitoring.v3.TypedValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public Builder setValue(com.google.monitoring.v3.TypedValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public Builder mergeValue(com.google.monitoring.v3.TypedValue value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
              com.google.monitoring.v3.TypedValue.newBuilder(value_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public com.google.monitoring.v3.TypedValue.Builder getValueBuilder() {

      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    public com.google.monitoring.v3.TypedValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ? com.google.monitoring.v3.TypedValue.getDefaultInstance() : value_;
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.monitoring.v3.TypedValue value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.TypedValue,
            com.google.monitoring.v3.TypedValue.Builder,
            com.google.monitoring.v3.TypedValueOrBuilder>
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.TypedValue,
                com.google.monitoring.v3.TypedValue.Builder,
                com.google.monitoring.v3.TypedValueOrBuilder>(
                getValue(), getParentForChildren(), isClean());
        value_ = null;
      }
      return valueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.Point)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.Point)
  private static final com.google.monitoring.v3.Point DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.Point();
  }

  public static com.google.monitoring.v3.Point getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Point> PARSER =
      new com.google.protobuf.AbstractParser<Point>() {
        @java.lang.Override
        public Point parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Point(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Point> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Point> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.Point getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
