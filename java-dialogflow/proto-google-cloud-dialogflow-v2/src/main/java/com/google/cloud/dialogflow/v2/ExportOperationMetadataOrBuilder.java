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
// source: google/cloud/dialogflow/v2/document.proto

package com.google.cloud.dialogflow.v2;

public interface ExportOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ExportOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Storage file path of the exported data.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
   *
   * @return Whether the exportedGcsDestination field is set.
   */
  boolean hasExportedGcsDestination();
  /**
   *
   *
   * <pre>
   * Cloud Storage file path of the exported data.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
   *
   * @return The exportedGcsDestination.
   */
  com.google.cloud.dialogflow.v2.GcsDestination getExportedGcsDestination();
  /**
   *
   *
   * <pre>
   * Cloud Storage file path of the exported data.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination exported_gcs_destination = 1;</code>
   */
  com.google.cloud.dialogflow.v2.GcsDestinationOrBuilder getExportedGcsDestinationOrBuilder();
}
