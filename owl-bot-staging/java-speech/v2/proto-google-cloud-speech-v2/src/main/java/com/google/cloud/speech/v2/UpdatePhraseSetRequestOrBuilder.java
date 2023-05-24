// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface UpdatePhraseSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.UpdatePhraseSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The PhraseSet to update.
   *
   * The PhraseSet's `name` field is used to identify the PhraseSet to update.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the phraseSet field is set.
   */
  boolean hasPhraseSet();
  /**
   * <pre>
   * Required. The PhraseSet to update.
   *
   * The PhraseSet's `name` field is used to identify the PhraseSet to update.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The phraseSet.
   */
  com.google.cloud.speech.v2.PhraseSet getPhraseSet();
  /**
   * <pre>
   * Required. The PhraseSet to update.
   *
   * The PhraseSet's `name` field is used to identify the PhraseSet to update.
   * Format: `projects/{project}/locations/{location}/phraseSets/{phrase_set}`.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.PhraseSet phrase_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.speech.v2.PhraseSetOrBuilder getPhraseSetOrBuilder();

  /**
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire PhraseSet resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire PhraseSet resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update. If empty, all non-default valued fields are
   * considered for update. Use `*` to update the entire PhraseSet resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * If set, validate the request and preview the updated PhraseSet, but do not
   * actually update it.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
