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
// source: google/cloud/bigquery/migration/v2alpha/migration_entities.proto

package com.google.cloud.bigquery.migration.v2alpha;

/**
 *
 *
 * <pre>
 * Additional information from the orchestrator when it is done with the
 * task orchestration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult}
 */
public final class MigrationTaskOrchestrationResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult)
    MigrationTaskOrchestrationResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MigrationTaskOrchestrationResult.newBuilder() to construct.
  private MigrationTaskOrchestrationResult(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MigrationTaskOrchestrationResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MigrationTaskOrchestrationResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MigrationTaskOrchestrationResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                      .Builder
                  subBuilder = null;
              if (detailsCase_ == 1) {
                subBuilder =
                    ((com.google.cloud.bigquery.migration.v2alpha
                                .AssessmentOrchestrationResultDetails)
                            details_)
                        .toBuilder();
              }
              details_ =
                  input.readMessage(
                      com.google.cloud.bigquery.migration.v2alpha
                          .AssessmentOrchestrationResultDetails.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.bigquery.migration.v2alpha
                            .AssessmentOrchestrationResultDetails)
                        details_);
                details_ = subBuilder.buildPartial();
              }
              detailsCase_ = 1;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationEntitiesProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.MigrationEntitiesProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult.class,
            com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult.Builder
                .class);
  }

  private int detailsCase_ = 0;
  private java.lang.Object details_;

  public enum DetailsCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ASSESSMENT_DETAILS(1),
    DETAILS_NOT_SET(0);
    private final int value;

    private DetailsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DetailsCase valueOf(int value) {
      return forNumber(value);
    }

    public static DetailsCase forNumber(int value) {
      switch (value) {
        case 1:
          return ASSESSMENT_DETAILS;
        case 0:
          return DETAILS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DetailsCase getDetailsCase() {
    return DetailsCase.forNumber(detailsCase_);
  }

  public static final int ASSESSMENT_DETAILS_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Details specific to assessment task types.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
   * </code>
   *
   * @return Whether the assessmentDetails field is set.
   */
  @java.lang.Override
  public boolean hasAssessmentDetails() {
    return detailsCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Details specific to assessment task types.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
   * </code>
   *
   * @return The assessmentDetails.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
      getAssessmentDetails() {
    if (detailsCase_ == 1) {
      return (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
          details_;
    }
    return com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
        .getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Details specific to assessment task types.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetailsOrBuilder
      getAssessmentDetailsOrBuilder() {
    if (detailsCase_ == 1) {
      return (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
          details_;
    }
    return com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
        .getDefaultInstance();
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
    if (detailsCase_ == 1) {
      output.writeMessage(
          1,
          (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
              details_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (detailsCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1,
              (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
                  details_);
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
    if (!(obj
        instanceof com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult other =
        (com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult) obj;

    if (!getDetailsCase().equals(other.getDetailsCase())) return false;
    switch (detailsCase_) {
      case 1:
        if (!getAssessmentDetails().equals(other.getAssessmentDetails())) return false;
        break;
      case 0:
      default:
    }
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
    switch (detailsCase_) {
      case 1:
        hash = (37 * hash) + ASSESSMENT_DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getAssessmentDetails().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      parseFrom(
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
      com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult prototype) {
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
   * Additional information from the orchestrator when it is done with the
   * task orchestration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult)
      com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationEntitiesProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationEntitiesProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult.class,
              com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      detailsCase_ = 0;
      details_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationEntitiesProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_MigrationTaskOrchestrationResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult build() {
      com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
        buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult result =
          new com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult(this);
      if (detailsCase_ == 1) {
        if (assessmentDetailsBuilder_ == null) {
          result.details_ = details_;
        } else {
          result.details_ = assessmentDetailsBuilder_.build();
        }
      }
      result.detailsCase_ = detailsCase_;
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
      if (other
          instanceof com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult) {
        return mergeFrom(
            (com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult other) {
      if (other
          == com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
              .getDefaultInstance()) return this;
      switch (other.getDetailsCase()) {
        case ASSESSMENT_DETAILS:
          {
            mergeAssessmentDetails(other.getAssessmentDetails());
            break;
          }
        case DETAILS_NOT_SET:
          {
            break;
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
      com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int detailsCase_ = 0;
    private java.lang.Object details_;

    public DetailsCase getDetailsCase() {
      return DetailsCase.forNumber(detailsCase_);
    }

    public Builder clearDetails() {
      detailsCase_ = 0;
      details_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails,
            com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                .Builder,
            com.google.cloud.bigquery.migration.v2alpha
                .AssessmentOrchestrationResultDetailsOrBuilder>
        assessmentDetailsBuilder_;
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     *
     * @return Whether the assessmentDetails field is set.
     */
    @java.lang.Override
    public boolean hasAssessmentDetails() {
      return detailsCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     *
     * @return The assessmentDetails.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
        getAssessmentDetails() {
      if (assessmentDetailsBuilder_ == null) {
        if (detailsCase_ == 1) {
          return (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
              details_;
        }
        return com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
            .getDefaultInstance();
      } else {
        if (detailsCase_ == 1) {
          return assessmentDetailsBuilder_.getMessage();
        }
        return com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     */
    public Builder setAssessmentDetails(
        com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails value) {
      if (assessmentDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
        onChanged();
      } else {
        assessmentDetailsBuilder_.setMessage(value);
      }
      detailsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     */
    public Builder setAssessmentDetails(
        com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails.Builder
            builderForValue) {
      if (assessmentDetailsBuilder_ == null) {
        details_ = builderForValue.build();
        onChanged();
      } else {
        assessmentDetailsBuilder_.setMessage(builderForValue.build());
      }
      detailsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     */
    public Builder mergeAssessmentDetails(
        com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails value) {
      if (assessmentDetailsBuilder_ == null) {
        if (detailsCase_ == 1
            && details_
                != com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                    .getDefaultInstance()) {
          details_ =
              com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                  .newBuilder(
                      (com.google.cloud.bigquery.migration.v2alpha
                              .AssessmentOrchestrationResultDetails)
                          details_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          details_ = value;
        }
        onChanged();
      } else {
        if (detailsCase_ == 1) {
          assessmentDetailsBuilder_.mergeFrom(value);
        } else {
          assessmentDetailsBuilder_.setMessage(value);
        }
      }
      detailsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     */
    public Builder clearAssessmentDetails() {
      if (assessmentDetailsBuilder_ == null) {
        if (detailsCase_ == 1) {
          detailsCase_ = 0;
          details_ = null;
          onChanged();
        }
      } else {
        if (detailsCase_ == 1) {
          detailsCase_ = 0;
          details_ = null;
        }
        assessmentDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     */
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails.Builder
        getAssessmentDetailsBuilder() {
      return getAssessmentDetailsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetailsOrBuilder
        getAssessmentDetailsOrBuilder() {
      if ((detailsCase_ == 1) && (assessmentDetailsBuilder_ != null)) {
        return assessmentDetailsBuilder_.getMessageOrBuilder();
      } else {
        if (detailsCase_ == 1) {
          return (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
              details_;
        }
        return com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Details specific to assessment task types.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails assessment_details = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails,
            com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                .Builder,
            com.google.cloud.bigquery.migration.v2alpha
                .AssessmentOrchestrationResultDetailsOrBuilder>
        getAssessmentDetailsFieldBuilder() {
      if (assessmentDetailsBuilder_ == null) {
        if (!(detailsCase_ == 1)) {
          details_ =
              com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                  .getDefaultInstance();
        }
        assessmentDetailsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails,
                com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails
                    .Builder,
                com.google.cloud.bigquery.migration.v2alpha
                    .AssessmentOrchestrationResultDetailsOrBuilder>(
                (com.google.cloud.bigquery.migration.v2alpha.AssessmentOrchestrationResultDetails)
                    details_,
                getParentForChildren(),
                isClean());
        details_ = null;
      }
      detailsCase_ = 1;
      onChanged();
      ;
      return assessmentDetailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult)
  private static final com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MigrationTaskOrchestrationResult> PARSER =
      new com.google.protobuf.AbstractParser<MigrationTaskOrchestrationResult>() {
        @java.lang.Override
        public MigrationTaskOrchestrationResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MigrationTaskOrchestrationResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MigrationTaskOrchestrationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MigrationTaskOrchestrationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.MigrationTaskOrchestrationResult
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
