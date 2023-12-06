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

public interface SnapshotSettingsStorageLocationSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SnapshotSettingsStorageLocationSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When the policy is SPECIFIC_LOCATIONS, snapshots will be stored in the locations listed in this field. Keys are GCS bucket locations.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsStorageLocationPreference&gt; locations = 413423454;
   * </code>
   */
  int getLocationsCount();
  /**
   *
   *
   * <pre>
   * When the policy is SPECIFIC_LOCATIONS, snapshots will be stored in the locations listed in this field. Keys are GCS bucket locations.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsStorageLocationPreference&gt; locations = 413423454;
   * </code>
   */
  boolean containsLocations(java.lang.String key);
  /** Use {@link #getLocationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.compute.v1
              .SnapshotSettingsStorageLocationSettingsStorageLocationPreference>
      getLocations();
  /**
   *
   *
   * <pre>
   * When the policy is SPECIFIC_LOCATIONS, snapshots will be stored in the locations listed in this field. Keys are GCS bucket locations.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsStorageLocationPreference&gt; locations = 413423454;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.compute.v1
              .SnapshotSettingsStorageLocationSettingsStorageLocationPreference>
      getLocationsMap();
  /**
   *
   *
   * <pre>
   * When the policy is SPECIFIC_LOCATIONS, snapshots will be stored in the locations listed in this field. Keys are GCS bucket locations.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsStorageLocationPreference&gt; locations = 413423454;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsStorageLocationPreference
      getLocationsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.compute.v1
                  .SnapshotSettingsStorageLocationSettingsStorageLocationPreference
              defaultValue);
  /**
   *
   *
   * <pre>
   * When the policy is SPECIFIC_LOCATIONS, snapshots will be stored in the locations listed in this field. Keys are GCS bucket locations.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsStorageLocationPreference&gt; locations = 413423454;
   * </code>
   */
  com.google.cloud.compute.v1.SnapshotSettingsStorageLocationSettingsStorageLocationPreference
      getLocationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The chosen location policy.
   * Check the Policy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * The chosen location policy.
   * Check the Policy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return The policy.
   */
  java.lang.String getPolicy();
  /**
   *
   *
   * <pre>
   * The chosen location policy.
   * Check the Policy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string policy = 91071794;</code>
   *
   * @return The bytes for policy.
   */
  com.google.protobuf.ByteString getPolicyBytes();
}
