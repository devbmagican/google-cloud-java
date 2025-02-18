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
// source: google/cloud/vertexai/v1beta1/operation.proto

package com.google.cloud.vertexai.api;

public final class OperationProto {
  private OperationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_GenericOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_GenericOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1beta1_DeleteOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1beta1_DeleteOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/vertexai/v1beta1/operatio"
          + "n.proto\022\035google.cloud.vertexai.v1beta1\032\037"
          + "google/api/field_behavior.proto\032\037google/"
          + "protobuf/timestamp.proto\032\027google/rpc/sta"
          + "tus.proto\"\274\001\n\030GenericOperationMetadata\0222"
          + "\n\020partial_failures\030\001 \003(\0132\022.google.rpc.St"
          + "atusB\004\342A\001\003\0225\n\013create_time\030\002 \001(\0132\032.google"
          + ".protobuf.TimestampB\004\342A\001\003\0225\n\013update_time"
          + "\030\003 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003"
          + "\"l\n\027DeleteOperationMetadata\022Q\n\020generic_m"
          + "etadata\030\001 \001(\01327.google.cloud.vertexai.v1"
          + "beta1.GenericOperationMetadataB\323\001\n\035com.g"
          + "oogle.cloud.vertexai.apiB\016OperationProto"
          + "P\001Z=cloud.google.com/go/vertexai/apiv1be"
          + "ta1/vertexaipb;vertexaipb\252\002\035Google.Cloud"
          + ".VertexAI.V1Beta1\312\002\035Google\\Cloud\\VertexA"
          + "I\\V1beta1\352\002 Google::Cloud::VertexAI::V1b"
          + "eta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1beta1_GenericOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1beta1_GenericOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_GenericOperationMetadata_descriptor,
            new java.lang.String[] {
              "PartialFailures", "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_vertexai_v1beta1_DeleteOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vertexai_v1beta1_DeleteOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1beta1_DeleteOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
