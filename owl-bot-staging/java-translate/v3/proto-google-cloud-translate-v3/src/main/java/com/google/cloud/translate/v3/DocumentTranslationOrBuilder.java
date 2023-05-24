// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface DocumentTranslationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.DocumentTranslation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The array of translated documents. It is expected to be size 1 for now. We
   * may produce multiple translated documents in the future for other type of
   * file formats.
   * </pre>
   *
   * <code>repeated bytes byte_stream_outputs = 1;</code>
   * @return A list containing the byteStreamOutputs.
   */
  java.util.List<com.google.protobuf.ByteString> getByteStreamOutputsList();
  /**
   * <pre>
   * The array of translated documents. It is expected to be size 1 for now. We
   * may produce multiple translated documents in the future for other type of
   * file formats.
   * </pre>
   *
   * <code>repeated bytes byte_stream_outputs = 1;</code>
   * @return The count of byteStreamOutputs.
   */
  int getByteStreamOutputsCount();
  /**
   * <pre>
   * The array of translated documents. It is expected to be size 1 for now. We
   * may produce multiple translated documents in the future for other type of
   * file formats.
   * </pre>
   *
   * <code>repeated bytes byte_stream_outputs = 1;</code>
   * @param index The index of the element to return.
   * @return The byteStreamOutputs at the given index.
   */
  com.google.protobuf.ByteString getByteStreamOutputs(int index);

  /**
   * <pre>
   * The translated document's mime type.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * The translated document's mime type.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();

  /**
   * <pre>
   * The detected language for the input document.
   * If the user did not provide the source language for the input document,
   * this field will have the language code automatically detected. If the
   * source language was passed, auto-detection of the language does not occur
   * and this field is empty.
   * </pre>
   *
   * <code>string detected_language_code = 3;</code>
   * @return The detectedLanguageCode.
   */
  java.lang.String getDetectedLanguageCode();
  /**
   * <pre>
   * The detected language for the input document.
   * If the user did not provide the source language for the input document,
   * this field will have the language code automatically detected. If the
   * source language was passed, auto-detection of the language does not occur
   * and this field is empty.
   * </pre>
   *
   * <code>string detected_language_code = 3;</code>
   * @return The bytes for detectedLanguageCode.
   */
  com.google.protobuf.ByteString
      getDetectedLanguageCodeBytes();
}
