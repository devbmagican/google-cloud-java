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

public interface ImageFamilyViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ImageFamilyView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
   *
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
   *
   * @return The image.
   */
  com.google.cloud.compute.v1.Image getImage();
  /**
   *
   *
   * <pre>
   * The latest image that is part of the specified image family in the requested location, and that is not deprecated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Image image = 100313435;</code>
   */
  com.google.cloud.compute.v1.ImageOrBuilder getImageOrBuilder();
}
