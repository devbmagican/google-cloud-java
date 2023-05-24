// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface UpdateSecurityHealthAnalyticsCustomModuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The SecurityHealthAnalytics custom module to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the securityHealthAnalyticsCustomModule field is set.
   */
  boolean hasSecurityHealthAnalyticsCustomModule();
  /**
   * <pre>
   * Required. The SecurityHealthAnalytics custom module to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityHealthAnalyticsCustomModule.
   */
  com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule getSecurityHealthAnalyticsCustomModule();
  /**
   * <pre>
   * Required. The SecurityHealthAnalytics custom module to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule security_health_analytics_custom_module = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModuleOrBuilder getSecurityHealthAnalyticsCustomModuleOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
