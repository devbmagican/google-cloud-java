// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/operation_metadata.proto

package com.google.cloud.documentai.v1beta3;

public final class OperationMetadataProto {
  private OperationMetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_CommonOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_CommonOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/documentai/v1beta3/operat" +
      "ion_metadata.proto\022\037google.cloud.documen" +
      "tai.v1beta3\032\037google/protobuf/timestamp.p" +
      "roto\"\332\002\n\027CommonOperationMetadata\022M\n\005stat" +
      "e\030\001 \001(\0162>.google.cloud.documentai.v1beta" +
      "3.CommonOperationMetadata.State\022\025\n\rstate" +
      "_message\030\002 \001(\t\022\020\n\010resource\030\005 \001(\t\022/\n\013crea" +
      "te_time\030\003 \001(\0132\032.google.protobuf.Timestam" +
      "p\022/\n\013update_time\030\004 \001(\0132\032.google.protobuf" +
      ".Timestamp\"e\n\005State\022\025\n\021STATE_UNSPECIFIED" +
      "\020\000\022\013\n\007RUNNING\020\001\022\016\n\nCANCELLING\020\002\022\r\n\tSUCCE" +
      "EDED\020\003\022\n\n\006FAILED\020\004\022\r\n\tCANCELLED\020\005B\355\001\n#co" +
      "m.google.cloud.documentai.v1beta3B\026Opera" +
      "tionMetadataProtoP\001ZCcloud.google.com/go" +
      "/documentai/apiv1beta3/documentaipb;docu" +
      "mentaipb\252\002\037Google.Cloud.DocumentAI.V1Bet" +
      "a3\312\002\037Google\\Cloud\\DocumentAI\\V1beta3\352\002\"G" +
      "oogle::Cloud::DocumentAI::V1beta3b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_documentai_v1beta3_CommonOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_CommonOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_CommonOperationMetadata_descriptor,
        new java.lang.String[] { "State", "StateMessage", "Resource", "CreateTime", "UpdateTime", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
