// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/outputs.proto

package com.google.cloud.video.livestream.v1;

public interface MuxStreamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.MuxStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique key for this multiplexed stream.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * A unique key for this multiplexed stream.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The container format. The default is `fmp4`.
   *
   * Supported container formats:
   *
   * - `fmp4` - the corresponding file extension is `.m4s`
   * - `ts` - the corresponding file extension is `.ts`
   * </pre>
   *
   * <code>string container = 3;</code>
   * @return The container.
   */
  java.lang.String getContainer();
  /**
   * <pre>
   * The container format. The default is `fmp4`.
   *
   * Supported container formats:
   *
   * - `fmp4` - the corresponding file extension is `.m4s`
   * - `ts` - the corresponding file extension is `.ts`
   * </pre>
   *
   * <code>string container = 3;</code>
   * @return The bytes for container.
   */
  com.google.protobuf.ByteString
      getContainerBytes();

  /**
   * <pre>
   * List of `ElementaryStream`
   * [key][google.cloud.video.livestream.v1.ElementaryStream.key]s multiplexed
   * in this stream.
   *
   * - For `fmp4` container, must contain either one video or one audio stream.
   * - For `ts` container, must contain exactly one audio stream and up to one
   * video stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   * @return A list containing the elementaryStreams.
   */
  java.util.List<java.lang.String>
      getElementaryStreamsList();
  /**
   * <pre>
   * List of `ElementaryStream`
   * [key][google.cloud.video.livestream.v1.ElementaryStream.key]s multiplexed
   * in this stream.
   *
   * - For `fmp4` container, must contain either one video or one audio stream.
   * - For `ts` container, must contain exactly one audio stream and up to one
   * video stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   * @return The count of elementaryStreams.
   */
  int getElementaryStreamsCount();
  /**
   * <pre>
   * List of `ElementaryStream`
   * [key][google.cloud.video.livestream.v1.ElementaryStream.key]s multiplexed
   * in this stream.
   *
   * - For `fmp4` container, must contain either one video or one audio stream.
   * - For `ts` container, must contain exactly one audio stream and up to one
   * video stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   * @param index The index of the element to return.
   * @return The elementaryStreams at the given index.
   */
  java.lang.String getElementaryStreams(int index);
  /**
   * <pre>
   * List of `ElementaryStream`
   * [key][google.cloud.video.livestream.v1.ElementaryStream.key]s multiplexed
   * in this stream.
   *
   * - For `fmp4` container, must contain either one video or one audio stream.
   * - For `ts` container, must contain exactly one audio stream and up to one
   * video stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the elementaryStreams at the given index.
   */
  com.google.protobuf.ByteString
      getElementaryStreamsBytes(int index);

  /**
   * <pre>
   * Segment settings for `fmp4` and `ts`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.SegmentSettings segment_settings = 5;</code>
   * @return Whether the segmentSettings field is set.
   */
  boolean hasSegmentSettings();
  /**
   * <pre>
   * Segment settings for `fmp4` and `ts`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.SegmentSettings segment_settings = 5;</code>
   * @return The segmentSettings.
   */
  com.google.cloud.video.livestream.v1.SegmentSettings getSegmentSettings();
  /**
   * <pre>
   * Segment settings for `fmp4` and `ts`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.SegmentSettings segment_settings = 5;</code>
   */
  com.google.cloud.video.livestream.v1.SegmentSettingsOrBuilder getSegmentSettingsOrBuilder();

  /**
   * <pre>
   * Identifier of the encryption configuration to use. If omitted, output
   * will be unencrypted.
   * </pre>
   *
   * <code>string encryption_id = 6;</code>
   * @return The encryptionId.
   */
  java.lang.String getEncryptionId();
  /**
   * <pre>
   * Identifier of the encryption configuration to use. If omitted, output
   * will be unencrypted.
   * </pre>
   *
   * <code>string encryption_id = 6;</code>
   * @return The bytes for encryptionId.
   */
  com.google.protobuf.ByteString
      getEncryptionIdBytes();
}
