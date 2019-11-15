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
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

public interface ServiceLevelIndicatorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ServiceLevelIndicator)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Basic SLI on a well-known service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli basic_sli = 4;</code>
   */
  boolean hasBasicSli();
  /**
   *
   *
   * <pre>
   * Basic SLI on a well-known service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli basic_sli = 4;</code>
   */
  com.google.monitoring.v3.BasicSli getBasicSli();
  /**
   *
   *
   * <pre>
   * Basic SLI on a well-known service type.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli basic_sli = 4;</code>
   */
  com.google.monitoring.v3.BasicSliOrBuilder getBasicSliOrBuilder();

  /**
   *
   *
   * <pre>
   * Request-based SLIs
   * </pre>
   *
   * <code>.google.monitoring.v3.RequestBasedSli request_based = 1;</code>
   */
  boolean hasRequestBased();
  /**
   *
   *
   * <pre>
   * Request-based SLIs
   * </pre>
   *
   * <code>.google.monitoring.v3.RequestBasedSli request_based = 1;</code>
   */
  com.google.monitoring.v3.RequestBasedSli getRequestBased();
  /**
   *
   *
   * <pre>
   * Request-based SLIs
   * </pre>
   *
   * <code>.google.monitoring.v3.RequestBasedSli request_based = 1;</code>
   */
  com.google.monitoring.v3.RequestBasedSliOrBuilder getRequestBasedOrBuilder();

  /**
   *
   *
   * <pre>
   * Windows-based SLIs
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli windows_based = 2;</code>
   */
  boolean hasWindowsBased();
  /**
   *
   *
   * <pre>
   * Windows-based SLIs
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli windows_based = 2;</code>
   */
  com.google.monitoring.v3.WindowsBasedSli getWindowsBased();
  /**
   *
   *
   * <pre>
   * Windows-based SLIs
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli windows_based = 2;</code>
   */
  com.google.monitoring.v3.WindowsBasedSliOrBuilder getWindowsBasedOrBuilder();

  public com.google.monitoring.v3.ServiceLevelIndicator.TypeCase getTypeCase();
}
