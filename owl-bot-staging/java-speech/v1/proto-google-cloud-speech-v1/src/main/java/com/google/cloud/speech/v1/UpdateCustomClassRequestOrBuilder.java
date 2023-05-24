// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1;

public interface UpdateCustomClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.UpdateCustomClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The custom class to update.
   *
   * The custom class's `name` field is used to identify the custom class to be
   * updated. Format:
   *
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customClass field is set.
   */
  boolean hasCustomClass();
  /**
   * <pre>
   * Required. The custom class to update.
   *
   * The custom class's `name` field is used to identify the custom class to be
   * updated. Format:
   *
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customClass.
   */
  com.google.cloud.speech.v1.CustomClass getCustomClass();
  /**
   * <pre>
   * Required. The custom class to update.
   *
   * The custom class's `name` field is used to identify the custom class to be
   * updated. Format:
   *
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`
   *
   * Speech-to-Text supports three locations: `global`, `us` (US North America),
   * and `eu` (Europe). If you are calling the `speech.googleapis.com`
   * endpoint, use the `global` location. To specify a region, use a
   * [regional endpoint](https://cloud.google.com/speech-to-text/docs/endpoints)
   * with matching `us` or `eu` location value.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.speech.v1.CustomClassOrBuilder getCustomClassOrBuilder();

  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
