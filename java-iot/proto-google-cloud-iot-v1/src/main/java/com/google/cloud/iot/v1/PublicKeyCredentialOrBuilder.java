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
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public interface PublicKeyCredentialOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.PublicKeyCredential)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The format of the key.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
   *
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   *
   *
   * <pre>
   * The format of the key.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.PublicKeyFormat format = 1;</code>
   *
   * @return The format.
   */
  com.google.cloud.iot.v1.PublicKeyFormat getFormat();

  /**
   *
   *
   * <pre>
   * The key data.
   * </pre>
   *
   * <code>string key = 2;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * The key data.
   * </pre>
   *
   * <code>string key = 2;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();
}
