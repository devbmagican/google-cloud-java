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
// source: google/cloud/tasks/v2beta2/queue.proto

package com.google.cloud.tasks.v2beta2;

public interface QueueStatsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.QueueStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. An estimation of the number of tasks in the queue, that is, the tasks in
   * the queue that haven't been executed, the tasks in the queue which the
   * queue has dispatched but has not yet received a reply for, and the failed
   * tasks that the queue is retrying.
   * </pre>
   *
   * <code>int64 tasks_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tasksCount.
   */
  long getTasksCount();

  /**
   *
   *
   * <pre>
   * Output only. An estimation of the nearest time in the future where a task in the queue
   * is scheduled to be executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the oldestEstimatedArrivalTime field is set.
   */
  boolean hasOldestEstimatedArrivalTime();
  /**
   *
   *
   * <pre>
   * Output only. An estimation of the nearest time in the future where a task in the queue
   * is scheduled to be executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The oldestEstimatedArrivalTime.
   */
  com.google.protobuf.Timestamp getOldestEstimatedArrivalTime();
  /**
   *
   *
   * <pre>
   * Output only. An estimation of the nearest time in the future where a task in the queue
   * is scheduled to be executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getOldestEstimatedArrivalTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The number of tasks that the queue has dispatched and received a reply for
   * during the last minute. This variable counts both successful and
   * non-successful executions.
   * </pre>
   *
   * <code>int64 executed_last_minute_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The executedLastMinuteCount.
   */
  long getExecutedLastMinuteCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of requests that the queue has dispatched but has not received
   * a reply for yet.
   * </pre>
   *
   * <code>int64 concurrent_dispatches_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The concurrentDispatchesCount.
   */
  long getConcurrentDispatchesCount();

  /**
   *
   *
   * <pre>
   * Output only. The current maximum number of tasks per second executed by the queue.
   * The maximum value of this variable is controlled by the RateLimits of the
   * Queue. However, this value could be less to avoid overloading the endpoints
   * tasks in the queue are targeting.
   * </pre>
   *
   * <code>double effective_execution_rate = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The effectiveExecutionRate.
   */
  double getEffectiveExecutionRate();
}
