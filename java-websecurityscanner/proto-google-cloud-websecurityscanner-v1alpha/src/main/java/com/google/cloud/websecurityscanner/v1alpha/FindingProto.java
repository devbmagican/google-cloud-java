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
// source: google/cloud/websecurityscanner/v1alpha/finding.proto

package com.google.cloud.websecurityscanner.v1alpha;

public final class FindingProto {
  private FindingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1alpha_Finding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1alpha_Finding_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/websecurityscanner/v1alph"
          + "a/finding.proto\022\'google.cloud.websecurit"
          + "yscanner.v1alpha\032\031google/api/resource.pr"
          + "oto\032;google/cloud/websecurityscanner/v1a"
          + "lpha/finding_addon.proto\"\351\010\n\007Finding\022\014\n\004"
          + "name\030\001 \001(\t\022R\n\014finding_type\030\002 \001(\0162<.googl"
          + "e.cloud.websecurityscanner.v1alpha.Findi"
          + "ng.FindingType\022\023\n\013http_method\030\003 \001(\t\022\022\n\nf"
          + "uzzed_url\030\004 \001(\t\022\014\n\004body\030\005 \001(\t\022\023\n\013descrip"
          + "tion\030\006 \001(\t\022\030\n\020reproduction_url\030\007 \001(\t\022\021\n\t"
          + "frame_url\030\010 \001(\t\022\021\n\tfinal_url\030\t \001(\t\022\023\n\013tr"
          + "acking_id\030\n \001(\t\022R\n\020outdated_library\030\013 \001("
          + "\01328.google.cloud.websecurityscanner.v1al"
          + "pha.OutdatedLibrary\022V\n\022violating_resourc"
          + "e\030\014 \001(\0132:.google.cloud.websecurityscanne"
          + "r.v1alpha.ViolatingResource\022V\n\022vulnerabl"
          + "e_headers\030\017 \001(\0132:.google.cloud.websecuri"
          + "tyscanner.v1alpha.VulnerableHeaders\022\\\n\025v"
          + "ulnerable_parameters\030\r \001(\0132=.google.clou"
          + "d.websecurityscanner.v1alpha.VulnerableP"
          + "arameters\0229\n\003xss\030\016 \001(\0132,.google.cloud.we"
          + "bsecurityscanner.v1alpha.Xss\"\266\002\n\013Finding"
          + "Type\022\034\n\030FINDING_TYPE_UNSPECIFIED\020\000\022\021\n\rMI"
          + "XED_CONTENT\020\001\022\024\n\020OUTDATED_LIBRARY\020\002\022\021\n\rR"
          + "OSETTA_FLASH\020\005\022\020\n\014XSS_CALLBACK\020\003\022\r\n\tXSS_"
          + "ERROR\020\004\022\027\n\023CLEAR_TEXT_PASSWORD\020\006\022\030\n\024INVA"
          + "LID_CONTENT_TYPE\020\007\022\030\n\024XSS_ANGULAR_CALLBA"
          + "CK\020\010\022\022\n\016INVALID_HEADER\020\t\022#\n\037MISSPELLED_S"
          + "ECURITY_HEADER_NAME\020\n\022&\n\"MISMATCHING_SEC"
          + "URITY_HEADER_VALUES\020\013:\204\001\352A\200\001\n)websecurit"
          + "yscanner.googleapis.com/Finding\022Sproject"
          + "s/{project}/scanConfigs/{scan_config}/sc"
          + "anRuns/{scan_run}/findings/{finding}B\232\001\n"
          + "+com.google.cloud.websecurityscanner.v1a"
          + "lphaB\014FindingProtoP\001Z[cloud.google.com/g"
          + "o/websecurityscanner/apiv1alpha/websecur"
          + "ityscannerpb;websecurityscannerpbb\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.getDescriptor(),
            });
    internal_static_google_cloud_websecurityscanner_v1alpha_Finding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1alpha_Finding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1alpha_Finding_descriptor,
            new java.lang.String[] {
              "Name",
              "FindingType",
              "HttpMethod",
              "FuzzedUrl",
              "Body",
              "Description",
              "ReproductionUrl",
              "FrameUrl",
              "FinalUrl",
              "TrackingId",
              "OutdatedLibrary",
              "ViolatingResource",
              "VulnerableHeaders",
              "VulnerableParameters",
              "Xss",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.websecurityscanner.v1alpha.FindingAddonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
