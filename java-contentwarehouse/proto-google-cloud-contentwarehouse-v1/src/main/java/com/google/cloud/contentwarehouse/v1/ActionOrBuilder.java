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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

public interface ActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ID of the action. Managed internally.
   * </pre>
   *
   * <code>string action_id = 1;</code>
   *
   * @return The actionId.
   */
  java.lang.String getActionId();
  /**
   *
   *
   * <pre>
   * ID of the action. Managed internally.
   * </pre>
   *
   * <code>string action_id = 1;</code>
   *
   * @return The bytes for actionId.
   */
  com.google.protobuf.ByteString getActionIdBytes();

  /**
   *
   *
   * <pre>
   * Action triggering access control operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AccessControlAction access_control = 2;</code>
   *
   * @return Whether the accessControl field is set.
   */
  boolean hasAccessControl();
  /**
   *
   *
   * <pre>
   * Action triggering access control operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AccessControlAction access_control = 2;</code>
   *
   * @return The accessControl.
   */
  com.google.cloud.contentwarehouse.v1.AccessControlAction getAccessControl();
  /**
   *
   *
   * <pre>
   * Action triggering access control operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AccessControlAction access_control = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.AccessControlActionOrBuilder getAccessControlOrBuilder();

  /**
   *
   *
   * <pre>
   * Action triggering data validation operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DataValidationAction data_validation = 3;</code>
   *
   * @return Whether the dataValidation field is set.
   */
  boolean hasDataValidation();
  /**
   *
   *
   * <pre>
   * Action triggering data validation operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DataValidationAction data_validation = 3;</code>
   *
   * @return The dataValidation.
   */
  com.google.cloud.contentwarehouse.v1.DataValidationAction getDataValidation();
  /**
   *
   *
   * <pre>
   * Action triggering data validation operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DataValidationAction data_validation = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.DataValidationActionOrBuilder getDataValidationOrBuilder();

  /**
   *
   *
   * <pre>
   * Action triggering data update operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DataUpdateAction data_update = 4;</code>
   *
   * @return Whether the dataUpdate field is set.
   */
  boolean hasDataUpdate();
  /**
   *
   *
   * <pre>
   * Action triggering data update operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DataUpdateAction data_update = 4;</code>
   *
   * @return The dataUpdate.
   */
  com.google.cloud.contentwarehouse.v1.DataUpdateAction getDataUpdate();
  /**
   *
   *
   * <pre>
   * Action triggering data update operations.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DataUpdateAction data_update = 4;</code>
   */
  com.google.cloud.contentwarehouse.v1.DataUpdateActionOrBuilder getDataUpdateOrBuilder();

  /**
   *
   *
   * <pre>
   * Action triggering create document link operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AddToFolderAction add_to_folder = 5;</code>
   *
   * @return Whether the addToFolder field is set.
   */
  boolean hasAddToFolder();
  /**
   *
   *
   * <pre>
   * Action triggering create document link operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AddToFolderAction add_to_folder = 5;</code>
   *
   * @return The addToFolder.
   */
  com.google.cloud.contentwarehouse.v1.AddToFolderAction getAddToFolder();
  /**
   *
   *
   * <pre>
   * Action triggering create document link operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AddToFolderAction add_to_folder = 5;</code>
   */
  com.google.cloud.contentwarehouse.v1.AddToFolderActionOrBuilder getAddToFolderOrBuilder();

  /**
   *
   *
   * <pre>
   * Action publish to Pub/Sub operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.PublishAction publish_to_pub_sub = 6;</code>
   *
   * @return Whether the publishToPubSub field is set.
   */
  boolean hasPublishToPubSub();
  /**
   *
   *
   * <pre>
   * Action publish to Pub/Sub operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.PublishAction publish_to_pub_sub = 6;</code>
   *
   * @return The publishToPubSub.
   */
  com.google.cloud.contentwarehouse.v1.PublishAction getPublishToPubSub();
  /**
   *
   *
   * <pre>
   * Action publish to Pub/Sub operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.PublishAction publish_to_pub_sub = 6;</code>
   */
  com.google.cloud.contentwarehouse.v1.PublishActionOrBuilder getPublishToPubSubOrBuilder();

  /**
   *
   *
   * <pre>
   * Action removing a document from a folder.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RemoveFromFolderAction remove_from_folder_action = 9;
   * </code>
   *
   * @return Whether the removeFromFolderAction field is set.
   */
  boolean hasRemoveFromFolderAction();
  /**
   *
   *
   * <pre>
   * Action removing a document from a folder.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RemoveFromFolderAction remove_from_folder_action = 9;
   * </code>
   *
   * @return The removeFromFolderAction.
   */
  com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction getRemoveFromFolderAction();
  /**
   *
   *
   * <pre>
   * Action removing a document from a folder.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RemoveFromFolderAction remove_from_folder_action = 9;
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.RemoveFromFolderActionOrBuilder
      getRemoveFromFolderActionOrBuilder();

  /**
   *
   *
   * <pre>
   * Action deleting the document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DeleteDocumentAction delete_document_action = 10;
   * </code>
   *
   * @return Whether the deleteDocumentAction field is set.
   */
  boolean hasDeleteDocumentAction();
  /**
   *
   *
   * <pre>
   * Action deleting the document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DeleteDocumentAction delete_document_action = 10;
   * </code>
   *
   * @return The deleteDocumentAction.
   */
  com.google.cloud.contentwarehouse.v1.DeleteDocumentAction getDeleteDocumentAction();
  /**
   *
   *
   * <pre>
   * Action deleting the document.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DeleteDocumentAction delete_document_action = 10;
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.DeleteDocumentActionOrBuilder
      getDeleteDocumentActionOrBuilder();

  com.google.cloud.contentwarehouse.v1.Action.ActionCase getActionCase();
}
