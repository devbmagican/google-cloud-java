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
// source: google/cloud/dialogflow/v2/document.proto

package com.google.cloud.dialogflow.v2;

public interface KnowledgeOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.KnowledgeOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The current state of this operation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.KnowledgeOperationMetadata.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of this operation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.KnowledgeOperationMetadata.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dialogflow.v2.KnowledgeOperationMetadata.State getState();

  /**
   *
   *
   * <pre>
   * The name of the knowledge base interacted with during the operation.
   * </pre>
   *
   * <code>string knowledge_base = 3;</code>
   *
   * @return The knowledgeBase.
   */
  java.lang.String getKnowledgeBase();
  /**
   *
   *
   * <pre>
   * The name of the knowledge base interacted with during the operation.
   * </pre>
   *
   * <code>string knowledge_base = 3;</code>
   *
   * @return The bytes for knowledgeBase.
   */
  com.google.protobuf.ByteString getKnowledgeBaseBytes();

  /**
   *
   *
   * <pre>
   * Metadata for the Export Data Operation such as the destination of export.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ExportOperationMetadata export_operation_metadata = 4;</code>
   *
   * @return Whether the exportOperationMetadata field is set.
   */
  boolean hasExportOperationMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for the Export Data Operation such as the destination of export.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ExportOperationMetadata export_operation_metadata = 4;</code>
   *
   * @return The exportOperationMetadata.
   */
  com.google.cloud.dialogflow.v2.ExportOperationMetadata getExportOperationMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for the Export Data Operation such as the destination of export.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ExportOperationMetadata export_operation_metadata = 4;</code>
   */
  com.google.cloud.dialogflow.v2.ExportOperationMetadataOrBuilder
      getExportOperationMetadataOrBuilder();

  com.google.cloud.dialogflow.v2.KnowledgeOperationMetadata.OperationMetadataCase
      getOperationMetadataCase();
}
