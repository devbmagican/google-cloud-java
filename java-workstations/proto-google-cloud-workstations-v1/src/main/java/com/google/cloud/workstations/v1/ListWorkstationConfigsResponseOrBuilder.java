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
// source: google/cloud/workstations/v1/workstations.proto

package com.google.cloud.workstations.v1;

public interface ListWorkstationConfigsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1.ListWorkstationConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The requested configs.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1.WorkstationConfig workstation_configs = 1;</code>
   */
  java.util.List<com.google.cloud.workstations.v1.WorkstationConfig> getWorkstationConfigsList();
  /**
   *
   *
   * <pre>
   * The requested configs.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1.WorkstationConfig workstation_configs = 1;</code>
   */
  com.google.cloud.workstations.v1.WorkstationConfig getWorkstationConfigs(int index);
  /**
   *
   *
   * <pre>
   * The requested configs.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1.WorkstationConfig workstation_configs = 1;</code>
   */
  int getWorkstationConfigsCount();
  /**
   *
   *
   * <pre>
   * The requested configs.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1.WorkstationConfig workstation_configs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.workstations.v1.WorkstationConfigOrBuilder>
      getWorkstationConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The requested configs.
   * </pre>
   *
   * <code>repeated .google.cloud.workstations.v1.WorkstationConfig workstation_configs = 1;</code>
   */
  com.google.cloud.workstations.v1.WorkstationConfigOrBuilder getWorkstationConfigsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
