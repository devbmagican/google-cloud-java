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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

package com.google.cloud.vmwareengine.v1;

public interface NodeTypeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.NodeTypeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The number of nodes of this type in the cluster
   * </pre>
   *
   * <code>int32 node_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The nodeCount.
   */
  int getNodeCount();

  /**
   *
   *
   * <pre>
   * Optional. Customized number of cores available to each node of the type.
   * This number must always be one of `nodeType.availableCustomCoreCounts`.
   * If zero is provided max value from `nodeType.availableCustomCoreCounts`
   * will be used.
   * </pre>
   *
   * <code>int32 custom_core_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The customCoreCount.
   */
  int getCustomCoreCount();
}
