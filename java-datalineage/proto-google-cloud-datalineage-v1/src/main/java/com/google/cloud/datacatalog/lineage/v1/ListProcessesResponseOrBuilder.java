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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface ListProcessesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.ListProcessesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.lineage.v1.Process> getProcessesList();
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  com.google.cloud.datacatalog.lineage.v1.Process getProcesses(int index);
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  int getProcessesCount();
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder>
      getProcessesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The processes from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Process processes = 1;</code>
   */
  com.google.cloud.datacatalog.lineage.v1.ProcessOrBuilder getProcessesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token to specify as `page_token` in the next call to get the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * The token to specify as `page_token` in the next call to get the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
