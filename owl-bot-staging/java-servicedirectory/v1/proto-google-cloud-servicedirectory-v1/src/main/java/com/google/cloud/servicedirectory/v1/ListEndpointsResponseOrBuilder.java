// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1/registration_service.proto

package com.google.cloud.servicedirectory.v1;

public interface ListEndpointsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1.ListEndpointsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of endpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 1;</code>
   */
  java.util.List<com.google.cloud.servicedirectory.v1.Endpoint> 
      getEndpointsList();
  /**
   * <pre>
   * The list of endpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 1;</code>
   */
  com.google.cloud.servicedirectory.v1.Endpoint getEndpoints(int index);
  /**
   * <pre>
   * The list of endpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 1;</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * The list of endpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 1;</code>
   */
  java.util.List<? extends com.google.cloud.servicedirectory.v1.EndpointOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <pre>
   * The list of endpoints.
   * </pre>
   *
   * <code>repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 1;</code>
   */
  com.google.cloud.servicedirectory.v1.EndpointOrBuilder getEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
