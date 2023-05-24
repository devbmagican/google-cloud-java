// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/asset.proto

package com.google.cloud.securitycenter.v1beta1;

public final class AssetOuterClass {
  private AssetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/securitycenter/v1beta1/as" +
      "set.proto\022#google.cloud.securitycenter.v" +
      "1beta1\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\0328google/cloud" +
      "/securitycenter/v1beta1/security_marks.p" +
      "roto\032\034google/protobuf/struct.proto\032\037goog" +
      "le/protobuf/timestamp.proto\"\324\005\n\005Asset\022\014\n" +
      "\004name\030\001 \001(\t\022g\n\032security_center_propertie" +
      "s\030\002 \001(\0132C.google.cloud.securitycenter.v1" +
      "beta1.Asset.SecurityCenterProperties\022_\n\023" +
      "resource_properties\030\007 \003(\0132B.google.cloud" +
      ".securitycenter.v1beta1.Asset.ResourcePr" +
      "opertiesEntry\022J\n\016security_marks\030\010 \001(\01322." +
      "google.cloud.securitycenter.v1beta1.Secu" +
      "rityMarks\022/\n\013create_time\030\t \001(\0132\032.google." +
      "protobuf.Timestamp\022/\n\013update_time\030\n \001(\0132" +
      "\032.google.protobuf.Timestamp\032\232\001\n\030Security" +
      "CenterProperties\022\033\n\rresource_name\030\001 \001(\tB" +
      "\004\342A\001\005\022\025\n\rresource_type\030\002 \001(\t\022\027\n\017resource" +
      "_parent\030\003 \001(\t\022\030\n\020resource_project\030\004 \001(\t\022" +
      "\027\n\017resource_owners\030\005 \003(\t\032Q\n\027ResourceProp" +
      "ertiesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132" +
      "\026.google.protobuf.Value:\0028\001:U\352AR\n#securi" +
      "tycenter.googleapis.com/Asset\022+organizat" +
      "ions/{organization}/assets/{asset}B|\n\'co" +
      "m.google.cloud.securitycenter.v1beta1P\001Z" +
      "Ocloud.google.com/go/securitycenter/apiv" +
      "1beta1/securitycenterpb;securitycenterpb" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor,
        new java.lang.String[] { "Name", "SecurityCenterProperties", "ResourceProperties", "SecurityMarks", "CreateTime", "UpdateTime", });
    internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_descriptor =
      internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1beta1_Asset_SecurityCenterProperties_descriptor,
        new java.lang.String[] { "ResourceName", "ResourceType", "ResourceParent", "ResourceProject", "ResourceOwners", });
    internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_descriptor =
      internal_static_google_cloud_securitycenter_v1beta1_Asset_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1beta1_Asset_ResourcePropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v1beta1.SecurityMarksOuterClass.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
