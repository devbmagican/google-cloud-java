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
// source: google/cloud/vpcaccess/v1/vpc_access.proto

package com.google.cloud.vpcaccess.v1;

/**
 *
 *
 * <pre>
 * Response for listing Serverless VPC Access connectors.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vpcaccess.v1.ListConnectorsResponse}
 */
public final class ListConnectorsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vpcaccess.v1.ListConnectorsResponse)
    ListConnectorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListConnectorsResponse.newBuilder() to construct.
  private ListConnectorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListConnectorsResponse() {
    connectors_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListConnectorsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vpcaccess.v1.VpcAccessProto
        .internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vpcaccess.v1.VpcAccessProto
        .internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vpcaccess.v1.ListConnectorsResponse.class,
            com.google.cloud.vpcaccess.v1.ListConnectorsResponse.Builder.class);
  }

  public static final int CONNECTORS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.vpcaccess.v1.Connector> connectors_;
  /**
   *
   *
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vpcaccess.v1.Connector> getConnectorsList() {
    return connectors_;
  }
  /**
   *
   *
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>
      getConnectorsOrBuilderList() {
    return connectors_;
  }
  /**
   *
   *
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  @java.lang.Override
  public int getConnectorsCount() {
    return connectors_.size();
  }
  /**
   *
   *
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vpcaccess.v1.Connector getConnectors(int index) {
    return connectors_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vpcaccess.v1.ConnectorOrBuilder getConnectorsOrBuilder(int index) {
    return connectors_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Continuation token.
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
   * Continuation token.
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
    for (int i = 0; i < connectors_.size(); i++) {
      output.writeMessage(1, connectors_.get(i));
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
    for (int i = 0; i < connectors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, connectors_.get(i));
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
    if (!(obj instanceof com.google.cloud.vpcaccess.v1.ListConnectorsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vpcaccess.v1.ListConnectorsResponse other =
        (com.google.cloud.vpcaccess.v1.ListConnectorsResponse) obj;

    if (!getConnectorsList().equals(other.getConnectorsList())) return false;
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
    if (getConnectorsCount() > 0) {
      hash = (37 * hash) + CONNECTORS_FIELD_NUMBER;
      hash = (53 * hash) + getConnectorsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vpcaccess.v1.ListConnectorsResponse prototype) {
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
   * Response for listing Serverless VPC Access connectors.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vpcaccess.v1.ListConnectorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vpcaccess.v1.ListConnectorsResponse)
      com.google.cloud.vpcaccess.v1.ListConnectorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vpcaccess.v1.VpcAccessProto
          .internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vpcaccess.v1.VpcAccessProto
          .internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vpcaccess.v1.ListConnectorsResponse.class,
              com.google.cloud.vpcaccess.v1.ListConnectorsResponse.Builder.class);
    }

    // Construct using com.google.cloud.vpcaccess.v1.ListConnectorsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (connectorsBuilder_ == null) {
        connectors_ = java.util.Collections.emptyList();
      } else {
        connectors_ = null;
        connectorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vpcaccess.v1.VpcAccessProto
          .internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vpcaccess.v1.ListConnectorsResponse getDefaultInstanceForType() {
      return com.google.cloud.vpcaccess.v1.ListConnectorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vpcaccess.v1.ListConnectorsResponse build() {
      com.google.cloud.vpcaccess.v1.ListConnectorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vpcaccess.v1.ListConnectorsResponse buildPartial() {
      com.google.cloud.vpcaccess.v1.ListConnectorsResponse result =
          new com.google.cloud.vpcaccess.v1.ListConnectorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.vpcaccess.v1.ListConnectorsResponse result) {
      if (connectorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          connectors_ = java.util.Collections.unmodifiableList(connectors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.connectors_ = connectors_;
      } else {
        result.connectors_ = connectorsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.vpcaccess.v1.ListConnectorsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vpcaccess.v1.ListConnectorsResponse) {
        return mergeFrom((com.google.cloud.vpcaccess.v1.ListConnectorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vpcaccess.v1.ListConnectorsResponse other) {
      if (other == com.google.cloud.vpcaccess.v1.ListConnectorsResponse.getDefaultInstance())
        return this;
      if (connectorsBuilder_ == null) {
        if (!other.connectors_.isEmpty()) {
          if (connectors_.isEmpty()) {
            connectors_ = other.connectors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConnectorsIsMutable();
            connectors_.addAll(other.connectors_);
          }
          onChanged();
        }
      } else {
        if (!other.connectors_.isEmpty()) {
          if (connectorsBuilder_.isEmpty()) {
            connectorsBuilder_.dispose();
            connectorsBuilder_ = null;
            connectors_ = other.connectors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            connectorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getConnectorsFieldBuilder()
                    : null;
          } else {
            connectorsBuilder_.addAllMessages(other.connectors_);
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
                com.google.cloud.vpcaccess.v1.Connector m =
                    input.readMessage(
                        com.google.cloud.vpcaccess.v1.Connector.parser(), extensionRegistry);
                if (connectorsBuilder_ == null) {
                  ensureConnectorsIsMutable();
                  connectors_.add(m);
                } else {
                  connectorsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.vpcaccess.v1.Connector> connectors_ =
        java.util.Collections.emptyList();

    private void ensureConnectorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        connectors_ = new java.util.ArrayList<com.google.cloud.vpcaccess.v1.Connector>(connectors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vpcaccess.v1.Connector,
            com.google.cloud.vpcaccess.v1.Connector.Builder,
            com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>
        connectorsBuilder_;

    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public java.util.List<com.google.cloud.vpcaccess.v1.Connector> getConnectorsList() {
      if (connectorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(connectors_);
      } else {
        return connectorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public int getConnectorsCount() {
      if (connectorsBuilder_ == null) {
        return connectors_.size();
      } else {
        return connectorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public com.google.cloud.vpcaccess.v1.Connector getConnectors(int index) {
      if (connectorsBuilder_ == null) {
        return connectors_.get(index);
      } else {
        return connectorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder setConnectors(int index, com.google.cloud.vpcaccess.v1.Connector value) {
      if (connectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectorsIsMutable();
        connectors_.set(index, value);
        onChanged();
      } else {
        connectorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder setConnectors(
        int index, com.google.cloud.vpcaccess.v1.Connector.Builder builderForValue) {
      if (connectorsBuilder_ == null) {
        ensureConnectorsIsMutable();
        connectors_.set(index, builderForValue.build());
        onChanged();
      } else {
        connectorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder addConnectors(com.google.cloud.vpcaccess.v1.Connector value) {
      if (connectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectorsIsMutable();
        connectors_.add(value);
        onChanged();
      } else {
        connectorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder addConnectors(int index, com.google.cloud.vpcaccess.v1.Connector value) {
      if (connectorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectorsIsMutable();
        connectors_.add(index, value);
        onChanged();
      } else {
        connectorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder addConnectors(com.google.cloud.vpcaccess.v1.Connector.Builder builderForValue) {
      if (connectorsBuilder_ == null) {
        ensureConnectorsIsMutable();
        connectors_.add(builderForValue.build());
        onChanged();
      } else {
        connectorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder addConnectors(
        int index, com.google.cloud.vpcaccess.v1.Connector.Builder builderForValue) {
      if (connectorsBuilder_ == null) {
        ensureConnectorsIsMutable();
        connectors_.add(index, builderForValue.build());
        onChanged();
      } else {
        connectorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder addAllConnectors(
        java.lang.Iterable<? extends com.google.cloud.vpcaccess.v1.Connector> values) {
      if (connectorsBuilder_ == null) {
        ensureConnectorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, connectors_);
        onChanged();
      } else {
        connectorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder clearConnectors() {
      if (connectorsBuilder_ == null) {
        connectors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        connectorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public Builder removeConnectors(int index) {
      if (connectorsBuilder_ == null) {
        ensureConnectorsIsMutable();
        connectors_.remove(index);
        onChanged();
      } else {
        connectorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public com.google.cloud.vpcaccess.v1.Connector.Builder getConnectorsBuilder(int index) {
      return getConnectorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public com.google.cloud.vpcaccess.v1.ConnectorOrBuilder getConnectorsOrBuilder(int index) {
      if (connectorsBuilder_ == null) {
        return connectors_.get(index);
      } else {
        return connectorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>
        getConnectorsOrBuilderList() {
      if (connectorsBuilder_ != null) {
        return connectorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(connectors_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public com.google.cloud.vpcaccess.v1.Connector.Builder addConnectorsBuilder() {
      return getConnectorsFieldBuilder()
          .addBuilder(com.google.cloud.vpcaccess.v1.Connector.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public com.google.cloud.vpcaccess.v1.Connector.Builder addConnectorsBuilder(int index) {
      return getConnectorsFieldBuilder()
          .addBuilder(index, com.google.cloud.vpcaccess.v1.Connector.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Serverless VPC Access connectors.
     * </pre>
     *
     * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
     */
    public java.util.List<com.google.cloud.vpcaccess.v1.Connector.Builder>
        getConnectorsBuilderList() {
      return getConnectorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vpcaccess.v1.Connector,
            com.google.cloud.vpcaccess.v1.Connector.Builder,
            com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>
        getConnectorsFieldBuilder() {
      if (connectorsBuilder_ == null) {
        connectorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vpcaccess.v1.Connector,
                com.google.cloud.vpcaccess.v1.Connector.Builder,
                com.google.cloud.vpcaccess.v1.ConnectorOrBuilder>(
                connectors_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        connectors_ = null;
      }
      return connectorsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Continuation token.
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
     * Continuation token.
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
     * Continuation token.
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
     * Continuation token.
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
     * Continuation token.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vpcaccess.v1.ListConnectorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vpcaccess.v1.ListConnectorsResponse)
  private static final com.google.cloud.vpcaccess.v1.ListConnectorsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vpcaccess.v1.ListConnectorsResponse();
  }

  public static com.google.cloud.vpcaccess.v1.ListConnectorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConnectorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListConnectorsResponse>() {
        @java.lang.Override
        public ListConnectorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConnectorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConnectorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vpcaccess.v1.ListConnectorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
