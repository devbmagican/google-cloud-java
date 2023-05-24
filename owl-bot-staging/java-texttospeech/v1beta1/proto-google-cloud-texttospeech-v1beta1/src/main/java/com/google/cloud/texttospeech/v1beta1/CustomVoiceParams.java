// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

package com.google.cloud.texttospeech.v1beta1;

/**
 * <pre>
 * Description of the custom voice to be synthesized.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1beta1.CustomVoiceParams}
 */
public final class CustomVoiceParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1beta1.CustomVoiceParams)
    CustomVoiceParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomVoiceParams.newBuilder() to construct.
  private CustomVoiceParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomVoiceParams() {
    model_ = "";
    reportedUsage_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomVoiceParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.class, com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.Builder.class);
  }

  /**
   * <pre>
   * The usage of the synthesized audio. You must report your honest and
   * correct usage of the service as it's regulated by contract and will cause
   * significant difference in billing.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage}
   */
  public enum ReportedUsage
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Request with reported usage unspecified will be rejected.
     * </pre>
     *
     * <code>REPORTED_USAGE_UNSPECIFIED = 0;</code>
     */
    REPORTED_USAGE_UNSPECIFIED(0),
    /**
     * <pre>
     * For scenarios where the synthesized audio is not downloadable and can
     * only be used once. For example, real-time request in IVR system.
     * </pre>
     *
     * <code>REALTIME = 1;</code>
     */
    REALTIME(1),
    /**
     * <pre>
     * For scenarios where the synthesized audio is downloadable and can be
     * reused. For example, the synthesized audio is downloaded, stored in
     * customer service system and played repeatedly.
     * </pre>
     *
     * <code>OFFLINE = 2;</code>
     */
    OFFLINE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Request with reported usage unspecified will be rejected.
     * </pre>
     *
     * <code>REPORTED_USAGE_UNSPECIFIED = 0;</code>
     */
    public static final int REPORTED_USAGE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * For scenarios where the synthesized audio is not downloadable and can
     * only be used once. For example, real-time request in IVR system.
     * </pre>
     *
     * <code>REALTIME = 1;</code>
     */
    public static final int REALTIME_VALUE = 1;
    /**
     * <pre>
     * For scenarios where the synthesized audio is downloadable and can be
     * reused. For example, the synthesized audio is downloaded, stored in
     * customer service system and played repeatedly.
     * </pre>
     *
     * <code>OFFLINE = 2;</code>
     */
    public static final int OFFLINE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReportedUsage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReportedUsage forNumber(int value) {
      switch (value) {
        case 0: return REPORTED_USAGE_UNSPECIFIED;
        case 1: return REALTIME;
        case 2: return OFFLINE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReportedUsage>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReportedUsage> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReportedUsage>() {
            public ReportedUsage findValueByNumber(int number) {
              return ReportedUsage.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReportedUsage[] VALUES = values();

    public static ReportedUsage valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReportedUsage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage)
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object model_ = "";
  /**
   * <pre>
   * Required. The name of the AutoML model that synthesizes the custom voice.
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the AutoML model that synthesizes the custom voice.
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORTED_USAGE_FIELD_NUMBER = 3;
  private int reportedUsage_ = 0;
  /**
   * <pre>
   * Optional. The usage of the synthesized audio to be reported.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for reportedUsage.
   */
  @java.lang.Override public int getReportedUsageValue() {
    return reportedUsage_;
  }
  /**
   * <pre>
   * Optional. The usage of the synthesized audio to be reported.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The reportedUsage.
   */
  @java.lang.Override public com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage getReportedUsage() {
    com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage result = com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.forNumber(reportedUsage_);
    return result == null ? com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    if (reportedUsage_ != com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.REPORTED_USAGE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, reportedUsage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
    }
    if (reportedUsage_ != com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.REPORTED_USAGE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, reportedUsage_);
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1beta1.CustomVoiceParams)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1beta1.CustomVoiceParams other = (com.google.cloud.texttospeech.v1beta1.CustomVoiceParams) obj;

    if (!getModel()
        .equals(other.getModel())) return false;
    if (reportedUsage_ != other.reportedUsage_) return false;
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
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + REPORTED_USAGE_FIELD_NUMBER;
    hash = (53 * hash) + reportedUsage_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams parseFrom(
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
  public static Builder newBuilder(com.google.cloud.texttospeech.v1beta1.CustomVoiceParams prototype) {
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
   * Description of the custom voice to be synthesized.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1beta1.CustomVoiceParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1beta1.CustomVoiceParams)
      com.google.cloud.texttospeech.v1beta1.CustomVoiceParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.class, com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.newBuilder()
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
      model_ = "";
      reportedUsage_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.CustomVoiceParams getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.CustomVoiceParams build() {
      com.google.cloud.texttospeech.v1beta1.CustomVoiceParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.CustomVoiceParams buildPartial() {
      com.google.cloud.texttospeech.v1beta1.CustomVoiceParams result = new com.google.cloud.texttospeech.v1beta1.CustomVoiceParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.texttospeech.v1beta1.CustomVoiceParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.model_ = model_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reportedUsage_ = reportedUsage_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.texttospeech.v1beta1.CustomVoiceParams) {
        return mergeFrom((com.google.cloud.texttospeech.v1beta1.CustomVoiceParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1beta1.CustomVoiceParams other) {
      if (other == com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.getDefaultInstance()) return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.reportedUsage_ != 0) {
        setReportedUsageValue(other.getReportedUsageValue());
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
              model_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 24: {
              reportedUsage_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private java.lang.Object model_ = "";
    /**
     * <pre>
     * Required. The name of the AutoML model that synthesizes the custom voice.
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the AutoML model that synthesizes the custom voice.
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the AutoML model that synthesizes the custom voice.
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      model_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the AutoML model that synthesizes the custom voice.
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      model_ = getDefaultInstance().getModel();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the AutoML model that synthesizes the custom voice.
     * </pre>
     *
     * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      model_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int reportedUsage_ = 0;
    /**
     * <pre>
     * Optional. The usage of the synthesized audio to be reported.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The enum numeric value on the wire for reportedUsage.
     */
    @java.lang.Override public int getReportedUsageValue() {
      return reportedUsage_;
    }
    /**
     * <pre>
     * Optional. The usage of the synthesized audio to be reported.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The enum numeric value on the wire for reportedUsage to set.
     * @return This builder for chaining.
     */
    public Builder setReportedUsageValue(int value) {
      reportedUsage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The usage of the synthesized audio to be reported.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The reportedUsage.
     */
    @java.lang.Override
    public com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage getReportedUsage() {
      com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage result = com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.forNumber(reportedUsage_);
      return result == null ? com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. The usage of the synthesized audio to be reported.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The reportedUsage to set.
     * @return This builder for chaining.
     */
    public Builder setReportedUsage(com.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      reportedUsage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The usage of the synthesized audio to be reported.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1beta1.CustomVoiceParams.ReportedUsage reported_usage = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearReportedUsage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reportedUsage_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1beta1.CustomVoiceParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1beta1.CustomVoiceParams)
  private static final com.google.cloud.texttospeech.v1beta1.CustomVoiceParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1beta1.CustomVoiceParams();
  }

  public static com.google.cloud.texttospeech.v1beta1.CustomVoiceParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomVoiceParams>
      PARSER = new com.google.protobuf.AbstractParser<CustomVoiceParams>() {
    @java.lang.Override
    public CustomVoiceParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomVoiceParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomVoiceParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.texttospeech.v1beta1.CustomVoiceParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

