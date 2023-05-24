// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1p1beta1;

public interface UpdateOrganizationSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.UpdateOrganizationSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The organization settings resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the organizationSettings field is set.
   */
  boolean hasOrganizationSettings();
  /**
   * <pre>
   * Required. The organization settings resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The organizationSettings.
   */
  com.google.cloud.securitycenter.v1p1beta1.OrganizationSettings getOrganizationSettings();
  /**
   * <pre>
   * Required. The organization settings resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.OrganizationSettings organization_settings = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securitycenter.v1p1beta1.OrganizationSettingsOrBuilder getOrganizationSettingsOrBuilder();

  /**
   * <pre>
   * The FieldMask to use when updating the settings resource.
   *
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The FieldMask to use when updating the settings resource.
   *
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The FieldMask to use when updating the settings resource.
   *
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
