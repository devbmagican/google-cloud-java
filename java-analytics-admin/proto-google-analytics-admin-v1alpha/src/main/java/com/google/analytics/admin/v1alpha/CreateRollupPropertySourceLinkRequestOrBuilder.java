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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface CreateRollupPropertySourceLinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateRollupPropertySourceLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format: properties/{property_id}
   * Example: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Format: properties/{property_id}
   * Example: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The roll-up property source link to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.RollupPropertySourceLink rollup_property_source_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rollupPropertySourceLink field is set.
   */
  boolean hasRollupPropertySourceLink();
  /**
   *
   *
   * <pre>
   * Required. The roll-up property source link to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.RollupPropertySourceLink rollup_property_source_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rollupPropertySourceLink.
   */
  com.google.analytics.admin.v1alpha.RollupPropertySourceLink getRollupPropertySourceLink();
  /**
   *
   *
   * <pre>
   * Required. The roll-up property source link to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.RollupPropertySourceLink rollup_property_source_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.RollupPropertySourceLinkOrBuilder
      getRollupPropertySourceLinkOrBuilder();
}
