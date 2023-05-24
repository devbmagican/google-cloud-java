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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface PhraseMatchDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.PhraseMatchData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier (the resource name) of the phrase matcher.
   * </pre>
   *
   * <code>string phrase_matcher = 1;</code>
   *
   * @return The phraseMatcher.
   */
  java.lang.String getPhraseMatcher();
  /**
   *
   *
   * <pre>
   * The unique identifier (the resource name) of the phrase matcher.
   * </pre>
   *
   * <code>string phrase_matcher = 1;</code>
   *
   * @return The bytes for phraseMatcher.
   */
  com.google.protobuf.ByteString getPhraseMatcherBytes();

  /**
   *
   *
   * <pre>
   * The human-readable name of the phrase matcher.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The human-readable name of the phrase matcher.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
