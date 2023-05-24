// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 * <pre>
 * Automatically detected decoding parameters.
 * Supported for the following encodings:
 *
 * * WAV_LINEAR16: 16-bit signed little-endian PCM samples in a WAV container.
 *
 * * WAV_MULAW: 8-bit companded mulaw samples in a WAV container.
 *
 * * WAV_ALAW: 8-bit companded alaw samples in a WAV container.
 *
 * * RFC4867_5_AMR: AMR frames with an rfc4867.5 header.
 *
 * * RFC4867_5_AMRWB: AMR-WB frames with an rfc4867.5 header.
 *
 * * FLAC: FLAC frames in the "native FLAC" container format.
 *
 * * MP3: MPEG audio frames with optional (ignored) ID3 metadata.
 *
 * * OGG_OPUS: Opus audio frames in an Ogg container.
 *
 * * WEBM_OPUS: Opus audio frames in a WebM container.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.AutoDetectDecodingConfig}
 */
public final class AutoDetectDecodingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.AutoDetectDecodingConfig)
    AutoDetectDecodingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoDetectDecodingConfig.newBuilder() to construct.
  private AutoDetectDecodingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoDetectDecodingConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutoDetectDecodingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_AutoDetectDecodingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_AutoDetectDecodingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.AutoDetectDecodingConfig.class, com.google.cloud.speech.v2.AutoDetectDecodingConfig.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v2.AutoDetectDecodingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.AutoDetectDecodingConfig other = (com.google.cloud.speech.v2.AutoDetectDecodingConfig) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v2.AutoDetectDecodingConfig prototype) {
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
   * Automatically detected decoding parameters.
   * Supported for the following encodings:
   *
   * * WAV_LINEAR16: 16-bit signed little-endian PCM samples in a WAV container.
   *
   * * WAV_MULAW: 8-bit companded mulaw samples in a WAV container.
   *
   * * WAV_ALAW: 8-bit companded alaw samples in a WAV container.
   *
   * * RFC4867_5_AMR: AMR frames with an rfc4867.5 header.
   *
   * * RFC4867_5_AMRWB: AMR-WB frames with an rfc4867.5 header.
   *
   * * FLAC: FLAC frames in the "native FLAC" container format.
   *
   * * MP3: MPEG audio frames with optional (ignored) ID3 metadata.
   *
   * * OGG_OPUS: Opus audio frames in an Ogg container.
   *
   * * WEBM_OPUS: Opus audio frames in a WebM container.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.AutoDetectDecodingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.AutoDetectDecodingConfig)
      com.google.cloud.speech.v2.AutoDetectDecodingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_AutoDetectDecodingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_AutoDetectDecodingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.AutoDetectDecodingConfig.class, com.google.cloud.speech.v2.AutoDetectDecodingConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.AutoDetectDecodingConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_AutoDetectDecodingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.AutoDetectDecodingConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.AutoDetectDecodingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.AutoDetectDecodingConfig build() {
      com.google.cloud.speech.v2.AutoDetectDecodingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.AutoDetectDecodingConfig buildPartial() {
      com.google.cloud.speech.v2.AutoDetectDecodingConfig result = new com.google.cloud.speech.v2.AutoDetectDecodingConfig(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v2.AutoDetectDecodingConfig) {
        return mergeFrom((com.google.cloud.speech.v2.AutoDetectDecodingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.AutoDetectDecodingConfig other) {
      if (other == com.google.cloud.speech.v2.AutoDetectDecodingConfig.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.AutoDetectDecodingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.AutoDetectDecodingConfig)
  private static final com.google.cloud.speech.v2.AutoDetectDecodingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.AutoDetectDecodingConfig();
  }

  public static com.google.cloud.speech.v2.AutoDetectDecodingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoDetectDecodingConfig>
      PARSER = new com.google.protobuf.AbstractParser<AutoDetectDecodingConfig>() {
    @java.lang.Override
    public AutoDetectDecodingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoDetectDecodingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoDetectDecodingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.AutoDetectDecodingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

