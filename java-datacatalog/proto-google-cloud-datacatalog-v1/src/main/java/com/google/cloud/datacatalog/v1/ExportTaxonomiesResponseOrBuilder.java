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
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

public interface ExportTaxonomiesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ExportTaxonomiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of taxonomies and policy tags as nested protocol buffers.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.SerializedTaxonomy> getTaxonomiesList();
  /**
   *
   *
   * <pre>
   * List of taxonomies and policy tags as nested protocol buffers.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1;</code>
   */
  com.google.cloud.datacatalog.v1.SerializedTaxonomy getTaxonomies(int index);
  /**
   *
   *
   * <pre>
   * List of taxonomies and policy tags as nested protocol buffers.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1;</code>
   */
  int getTaxonomiesCount();
  /**
   *
   *
   * <pre>
   * List of taxonomies and policy tags as nested protocol buffers.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder>
      getTaxonomiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of taxonomies and policy tags as nested protocol buffers.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.SerializedTaxonomy taxonomies = 1;</code>
   */
  com.google.cloud.datacatalog.v1.SerializedTaxonomyOrBuilder getTaxonomiesOrBuilder(int index);
}
