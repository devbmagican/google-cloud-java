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
// source: google/cloud/dialogflow/v2/conversation.proto

package com.google.cloud.dialogflow.v2;

public interface ConversationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Conversation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this conversation.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this conversation.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the Conversation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Conversation.LifecycleState lifecycle_state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for lifecycleState.
   */
  int getLifecycleStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the Conversation.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Conversation.LifecycleState lifecycle_state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lifecycleState.
   */
  com.google.cloud.dialogflow.v2.Conversation.LifecycleState getLifecycleState();

  /**
   *
   *
   * <pre>
   * Required. The Conversation Profile to be used to configure this
   * Conversation. This field cannot be updated.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation_profile = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The conversationProfile.
   */
  java.lang.String getConversationProfile();
  /**
   *
   *
   * <pre>
   * Required. The Conversation Profile to be used to configure this
   * Conversation. This field cannot be updated.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation_profile = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for conversationProfile.
   */
  com.google.protobuf.ByteString getConversationProfileBytes();

  /**
   *
   *
   * <pre>
   * Output only. It will not be empty if the conversation is to be connected
   * over telephony.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationPhoneNumber phone_number = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   *
   *
   * <pre>
   * Output only. It will not be empty if the conversation is to be connected
   * over telephony.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationPhoneNumber phone_number = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The phoneNumber.
   */
  com.google.cloud.dialogflow.v2.ConversationPhoneNumber getPhoneNumber();
  /**
   *
   *
   * <pre>
   * Output only. It will not be empty if the conversation is to be connected
   * over telephony.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ConversationPhoneNumber phone_number = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.ConversationPhoneNumberOrBuilder getPhoneNumberOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the conversation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the conversation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the conversation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the conversation was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the conversation was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the conversation was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The stage of a conversation. It indicates whether the virtual agent or a
   * human agent is handling the conversation.
   *
   * If the conversation is created with the conversation profile that has
   * Dialogflow config set, defaults to
   * [ConversationStage.VIRTUAL_AGENT_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.VIRTUAL_AGENT_STAGE];
   * Otherwise, defaults to
   * [ConversationStage.HUMAN_ASSIST_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.HUMAN_ASSIST_STAGE].
   *
   * If the conversation is created with the conversation profile that has
   * Dialogflow config set but explicitly sets conversation_stage to
   * [ConversationStage.HUMAN_ASSIST_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.HUMAN_ASSIST_STAGE],
   * it skips
   * [ConversationStage.VIRTUAL_AGENT_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.VIRTUAL_AGENT_STAGE]
   * stage and directly goes to
   * [ConversationStage.HUMAN_ASSIST_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.HUMAN_ASSIST_STAGE].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Conversation.ConversationStage conversation_stage = 7;</code>
   *
   * @return The enum numeric value on the wire for conversationStage.
   */
  int getConversationStageValue();
  /**
   *
   *
   * <pre>
   * The stage of a conversation. It indicates whether the virtual agent or a
   * human agent is handling the conversation.
   *
   * If the conversation is created with the conversation profile that has
   * Dialogflow config set, defaults to
   * [ConversationStage.VIRTUAL_AGENT_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.VIRTUAL_AGENT_STAGE];
   * Otherwise, defaults to
   * [ConversationStage.HUMAN_ASSIST_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.HUMAN_ASSIST_STAGE].
   *
   * If the conversation is created with the conversation profile that has
   * Dialogflow config set but explicitly sets conversation_stage to
   * [ConversationStage.HUMAN_ASSIST_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.HUMAN_ASSIST_STAGE],
   * it skips
   * [ConversationStage.VIRTUAL_AGENT_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.VIRTUAL_AGENT_STAGE]
   * stage and directly goes to
   * [ConversationStage.HUMAN_ASSIST_STAGE][google.cloud.dialogflow.v2.Conversation.ConversationStage.HUMAN_ASSIST_STAGE].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Conversation.ConversationStage conversation_stage = 7;</code>
   *
   * @return The conversationStage.
   */
  com.google.cloud.dialogflow.v2.Conversation.ConversationStage getConversationStage();
}
