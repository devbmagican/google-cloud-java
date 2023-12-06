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

public interface SourceDiskEncryptionKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SourceDiskEncryptionKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return Whether the diskEncryptionKey field is set.
   */
  boolean hasDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   *
   * @return The diskEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getDiskEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
   * </pre>
   *
   * <code>optional string source_disk = 451753793;</code>
   *
   * @return Whether the sourceDisk field is set.
   */
  boolean hasSourceDisk();
  /**
   *
   *
   * <pre>
   * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
   * </pre>
   *
   * <code>optional string source_disk = 451753793;</code>
   *
   * @return The sourceDisk.
   */
  java.lang.String getSourceDisk();
  /**
   *
   *
   * <pre>
   * URL of the disk attached to the source instance. This can be a full or valid partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
   * </pre>
   *
   * <code>optional string source_disk = 451753793;</code>
   *
   * @return The bytes for sourceDisk.
   */
  com.google.protobuf.ByteString getSourceDiskBytes();
}
