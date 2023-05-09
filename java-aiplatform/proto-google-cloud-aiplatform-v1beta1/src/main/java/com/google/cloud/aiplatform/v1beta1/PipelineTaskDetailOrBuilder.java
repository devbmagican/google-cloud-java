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
// source: google/cloud/aiplatform/v1beta1/pipeline_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PipelineTaskDetailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PipelineTaskDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The system generated ID of the task.
   * </pre>
   *
   * <code>int64 task_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The taskId.
   */
  long getTaskId();

  /**
   *
   *
   * <pre>
   * Output only. The id of the parent task if the task is within a component
   * scope. Empty if the task is at the root level.
   * </pre>
   *
   * <code>int64 parent_task_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The parentTaskId.
   */
  long getParentTaskId();

  /**
   *
   *
   * <pre>
   * Output only. The user specified name of the task that is defined in
   * [pipeline_spec][google.cloud.aiplatform.v1beta1.PipelineJob.pipeline_spec].
   * </pre>
   *
   * <code>string task_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The taskName.
   */
  java.lang.String getTaskName();
  /**
   *
   *
   * <pre>
   * Output only. The user specified name of the task that is defined in
   * [pipeline_spec][google.cloud.aiplatform.v1beta1.PipelineJob.pipeline_spec].
   * </pre>
   *
   * <code>string task_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for taskName.
   */
  com.google.protobuf.ByteString getTaskNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Task create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Task create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Task create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Task start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Task start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Task start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Task end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Task end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Task end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The detailed execution info.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTaskExecutorDetail executor_detail = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the executorDetail field is set.
   */
  boolean hasExecutorDetail();
  /**
   *
   *
   * <pre>
   * Output only. The detailed execution info.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTaskExecutorDetail executor_detail = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The executorDetail.
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskExecutorDetail getExecutorDetail();
  /**
   *
   *
   * <pre>
   * Output only. The detailed execution info.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTaskExecutorDetail executor_detail = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskExecutorDetailOrBuilder
      getExecutorDetailOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the task.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the task.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The execution metadata of the task.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Execution execution = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the execution field is set.
   */
  boolean hasExecution();
  /**
   *
   *
   * <pre>
   * Output only. The execution metadata of the task.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Execution execution = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The execution.
   */
  com.google.cloud.aiplatform.v1beta1.Execution getExecution();
  /**
   *
   *
   * <pre>
   * Output only. The execution metadata of the task.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Execution execution = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ExecutionOrBuilder getExecutionOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during task execution.
   * Only populated when the task's state is FAILED or CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during task execution.
   * Only populated when the task's state is FAILED or CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during task execution.
   * Only populated when the task's state is FAILED or CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A list of task status. This field keeps a record of task
   * status evolving over time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatus pipeline_task_status = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatus>
      getPipelineTaskStatusList();
  /**
   *
   *
   * <pre>
   * Output only. A list of task status. This field keeps a record of task
   * status evolving over time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatus pipeline_task_status = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatus getPipelineTaskStatus(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of task status. This field keeps a record of task
   * status evolving over time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatus pipeline_task_status = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPipelineTaskStatusCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of task status. This field keeps a record of task
   * status evolving over time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatus pipeline_task_status = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatusOrBuilder>
      getPipelineTaskStatusOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of task status. This field keeps a record of task
   * status evolving over time.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatus pipeline_task_status = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.PipelineTaskStatusOrBuilder
      getPipelineTaskStatusOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The runtime input artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; inputs = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getInputsCount();
  /**
   *
   *
   * <pre>
   * Output only. The runtime input artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; inputs = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsInputs(java.lang.String key);
  /** Use {@link #getInputsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList>
      getInputs();
  /**
   *
   *
   * <pre>
   * Output only. The runtime input artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; inputs = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList>
      getInputsMap();
  /**
   *
   *
   * <pre>
   * Output only. The runtime input artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; inputs = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList getInputsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. The runtime input artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; inputs = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList getInputsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The runtime output artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; outputs = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getOutputsCount();
  /**
   *
   *
   * <pre>
   * Output only. The runtime output artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; outputs = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsOutputs(java.lang.String key);
  /** Use {@link #getOutputsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList>
      getOutputs();
  /**
   *
   *
   * <pre>
   * Output only. The runtime output artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; outputs = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList>
      getOutputsMap();
  /**
   *
   *
   * <pre>
   * Output only. The runtime output artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; outputs = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList getOutputsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. The runtime output artifacts of the task.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList&gt; outputs = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTaskDetail.ArtifactList getOutputsOrThrow(
      java.lang.String key);
}
