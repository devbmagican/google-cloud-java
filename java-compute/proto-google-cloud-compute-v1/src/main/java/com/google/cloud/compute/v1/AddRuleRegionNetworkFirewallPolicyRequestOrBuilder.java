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

public interface AddRuleRegionNetworkFirewallPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AddRuleRegionNetworkFirewallPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the firewall policy to update.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The firewallPolicy.
   */
  java.lang.String getFirewallPolicy();
  /**
   *
   *
   * <pre>
   * Name of the firewall policy to update.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for firewallPolicy.
   */
  com.google.protobuf.ByteString getFirewallPolicyBytes();

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.FirewallPolicyRule firewall_policy_rule_resource = 250523523 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the firewallPolicyRuleResource field is set.
   */
  boolean hasFirewallPolicyRuleResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.FirewallPolicyRule firewall_policy_rule_resource = 250523523 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The firewallPolicyRuleResource.
   */
  com.google.cloud.compute.v1.FirewallPolicyRule getFirewallPolicyRuleResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.FirewallPolicyRule firewall_policy_rule_resource = 250523523 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.FirewallPolicyRuleOrBuilder getFirewallPolicyRuleResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * When rule.priority is not specified, auto choose a unused priority between minPriority and maxPriority&gt;. This field is exclusive with rule.priority.
   * </pre>
   *
   * <code>optional int32 max_priority = 329635359;</code>
   *
   * @return Whether the maxPriority field is set.
   */
  boolean hasMaxPriority();
  /**
   *
   *
   * <pre>
   * When rule.priority is not specified, auto choose a unused priority between minPriority and maxPriority&gt;. This field is exclusive with rule.priority.
   * </pre>
   *
   * <code>optional int32 max_priority = 329635359;</code>
   *
   * @return The maxPriority.
   */
  int getMaxPriority();

  /**
   *
   *
   * <pre>
   * When rule.priority is not specified, auto choose a unused priority between minPriority and maxPriority&gt;. This field is exclusive with rule.priority.
   * </pre>
   *
   * <code>optional int32 min_priority = 267190513;</code>
   *
   * @return Whether the minPriority field is set.
   */
  boolean hasMinPriority();
  /**
   *
   *
   * <pre>
   * When rule.priority is not specified, auto choose a unused priority between minPriority and maxPriority&gt;. This field is exclusive with rule.priority.
   * </pre>
   *
   * <code>optional int32 min_priority = 267190513;</code>
   *
   * @return The minPriority.
   */
  int getMinPriority();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
