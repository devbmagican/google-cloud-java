// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/operation.proto

package com.google.api.servicecontrol.v1;

public final class OperationProto {
  private OperationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/api/servicecontrol/v1/operation" +
      ".proto\022\034google.api.servicecontrol.v1\032,go" +
      "ogle/api/servicecontrol/v1/log_entry.pro" +
      "to\032/google/api/servicecontrol/v1/metric_" +
      "value.proto\032\031google/protobuf/any.proto\032\037" +
      "google/protobuf/timestamp.proto\"\271\004\n\tOper" +
      "ation\022\024\n\014operation_id\030\001 \001(\t\022\026\n\016operation" +
      "_name\030\002 \001(\t\022\023\n\013consumer_id\030\003 \001(\t\022.\n\nstar" +
      "t_time\030\004 \001(\0132\032.google.protobuf.Timestamp" +
      "\022,\n\010end_time\030\005 \001(\0132\032.google.protobuf.Tim" +
      "estamp\022C\n\006labels\030\006 \003(\01323.google.api.serv" +
      "icecontrol.v1.Operation.LabelsEntry\022G\n\021m" +
      "etric_value_sets\030\007 \003(\0132,.google.api.serv" +
      "icecontrol.v1.MetricValueSet\022;\n\013log_entr" +
      "ies\030\010 \003(\0132&.google.api.servicecontrol.v1" +
      ".LogEntry\022F\n\nimportance\030\013 \001(\01622.google.a" +
      "pi.servicecontrol.v1.Operation.Importanc" +
      "e\022(\n\nextensions\030\020 \003(\0132\024.google.protobuf." +
      "Any\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t:\0028\001\"\037\n\nImportance\022\007\n\003LOW\020\000\022\010\n\004HIG" +
      "H\020\001B\351\001\n com.google.api.servicecontrol.v1" +
      "B\016OperationProtoP\001ZJcloud.google.com/go/" +
      "servicecontrol/apiv1/servicecontrolpb;se" +
      "rvicecontrolpb\370\001\001\252\002\036Google.Cloud.Service" +
      "Control.V1\312\002\036Google\\Cloud\\ServiceControl" +
      "\\V1\352\002!Google::Cloud::ServiceControl::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.servicecontrol.v1.LogEntryProto.getDescriptor(),
          com.google.api.servicecontrol.v1.MetricValueSetProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_api_servicecontrol_v1_Operation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_Operation_descriptor,
        new java.lang.String[] { "OperationId", "OperationName", "ConsumerId", "StartTime", "EndTime", "Labels", "MetricValueSets", "LogEntries", "Importance", "Extensions", });
    internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_descriptor =
      internal_static_google_api_servicecontrol_v1_Operation_descriptor.getNestedTypes().get(0);
    internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.servicecontrol.v1.LogEntryProto.getDescriptor();
    com.google.api.servicecontrol.v1.MetricValueSetProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
