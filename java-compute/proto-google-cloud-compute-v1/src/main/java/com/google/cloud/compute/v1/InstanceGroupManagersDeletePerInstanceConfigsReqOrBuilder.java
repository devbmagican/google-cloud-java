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

public interface InstanceGroupManagersDeletePerInstanceConfigsReqOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagersDeletePerInstanceConfigsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   *
   * @return A list containing the names.
   */
  java.util.List<java.lang.String> getNamesList();
  /**
   *
   *
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   *
   * @return The count of names.
   */
  int getNamesCount();
  /**
   *
   *
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   *
   *
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString getNamesBytes(int index);
}
