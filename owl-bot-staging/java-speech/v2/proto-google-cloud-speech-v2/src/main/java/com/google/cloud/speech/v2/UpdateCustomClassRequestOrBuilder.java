// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface UpdateCustomClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.UpdateCustomClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The CustomClass to update.
   *
   * The CustomClass's `name` field is used to identify the CustomClass to
   * update. Format:
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customClass field is set.
   */
  boolean hasCustomClass();
  /**
   * <pre>
   * Required. The CustomClass to update.
   *
   * The CustomClass's `name` field is used to identify the CustomClass to
   * update. Format:
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customClass.
   */
  com.google.cloud.speech.v2.CustomClass getCustomClass();
  /**
   * <pre>
   * Required. The CustomClass to update.
   *
   * The CustomClass's `name` field is used to identify the CustomClass to
   * update. Format:
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.speech.v2.CustomClassOrBuilder getCustomClassOrBuilder();

  /**
   * <pre>
   * The list of fields to be updated. If empty, all fields are considered for
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated. If empty, all fields are considered for
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated. If empty, all fields are considered for
   * update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * If set, validate the request and preview the updated CustomClass, but do
   * not actually update it.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
