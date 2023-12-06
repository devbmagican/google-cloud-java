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

public interface ExternalVpnGatewayInterfaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ExternalVpnGatewayInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The numeric ID of this interface. The allowed input values for this id for different redundancy types of external VPN gateway: - SINGLE_IP_INTERNALLY_REDUNDANT - 0 - TWO_IPS_REDUNDANCY - 0, 1 - FOUR_IPS_REDUNDANCY - 0, 1, 2, 3
   * </pre>
   *
   * <code>optional uint32 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * The numeric ID of this interface. The allowed input values for this id for different redundancy types of external VPN gateway: - SINGLE_IP_INTERNALLY_REDUNDANT - 0 - TWO_IPS_REDUNDANCY - 0, 1 - FOUR_IPS_REDUNDANCY - 0, 1, 2, 3
   * </pre>
   *
   * <code>optional uint32 id = 3355;</code>
   *
   * @return The id.
   */
  int getId();

  /**
   *
   *
   * <pre>
   * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider's VPN gateway, it cannot be an IP address from Google Compute Engine.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider's VPN gateway, it cannot be an IP address from Google Compute Engine.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider's VPN gateway, it cannot be an IP address from Google Compute Engine.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();
}
