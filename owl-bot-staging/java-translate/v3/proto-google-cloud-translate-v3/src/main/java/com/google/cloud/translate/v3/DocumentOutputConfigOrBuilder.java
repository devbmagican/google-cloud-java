// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface DocumentOutputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.DocumentOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Google Cloud Storage destination for the translation output,
   * e.g., `gs://my_bucket/my_directory/`.
   *
   * The destination directory provided does not have to be empty, but the
   * bucket must exist. If a file with the same name as the output file
   * already exists in the destination an error will be returned.
   *
   * For a DocumentInputConfig.contents provided document, the output file
   * will have the name "output_[trg]_translations.[ext]", where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   *
   * For a DocumentInputConfig.gcs_uri provided document, the output file will
   * have a name according to its URI. For example: an input file with URI:
   * "gs://a/b/c.[extension]" stored in a gcs_destination bucket with name
   * "my_bucket" will have an output URI:
   * "gs://my_bucket/a_b_c_[trg]_translations.[ext]", where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   *
   * If the document was directly provided through the request, then the
   * output document will have the format:
   * "gs://my_bucket/translated_document_[trg]_translations.[ext], where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   * If a glossary was provided, then the output URI for the glossary
   * translation will be equal to the default output URI but have
   * `glossary_translations` instead of `translations`. For the previous
   * example, its glossary URI would be:
   * "gs://my_bucket/a_b_c_[trg]_glossary_translations.[ext]".
   *
   * Thus the max number of output files will be 2 (Translated document,
   * Glossary translated document).
   *
   * Callers should expect no partial outputs. If there is any error during
   * document translation, no output will be stored in the Cloud Storage
   * bucket.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   * <pre>
   * Optional. Google Cloud Storage destination for the translation output,
   * e.g., `gs://my_bucket/my_directory/`.
   *
   * The destination directory provided does not have to be empty, but the
   * bucket must exist. If a file with the same name as the output file
   * already exists in the destination an error will be returned.
   *
   * For a DocumentInputConfig.contents provided document, the output file
   * will have the name "output_[trg]_translations.[ext]", where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   *
   * For a DocumentInputConfig.gcs_uri provided document, the output file will
   * have a name according to its URI. For example: an input file with URI:
   * "gs://a/b/c.[extension]" stored in a gcs_destination bucket with name
   * "my_bucket" will have an output URI:
   * "gs://my_bucket/a_b_c_[trg]_translations.[ext]", where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   *
   * If the document was directly provided through the request, then the
   * output document will have the format:
   * "gs://my_bucket/translated_document_[trg]_translations.[ext], where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   * If a glossary was provided, then the output URI for the glossary
   * translation will be equal to the default output URI but have
   * `glossary_translations` instead of `translations`. For the previous
   * example, its glossary URI would be:
   * "gs://my_bucket/a_b_c_[trg]_glossary_translations.[ext]".
   *
   * Thus the max number of output files will be 2 (Translated document,
   * Glossary translated document).
   *
   * Callers should expect no partial outputs. If there is any error during
   * document translation, no output will be stored in the Cloud Storage
   * bucket.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The gcsDestination.
   */
  com.google.cloud.translate.v3.GcsDestination getGcsDestination();
  /**
   * <pre>
   * Optional. Google Cloud Storage destination for the translation output,
   * e.g., `gs://my_bucket/my_directory/`.
   *
   * The destination directory provided does not have to be empty, but the
   * bucket must exist. If a file with the same name as the output file
   * already exists in the destination an error will be returned.
   *
   * For a DocumentInputConfig.contents provided document, the output file
   * will have the name "output_[trg]_translations.[ext]", where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   *
   * For a DocumentInputConfig.gcs_uri provided document, the output file will
   * have a name according to its URI. For example: an input file with URI:
   * "gs://a/b/c.[extension]" stored in a gcs_destination bucket with name
   * "my_bucket" will have an output URI:
   * "gs://my_bucket/a_b_c_[trg]_translations.[ext]", where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   *
   * If the document was directly provided through the request, then the
   * output document will have the format:
   * "gs://my_bucket/translated_document_[trg]_translations.[ext], where
   * - [trg] corresponds to the translated file's language code,
   * - [ext] corresponds to the translated file's extension according to its
   * mime type.
   *
   * If a glossary was provided, then the output URI for the glossary
   * translation will be equal to the default output URI but have
   * `glossary_translations` instead of `translations`. For the previous
   * example, its glossary URI would be:
   * "gs://my_bucket/a_b_c_[trg]_glossary_translations.[ext]".
   *
   * Thus the max number of output files will be 2 (Translated document,
   * Glossary translated document).
   *
   * Callers should expect no partial outputs. If there is any error during
   * document translation, no output will be stored in the Cloud Storage
   * bucket.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsDestination gcs_destination = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.translate.v3.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   * <pre>
   * Optional. Specifies the translated document's mime_type.
   * If not specified, the translated file's mime type will be the same as the
   * input file's mime type.
   * Currently only support the output mime type to be the same as input mime
   * type.
   * - application/pdf
   * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * Optional. Specifies the translated document's mime_type.
   * If not specified, the translated file's mime type will be the same as the
   * input file's mime type.
   * Currently only support the output mime type to be the same as input mime
   * type.
   * - application/pdf
   * - application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();

  com.google.cloud.translate.v3.DocumentOutputConfig.DestinationCase getDestinationCase();
}
