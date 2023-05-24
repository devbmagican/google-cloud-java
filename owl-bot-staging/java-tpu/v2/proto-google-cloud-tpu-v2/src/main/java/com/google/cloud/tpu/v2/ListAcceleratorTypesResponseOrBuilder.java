// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

public interface ListAcceleratorTypesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.ListAcceleratorTypesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AcceleratorType accelerator_types = 1;</code>
   */
  java.util.List<com.google.cloud.tpu.v2.AcceleratorType> 
      getAcceleratorTypesList();
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AcceleratorType accelerator_types = 1;</code>
   */
  com.google.cloud.tpu.v2.AcceleratorType getAcceleratorTypes(int index);
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AcceleratorType accelerator_types = 1;</code>
   */
  int getAcceleratorTypesCount();
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AcceleratorType accelerator_types = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2.AcceleratorTypeOrBuilder> 
      getAcceleratorTypesOrBuilderList();
  /**
   * <pre>
   * The listed nodes.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.AcceleratorType accelerator_types = 1;</code>
   */
  com.google.cloud.tpu.v2.AcceleratorTypeOrBuilder getAcceleratorTypesOrBuilder(
      int index);

  /**
   * <pre>
   * The next page token or empty if none.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The next page token or empty if none.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
