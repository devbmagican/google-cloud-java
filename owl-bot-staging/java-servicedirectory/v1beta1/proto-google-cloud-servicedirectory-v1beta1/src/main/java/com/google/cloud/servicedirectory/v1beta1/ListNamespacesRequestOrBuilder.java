// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/registration_service.proto

package com.google.cloud.servicedirectory.v1beta1;

public interface ListNamespacesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1beta1.ListNamespacesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the project and location whose namespaces you'd like
   * to list.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the project and location whose namespaces you'd like
   * to list.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The maximum number of items to return.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The next_page_token value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The next_page_token value returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. The filter to list results by.
   *
   * General `filter` string syntax:
   * `&lt;field&gt; &lt;operator&gt; &lt;value&gt; (&lt;logical connector&gt;)`
   *
   * *   `&lt;field&gt;` can be `name` or `labels.&lt;key&gt;` for map field
   * *   `&lt;operator&gt;` can be `&lt;`, `&gt;`, `&lt;=`, `&gt;=`, `!=`, `=`, `:`. Of which `:`
   *     means `HAS`, and is roughly the same as `=`
   * *   `&lt;value&gt;` must be the same data type as field
   * *   `&lt;logical connector&gt;` can be `AND`, `OR`, `NOT`
   *
   * Examples of valid filters:
   *
   * *   `labels.owner` returns namespaces that have a label with the key
   *     `owner`, this is the same as `labels:owner`
   * *   `labels.owner=sd` returns namespaces that have key/value `owner=sd`
   * *   `name&gt;projects/my-project/locations/us-east1/namespaces/namespace-c`
   *     returns namespaces that have name that is alphabetically later than the
   *     string, so "namespace-e" is returned but "namespace-a" is not
   * *   `labels.owner!=sd AND labels.foo=bar` returns namespaces that have
   *     `owner` in label key but value is not `sd` AND have key/value `foo=bar`
   * *   `doesnotexist.foo=bar` returns an empty list. Note that namespace
   *     doesn't have a field called "doesnotexist". Since the filter does not
   *     match any namespaces, it returns no results
   *
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. The filter to list results by.
   *
   * General `filter` string syntax:
   * `&lt;field&gt; &lt;operator&gt; &lt;value&gt; (&lt;logical connector&gt;)`
   *
   * *   `&lt;field&gt;` can be `name` or `labels.&lt;key&gt;` for map field
   * *   `&lt;operator&gt;` can be `&lt;`, `&gt;`, `&lt;=`, `&gt;=`, `!=`, `=`, `:`. Of which `:`
   *     means `HAS`, and is roughly the same as `=`
   * *   `&lt;value&gt;` must be the same data type as field
   * *   `&lt;logical connector&gt;` can be `AND`, `OR`, `NOT`
   *
   * Examples of valid filters:
   *
   * *   `labels.owner` returns namespaces that have a label with the key
   *     `owner`, this is the same as `labels:owner`
   * *   `labels.owner=sd` returns namespaces that have key/value `owner=sd`
   * *   `name&gt;projects/my-project/locations/us-east1/namespaces/namespace-c`
   *     returns namespaces that have name that is alphabetically later than the
   *     string, so "namespace-e" is returned but "namespace-a" is not
   * *   `labels.owner!=sd AND labels.foo=bar` returns namespaces that have
   *     `owner` in label key but value is not `sd` AND have key/value `foo=bar`
   * *   `doesnotexist.foo=bar` returns an empty list. Note that namespace
   *     doesn't have a field called "doesnotexist". Since the filter does not
   *     match any namespaces, it returns no results
   *
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional. The order to list results by.
   *
   * General `order_by` string syntax: `&lt;field&gt; (&lt;asc|desc&gt;) (,)`
   *
   * *   `&lt;field&gt;` allows value: `name`
   * *   `&lt;asc|desc&gt;` ascending or descending order by `&lt;field&gt;`. If this is
   *     left blank, `asc` is used
   *
   * Note that an empty `order_by` string results in default order, which is
   * order by `name` in ascending order.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. The order to list results by.
   *
   * General `order_by` string syntax: `&lt;field&gt; (&lt;asc|desc&gt;) (,)`
   *
   * *   `&lt;field&gt;` allows value: `name`
   * *   `&lt;asc|desc&gt;` ascending or descending order by `&lt;field&gt;`. If this is
   *     left blank, `asc` is used
   *
   * Note that an empty `order_by` string results in default order, which is
   * order by `name` in ascending order.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();
}
