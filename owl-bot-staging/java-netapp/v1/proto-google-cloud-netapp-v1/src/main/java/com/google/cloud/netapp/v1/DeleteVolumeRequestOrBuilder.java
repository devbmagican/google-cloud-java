// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/volume.proto

package com.google.cloud.netapp.v1;

public interface DeleteVolumeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.DeleteVolumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the volume
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the volume
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If this field is set as true, CCFE will not block the volume resource
   * deletion even if it has any snapshots resource. (Otherwise, the request
   * will only work if the volume has no snapshots.)
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
