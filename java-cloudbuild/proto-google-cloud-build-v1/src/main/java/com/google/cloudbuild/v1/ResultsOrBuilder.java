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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface ResultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.Results)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Container images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  java.util.List<com.google.cloudbuild.v1.BuiltImage> getImagesList();
  /**
   *
   *
   * <pre>
   * Container images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  com.google.cloudbuild.v1.BuiltImage getImages(int index);
  /**
   *
   *
   * <pre>
   * Container images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  int getImagesCount();
  /**
   *
   *
   * <pre>
   * Container images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.BuiltImageOrBuilder> getImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Container images that were built as a part of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuiltImage images = 2;</code>
   */
  com.google.cloudbuild.v1.BuiltImageOrBuilder getImagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of build step digests, in the order corresponding to build step
   * indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   *
   * @return A list containing the buildStepImages.
   */
  java.util.List<java.lang.String> getBuildStepImagesList();
  /**
   *
   *
   * <pre>
   * List of build step digests, in the order corresponding to build step
   * indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   *
   * @return The count of buildStepImages.
   */
  int getBuildStepImagesCount();
  /**
   *
   *
   * <pre>
   * List of build step digests, in the order corresponding to build step
   * indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The buildStepImages at the given index.
   */
  java.lang.String getBuildStepImages(int index);
  /**
   *
   *
   * <pre>
   * List of build step digests, in the order corresponding to build step
   * indices.
   * </pre>
   *
   * <code>repeated string build_step_images = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the buildStepImages at the given index.
   */
  com.google.protobuf.ByteString getBuildStepImagesBytes(int index);

  /**
   *
   *
   * <pre>
   * Path to the artifact manifest. Only populated when artifacts are uploaded.
   * </pre>
   *
   * <code>string artifact_manifest = 4;</code>
   *
   * @return The artifactManifest.
   */
  java.lang.String getArtifactManifest();
  /**
   *
   *
   * <pre>
   * Path to the artifact manifest. Only populated when artifacts are uploaded.
   * </pre>
   *
   * <code>string artifact_manifest = 4;</code>
   *
   * @return The bytes for artifactManifest.
   */
  com.google.protobuf.ByteString getArtifactManifestBytes();

  /**
   *
   *
   * <pre>
   * Number of artifacts uploaded. Only populated when artifacts are uploaded.
   * </pre>
   *
   * <code>int64 num_artifacts = 5;</code>
   *
   * @return The numArtifacts.
   */
  long getNumArtifacts();

  /**
   *
   *
   * <pre>
   * List of build step outputs, produced by builder images, in the order
   * corresponding to build step indices.
   * [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders)
   * can produce this output by writing to `$BUILDER_OUTPUT/output`.
   * Only the first 4KB of data is stored.
   * </pre>
   *
   * <code>repeated bytes build_step_outputs = 6;</code>
   *
   * @return A list containing the buildStepOutputs.
   */
  java.util.List<com.google.protobuf.ByteString> getBuildStepOutputsList();
  /**
   *
   *
   * <pre>
   * List of build step outputs, produced by builder images, in the order
   * corresponding to build step indices.
   * [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders)
   * can produce this output by writing to `$BUILDER_OUTPUT/output`.
   * Only the first 4KB of data is stored.
   * </pre>
   *
   * <code>repeated bytes build_step_outputs = 6;</code>
   *
   * @return The count of buildStepOutputs.
   */
  int getBuildStepOutputsCount();
  /**
   *
   *
   * <pre>
   * List of build step outputs, produced by builder images, in the order
   * corresponding to build step indices.
   * [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders)
   * can produce this output by writing to `$BUILDER_OUTPUT/output`.
   * Only the first 4KB of data is stored.
   * </pre>
   *
   * <code>repeated bytes build_step_outputs = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The buildStepOutputs at the given index.
   */
  com.google.protobuf.ByteString getBuildStepOutputs(int index);

  /**
   *
   *
   * <pre>
   * Time to push all non-container artifacts.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.TimeSpan artifact_timing = 7;</code>
   *
   * @return Whether the artifactTiming field is set.
   */
  boolean hasArtifactTiming();
  /**
   *
   *
   * <pre>
   * Time to push all non-container artifacts.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.TimeSpan artifact_timing = 7;</code>
   *
   * @return The artifactTiming.
   */
  com.google.cloudbuild.v1.TimeSpan getArtifactTiming();
  /**
   *
   *
   * <pre>
   * Time to push all non-container artifacts.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.TimeSpan artifact_timing = 7;</code>
   */
  com.google.cloudbuild.v1.TimeSpanOrBuilder getArtifactTimingOrBuilder();

  /**
   *
   *
   * <pre>
   * Python artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedPythonPackage python_packages = 8;</code>
   */
  java.util.List<com.google.cloudbuild.v1.UploadedPythonPackage> getPythonPackagesList();
  /**
   *
   *
   * <pre>
   * Python artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedPythonPackage python_packages = 8;</code>
   */
  com.google.cloudbuild.v1.UploadedPythonPackage getPythonPackages(int index);
  /**
   *
   *
   * <pre>
   * Python artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedPythonPackage python_packages = 8;</code>
   */
  int getPythonPackagesCount();
  /**
   *
   *
   * <pre>
   * Python artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedPythonPackage python_packages = 8;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.UploadedPythonPackageOrBuilder>
      getPythonPackagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Python artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedPythonPackage python_packages = 8;</code>
   */
  com.google.cloudbuild.v1.UploadedPythonPackageOrBuilder getPythonPackagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Maven artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedMavenArtifact maven_artifacts = 9;</code>
   */
  java.util.List<com.google.cloudbuild.v1.UploadedMavenArtifact> getMavenArtifactsList();
  /**
   *
   *
   * <pre>
   * Maven artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedMavenArtifact maven_artifacts = 9;</code>
   */
  com.google.cloudbuild.v1.UploadedMavenArtifact getMavenArtifacts(int index);
  /**
   *
   *
   * <pre>
   * Maven artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedMavenArtifact maven_artifacts = 9;</code>
   */
  int getMavenArtifactsCount();
  /**
   *
   *
   * <pre>
   * Maven artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedMavenArtifact maven_artifacts = 9;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.UploadedMavenArtifactOrBuilder>
      getMavenArtifactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Maven artifacts uploaded to Artifact Registry at the end of the build.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.UploadedMavenArtifact maven_artifacts = 9;</code>
   */
  com.google.cloudbuild.v1.UploadedMavenArtifactOrBuilder getMavenArtifactsOrBuilder(int index);
}
