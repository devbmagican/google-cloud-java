// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface CreateCustomClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.CreateCustomClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The CustomClass to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customClass field is set.
   */
  boolean hasCustomClass();
  /**
   * <pre>
   * Required. The CustomClass to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customClass.
   */
  com.google.cloud.speech.v2.CustomClass getCustomClass();
  /**
   * <pre>
   * Required. The CustomClass to create.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.CustomClass custom_class = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.speech.v2.CustomClassOrBuilder getCustomClassOrBuilder();

  /**
   * <pre>
   * If set, validate the request and preview the CustomClass, but do not
   * actually create it.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * The ID to use for the CustomClass, which will become the final component of
   * the CustomClass's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string custom_class_id = 3;</code>
   * @return The customClassId.
   */
  java.lang.String getCustomClassId();
  /**
   * <pre>
   * The ID to use for the CustomClass, which will become the final component of
   * the CustomClass's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string custom_class_id = 3;</code>
   * @return The bytes for customClassId.
   */
  com.google.protobuf.ByteString
      getCustomClassIdBytes();

  /**
   * <pre>
   * Required. The project and location where this CustomClass will be created.
   * The expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location where this CustomClass will be created.
   * The expected format is `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
