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
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

public interface SpeechContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SpeechContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * This list can be used to:
   *
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   *
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   *
   * @return A list containing the phrases.
   */
  java.util.List<java.lang.String> getPhrasesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * This list can be used to:
   *
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   *
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   *
   * @return The count of phrases.
   */
  int getPhrasesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * This list can be used to:
   *
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   *
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The phrases at the given index.
   */
  java.lang.String getPhrases(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   *
   * This list can be used to:
   *
   * * improve accuracy for words and phrases you expect the user to say,
   *   e.g. typical commands for your Dialogflow agent
   * * add additional words to the speech recognizer vocabulary
   * * ...
   *
   * See the [Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/quotas) for usage
   * limits.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the phrases at the given index.
   */
  com.google.protobuf.ByteString getPhrasesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Boost for this context compared to other contexts:
   *
   * * If the boost is positive, Dialogflow will increase the probability that
   *   the phrases in this context are recognized over similar sounding phrases.
   * * If the boost is unspecified or non-positive, Dialogflow will not apply
   *   any boost.
   *
   * Dialogflow recommends that you use boosts in the range (0, 20] and that you
   * find a value that fits your use case with binary search.
   * </pre>
   *
   * <code>float boost = 2;</code>
   *
   * @return The boost.
   */
  float getBoost();
}
