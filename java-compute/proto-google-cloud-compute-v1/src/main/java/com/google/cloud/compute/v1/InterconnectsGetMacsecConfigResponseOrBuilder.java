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

public interface InterconnectsGetMacsecConfigResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectsGetMacsecConfigResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * end_interface: MixerGetResponseWithEtagBuilder
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return Whether the etag field is set.
   */
  boolean hasEtag();
  /**
   *
   *
   * <pre>
   * end_interface: MixerGetResponseWithEtagBuilder
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * end_interface: MixerGetResponseWithEtagBuilder
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
   *
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code>
   *
   * @return The result.
   */
  com.google.cloud.compute.v1.InterconnectMacsecConfig getResult();
  /** <code>optional .google.cloud.compute.v1.InterconnectMacsecConfig result = 139315229;</code> */
  com.google.cloud.compute.v1.InterconnectMacsecConfigOrBuilder getResultOrBuilder();
}
