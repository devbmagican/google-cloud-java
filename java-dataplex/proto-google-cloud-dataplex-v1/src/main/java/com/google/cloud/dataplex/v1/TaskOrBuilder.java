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
// source: google/cloud/dataplex/v1/tasks.proto

package com.google.cloud.dataplex.v1;

public interface TaskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the task, of the form:
   * projects/{project_number}/locations/{location_id}/lakes/{lake_id}/
   * tasks/{task_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the task, of the form:
   * projects/{project_number}/locations/{location_id}/lakes/{lake_id}/
   * tasks/{task_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the task. This ID will
   * be different if the task is deleted and re-created with the same name.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the task. This ID will
   * be different if the task is deleted and re-created with the same name.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the task was created.
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
   * Output only. The time when the task was created.
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
   * Output only. The time when the task was created.
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
   * Output only. The time when the task was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the task was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the task was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Description of the task.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the task.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the task.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the task.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataplex.v1.State getState();

  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the task.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the task.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the task.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the task.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for the task.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Spec related to how often and when a task should be triggered.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.TriggerSpec trigger_spec = 100 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the triggerSpec field is set.
   */
  boolean hasTriggerSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec related to how often and when a task should be triggered.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.TriggerSpec trigger_spec = 100 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The triggerSpec.
   */
  com.google.cloud.dataplex.v1.Task.TriggerSpec getTriggerSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec related to how often and when a task should be triggered.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.TriggerSpec trigger_spec = 100 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataplex.v1.Task.TriggerSpecOrBuilder getTriggerSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Spec related to how a task is executed.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.ExecutionSpec execution_spec = 101 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the executionSpec field is set.
   */
  boolean hasExecutionSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec related to how a task is executed.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.ExecutionSpec execution_spec = 101 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The executionSpec.
   */
  com.google.cloud.dataplex.v1.Task.ExecutionSpec getExecutionSpec();
  /**
   *
   *
   * <pre>
   * Required. Spec related to how a task is executed.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.ExecutionSpec execution_spec = 101 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataplex.v1.Task.ExecutionSpecOrBuilder getExecutionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Status of the latest task executions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.ExecutionStatus execution_status = 201 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the executionStatus field is set.
   */
  boolean hasExecutionStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the latest task executions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.ExecutionStatus execution_status = 201 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The executionStatus.
   */
  com.google.cloud.dataplex.v1.Task.ExecutionStatus getExecutionStatus();
  /**
   *
   *
   * <pre>
   * Output only. Status of the latest task executions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Task.ExecutionStatus execution_status = 201 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.Task.ExecutionStatusOrBuilder getExecutionStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Config related to running custom Spark tasks.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task.SparkTaskConfig spark = 300;</code>
   *
   * @return Whether the spark field is set.
   */
  boolean hasSpark();
  /**
   *
   *
   * <pre>
   * Config related to running custom Spark tasks.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task.SparkTaskConfig spark = 300;</code>
   *
   * @return The spark.
   */
  com.google.cloud.dataplex.v1.Task.SparkTaskConfig getSpark();
  /**
   *
   *
   * <pre>
   * Config related to running custom Spark tasks.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task.SparkTaskConfig spark = 300;</code>
   */
  com.google.cloud.dataplex.v1.Task.SparkTaskConfigOrBuilder getSparkOrBuilder();

  /**
   *
   *
   * <pre>
   * Config related to running scheduled Notebooks.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task.NotebookTaskConfig notebook = 302;</code>
   *
   * @return Whether the notebook field is set.
   */
  boolean hasNotebook();
  /**
   *
   *
   * <pre>
   * Config related to running scheduled Notebooks.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task.NotebookTaskConfig notebook = 302;</code>
   *
   * @return The notebook.
   */
  com.google.cloud.dataplex.v1.Task.NotebookTaskConfig getNotebook();
  /**
   *
   *
   * <pre>
   * Config related to running scheduled Notebooks.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Task.NotebookTaskConfig notebook = 302;</code>
   */
  com.google.cloud.dataplex.v1.Task.NotebookTaskConfigOrBuilder getNotebookOrBuilder();

  com.google.cloud.dataplex.v1.Task.ConfigCase getConfigCase();
}
