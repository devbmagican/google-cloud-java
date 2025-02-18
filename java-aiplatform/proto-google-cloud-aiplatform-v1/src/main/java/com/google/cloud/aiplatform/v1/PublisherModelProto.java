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
// source: google/cloud/aiplatform/v1/publisher_model.proto

package com.google.cloud.aiplatform.v1;

public final class PublisherModelProto {
  private PublisherModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/publisher_m"
          + "odel.proto\022\032google.cloud.aiplatform.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0322google/cloud/aiplatf"
          + "orm/v1/machine_resources.proto\032&google/c"
          + "loud/aiplatform/v1/model.proto\"\214\032\n\016Publi"
          + "sherModel\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\031\n\nversion"
          + "_id\030\002 \001(\tB\005\342A\002\005\003\022a\n\024open_source_category"
          + "\030\007 \001(\0162=.google.cloud.aiplatform.v1.Publ"
          + "isherModel.OpenSourceCategoryB\004\342A\001\002\022X\n\021s"
          + "upported_actions\030\023 \001(\01327.google.cloud.ai"
          + "platform.v1.PublisherModel.CallToActionB"
          + "\004\342A\001\001\022\030\n\nframeworks\030\027 \003(\tB\004\342A\001\001\022R\n\014launc"
          + "h_stage\030\035 \001(\01626.google.cloud.aiplatform."
          + "v1.PublisherModel.LaunchStageB\004\342A\001\001\022T\n\rv"
          + "ersion_state\030% \001(\01627.google.cloud.aiplat"
          + "form.v1.PublisherModel.VersionStateB\004\342A\001"
          + "\001\022\'\n\030publisher_model_template\030\036 \001(\tB\005\342A\002"
          + "\005\003\022K\n\020predict_schemata\030\037 \001(\0132+.google.cl"
          + "oud.aiplatform.v1.PredictSchemataB\004\342A\001\001\032"
          + "s\n\021ResourceReference\022\r\n\003uri\030\001 \001(\tH\000\022\027\n\rr"
          + "esource_name\030\002 \001(\tH\000\022\022\n\010use_case\030\003 \001(\tH\000"
          + "\022\025\n\013description\030\004 \001(\tH\000B\013\n\treference\032;\n\r"
          + "Documentation\022\023\n\005title\030\001 \001(\tB\004\342A\001\002\022\025\n\007co"
          + "ntent\030\002 \001(\tB\004\342A\001\002\032\230\020\n\014CallToAction\022`\n\rvi"
          + "ew_rest_api\030\001 \001(\0132C.google.cloud.aiplatf"
          + "orm.v1.PublisherModel.CallToAction.ViewR"
          + "estApiB\004\342A\001\001\022o\n\ropen_notebook\030\002 \001(\0132R.go"
          + "ogle.cloud.aiplatform.v1.PublisherModel."
          + "CallToAction.RegionalResourceReferencesB"
          + "\004\342A\001\001\022t\n\022create_application\030\003 \001(\0132R.goog"
          + "le.cloud.aiplatform.v1.PublisherModel.Ca"
          + "llToAction.RegionalResourceReferencesB\004\342"
          + "A\001\001\022{\n\031open_fine_tuning_pipeline\030\004 \001(\0132R"
          + ".google.cloud.aiplatform.v1.PublisherMod"
          + "el.CallToAction.RegionalResourceReferenc"
          + "esB\004\342A\001\001\022}\n\033open_prompt_tuning_pipeline\030"
          + "\005 \001(\0132R.google.cloud.aiplatform.v1.Publi"
          + "sherModel.CallToAction.RegionalResourceR"
          + "eferencesB\004\342A\001\001\022l\n\nopen_genie\030\006 \001(\0132R.go"
          + "ogle.cloud.aiplatform.v1.PublisherModel."
          + "CallToAction.RegionalResourceReferencesB"
          + "\004\342A\001\001\022T\n\006deploy\030\007 \001(\0132>.google.cloud.aip"
          + "latform.v1.PublisherModel.CallToAction.D"
          + "eployB\004\342A\001\001\022{\n\031open_generation_ai_studio"
          + "\030\010 \001(\0132R.google.cloud.aiplatform.v1.Publ"
          + "isherModel.CallToAction.RegionalResource"
          + "ReferencesB\004\342A\001\001\022p\n\016request_access\030\t \001(\013"
          + "2R.google.cloud.aiplatform.v1.PublisherM"
          + "odel.CallToAction.RegionalResourceRefere"
          + "ncesB\004\342A\001\001\022z\n\030open_evaluation_pipeline\030\013"
          + " \001(\0132R.google.cloud.aiplatform.v1.Publis"
          + "herModel.CallToAction.RegionalResourceRe"
          + "ferencesB\004\342A\001\001\032\240\002\n\032RegionalResourceRefer"
          + "ences\022|\n\nreferences\030\001 \003(\0132b.google.cloud"
          + ".aiplatform.v1.PublisherModel.CallToActi"
          + "on.RegionalResourceReferences.References"
          + "EntryB\004\342A\001\002\022\023\n\005title\030\002 \001(\tB\004\342A\001\002\032o\n\017Refe"
          + "rencesEntry\022\013\n\003key\030\001 \001(\t\022K\n\005value\030\002 \001(\0132"
          + "<.google.cloud.aiplatform.v1.PublisherMo"
          + "del.ResourceReference:\0028\001\032z\n\013ViewRestApi"
          + "\022V\n\016documentations\030\001 \003(\01328.google.cloud."
          + "aiplatform.v1.PublisherModel.Documentati"
          + "onB\004\342A\001\002\022\023\n\005title\030\002 \001(\tB\004\342A\001\002\032\364\003\n\006Deploy"
          + "\022M\n\023dedicated_resources\030\005 \001(\0132..google.c"
          + "loud.aiplatform.v1.DedicatedResourcesH\000\022"
          + "M\n\023automatic_resources\030\006 \001(\0132..google.cl"
          + "oud.aiplatform.v1.AutomaticResourcesH\000\022\032"
          + "\n\020shared_resources\030\007 \001(\tH\000\022 \n\022model_disp"
          + "lay_name\030\001 \001(\tB\004\342A\001\001\022T\n\025large_model_refe"
          + "rence\030\002 \001(\0132/.google.cloud.aiplatform.v1"
          + ".LargeModelReferenceB\004\342A\001\001\022L\n\016container_"
          + "spec\030\003 \001(\0132..google.cloud.aiplatform.v1."
          + "ModelContainerSpecB\004\342A\001\001\022\032\n\014artifact_uri"
          + "\030\004 \001(\tB\004\342A\001\001\022\023\n\005title\030\010 \001(\tB\004\342A\001\002\022!\n\023pub"
          + "lic_artifact_uri\030\t \001(\tB\004\342A\001\001B\026\n\024predicti"
          + "on_resources\"\333\001\n\022OpenSourceCategory\022$\n O"
          + "PEN_SOURCE_CATEGORY_UNSPECIFIED\020\000\022\017\n\013PRO"
          + "PRIETARY\020\001\022+\n\'GOOGLE_OWNED_OSS_WITH_GOOG"
          + "LE_CHECKPOINT\020\002\0220\n,THIRD_PARTY_OWNED_OSS"
          + "_WITH_GOOGLE_CHECKPOINT\020\003\022\024\n\020GOOGLE_OWNE"
          + "D_OSS\020\004\022\031\n\025THIRD_PARTY_OWNED_OSS\020\005\"n\n\013La"
          + "unchStage\022\034\n\030LAUNCH_STAGE_UNSPECIFIED\020\000\022"
          + "\020\n\014EXPERIMENTAL\020\001\022\023\n\017PRIVATE_PREVIEW\020\002\022\022"
          + "\n\016PUBLIC_PREVIEW\020\003\022\006\n\002GA\020\004\"c\n\014VersionSta"
          + "te\022\035\n\031VERSION_STATE_UNSPECIFIED\020\000\022\030\n\024VER"
          + "SION_STATE_STABLE\020\001\022\032\n\026VERSION_STATE_UNS"
          + "TABLE\020\002:T\352AQ\n(aiplatform.googleapis.com/"
          + "PublisherModel\022%publishers/{publisher}/m"
          + "odels/{model}B\321\001\n\036com.google.cloud.aipla"
          + "tform.v1B\023PublisherModelProtoP\001Z>cloud.g"
          + "oogle.com/go/aiplatform/apiv1/aiplatform"
          + "pb;aiplatformpb\252\002\032Google.Cloud.AIPlatfor"
          + "m.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Goog"
          + "le::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor,
            new java.lang.String[] {
              "Name",
              "VersionId",
              "OpenSourceCategory",
              "SupportedActions",
              "Frameworks",
              "LaunchStage",
              "VersionState",
              "PublisherModelTemplate",
              "PredictSchemata",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_descriptor,
            new java.lang.String[] {
              "Uri", "ResourceName", "UseCase", "Description", "Reference",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_descriptor,
            new java.lang.String[] {
              "Title", "Content",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor,
            new java.lang.String[] {
              "ViewRestApi",
              "OpenNotebook",
              "CreateApplication",
              "OpenFineTuningPipeline",
              "OpenPromptTuningPipeline",
              "OpenGenie",
              "Deploy",
              "OpenGenerationAiStudio",
              "RequestAccess",
              "OpenEvaluationPipeline",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor,
            new java.lang.String[] {
              "References", "Title",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_descriptor,
            new java.lang.String[] {
              "Documentations", "Title",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_descriptor,
            new java.lang.String[] {
              "DedicatedResources",
              "AutomaticResources",
              "SharedResources",
              "ModelDisplayName",
              "LargeModelReference",
              "ContainerSpec",
              "ArtifactUri",
              "Title",
              "PublicArtifactUri",
              "PredictionResources",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
