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
// source: google/analytics/admin/v1alpha/subproperty_event_filter.proto

package com.google.analytics.admin.v1alpha;

public final class SubpropertyEventFilterProto {
  private SubpropertyEventFilterProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/analytics/admin/v1alpha/subprop"
          + "erty_event_filter.proto\022\036google.analytic"
          + "s.admin.v1alpha\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\"\205\004\n\037"
          + "SubpropertyEventFilterCondition\022\025\n\013null_"
          + "filter\030\002 \001(\010H\000\022e\n\rstring_filter\030\003 \001(\0132L."
          + "google.analytics.admin.v1alpha.Subproper"
          + "tyEventFilterCondition.StringFilterH\000\022\030\n"
          + "\nfield_name\030\001 \001(\tB\004\342A\001\002\032\273\002\n\014StringFilter"
          + "\022p\n\nmatch_type\030\001 \001(\0162V.google.analytics."
          + "admin.v1alpha.SubpropertyEventFilterCond"
          + "ition.StringFilter.MatchTypeB\004\342A\001\002\022\023\n\005va"
          + "lue\030\002 \001(\tB\004\342A\001\002\022\034\n\016case_sensitive\030\003 \001(\010B"
          + "\004\342A\001\001\"\205\001\n\tMatchType\022\032\n\026MATCH_TYPE_UNSPEC"
          + "IFIED\020\000\022\t\n\005EXACT\020\001\022\017\n\013BEGINS_WITH\020\002\022\r\n\tE"
          + "NDS_WITH\020\003\022\014\n\010CONTAINS\020\004\022\017\n\013FULL_REGEXP\020"
          + "\005\022\022\n\016PARTIAL_REGEXP\020\006B\014\n\none_filter\"\275\002\n "
          + "SubpropertyEventFilterExpression\022X\n\010or_g"
          + "roup\030\001 \001(\0132D.google.analytics.admin.v1al"
          + "pha.SubpropertyEventFilterExpressionList"
          + "H\000\022Z\n\016not_expression\030\002 \001(\0132@.google.anal"
          + "ytics.admin.v1alpha.SubpropertyEventFilt"
          + "erExpressionH\000\022[\n\020filter_condition\030\003 \001(\013"
          + "2?.google.analytics.admin.v1alpha.Subpro"
          + "pertyEventFilterConditionH\000B\006\n\004expr\"\213\001\n$"
          + "SubpropertyEventFilterExpressionList\022c\n\022"
          + "filter_expressions\030\001 \003(\0132@.google.analyt"
          + "ics.admin.v1alpha.SubpropertyEventFilter"
          + "ExpressionB\005\342A\002\002\006\"\304\002\n\034SubpropertyEventFi"
          + "lterClause\022o\n\022filter_clause_type\030\001 \001(\0162M"
          + ".google.analytics.admin.v1alpha.Subprope"
          + "rtyEventFilterClause.FilterClauseTypeB\004\342"
          + "A\001\002\022a\n\021filter_expression\030\002 \001(\0132@.google."
          + "analytics.admin.v1alpha.SubpropertyEvent"
          + "FilterExpressionB\004\342A\001\002\"P\n\020FilterClauseTy"
          + "pe\022\"\n\036FILTER_CLAUSE_TYPE_UNSPECIFIED\020\000\022\013"
          + "\n\007INCLUDE\020\001\022\013\n\007EXCLUDE\020\002\"\376\002\n\026Subproperty"
          + "EventFilter\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022$\n\021apply"
          + "_to_property\030\002 \001(\tB\004\342A\001\005H\000\210\001\001\022[\n\016filter_"
          + "clauses\030\003 \003(\0132<.google.analytics.admin.v"
          + "1alpha.SubpropertyEventFilterClauseB\005\342A\002"
          + "\002\006:\266\001\352A\262\001\n4analyticsadmin.googleapis.com"
          + "/SubpropertyEventFilter\022Iproperties/{pro"
          + "perty}/subpropertyEventFilters/{sub_prop"
          + "erty_event_filter}*\027subpropertyEventFilt"
          + "ers2\026subpropertyEventFilterB\024\n\022_apply_to"
          + "_propertyB\203\001\n\"com.google.analytics.admin"
          + ".v1alphaB\033SubpropertyEventFilterProtoP\001Z"
          + ">cloud.google.com/go/analytics/admin/api"
          + "v1alpha/adminpb;adminpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor,
            new java.lang.String[] {
              "NullFilter", "StringFilter", "FieldName", "OneFilter",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterCondition_StringFilter_descriptor,
            new java.lang.String[] {
              "MatchType", "Value", "CaseSensitive",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpression_descriptor,
            new java.lang.String[] {
              "OrGroup", "NotExpression", "FilterCondition", "Expr",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterExpressionList_descriptor,
            new java.lang.String[] {
              "FilterExpressions",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilterClause_descriptor,
            new java.lang.String[] {
              "FilterClauseType", "FilterExpression",
            });
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_SubpropertyEventFilter_descriptor,
            new java.lang.String[] {
              "Name", "ApplyToProperty", "FilterClauses", "ApplyToProperty",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
