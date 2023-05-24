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

public interface FaqAnswerDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.FaqAnswerData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The piece of text from the `source` knowledge base document.
   * </pre>
   *
   * <code>string answer = 1;</code>
   *
   * @return The answer.
   */
  java.lang.String getAnswer();
  /**
   *
   *
   * <pre>
   * The piece of text from the `source` knowledge base document.
   * </pre>
   *
   * <code>string answer = 1;</code>
   *
   * @return The bytes for answer.
   */
  com.google.protobuf.ByteString getAnswerBytes();

  /**
   *
   *
   * <pre>
   * The system's confidence score that this answer is a good match for this
   * conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely
   * certain).
   * </pre>
   *
   * <code>float confidence_score = 2;</code>
   *
   * @return The confidenceScore.
   */
  float getConfidenceScore();

  /**
   *
   *
   * <pre>
   * The corresponding FAQ question.
   * </pre>
   *
   * <code>string question = 3;</code>
   *
   * @return The question.
   */
  java.lang.String getQuestion();
  /**
   *
   *
   * <pre>
   * The corresponding FAQ question.
   * </pre>
   *
   * <code>string question = 3;</code>
   *
   * @return The bytes for question.
   */
  com.google.protobuf.ByteString getQuestionBytes();

  /**
   *
   *
   * <pre>
   * Map that contains metadata about the FAQ answer and the document that
   * it originates from.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the FAQ answer and the document that
   * it originates from.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the FAQ answer and the document that
   * it originates from.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the FAQ answer and the document that
   * it originates from.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Map that contains metadata about the FAQ answer and the document that
   * it originates from.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 4;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The name of the answer record.
   * Format:
   * projects/{project}/locations/{location}/answerRecords/{answer_record}
   * </pre>
   *
   * <code>string query_record = 5;</code>
   *
   * @return The queryRecord.
   */
  java.lang.String getQueryRecord();
  /**
   *
   *
   * <pre>
   * The name of the answer record.
   * Format:
   * projects/{project}/locations/{location}/answerRecords/{answer_record}
   * </pre>
   *
   * <code>string query_record = 5;</code>
   *
   * @return The bytes for queryRecord.
   */
  com.google.protobuf.ByteString getQueryRecordBytes();

  /**
   *
   *
   * <pre>
   * The knowledge document that this answer was extracted from.
   * Format:
   * projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
   * </pre>
   *
   * <code>string source = 6;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * The knowledge document that this answer was extracted from.
   * Format:
   * projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
   * </pre>
   *
   * <code>string source = 6;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();
}
