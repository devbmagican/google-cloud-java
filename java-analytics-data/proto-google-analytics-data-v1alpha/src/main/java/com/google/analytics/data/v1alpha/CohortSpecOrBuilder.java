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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface CohortSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.CohortSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The definition for the cohorts.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.Cohort> getCohortsList();
  /**
   *
   *
   * <pre>
   * The definition for the cohorts.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  com.google.analytics.data.v1alpha.Cohort getCohorts(int index);
  /**
   *
   *
   * <pre>
   * The definition for the cohorts.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  int getCohortsCount();
  /**
   *
   *
   * <pre>
   * The definition for the cohorts.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.CohortOrBuilder>
      getCohortsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The definition for the cohorts.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.Cohort cohorts = 1;</code>
   */
  com.google.analytics.data.v1alpha.CohortOrBuilder getCohortsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The data ranges of cohorts.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
   *
   * @return Whether the cohortsRange field is set.
   */
  boolean hasCohortsRange();
  /**
   *
   *
   * <pre>
   * The data ranges of cohorts.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
   *
   * @return The cohortsRange.
   */
  com.google.analytics.data.v1alpha.CohortsRange getCohortsRange();
  /**
   *
   *
   * <pre>
   * The data ranges of cohorts.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortsRange cohorts_range = 2;</code>
   */
  com.google.analytics.data.v1alpha.CohortsRangeOrBuilder getCohortsRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings of a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
   *
   * @return Whether the cohortReportSettings field is set.
   */
  boolean hasCohortReportSettings();
  /**
   *
   *
   * <pre>
   * Settings of a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
   *
   * @return The cohortReportSettings.
   */
  com.google.analytics.data.v1alpha.CohortReportSettings getCohortReportSettings();
  /**
   *
   *
   * <pre>
   * Settings of a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.CohortReportSettings cohort_report_settings = 3;</code>
   */
  com.google.analytics.data.v1alpha.CohortReportSettingsOrBuilder
      getCohortReportSettingsOrBuilder();
}
