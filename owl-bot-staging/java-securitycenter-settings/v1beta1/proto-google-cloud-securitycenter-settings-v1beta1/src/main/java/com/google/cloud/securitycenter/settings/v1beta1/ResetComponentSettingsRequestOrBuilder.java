// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public interface ResetComponentSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.ResetComponentSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The component settings to reset.
   *
   * Formats:
   *  * `organizations/{organization}/components/{component}/settings`
   *  * `folders/{folder}/components/{component}/settings`
   *  * `projects/{project}/components/{component}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/components/{component}/settings`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The component settings to reset.
   *
   * Formats:
   *  * `organizations/{organization}/components/{component}/settings`
   *  * `folders/{folder}/components/{component}/settings`
   *  * `projects/{project}/components/{component}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/components/{component}/settings`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * An fingerprint used for optimistic concurrency. If none is provided,
   * then the existing settings will be blindly overwritten.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * An fingerprint used for optimistic concurrency. If none is provided,
   * then the existing settings will be blindly overwritten.
   * </pre>
   *
   * <code>string etag = 2;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}
