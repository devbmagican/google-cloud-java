// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

/**
 * <pre>
 * A generic detected landmark represented by name in string format and a 2D
 * location.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.DetectedLandmark}
 */
public final class DetectedLandmark extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p3beta1.DetectedLandmark)
    DetectedLandmarkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DetectedLandmark.newBuilder() to construct.
  private DetectedLandmark(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DetectedLandmark() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DetectedLandmark();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_DetectedLandmark_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_DetectedLandmark_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark.class, com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of this landmark, for example, left_hand, right_shoulder.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * The name of this landmark, for example, left_hand, right_shoulder.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int POINT_FIELD_NUMBER = 2;
  private com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point_;
  /**
   * <pre>
   * The 2D point of the detected landmark using the normalized image
   * coordindate system. The normalized coordinates have the range from 0 to 1.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
   * @return Whether the point field is set.
   */
  @java.lang.Override
  public boolean hasPoint() {
    return point_ != null;
  }
  /**
   * <pre>
   * The 2D point of the detected landmark using the normalized image
   * coordindate system. The normalized coordinates have the range from 0 to 1.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
   * @return The point.
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex getPoint() {
    return point_ == null ? com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.getDefaultInstance() : point_;
  }
  /**
   * <pre>
   * The 2D point of the detected landmark using the normalized image
   * coordindate system. The normalized coordinates have the range from 0 to 1.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.NormalizedVertexOrBuilder getPointOrBuilder() {
    return point_ == null ? com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.getDefaultInstance() : point_;
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 3;
  private float confidence_ = 0F;
  /**
   * <pre>
   * The confidence score of the detected landmark. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 3;</code>
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
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
    if (point_ != null) {
      output.writeMessage(2, getPoint());
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      output.writeFloat(3, confidence_);
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
    if (point_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPoint());
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, confidence_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark other = (com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasPoint() != other.hasPoint()) return false;
    if (hasPoint()) {
      if (!getPoint()
          .equals(other.getPoint())) return false;
    }
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(
            other.getConfidence())) return false;
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
    if (hasPoint()) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPoint().hashCode();
    }
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getConfidence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark prototype) {
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
   * A generic detected landmark represented by name in string format and a 2D
   * location.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.DetectedLandmark}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p3beta1.DetectedLandmark)
      com.google.cloud.videointelligence.v1p3beta1.DetectedLandmarkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_DetectedLandmark_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_DetectedLandmark_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark.class, com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark.newBuilder()
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
      point_ = null;
      if (pointBuilder_ != null) {
        pointBuilder_.dispose();
        pointBuilder_ = null;
      }
      confidence_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p3beta1_DetectedLandmark_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark build() {
      com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark buildPartial() {
      com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark result = new com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.point_ = pointBuilder_ == null
            ? point_
            : pointBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.confidence_ = confidence_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark) {
        return mergeFrom((com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark other) {
      if (other == com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPoint()) {
        mergePoint(other.getPoint());
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
              input.readMessage(
                  getPointFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 29: {
              confidence_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
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
     * The name of this landmark, for example, left_hand, right_shoulder.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of this landmark, for example, left_hand, right_shoulder.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of this landmark, for example, left_hand, right_shoulder.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of this landmark, for example, left_hand, right_shoulder.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * The name of this landmark, for example, left_hand, right_shoulder.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex, com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.Builder, com.google.cloud.videointelligence.v1p3beta1.NormalizedVertexOrBuilder> pointBuilder_;
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     * @return Whether the point field is set.
     */
    public boolean hasPoint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     * @return The point.
     */
    public com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex getPoint() {
      if (pointBuilder_ == null) {
        return point_ == null ? com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.getDefaultInstance() : point_;
      } else {
        return pointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     */
    public Builder setPoint(com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point_ = value;
      } else {
        pointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     */
    public Builder setPoint(
        com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.Builder builderForValue) {
      if (pointBuilder_ == null) {
        point_ = builderForValue.build();
      } else {
        pointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     */
    public Builder mergePoint(com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex value) {
      if (pointBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          point_ != null &&
          point_ != com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.getDefaultInstance()) {
          getPointBuilder().mergeFrom(value);
        } else {
          point_ = value;
        }
      } else {
        pointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     */
    public Builder clearPoint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      point_ = null;
      if (pointBuilder_ != null) {
        pointBuilder_.dispose();
        pointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.Builder getPointBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     */
    public com.google.cloud.videointelligence.v1p3beta1.NormalizedVertexOrBuilder getPointOrBuilder() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilder();
      } else {
        return point_ == null ?
            com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.getDefaultInstance() : point_;
      }
    }
    /**
     * <pre>
     * The 2D point of the detected landmark using the normalized image
     * coordindate system. The normalized coordinates have the range from 0 to 1.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1p3beta1.NormalizedVertex point = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex, com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.Builder, com.google.cloud.videointelligence.v1p3beta1.NormalizedVertexOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex, com.google.cloud.videointelligence.v1p3beta1.NormalizedVertex.Builder, com.google.cloud.videointelligence.v1p3beta1.NormalizedVertexOrBuilder>(
                getPoint(),
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      return pointBuilder_;
    }

    private float confidence_ ;
    /**
     * <pre>
     * The confidence score of the detected landmark. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 3;</code>
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     * <pre>
     * The confidence score of the detected landmark. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 3;</code>
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The confidence score of the detected landmark. Range [0, 1].
     * </pre>
     *
     * <code>float confidence = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      bitField0_ = (bitField0_ & ~0x00000004);
      confidence_ = 0F;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p3beta1.DetectedLandmark)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p3beta1.DetectedLandmark)
  private static final com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark();
  }

  public static com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DetectedLandmark>
      PARSER = new com.google.protobuf.AbstractParser<DetectedLandmark>() {
    @java.lang.Override
    public DetectedLandmark parsePartialFrom(
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

  public static com.google.protobuf.Parser<DetectedLandmark> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DetectedLandmark> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.DetectedLandmark getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

