// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts_lrs.proto

package com.google.cloud.texttospeech.v1beta1;

public interface SynthesizeLongAudioRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.SynthesizeLongAudioRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource states of the request in the form of
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The resource states of the request in the form of
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * While Long Audio is in preview, SSML is temporarily unsupported.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.SynthesisInput input = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * While Long Audio is in preview, SSML is temporarily unsupported.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.SynthesisInput input = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The input.
   */
  com.google.cloud.texttospeech.v1beta1.SynthesisInput getInput();
  /**
   * <pre>
   * Required. The Synthesizer requires either plain text or SSML as input.
   * While Long Audio is in preview, SSML is temporarily unsupported.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.SynthesisInput input = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.texttospeech.v1beta1.SynthesisInputOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioConfig audio_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the audioConfig field is set.
   */
  boolean hasAudioConfig();
  /**
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioConfig audio_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The audioConfig.
   */
  com.google.cloud.texttospeech.v1beta1.AudioConfig getAudioConfig();
  /**
   * <pre>
   * Required. The configuration of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.AudioConfig audio_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.texttospeech.v1beta1.AudioConfigOrBuilder getAudioConfigOrBuilder();

  /**
   * <pre>
   * Required. Specifies a Cloud Storage URI for the synthesis results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string output_gcs_uri = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputGcsUri.
   */
  java.lang.String getOutputGcsUri();
  /**
   * <pre>
   * Required. Specifies a Cloud Storage URI for the synthesis results. Must be
   * specified in the format: `gs://bucket_name/object_name`, and the bucket
   * must already exist.
   * </pre>
   *
   * <code>string output_gcs_uri = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for outputGcsUri.
   */
  com.google.protobuf.ByteString
      getOutputGcsUriBytes();

  /**
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.VoiceSelectionParams voice = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the voice field is set.
   */
  boolean hasVoice();
  /**
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.VoiceSelectionParams voice = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The voice.
   */
  com.google.cloud.texttospeech.v1beta1.VoiceSelectionParams getVoice();
  /**
   * <pre>
   * Required. The desired voice of the synthesized audio.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1beta1.VoiceSelectionParams voice = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.texttospeech.v1beta1.VoiceSelectionParamsOrBuilder getVoiceOrBuilder();
}
