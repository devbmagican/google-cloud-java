// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

public interface ListQueuesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.ListQueuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Queue queues = 1;</code>
   */
  java.util.List<com.google.cloud.tasks.v2beta3.Queue> 
      getQueuesList();
  /**
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Queue queues = 1;</code>
   */
  com.google.cloud.tasks.v2beta3.Queue getQueues(int index);
  /**
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Queue queues = 1;</code>
   */
  int getQueuesCount();
  /**
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Queue queues = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tasks.v2beta3.QueueOrBuilder> 
      getQueuesOrBuilderList();
  /**
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Queue queues = 1;</code>
   */
  com.google.cloud.tasks.v2beta3.QueueOrBuilder getQueuesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call
   * [ListQueues][google.cloud.tasks.v2beta3.CloudTasks.ListQueues] with this value as the
   * [page_token][google.cloud.tasks.v2beta3.ListQueuesRequest.page_token].
   *
   * If the next_page_token is empty, there are no more results.
   *
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call
   * [ListQueues][google.cloud.tasks.v2beta3.CloudTasks.ListQueues] with this value as the
   * [page_token][google.cloud.tasks.v2beta3.ListQueuesRequest.page_token].
   *
   * If the next_page_token is empty, there are no more results.
   *
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
