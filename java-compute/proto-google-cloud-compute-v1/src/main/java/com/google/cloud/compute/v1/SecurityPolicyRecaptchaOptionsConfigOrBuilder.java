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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SecurityPolicyRecaptchaOptionsConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyRecaptchaOptionsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional string redirect_site_key = 447677034;</code>
   *
   * @return Whether the redirectSiteKey field is set.
   */
  boolean hasRedirectSiteKey();
  /**
   *
   *
   * <pre>
   * An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional string redirect_site_key = 447677034;</code>
   *
   * @return The redirectSiteKey.
   */
  java.lang.String getRedirectSiteKey();
  /**
   *
   *
   * <pre>
   * An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional string redirect_site_key = 447677034;</code>
   *
   * @return The bytes for redirectSiteKey.
   */
  com.google.protobuf.ByteString getRedirectSiteKeyBytes();
}
