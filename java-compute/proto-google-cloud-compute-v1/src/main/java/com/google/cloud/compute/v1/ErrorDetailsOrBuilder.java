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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ErrorDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ErrorDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
   *
   * @return Whether the errorInfo field is set.
   */
  boolean hasErrorInfo();
  /**
   * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
   *
   * @return The errorInfo.
   */
  com.google.cloud.compute.v1.ErrorInfo getErrorInfo();
  /** <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code> */
  com.google.cloud.compute.v1.ErrorInfoOrBuilder getErrorInfoOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
   *
   * @return Whether the help field is set.
   */
  boolean hasHelp();
  /**
   * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
   *
   * @return The help.
   */
  com.google.cloud.compute.v1.Help getHelp();
  /** <code>optional .google.cloud.compute.v1.Help help = 3198785;</code> */
  com.google.cloud.compute.v1.HelpOrBuilder getHelpOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
   *
   * @return Whether the localizedMessage field is set.
   */
  boolean hasLocalizedMessage();
  /**
   * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
   *
   * @return The localizedMessage.
   */
  com.google.cloud.compute.v1.LocalizedMessage getLocalizedMessage();
  /**
   * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
   */
  com.google.cloud.compute.v1.LocalizedMessageOrBuilder getLocalizedMessageOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.QuotaExceededInfo quota_info = 93923861;</code>
   *
   * @return Whether the quotaInfo field is set.
   */
  boolean hasQuotaInfo();
  /**
   * <code>optional .google.cloud.compute.v1.QuotaExceededInfo quota_info = 93923861;</code>
   *
   * @return The quotaInfo.
   */
  com.google.cloud.compute.v1.QuotaExceededInfo getQuotaInfo();
  /** <code>optional .google.cloud.compute.v1.QuotaExceededInfo quota_info = 93923861;</code> */
  com.google.cloud.compute.v1.QuotaExceededInfoOrBuilder getQuotaInfoOrBuilder();
}
