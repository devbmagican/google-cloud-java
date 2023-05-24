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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ListProcesses][google.cloud.datacatalog.lineage.v1.ListProcesses].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.lineage.v1.ListProcessesResponse}
 */
public final class ListProcessesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.lineage.v1.ListProcessesResponse)
    ListProcessesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListProcessesResponse.newBuilder() to construct.
  private ListProcessesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProcessesResponse() {
    processes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListProcessesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto
        .internal_static_google_cloud_datacatalog_lineage_v1_ListProcessesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto
        .internal_static_google_cloud_datacatalog_lineage_v1_ListProcessesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse.class,
            com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse.Builder.class);
  }

  public static final int PROCESSES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datacatalog.lineage.v1.Process> processes_;
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datacatalog.lineage.v1.Process> getProcessesList() {
    return processes_;
  }
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder>
      getProcessesOrBuilderList() {
    return processes_;
  }
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  @java.lang.Override
  public int getProcessesCount() {
    return processes_.size();
  }
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.Process getProcesses(int index) {
    return processes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder getProcessesOrBuilder(int index) {
    return processes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * The token to specify as `page_token` in the next call to get the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The token to specify as `page_token` in the next call to get the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < processes_.size(); i++) {
      output.writeMessage(1, processes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < processes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, processes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse other =
        (com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse) obj;

    if (!getProcessesList().equals(other.getProcessesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getProcessesCount() > 0) {
      hash = (37 * hash) + PROCESSES_FIELD_NUMBER;
      hash = (53 * hash) + getProcessesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse parseFrom(
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
      com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse prototype) {
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
   * Response message for
   * [ListProcesses][google.cloud.datacatalog.lineage.v1.ListProcesses].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.lineage.v1.ListProcessesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.lineage.v1.ListProcessesResponse)
      com.google.cloud.datacatalog.lineage.v1.ListProcessesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_ListProcessesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_ListProcessesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse.class,
              com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (processesBuilder_ == null) {
        processes_ = java.util.Collections.emptyList();
      } else {
        processes_ = null;
        processesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_ListProcessesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse build() {
      com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse buildPartial() {
      com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse result =
          new com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse result) {
      if (processesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          processes_ = java.util.Collections.unmodifiableList(processes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.processes_ = processes_;
      } else {
        result.processes_ = processesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse) {
        return mergeFrom((com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse other) {
      if (other
          == com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse.getDefaultInstance())
        return this;
      if (processesBuilder_ == null) {
        if (!other.processes_.isEmpty()) {
          if (processes_.isEmpty()) {
            processes_ = other.processes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessesIsMutable();
            processes_.addAll(other.processes_);
          }
          onChanged();
        }
      } else {
        if (!other.processes_.isEmpty()) {
          if (processesBuilder_.isEmpty()) {
            processesBuilder_.dispose();
            processesBuilder_ = null;
            processes_ = other.processes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProcessesFieldBuilder()
                    : null;
          } else {
            processesBuilder_.addAllMessages(other.processes_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
            case 10:
              {
                com.google.cloud.datacatalog.lineage.v1.Process m =
                    input.readMessage(
                        com.google.cloud.datacatalog.lineage.v1.Process.parser(),
                        extensionRegistry);
                if (processesBuilder_ == null) {
                  ensureProcessesIsMutable();
                  processes_.add(m);
                } else {
                  processesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.datacatalog.lineage.v1.Process> processes_ =
        java.util.Collections.emptyList();

    private void ensureProcessesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processes_ =
            new java.util.ArrayList<com.google.cloud.datacatalog.lineage.v1.Process>(processes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.lineage.v1.Process,
            com.google.cloud.datacatalog.lineage.v1.Process.Builder,
            com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder>
        processesBuilder_;

    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.lineage.v1.Process> getProcessesList() {
      if (processesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(processes_);
      } else {
        return processesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public int getProcessesCount() {
      if (processesBuilder_ == null) {
        return processes_.size();
      } else {
        return processesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Process getProcesses(int index) {
      if (processesBuilder_ == null) {
        return processes_.get(index);
      } else {
        return processesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder setProcesses(int index, com.google.cloud.datacatalog.lineage.v1.Process value) {
      if (processesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessesIsMutable();
        processes_.set(index, value);
        onChanged();
      } else {
        processesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder setProcesses(
        int index, com.google.cloud.datacatalog.lineage.v1.Process.Builder builderForValue) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.set(index, builderForValue.build());
        onChanged();
      } else {
        processesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder addProcesses(com.google.cloud.datacatalog.lineage.v1.Process value) {
      if (processesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessesIsMutable();
        processes_.add(value);
        onChanged();
      } else {
        processesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder addProcesses(int index, com.google.cloud.datacatalog.lineage.v1.Process value) {
      if (processesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessesIsMutable();
        processes_.add(index, value);
        onChanged();
      } else {
        processesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder addProcesses(
        com.google.cloud.datacatalog.lineage.v1.Process.Builder builderForValue) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.add(builderForValue.build());
        onChanged();
      } else {
        processesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder addProcesses(
        int index, com.google.cloud.datacatalog.lineage.v1.Process.Builder builderForValue) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.add(index, builderForValue.build());
        onChanged();
      } else {
        processesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder addAllProcesses(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.lineage.v1.Process> values) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, processes_);
        onChanged();
      } else {
        processesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder clearProcesses() {
      if (processesBuilder_ == null) {
        processes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public Builder removeProcesses(int index) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.remove(index);
        onChanged();
      } else {
        processesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Process.Builder getProcessesBuilder(int index) {
      return getProcessesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder getProcessesOrBuilder(
        int index) {
      if (processesBuilder_ == null) {
        return processes_.get(index);
      } else {
        return processesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder>
        getProcessesOrBuilderList() {
      if (processesBuilder_ != null) {
        return processesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(processes_);
      }
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Process.Builder addProcessesBuilder() {
      return getProcessesFieldBuilder()
          .addBuilder(com.google.cloud.datacatalog.lineage.v1.Process.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Process.Builder addProcessesBuilder(int index) {
      return getProcessesFieldBuilder()
          .addBuilder(index, com.google.cloud.datacatalog.lineage.v1.Process.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The processes from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.lineage.v1.Process.Builder>
        getProcessesBuilderList() {
      return getProcessesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.lineage.v1.Process,
            com.google.cloud.datacatalog.lineage.v1.Process.Builder,
            com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder>
        getProcessesFieldBuilder() {
      if (processesBuilder_ == null) {
        processesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datacatalog.lineage.v1.Process,
                com.google.cloud.datacatalog.lineage.v1.Process.Builder,
                com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder>(
                processes_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        processes_ = null;
      }
      return processesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.lineage.v1.ListProcessesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.lineage.v1.ListProcessesResponse)
  private static final com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse();
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProcessesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProcessesResponse>() {
        @java.lang.Override
        public ListProcessesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListProcessesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProcessesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.ListProcessesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
