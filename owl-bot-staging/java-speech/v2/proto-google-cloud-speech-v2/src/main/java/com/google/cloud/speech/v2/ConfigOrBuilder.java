// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the config resource. There is exactly one config
   * resource per project per location. The expected format is
   * `projects/{project}/locations/{location}/config`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the config resource. There is exactly one config
   * resource per project per location. The expected format is
   * `projects/{project}/locations/{location}/config`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. An optional [KMS key
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) that if
   * present, will be used to encrypt Speech-to-Text resources at-rest. Updating
   * this key will not encrypt existing resources using this key; only new
   * resources will be encrypted using this key. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   * <pre>
   * Optional. An optional [KMS key
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) that if
   * present, will be used to encrypt Speech-to-Text resources at-rest. Updating
   * this key will not encrypt existing resources using this key; only new
   * resources will be encrypted using this key. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString
      getKmsKeyNameBytes();

  /**
   * <pre>
   * Output only. The most recent time this resource was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time this resource was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time this resource was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
