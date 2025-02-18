/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceGroupManagerInstanceLifecyclePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerInstanceLifecyclePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A bit indicating whether to forcefully apply the group's latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. Instead, configuration updates are applied according to the group's update policy. - YES: If configuration updates are available, they are applied during repair.
   * Check the ForceUpdateOnRepair enum for the list of possible values.
   * </pre>
   *
   * <code>optional string force_update_on_repair = 356302027;</code>
   *
   * @return Whether the forceUpdateOnRepair field is set.
   */
  boolean hasForceUpdateOnRepair();
  /**
   *
   *
   * <pre>
   * A bit indicating whether to forcefully apply the group's latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. Instead, configuration updates are applied according to the group's update policy. - YES: If configuration updates are available, they are applied during repair.
   * Check the ForceUpdateOnRepair enum for the list of possible values.
   * </pre>
   *
   * <code>optional string force_update_on_repair = 356302027;</code>
   *
   * @return The forceUpdateOnRepair.
   */
  java.lang.String getForceUpdateOnRepair();
  /**
   *
   *
   * <pre>
   * A bit indicating whether to forcefully apply the group's latest configuration when repairing a VM. Valid options are: - NO (default): If configuration updates are available, they are not forcefully applied during repair. Instead, configuration updates are applied according to the group's update policy. - YES: If configuration updates are available, they are applied during repair.
   * Check the ForceUpdateOnRepair enum for the list of possible values.
   * </pre>
   *
   * <code>optional string force_update_on_repair = 356302027;</code>
   *
   * @return The bytes for forceUpdateOnRepair.
   */
  com.google.protobuf.ByteString getForceUpdateOnRepairBytes();
}
