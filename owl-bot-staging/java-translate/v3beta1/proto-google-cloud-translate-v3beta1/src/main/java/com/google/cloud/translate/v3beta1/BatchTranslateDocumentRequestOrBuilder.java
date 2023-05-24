// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

public interface BatchTranslateDocumentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.BatchTranslateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Location to make a regional call.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * The `global` location is not supported for batch translation.
   *
   * Only AutoML Translation models or glossaries within the same region (have
   * the same location-id) can be used, otherwise an INVALID_ARGUMENT (400)
   * error is returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Location to make a regional call.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * The `global` location is not supported for batch translation.
   *
   * Only AutoML Translation models or glossaries within the same region (have
   * the same location-id) can be used, otherwise an INVALID_ARGUMENT (400)
   * error is returned.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The BCP-47 language code of the input document if known, for
   * example, "en-US" or "sr-Latn". Supported language codes are listed in
   * Language Support (https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();
  /**
   * <pre>
   * Required. The BCP-47 language code of the input document if known, for
   * example, "en-US" or "sr-Latn". Supported language codes are listed in
   * Language Support (https://cloud.google.com/translate/docs/languages).
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString
      getSourceLanguageCodeBytes();

  /**
   * <pre>
   * Required. The BCP-47 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the targetLanguageCodes.
   */
  java.util.List<java.lang.String>
      getTargetLanguageCodesList();
  /**
   * <pre>
   * Required. The BCP-47 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of targetLanguageCodes.
   */
  int getTargetLanguageCodesCount();
  /**
   * <pre>
   * Required. The BCP-47 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The targetLanguageCodes at the given index.
   */
  java.lang.String getTargetLanguageCodes(int index);
  /**
   * <pre>
   * Required. The BCP-47 language code to use for translation of the input
   * document. Specify up to 10 language codes here.
   * </pre>
   *
   * <code>repeated string target_language_codes = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the targetLanguageCodes at the given index.
   */
  com.google.protobuf.ByteString
      getTargetLanguageCodesBytes(int index);

  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.translate.v3beta1.BatchDocumentInputConfig> 
      getInputConfigsList();
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.translate.v3beta1.BatchDocumentInputConfig getInputConfigs(int index);
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getInputConfigsCount();
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3beta1.BatchDocumentInputConfigOrBuilder> 
      getInputConfigsOrBuilderList();
  /**
   * <pre>
   * Required. Input configurations.
   * The total number of files matched should be &lt;= 100.
   * The total content size to translate should be &lt;= 100M Unicode codepoints.
   * The files must use UTF-8 encoding.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3beta1.BatchDocumentInputConfig input_configs = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.translate.v3beta1.BatchDocumentInputConfigOrBuilder getInputConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.BatchDocumentOutputConfig output_config = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.BatchDocumentOutputConfig output_config = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputConfig.
   */
  com.google.cloud.translate.v3beta1.BatchDocumentOutputConfig getOutputConfig();
  /**
   * <pre>
   * Required. Output configuration.
   * If 2 input configs match to the same file (that is, same input path),
   * we don't generate output for duplicate inputs.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.BatchDocumentOutputConfig output_config = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.translate.v3beta1.BatchDocumentOutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is not requested for a language
   * pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getModelsCount();
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is not requested for a language
   * pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsModels(
      java.lang.String key);
  /**
   * Use {@link #getModelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getModels();
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is not requested for a language
   * pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getModelsMap();
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is not requested for a language
   * pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getModelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The models to use for translation. Map's key is target language
   * code. Map's value is the model name. Value can be a built-in general model,
   * or an AutoML Translation model.
   *
   * The value format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * If the map is empty or a specific model is not requested for a language
   * pair, then default google model (nmt) is used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; models = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getModelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3beta1.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getGlossariesCount();
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3beta1.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsGlossaries(
      java.lang.String key);
  /**
   * Use {@link #getGlossariesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig>
  getGlossaries();
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3beta1.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig>
  getGlossariesMap();
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3beta1.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig getGlossariesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig defaultValue);
  /**
   * <pre>
   * Optional. Glossaries to be applied. It's keyed by target language code.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.translation.v3beta1.TranslateTextGlossaryConfig&gt; glossaries = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig getGlossariesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. File format conversion map to be applied to all input files.
   * Map's key is the original mime_type. Map's value is the target mime_type of
   * translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getFormatConversionsCount();
  /**
   * <pre>
   * Optional. File format conversion map to be applied to all input files.
   * Map's key is the original mime_type. Map's value is the target mime_type of
   * translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsFormatConversions(
      java.lang.String key);
  /**
   * Use {@link #getFormatConversionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFormatConversions();
  /**
   * <pre>
   * Optional. File format conversion map to be applied to all input files.
   * Map's key is the original mime_type. Map's value is the target mime_type of
   * translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFormatConversionsMap();
  /**
   * <pre>
   * Optional. File format conversion map to be applied to all input files.
   * Map's key is the original mime_type. Map's value is the target mime_type of
   * translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getFormatConversionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. File format conversion map to be applied to all input files.
   * Map's key is the original mime_type. Map's value is the target mime_type of
   * translated documents.
   *
   * Supported file format conversion includes:
   * - `application/pdf` to
   *   `application/vnd.openxmlformats-officedocument.wordprocessingml.document`
   *
   * If nothing specified, output files will be in the same format as the
   * original file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; format_conversions = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getFormatConversionsOrThrow(
      java.lang.String key);
}
