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
// source: google/cloud/datacatalog/v1beta1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1beta1;

public interface ExportTaxonomiesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.ExportTaxonomiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the project that taxonomies to be exported
   * will share.
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
   * Required. Resource name of the project that taxonomies to be exported
   * will share.
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
   * Required. Resource names of the taxonomies to be exported.
   * </pre>
   *
   * <code>
   * repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the taxonomies.
   */
  java.util.List<java.lang.String> getTaxonomiesList();
  /**
   *
   *
   * <pre>
   * Required. Resource names of the taxonomies to be exported.
   * </pre>
   *
   * <code>
   * repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of taxonomies.
   */
  int getTaxonomiesCount();
  /**
   *
   *
   * <pre>
   * Required. Resource names of the taxonomies to be exported.
   * </pre>
   *
   * <code>
   * repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The taxonomies at the given index.
   */
  java.lang.String getTaxonomies(int index);
  /**
   *
   *
   * <pre>
   * Required. Resource names of the taxonomies to be exported.
   * </pre>
   *
   * <code>
   * repeated string taxonomies = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the taxonomies at the given index.
   */
  com.google.protobuf.ByteString getTaxonomiesBytes(int index);

  /**
   *
   *
   * <pre>
   * Export taxonomies as serialized taxonomies.
   * </pre>
   *
   * <code>bool serialized_taxonomies = 3;</code>
   *
   * @return Whether the serializedTaxonomies field is set.
   */
  boolean hasSerializedTaxonomies();
  /**
   *
   *
   * <pre>
   * Export taxonomies as serialized taxonomies.
   * </pre>
   *
   * <code>bool serialized_taxonomies = 3;</code>
   *
   * @return The serializedTaxonomies.
   */
  boolean getSerializedTaxonomies();

  public com.google.cloud.datacatalog.v1beta1.ExportTaxonomiesRequest.DestinationCase
      getDestinationCase();
}
