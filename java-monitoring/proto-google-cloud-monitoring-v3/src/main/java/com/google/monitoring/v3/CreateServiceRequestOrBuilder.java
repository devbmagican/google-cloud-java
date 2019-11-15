/*
 * Copyright 2019 Google LLC
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
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

public interface CreateServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the parent workspace.
   * Of the form `projects/{project_id}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Resource name of the parent workspace.
   * Of the form `projects/{project_id}`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Service id to use for this Service. If omitted, an id will be
   * generated instead. Must match the pattern [a-z0-9&#92;-]+
   * </pre>
   *
   * <code>string service_id = 3;</code>
   */
  java.lang.String getServiceId();
  /**
   *
   *
   * <pre>
   * Optional. The Service id to use for this Service. If omitted, an id will be
   * generated instead. Must match the pattern [a-z0-9&#92;-]+
   * </pre>
   *
   * <code>string service_id = 3;</code>
   */
  com.google.protobuf.ByteString getServiceIdBytes();

  /**
   *
   *
   * <pre>
   * The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2;</code>
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2;</code>
   */
  com.google.monitoring.v3.Service getService();
  /**
   *
   *
   * <pre>
   * The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2;</code>
   */
  com.google.monitoring.v3.ServiceOrBuilder getServiceOrBuilder();
}
