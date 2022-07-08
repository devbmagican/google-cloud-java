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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface TokenPropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.TokenProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether the provided user response token is valid. When valid = false, the
   * reason could be specified in invalid_reason or it could also be due to
   * a user failing to solve a challenge or a sitekey mismatch (i.e the sitekey
   * used to generate the token was different than the one specified in the
   * assessment).
   * </pre>
   *
   * <code>bool valid = 1;</code>
   *
   * @return The valid.
   */
  boolean getValid();

  /**
   *
   *
   * <pre>
   * Reason associated with the response when valid = false.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.TokenProperties.InvalidReason invalid_reason = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for invalidReason.
   */
  int getInvalidReasonValue();
  /**
   *
   *
   * <pre>
   * Reason associated with the response when valid = false.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.TokenProperties.InvalidReason invalid_reason = 2;
   * </code>
   *
   * @return The invalidReason.
   */
  com.google.recaptchaenterprise.v1.TokenProperties.InvalidReason getInvalidReason();

  /**
   *
   *
   * <pre>
   * The timestamp corresponding to the generation of the token.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The timestamp corresponding to the generation of the token.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The timestamp corresponding to the generation of the token.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The hostname of the page on which the token was generated.
   * </pre>
   *
   * <code>string hostname = 4;</code>
   *
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   *
   *
   * <pre>
   * The hostname of the page on which the token was generated.
   * </pre>
   *
   * <code>string hostname = 4;</code>
   *
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString getHostnameBytes();

  /**
   *
   *
   * <pre>
   * Action name provided at token generation.
   * </pre>
   *
   * <code>string action = 5;</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * Action name provided at token generation.
   * </pre>
   *
   * <code>string action = 5;</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();
}
