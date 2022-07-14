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
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface LongRunningRecognizeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.LongRunningRecognizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionResult results = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.SpeechRecognitionResult> getResultsList();
  /**
   *
   *
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechRecognitionResult getResults(int index);
  /**
   *
   *
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionResult results = 2;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionResult results = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.SpeechRecognitionResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechRecognitionResultOrBuilder getResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 3;</code>
   *
   * @return Whether the totalBilledTime field is set.
   */
  boolean hasTotalBilledTime();
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 3;</code>
   *
   * @return The totalBilledTime.
   */
  com.google.protobuf.Duration getTotalBilledTime();
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_time = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getTotalBilledTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Original output config if present in the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.TranscriptOutputConfig output_config = 6;</code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Original output config if present in the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.TranscriptOutputConfig output_config = 6;</code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.speech.v1p1beta1.TranscriptOutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Original output config if present in the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.TranscriptOutputConfig output_config = 6;</code>
   */
  com.google.cloud.speech.v1p1beta1.TranscriptOutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * If the transcript output fails this field contains the relevant error.
   * </pre>
   *
   * <code>.google.rpc.Status output_error = 7;</code>
   *
   * @return Whether the outputError field is set.
   */
  boolean hasOutputError();
  /**
   *
   *
   * <pre>
   * If the transcript output fails this field contains the relevant error.
   * </pre>
   *
   * <code>.google.rpc.Status output_error = 7;</code>
   *
   * @return The outputError.
   */
  com.google.rpc.Status getOutputError();
  /**
   *
   *
   * <pre>
   * If the transcript output fails this field contains the relevant error.
   * </pre>
   *
   * <code>.google.rpc.Status output_error = 7;</code>
   */
  com.google.rpc.StatusOrBuilder getOutputErrorOrBuilder();
}
