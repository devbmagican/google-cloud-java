// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/security_health_analytics_custom_module.proto

package com.google.cloud.securitycenter.v1;

public final class SecurityHealthAnalyticsCustomModuleProto {
  private SecurityHealthAnalyticsCustomModuleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_SecurityHealthAnalyticsCustomModule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_SecurityHealthAnalyticsCustomModule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/securitycenter/v1/securit" +
      "y_health_analytics_custom_module.proto\022\036" +
      "google.cloud.securitycenter.v1\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\032Lgoogle/cloud/securitycenter/" +
      "v1/security_health_analytics_custom_conf" +
      "ig.proto\032\037google/protobuf/timestamp.prot" +
      "o\"\341\006\n#SecurityHealthAnalyticsCustomModul" +
      "e\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\024\n\014display_name\030\002 " +
      "\001(\t\022m\n\020enablement_state\030\004 \001(\0162S.google.c" +
      "loud.securitycenter.v1.SecurityHealthAna" +
      "lyticsCustomModule.EnablementState\0225\n\013up" +
      "date_time\030\005 \001(\0132\032.google.protobuf.Timest" +
      "ampB\004\342A\001\003\022\031\n\013last_editor\030\006 \001(\tB\004\342A\001\003\022c\n\017" +
      "ancestor_module\030\007 \001(\tBJ\342A\001\003\372AC\nAsecurity" +
      "center.googleapis.com/SecurityHealthAnal" +
      "yticsCustomModule\022C\n\rcustom_config\030\010 \001(\013" +
      "2,.google.cloud.securitycenter.v1.Custom" +
      "Config\"]\n\017EnablementState\022 \n\034ENABLEMENT_" +
      "STATE_UNSPECIFIED\020\000\022\013\n\007ENABLED\020\001\022\014\n\010DISA" +
      "BLED\020\002\022\r\n\tINHERITED\020\003:\305\002\352A\301\002\nAsecurityce" +
      "nter.googleapis.com/SecurityHealthAnalyt" +
      "icsCustomModule\022Zorganizations/{organiza" +
      "tion}/securityHealthAnalyticsSettings/cu" +
      "stomModules/{custom_module}\022Nfolders/{fo" +
      "lder}/securityHealthAnalyticsSettings/cu" +
      "stomModules/{custom_module}\022Pprojects/{p" +
      "roject}/securityHealthAnalyticsSettings/" +
      "customModules/{custom_module}B\351\003\n\"com.go" +
      "ogle.cloud.securitycenter.v1B(SecurityHe" +
      "althAnalyticsCustomModuleProtoP\001ZJcloud." +
      "google.com/go/securitycenter/apiv1/secur" +
      "itycenterpb;securitycenterpb\252\002\036Google.Cl" +
      "oud.SecurityCenter.V1\312\002\036Google\\Cloud\\Sec" +
      "urityCenter\\V1\352\002!Google::Cloud::Security" +
      "Center::V1\352A\343\001\n=securitycenter.googleapi" +
      "s.com/SecurityHealthAnalyticsSettings\022<o" +
      "rganizations/{organization}/securityHeal" +
      "thAnalyticsSettings\0220folders/{folder}/se" +
      "curityHealthAnalyticsSettings\0222projects/" +
      "{project}/securityHealthAnalyticsSetting" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomConfigProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_v1_SecurityHealthAnalyticsCustomModule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_SecurityHealthAnalyticsCustomModule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_SecurityHealthAnalyticsCustomModule_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "EnablementState", "UpdateTime", "LastEditor", "AncestorModule", "CustomConfig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomConfigProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
