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
// source: google/cloud/aiplatform/v1beta1/content.proto

package com.google.cloud.aiplatform.v1beta1;

public interface GenerationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GenerationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Controls the randomness of predictions.
   * </pre>
   *
   * <code>optional float temperature = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the temperature field is set.
   */
  boolean hasTemperature();
  /**
   *
   *
   * <pre>
   * Optional. Controls the randomness of predictions.
   * </pre>
   *
   * <code>optional float temperature = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The temperature.
   */
  float getTemperature();

  /**
   *
   *
   * <pre>
   * Optional. If specified, nucleus sampling will be used.
   * </pre>
   *
   * <code>optional float top_p = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the topP field is set.
   */
  boolean hasTopP();
  /**
   *
   *
   * <pre>
   * Optional. If specified, nucleus sampling will be used.
   * </pre>
   *
   * <code>optional float top_p = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The topP.
   */
  float getTopP();

  /**
   *
   *
   * <pre>
   * Optional. If specified, top-k sampling will be used.
   * </pre>
   *
   * <code>optional float top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the topK field is set.
   */
  boolean hasTopK();
  /**
   *
   *
   * <pre>
   * Optional. If specified, top-k sampling will be used.
   * </pre>
   *
   * <code>optional float top_k = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The topK.
   */
  float getTopK();

  /**
   *
   *
   * <pre>
   * Optional. Number of candidates to generate.
   * </pre>
   *
   * <code>optional int32 candidate_count = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the candidateCount field is set.
   */
  boolean hasCandidateCount();
  /**
   *
   *
   * <pre>
   * Optional. Number of candidates to generate.
   * </pre>
   *
   * <code>optional int32 candidate_count = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The candidateCount.
   */
  int getCandidateCount();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of output tokens to generate per message.
   * </pre>
   *
   * <code>optional int32 max_output_tokens = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the maxOutputTokens field is set.
   */
  boolean hasMaxOutputTokens();
  /**
   *
   *
   * <pre>
   * Optional. The maximum number of output tokens to generate per message.
   * </pre>
   *
   * <code>optional int32 max_output_tokens = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxOutputTokens.
   */
  int getMaxOutputTokens();

  /**
   *
   *
   * <pre>
   * Optional. Stop sequences.
   * </pre>
   *
   * <code>repeated string stop_sequences = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the stopSequences.
   */
  java.util.List<java.lang.String> getStopSequencesList();
  /**
   *
   *
   * <pre>
   * Optional. Stop sequences.
   * </pre>
   *
   * <code>repeated string stop_sequences = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of stopSequences.
   */
  int getStopSequencesCount();
  /**
   *
   *
   * <pre>
   * Optional. Stop sequences.
   * </pre>
   *
   * <code>repeated string stop_sequences = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The stopSequences at the given index.
   */
  java.lang.String getStopSequences(int index);
  /**
   *
   *
   * <pre>
   * Optional. Stop sequences.
   * </pre>
   *
   * <code>repeated string stop_sequences = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the stopSequences at the given index.
   */
  com.google.protobuf.ByteString getStopSequencesBytes(int index);
}
