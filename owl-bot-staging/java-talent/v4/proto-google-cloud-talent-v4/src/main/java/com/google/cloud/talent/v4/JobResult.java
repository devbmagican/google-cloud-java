// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/job_service.proto

package com.google.cloud.talent.v4;

/**
 * <pre>
 * Mutation result of a job from a batch operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.JobResult}
 */
public final class JobResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.JobResult)
    JobResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobResult.newBuilder() to construct.
  private JobResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_JobResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_JobResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.JobResult.class, com.google.cloud.talent.v4.JobResult.Builder.class);
  }

  public static final int JOB_FIELD_NUMBER = 1;
  private com.google.cloud.talent.v4.Job job_;
  /**
   * <pre>
   * Here [Job][google.cloud.talent.v4.Job] only contains basic information
   * including [name][google.cloud.talent.v4.Job.name],
   * [company][google.cloud.talent.v4.Job.company],
   * [language_code][google.cloud.talent.v4.Job.language_code] and
   * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
   * method to retrieve detailed information of the created/updated job.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Job job = 1;</code>
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   * <pre>
   * Here [Job][google.cloud.talent.v4.Job] only contains basic information
   * including [name][google.cloud.talent.v4.Job.name],
   * [company][google.cloud.talent.v4.Job.company],
   * [language_code][google.cloud.talent.v4.Job.language_code] and
   * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
   * method to retrieve detailed information of the created/updated job.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Job job = 1;</code>
   * @return The job.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.Job getJob() {
    return job_ == null ? com.google.cloud.talent.v4.Job.getDefaultInstance() : job_;
  }
  /**
   * <pre>
   * Here [Job][google.cloud.talent.v4.Job] only contains basic information
   * including [name][google.cloud.talent.v4.Job.name],
   * [company][google.cloud.talent.v4.Job.company],
   * [language_code][google.cloud.talent.v4.Job.language_code] and
   * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
   * method to retrieve detailed information of the created/updated job.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Job job = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.JobOrBuilder getJobOrBuilder() {
    return job_ == null ? com.google.cloud.talent.v4.Job.getDefaultInstance() : job_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.rpc.Status status_;
  /**
   * <pre>
   * The status of the job processed. This field is populated if the
   * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * The status of the job processed. This field is populated if the
   * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * The status of the job processed. This field is populated if the
   * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
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
    if (job_ != null) {
      output.writeMessage(1, getJob());
    }
    if (status_ != null) {
      output.writeMessage(2, getStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getJob());
    }
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStatus());
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
    if (!(obj instanceof com.google.cloud.talent.v4.JobResult)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.JobResult other = (com.google.cloud.talent.v4.JobResult) obj;

    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob()
          .equals(other.getJob())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.JobResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.JobResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.JobResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.JobResult parseFrom(
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
  public static Builder newBuilder(com.google.cloud.talent.v4.JobResult prototype) {
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
   * Mutation result of a job from a batch operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.JobResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.JobResult)
      com.google.cloud.talent.v4.JobResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_JobResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_JobResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.JobResult.class, com.google.cloud.talent.v4.JobResult.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.JobResult.newBuilder()
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
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4.JobServiceProto.internal_static_google_cloud_talent_v4_JobResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.JobResult getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.JobResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.JobResult build() {
      com.google.cloud.talent.v4.JobResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.JobResult buildPartial() {
      com.google.cloud.talent.v4.JobResult result = new com.google.cloud.talent.v4.JobResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.talent.v4.JobResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.job_ = jobBuilder_ == null
            ? job_
            : jobBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = statusBuilder_ == null
            ? status_
            : statusBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4.JobResult) {
        return mergeFrom((com.google.cloud.talent.v4.JobResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.JobResult other) {
      if (other == com.google.cloud.talent.v4.JobResult.getDefaultInstance()) return this;
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
              input.readMessage(
                  getJobFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.cloud.talent.v4.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4.Job, com.google.cloud.talent.v4.Job.Builder, com.google.cloud.talent.v4.JobOrBuilder> jobBuilder_;
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     * @return The job.
     */
    public com.google.cloud.talent.v4.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.cloud.talent.v4.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     */
    public Builder setJob(com.google.cloud.talent.v4.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
      } else {
        jobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     */
    public Builder setJob(
        com.google.cloud.talent.v4.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     */
    public Builder mergeJob(com.google.cloud.talent.v4.Job value) {
      if (jobBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          job_ != null &&
          job_ != com.google.cloud.talent.v4.Job.getDefaultInstance()) {
          getJobBuilder().mergeFrom(value);
        } else {
          job_ = value;
        }
      } else {
        jobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     */
    public Builder clearJob() {
      bitField0_ = (bitField0_ & ~0x00000001);
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     */
    public com.google.cloud.talent.v4.Job.Builder getJobBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     */
    public com.google.cloud.talent.v4.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            com.google.cloud.talent.v4.Job.getDefaultInstance() : job_;
      }
    }
    /**
     * <pre>
     * Here [Job][google.cloud.talent.v4.Job] only contains basic information
     * including [name][google.cloud.talent.v4.Job.name],
     * [company][google.cloud.talent.v4.Job.company],
     * [language_code][google.cloud.talent.v4.Job.language_code] and
     * [requisition_id][google.cloud.talent.v4.Job.requisition_id], use getJob
     * method to retrieve detailed information of the created/updated job.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Job job = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4.Job, com.google.cloud.talent.v4.Job.Builder, com.google.cloud.talent.v4.JobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4.Job, com.google.cloud.talent.v4.Job.Builder, com.google.cloud.talent.v4.JobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder setStatus(
        com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          status_ != null &&
          status_ != com.google.rpc.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * The status of the job processed. This field is populated if the
     * processing of the [job][google.cloud.talent.v4.JobResult.job] fails.
     * </pre>
     *
     * <code>.google.rpc.Status status = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.JobResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.JobResult)
  private static final com.google.cloud.talent.v4.JobResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.JobResult();
  }

  public static com.google.cloud.talent.v4.JobResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobResult>
      PARSER = new com.google.protobuf.AbstractParser<JobResult>() {
    @java.lang.Override
    public JobResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<JobResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.JobResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

