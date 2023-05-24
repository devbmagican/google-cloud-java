/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface VpnGatewayStatusVpnConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VpnGatewayStatusVpnConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL reference to the peer external VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
   * </pre>
   *
   * <code>optional string peer_external_gateway = 384956173;</code>
   *
   * @return Whether the peerExternalGateway field is set.
   */
  boolean hasPeerExternalGateway();
  /**
   *
   *
   * <pre>
   * URL reference to the peer external VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
   * </pre>
   *
   * <code>optional string peer_external_gateway = 384956173;</code>
   *
   * @return The peerExternalGateway.
   */
  java.lang.String getPeerExternalGateway();
  /**
   *
   *
   * <pre>
   * URL reference to the peer external VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
   * </pre>
   *
   * <code>optional string peer_external_gateway = 384956173;</code>
   *
   * @return The bytes for peerExternalGateway.
   */
  com.google.protobuf.ByteString getPeerExternalGatewayBytes();

  /**
   *
   *
   * <pre>
   * URL reference to the peer side VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
   * </pre>
   *
   * <code>optional string peer_gcp_gateway = 281867452;</code>
   *
   * @return Whether the peerGcpGateway field is set.
   */
  boolean hasPeerGcpGateway();
  /**
   *
   *
   * <pre>
   * URL reference to the peer side VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
   * </pre>
   *
   * <code>optional string peer_gcp_gateway = 281867452;</code>
   *
   * @return The peerGcpGateway.
   */
  java.lang.String getPeerGcpGateway();
  /**
   *
   *
   * <pre>
   * URL reference to the peer side VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
   * </pre>
   *
   * <code>optional string peer_gcp_gateway = 281867452;</code>
   *
   * @return The bytes for peerGcpGateway.
   */
  com.google.protobuf.ByteString getPeerGcpGatewayBytes();

  /**
   *
   *
   * <pre>
   * HighAvailabilityRequirementState for the VPN connection.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.VpnGatewayStatusHighAvailabilityRequirementState state = 109757585;
   * </code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * HighAvailabilityRequirementState for the VPN connection.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.VpnGatewayStatusHighAvailabilityRequirementState state = 109757585;
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.compute.v1.VpnGatewayStatusHighAvailabilityRequirementState getState();
  /**
   *
   *
   * <pre>
   * HighAvailabilityRequirementState for the VPN connection.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.VpnGatewayStatusHighAvailabilityRequirementState state = 109757585;
   * </code>
   */
  com.google.cloud.compute.v1.VpnGatewayStatusHighAvailabilityRequirementStateOrBuilder
      getStateOrBuilder();

  /**
   *
   *
   * <pre>
   * List of VPN tunnels that are in this VPN connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusTunnel tunnels = 104561931;</code>
   */
  java.util.List<com.google.cloud.compute.v1.VpnGatewayStatusTunnel> getTunnelsList();
  /**
   *
   *
   * <pre>
   * List of VPN tunnels that are in this VPN connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusTunnel tunnels = 104561931;</code>
   */
  com.google.cloud.compute.v1.VpnGatewayStatusTunnel getTunnels(int index);
  /**
   *
   *
   * <pre>
   * List of VPN tunnels that are in this VPN connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusTunnel tunnels = 104561931;</code>
   */
  int getTunnelsCount();
  /**
   *
   *
   * <pre>
   * List of VPN tunnels that are in this VPN connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusTunnel tunnels = 104561931;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.VpnGatewayStatusTunnelOrBuilder>
      getTunnelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of VPN tunnels that are in this VPN connection.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnGatewayStatusTunnel tunnels = 104561931;</code>
   */
  com.google.cloud.compute.v1.VpnGatewayStatusTunnelOrBuilder getTunnelsOrBuilder(int index);
}
