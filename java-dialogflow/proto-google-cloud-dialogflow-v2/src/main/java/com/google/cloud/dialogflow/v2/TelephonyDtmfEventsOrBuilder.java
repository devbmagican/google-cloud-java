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
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public interface TelephonyDtmfEventsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.TelephonyDtmfEvents)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   *
   * @return A list containing the dtmfEvents.
   */
  java.util.List<com.google.cloud.dialogflow.v2.TelephonyDtmf> getDtmfEventsList();
  /**
   *
   *
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   *
   * @return The count of dtmfEvents.
   */
  int getDtmfEventsCount();
  /**
   *
   *
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The dtmfEvents at the given index.
   */
  com.google.cloud.dialogflow.v2.TelephonyDtmf getDtmfEvents(int index);
  /**
   *
   *
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for dtmfEvents.
   */
  java.util.List<java.lang.Integer> getDtmfEventsValueList();
  /**
   *
   *
   * <pre>
   * A sequence of TelephonyDtmf digits.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.TelephonyDtmf dtmf_events = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dtmfEvents at the given index.
   */
  int getDtmfEventsValue(int index);
}
