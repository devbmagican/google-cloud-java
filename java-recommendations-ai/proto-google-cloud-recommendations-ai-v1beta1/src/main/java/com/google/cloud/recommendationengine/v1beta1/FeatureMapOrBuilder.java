/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/recommendationengine/v1beta1/common.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface FeatureMapOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.FeatureMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Categorical features that can take on one of a limited number of possible
   * values. Some examples would be the brand/maker of a product, or country of
   * a customer.
   * Feature names and values must be UTF-8 encoded strings.
   * For example: `{ "colors": {"value": ["yellow", "green"]},
   *                 "sizes": {"value":["S", "M"]}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.StringList&gt; categorical_features = 1;
   * </code>
   */
  int getCategoricalFeaturesCount();
  /**
   *
   *
   * <pre>
   * Categorical features that can take on one of a limited number of possible
   * values. Some examples would be the brand/maker of a product, or country of
   * a customer.
   * Feature names and values must be UTF-8 encoded strings.
   * For example: `{ "colors": {"value": ["yellow", "green"]},
   *                 "sizes": {"value":["S", "M"]}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.StringList&gt; categorical_features = 1;
   * </code>
   */
  boolean containsCategoricalFeatures(java.lang.String key);
  /** Use {@link #getCategoricalFeaturesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.recommendationengine.v1beta1.FeatureMap.StringList>
      getCategoricalFeatures();
  /**
   *
   *
   * <pre>
   * Categorical features that can take on one of a limited number of possible
   * values. Some examples would be the brand/maker of a product, or country of
   * a customer.
   * Feature names and values must be UTF-8 encoded strings.
   * For example: `{ "colors": {"value": ["yellow", "green"]},
   *                 "sizes": {"value":["S", "M"]}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.StringList&gt; categorical_features = 1;
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.recommendationengine.v1beta1.FeatureMap.StringList>
      getCategoricalFeaturesMap();
  /**
   *
   *
   * <pre>
   * Categorical features that can take on one of a limited number of possible
   * values. Some examples would be the brand/maker of a product, or country of
   * a customer.
   * Feature names and values must be UTF-8 encoded strings.
   * For example: `{ "colors": {"value": ["yellow", "green"]},
   *                 "sizes": {"value":["S", "M"]}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.StringList&gt; categorical_features = 1;
   * </code>
   */

  /* nullable */
  com.google.cloud.recommendationengine.v1beta1.FeatureMap.StringList
      getCategoricalFeaturesOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.recommendationengine.v1beta1.FeatureMap.StringList defaultValue);
  /**
   *
   *
   * <pre>
   * Categorical features that can take on one of a limited number of possible
   * values. Some examples would be the brand/maker of a product, or country of
   * a customer.
   * Feature names and values must be UTF-8 encoded strings.
   * For example: `{ "colors": {"value": ["yellow", "green"]},
   *                 "sizes": {"value":["S", "M"]}`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.StringList&gt; categorical_features = 1;
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.FeatureMap.StringList getCategoricalFeaturesOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Numerical features. Some examples would be the height/weight of a product,
   * or age of a customer.
   * Feature names must be UTF-8 encoded strings.
   * For example: `{ "lengths_cm": {"value":[2.3, 15.4]},
   *                 "heights_cm": {"value":[8.1, 6.4]} }`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList&gt; numerical_features = 2;
   * </code>
   */
  int getNumericalFeaturesCount();
  /**
   *
   *
   * <pre>
   * Numerical features. Some examples would be the height/weight of a product,
   * or age of a customer.
   * Feature names must be UTF-8 encoded strings.
   * For example: `{ "lengths_cm": {"value":[2.3, 15.4]},
   *                 "heights_cm": {"value":[8.1, 6.4]} }`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList&gt; numerical_features = 2;
   * </code>
   */
  boolean containsNumericalFeatures(java.lang.String key);
  /** Use {@link #getNumericalFeaturesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList>
      getNumericalFeatures();
  /**
   *
   *
   * <pre>
   * Numerical features. Some examples would be the height/weight of a product,
   * or age of a customer.
   * Feature names must be UTF-8 encoded strings.
   * For example: `{ "lengths_cm": {"value":[2.3, 15.4]},
   *                 "heights_cm": {"value":[8.1, 6.4]} }`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList&gt; numerical_features = 2;
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList>
      getNumericalFeaturesMap();
  /**
   *
   *
   * <pre>
   * Numerical features. Some examples would be the height/weight of a product,
   * or age of a customer.
   * Feature names must be UTF-8 encoded strings.
   * For example: `{ "lengths_cm": {"value":[2.3, 15.4]},
   *                 "heights_cm": {"value":[8.1, 6.4]} }`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList&gt; numerical_features = 2;
   * </code>
   */

  /* nullable */
  com.google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList getNumericalFeaturesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList defaultValue);
  /**
   *
   *
   * <pre>
   * Numerical features. Some examples would be the height/weight of a product,
   * or age of a customer.
   * Feature names must be UTF-8 encoded strings.
   * For example: `{ "lengths_cm": {"value":[2.3, 15.4]},
   *                 "heights_cm": {"value":[8.1, 6.4]} }`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList&gt; numerical_features = 2;
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.FeatureMap.FloatList getNumericalFeaturesOrThrow(
      java.lang.String key);
}
