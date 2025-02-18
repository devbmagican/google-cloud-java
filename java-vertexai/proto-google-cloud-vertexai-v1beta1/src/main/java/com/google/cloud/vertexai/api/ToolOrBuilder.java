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

public interface ToolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vertexai.v1beta1.Tool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.vertexai.api.FunctionDeclaration> getFunctionDeclarationsList();
  /**
   *
   *
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.vertexai.api.FunctionDeclaration getFunctionDeclarations(int index);
  /**
   *
   *
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFunctionDeclarationsCount();
  /**
   *
   *
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.vertexai.api.FunctionDeclarationOrBuilder>
      getFunctionDeclarationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. One or more function declarations to be passed to the model along
   * with the current user query. Model may decide to call a subset of these
   * functions by populating [FunctionCall][content.part.function_call] in the
   * response. User should provide a
   * [FunctionResponse][content.part.function_response] for each function call
   * in the next turn. Based on the function responses, Model will generate the
   * final response back to the user. Maximum 64 function declarations can be
   * provided.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.vertexai.v1beta1.FunctionDeclaration function_declarations = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.vertexai.api.FunctionDeclarationOrBuilder getFunctionDeclarationsOrBuilder(
      int index);
}
