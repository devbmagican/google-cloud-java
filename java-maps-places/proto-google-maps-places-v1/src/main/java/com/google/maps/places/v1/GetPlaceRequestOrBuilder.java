/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/places/v1/places_service.proto

package com.google.maps.places.v1;

public interface GetPlaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.GetPlaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A place_id returned in a Place (with "places/" prefix), or
   * equivalently the name in the same Place. Format: places/&lt;place_id&gt;.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. A place_id returned in a Place (with "places/" prefix), or
   * equivalently the name in the same Place. Format: places/&lt;place_id&gt;.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Place details will be displayed with the preferred language if
   * available.
   *
   * Current list of supported languages:
   * https://developers.google.com/maps/faq#languagesupport.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. Place details will be displayed with the preferred language if
   * available.
   *
   * Current list of supported languages:
   * https://developers.google.com/maps/faq#languagesupport.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Unicode country/region code (CLDR) of the location where the
   * request is coming from. This parameter is used to display the place
   * details, like region-specific place name, if available. The parameter can
   * affect results based on applicable law.
   * For more information, see
   * http://www.unicode.org/reports/tr35/#unicode_region_subtag.
   *
   *
   * Note that 3-digit region codes are not currently supported.
   * </pre>
   *
   * <code>string region_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();
  /**
   *
   *
   * <pre>
   * Optional. The Unicode country/region code (CLDR) of the location where the
   * request is coming from. This parameter is used to display the place
   * details, like region-specific place name, if available. The parameter can
   * affect results based on applicable law.
   * For more information, see
   * http://www.unicode.org/reports/tr35/#unicode_region_subtag.
   *
   *
   * Note that 3-digit region codes are not currently supported.
   * </pre>
   *
   * <code>string region_code = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();
}
