// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p2beta1;

public interface ObjectTrackingFrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p2beta1.ObjectTrackingFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p2beta1.NormalizedBoundingBox normalized_bounding_box = 1;</code>
   * @return Whether the normalizedBoundingBox field is set.
   */
  boolean hasNormalizedBoundingBox();
  /**
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p2beta1.NormalizedBoundingBox normalized_bounding_box = 1;</code>
   * @return The normalizedBoundingBox.
   */
  com.google.cloud.videointelligence.v1p2beta1.NormalizedBoundingBox getNormalizedBoundingBox();
  /**
   * <pre>
   * The normalized bounding box location of this object track for the frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p2beta1.NormalizedBoundingBox normalized_bounding_box = 1;</code>
   */
  com.google.cloud.videointelligence.v1p2beta1.NormalizedBoundingBoxOrBuilder getNormalizedBoundingBoxOrBuilder();

  /**
   * <pre>
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   * <pre>
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   * <pre>
   * The timestamp of the frame in microseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();
}
