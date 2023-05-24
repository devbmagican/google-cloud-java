// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the event, in the form of:
   * `projects/{project}/locations/{location}/channels/{channelId}/events/{eventId}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the event, in the form of:
   * `projects/{project}/locations/{location}/channels/{channelId}/events/{eventId}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. Switches to another input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.InputSwitchTask input_switch = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the inputSwitch field is set.
   */
  boolean hasInputSwitch();
  /**
   * <pre>
   * Required. Switches to another input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.InputSwitchTask input_switch = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputSwitch.
   */
  com.google.cloud.video.livestream.v1.Event.InputSwitchTask getInputSwitch();
  /**
   * <pre>
   * Required. Switches to another input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.InputSwitchTask input_switch = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.livestream.v1.Event.InputSwitchTaskOrBuilder getInputSwitchOrBuilder();

  /**
   * <pre>
   * Required. Inserts a new ad opportunity.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.AdBreakTask ad_break = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the adBreak field is set.
   */
  boolean hasAdBreak();
  /**
   * <pre>
   * Required. Inserts a new ad opportunity.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.AdBreakTask ad_break = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adBreak.
   */
  com.google.cloud.video.livestream.v1.Event.AdBreakTask getAdBreak();
  /**
   * <pre>
   * Required. Inserts a new ad opportunity.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.AdBreakTask ad_break = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.livestream.v1.Event.AdBreakTaskOrBuilder getAdBreakOrBuilder();

  /**
   * <pre>
   * Required. Stops any running ad break.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.ReturnToProgramTask return_to_program = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the returnToProgram field is set.
   */
  boolean hasReturnToProgram();
  /**
   * <pre>
   * Required. Stops any running ad break.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.ReturnToProgramTask return_to_program = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The returnToProgram.
   */
  com.google.cloud.video.livestream.v1.Event.ReturnToProgramTask getReturnToProgram();
  /**
   * <pre>
   * Required. Stops any running ad break.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.ReturnToProgramTask return_to_program = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.livestream.v1.Event.ReturnToProgramTaskOrBuilder getReturnToProgramOrBuilder();

  /**
   * <pre>
   * Required. Mutes the stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.MuteTask mute = 15 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the mute field is set.
   */
  boolean hasMute();
  /**
   * <pre>
   * Required. Mutes the stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.MuteTask mute = 15 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The mute.
   */
  com.google.cloud.video.livestream.v1.Event.MuteTask getMute();
  /**
   * <pre>
   * Required. Mutes the stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.MuteTask mute = 15 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.livestream.v1.Event.MuteTaskOrBuilder getMuteOrBuilder();

  /**
   * <pre>
   * Required. Unmutes the stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.UnmuteTask unmute = 16 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the unmute field is set.
   */
  boolean hasUnmute();
  /**
   * <pre>
   * Required. Unmutes the stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.UnmuteTask unmute = 16 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The unmute.
   */
  com.google.cloud.video.livestream.v1.Event.UnmuteTask getUnmute();
  /**
   * <pre>
   * Required. Unmutes the stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.UnmuteTask unmute = 16 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.video.livestream.v1.Event.UnmuteTaskOrBuilder getUnmuteOrBuilder();

  /**
   * <pre>
   * When this field is set to true, the event will be executed at the earliest
   * time that the server can schedule the event and
   * [execution_time][google.cloud.video.livestream.v1.Event.execution_time]
   * will be populated with the time that the server actually schedules the
   * event.
   * </pre>
   *
   * <code>bool execute_now = 9;</code>
   * @return The executeNow.
   */
  boolean getExecuteNow();

  /**
   * <pre>
   * The time to execute the event. If you set
   * [execute_now][google.cloud.video.livestream.v1.Event.execute_now] to
   * `true`, then do not set this field in the `CreateEvent` request. In
   * this case, the server schedules the event and populates this field. If you
   * set [execute_now][google.cloud.video.livestream.v1.Event.execute_now] to
   * `false`, then you must set this field to at least 10 seconds in the future
   * or else the event can't be created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_time = 10;</code>
   * @return Whether the executionTime field is set.
   */
  boolean hasExecutionTime();
  /**
   * <pre>
   * The time to execute the event. If you set
   * [execute_now][google.cloud.video.livestream.v1.Event.execute_now] to
   * `true`, then do not set this field in the `CreateEvent` request. In
   * this case, the server schedules the event and populates this field. If you
   * set [execute_now][google.cloud.video.livestream.v1.Event.execute_now] to
   * `false`, then you must set this field to at least 10 seconds in the future
   * or else the event can't be created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_time = 10;</code>
   * @return The executionTime.
   */
  com.google.protobuf.Timestamp getExecutionTime();
  /**
   * <pre>
   * The time to execute the event. If you set
   * [execute_now][google.cloud.video.livestream.v1.Event.execute_now] to
   * `true`, then do not set this field in the `CreateEvent` request. In
   * this case, the server schedules the event and populates this field. If you
   * set [execute_now][google.cloud.video.livestream.v1.Event.execute_now] to
   * `false`, then you must set this field to at least 10 seconds in the future
   * or else the event can't be created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp execution_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExecutionTimeOrBuilder();

  /**
   * <pre>
   * Output only. The state of the event.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The state of the event.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Event.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.video.livestream.v1.Event.State getState();

  /**
   * <pre>
   * Output only. An error object that describes the reason for the failure.
   * This property is always present when `state` is `FAILED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Output only. An error object that describes the reason for the failure.
   * This property is always present when `state` is `FAILED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * Output only. An error object that describes the reason for the failure.
   * This property is always present when `state` is `FAILED`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  com.google.cloud.video.livestream.v1.Event.TaskCase getTaskCase();
}
