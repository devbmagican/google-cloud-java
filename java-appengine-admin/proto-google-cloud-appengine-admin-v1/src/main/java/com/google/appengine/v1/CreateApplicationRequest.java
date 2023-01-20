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
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Request message for `Applications.CreateApplication`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CreateApplicationRequest}
 */
public final class CreateApplicationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CreateApplicationRequest)
    CreateApplicationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateApplicationRequest.newBuilder() to construct.
  private CreateApplicationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateApplicationRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateApplicationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_CreateApplicationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_CreateApplicationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CreateApplicationRequest.class,
            com.google.appengine.v1.CreateApplicationRequest.Builder.class);
  }

  public static final int APPLICATION_FIELD_NUMBER = 2;
  private com.google.appengine.v1.Application application_;
  /**
   *
   *
   * <pre>
   * Application configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.Application application = 2;</code>
   *
   * @return Whether the application field is set.
   */
  @java.lang.Override
  public boolean hasApplication() {
    return application_ != null;
  }
  /**
   *
   *
   * <pre>
   * Application configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.Application application = 2;</code>
   *
   * @return The application.
   */
  @java.lang.Override
  public com.google.appengine.v1.Application getApplication() {
    return application_ == null
        ? com.google.appengine.v1.Application.getDefaultInstance()
        : application_;
  }
  /**
   *
   *
   * <pre>
   * Application configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.Application application = 2;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.ApplicationOrBuilder getApplicationOrBuilder() {
    return application_ == null
        ? com.google.appengine.v1.Application.getDefaultInstance()
        : application_;
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
    if (application_ != null) {
      output.writeMessage(2, getApplication());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (application_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getApplication());
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
    if (!(obj instanceof com.google.appengine.v1.CreateApplicationRequest)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CreateApplicationRequest other =
        (com.google.appengine.v1.CreateApplicationRequest) obj;

    if (hasApplication() != other.hasApplication()) return false;
    if (hasApplication()) {
      if (!getApplication().equals(other.getApplication())) return false;
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
    if (hasApplication()) {
      hash = (37 * hash) + APPLICATION_FIELD_NUMBER;
      hash = (53 * hash) + getApplication().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CreateApplicationRequest parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.CreateApplicationRequest prototype) {
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
   * Request message for `Applications.CreateApplication`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CreateApplicationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CreateApplicationRequest)
      com.google.appengine.v1.CreateApplicationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_CreateApplicationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_CreateApplicationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CreateApplicationRequest.class,
              com.google.appengine.v1.CreateApplicationRequest.Builder.class);
    }

    // Construct using com.google.appengine.v1.CreateApplicationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      application_ = null;
      if (applicationBuilder_ != null) {
        applicationBuilder_.dispose();
        applicationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_CreateApplicationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateApplicationRequest getDefaultInstanceForType() {
      return com.google.appengine.v1.CreateApplicationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateApplicationRequest build() {
      com.google.appengine.v1.CreateApplicationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateApplicationRequest buildPartial() {
      com.google.appengine.v1.CreateApplicationRequest result =
          new com.google.appengine.v1.CreateApplicationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.CreateApplicationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.application_ =
            applicationBuilder_ == null ? application_ : applicationBuilder_.build();
      }
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
      if (other instanceof com.google.appengine.v1.CreateApplicationRequest) {
        return mergeFrom((com.google.appengine.v1.CreateApplicationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CreateApplicationRequest other) {
      if (other == com.google.appengine.v1.CreateApplicationRequest.getDefaultInstance())
        return this;
      if (other.hasApplication()) {
        mergeApplication(other.getApplication());
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
            case 18:
              {
                input.readMessage(getApplicationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.appengine.v1.Application application_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.Application,
            com.google.appengine.v1.Application.Builder,
            com.google.appengine.v1.ApplicationOrBuilder>
        applicationBuilder_;
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     *
     * @return Whether the application field is set.
     */
    public boolean hasApplication() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     *
     * @return The application.
     */
    public com.google.appengine.v1.Application getApplication() {
      if (applicationBuilder_ == null) {
        return application_ == null
            ? com.google.appengine.v1.Application.getDefaultInstance()
            : application_;
      } else {
        return applicationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     */
    public Builder setApplication(com.google.appengine.v1.Application value) {
      if (applicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        application_ = value;
      } else {
        applicationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     */
    public Builder setApplication(com.google.appengine.v1.Application.Builder builderForValue) {
      if (applicationBuilder_ == null) {
        application_ = builderForValue.build();
      } else {
        applicationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     */
    public Builder mergeApplication(com.google.appengine.v1.Application value) {
      if (applicationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && application_ != null
            && application_ != com.google.appengine.v1.Application.getDefaultInstance()) {
          getApplicationBuilder().mergeFrom(value);
        } else {
          application_ = value;
        }
      } else {
        applicationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     */
    public Builder clearApplication() {
      bitField0_ = (bitField0_ & ~0x00000001);
      application_ = null;
      if (applicationBuilder_ != null) {
        applicationBuilder_.dispose();
        applicationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     */
    public com.google.appengine.v1.Application.Builder getApplicationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getApplicationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     */
    public com.google.appengine.v1.ApplicationOrBuilder getApplicationOrBuilder() {
      if (applicationBuilder_ != null) {
        return applicationBuilder_.getMessageOrBuilder();
      } else {
        return application_ == null
            ? com.google.appengine.v1.Application.getDefaultInstance()
            : application_;
      }
    }
    /**
     *
     *
     * <pre>
     * Application configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.Application application = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.Application,
            com.google.appengine.v1.Application.Builder,
            com.google.appengine.v1.ApplicationOrBuilder>
        getApplicationFieldBuilder() {
      if (applicationBuilder_ == null) {
        applicationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.appengine.v1.Application,
                com.google.appengine.v1.Application.Builder,
                com.google.appengine.v1.ApplicationOrBuilder>(
                getApplication(), getParentForChildren(), isClean());
        application_ = null;
      }
      return applicationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CreateApplicationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CreateApplicationRequest)
  private static final com.google.appengine.v1.CreateApplicationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CreateApplicationRequest();
  }

  public static com.google.appengine.v1.CreateApplicationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateApplicationRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateApplicationRequest>() {
        @java.lang.Override
        public CreateApplicationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateApplicationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateApplicationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.CreateApplicationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
