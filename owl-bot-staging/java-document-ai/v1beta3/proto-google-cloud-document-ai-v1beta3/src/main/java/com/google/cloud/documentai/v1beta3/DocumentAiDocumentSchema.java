// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_schema.proto

package com.google.cloud.documentai.v1beta3;

public final class DocumentAiDocumentSchema {
  private DocumentAiDocumentSchema() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_SummaryOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_SummaryOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_PropertyMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_PropertyMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_EntityTypeMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_EntityTypeMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_EnumValues_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_EnumValues_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_Property_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_Property_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/documentai/v1beta3/docume" +
      "nt_schema.proto\022\037google.cloud.documentai" +
      ".v1beta3\"\254\002\n\016SummaryOptions\022F\n\006length\030\001 " +
      "\001(\01626.google.cloud.documentai.v1beta3.Su" +
      "mmaryOptions.Length\022F\n\006format\030\002 \001(\01626.go" +
      "ogle.cloud.documentai.v1beta3.SummaryOpt" +
      "ions.Format\"L\n\006Length\022\026\n\022LENGTH_UNSPECIF" +
      "IED\020\000\022\t\n\005BRIEF\020\001\022\014\n\010MODERATE\020\002\022\021\n\rCOMPRE" +
      "HENSIVE\020\003\"<\n\006Format\022\026\n\022FORMAT_UNSPECIFIE" +
      "D\020\000\022\r\n\tPARAGRAPH\020\001\022\013\n\007BULLETS\020\002\"c\n\027Field" +
      "ExtractionMetadata\022H\n\017summary_options\030\002 " +
      "\001(\0132/.google.cloud.documentai.v1beta3.Su" +
      "mmaryOptions\"\201\001\n\020PropertyMetadata\022\020\n\010ina" +
      "ctive\030\003 \001(\010\022[\n\031field_extraction_metadata" +
      "\030\t \001(\01328.google.cloud.documentai.v1beta3" +
      ".FieldExtractionMetadata\"&\n\022EntityTypeMe" +
      "tadata\022\020\n\010inactive\030\005 \001(\010\"\341\010\n\016DocumentSch" +
      "ema\022\024\n\014display_name\030\001 \001(\t\022\023\n\013description" +
      "\030\002 \001(\t\022P\n\014entity_types\030\003 \003(\0132:.google.cl" +
      "oud.documentai.v1beta3.DocumentSchema.En" +
      "tityType\022J\n\010metadata\030\004 \001(\01328.google.clou" +
      "d.documentai.v1beta3.DocumentSchema.Meta" +
      "data\032\356\005\n\nEntityType\022\\\n\013enum_values\030\016 \001(\013" +
      "2E.google.cloud.documentai.v1beta3.Docum" +
      "entSchema.EntityType.EnumValuesH\000\022\024\n\014dis" +
      "play_name\030\r \001(\t\022\014\n\004name\030\001 \001(\t\022\022\n\nbase_ty" +
      "pes\030\002 \003(\t\022W\n\nproperties\030\006 \003(\0132C.google.c" +
      "loud.documentai.v1beta3.DocumentSchema.E" +
      "ntityType.Property\022Q\n\024entity_type_metada" +
      "ta\030\013 \001(\01323.google.cloud.documentai.v1bet" +
      "a3.EntityTypeMetadata\032\034\n\nEnumValues\022\016\n\006v" +
      "alues\030\001 \003(\t\032\357\002\n\010Property\022\014\n\004name\030\001 \001(\t\022\022" +
      "\n\nvalue_type\030\002 \001(\t\022k\n\017occurrence_type\030\003 " +
      "\001(\0162R.google.cloud.documentai.v1beta3.Do" +
      "cumentSchema.EntityType.Property.Occurre" +
      "nceType\022L\n\021property_metadata\030\005 \001(\01321.goo" +
      "gle.cloud.documentai.v1beta3.PropertyMet" +
      "adata\"\205\001\n\016OccurrenceType\022\037\n\033OCCURRENCE_T" +
      "YPE_UNSPECIFIED\020\000\022\021\n\rOPTIONAL_ONCE\020\001\022\025\n\021" +
      "OPTIONAL_MULTIPLE\020\002\022\021\n\rREQUIRED_ONCE\020\003\022\025" +
      "\n\021REQUIRED_MULTIPLE\020\004B\016\n\014value_source\032\224\001" +
      "\n\010Metadata\022\031\n\021document_splitter\030\001 \001(\010\022&\n" +
      "\036document_allow_multiple_labels\030\002 \001(\010\022%\n" +
      "\035prefixed_naming_on_properties\030\006 \001(\010\022\036\n\026" +
      "skip_naming_validation\030\007 \001(\010B\357\001\n#com.goo" +
      "gle.cloud.documentai.v1beta3B\030DocumentAi" +
      "DocumentSchemaP\001ZCcloud.google.com/go/do" +
      "cumentai/apiv1beta3/documentaipb;documen" +
      "taipb\252\002\037Google.Cloud.DocumentAI.V1Beta3\312" +
      "\002\037Google\\Cloud\\DocumentAI\\V1beta3\352\002\"Goog" +
      "le::Cloud::DocumentAI::V1beta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_documentai_v1beta3_SummaryOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_SummaryOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_SummaryOptions_descriptor,
        new java.lang.String[] { "Length", "Format", });
    internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_FieldExtractionMetadata_descriptor,
        new java.lang.String[] { "SummaryOptions", });
    internal_static_google_cloud_documentai_v1beta3_PropertyMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta3_PropertyMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_PropertyMetadata_descriptor,
        new java.lang.String[] { "Inactive", "FieldExtractionMetadata", });
    internal_static_google_cloud_documentai_v1beta3_EntityTypeMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1beta3_EntityTypeMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_EntityTypeMetadata_descriptor,
        new java.lang.String[] { "Inactive", });
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentSchema_descriptor,
        new java.lang.String[] { "DisplayName", "Description", "EntityTypes", "Metadata", });
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_descriptor =
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_descriptor,
        new java.lang.String[] { "EnumValues", "DisplayName", "Name", "BaseTypes", "Properties", "EntityTypeMetadata", "ValueSource", });
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_EnumValues_descriptor =
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_EnumValues_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_EnumValues_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_Property_descriptor =
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_Property_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentSchema_EntityType_Property_descriptor,
        new java.lang.String[] { "Name", "ValueType", "OccurrenceType", "PropertyMetadata", });
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_Metadata_descriptor =
      internal_static_google_cloud_documentai_v1beta3_DocumentSchema_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_DocumentSchema_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_documentai_v1beta3_DocumentSchema_Metadata_descriptor,
        new java.lang.String[] { "DocumentSplitter", "DocumentAllowMultipleLabels", "PrefixedNamingOnProperties", "SkipNamingValidation", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
