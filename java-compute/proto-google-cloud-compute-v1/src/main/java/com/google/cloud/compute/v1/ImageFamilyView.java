/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ImageFamilyView}
 */
public final class ImageFamilyView extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ImageFamilyView)
    ImageFamilyViewOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageFamilyView.newBuilder() to construct.
  private ImageFamilyView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageFamilyView() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageFamilyView();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ImageFamilyView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ImageFamilyView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ImageFamilyView.class,
            com.google.cloud.compute.v1.ImageFamilyView.Builder.class);
  }

  private int bitField0_;
  public static final int IMAGE_FIELD_NUMBER = 100313435;
  private com.google.cloud.compute.v1.Image image_;
  /**
   *
   *
   * <pre>
   * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
   *
   * @return Whether the image field is set.
   */
  @java.lang.Override
  public boolean hasImage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
   *
   * @return The image.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Image getImage() {
    return image_ == null ? com.google.cloud.compute.v1.Image.getDefaultInstance() : image_;
  }
  /**
   *
   *
   * <pre>
   * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ImageOrBuilder getImageOrBuilder() {
    return image_ == null ? com.google.cloud.compute.v1.Image.getDefaultInstance() : image_;
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
      output.writeMessage(100313435, getImage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(100313435, getImage());
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
    if (!(obj instanceof com.google.cloud.compute.v1.ImageFamilyView)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ImageFamilyView other =
        (com.google.cloud.compute.v1.ImageFamilyView) obj;

    if (hasImage() != other.hasImage()) return false;
    if (hasImage()) {
      if (!getImage().equals(other.getImage())) return false;
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
    if (hasImage()) {
      hash = (37 * hash) + IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getImage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ImageFamilyView parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.ImageFamilyView prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ImageFamilyView}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ImageFamilyView)
      com.google.cloud.compute.v1.ImageFamilyViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ImageFamilyView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ImageFamilyView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ImageFamilyView.class,
              com.google.cloud.compute.v1.ImageFamilyView.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ImageFamilyView.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getImageFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      image_ = null;
      if (imageBuilder_ != null) {
        imageBuilder_.dispose();
        imageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ImageFamilyView_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ImageFamilyView getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ImageFamilyView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ImageFamilyView build() {
      com.google.cloud.compute.v1.ImageFamilyView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ImageFamilyView buildPartial() {
      com.google.cloud.compute.v1.ImageFamilyView result =
          new com.google.cloud.compute.v1.ImageFamilyView(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ImageFamilyView result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.image_ = imageBuilder_ == null ? image_ : imageBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.compute.v1.ImageFamilyView) {
        return mergeFrom((com.google.cloud.compute.v1.ImageFamilyView) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ImageFamilyView other) {
      if (other == com.google.cloud.compute.v1.ImageFamilyView.getDefaultInstance()) return this;
      if (other.hasImage()) {
        mergeImage(other.getImage());
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
            case 802507482:
              {
                input.readMessage(getImageFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 802507482
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

    private com.google.cloud.compute.v1.Image image_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Image,
            com.google.cloud.compute.v1.Image.Builder,
            com.google.cloud.compute.v1.ImageOrBuilder>
        imageBuilder_;
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     *
     * @return Whether the image field is set.
     */
    public boolean hasImage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     *
     * @return The image.
     */
    public com.google.cloud.compute.v1.Image getImage() {
      if (imageBuilder_ == null) {
        return image_ == null ? com.google.cloud.compute.v1.Image.getDefaultInstance() : image_;
      } else {
        return imageBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     */
    public Builder setImage(com.google.cloud.compute.v1.Image value) {
      if (imageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        image_ = value;
      } else {
        imageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     */
    public Builder setImage(com.google.cloud.compute.v1.Image.Builder builderForValue) {
      if (imageBuilder_ == null) {
        image_ = builderForValue.build();
      } else {
        imageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     */
    public Builder mergeImage(com.google.cloud.compute.v1.Image value) {
      if (imageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && image_ != null
            && image_ != com.google.cloud.compute.v1.Image.getDefaultInstance()) {
          getImageBuilder().mergeFrom(value);
        } else {
          image_ = value;
        }
      } else {
        imageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     */
    public Builder clearImage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      image_ = null;
      if (imageBuilder_ != null) {
        imageBuilder_.dispose();
        imageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     */
    public com.google.cloud.compute.v1.Image.Builder getImageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getImageFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     */
    public com.google.cloud.compute.v1.ImageOrBuilder getImageOrBuilder() {
      if (imageBuilder_ != null) {
        return imageBuilder_.getMessageOrBuilder();
      } else {
        return image_ == null ? com.google.cloud.compute.v1.Image.getDefaultInstance() : image_;
      }
    }
    /**
     *
     *
     * <pre>
     * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Image,
            com.google.cloud.compute.v1.Image.Builder,
            com.google.cloud.compute.v1.ImageOrBuilder>
        getImageFieldBuilder() {
      if (imageBuilder_ == null) {
        imageBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Image,
                com.google.cloud.compute.v1.Image.Builder,
                com.google.cloud.compute.v1.ImageOrBuilder>(
                getImage(), getParentForChildren(), isClean());
        image_ = null;
      }
      return imageBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ImageFamilyView)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ImageFamilyView)
  private static final com.google.cloud.compute.v1.ImageFamilyView DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ImageFamilyView();
  }

  public static com.google.cloud.compute.v1.ImageFamilyView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageFamilyView> PARSER =
      new com.google.protobuf.AbstractParser<ImageFamilyView>() {
        @java.lang.Override
        public ImageFamilyView parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageFamilyView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageFamilyView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ImageFamilyView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
