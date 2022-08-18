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
// source: google/cloud/datalabeling/v1beta1/evaluation_job.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Records a failed evaluation job run.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.Attempt}
 */
public final class Attempt extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.Attempt)
    AttemptOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Attempt.newBuilder() to construct.
  private Attempt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Attempt() {
    partialFailures_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Attempt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Attempt(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (attemptTime_ != null) {
                subBuilder = attemptTime_.toBuilder();
              }
              attemptTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(attemptTime_);
                attemptTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                partialFailures_ = new java.util.ArrayList<com.google.rpc.Status>();
                mutable_bitField0_ |= 0x00000001;
              }
              partialFailures_.add(
                  input.readMessage(com.google.rpc.Status.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        partialFailures_ = java.util.Collections.unmodifiableList(partialFailures_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.Attempt.class,
            com.google.cloud.datalabeling.v1beta1.Attempt.Builder.class);
  }

  public static final int ATTEMPT_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp attemptTime_;
  /**
   * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
   *
   * @return Whether the attemptTime field is set.
   */
  @java.lang.Override
  public boolean hasAttemptTime() {
    return attemptTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
   *
   * @return The attemptTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAttemptTime() {
    return attemptTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : attemptTime_;
  }
  /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getAttemptTimeOrBuilder() {
    return getAttemptTime();
  }

  public static final int PARTIAL_FAILURES_FIELD_NUMBER = 2;
  private java.util.List<com.google.rpc.Status> partialFailures_;
  /**
   *
   *
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.Status> getPartialFailuresList() {
    return partialFailures_;
  }
  /**
   *
   *
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.rpc.StatusOrBuilder>
      getPartialFailuresOrBuilderList() {
    return partialFailures_;
  }
  /**
   *
   *
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public int getPartialFailuresCount() {
    return partialFailures_.size();
  }
  /**
   *
   *
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getPartialFailures(int index) {
    return partialFailures_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(int index) {
    return partialFailures_.get(index);
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
    if (attemptTime_ != null) {
      output.writeMessage(1, getAttemptTime());
    }
    for (int i = 0; i < partialFailures_.size(); i++) {
      output.writeMessage(2, partialFailures_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attemptTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAttemptTime());
    }
    for (int i = 0; i < partialFailures_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, partialFailures_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.Attempt)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.Attempt other =
        (com.google.cloud.datalabeling.v1beta1.Attempt) obj;

    if (hasAttemptTime() != other.hasAttemptTime()) return false;
    if (hasAttemptTime()) {
      if (!getAttemptTime().equals(other.getAttemptTime())) return false;
    }
    if (!getPartialFailuresList().equals(other.getPartialFailuresList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAttemptTime()) {
      hash = (37 * hash) + ATTEMPT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getAttemptTime().hashCode();
    }
    if (getPartialFailuresCount() > 0) {
      hash = (37 * hash) + PARTIAL_FAILURES_FIELD_NUMBER;
      hash = (53 * hash) + getPartialFailuresList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.Attempt prototype) {
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
   * Records a failed evaluation job run.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.Attempt}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.Attempt)
      com.google.cloud.datalabeling.v1beta1.AttemptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.Attempt.class,
              com.google.cloud.datalabeling.v1beta1.Attempt.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.Attempt.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPartialFailuresFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (attemptTimeBuilder_ == null) {
        attemptTime_ = null;
      } else {
        attemptTime_ = null;
        attemptTimeBuilder_ = null;
      }
      if (partialFailuresBuilder_ == null) {
        partialFailures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        partialFailuresBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Attempt getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.Attempt.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Attempt build() {
      com.google.cloud.datalabeling.v1beta1.Attempt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Attempt buildPartial() {
      com.google.cloud.datalabeling.v1beta1.Attempt result =
          new com.google.cloud.datalabeling.v1beta1.Attempt(this);
      int from_bitField0_ = bitField0_;
      if (attemptTimeBuilder_ == null) {
        result.attemptTime_ = attemptTime_;
      } else {
        result.attemptTime_ = attemptTimeBuilder_.build();
      }
      if (partialFailuresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          partialFailures_ = java.util.Collections.unmodifiableList(partialFailures_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.partialFailures_ = partialFailures_;
      } else {
        result.partialFailures_ = partialFailuresBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.Attempt) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.Attempt) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.Attempt other) {
      if (other == com.google.cloud.datalabeling.v1beta1.Attempt.getDefaultInstance()) return this;
      if (other.hasAttemptTime()) {
        mergeAttemptTime(other.getAttemptTime());
      }
      if (partialFailuresBuilder_ == null) {
        if (!other.partialFailures_.isEmpty()) {
          if (partialFailures_.isEmpty()) {
            partialFailures_ = other.partialFailures_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartialFailuresIsMutable();
            partialFailures_.addAll(other.partialFailures_);
          }
          onChanged();
        }
      } else {
        if (!other.partialFailures_.isEmpty()) {
          if (partialFailuresBuilder_.isEmpty()) {
            partialFailuresBuilder_.dispose();
            partialFailuresBuilder_ = null;
            partialFailures_ = other.partialFailures_;
            bitField0_ = (bitField0_ & ~0x00000001);
            partialFailuresBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPartialFailuresFieldBuilder()
                    : null;
          } else {
            partialFailuresBuilder_.addAllMessages(other.partialFailures_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.datalabeling.v1beta1.Attempt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datalabeling.v1beta1.Attempt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Timestamp attemptTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        attemptTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     *
     * @return Whether the attemptTime field is set.
     */
    public boolean hasAttemptTime() {
      return attemptTimeBuilder_ != null || attemptTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     *
     * @return The attemptTime.
     */
    public com.google.protobuf.Timestamp getAttemptTime() {
      if (attemptTimeBuilder_ == null) {
        return attemptTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : attemptTime_;
      } else {
        return attemptTimeBuilder_.getMessage();
      }
    }
    /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
    public Builder setAttemptTime(com.google.protobuf.Timestamp value) {
      if (attemptTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attemptTime_ = value;
        onChanged();
      } else {
        attemptTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
    public Builder setAttemptTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (attemptTimeBuilder_ == null) {
        attemptTime_ = builderForValue.build();
        onChanged();
      } else {
        attemptTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
    public Builder mergeAttemptTime(com.google.protobuf.Timestamp value) {
      if (attemptTimeBuilder_ == null) {
        if (attemptTime_ != null) {
          attemptTime_ =
              com.google.protobuf.Timestamp.newBuilder(attemptTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          attemptTime_ = value;
        }
        onChanged();
      } else {
        attemptTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
    public Builder clearAttemptTime() {
      if (attemptTimeBuilder_ == null) {
        attemptTime_ = null;
        onChanged();
      } else {
        attemptTime_ = null;
        attemptTimeBuilder_ = null;
      }

      return this;
    }
    /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
    public com.google.protobuf.Timestamp.Builder getAttemptTimeBuilder() {

      onChanged();
      return getAttemptTimeFieldBuilder().getBuilder();
    }
    /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
    public com.google.protobuf.TimestampOrBuilder getAttemptTimeOrBuilder() {
      if (attemptTimeBuilder_ != null) {
        return attemptTimeBuilder_.getMessageOrBuilder();
      } else {
        return attemptTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : attemptTime_;
      }
    }
    /** <code>.google.protobuf.Timestamp attempt_time = 1;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getAttemptTimeFieldBuilder() {
      if (attemptTimeBuilder_ == null) {
        attemptTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getAttemptTime(), getParentForChildren(), isClean());
        attemptTime_ = null;
      }
      return attemptTimeBuilder_;
    }

    private java.util.List<com.google.rpc.Status> partialFailures_ =
        java.util.Collections.emptyList();

    private void ensurePartialFailuresIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        partialFailures_ = new java.util.ArrayList<com.google.rpc.Status>(partialFailures_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        partialFailuresBuilder_;

    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public java.util.List<com.google.rpc.Status> getPartialFailuresList() {
      if (partialFailuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partialFailures_);
      } else {
        return partialFailuresBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public int getPartialFailuresCount() {
      if (partialFailuresBuilder_ == null) {
        return partialFailures_.size();
      } else {
        return partialFailuresBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status getPartialFailures(int index) {
      if (partialFailuresBuilder_ == null) {
        return partialFailures_.get(index);
      } else {
        return partialFailuresBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder setPartialFailures(int index, com.google.rpc.Status value) {
      if (partialFailuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartialFailuresIsMutable();
        partialFailures_.set(index, value);
        onChanged();
      } else {
        partialFailuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder setPartialFailures(int index, com.google.rpc.Status.Builder builderForValue) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.set(index, builderForValue.build());
        onChanged();
      } else {
        partialFailuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(com.google.rpc.Status value) {
      if (partialFailuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartialFailuresIsMutable();
        partialFailures_.add(value);
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(int index, com.google.rpc.Status value) {
      if (partialFailuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartialFailuresIsMutable();
        partialFailures_.add(index, value);
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(com.google.rpc.Status.Builder builderForValue) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.add(builderForValue.build());
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(int index, com.google.rpc.Status.Builder builderForValue) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.add(index, builderForValue.build());
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addAllPartialFailures(
        java.lang.Iterable<? extends com.google.rpc.Status> values) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, partialFailures_);
        onChanged();
      } else {
        partialFailuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder clearPartialFailures() {
      if (partialFailuresBuilder_ == null) {
        partialFailures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        partialFailuresBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder removePartialFailures(int index) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.remove(index);
        onChanged();
      } else {
        partialFailuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status.Builder getPartialFailuresBuilder(int index) {
      return getPartialFailuresFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(int index) {
      if (partialFailuresBuilder_ == null) {
        return partialFailures_.get(index);
      } else {
        return partialFailuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public java.util.List<? extends com.google.rpc.StatusOrBuilder>
        getPartialFailuresOrBuilderList() {
      if (partialFailuresBuilder_ != null) {
        return partialFailuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partialFailures_);
      }
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status.Builder addPartialFailuresBuilder() {
      return getPartialFailuresFieldBuilder()
          .addBuilder(com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status.Builder addPartialFailuresBuilder(int index) {
      return getPartialFailuresFieldBuilder()
          .addBuilder(index, com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public java.util.List<com.google.rpc.Status.Builder> getPartialFailuresBuilderList() {
      return getPartialFailuresFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getPartialFailuresFieldBuilder() {
      if (partialFailuresBuilder_ == null) {
        partialFailuresBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(
                partialFailures_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        partialFailures_ = null;
      }
      return partialFailuresBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.Attempt)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.Attempt)
  private static final com.google.cloud.datalabeling.v1beta1.Attempt DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.Attempt();
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Attempt> PARSER =
      new com.google.protobuf.AbstractParser<Attempt>() {
        @java.lang.Override
        public Attempt parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Attempt(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Attempt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Attempt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.Attempt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
