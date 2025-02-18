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
// source: google/cloud/vertexai/v1beta1/tool.proto

package com.google.cloud.vertexai.api;

public interface FunctionDeclarationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.FunctionDeclaration)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Must start with a letter or an underscore.
   * Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum
   * length of 64.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the function to call.
   * Must start with a letter or an underscore.
   * Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum
   * length of 64.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description and purpose of the function.
   * Model uses it to decide how and whether to call the function.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description and purpose of the function.
   * Model uses it to decide how and whether to call the function.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Describes the parameters to this function in JSON Schema Object
   * format. Reflects the Open API 3.03 Parameter Object. string Key: the name
   * of the parameter. Parameter names are case sensitive. Schema Value: the
   * Schema defining the type used for the parameter. For function with no
   * parameters, this can be left unset. Example with 1 required and 1 optional
   * parameter: type: OBJECT properties:
   *  param1:
   *    type: STRING
   *  param2:
   *    type: INTEGER
   * required:
   *  - param1
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.Schema parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * Optional. Describes the parameters to this function in JSON Schema Object
   * format. Reflects the Open API 3.03 Parameter Object. string Key: the name
   * of the parameter. Parameter names are case sensitive. Schema Value: the
   * Schema defining the type used for the parameter. For function with no
   * parameters, this can be left unset. Example with 1 required and 1 optional
   * parameter: type: OBJECT properties:
   *  param1:
   *    type: STRING
   *  param2:
   *    type: INTEGER
   * required:
   *  - param1
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.Schema parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The parameters.
   */
  com.google.cloud.vertexai.api.Schema getParameters();
  /**
   *
   *
   * <pre>
   * Optional. Describes the parameters to this function in JSON Schema Object
   * format. Reflects the Open API 3.03 Parameter Object. string Key: the name
   * of the parameter. Parameter names are case sensitive. Schema Value: the
   * Schema defining the type used for the parameter. For function with no
   * parameters, this can be left unset. Example with 1 required and 1 optional
   * parameter: type: OBJECT properties:
   *  param1:
   *    type: STRING
   *  param2:
   *    type: INTEGER
   * required:
   *  - param1
   * </pre>
   *
   * <code>
   * .google.cloud.vertexai.v1beta1.Schema parameters = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.vertexai.api.SchemaOrBuilder getParametersOrBuilder();
}
