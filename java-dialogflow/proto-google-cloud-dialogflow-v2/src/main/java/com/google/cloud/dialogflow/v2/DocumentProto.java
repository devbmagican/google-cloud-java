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
// source: google/cloud/dialogflow/v2/document.proto

package com.google.cloud.dialogflow.v2;

public final class DocumentProto {
  private DocumentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dialogflow/v2/document.pr"
          + "oto\022\032google.cloud.dialogflow.v2\032\034google/"
          + "api/annotations.proto\032\027google/api/client"
          + ".proto\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032$google/cloud"
          + "/dialogflow/v2/gcs.proto\032#google/longrun"
          + "ning/operations.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\032\037google/protobuf/timestamp.proto\032\027g"
          + "oogle/rpc/status.proto\"\256\010\n\010Document\022\022\n\004n"
          + "ame\030\001 \001(\tB\004\342A\001\001\022\032\n\014display_name\030\002 \001(\tB\004\342"
          + "A\001\002\022\027\n\tmime_type\030\003 \001(\tB\004\342A\001\002\022Q\n\017knowledg"
          + "e_types\030\004 \003(\01622.google.cloud.dialogflow."
          + "v2.Document.KnowledgeTypeB\004\342A\001\002\022\025\n\013conte"
          + "nt_uri\030\005 \001(\tH\000\022\025\n\013raw_content\030\t \001(\014H\000\022 \n"
          + "\022enable_auto_reload\030\013 \001(\010B\004\342A\001\001\022U\n\024lates"
          + "t_reload_status\030\014 \001(\01321.google.cloud.dia"
          + "logflow.v2.Document.ReloadStatusB\004\342A\001\003\022J"
          + "\n\010metadata\030\007 \003(\01322.google.cloud.dialogfl"
          + "ow.v2.Document.MetadataEntryB\004\342A\001\001\022?\n\005st"
          + "ate\030\r \001(\0162*.google.cloud.dialogflow.v2.D"
          + "ocument.StateB\004\342A\001\003\032\\\n\014ReloadStatus\022(\n\004t"
          + "ime\030\001 \001(\0132\032.google.protobuf.Timestamp\022\"\n"
          + "\006status\030\002 \001(\0132\022.google.rpc.Status\032/\n\rMet"
          + "adataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001\"\201\001\n\rKnowledgeType\022\036\n\032KNOWLEDGE_TYPE_U"
          + "NSPECIFIED\020\000\022\007\n\003FAQ\020\001\022\021\n\rEXTRACTIVE_QA\020\002"
          + "\022\026\n\022ARTICLE_SUGGESTION\020\003\022\034\n\030AGENT_FACING"
          + "_SMART_REPLY\020\004\"c\n\005State\022\025\n\021STATE_UNSPECI"
          + "FIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010UPDA"
          + "TING\020\003\022\r\n\tRELOADING\020\004\022\014\n\010DELETING\020\005:\317\001\352A"
          + "\313\001\n\"dialogflow.googleapis.com/Document\022G"
          + "projects/{project}/knowledgeBases/{knowl"
          + "edge_base}/documents/{document}\022\\project"
          + "s/{project}/locations/{location}/knowled"
          + "geBases/{knowledge_base}/documents/{docu"
          + "ment}B\010\n\006source\"O\n\022GetDocumentRequest\0229\n"
          + "\004name\030\001 \001(\tB+\342A\001\002\372A$\n\"dialogflow.googlea"
          + "pis.com/Document\"\212\001\n\024ListDocumentsReques"
          + "t\022;\n\006parent\030\001 \001(\tB+\342A\001\002\372A$\022\"dialogflow.g"
          + "oogleapis.com/Document\022\021\n\tpage_size\030\002 \001("
          + "\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"i\n"
          + "\025ListDocumentsResponse\0227\n\tdocuments\030\001 \003("
          + "\0132$.google.cloud.dialogflow.v2.Document\022"
          + "\027\n\017next_page_token\030\002 \001(\t\"\222\001\n\025CreateDocum"
          + "entRequest\022;\n\006parent\030\001 \001(\tB+\342A\001\002\372A$\022\"dia"
          + "logflow.googleapis.com/Document\022<\n\010docum"
          + "ent\030\002 \001(\0132$.google.cloud.dialogflow.v2.D"
          + "ocumentB\004\342A\001\002\"\234\002\n\026ImportDocumentsRequest"
          + "\022;\n\006parent\030\001 \001(\tB+\342A\001\002\372A$\022\"dialogflow.go"
          + "ogleapis.com/Document\022B\n\ngcs_source\030\002 \001("
          + "\0132&.google.cloud.dialogflow.v2.GcsSource"
          + "sB\004\342A\001\001H\000\022S\n\021document_template\030\003 \001(\01322.g"
          + "oogle.cloud.dialogflow.v2.ImportDocument"
          + "TemplateB\004\342A\001\002\022\"\n\032import_gcs_custom_meta"
          + "data\030\004 \001(\010B\010\n\006source\"\211\002\n\026ImportDocumentT"
          + "emplate\022\027\n\tmime_type\030\001 \001(\tB\004\342A\001\002\022Q\n\017know"
          + "ledge_types\030\002 \003(\01622.google.cloud.dialogf"
          + "low.v2.Document.KnowledgeTypeB\004\342A\001\002\022R\n\010m"
          + "etadata\030\003 \003(\0132@.google.cloud.dialogflow."
          + "v2.ImportDocumentTemplate.MetadataEntry\032"
          + "/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"?\n\027ImportDocumentsResponse\022$\n\010w"
          + "arnings\030\001 \003(\0132\022.google.rpc.Status\"R\n\025Del"
          + "eteDocumentRequest\0229\n\004name\030\001 \001(\tB+\342A\001\002\372A"
          + "$\n\"dialogflow.googleapis.com/Document\"\214\001"
          + "\n\025UpdateDocumentRequest\022<\n\010document\030\001 \001("
          + "\0132$.google.cloud.dialogflow.v2.DocumentB"
          + "\004\342A\001\002\0225\n\013update_mask\030\002 \001(\0132\032.google.prot"
          + "obuf.FieldMaskB\004\342A\001\001\"\321\001\n\025ReloadDocumentR"
          + "equest\0229\n\004name\030\001 \001(\tB+\342A\001\002\372A$\n\"dialogflo"
          + "w.googleapis.com/Document\022\033\n\013content_uri"
          + "\030\003 \001(\tB\004\342A\001\001H\000\022(\n\032import_gcs_custom_meta"
          + "data\030\004 \001(\010B\004\342A\001\001\022,\n\036smart_messaging_part"
          + "ial_update\030\005 \001(\010B\004\342A\001\001B\010\n\006source\"\355\001\n\025Exp"
          + "ortDocumentRequest\0229\n\004name\030\001 \001(\tB+\342A\001\002\372A"
          + "$\n\"dialogflow.googleapis.com/Document\022E\n"
          + "\017gcs_destination\030\002 \001(\0132*.google.cloud.di"
          + "alogflow.v2.GcsDestinationH\000\022\033\n\023export_f"
          + "ull_content\030\003 \001(\010\022&\n\036smart_messaging_par"
          + "tial_update\030\005 \001(\010B\r\n\013destination\"g\n\027Expo"
          + "rtOperationMetadata\022L\n\030exported_gcs_dest"
          + "ination\030\001 \001(\0132*.google.cloud.dialogflow."
          + "v2.GcsDestination\"\273\002\n\032KnowledgeOperation"
          + "Metadata\022Q\n\005state\030\001 \001(\0162<.google.cloud.d"
          + "ialogflow.v2.KnowledgeOperationMetadata."
          + "StateB\004\342A\001\003\022\026\n\016knowledge_base\030\003 \001(\t\022X\n\031e"
          + "xport_operation_metadata\030\004 \001(\01323.google."
          + "cloud.dialogflow.v2.ExportOperationMetad"
          + "ataH\000\"B\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n"
          + "\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010\n\004DONE\020\003B\024\n\022ope"
          + "ration_metadata2\254\026\n\tDocuments\022\271\002\n\rListDo"
          + "cuments\0220.google.cloud.dialogflow.v2.Lis"
          + "tDocumentsRequest\0321.google.cloud.dialogf"
          + "low.v2.ListDocumentsResponse\"\302\001\332A\006parent"
          + "\202\323\344\223\002\262\001\0222/v2/{parent=projects/*/knowledg"
          + "eBases/*}/documentsZ@\022>/v2/{parent=proje"
          + "cts/*/locations/*/knowledgeBases/*}/docu"
          + "mentsZ:\0228/v2/{parent=projects/*/agent/kn"
          + "owledgeBases/*}/documents\022\246\002\n\013GetDocumen"
          + "t\022..google.cloud.dialogflow.v2.GetDocume"
          + "ntRequest\032$.google.cloud.dialogflow.v2.D"
          + "ocument\"\300\001\332A\004name\202\323\344\223\002\262\001\0222/v2/{name=proj"
          + "ects/*/knowledgeBases/*/documents/*}Z@\022>"
          + "/v2/{name=projects/*/locations/*/knowled"
          + "geBases/*/documents/*}Z:\0228/v2/{name=proj"
          + "ects/*/agent/knowledgeBases/*/documents/"
          + "*}\022\367\002\n\016CreateDocument\0221.google.cloud.dia"
          + "logflow.v2.CreateDocumentRequest\032\035.googl"
          + "e.longrunning.Operation\"\222\002\312A&\n\010Document\022"
          + "\032KnowledgeOperationMetadata\332A\017parent,doc"
          + "ument\202\323\344\223\002\320\001\"2/v2/{parent=projects/*/kno"
          + "wledgeBases/*}/documents:\010documentZJ\">/v"
          + "2/{parent=projects/*/locations/*/knowled"
          + "geBases/*}/documents:\010documentZD\"8/v2/{p"
          + "arent=projects/*/agent/knowledgeBases/*}"
          + "/documents:\010document\022\260\002\n\017ImportDocuments"
          + "\0222.google.cloud.dialogflow.v2.ImportDocu"
          + "mentsRequest\032\035.google.longrunning.Operat"
          + "ion\"\311\001\312A5\n\027ImportDocumentsResponse\022\032Know"
          + "ledgeOperationMetadata\202\323\344\223\002\212\001\"9/v2/{pare"
          + "nt=projects/*/knowledgeBases/*}/document"
          + "s:import:\001*ZJ\"E/v2/{parent=projects/*/lo"
          + "cations/*/knowledgeBases/*}/documents:im"
          + "port:\001*\022\333\002\n\016DeleteDocument\0221.google.clou"
          + "d.dialogflow.v2.DeleteDocumentRequest\032\035."
          + "google.longrunning.Operation\"\366\001\312A3\n\025goog"
          + "le.protobuf.Empty\022\032KnowledgeOperationMet"
          + "adata\332A\004name\202\323\344\223\002\262\001*2/v2/{name=projects/"
          + "*/knowledgeBases/*/documents/*}Z@*>/v2/{"
          + "name=projects/*/locations/*/knowledgeBas"
          + "es/*/documents/*}Z:*8/v2/{name=projects/"
          + "*/agent/knowledgeBases/*/documents/*}\022\227\003"
          + "\n\016UpdateDocument\0221.google.cloud.dialogfl"
          + "ow.v2.UpdateDocumentRequest\032\035.google.lon"
          + "grunning.Operation\"\262\002\312A&\n\010Document\022\032Know"
          + "ledgeOperationMetadata\332A\024document,update"
          + "_mask\202\323\344\223\002\353\0012;/v2/{document.name=project"
          + "s/*/knowledgeBases/*/documents/*}:\010docum"
          + "entZS2G/v2/{document.name=projects/*/loc"
          + "ations/*/knowledgeBases/*/documents/*}:\010"
          + "documentZM2A/v2/{document.name=projects/"
          + "*/agent/knowledgeBases/*/documents/*}:\010d"
          + "ocument\022\370\002\n\016ReloadDocument\0221.google.clou"
          + "d.dialogflow.v2.ReloadDocumentRequest\032\035."
          + "google.longrunning.Operation\"\223\002\312A&\n\010Docu"
          + "ment\022\032KnowledgeOperationMetadata\332A\020name,"
          + "content_uri\202\323\344\223\002\320\001\"9/v2/{name=projects/*"
          + "/knowledgeBases/*/documents/*}:reload:\001*"
          + "ZJ\"E/v2/{name=projects/*/locations/*/kno"
          + "wledgeBases/*/documents/*}:reload:\001*ZD\"?"
          + "/v2/{name=projects/*/agent/knowledgeBase"
          + "s/*/documents/*}:reload:\001*\022\237\002\n\016ExportDoc"
          + "ument\0221.google.cloud.dialogflow.v2.Expor"
          + "tDocumentRequest\032\035.google.longrunning.Op"
          + "eration\"\272\001\312A&\n\010Document\022\032KnowledgeOperat"
          + "ionMetadata\202\323\344\223\002\212\001\"9/v2/{name=projects/*"
          + "/knowledgeBases/*/documents/*}:export:\001*"
          + "ZJ\"E/v2/{name=projects/*/locations/*/kno"
          + "wledgeBases/*/documents/*}:export:\001*\032x\312A"
          + "\031dialogflow.googleapis.com\322AYhttps://www"
          + ".googleapis.com/auth/cloud-platform,http"
          + "s://www.googleapis.com/auth/dialogflowB\226"
          + "\001\n\036com.google.cloud.dialogflow.v2B\rDocum"
          + "entProtoP\001Z>cloud.google.com/go/dialogfl"
          + "ow/apiv2/dialogflowpb;dialogflowpb\370\001\001\242\002\002"
          + "DF\252\002\032Google.Cloud.Dialogflow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.GcsProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_Document_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Document_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MimeType",
              "KnowledgeTypes",
              "ContentUri",
              "RawContent",
              "EnableAutoReload",
              "LatestReloadStatus",
              "Metadata",
              "State",
              "Source",
            });
    internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor =
        internal_static_google_cloud_dialogflow_v2_Document_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Document_ReloadStatus_descriptor,
            new java.lang.String[] {
              "Time", "Status",
            });
    internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2_Document_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Document_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Documents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Document",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "GcsSource", "DocumentTemplate", "ImportGcsCustomMetadata", "Source",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor,
            new java.lang.String[] {
              "MimeType", "KnowledgeTypes", "Metadata",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentTemplate_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Warnings",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Document", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "ContentUri",
              "ImportGcsCustomMetadata",
              "SmartMessagingPartialUpdate",
              "Source",
            });
    internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "GcsDestination",
              "ExportFullContent",
              "SmartMessagingPartialUpdate",
              "Destination",
            });
    internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportOperationMetadata_descriptor,
            new java.lang.String[] {
              "ExportedGcsDestination",
            });
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_KnowledgeOperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "KnowledgeBase", "ExportOperationMetadata", "OperationMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.GcsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
