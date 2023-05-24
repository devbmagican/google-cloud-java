// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface SupportedLanguageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.SupportedLanguage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Supported language code, generally consisting of its ISO 639-1
   * identifier, for example, 'en', 'ja'. In certain cases, ISO-639 codes
   * including language and region identifiers are returned (for example,
   * 'zh-TW' and 'zh-CN').
   * </pre>
   *
   * <code>string language_code = 1;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Supported language code, generally consisting of its ISO 639-1
   * identifier, for example, 'en', 'ja'. In certain cases, ISO-639 codes
   * including language and region identifiers are returned (for example,
   * 'zh-TW' and 'zh-CN').
   * </pre>
   *
   * <code>string language_code = 1;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * Human-readable name of the language localized in the display language
   * specified in the request.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Human-readable name of the language localized in the display language
   * specified in the request.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Can be used as a source language.
   * </pre>
   *
   * <code>bool support_source = 3;</code>
   * @return The supportSource.
   */
  boolean getSupportSource();

  /**
   * <pre>
   * Can be used as a target language.
   * </pre>
   *
   * <code>bool support_target = 4;</code>
   * @return The supportTarget.
   */
  boolean getSupportTarget();
}
