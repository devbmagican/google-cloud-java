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
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface MysqlColumnOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.MysqlColumn)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column = 1;</code>
   *
   * @return The column.
   */
  java.lang.String getColumn();
  /**
   *
   *
   * <pre>
   * Column name.
   * </pre>
   *
   * <code>string column = 1;</code>
   *
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString getColumnBytes();

  /**
   *
   *
   * <pre>
   * The MySQL data type. Full data types list can be found here:
   * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The dataType.
   */
  java.lang.String getDataType();
  /**
   *
   *
   * <pre>
   * The MySQL data type. Full data types list can be found here:
   * https://dev.mysql.com/doc/refman/8.0/en/data-types.html
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString getDataTypeBytes();

  /**
   *
   *
   * <pre>
   * Column length.
   * </pre>
   *
   * <code>int32 length = 3;</code>
   *
   * @return The length.
   */
  int getLength();

  /**
   *
   *
   * <pre>
   * Column collation.
   * </pre>
   *
   * <code>string collation = 4;</code>
   *
   * @return The collation.
   */
  java.lang.String getCollation();
  /**
   *
   *
   * <pre>
   * Column collation.
   * </pre>
   *
   * <code>string collation = 4;</code>
   *
   * @return The bytes for collation.
   */
  com.google.protobuf.ByteString getCollationBytes();

  /**
   *
   *
   * <pre>
   * Whether or not the column represents a primary key.
   * </pre>
   *
   * <code>bool primary_key = 5;</code>
   *
   * @return The primaryKey.
   */
  boolean getPrimaryKey();

  /**
   *
   *
   * <pre>
   * Whether or not the column can accept a null value.
   * </pre>
   *
   * <code>bool nullable = 6;</code>
   *
   * @return The nullable.
   */
  boolean getNullable();

  /**
   *
   *
   * <pre>
   * The ordinal position of the column in the table.
   * </pre>
   *
   * <code>int32 ordinal_position = 7;</code>
   *
   * @return The ordinalPosition.
   */
  int getOrdinalPosition();
}
