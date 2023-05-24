// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

/**
 * <pre>
 * A speech recognition result corresponding to a portion of the audio.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.SpeechTranscription}
 */
public final class SpeechTranscription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p1beta1.SpeechTranscription)
    SpeechTranscriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpeechTranscription.newBuilder() to construct.
  private SpeechTranscription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeechTranscription() {
    alternatives_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpeechTranscription();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_SpeechTranscription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_SpeechTranscription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription.class, com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription.Builder.class);
  }

  public static final int ALTERNATIVES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative> alternatives_;
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative> getAlternativesList() {
    return alternatives_;
  }
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList() {
    return alternatives_;
  }
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  @java.lang.Override
  public int getAlternativesCount() {
    return alternatives_.size();
  }
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative getAlternatives(int index) {
    return alternatives_.get(index);
  }
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the maximum specified
   * in `max_alternatives`).  These alternatives are ordered in terms of
   * accuracy, with the top (first) alternative being the most probable, as
   * ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index) {
    return alternatives_.get(index);
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
    for (int i = 0; i < alternatives_.size(); i++) {
      output.writeMessage(1, alternatives_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < alternatives_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, alternatives_.get(i));
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription other = (com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription) obj;

    if (!getAlternativesList()
        .equals(other.getAlternativesList())) return false;
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
    if (getAlternativesCount() > 0) {
      hash = (37 * hash) + ALTERNATIVES_FIELD_NUMBER;
      hash = (53 * hash) + getAlternativesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription parseFrom(
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
  public static Builder newBuilder(com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription prototype) {
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
   * A speech recognition result corresponding to a portion of the audio.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p1beta1.SpeechTranscription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p1beta1.SpeechTranscription)
      com.google.cloud.videointelligence.v1p1beta1.SpeechTranscriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_SpeechTranscription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_SpeechTranscription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription.class, com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription.newBuilder()
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
      if (alternativesBuilder_ == null) {
        alternatives_ = java.util.Collections.emptyList();
      } else {
        alternatives_ = null;
        alternativesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1p1beta1_SpeechTranscription_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription build() {
      com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription buildPartial() {
      com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription result = new com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription result) {
      if (alternativesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          alternatives_ = java.util.Collections.unmodifiableList(alternatives_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.alternatives_ = alternatives_;
      } else {
        result.alternatives_ = alternativesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription) {
        return mergeFrom((com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription other) {
      if (other == com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription.getDefaultInstance()) return this;
      if (alternativesBuilder_ == null) {
        if (!other.alternatives_.isEmpty()) {
          if (alternatives_.isEmpty()) {
            alternatives_ = other.alternatives_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAlternativesIsMutable();
            alternatives_.addAll(other.alternatives_);
          }
          onChanged();
        }
      } else {
        if (!other.alternatives_.isEmpty()) {
          if (alternativesBuilder_.isEmpty()) {
            alternativesBuilder_.dispose();
            alternativesBuilder_ = null;
            alternatives_ = other.alternatives_;
            bitField0_ = (bitField0_ & ~0x00000001);
            alternativesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAlternativesFieldBuilder() : null;
          } else {
            alternativesBuilder_.addAllMessages(other.alternatives_);
          }
        }
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
              com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative m =
                  input.readMessage(
                      com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.parser(),
                      extensionRegistry);
              if (alternativesBuilder_ == null) {
                ensureAlternativesIsMutable();
                alternatives_.add(m);
              } else {
                alternativesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative> alternatives_ =
      java.util.Collections.emptyList();
    private void ensureAlternativesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        alternatives_ = new java.util.ArrayList<com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative>(alternatives_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder> alternativesBuilder_;

    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative> getAlternativesList() {
      if (alternativesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alternatives_);
      } else {
        return alternativesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public int getAlternativesCount() {
      if (alternativesBuilder_ == null) {
        return alternatives_.size();
      } else {
        return alternativesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative getAlternatives(int index) {
      if (alternativesBuilder_ == null) {
        return alternatives_.get(index);
      } else {
        return alternativesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder setAlternatives(
        int index, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative value) {
      if (alternativesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternativesIsMutable();
        alternatives_.set(index, value);
        onChanged();
      } else {
        alternativesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder setAlternatives(
        int index, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder builderForValue) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.set(index, builderForValue.build());
        onChanged();
      } else {
        alternativesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative value) {
      if (alternativesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternativesIsMutable();
        alternatives_.add(value);
        onChanged();
      } else {
        alternativesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        int index, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative value) {
      if (alternativesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlternativesIsMutable();
        alternatives_.add(index, value);
        onChanged();
      } else {
        alternativesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder builderForValue) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.add(builderForValue.build());
        onChanged();
      } else {
        alternativesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAlternatives(
        int index, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder builderForValue) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.add(index, builderForValue.build());
        onChanged();
      } else {
        alternativesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder addAllAlternatives(
        java.lang.Iterable<? extends com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative> values) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alternatives_);
        onChanged();
      } else {
        alternativesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder clearAlternatives() {
      if (alternativesBuilder_ == null) {
        alternatives_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        alternativesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public Builder removeAlternatives(int index) {
      if (alternativesBuilder_ == null) {
        ensureAlternativesIsMutable();
        alternatives_.remove(index);
        onChanged();
      } else {
        alternativesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder getAlternativesBuilder(
        int index) {
      return getAlternativesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
        int index) {
      if (alternativesBuilder_ == null) {
        return alternatives_.get(index);  } else {
        return alternativesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder> 
         getAlternativesOrBuilderList() {
      if (alternativesBuilder_ != null) {
        return alternativesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alternatives_);
      }
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder addAlternativesBuilder() {
      return getAlternativesFieldBuilder().addBuilder(
          com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.getDefaultInstance());
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder addAlternativesBuilder(
        int index) {
      return getAlternativesFieldBuilder().addBuilder(
          index, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.getDefaultInstance());
    }
    /**
     * <pre>
     * May contain one or more recognition hypotheses (up to the maximum specified
     * in `max_alternatives`).  These alternatives are ordered in terms of
     * accuracy, with the top (first) alternative being the most probable, as
     * ranked by the recognizer.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder> 
         getAlternativesBuilderList() {
      return getAlternativesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder> 
        getAlternativesFieldBuilder() {
      if (alternativesBuilder_ == null) {
        alternativesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternative.Builder, com.google.cloud.videointelligence.v1p1beta1.SpeechRecognitionAlternativeOrBuilder>(
                alternatives_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        alternatives_ = null;
      }
      return alternativesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p1beta1.SpeechTranscription)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p1beta1.SpeechTranscription)
  private static final com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription();
  }

  public static com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechTranscription>
      PARSER = new com.google.protobuf.AbstractParser<SpeechTranscription>() {
    @java.lang.Override
    public SpeechTranscription parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpeechTranscription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechTranscription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p1beta1.SpeechTranscription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

