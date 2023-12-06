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

public interface FixedOrPercentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FixedOrPercent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded.
   * </pre>
   *
   * <code>optional int32 calculated = 472082878;</code>
   *
   * @return Whether the calculated field is set.
   */
  boolean hasCalculated();
  /**
   *
   *
   * <pre>
   * [Output Only] Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded.
   * </pre>
   *
   * <code>optional int32 calculated = 472082878;</code>
   *
   * @return The calculated.
   */
  int getCalculated();

  /**
   *
   *
   * <pre>
   * Specifies a fixed number of VM instances. This must be a positive integer.
   * </pre>
   *
   * <code>optional int32 fixed = 97445748;</code>
   *
   * @return Whether the fixed field is set.
   */
  boolean hasFixed();
  /**
   *
   *
   * <pre>
   * Specifies a fixed number of VM instances. This must be a positive integer.
   * </pre>
   *
   * <code>optional int32 fixed = 97445748;</code>
   *
   * @return The fixed.
   */
  int getFixed();

  /**
   *
   *
   * <pre>
   * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
   * </pre>
   *
   * <code>optional int32 percent = 394814533;</code>
   *
   * @return Whether the percent field is set.
   */
  boolean hasPercent();
  /**
   *
   *
   * <pre>
   * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
   * </pre>
   *
   * <code>optional int32 percent = 394814533;</code>
   *
   * @return The percent.
   */
  int getPercent();
}
