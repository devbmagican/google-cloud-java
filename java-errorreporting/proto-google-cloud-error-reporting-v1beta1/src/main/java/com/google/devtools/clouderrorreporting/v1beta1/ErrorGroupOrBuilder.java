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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ErrorGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ErrorGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The group resource name.
   * Example: &lt;code&gt;projects/my-project-123/groups/CNSgkpnppqKCUw&lt;/code&gt;
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The group resource name.
   * Example: &lt;code&gt;projects/my-project-123/groups/CNSgkpnppqKCUw&lt;/code&gt;
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Group IDs are unique for a given project. If the same kind of error
   * occurs in different service contexts, it will receive the same group ID.
   * </pre>
   *
   * <code>string group_id = 2;</code>
   *
   * @return The groupId.
   */
  java.lang.String getGroupId();
  /**
   *
   *
   * <pre>
   * Group IDs are unique for a given project. If the same kind of error
   * occurs in different service contexts, it will receive the same group ID.
   * </pre>
   *
   * <code>string group_id = 2;</code>
   *
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString getGroupIdBytes();

  /**
   *
   *
   * <pre>
   * Associated tracking issues.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TrackingIssue tracking_issues = 3;
   * </code>
   */
  java.util.List<com.google.devtools.clouderrorreporting.v1beta1.TrackingIssue>
      getTrackingIssuesList();
  /**
   *
   *
   * <pre>
   * Associated tracking issues.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TrackingIssue tracking_issues = 3;
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.TrackingIssue getTrackingIssues(int index);
  /**
   *
   *
   * <pre>
   * Associated tracking issues.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TrackingIssue tracking_issues = 3;
   * </code>
   */
  int getTrackingIssuesCount();
  /**
   *
   *
   * <pre>
   * Associated tracking issues.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TrackingIssue tracking_issues = 3;
   * </code>
   */
  java.util.List<? extends com.google.devtools.clouderrorreporting.v1beta1.TrackingIssueOrBuilder>
      getTrackingIssuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Associated tracking issues.
   * </pre>
   *
   * <code>repeated .google.devtools.clouderrorreporting.v1beta1.TrackingIssue tracking_issues = 3;
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.TrackingIssueOrBuilder getTrackingIssuesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Error group's resolution status.
   * An unspecified resolution status will be interpreted as OPEN
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ResolutionStatus resolution_status = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for resolutionStatus.
   */
  int getResolutionStatusValue();
  /**
   *
   *
   * <pre>
   * Error group's resolution status.
   * An unspecified resolution status will be interpreted as OPEN
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ResolutionStatus resolution_status = 5;
   * </code>
   *
   * @return The resolutionStatus.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ResolutionStatus getResolutionStatus();
}
