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
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

/**
 *
 *
 * <pre>
 * Represents the enrollment of a cloud resource into a specific service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.accessapproval.v1.EnrolledService}
 */
public final class EnrolledService extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.EnrolledService)
    EnrolledServiceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnrolledService.newBuilder() to construct.
  private EnrolledService(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnrolledService() {
    cloudProduct_ = "";
    enrollmentLevel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnrolledService();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_EnrolledService_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_EnrolledService_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.EnrolledService.class,
            com.google.cloud.accessapproval.v1.EnrolledService.Builder.class);
  }

  public static final int CLOUD_PRODUCT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cloudProduct_ = "";
  /**
   *
   *
   * <pre>
   * The product for which Access Approval will be enrolled. Allowed values are
   * listed below (case-sensitive):
   *   * all
   *   * GA
   *   * App Engine
   *   * BigQuery
   *   * Cloud Bigtable
   *   * Cloud Key Management Service
   *   * Compute Engine
   *   * Cloud Dataflow
   *   * Cloud Dataproc
   *   * Cloud DLP
   *   * Cloud EKM
   *   * Cloud HSM
   *   * Cloud Identity and Access Management
   *   * Cloud Logging
   *   * Cloud Pub/Sub
   *   * Cloud Spanner
   *   * Cloud SQL
   *   * Cloud Storage
   *   * Google Kubernetes Engine
   *   * Organization Policy Serivice
   *   * Persistent Disk
   *   * Resource Manager
   *   * Secret Manager
   *   * Speaker ID
   * Note: These values are supported as input for legacy purposes, but will not
   * be returned from the API.
   *   * all
   *   * ga-only
   *   * appengine.googleapis.com
   *   * bigquery.googleapis.com
   *   * bigtable.googleapis.com
   *   * container.googleapis.com
   *   * cloudkms.googleapis.com
   *   * cloudresourcemanager.googleapis.com
   *   * cloudsql.googleapis.com
   *   * compute.googleapis.com
   *   * dataflow.googleapis.com
   *   * dataproc.googleapis.com
   *   * dlp.googleapis.com
   *   * iam.googleapis.com
   *   * logging.googleapis.com
   *   * orgpolicy.googleapis.com
   *   * pubsub.googleapis.com
   *   * spanner.googleapis.com
   *   * secretmanager.googleapis.com
   *   * speakerid.googleapis.com
   *   * storage.googleapis.com
   * Calls to UpdateAccessApprovalSettings using 'all' or any of the
   * XXX.googleapis.com will be translated to the associated product name
   * ('all', 'App Engine', etc.).
   * Note: 'all' will enroll the resource in all products supported at both 'GA'
   * and 'Preview' levels.
   * More information about levels of support is available at
   * https://cloud.google.com/access-approval/docs/supported-services
   * </pre>
   *
   * <code>string cloud_product = 1;</code>
   *
   * @return The cloudProduct.
   */
  @java.lang.Override
  public java.lang.String getCloudProduct() {
    java.lang.Object ref = cloudProduct_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cloudProduct_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The product for which Access Approval will be enrolled. Allowed values are
   * listed below (case-sensitive):
   *   * all
   *   * GA
   *   * App Engine
   *   * BigQuery
   *   * Cloud Bigtable
   *   * Cloud Key Management Service
   *   * Compute Engine
   *   * Cloud Dataflow
   *   * Cloud Dataproc
   *   * Cloud DLP
   *   * Cloud EKM
   *   * Cloud HSM
   *   * Cloud Identity and Access Management
   *   * Cloud Logging
   *   * Cloud Pub/Sub
   *   * Cloud Spanner
   *   * Cloud SQL
   *   * Cloud Storage
   *   * Google Kubernetes Engine
   *   * Organization Policy Serivice
   *   * Persistent Disk
   *   * Resource Manager
   *   * Secret Manager
   *   * Speaker ID
   * Note: These values are supported as input for legacy purposes, but will not
   * be returned from the API.
   *   * all
   *   * ga-only
   *   * appengine.googleapis.com
   *   * bigquery.googleapis.com
   *   * bigtable.googleapis.com
   *   * container.googleapis.com
   *   * cloudkms.googleapis.com
   *   * cloudresourcemanager.googleapis.com
   *   * cloudsql.googleapis.com
   *   * compute.googleapis.com
   *   * dataflow.googleapis.com
   *   * dataproc.googleapis.com
   *   * dlp.googleapis.com
   *   * iam.googleapis.com
   *   * logging.googleapis.com
   *   * orgpolicy.googleapis.com
   *   * pubsub.googleapis.com
   *   * spanner.googleapis.com
   *   * secretmanager.googleapis.com
   *   * speakerid.googleapis.com
   *   * storage.googleapis.com
   * Calls to UpdateAccessApprovalSettings using 'all' or any of the
   * XXX.googleapis.com will be translated to the associated product name
   * ('all', 'App Engine', etc.).
   * Note: 'all' will enroll the resource in all products supported at both 'GA'
   * and 'Preview' levels.
   * More information about levels of support is available at
   * https://cloud.google.com/access-approval/docs/supported-services
   * </pre>
   *
   * <code>string cloud_product = 1;</code>
   *
   * @return The bytes for cloudProduct.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCloudProductBytes() {
    java.lang.Object ref = cloudProduct_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cloudProduct_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENROLLMENT_LEVEL_FIELD_NUMBER = 2;
  private int enrollmentLevel_ = 0;
  /**
   *
   *
   * <pre>
   * The enrollment level of the service.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
   *
   * @return The enum numeric value on the wire for enrollmentLevel.
   */
  @java.lang.Override
  public int getEnrollmentLevelValue() {
    return enrollmentLevel_;
  }
  /**
   *
   *
   * <pre>
   * The enrollment level of the service.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
   *
   * @return The enrollmentLevel.
   */
  @java.lang.Override
  public com.google.cloud.accessapproval.v1.EnrollmentLevel getEnrollmentLevel() {
    com.google.cloud.accessapproval.v1.EnrollmentLevel result =
        com.google.cloud.accessapproval.v1.EnrollmentLevel.forNumber(enrollmentLevel_);
    return result == null
        ? com.google.cloud.accessapproval.v1.EnrollmentLevel.UNRECOGNIZED
        : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudProduct_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cloudProduct_);
    }
    if (enrollmentLevel_
        != com.google.cloud.accessapproval.v1.EnrollmentLevel.ENROLLMENT_LEVEL_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, enrollmentLevel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cloudProduct_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cloudProduct_);
    }
    if (enrollmentLevel_
        != com.google.cloud.accessapproval.v1.EnrollmentLevel.ENROLLMENT_LEVEL_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, enrollmentLevel_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.accessapproval.v1.EnrolledService)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.EnrolledService other =
        (com.google.cloud.accessapproval.v1.EnrolledService) obj;

    if (!getCloudProduct().equals(other.getCloudProduct())) return false;
    if (enrollmentLevel_ != other.enrollmentLevel_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLOUD_PRODUCT_FIELD_NUMBER;
    hash = (53 * hash) + getCloudProduct().hashCode();
    hash = (37 * hash) + ENROLLMENT_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + enrollmentLevel_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.accessapproval.v1.EnrolledService prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Represents the enrollment of a cloud resource into a specific service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.accessapproval.v1.EnrolledService}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.EnrolledService)
      com.google.cloud.accessapproval.v1.EnrolledServiceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_EnrolledService_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_EnrolledService_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.EnrolledService.class,
              com.google.cloud.accessapproval.v1.EnrolledService.Builder.class);
    }

    // Construct using com.google.cloud.accessapproval.v1.EnrolledService.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cloudProduct_ = "";
      enrollmentLevel_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_EnrolledService_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.EnrolledService getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.EnrolledService.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.EnrolledService build() {
      com.google.cloud.accessapproval.v1.EnrolledService result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.EnrolledService buildPartial() {
      com.google.cloud.accessapproval.v1.EnrolledService result =
          new com.google.cloud.accessapproval.v1.EnrolledService(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.accessapproval.v1.EnrolledService result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cloudProduct_ = cloudProduct_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enrollmentLevel_ = enrollmentLevel_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.accessapproval.v1.EnrolledService) {
        return mergeFrom((com.google.cloud.accessapproval.v1.EnrolledService) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.accessapproval.v1.EnrolledService other) {
      if (other == com.google.cloud.accessapproval.v1.EnrolledService.getDefaultInstance())
        return this;
      if (!other.getCloudProduct().isEmpty()) {
        cloudProduct_ = other.cloudProduct_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.enrollmentLevel_ != 0) {
        setEnrollmentLevelValue(other.getEnrollmentLevelValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                cloudProduct_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                enrollmentLevel_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object cloudProduct_ = "";
    /**
     *
     *
     * <pre>
     * The product for which Access Approval will be enrolled. Allowed values are
     * listed below (case-sensitive):
     *   * all
     *   * GA
     *   * App Engine
     *   * BigQuery
     *   * Cloud Bigtable
     *   * Cloud Key Management Service
     *   * Compute Engine
     *   * Cloud Dataflow
     *   * Cloud Dataproc
     *   * Cloud DLP
     *   * Cloud EKM
     *   * Cloud HSM
     *   * Cloud Identity and Access Management
     *   * Cloud Logging
     *   * Cloud Pub/Sub
     *   * Cloud Spanner
     *   * Cloud SQL
     *   * Cloud Storage
     *   * Google Kubernetes Engine
     *   * Organization Policy Serivice
     *   * Persistent Disk
     *   * Resource Manager
     *   * Secret Manager
     *   * Speaker ID
     * Note: These values are supported as input for legacy purposes, but will not
     * be returned from the API.
     *   * all
     *   * ga-only
     *   * appengine.googleapis.com
     *   * bigquery.googleapis.com
     *   * bigtable.googleapis.com
     *   * container.googleapis.com
     *   * cloudkms.googleapis.com
     *   * cloudresourcemanager.googleapis.com
     *   * cloudsql.googleapis.com
     *   * compute.googleapis.com
     *   * dataflow.googleapis.com
     *   * dataproc.googleapis.com
     *   * dlp.googleapis.com
     *   * iam.googleapis.com
     *   * logging.googleapis.com
     *   * orgpolicy.googleapis.com
     *   * pubsub.googleapis.com
     *   * spanner.googleapis.com
     *   * secretmanager.googleapis.com
     *   * speakerid.googleapis.com
     *   * storage.googleapis.com
     * Calls to UpdateAccessApprovalSettings using 'all' or any of the
     * XXX.googleapis.com will be translated to the associated product name
     * ('all', 'App Engine', etc.).
     * Note: 'all' will enroll the resource in all products supported at both 'GA'
     * and 'Preview' levels.
     * More information about levels of support is available at
     * https://cloud.google.com/access-approval/docs/supported-services
     * </pre>
     *
     * <code>string cloud_product = 1;</code>
     *
     * @return The cloudProduct.
     */
    public java.lang.String getCloudProduct() {
      java.lang.Object ref = cloudProduct_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cloudProduct_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The product for which Access Approval will be enrolled. Allowed values are
     * listed below (case-sensitive):
     *   * all
     *   * GA
     *   * App Engine
     *   * BigQuery
     *   * Cloud Bigtable
     *   * Cloud Key Management Service
     *   * Compute Engine
     *   * Cloud Dataflow
     *   * Cloud Dataproc
     *   * Cloud DLP
     *   * Cloud EKM
     *   * Cloud HSM
     *   * Cloud Identity and Access Management
     *   * Cloud Logging
     *   * Cloud Pub/Sub
     *   * Cloud Spanner
     *   * Cloud SQL
     *   * Cloud Storage
     *   * Google Kubernetes Engine
     *   * Organization Policy Serivice
     *   * Persistent Disk
     *   * Resource Manager
     *   * Secret Manager
     *   * Speaker ID
     * Note: These values are supported as input for legacy purposes, but will not
     * be returned from the API.
     *   * all
     *   * ga-only
     *   * appengine.googleapis.com
     *   * bigquery.googleapis.com
     *   * bigtable.googleapis.com
     *   * container.googleapis.com
     *   * cloudkms.googleapis.com
     *   * cloudresourcemanager.googleapis.com
     *   * cloudsql.googleapis.com
     *   * compute.googleapis.com
     *   * dataflow.googleapis.com
     *   * dataproc.googleapis.com
     *   * dlp.googleapis.com
     *   * iam.googleapis.com
     *   * logging.googleapis.com
     *   * orgpolicy.googleapis.com
     *   * pubsub.googleapis.com
     *   * spanner.googleapis.com
     *   * secretmanager.googleapis.com
     *   * speakerid.googleapis.com
     *   * storage.googleapis.com
     * Calls to UpdateAccessApprovalSettings using 'all' or any of the
     * XXX.googleapis.com will be translated to the associated product name
     * ('all', 'App Engine', etc.).
     * Note: 'all' will enroll the resource in all products supported at both 'GA'
     * and 'Preview' levels.
     * More information about levels of support is available at
     * https://cloud.google.com/access-approval/docs/supported-services
     * </pre>
     *
     * <code>string cloud_product = 1;</code>
     *
     * @return The bytes for cloudProduct.
     */
    public com.google.protobuf.ByteString getCloudProductBytes() {
      java.lang.Object ref = cloudProduct_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cloudProduct_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The product for which Access Approval will be enrolled. Allowed values are
     * listed below (case-sensitive):
     *   * all
     *   * GA
     *   * App Engine
     *   * BigQuery
     *   * Cloud Bigtable
     *   * Cloud Key Management Service
     *   * Compute Engine
     *   * Cloud Dataflow
     *   * Cloud Dataproc
     *   * Cloud DLP
     *   * Cloud EKM
     *   * Cloud HSM
     *   * Cloud Identity and Access Management
     *   * Cloud Logging
     *   * Cloud Pub/Sub
     *   * Cloud Spanner
     *   * Cloud SQL
     *   * Cloud Storage
     *   * Google Kubernetes Engine
     *   * Organization Policy Serivice
     *   * Persistent Disk
     *   * Resource Manager
     *   * Secret Manager
     *   * Speaker ID
     * Note: These values are supported as input for legacy purposes, but will not
     * be returned from the API.
     *   * all
     *   * ga-only
     *   * appengine.googleapis.com
     *   * bigquery.googleapis.com
     *   * bigtable.googleapis.com
     *   * container.googleapis.com
     *   * cloudkms.googleapis.com
     *   * cloudresourcemanager.googleapis.com
     *   * cloudsql.googleapis.com
     *   * compute.googleapis.com
     *   * dataflow.googleapis.com
     *   * dataproc.googleapis.com
     *   * dlp.googleapis.com
     *   * iam.googleapis.com
     *   * logging.googleapis.com
     *   * orgpolicy.googleapis.com
     *   * pubsub.googleapis.com
     *   * spanner.googleapis.com
     *   * secretmanager.googleapis.com
     *   * speakerid.googleapis.com
     *   * storage.googleapis.com
     * Calls to UpdateAccessApprovalSettings using 'all' or any of the
     * XXX.googleapis.com will be translated to the associated product name
     * ('all', 'App Engine', etc.).
     * Note: 'all' will enroll the resource in all products supported at both 'GA'
     * and 'Preview' levels.
     * More information about levels of support is available at
     * https://cloud.google.com/access-approval/docs/supported-services
     * </pre>
     *
     * <code>string cloud_product = 1;</code>
     *
     * @param value The cloudProduct to set.
     * @return This builder for chaining.
     */
    public Builder setCloudProduct(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cloudProduct_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The product for which Access Approval will be enrolled. Allowed values are
     * listed below (case-sensitive):
     *   * all
     *   * GA
     *   * App Engine
     *   * BigQuery
     *   * Cloud Bigtable
     *   * Cloud Key Management Service
     *   * Compute Engine
     *   * Cloud Dataflow
     *   * Cloud Dataproc
     *   * Cloud DLP
     *   * Cloud EKM
     *   * Cloud HSM
     *   * Cloud Identity and Access Management
     *   * Cloud Logging
     *   * Cloud Pub/Sub
     *   * Cloud Spanner
     *   * Cloud SQL
     *   * Cloud Storage
     *   * Google Kubernetes Engine
     *   * Organization Policy Serivice
     *   * Persistent Disk
     *   * Resource Manager
     *   * Secret Manager
     *   * Speaker ID
     * Note: These values are supported as input for legacy purposes, but will not
     * be returned from the API.
     *   * all
     *   * ga-only
     *   * appengine.googleapis.com
     *   * bigquery.googleapis.com
     *   * bigtable.googleapis.com
     *   * container.googleapis.com
     *   * cloudkms.googleapis.com
     *   * cloudresourcemanager.googleapis.com
     *   * cloudsql.googleapis.com
     *   * compute.googleapis.com
     *   * dataflow.googleapis.com
     *   * dataproc.googleapis.com
     *   * dlp.googleapis.com
     *   * iam.googleapis.com
     *   * logging.googleapis.com
     *   * orgpolicy.googleapis.com
     *   * pubsub.googleapis.com
     *   * spanner.googleapis.com
     *   * secretmanager.googleapis.com
     *   * speakerid.googleapis.com
     *   * storage.googleapis.com
     * Calls to UpdateAccessApprovalSettings using 'all' or any of the
     * XXX.googleapis.com will be translated to the associated product name
     * ('all', 'App Engine', etc.).
     * Note: 'all' will enroll the resource in all products supported at both 'GA'
     * and 'Preview' levels.
     * More information about levels of support is available at
     * https://cloud.google.com/access-approval/docs/supported-services
     * </pre>
     *
     * <code>string cloud_product = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCloudProduct() {
      cloudProduct_ = getDefaultInstance().getCloudProduct();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The product for which Access Approval will be enrolled. Allowed values are
     * listed below (case-sensitive):
     *   * all
     *   * GA
     *   * App Engine
     *   * BigQuery
     *   * Cloud Bigtable
     *   * Cloud Key Management Service
     *   * Compute Engine
     *   * Cloud Dataflow
     *   * Cloud Dataproc
     *   * Cloud DLP
     *   * Cloud EKM
     *   * Cloud HSM
     *   * Cloud Identity and Access Management
     *   * Cloud Logging
     *   * Cloud Pub/Sub
     *   * Cloud Spanner
     *   * Cloud SQL
     *   * Cloud Storage
     *   * Google Kubernetes Engine
     *   * Organization Policy Serivice
     *   * Persistent Disk
     *   * Resource Manager
     *   * Secret Manager
     *   * Speaker ID
     * Note: These values are supported as input for legacy purposes, but will not
     * be returned from the API.
     *   * all
     *   * ga-only
     *   * appengine.googleapis.com
     *   * bigquery.googleapis.com
     *   * bigtable.googleapis.com
     *   * container.googleapis.com
     *   * cloudkms.googleapis.com
     *   * cloudresourcemanager.googleapis.com
     *   * cloudsql.googleapis.com
     *   * compute.googleapis.com
     *   * dataflow.googleapis.com
     *   * dataproc.googleapis.com
     *   * dlp.googleapis.com
     *   * iam.googleapis.com
     *   * logging.googleapis.com
     *   * orgpolicy.googleapis.com
     *   * pubsub.googleapis.com
     *   * spanner.googleapis.com
     *   * secretmanager.googleapis.com
     *   * speakerid.googleapis.com
     *   * storage.googleapis.com
     * Calls to UpdateAccessApprovalSettings using 'all' or any of the
     * XXX.googleapis.com will be translated to the associated product name
     * ('all', 'App Engine', etc.).
     * Note: 'all' will enroll the resource in all products supported at both 'GA'
     * and 'Preview' levels.
     * More information about levels of support is available at
     * https://cloud.google.com/access-approval/docs/supported-services
     * </pre>
     *
     * <code>string cloud_product = 1;</code>
     *
     * @param value The bytes for cloudProduct to set.
     * @return This builder for chaining.
     */
    public Builder setCloudProductBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cloudProduct_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int enrollmentLevel_ = 0;
    /**
     *
     *
     * <pre>
     * The enrollment level of the service.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
     *
     * @return The enum numeric value on the wire for enrollmentLevel.
     */
    @java.lang.Override
    public int getEnrollmentLevelValue() {
      return enrollmentLevel_;
    }
    /**
     *
     *
     * <pre>
     * The enrollment level of the service.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
     *
     * @param value The enum numeric value on the wire for enrollmentLevel to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentLevelValue(int value) {
      enrollmentLevel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The enrollment level of the service.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
     *
     * @return The enrollmentLevel.
     */
    @java.lang.Override
    public com.google.cloud.accessapproval.v1.EnrollmentLevel getEnrollmentLevel() {
      com.google.cloud.accessapproval.v1.EnrollmentLevel result =
          com.google.cloud.accessapproval.v1.EnrollmentLevel.forNumber(enrollmentLevel_);
      return result == null
          ? com.google.cloud.accessapproval.v1.EnrollmentLevel.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The enrollment level of the service.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
     *
     * @param value The enrollmentLevel to set.
     * @return This builder for chaining.
     */
    public Builder setEnrollmentLevel(com.google.cloud.accessapproval.v1.EnrollmentLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      enrollmentLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The enrollment level of the service.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnrollmentLevel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enrollmentLevel_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.EnrolledService)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.EnrolledService)
  private static final com.google.cloud.accessapproval.v1.EnrolledService DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.EnrolledService();
  }

  public static com.google.cloud.accessapproval.v1.EnrolledService getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnrolledService> PARSER =
      new com.google.protobuf.AbstractParser<EnrolledService>() {
        @java.lang.Override
        public EnrolledService parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<EnrolledService> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnrolledService> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.EnrolledService getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
