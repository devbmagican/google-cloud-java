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
// source: google/cloud/datalabeling/v1beta1/instruction.proto

package com.google.cloud.datalabeling.v1beta1;

public interface CsvInstructionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.CsvInstruction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * CSV file for the instruction. Only gcs path is allowed.
   * </pre>
   *
   * <code>string gcs_file_uri = 1;</code>
   *
   * @return The gcsFileUri.
   */
  java.lang.String getGcsFileUri();
  /**
   *
   *
   * <pre>
   * CSV file for the instruction. Only gcs path is allowed.
   * </pre>
   *
   * <code>string gcs_file_uri = 1;</code>
   *
   * @return The bytes for gcsFileUri.
   */
  com.google.protobuf.ByteString getGcsFileUriBytes();
}
