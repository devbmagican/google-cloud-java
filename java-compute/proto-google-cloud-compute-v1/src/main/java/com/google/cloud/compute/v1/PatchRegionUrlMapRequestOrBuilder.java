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

public interface PatchRegionUrlMapRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PatchRegionUrlMapRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   *
   *
   * <pre>
   * begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Name of the UrlMap resource to patch.
   * </pre>
   *
   * <code>string url_map = 367020684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The urlMap.
   */
  java.lang.String getUrlMap();
  /**
   *
   *
   * <pre>
   * Name of the UrlMap resource to patch.
   * </pre>
   *
   * <code>string url_map = 367020684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for urlMap.
   */
  com.google.protobuf.ByteString getUrlMapBytes();

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.UrlMap url_map_resource = 168675425 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the urlMapResource field is set.
   */
  boolean hasUrlMapResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.UrlMap url_map_resource = 168675425 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The urlMapResource.
   */
  com.google.cloud.compute.v1.UrlMap getUrlMapResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.UrlMap url_map_resource = 168675425 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.UrlMapOrBuilder getUrlMapResourceOrBuilder();
}
