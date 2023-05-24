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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

public interface ForwardSshTunnelConnectivityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.ForwardSshTunnelConnectivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Hostname for the SSH tunnel.
   * </pre>
   *
   * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   *
   *
   * <pre>
   * Required. Hostname for the SSH tunnel.
   * </pre>
   *
   * <code>string hostname = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString getHostnameBytes();

  /**
   *
   *
   * <pre>
   * Required. Username for the SSH tunnel.
   * </pre>
   *
   * <code>string username = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   *
   *
   * <pre>
   * Required. Username for the SSH tunnel.
   * </pre>
   *
   * <code>string username = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();

  /**
   *
   *
   * <pre>
   * Port for the SSH tunnel, default value is 22.
   * </pre>
   *
   * <code>int32 port = 3;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Input only. SSH password.
   * </pre>
   *
   * <code>string password = 100 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return Whether the password field is set.
   */
  boolean hasPassword();
  /**
   *
   *
   * <pre>
   * Input only. SSH password.
   * </pre>
   *
   * <code>string password = 100 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * Input only. SSH password.
   * </pre>
   *
   * <code>string password = 100 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();

  /**
   *
   *
   * <pre>
   * Input only. SSH private key.
   * </pre>
   *
   * <code>string private_key = 101 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return Whether the privateKey field is set.
   */
  boolean hasPrivateKey();
  /**
   *
   *
   * <pre>
   * Input only. SSH private key.
   * </pre>
   *
   * <code>string private_key = 101 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The privateKey.
   */
  java.lang.String getPrivateKey();
  /**
   *
   *
   * <pre>
   * Input only. SSH private key.
   * </pre>
   *
   * <code>string private_key = 101 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for privateKey.
   */
  com.google.protobuf.ByteString getPrivateKeyBytes();

  com.google.cloud.datastream.v1alpha1.ForwardSshTunnelConnectivity.AuthenticationMethodCase
      getAuthenticationMethodCase();
}
