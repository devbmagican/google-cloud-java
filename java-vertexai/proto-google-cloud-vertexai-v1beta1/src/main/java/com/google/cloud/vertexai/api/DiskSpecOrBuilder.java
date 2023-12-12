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
// source: google/cloud/vertexai/v1beta1/machine_resources.proto

package com.google.cloud.vertexai.api;

public interface DiskSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.DiskSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the boot disk (default is "pd-ssd").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
   * "pd-standard" (Persistent Disk Hard Disk Drive).
   * </pre>
   *
   * <code>string boot_disk_type = 1;</code>
   *
   * @return The bootDiskType.
   */
  java.lang.String getBootDiskType();
  /**
   *
   *
   * <pre>
   * Type of the boot disk (default is "pd-ssd").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
   * "pd-standard" (Persistent Disk Hard Disk Drive).
   * </pre>
   *
   * <code>string boot_disk_type = 1;</code>
   *
   * @return The bytes for bootDiskType.
   */
  com.google.protobuf.ByteString getBootDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Size in GB of the boot disk (default is 100GB).
   * </pre>
   *
   * <code>int32 boot_disk_size_gb = 2;</code>
   *
   * @return The bootDiskSizeGb.
   */
  int getBootDiskSizeGb();
}
