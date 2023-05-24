// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 * <pre>
 * Operation metadata for
 * [BatchRecognize][google.cloud.speech.v2.Speech.BatchRecognize].
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.BatchRecognizeMetadata}
 */
public final class BatchRecognizeMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.BatchRecognizeMetadata)
    BatchRecognizeMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchRecognizeMetadata.newBuilder() to construct.
  private BatchRecognizeMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchRecognizeMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchRecognizeMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_BatchRecognizeMetadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetTranscriptionMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_BatchRecognizeMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.BatchRecognizeMetadata.class, com.google.cloud.speech.v2.BatchRecognizeMetadata.Builder.class);
  }

  public static final int TRANSCRIPTION_METADATA_FIELD_NUMBER = 1;
  private static final class TranscriptionMetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>newDefaultInstance(
                com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_BatchRecognizeMetadata_TranscriptionMetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> transcriptionMetadata_;
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
  internalGetTranscriptionMetadata() {
    if (transcriptionMetadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TranscriptionMetadataDefaultEntryHolder.defaultEntry);
    }
    return transcriptionMetadata_;
  }
  public int getTranscriptionMetadataCount() {
    return internalGetTranscriptionMetadata().getMap().size();
  }
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  @java.lang.Override
  public boolean containsTranscriptionMetadata(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetTranscriptionMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getTranscriptionMetadataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> getTranscriptionMetadata() {
    return getTranscriptionMetadataMap();
  }
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> getTranscriptionMetadataMap() {
    return internalGetTranscriptionMetadata().getMap();
  }
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata getTranscriptionMetadataOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> map =
        internalGetTranscriptionMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata getTranscriptionMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> map =
        internalGetTranscriptionMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetTranscriptionMetadata(),
        TranscriptionMetadataDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> entry
         : internalGetTranscriptionMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
      transcriptionMetadata__ = TranscriptionMetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, transcriptionMetadata__);
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
    if (!(obj instanceof com.google.cloud.speech.v2.BatchRecognizeMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.BatchRecognizeMetadata other = (com.google.cloud.speech.v2.BatchRecognizeMetadata) obj;

    if (!internalGetTranscriptionMetadata().equals(
        other.internalGetTranscriptionMetadata())) return false;
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
    if (!internalGetTranscriptionMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + TRANSCRIPTION_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetTranscriptionMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.BatchRecognizeMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v2.BatchRecognizeMetadata prototype) {
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
   * Operation metadata for
   * [BatchRecognize][google.cloud.speech.v2.Speech.BatchRecognize].
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.BatchRecognizeMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.BatchRecognizeMetadata)
      com.google.cloud.speech.v2.BatchRecognizeMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_BatchRecognizeMetadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetTranscriptionMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableTranscriptionMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_BatchRecognizeMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.BatchRecognizeMetadata.class, com.google.cloud.speech.v2.BatchRecognizeMetadata.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.BatchRecognizeMetadata.newBuilder()
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
      internalGetMutableTranscriptionMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_BatchRecognizeMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeMetadata getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.BatchRecognizeMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeMetadata build() {
      com.google.cloud.speech.v2.BatchRecognizeMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeMetadata buildPartial() {
      com.google.cloud.speech.v2.BatchRecognizeMetadata result = new com.google.cloud.speech.v2.BatchRecognizeMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v2.BatchRecognizeMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transcriptionMetadata_ = internalGetTranscriptionMetadata();
        result.transcriptionMetadata_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v2.BatchRecognizeMetadata) {
        return mergeFrom((com.google.cloud.speech.v2.BatchRecognizeMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.BatchRecognizeMetadata other) {
      if (other == com.google.cloud.speech.v2.BatchRecognizeMetadata.getDefaultInstance()) return this;
      internalGetMutableTranscriptionMetadata().mergeFrom(
          other.internalGetTranscriptionMetadata());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
              transcriptionMetadata__ = input.readMessage(
                  TranscriptionMetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableTranscriptionMetadata().getMutableMap().put(
                  transcriptionMetadata__.getKey(), transcriptionMetadata__.getValue());
              bitField0_ |= 0x00000001;
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

    private com.google.protobuf.MapField<
        java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> transcriptionMetadata_;
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
        internalGetTranscriptionMetadata() {
      if (transcriptionMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TranscriptionMetadataDefaultEntryHolder.defaultEntry);
      }
      return transcriptionMetadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
        internalGetMutableTranscriptionMetadata() {
      if (transcriptionMetadata_ == null) {
        transcriptionMetadata_ = com.google.protobuf.MapField.newMapField(
            TranscriptionMetadataDefaultEntryHolder.defaultEntry);
      }
      if (!transcriptionMetadata_.isMutable()) {
        transcriptionMetadata_ = transcriptionMetadata_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return transcriptionMetadata_;
    }
    public int getTranscriptionMetadataCount() {
      return internalGetTranscriptionMetadata().getMap().size();
    }
    /**
     * <pre>
     * Map from provided filename to the transcription metadata for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
     */
    @java.lang.Override
    public boolean containsTranscriptionMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetTranscriptionMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTranscriptionMetadataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> getTranscriptionMetadata() {
      return getTranscriptionMetadataMap();
    }
    /**
     * <pre>
     * Map from provided filename to the transcription metadata for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> getTranscriptionMetadataMap() {
      return internalGetTranscriptionMetadata().getMap();
    }
    /**
     * <pre>
     * Map from provided filename to the transcription metadata for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata getTranscriptionMetadataOrDefault(
        java.lang.String key,
        /* nullable */
com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> map =
          internalGetTranscriptionMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map from provided filename to the transcription metadata for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata getTranscriptionMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> map =
          internalGetTranscriptionMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearTranscriptionMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableTranscriptionMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Map from provided filename to the transcription metadata for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
     */
    public Builder removeTranscriptionMetadata(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableTranscriptionMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
        getMutableTranscriptionMetadata() {
      bitField0_ |= 0x00000001;
      return internalGetMutableTranscriptionMetadata().getMutableMap();
    }
    /**
     * <pre>
     * Map from provided filename to the transcription metadata for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
     */
    public Builder putTranscriptionMetadata(
        java.lang.String key,
        com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableTranscriptionMetadata().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Map from provided filename to the transcription metadata for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
     */
    public Builder putAllTranscriptionMetadata(
        java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata> values) {
      internalGetMutableTranscriptionMetadata().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.BatchRecognizeMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.BatchRecognizeMetadata)
  private static final com.google.cloud.speech.v2.BatchRecognizeMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.BatchRecognizeMetadata();
  }

  public static com.google.cloud.speech.v2.BatchRecognizeMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRecognizeMetadata>
      PARSER = new com.google.protobuf.AbstractParser<BatchRecognizeMetadata>() {
    @java.lang.Override
    public BatchRecognizeMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchRecognizeMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRecognizeMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.BatchRecognizeMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

