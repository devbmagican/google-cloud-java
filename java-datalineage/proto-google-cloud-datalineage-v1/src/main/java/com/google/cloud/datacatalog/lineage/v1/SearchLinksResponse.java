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
 * [SearchLinks][google.cloud.datacatalog.lineage.v1.Lineage.SearchLinks].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.lineage.v1.SearchLinksResponse}
 */
public final class SearchLinksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.lineage.v1.SearchLinksResponse)
    SearchLinksResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchLinksResponse.newBuilder() to construct.
  private SearchLinksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchLinksResponse() {
    links_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchLinksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto
        .internal_static_google_cloud_datacatalog_lineage_v1_SearchLinksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto
        .internal_static_google_cloud_datacatalog_lineage_v1_SearchLinksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse.class,
            com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse.Builder.class);
  }

  public static final int LINKS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datacatalog.lineage.v1.Link> links_;
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datacatalog.lineage.v1.Link> getLinksList() {
    return links_;
  }
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder>
      getLinksOrBuilderList() {
    return links_;
  }
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  @java.lang.Override
  public int getLinksCount() {
    return links_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.Link getLinks(int index) {
    return links_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder getLinksOrBuilder(int index) {
    return links_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * The token to specify as `page_token` in the subsequent call to get the next
   * page. Omitted if there are no more pages in the response.
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
   * The token to specify as `page_token` in the subsequent call to get the next
   * page. Omitted if there are no more pages in the response.
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
    for (int i = 0; i < links_.size(); i++) {
      output.writeMessage(1, links_.get(i));
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
    for (int i = 0; i < links_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, links_.get(i));
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
    if (!(obj instanceof com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse other =
        (com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse) obj;

    if (!getLinksList().equals(other.getLinksList())) return false;
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
    if (getLinksCount() > 0) {
      hash = (37 * hash) + LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getLinksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse parseFrom(
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
      com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse prototype) {
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
   * [SearchLinks][google.cloud.datacatalog.lineage.v1.Lineage.SearchLinks].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.lineage.v1.SearchLinksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.lineage.v1.SearchLinksResponse)
      com.google.cloud.datacatalog.lineage.v1.SearchLinksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_SearchLinksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_SearchLinksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse.class,
              com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
      } else {
        links_ = null;
        linksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto
          .internal_static_google_cloud_datacatalog_lineage_v1_SearchLinksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse build() {
      com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse buildPartial() {
      com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse result =
          new com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse(this);
      int from_bitField0_ = bitField0_;
      if (linksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          links_ = java.util.Collections.unmodifiableList(links_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.links_ = links_;
      } else {
        result.links_ = linksBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse) {
        return mergeFrom((com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse other) {
      if (other == com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse.getDefaultInstance())
        return this;
      if (linksBuilder_ == null) {
        if (!other.links_.isEmpty()) {
          if (links_.isEmpty()) {
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLinksIsMutable();
            links_.addAll(other.links_);
          }
          onChanged();
        }
      } else {
        if (!other.links_.isEmpty()) {
          if (linksBuilder_.isEmpty()) {
            linksBuilder_.dispose();
            linksBuilder_ = null;
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
            linksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getLinksFieldBuilder()
                    : null;
          } else {
            linksBuilder_.addAllMessages(other.links_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.datacatalog.lineage.v1.Link m =
                    input.readMessage(
                        com.google.cloud.datacatalog.lineage.v1.Link.parser(), extensionRegistry);
                if (linksBuilder_ == null) {
                  ensureLinksIsMutable();
                  links_.add(m);
                } else {
                  linksBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private java.util.List<com.google.cloud.datacatalog.lineage.v1.Link> links_ =
        java.util.Collections.emptyList();

    private void ensureLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        links_ = new java.util.ArrayList<com.google.cloud.datacatalog.lineage.v1.Link>(links_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.lineage.v1.Link,
            com.google.cloud.datacatalog.lineage.v1.Link.Builder,
            com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder>
        linksBuilder_;

    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.lineage.v1.Link> getLinksList() {
      if (linksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(links_);
      } else {
        return linksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public int getLinksCount() {
      if (linksBuilder_ == null) {
        return links_.size();
      } else {
        return linksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Link getLinks(int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);
      } else {
        return linksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder setLinks(int index, com.google.cloud.datacatalog.lineage.v1.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.set(index, value);
        onChanged();
      } else {
        linksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder setLinks(
        int index, com.google.cloud.datacatalog.lineage.v1.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.set(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder addLinks(com.google.cloud.datacatalog.lineage.v1.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(value);
        onChanged();
      } else {
        linksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder addLinks(int index, com.google.cloud.datacatalog.lineage.v1.Link value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(index, value);
        onChanged();
      } else {
        linksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder addLinks(com.google.cloud.datacatalog.lineage.v1.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder addLinks(
        int index, com.google.cloud.datacatalog.lineage.v1.Link.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder addAllLinks(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.lineage.v1.Link> values) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, links_);
        onChanged();
      } else {
        linksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder clearLinks() {
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        linksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public Builder removeLinks(int index) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.remove(index);
        onChanged();
      } else {
        linksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Link.Builder getLinksBuilder(int index) {
      return getLinksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder getLinksOrBuilder(int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);
      } else {
        return linksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder>
        getLinksOrBuilderList() {
      if (linksBuilder_ != null) {
        return linksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(links_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Link.Builder addLinksBuilder() {
      return getLinksFieldBuilder()
          .addBuilder(com.google.cloud.datacatalog.lineage.v1.Link.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.Link.Builder addLinksBuilder(int index) {
      return getLinksFieldBuilder()
          .addBuilder(index, com.google.cloud.datacatalog.lineage.v1.Link.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of links for a given asset. Can be empty if the asset has no
     * relations of requested type (source or target).
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.lineage.v1.Link.Builder>
        getLinksBuilderList() {
      return getLinksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.lineage.v1.Link,
            com.google.cloud.datacatalog.lineage.v1.Link.Builder,
            com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder>
        getLinksFieldBuilder() {
      if (linksBuilder_ == null) {
        linksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datacatalog.lineage.v1.Link,
                com.google.cloud.datacatalog.lineage.v1.Link.Builder,
                com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder>(
                links_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        links_ = null;
      }
      return linksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the subsequent call to get the next
     * page. Omitted if there are no more pages in the response.
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
     * The token to specify as `page_token` in the subsequent call to get the next
     * page. Omitted if there are no more pages in the response.
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
     * The token to specify as `page_token` in the subsequent call to get the next
     * page. Omitted if there are no more pages in the response.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the subsequent call to get the next
     * page. Omitted if there are no more pages in the response.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The token to specify as `page_token` in the subsequent call to get the next
     * page. Omitted if there are no more pages in the response.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.lineage.v1.SearchLinksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.lineage.v1.SearchLinksResponse)
  private static final com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse();
  }

  public static com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchLinksResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchLinksResponse>() {
        @java.lang.Override
        public SearchLinksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchLinksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchLinksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.SearchLinksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
