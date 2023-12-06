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

public interface AllocationResourceStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AllocationResourceStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Allocation Properties of this reservation.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;
   * </code>
   *
   * @return Whether the specificSkuAllocation field is set.
   */
  boolean hasSpecificSkuAllocation();
  /**
   *
   *
   * <pre>
   * Allocation Properties of this reservation.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;
   * </code>
   *
   * @return The specificSkuAllocation.
   */
  com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation
      getSpecificSkuAllocation();
  /**
   *
   *
   * <pre>
   * Allocation Properties of this reservation.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocationOrBuilder
      getSpecificSkuAllocationOrBuilder();
}
