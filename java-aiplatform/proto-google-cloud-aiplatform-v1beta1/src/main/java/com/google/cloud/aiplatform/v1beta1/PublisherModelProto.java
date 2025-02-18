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
// source: google/cloud/aiplatform/v1beta1/publisher_model.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PublisherModelProto {
  private PublisherModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/publis"
          + "her_model.proto\022\037google.cloud.aiplatform"
          + ".v1beta1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\0327google/clo"
          + "ud/aiplatform/v1beta1/machine_resources."
          + "proto\032+google/cloud/aiplatform/v1beta1/m"
          + "odel.proto\"\317\034\n\016PublisherModel\022\022\n\004name\030\001 "
          + "\001(\tB\004\342A\001\003\022\031\n\nversion_id\030\002 \001(\tB\005\342A\002\005\003\022f\n\024"
          + "open_source_category\030\007 \001(\0162B.google.clou"
          + "d.aiplatform.v1beta1.PublisherModel.Open"
          + "SourceCategoryB\004\342A\001\002\022L\n\006parent\030\016 \001(\01326.g"
          + "oogle.cloud.aiplatform.v1beta1.Publisher"
          + "Model.ParentB\004\342A\001\001\022]\n\021supported_actions\030"
          + "\023 \001(\0132<.google.cloud.aiplatform.v1beta1."
          + "PublisherModel.CallToActionB\004\342A\001\001\022\030\n\nfra"
          + "meworks\030\027 \003(\tB\004\342A\001\001\022W\n\014launch_stage\030\035 \001("
          + "\0162;.google.cloud.aiplatform.v1beta1.Publ"
          + "isherModel.LaunchStageB\004\342A\001\001\022Y\n\rversion_"
          + "state\030% \001(\0162<.google.cloud.aiplatform.v1"
          + "beta1.PublisherModel.VersionStateB\004\342A\001\001\022"
          + "\'\n\030publisher_model_template\030\036 \001(\tB\005\342A\002\005\003"
          + "\022P\n\020predict_schemata\030\037 \001(\01320.google.clou"
          + "d.aiplatform.v1beta1.PredictSchemataB\004\342A"
          + "\001\001\032s\n\021ResourceReference\022\r\n\003uri\030\001 \001(\tH\000\022\027"
          + "\n\rresource_name\030\002 \001(\tH\000\022\022\n\010use_case\030\003 \001("
          + "\tH\000\022\025\n\013description\030\004 \001(\tH\000B\013\n\treference\032"
          + "\200\001\n\006Parent\022\032\n\014display_name\030\001 \001(\tB\004\342A\001\002\022Z"
          + "\n\treference\030\002 \001(\0132A.google.cloud.aiplatf"
          + "orm.v1beta1.PublisherModel.ResourceRefer"
          + "enceB\004\342A\001\001\032;\n\rDocumentation\022\023\n\005title\030\001 \001"
          + "(\tB\004\342A\001\002\022\025\n\007content\030\002 \001(\tB\004\342A\001\002\032\361\020\n\014Call"
          + "ToAction\022e\n\rview_rest_api\030\001 \001(\0132H.google"
          + ".cloud.aiplatform.v1beta1.PublisherModel"
          + ".CallToAction.ViewRestApiB\004\342A\001\001\022t\n\ropen_"
          + "notebook\030\002 \001(\0132W.google.cloud.aiplatform"
          + ".v1beta1.PublisherModel.CallToAction.Reg"
          + "ionalResourceReferencesB\004\342A\001\001\022y\n\022create_"
          + "application\030\003 \001(\0132W.google.cloud.aiplatf"
          + "orm.v1beta1.PublisherModel.CallToAction."
          + "RegionalResourceReferencesB\004\342A\001\001\022\200\001\n\031ope"
          + "n_fine_tuning_pipeline\030\004 \001(\0132W.google.cl"
          + "oud.aiplatform.v1beta1.PublisherModel.Ca"
          + "llToAction.RegionalResourceReferencesB\004\342"
          + "A\001\001\022\202\001\n\033open_prompt_tuning_pipeline\030\005 \001("
          + "\0132W.google.cloud.aiplatform.v1beta1.Publ"
          + "isherModel.CallToAction.RegionalResource"
          + "ReferencesB\004\342A\001\001\022q\n\nopen_genie\030\006 \001(\0132W.g"
          + "oogle.cloud.aiplatform.v1beta1.Publisher"
          + "Model.CallToAction.RegionalResourceRefer"
          + "encesB\004\342A\001\001\022Y\n\006deploy\030\007 \001(\0132C.google.clo"
          + "ud.aiplatform.v1beta1.PublisherModel.Cal"
          + "lToAction.DeployB\004\342A\001\001\022\200\001\n\031open_generati"
          + "on_ai_studio\030\010 \001(\0132W.google.cloud.aiplat"
          + "form.v1beta1.PublisherModel.CallToAction"
          + ".RegionalResourceReferencesB\004\342A\001\001\022u\n\016req"
          + "uest_access\030\t \001(\0132W.google.cloud.aiplatf"
          + "orm.v1beta1.PublisherModel.CallToAction."
          + "RegionalResourceReferencesB\004\342A\001\001\022\177\n\030open"
          + "_evaluation_pipeline\030\013 \001(\0132W.google.clou"
          + "d.aiplatform.v1beta1.PublisherModel.Call"
          + "ToAction.RegionalResourceReferencesB\004\342A\001"
          + "\001\032\253\002\n\032RegionalResourceReferences\022\201\001\n\nref"
          + "erences\030\001 \003(\0132g.google.cloud.aiplatform."
          + "v1beta1.PublisherModel.CallToAction.Regi"
          + "onalResourceReferences.ReferencesEntryB\004"
          + "\342A\001\002\022\023\n\005title\030\002 \001(\tB\004\342A\001\002\032t\n\017ReferencesE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022P\n\005value\030\002 \001(\0132A.googl"
          + "e.cloud.aiplatform.v1beta1.PublisherMode"
          + "l.ResourceReference:\0028\001\032\177\n\013ViewRestApi\022["
          + "\n\016documentations\030\001 \003(\0132=.google.cloud.ai"
          + "platform.v1beta1.PublisherModel.Document"
          + "ationB\004\342A\001\002\022\023\n\005title\030\002 \001(\tB\004\342A\001\002\032\210\004\n\006Dep"
          + "loy\022R\n\023dedicated_resources\030\005 \001(\01323.googl"
          + "e.cloud.aiplatform.v1beta1.DedicatedReso"
          + "urcesH\000\022R\n\023automatic_resources\030\006 \001(\01323.g"
          + "oogle.cloud.aiplatform.v1beta1.Automatic"
          + "ResourcesH\000\022\032\n\020shared_resources\030\007 \001(\tH\000\022"
          + " \n\022model_display_name\030\001 \001(\tB\004\342A\001\001\022Y\n\025lar"
          + "ge_model_reference\030\002 \001(\01324.google.cloud."
          + "aiplatform.v1beta1.LargeModelReferenceB\004"
          + "\342A\001\001\022Q\n\016container_spec\030\003 \001(\01323.google.cl"
          + "oud.aiplatform.v1beta1.ModelContainerSpe"
          + "cB\004\342A\001\001\022\032\n\014artifact_uri\030\004 \001(\tB\004\342A\001\001\022\023\n\005t"
          + "itle\030\010 \001(\tB\004\342A\001\002\022!\n\023public_artifact_uri\030"
          + "\t \001(\tB\004\342A\001\001B\026\n\024prediction_resources\"\333\001\n\022"
          + "OpenSourceCategory\022$\n OPEN_SOURCE_CATEGO"
          + "RY_UNSPECIFIED\020\000\022\017\n\013PROPRIETARY\020\001\022+\n\'GOO"
          + "GLE_OWNED_OSS_WITH_GOOGLE_CHECKPOINT\020\002\0220"
          + "\n,THIRD_PARTY_OWNED_OSS_WITH_GOOGLE_CHEC"
          + "KPOINT\020\003\022\024\n\020GOOGLE_OWNED_OSS\020\004\022\031\n\025THIRD_"
          + "PARTY_OWNED_OSS\020\005\"n\n\013LaunchStage\022\034\n\030LAUN"
          + "CH_STAGE_UNSPECIFIED\020\000\022\020\n\014EXPERIMENTAL\020\001"
          + "\022\023\n\017PRIVATE_PREVIEW\020\002\022\022\n\016PUBLIC_PREVIEW\020"
          + "\003\022\006\n\002GA\020\004\"c\n\014VersionState\022\035\n\031VERSION_STA"
          + "TE_UNSPECIFIED\020\000\022\030\n\024VERSION_STATE_STABLE"
          + "\020\001\022\032\n\026VERSION_STATE_UNSTABLE\020\002:T\352AQ\n(aip"
          + "latform.googleapis.com/PublisherModel\022%p"
          + "ublishers/{publisher}/models/{model}B\352\001\n"
          + "#com.google.cloud.aiplatform.v1beta1B\023Pu"
          + "blisherModelProtoP\001ZCcloud.google.com/go"
          + "/aiplatform/apiv1beta1/aiplatformpb;aipl"
          + "atformpb\252\002\037Google.Cloud.AIPlatform.V1Bet"
          + "a1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"G"
          + "oogle::Cloud::AIPlatform::V1beta1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor,
            new java.lang.String[] {
              "Name",
              "VersionId",
              "OpenSourceCategory",
              "Parent",
              "SupportedActions",
              "Frameworks",
              "LaunchStage",
              "VersionState",
              "PublisherModelTemplate",
              "PredictSchemata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_descriptor,
            new java.lang.String[] {
              "Uri", "ResourceName", "UseCase", "Description", "Reference",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_descriptor,
            new java.lang.String[] {
              "DisplayName", "Reference",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_descriptor,
            new java.lang.String[] {
              "Title", "Content",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor,
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
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor,
            new java.lang.String[] {
              "References", "Title",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_descriptor,
            new java.lang.String[] {
              "Documentations", "Title",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_descriptor,
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
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
