// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/outputs.proto

package com.google.cloud.video.livestream.v1;

public interface ManifestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.Manifest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the generated file. The default is `manifest` with the
   * extension suffix corresponding to the `Manifest`
   * [type][google.cloud.video.livestream.v1.Manifest.type]. If multiple
   * manifests are added to the channel, each must have a unique file name.
   * </pre>
   *
   * <code>string file_name = 1;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <pre>
   * The name of the generated file. The default is `manifest` with the
   * extension suffix corresponding to the `Manifest`
   * [type][google.cloud.video.livestream.v1.Manifest.type]. If multiple
   * manifests are added to the channel, each must have a unique file name.
   * </pre>
   *
   * <code>string file_name = 1;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   * Required. Type of the manifest, can be `HLS` or `DASH`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Manifest.ManifestType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. Type of the manifest, can be `HLS` or `DASH`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Manifest.ManifestType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.cloud.video.livestream.v1.Manifest.ManifestType getType();

  /**
   * <pre>
   * Required. List of `MuxStream`
   * [key][google.cloud.video.livestream.v1.MuxStream.key]s that should appear
   * in this manifest.
   *
   * - For HLS, either `fmp4` or `ts` mux streams can be specified but not
   * mixed.
   * - For DASH, only `fmp4` mux streams can be specified.
   * </pre>
   *
   * <code>repeated string mux_streams = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the muxStreams.
   */
  java.util.List<java.lang.String>
      getMuxStreamsList();
  /**
   * <pre>
   * Required. List of `MuxStream`
   * [key][google.cloud.video.livestream.v1.MuxStream.key]s that should appear
   * in this manifest.
   *
   * - For HLS, either `fmp4` or `ts` mux streams can be specified but not
   * mixed.
   * - For DASH, only `fmp4` mux streams can be specified.
   * </pre>
   *
   * <code>repeated string mux_streams = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of muxStreams.
   */
  int getMuxStreamsCount();
  /**
   * <pre>
   * Required. List of `MuxStream`
   * [key][google.cloud.video.livestream.v1.MuxStream.key]s that should appear
   * in this manifest.
   *
   * - For HLS, either `fmp4` or `ts` mux streams can be specified but not
   * mixed.
   * - For DASH, only `fmp4` mux streams can be specified.
   * </pre>
   *
   * <code>repeated string mux_streams = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The muxStreams at the given index.
   */
  java.lang.String getMuxStreams(int index);
  /**
   * <pre>
   * Required. List of `MuxStream`
   * [key][google.cloud.video.livestream.v1.MuxStream.key]s that should appear
   * in this manifest.
   *
   * - For HLS, either `fmp4` or `ts` mux streams can be specified but not
   * mixed.
   * - For DASH, only `fmp4` mux streams can be specified.
   * </pre>
   *
   * <code>repeated string mux_streams = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the muxStreams at the given index.
   */
  com.google.protobuf.ByteString
      getMuxStreamsBytes(int index);

  /**
   * <pre>
   * Maximum number of segments that this manifest holds. Once the manifest
   * reaches this maximum number of segments, whenever a new segment is added to
   * the manifest, the oldest segment will be removed from the manifest.
   * The minimum value is 3 and the default value is 5.
   * </pre>
   *
   * <code>int32 max_segment_count = 4;</code>
   * @return The maxSegmentCount.
   */
  int getMaxSegmentCount();

  /**
   * <pre>
   * How long to keep a segment on the output Google Cloud Storage bucket after
   * it is removed from the manifest. This field should be large enough to cover
   * the manifest propagation delay. Otherwise, a player could receive 404
   * errors while accessing segments which are listed in the manifest that the
   * player has, but were already deleted from the output Google Cloud Storage
   * bucket. Default value is `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_keep_duration = 5;</code>
   * @return Whether the segmentKeepDuration field is set.
   */
  boolean hasSegmentKeepDuration();
  /**
   * <pre>
   * How long to keep a segment on the output Google Cloud Storage bucket after
   * it is removed from the manifest. This field should be large enough to cover
   * the manifest propagation delay. Otherwise, a player could receive 404
   * errors while accessing segments which are listed in the manifest that the
   * player has, but were already deleted from the output Google Cloud Storage
   * bucket. Default value is `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_keep_duration = 5;</code>
   * @return The segmentKeepDuration.
   */
  com.google.protobuf.Duration getSegmentKeepDuration();
  /**
   * <pre>
   * How long to keep a segment on the output Google Cloud Storage bucket after
   * it is removed from the manifest. This field should be large enough to cover
   * the manifest propagation delay. Otherwise, a player could receive 404
   * errors while accessing segments which are listed in the manifest that the
   * player has, but were already deleted from the output Google Cloud Storage
   * bucket. Default value is `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration segment_keep_duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getSegmentKeepDurationOrBuilder();

  /**
   * <pre>
   * Whether to use the timecode, as specified in timecode config, when setting:
   *
   * - `availabilityStartTime` attribute in DASH manifests.
   * - `#EXT-X-PROGRAM-DATE-TIME` tag in HLS manifests.
   *
   * If false, ignore the input timecode and use the time from system clock
   * when the manifest is first generated. This is the default behavior.
   * </pre>
   *
   * <code>bool use_timecode_as_timeline = 6;</code>
   * @return The useTimecodeAsTimeline.
   */
  boolean getUseTimecodeAsTimeline();
}
