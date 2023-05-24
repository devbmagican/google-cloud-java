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
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

/**
 *
 *
 * <pre>
 * Response for getting breakpoint information.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.GetBreakpointResponse}
 */
public final class GetBreakpointResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.GetBreakpointResponse)
    GetBreakpointResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetBreakpointResponse.newBuilder() to construct.
  private GetBreakpointResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetBreakpointResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetBreakpointResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto
        .internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto
        .internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.GetBreakpointResponse.class,
            com.google.devtools.clouddebugger.v2.GetBreakpointResponse.Builder.class);
  }

  public static final int BREAKPOINT_FIELD_NUMBER = 1;
  private com.google.devtools.clouddebugger.v2.Breakpoint breakpoint_;
  /**
   *
   *
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   *
   * @return Whether the breakpoint field is set.
   */
  @java.lang.Override
  public boolean hasBreakpoint() {
    return breakpoint_ != null;
  }
  /**
   *
   *
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   *
   * @return The breakpoint.
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint() {
    return breakpoint_ == null
        ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance()
        : breakpoint_;
  }
  /**
   *
   *
   * <pre>
   * Complete breakpoint state.
   * The fields `id` and `location` are guaranteed to be set.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder() {
    return breakpoint_ == null
        ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance()
        : breakpoint_;
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
    if (breakpoint_ != null) {
      output.writeMessage(1, getBreakpoint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (breakpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBreakpoint());
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.GetBreakpointResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.GetBreakpointResponse other =
        (com.google.devtools.clouddebugger.v2.GetBreakpointResponse) obj;

    if (hasBreakpoint() != other.hasBreakpoint()) return false;
    if (hasBreakpoint()) {
      if (!getBreakpoint().equals(other.getBreakpoint())) return false;
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
    if (hasBreakpoint()) {
      hash = (37 * hash) + BREAKPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getBreakpoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse parseFrom(
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
      com.google.devtools.clouddebugger.v2.GetBreakpointResponse prototype) {
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
   * Response for getting breakpoint information.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.GetBreakpointResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.GetBreakpointResponse)
      com.google.devtools.clouddebugger.v2.GetBreakpointResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto
          .internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto
          .internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.GetBreakpointResponse.class,
              com.google.devtools.clouddebugger.v2.GetBreakpointResponse.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.GetBreakpointResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      breakpoint_ = null;
      if (breakpointBuilder_ != null) {
        breakpointBuilder_.dispose();
        breakpointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto
          .internal_static_google_devtools_clouddebugger_v2_GetBreakpointResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.GetBreakpointResponse getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.GetBreakpointResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.GetBreakpointResponse build() {
      com.google.devtools.clouddebugger.v2.GetBreakpointResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.GetBreakpointResponse buildPartial() {
      com.google.devtools.clouddebugger.v2.GetBreakpointResponse result =
          new com.google.devtools.clouddebugger.v2.GetBreakpointResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.clouddebugger.v2.GetBreakpointResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.breakpoint_ = breakpointBuilder_ == null ? breakpoint_ : breakpointBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.clouddebugger.v2.GetBreakpointResponse) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.GetBreakpointResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.GetBreakpointResponse other) {
      if (other == com.google.devtools.clouddebugger.v2.GetBreakpointResponse.getDefaultInstance())
        return this;
      if (other.hasBreakpoint()) {
        mergeBreakpoint(other.getBreakpoint());
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
                input.readMessage(getBreakpointFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.devtools.clouddebugger.v2.Breakpoint breakpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Breakpoint,
            com.google.devtools.clouddebugger.v2.Breakpoint.Builder,
            com.google.devtools.clouddebugger.v2.BreakpointOrBuilder>
        breakpointBuilder_;
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     *
     * @return Whether the breakpoint field is set.
     */
    public boolean hasBreakpoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     *
     * @return The breakpoint.
     */
    public com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoint() {
      if (breakpointBuilder_ == null) {
        return breakpoint_ == null
            ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance()
            : breakpoint_;
      } else {
        return breakpointBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder setBreakpoint(com.google.devtools.clouddebugger.v2.Breakpoint value) {
      if (breakpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        breakpoint_ = value;
      } else {
        breakpointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder setBreakpoint(
        com.google.devtools.clouddebugger.v2.Breakpoint.Builder builderForValue) {
      if (breakpointBuilder_ == null) {
        breakpoint_ = builderForValue.build();
      } else {
        breakpointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder mergeBreakpoint(com.google.devtools.clouddebugger.v2.Breakpoint value) {
      if (breakpointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && breakpoint_ != null
            && breakpoint_
                != com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance()) {
          getBreakpointBuilder().mergeFrom(value);
        } else {
          breakpoint_ = value;
        }
      } else {
        breakpointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public Builder clearBreakpoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      breakpoint_ = null;
      if (breakpointBuilder_ != null) {
        breakpointBuilder_.dispose();
        breakpointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Breakpoint.Builder getBreakpointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBreakpointFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointOrBuilder() {
      if (breakpointBuilder_ != null) {
        return breakpointBuilder_.getMessageOrBuilder();
      } else {
        return breakpoint_ == null
            ? com.google.devtools.clouddebugger.v2.Breakpoint.getDefaultInstance()
            : breakpoint_;
      }
    }
    /**
     *
     *
     * <pre>
     * Complete breakpoint state.
     * The fields `id` and `location` are guaranteed to be set.
     * </pre>
     *
     * <code>.google.devtools.clouddebugger.v2.Breakpoint breakpoint = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Breakpoint,
            com.google.devtools.clouddebugger.v2.Breakpoint.Builder,
            com.google.devtools.clouddebugger.v2.BreakpointOrBuilder>
        getBreakpointFieldBuilder() {
      if (breakpointBuilder_ == null) {
        breakpointBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.clouddebugger.v2.Breakpoint,
                com.google.devtools.clouddebugger.v2.Breakpoint.Builder,
                com.google.devtools.clouddebugger.v2.BreakpointOrBuilder>(
                getBreakpoint(), getParentForChildren(), isClean());
        breakpoint_ = null;
      }
      return breakpointBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.GetBreakpointResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.GetBreakpointResponse)
  private static final com.google.devtools.clouddebugger.v2.GetBreakpointResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.GetBreakpointResponse();
  }

  public static com.google.devtools.clouddebugger.v2.GetBreakpointResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBreakpointResponse> PARSER =
      new com.google.protobuf.AbstractParser<GetBreakpointResponse>() {
        @java.lang.Override
        public GetBreakpointResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBreakpointResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBreakpointResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.GetBreakpointResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
