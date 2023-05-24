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
// source: google/cloud/workflows/v1/workflows.proto

package com.google.cloud.workflows.v1;

/**
 *
 *
 * <pre>
 * Request for the
 * [UpdateWorkflow][google.cloud.workflows.v1.Workflows.UpdateWorkflow]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.workflows.v1.UpdateWorkflowRequest}
 */
public final class UpdateWorkflowRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.workflows.v1.UpdateWorkflowRequest)
    UpdateWorkflowRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateWorkflowRequest.newBuilder() to construct.
  private UpdateWorkflowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateWorkflowRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateWorkflowRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.workflows.v1.WorkflowsProto
        .internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.workflows.v1.WorkflowsProto
        .internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.workflows.v1.UpdateWorkflowRequest.class,
            com.google.cloud.workflows.v1.UpdateWorkflowRequest.Builder.class);
  }

  public static final int WORKFLOW_FIELD_NUMBER = 1;
  private com.google.cloud.workflows.v1.Workflow workflow_;
  /**
   *
   *
   * <pre>
   * Required. Workflow to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workflow field is set.
   */
  @java.lang.Override
  public boolean hasWorkflow() {
    return workflow_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Workflow to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workflow.
   */
  @java.lang.Override
  public com.google.cloud.workflows.v1.Workflow getWorkflow() {
    return workflow_ == null
        ? com.google.cloud.workflows.v1.Workflow.getDefaultInstance()
        : workflow_;
  }
  /**
   *
   *
   * <pre>
   * Required. Workflow to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.workflows.v1.WorkflowOrBuilder getWorkflowOrBuilder() {
    return workflow_ == null
        ? com.google.cloud.workflows.v1.Workflow.getDefaultInstance()
        : workflow_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * List of fields to be updated. If not present, the entire workflow
   * will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * List of fields to be updated. If not present, the entire workflow
   * will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * List of fields to be updated. If not present, the entire workflow
   * will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (workflow_ != null) {
      output.writeMessage(1, getWorkflow());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workflow_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWorkflow());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.workflows.v1.UpdateWorkflowRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.workflows.v1.UpdateWorkflowRequest other =
        (com.google.cloud.workflows.v1.UpdateWorkflowRequest) obj;

    if (hasWorkflow() != other.hasWorkflow()) return false;
    if (hasWorkflow()) {
      if (!getWorkflow().equals(other.getWorkflow())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasWorkflow()) {
      hash = (37 * hash) + WORKFLOW_FIELD_NUMBER;
      hash = (53 * hash) + getWorkflow().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.workflows.v1.UpdateWorkflowRequest prototype) {
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
   * Request for the
   * [UpdateWorkflow][google.cloud.workflows.v1.Workflows.UpdateWorkflow]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.workflows.v1.UpdateWorkflowRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.workflows.v1.UpdateWorkflowRequest)
      com.google.cloud.workflows.v1.UpdateWorkflowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.workflows.v1.WorkflowsProto
          .internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.workflows.v1.WorkflowsProto
          .internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.workflows.v1.UpdateWorkflowRequest.class,
              com.google.cloud.workflows.v1.UpdateWorkflowRequest.Builder.class);
    }

    // Construct using com.google.cloud.workflows.v1.UpdateWorkflowRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      workflow_ = null;
      if (workflowBuilder_ != null) {
        workflowBuilder_.dispose();
        workflowBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.workflows.v1.WorkflowsProto
          .internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.workflows.v1.UpdateWorkflowRequest getDefaultInstanceForType() {
      return com.google.cloud.workflows.v1.UpdateWorkflowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.workflows.v1.UpdateWorkflowRequest build() {
      com.google.cloud.workflows.v1.UpdateWorkflowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.workflows.v1.UpdateWorkflowRequest buildPartial() {
      com.google.cloud.workflows.v1.UpdateWorkflowRequest result =
          new com.google.cloud.workflows.v1.UpdateWorkflowRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.workflows.v1.UpdateWorkflowRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.workflow_ = workflowBuilder_ == null ? workflow_ : workflowBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.workflows.v1.UpdateWorkflowRequest) {
        return mergeFrom((com.google.cloud.workflows.v1.UpdateWorkflowRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.workflows.v1.UpdateWorkflowRequest other) {
      if (other == com.google.cloud.workflows.v1.UpdateWorkflowRequest.getDefaultInstance())
        return this;
      if (other.hasWorkflow()) {
        mergeWorkflow(other.getWorkflow());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getWorkflowFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private com.google.cloud.workflows.v1.Workflow workflow_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workflows.v1.Workflow,
            com.google.cloud.workflows.v1.Workflow.Builder,
            com.google.cloud.workflows.v1.WorkflowOrBuilder>
        workflowBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the workflow field is set.
     */
    public boolean hasWorkflow() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The workflow.
     */
    public com.google.cloud.workflows.v1.Workflow getWorkflow() {
      if (workflowBuilder_ == null) {
        return workflow_ == null
            ? com.google.cloud.workflows.v1.Workflow.getDefaultInstance()
            : workflow_;
      } else {
        return workflowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkflow(com.google.cloud.workflows.v1.Workflow value) {
      if (workflowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workflow_ = value;
      } else {
        workflowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkflow(com.google.cloud.workflows.v1.Workflow.Builder builderForValue) {
      if (workflowBuilder_ == null) {
        workflow_ = builderForValue.build();
      } else {
        workflowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWorkflow(com.google.cloud.workflows.v1.Workflow value) {
      if (workflowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && workflow_ != null
            && workflow_ != com.google.cloud.workflows.v1.Workflow.getDefaultInstance()) {
          getWorkflowBuilder().mergeFrom(value);
        } else {
          workflow_ = value;
        }
      } else {
        workflowBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWorkflow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      workflow_ = null;
      if (workflowBuilder_ != null) {
        workflowBuilder_.dispose();
        workflowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workflows.v1.Workflow.Builder getWorkflowBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWorkflowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.workflows.v1.WorkflowOrBuilder getWorkflowOrBuilder() {
      if (workflowBuilder_ != null) {
        return workflowBuilder_.getMessageOrBuilder();
      } else {
        return workflow_ == null
            ? com.google.cloud.workflows.v1.Workflow.getDefaultInstance()
            : workflow_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Workflow to be updated.
     * </pre>
     *
     * <code>
     * .google.cloud.workflows.v1.Workflow workflow = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.workflows.v1.Workflow,
            com.google.cloud.workflows.v1.Workflow.Builder,
            com.google.cloud.workflows.v1.WorkflowOrBuilder>
        getWorkflowFieldBuilder() {
      if (workflowBuilder_ == null) {
        workflowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.workflows.v1.Workflow,
                com.google.cloud.workflows.v1.Workflow.Builder,
                com.google.cloud.workflows.v1.WorkflowOrBuilder>(
                getWorkflow(), getParentForChildren(), isClean());
        workflow_ = null;
      }
      return workflowBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * List of fields to be updated. If not present, the entire workflow
     * will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.workflows.v1.UpdateWorkflowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.workflows.v1.UpdateWorkflowRequest)
  private static final com.google.cloud.workflows.v1.UpdateWorkflowRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.workflows.v1.UpdateWorkflowRequest();
  }

  public static com.google.cloud.workflows.v1.UpdateWorkflowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWorkflowRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateWorkflowRequest>() {
        @java.lang.Override
        public UpdateWorkflowRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWorkflowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWorkflowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.workflows.v1.UpdateWorkflowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
