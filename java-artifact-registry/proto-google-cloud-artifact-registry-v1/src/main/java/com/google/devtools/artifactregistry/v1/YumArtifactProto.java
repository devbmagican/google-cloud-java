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
// source: google/devtools/artifactregistry/v1/yum_artifact.proto

package com.google.devtools.artifactregistry.v1;

public final class YumArtifactProto {
  private YumArtifactProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_YumArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1/yu"
          + "m_artifact.proto\022#google.devtools.artifa"
          + "ctregistry.v1\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\027googl"
          + "e/rpc/status.proto\"\213\003\n\013YumArtifact\022\022\n\004na"
          + "me\030\001 \001(\tB\004\342A\001\003\022\032\n\014package_name\030\002 \001(\tB\004\342A"
          + "\001\003\022X\n\014package_type\030\003 \001(\0162<.google.devtoo"
          + "ls.artifactregistry.v1.YumArtifact.Packa"
          + "geTypeB\004\342A\001\003\022\032\n\014architecture\030\004 \001(\tB\004\342A\001\003"
          + "\"C\n\013PackageType\022\034\n\030PACKAGE_TYPE_UNSPECIF"
          + "IED\020\000\022\n\n\006BINARY\020\001\022\n\n\006SOURCE\020\002:\220\001\352A\214\001\n+ar"
          + "tifactregistry.googleapis.com/YumArtifac"
          + "t\022]projects/{project}/locations/{locatio"
          + "n}/repositories/{repository}/yumArtifact"
          + "s/{yum_artifact}\"B\n\033ImportYumArtifactsGc"
          + "sSource\022\014\n\004uris\030\001 \003(\t\022\025\n\ruse_wildcards\030\002"
          + " \001(\010\"\215\001\n\031ImportYumArtifactsRequest\022V\n\ngc"
          + "s_source\030\002 \001(\0132@.google.devtools.artifac"
          + "tregistry.v1.ImportYumArtifactsGcsSource"
          + "H\000\022\016\n\006parent\030\001 \001(\tB\010\n\006source\"\242\001\n\033ImportY"
          + "umArtifactsErrorInfo\022V\n\ngcs_source\030\001 \001(\013"
          + "2@.google.devtools.artifactregistry.v1.I"
          + "mportYumArtifactsGcsSourceH\000\022!\n\005error\030\002 "
          + "\001(\0132\022.google.rpc.StatusB\010\n\006source\"\267\001\n\032Im"
          + "portYumArtifactsResponse\022G\n\ryum_artifact"
          + "s\030\001 \003(\01320.google.devtools.artifactregist"
          + "ry.v1.YumArtifact\022P\n\006errors\030\002 \003(\0132@.goog"
          + "le.devtools.artifactregistry.v1.ImportYu"
          + "mArtifactsErrorInfo\"\034\n\032ImportYumArtifact"
          + "sMetadataB\373\001\n\'com.google.devtools.artifa"
          + "ctregistry.v1B\020YumArtifactProtoP\001ZPcloud"
          + ".google.com/go/artifactregistry/apiv1/ar"
          + "tifactregistrypb;artifactregistrypb\252\002 Go"
          + "ogle.Cloud.ArtifactRegistry.V1\312\002 Google\\"
          + "Cloud\\ArtifactRegistry\\V1\352\002#Google::Clou"
          + "d::ArtifactRegistry::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_YumArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_YumArtifact_descriptor,
            new java.lang.String[] {
              "Name", "PackageName", "PackageType", "Architecture",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsGcsSource_descriptor,
            new java.lang.String[] {
              "Uris", "UseWildcards",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsRequest_descriptor,
            new java.lang.String[] {
              "GcsSource", "Parent", "Source",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor,
            new java.lang.String[] {
              "GcsSource", "Error", "Source",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsResponse_descriptor,
            new java.lang.String[] {
              "YumArtifacts", "Errors",
            });
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
