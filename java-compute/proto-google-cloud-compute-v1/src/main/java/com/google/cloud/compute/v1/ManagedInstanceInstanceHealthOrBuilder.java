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

public interface ManagedInstanceInstanceHealthOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ManagedInstanceInstanceHealth)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The current detailed instance health state.
   * Check the DetailedHealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string detailed_health_state = 510470173;</code>
   *
   * @return Whether the detailedHealthState field is set.
   */
  boolean hasDetailedHealthState();
  /**
   *
   *
   * <pre>
   * [Output Only] The current detailed instance health state.
   * Check the DetailedHealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string detailed_health_state = 510470173;</code>
   *
   * @return The detailedHealthState.
   */
  java.lang.String getDetailedHealthState();
  /**
   *
   *
   * <pre>
   * [Output Only] The current detailed instance health state.
   * Check the DetailedHealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string detailed_health_state = 510470173;</code>
   *
   * @return The bytes for detailedHealthState.
   */
  com.google.protobuf.ByteString getDetailedHealthStateBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return Whether the healthCheck field is set.
   */
  boolean hasHealthCheck();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return The healthCheck.
   */
  java.lang.String getHealthCheck();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return The bytes for healthCheck.
   */
  com.google.protobuf.ByteString getHealthCheckBytes();
}
