// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface SetLocationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetLocationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getClusterId();
  /**
   *
   *
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getClusterIdBytes();

  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [locations](/compute/docs/zones#available) in which the cluster's nodes
   * should be located. Changing the locations a cluster is in will result
   * in nodes being either created or removed from the cluster, depending on
   * whether locations are being added or removed.
   * This list must always include the cluster's primary zone.
   * </pre>
   *
   * <code>repeated string locations = 4;</code>
   */
  java.util.List<java.lang.String> getLocationsList();
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [locations](/compute/docs/zones#available) in which the cluster's nodes
   * should be located. Changing the locations a cluster is in will result
   * in nodes being either created or removed from the cluster, depending on
   * whether locations are being added or removed.
   * This list must always include the cluster's primary zone.
   * </pre>
   *
   * <code>repeated string locations = 4;</code>
   */
  int getLocationsCount();
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [locations](/compute/docs/zones#available) in which the cluster's nodes
   * should be located. Changing the locations a cluster is in will result
   * in nodes being either created or removed from the cluster, depending on
   * whether locations are being added or removed.
   * This list must always include the cluster's primary zone.
   * </pre>
   *
   * <code>repeated string locations = 4;</code>
   */
  java.lang.String getLocations(int index);
  /**
   *
   *
   * <pre>
   * The desired list of Google Compute Engine
   * [locations](/compute/docs/zones#available) in which the cluster's nodes
   * should be located. Changing the locations a cluster is in will result
   * in nodes being either created or removed from the cluster, depending on
   * whether locations are being added or removed.
   * This list must always include the cluster's primary zone.
   * </pre>
   *
   * <code>repeated string locations = 4;</code>
   */
  com.google.protobuf.ByteString getLocationsBytes(int index);

  /**
   *
   *
   * <pre>
   * The name (project, location, cluster) of the cluster to set locations.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name (project, location, cluster) of the cluster to set locations.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
