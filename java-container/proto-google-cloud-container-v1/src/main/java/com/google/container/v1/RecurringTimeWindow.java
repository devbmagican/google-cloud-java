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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Represents an arbitrary window of time that recurs.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.RecurringTimeWindow}
 */
public final class RecurringTimeWindow extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.RecurringTimeWindow)
    RecurringTimeWindowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecurringTimeWindow.newBuilder() to construct.
  private RecurringTimeWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecurringTimeWindow() {
    recurrence_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecurringTimeWindow();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RecurringTimeWindow(
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
          case 10:
            {
              com.google.container.v1.TimeWindow.Builder subBuilder = null;
              if (window_ != null) {
                subBuilder = window_.toBuilder();
              }
              window_ =
                  input.readMessage(com.google.container.v1.TimeWindow.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(window_);
                window_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              recurrence_ = s;
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
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_RecurringTimeWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_RecurringTimeWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.RecurringTimeWindow.class,
            com.google.container.v1.RecurringTimeWindow.Builder.class);
  }

  public static final int WINDOW_FIELD_NUMBER = 1;
  private com.google.container.v1.TimeWindow window_;
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1.TimeWindow window = 1;</code>
   *
   * @return Whether the window field is set.
   */
  @java.lang.Override
  public boolean hasWindow() {
    return window_ != null;
  }
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1.TimeWindow window = 1;</code>
   *
   * @return The window.
   */
  @java.lang.Override
  public com.google.container.v1.TimeWindow getWindow() {
    return window_ == null ? com.google.container.v1.TimeWindow.getDefaultInstance() : window_;
  }
  /**
   *
   *
   * <pre>
   * The window of the first recurrence.
   * </pre>
   *
   * <code>.google.container.v1.TimeWindow window = 1;</code>
   */
  @java.lang.Override
  public com.google.container.v1.TimeWindowOrBuilder getWindowOrBuilder() {
    return getWindow();
  }

  public static final int RECURRENCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object recurrence_;
  /**
   *
   *
   * <pre>
   * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
   * this window reccurs. They go on for the span of time between the start and
   * end time.
   * For example, to have something repeat every weekday, you'd use:
   * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
   * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
   * `FREQ=DAILY`
   * For the first weekend of every month:
   * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
   * This specifies how frequently the window starts. Eg, if you wanted to have
   * a 9-5 UTC-4 window every weekday, you'd use something like:
   * ```
   * start time = 2019-01-01T09:00:00-0400
   * end time = 2019-01-01T17:00:00-0400
   * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
   * ```
   * Windows can span multiple days. Eg, to make the window encompass every
   * weekend from midnight Saturday till the last minute of Sunday UTC:
   * ```
   * start time = 2019-01-05T00:00:00Z
   * end time = 2019-01-07T23:59:00Z
   * recurrence = FREQ=WEEKLY;BYDAY=SA
   * ```
   * Note the start and end time's specific dates are largely arbitrary except
   * to specify duration of the window and when it first starts.
   * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
   * </pre>
   *
   * <code>string recurrence = 2;</code>
   *
   * @return The recurrence.
   */
  @java.lang.Override
  public java.lang.String getRecurrence() {
    java.lang.Object ref = recurrence_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recurrence_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
   * this window reccurs. They go on for the span of time between the start and
   * end time.
   * For example, to have something repeat every weekday, you'd use:
   * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
   * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
   * `FREQ=DAILY`
   * For the first weekend of every month:
   * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
   * This specifies how frequently the window starts. Eg, if you wanted to have
   * a 9-5 UTC-4 window every weekday, you'd use something like:
   * ```
   * start time = 2019-01-01T09:00:00-0400
   * end time = 2019-01-01T17:00:00-0400
   * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
   * ```
   * Windows can span multiple days. Eg, to make the window encompass every
   * weekend from midnight Saturday till the last minute of Sunday UTC:
   * ```
   * start time = 2019-01-05T00:00:00Z
   * end time = 2019-01-07T23:59:00Z
   * recurrence = FREQ=WEEKLY;BYDAY=SA
   * ```
   * Note the start and end time's specific dates are largely arbitrary except
   * to specify duration of the window and when it first starts.
   * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
   * </pre>
   *
   * <code>string recurrence = 2;</code>
   *
   * @return The bytes for recurrence.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRecurrenceBytes() {
    java.lang.Object ref = recurrence_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      recurrence_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (window_ != null) {
      output.writeMessage(1, getWindow());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recurrence_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, recurrence_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (window_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWindow());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recurrence_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, recurrence_);
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
    if (!(obj instanceof com.google.container.v1.RecurringTimeWindow)) {
      return super.equals(obj);
    }
    com.google.container.v1.RecurringTimeWindow other =
        (com.google.container.v1.RecurringTimeWindow) obj;

    if (hasWindow() != other.hasWindow()) return false;
    if (hasWindow()) {
      if (!getWindow().equals(other.getWindow())) return false;
    }
    if (!getRecurrence().equals(other.getRecurrence())) return false;
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
    if (hasWindow()) {
      hash = (37 * hash) + WINDOW_FIELD_NUMBER;
      hash = (53 * hash) + getWindow().hashCode();
    }
    hash = (37 * hash) + RECURRENCE_FIELD_NUMBER;
    hash = (53 * hash) + getRecurrence().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.RecurringTimeWindow parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.RecurringTimeWindow parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.RecurringTimeWindow parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.RecurringTimeWindow prototype) {
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
   * Represents an arbitrary window of time that recurs.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.RecurringTimeWindow}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.RecurringTimeWindow)
      com.google.container.v1.RecurringTimeWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_RecurringTimeWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_RecurringTimeWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.RecurringTimeWindow.class,
              com.google.container.v1.RecurringTimeWindow.Builder.class);
    }

    // Construct using com.google.container.v1.RecurringTimeWindow.newBuilder()
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
      if (windowBuilder_ == null) {
        window_ = null;
      } else {
        window_ = null;
        windowBuilder_ = null;
      }
      recurrence_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_RecurringTimeWindow_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.RecurringTimeWindow getDefaultInstanceForType() {
      return com.google.container.v1.RecurringTimeWindow.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.RecurringTimeWindow build() {
      com.google.container.v1.RecurringTimeWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.RecurringTimeWindow buildPartial() {
      com.google.container.v1.RecurringTimeWindow result =
          new com.google.container.v1.RecurringTimeWindow(this);
      if (windowBuilder_ == null) {
        result.window_ = window_;
      } else {
        result.window_ = windowBuilder_.build();
      }
      result.recurrence_ = recurrence_;
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
      if (other instanceof com.google.container.v1.RecurringTimeWindow) {
        return mergeFrom((com.google.container.v1.RecurringTimeWindow) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.RecurringTimeWindow other) {
      if (other == com.google.container.v1.RecurringTimeWindow.getDefaultInstance()) return this;
      if (other.hasWindow()) {
        mergeWindow(other.getWindow());
      }
      if (!other.getRecurrence().isEmpty()) {
        recurrence_ = other.recurrence_;
        onChanged();
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
      com.google.container.v1.RecurringTimeWindow parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.RecurringTimeWindow) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.container.v1.TimeWindow window_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.TimeWindow,
            com.google.container.v1.TimeWindow.Builder,
            com.google.container.v1.TimeWindowOrBuilder>
        windowBuilder_;
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     *
     * @return Whether the window field is set.
     */
    public boolean hasWindow() {
      return windowBuilder_ != null || window_ != null;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     *
     * @return The window.
     */
    public com.google.container.v1.TimeWindow getWindow() {
      if (windowBuilder_ == null) {
        return window_ == null ? com.google.container.v1.TimeWindow.getDefaultInstance() : window_;
      } else {
        return windowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     */
    public Builder setWindow(com.google.container.v1.TimeWindow value) {
      if (windowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        window_ = value;
        onChanged();
      } else {
        windowBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     */
    public Builder setWindow(com.google.container.v1.TimeWindow.Builder builderForValue) {
      if (windowBuilder_ == null) {
        window_ = builderForValue.build();
        onChanged();
      } else {
        windowBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     */
    public Builder mergeWindow(com.google.container.v1.TimeWindow value) {
      if (windowBuilder_ == null) {
        if (window_ != null) {
          window_ =
              com.google.container.v1.TimeWindow.newBuilder(window_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          window_ = value;
        }
        onChanged();
      } else {
        windowBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     */
    public Builder clearWindow() {
      if (windowBuilder_ == null) {
        window_ = null;
        onChanged();
      } else {
        window_ = null;
        windowBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     */
    public com.google.container.v1.TimeWindow.Builder getWindowBuilder() {

      onChanged();
      return getWindowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     */
    public com.google.container.v1.TimeWindowOrBuilder getWindowOrBuilder() {
      if (windowBuilder_ != null) {
        return windowBuilder_.getMessageOrBuilder();
      } else {
        return window_ == null ? com.google.container.v1.TimeWindow.getDefaultInstance() : window_;
      }
    }
    /**
     *
     *
     * <pre>
     * The window of the first recurrence.
     * </pre>
     *
     * <code>.google.container.v1.TimeWindow window = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.TimeWindow,
            com.google.container.v1.TimeWindow.Builder,
            com.google.container.v1.TimeWindowOrBuilder>
        getWindowFieldBuilder() {
      if (windowBuilder_ == null) {
        windowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1.TimeWindow,
                com.google.container.v1.TimeWindow.Builder,
                com.google.container.v1.TimeWindowOrBuilder>(
                getWindow(), getParentForChildren(), isClean());
        window_ = null;
      }
      return windowBuilder_;
    }

    private java.lang.Object recurrence_ = "";
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @return The recurrence.
     */
    public java.lang.String getRecurrence() {
      java.lang.Object ref = recurrence_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recurrence_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @return The bytes for recurrence.
     */
    public com.google.protobuf.ByteString getRecurrenceBytes() {
      java.lang.Object ref = recurrence_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        recurrence_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @param value The recurrence to set.
     * @return This builder for chaining.
     */
    public Builder setRecurrence(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      recurrence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRecurrence() {

      recurrence_ = getDefaultInstance().getRecurrence();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An RRULE (https://tools.ietf.org/html/rfc5545#section-3.8.5.3) for how
     * this window reccurs. They go on for the span of time between the start and
     * end time.
     * For example, to have something repeat every weekday, you'd use:
     * `FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR`
     * To repeat some window daily (equivalent to the DailyMaintenanceWindow):
     * `FREQ=DAILY`
     * For the first weekend of every month:
     * `FREQ=MONTHLY;BYSETPOS=1;BYDAY=SA,SU`
     * This specifies how frequently the window starts. Eg, if you wanted to have
     * a 9-5 UTC-4 window every weekday, you'd use something like:
     * ```
     * start time = 2019-01-01T09:00:00-0400
     * end time = 2019-01-01T17:00:00-0400
     * recurrence = FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR
     * ```
     * Windows can span multiple days. Eg, to make the window encompass every
     * weekend from midnight Saturday till the last minute of Sunday UTC:
     * ```
     * start time = 2019-01-05T00:00:00Z
     * end time = 2019-01-07T23:59:00Z
     * recurrence = FREQ=WEEKLY;BYDAY=SA
     * ```
     * Note the start and end time's specific dates are largely arbitrary except
     * to specify duration of the window and when it first starts.
     * The FREQ values of HOURLY, MINUTELY, and SECONDLY are not supported.
     * </pre>
     *
     * <code>string recurrence = 2;</code>
     *
     * @param value The bytes for recurrence to set.
     * @return This builder for chaining.
     */
    public Builder setRecurrenceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      recurrence_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.RecurringTimeWindow)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.RecurringTimeWindow)
  private static final com.google.container.v1.RecurringTimeWindow DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.RecurringTimeWindow();
  }

  public static com.google.container.v1.RecurringTimeWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecurringTimeWindow> PARSER =
      new com.google.protobuf.AbstractParser<RecurringTimeWindow>() {
        @java.lang.Override
        public RecurringTimeWindow parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RecurringTimeWindow(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RecurringTimeWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecurringTimeWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.RecurringTimeWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
