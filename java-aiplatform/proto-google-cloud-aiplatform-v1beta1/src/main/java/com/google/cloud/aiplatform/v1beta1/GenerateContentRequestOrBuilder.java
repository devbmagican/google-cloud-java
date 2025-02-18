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
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface GenerateContentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GenerateContentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the publisher model requested to serve the
   * prediction. Format:
   * `projects/{project}/locations/{location}/publishers/&#42;&#47;models/&#42;`
   * </pre>
   *
   * <code>string model = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Required. The name of the publisher model requested to serve the
   * prediction. Format:
   * `projects/{project}/locations/{location}/publishers/&#42;&#47;models/&#42;`
   * </pre>
   *
   * <code>string model = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Content> getContentsList();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Content getContents(int index);
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getContentsCount();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>
      getContentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ContentOrBuilder getContentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model. The only supported tool is currently
   * `Function`
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Tool> getToolsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model. The only supported tool is currently
   * `Function`
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Tool getTools(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model. The only supported tool is currently
   * `Function`
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getToolsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model. The only supported tool is currently
   * `Function`
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ToolOrBuilder>
      getToolsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. A list of `Tools` the model may use to generate the next
   * response.
   *
   * A `Tool` is a piece of code that enables the system to interact with
   * external systems to perform an action, or set of actions, outside of
   * knowledge and scope of the model. The only supported tool is currently
   * `Function`
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Tool tools = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ToolOrBuilder getToolsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.SafetySetting> getSafetySettingsList();
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SafetySetting getSafetySettings(int index);
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getSafetySettingsCount();
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.SafetySettingOrBuilder>
      getSafetySettingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Per request settings for blocking unsafe content.
   * Enforced on GenerateContentResponse.candidates.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.SafetySetting safety_settings = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SafetySettingOrBuilder getSafetySettingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Generation config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GenerationConfig generation_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the generationConfig field is set.
   */
  boolean hasGenerationConfig();
  /**
   *
   *
   * <pre>
   * Optional. Generation config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GenerationConfig generation_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The generationConfig.
   */
  com.google.cloud.aiplatform.v1beta1.GenerationConfig getGenerationConfig();
  /**
   *
   *
   * <pre>
   * Optional. Generation config.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GenerationConfig generation_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GenerationConfigOrBuilder getGenerationConfigOrBuilder();
}
