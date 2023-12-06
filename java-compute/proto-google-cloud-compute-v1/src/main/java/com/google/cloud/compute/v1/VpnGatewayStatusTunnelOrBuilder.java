/*
 * Copyright 2023 Google LLC
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

public interface VpnGatewayStatusTunnelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VpnGatewayStatusTunnel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The VPN gateway interface this VPN tunnel is associated with.
   * </pre>
   *
   * <code>optional uint32 local_gateway_interface = 158764330;</code>
   *
   * @return Whether the localGatewayInterface field is set.
   */
  boolean hasLocalGatewayInterface();
  /**
   *
   *
   * <pre>
   * The VPN gateway interface this VPN tunnel is associated with.
   * </pre>
   *
   * <code>optional uint32 local_gateway_interface = 158764330;</code>
   *
   * @return The localGatewayInterface.
   */
  int getLocalGatewayInterface();

  /**
   *
   *
   * <pre>
   * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or a Google Cloud VPN gateway.
   * </pre>
   *
   * <code>optional uint32 peer_gateway_interface = 214380385;</code>
   *
   * @return Whether the peerGatewayInterface field is set.
   */
  boolean hasPeerGatewayInterface();
  /**
   *
   *
   * <pre>
   * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or a Google Cloud VPN gateway.
   * </pre>
   *
   * <code>optional uint32 peer_gateway_interface = 214380385;</code>
   *
   * @return The peerGatewayInterface.
   */
  int getPeerGatewayInterface();

  /**
   *
   *
   * <pre>
   * URL reference to the VPN tunnel.
   * </pre>
   *
   * <code>optional string tunnel_url = 78975256;</code>
   *
   * @return Whether the tunnelUrl field is set.
   */
  boolean hasTunnelUrl();
  /**
   *
   *
   * <pre>
   * URL reference to the VPN tunnel.
   * </pre>
   *
   * <code>optional string tunnel_url = 78975256;</code>
   *
   * @return The tunnelUrl.
   */
  java.lang.String getTunnelUrl();
  /**
   *
   *
   * <pre>
   * URL reference to the VPN tunnel.
   * </pre>
   *
   * <code>optional string tunnel_url = 78975256;</code>
   *
   * @return The bytes for tunnelUrl.
   */
  com.google.protobuf.ByteString getTunnelUrlBytes();
}
