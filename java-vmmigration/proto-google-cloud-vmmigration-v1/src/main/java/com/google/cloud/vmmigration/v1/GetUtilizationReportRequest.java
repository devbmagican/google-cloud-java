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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * Request message for 'GetUtilizationReport' request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.GetUtilizationReportRequest}
 */
public final class GetUtilizationReportRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.GetUtilizationReportRequest)
    GetUtilizationReportRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetUtilizationReportRequest.newBuilder() to construct.
  private GetUtilizationReportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetUtilizationReportRequest() {
    name_ = "";
    view_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetUtilizationReportRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_GetUtilizationReportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_GetUtilizationReportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.GetUtilizationReportRequest.class,
            com.google.cloud.vmmigration.v1.GetUtilizationReportRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The Utilization Report name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The Utilization Report name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 2;
  private int view_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The level of details of the report.
   * Defaults to FULL
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.UtilizationReportView view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override
  public int getViewValue() {
    return view_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The level of details of the report.
   * Defaults to FULL
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.UtilizationReportView view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.UtilizationReportView getView() {
    com.google.cloud.vmmigration.v1.UtilizationReportView result =
        com.google.cloud.vmmigration.v1.UtilizationReportView.forNumber(view_);
    return result == null
        ? com.google.cloud.vmmigration.v1.UtilizationReportView.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (view_
        != com.google.cloud.vmmigration.v1.UtilizationReportView.UTILIZATION_REPORT_VIEW_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, view_);
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
    if (view_
        != com.google.cloud.vmmigration.v1.UtilizationReportView.UTILIZATION_REPORT_VIEW_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, view_);
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.GetUtilizationReportRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.GetUtilizationReportRequest other =
        (com.google.cloud.vmmigration.v1.GetUtilizationReportRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (view_ != other.view_) return false;
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
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest parseFrom(
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
      com.google.cloud.vmmigration.v1.GetUtilizationReportRequest prototype) {
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
   * Request message for 'GetUtilizationReport' request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.GetUtilizationReportRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.GetUtilizationReportRequest)
      com.google.cloud.vmmigration.v1.GetUtilizationReportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_GetUtilizationReportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_GetUtilizationReportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.GetUtilizationReportRequest.class,
              com.google.cloud.vmmigration.v1.GetUtilizationReportRequest.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.GetUtilizationReportRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      view_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_GetUtilizationReportRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.GetUtilizationReportRequest getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.GetUtilizationReportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.GetUtilizationReportRequest build() {
      com.google.cloud.vmmigration.v1.GetUtilizationReportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.GetUtilizationReportRequest buildPartial() {
      com.google.cloud.vmmigration.v1.GetUtilizationReportRequest result =
          new com.google.cloud.vmmigration.v1.GetUtilizationReportRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmmigration.v1.GetUtilizationReportRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.view_ = view_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vmmigration.v1.GetUtilizationReportRequest) {
        return mergeFrom((com.google.cloud.vmmigration.v1.GetUtilizationReportRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.GetUtilizationReportRequest other) {
      if (other == com.google.cloud.vmmigration.v1.GetUtilizationReportRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                view_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The Utilization Report name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Utilization Report name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Utilization Report name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Utilization Report name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Utilization Report name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The level of details of the report.
     * Defaults to FULL
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.UtilizationReportView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override
    public int getViewValue() {
      return view_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The level of details of the report.
     * Defaults to FULL
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.UtilizationReportView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      view_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The level of details of the report.
     * Defaults to FULL
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.UtilizationReportView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The view.
     */
    @java.lang.Override
    public com.google.cloud.vmmigration.v1.UtilizationReportView getView() {
      com.google.cloud.vmmigration.v1.UtilizationReportView result =
          com.google.cloud.vmmigration.v1.UtilizationReportView.forNumber(view_);
      return result == null
          ? com.google.cloud.vmmigration.v1.UtilizationReportView.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The level of details of the report.
     * Defaults to FULL
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.UtilizationReportView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.cloud.vmmigration.v1.UtilizationReportView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The level of details of the report.
     * Defaults to FULL
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.UtilizationReportView view = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000002);
      view_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.GetUtilizationReportRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.GetUtilizationReportRequest)
  private static final com.google.cloud.vmmigration.v1.GetUtilizationReportRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.GetUtilizationReportRequest();
  }

  public static com.google.cloud.vmmigration.v1.GetUtilizationReportRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUtilizationReportRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetUtilizationReportRequest>() {
        @java.lang.Override
        public GetUtilizationReportRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetUtilizationReportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUtilizationReportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.GetUtilizationReportRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
