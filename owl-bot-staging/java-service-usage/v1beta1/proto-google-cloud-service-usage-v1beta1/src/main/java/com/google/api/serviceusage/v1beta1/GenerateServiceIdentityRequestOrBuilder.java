// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

public interface GenerateServiceIdentityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.GenerateServiceIdentityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the consumer and service to generate an identity for.
   *
   * The `GenerateServiceIdentity` methods currently only support projects.
   *
   * An example name would be:
   * `projects/123/services/example.googleapis.com` where `123` is the
   * project number.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Name of the consumer and service to generate an identity for.
   *
   * The `GenerateServiceIdentity` methods currently only support projects.
   *
   * An example name would be:
   * `projects/123/services/example.googleapis.com` where `123` is the
   * project number.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}
