// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/replication.proto

package com.google.cloud.netapp.v1;

public interface DeleteReplicationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.DeleteReplicationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The replication resource name, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;volumes/&#42;&#47;replications/{replication_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The replication resource name, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;volumes/&#42;&#47;replications/{replication_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
