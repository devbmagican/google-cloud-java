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
// source: google/cloud/websecurityscanner/v1alpha/finding_type_stats.proto

package com.google.cloud.websecurityscanner.v1alpha;

public final class FindingTypeStatsProto {
  private FindingTypeStatsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/websecurityscanner/v1alph"
          + "a/finding_type_stats.proto\022\'google.cloud"
          + ".websecurityscanner.v1alpha\0325google/clou"
          + "d/websecurityscanner/v1alpha/finding.pro"
          + "to\"}\n\020FindingTypeStats\022R\n\014finding_type\030\001"
          + " \001(\0162<.google.cloud.websecurityscanner.v"
          + "1alpha.Finding.FindingType\022\025\n\rfinding_co"
          + "unt\030\002 \001(\005B\243\001\n+com.google.cloud.websecuri"
          + "tyscanner.v1alphaB\025FindingTypeStatsProto"
          + "P\001Z[cloud.google.com/go/websecurityscann"
          + "er/apiv1alpha/websecurityscannerpb;webse"
          + "curityscannerpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.websecurityscanner.v1alpha.FindingProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_FindingTypeStats_descriptor,
            new java.lang.String[] {
              "FindingType", "FindingCount",
            });
    com.google.cloud.websecurityscanner.v1alpha.FindingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
