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
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * Rectangle determined by min and max `LatLng` pairs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.LatLongRect}
 */
public final class LatLongRect extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.LatLongRect)
    LatLongRectOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LatLongRect.newBuilder() to construct.
  private LatLongRect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LatLongRect() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LatLongRect();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_LatLongRect_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_LatLongRect_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.LatLongRect.class,
            com.google.cloud.vision.v1.LatLongRect.Builder.class);
  }

  public static final int MIN_LAT_LNG_FIELD_NUMBER = 1;
  private com.google.type.LatLng minLatLng_;
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   *
   * @return Whether the minLatLng field is set.
   */
  @java.lang.Override
  public boolean hasMinLatLng() {
    return minLatLng_ != null;
  }
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   *
   * @return The minLatLng.
   */
  @java.lang.Override
  public com.google.type.LatLng getMinLatLng() {
    return minLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : minLatLng_;
  }
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getMinLatLngOrBuilder() {
    return minLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : minLatLng_;
  }

  public static final int MAX_LAT_LNG_FIELD_NUMBER = 2;
  private com.google.type.LatLng maxLatLng_;
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   *
   * @return Whether the maxLatLng field is set.
   */
  @java.lang.Override
  public boolean hasMaxLatLng() {
    return maxLatLng_ != null;
  }
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   *
   * @return The maxLatLng.
   */
  @java.lang.Override
  public com.google.type.LatLng getMaxLatLng() {
    return maxLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : maxLatLng_;
  }
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getMaxLatLngOrBuilder() {
    return maxLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : maxLatLng_;
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
    if (minLatLng_ != null) {
      output.writeMessage(1, getMinLatLng());
    }
    if (maxLatLng_ != null) {
      output.writeMessage(2, getMaxLatLng());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minLatLng_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMinLatLng());
    }
    if (maxLatLng_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMaxLatLng());
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
    if (!(obj instanceof com.google.cloud.vision.v1.LatLongRect)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.LatLongRect other = (com.google.cloud.vision.v1.LatLongRect) obj;

    if (hasMinLatLng() != other.hasMinLatLng()) return false;
    if (hasMinLatLng()) {
      if (!getMinLatLng().equals(other.getMinLatLng())) return false;
    }
    if (hasMaxLatLng() != other.hasMaxLatLng()) return false;
    if (hasMaxLatLng()) {
      if (!getMaxLatLng().equals(other.getMaxLatLng())) return false;
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
    if (hasMinLatLng()) {
      hash = (37 * hash) + MIN_LAT_LNG_FIELD_NUMBER;
      hash = (53 * hash) + getMinLatLng().hashCode();
    }
    if (hasMaxLatLng()) {
      hash = (37 * hash) + MAX_LAT_LNG_FIELD_NUMBER;
      hash = (53 * hash) + getMaxLatLng().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.LatLongRect parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1.LatLongRect prototype) {
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
   * Rectangle determined by min and max `LatLng` pairs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.LatLongRect}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.LatLongRect)
      com.google.cloud.vision.v1.LatLongRectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_LatLongRect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_LatLongRect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.LatLongRect.class,
              com.google.cloud.vision.v1.LatLongRect.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.LatLongRect.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      minLatLng_ = null;
      if (minLatLngBuilder_ != null) {
        minLatLngBuilder_.dispose();
        minLatLngBuilder_ = null;
      }
      maxLatLng_ = null;
      if (maxLatLngBuilder_ != null) {
        maxLatLngBuilder_.dispose();
        maxLatLngBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_LatLongRect_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.LatLongRect getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.LatLongRect.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.LatLongRect build() {
      com.google.cloud.vision.v1.LatLongRect result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.LatLongRect buildPartial() {
      com.google.cloud.vision.v1.LatLongRect result =
          new com.google.cloud.vision.v1.LatLongRect(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1.LatLongRect result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minLatLng_ = minLatLngBuilder_ == null ? minLatLng_ : minLatLngBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxLatLng_ = maxLatLngBuilder_ == null ? maxLatLng_ : maxLatLngBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1.LatLongRect) {
        return mergeFrom((com.google.cloud.vision.v1.LatLongRect) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.LatLongRect other) {
      if (other == com.google.cloud.vision.v1.LatLongRect.getDefaultInstance()) return this;
      if (other.hasMinLatLng()) {
        mergeMinLatLng(other.getMinLatLng());
      }
      if (other.hasMaxLatLng()) {
        mergeMaxLatLng(other.getMaxLatLng());
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
                input.readMessage(getMinLatLngFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getMaxLatLngFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.type.LatLng minLatLng_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        minLatLngBuilder_;
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     *
     * @return Whether the minLatLng field is set.
     */
    public boolean hasMinLatLng() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     *
     * @return The minLatLng.
     */
    public com.google.type.LatLng getMinLatLng() {
      if (minLatLngBuilder_ == null) {
        return minLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : minLatLng_;
      } else {
        return minLatLngBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder setMinLatLng(com.google.type.LatLng value) {
      if (minLatLngBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minLatLng_ = value;
      } else {
        minLatLngBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder setMinLatLng(com.google.type.LatLng.Builder builderForValue) {
      if (minLatLngBuilder_ == null) {
        minLatLng_ = builderForValue.build();
      } else {
        minLatLngBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder mergeMinLatLng(com.google.type.LatLng value) {
      if (minLatLngBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && minLatLng_ != null
            && minLatLng_ != com.google.type.LatLng.getDefaultInstance()) {
          getMinLatLngBuilder().mergeFrom(value);
        } else {
          minLatLng_ = value;
        }
      } else {
        minLatLngBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder clearMinLatLng() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minLatLng_ = null;
      if (minLatLngBuilder_ != null) {
        minLatLngBuilder_.dispose();
        minLatLngBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public com.google.type.LatLng.Builder getMinLatLngBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMinLatLngFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getMinLatLngOrBuilder() {
      if (minLatLngBuilder_ != null) {
        return minLatLngBuilder_.getMessageOrBuilder();
      } else {
        return minLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : minLatLng_;
      }
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getMinLatLngFieldBuilder() {
      if (minLatLngBuilder_ == null) {
        minLatLngBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getMinLatLng(), getParentForChildren(), isClean());
        minLatLng_ = null;
      }
      return minLatLngBuilder_;
    }

    private com.google.type.LatLng maxLatLng_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        maxLatLngBuilder_;
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     *
     * @return Whether the maxLatLng field is set.
     */
    public boolean hasMaxLatLng() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     *
     * @return The maxLatLng.
     */
    public com.google.type.LatLng getMaxLatLng() {
      if (maxLatLngBuilder_ == null) {
        return maxLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : maxLatLng_;
      } else {
        return maxLatLngBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder setMaxLatLng(com.google.type.LatLng value) {
      if (maxLatLngBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxLatLng_ = value;
      } else {
        maxLatLngBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder setMaxLatLng(com.google.type.LatLng.Builder builderForValue) {
      if (maxLatLngBuilder_ == null) {
        maxLatLng_ = builderForValue.build();
      } else {
        maxLatLngBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder mergeMaxLatLng(com.google.type.LatLng value) {
      if (maxLatLngBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && maxLatLng_ != null
            && maxLatLng_ != com.google.type.LatLng.getDefaultInstance()) {
          getMaxLatLngBuilder().mergeFrom(value);
        } else {
          maxLatLng_ = value;
        }
      } else {
        maxLatLngBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder clearMaxLatLng() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxLatLng_ = null;
      if (maxLatLngBuilder_ != null) {
        maxLatLngBuilder_.dispose();
        maxLatLngBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public com.google.type.LatLng.Builder getMaxLatLngBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMaxLatLngFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public com.google.type.LatLngOrBuilder getMaxLatLngOrBuilder() {
      if (maxLatLngBuilder_ != null) {
        return maxLatLngBuilder_.getMessageOrBuilder();
      } else {
        return maxLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : maxLatLng_;
      }
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getMaxLatLngFieldBuilder() {
      if (maxLatLngBuilder_ == null) {
        maxLatLngBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getMaxLatLng(), getParentForChildren(), isClean());
        maxLatLng_ = null;
      }
      return maxLatLngBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.LatLongRect)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.LatLongRect)
  private static final com.google.cloud.vision.v1.LatLongRect DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.LatLongRect();
  }

  public static com.google.cloud.vision.v1.LatLongRect getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatLongRect> PARSER =
      new com.google.protobuf.AbstractParser<LatLongRect>() {
        @java.lang.Override
        public LatLongRect parsePartialFrom(
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

  public static com.google.protobuf.Parser<LatLongRect> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatLongRect> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.LatLongRect getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
