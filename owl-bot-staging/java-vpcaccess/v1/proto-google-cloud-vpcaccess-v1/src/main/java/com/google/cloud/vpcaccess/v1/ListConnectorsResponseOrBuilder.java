// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vpcaccess/v1/vpc_access.proto

package com.google.cloud.vpcaccess.v1;

public interface ListConnectorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vpcaccess.v1.ListConnectorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  java.util.List<com.google.cloud.vpcaccess.v1.Connector> 
      getConnectorsList();
  /**
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  com.google.cloud.vpcaccess.v1.Connector getConnectors(int index);
  /**
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  int getConnectorsCount();
  /**
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vpcaccess.v1.ConnectorOrBuilder> 
      getConnectorsOrBuilderList();
  /**
   * <pre>
   * List of Serverless VPC Access connectors.
   * </pre>
   *
   * <code>repeated .google.cloud.vpcaccess.v1.Connector connectors = 1;</code>
   */
  com.google.cloud.vpcaccess.v1.ConnectorOrBuilder getConnectorsOrBuilder(
      int index);

  /**
   * <pre>
   * Continuation token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Continuation token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
