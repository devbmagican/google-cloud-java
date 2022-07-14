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
// source: google/cloud/gaming/v1/game_server_clusters.proto

package com.google.cloud.gaming.v1;

/**
 *
 *
 * <pre>
 * The game server cluster connection information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1.GameServerClusterConnectionInfo}
 */
public final class GameServerClusterConnectionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1.GameServerClusterConnectionInfo)
    GameServerClusterConnectionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GameServerClusterConnectionInfo.newBuilder() to construct.
  private GameServerClusterConnectionInfo(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GameServerClusterConnectionInfo() {
    namespace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GameServerClusterConnectionInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GameServerClusterConnectionInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              namespace_ = s;
              break;
            }
          case 58:
            {
              com.google.cloud.gaming.v1.GkeClusterReference.Builder subBuilder = null;
              if (clusterReferenceCase_ == 7) {
                subBuilder =
                    ((com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_)
                        .toBuilder();
              }
              clusterReference_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1.GkeClusterReference.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(
                    (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_);
                clusterReference_ = subBuilder.buildPartial();
              }
              clusterReferenceCase_ = 7;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1.GameServerClusters
        .internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1.GameServerClusters
        .internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1.GameServerClusterConnectionInfo.class,
            com.google.cloud.gaming.v1.GameServerClusterConnectionInfo.Builder.class);
  }

  private int clusterReferenceCase_ = 0;
  private java.lang.Object clusterReference_;

  public enum ClusterReferenceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GKE_CLUSTER_REFERENCE(7),
    CLUSTERREFERENCE_NOT_SET(0);
    private final int value;

    private ClusterReferenceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ClusterReferenceCase valueOf(int value) {
      return forNumber(value);
    }

    public static ClusterReferenceCase forNumber(int value) {
      switch (value) {
        case 7:
          return GKE_CLUSTER_REFERENCE;
        case 0:
          return CLUSTERREFERENCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ClusterReferenceCase getClusterReferenceCase() {
    return ClusterReferenceCase.forNumber(clusterReferenceCase_);
  }

  public static final int GKE_CLUSTER_REFERENCE_FIELD_NUMBER = 7;
  /**
   *
   *
   * <pre>
   * Reference to the GKE cluster where the game servers are installed.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
   *
   * @return Whether the gkeClusterReference field is set.
   */
  @java.lang.Override
  public boolean hasGkeClusterReference() {
    return clusterReferenceCase_ == 7;
  }
  /**
   *
   *
   * <pre>
   * Reference to the GKE cluster where the game servers are installed.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
   *
   * @return The gkeClusterReference.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.GkeClusterReference getGkeClusterReference() {
    if (clusterReferenceCase_ == 7) {
      return (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_;
    }
    return com.google.cloud.gaming.v1.GkeClusterReference.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Reference to the GKE cluster where the game servers are installed.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.GkeClusterReferenceOrBuilder getGkeClusterReferenceOrBuilder() {
    if (clusterReferenceCase_ == 7) {
      return (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_;
    }
    return com.google.cloud.gaming.v1.GkeClusterReference.getDefaultInstance();
  }

  public static final int NAMESPACE_FIELD_NUMBER = 5;
  private volatile java.lang.Object namespace_;
  /**
   *
   *
   * <pre>
   * Namespace designated on the game server cluster where the Agones game
   * server instances will be created. Existence of the namespace will be
   * validated during creation.
   * </pre>
   *
   * <code>string namespace = 5;</code>
   *
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Namespace designated on the game server cluster where the Agones game
   * server instances will be created. Existence of the namespace will be
   * validated during creation.
   * </pre>
   *
   * <code>string namespace = 5;</code>
   *
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, namespace_);
    }
    if (clusterReferenceCase_ == 7) {
      output.writeMessage(7, (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, namespace_);
    }
    if (clusterReferenceCase_ == 7) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              7, (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.gaming.v1.GameServerClusterConnectionInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1.GameServerClusterConnectionInfo other =
        (com.google.cloud.gaming.v1.GameServerClusterConnectionInfo) obj;

    if (!getNamespace().equals(other.getNamespace())) return false;
    if (!getClusterReferenceCase().equals(other.getClusterReferenceCase())) return false;
    switch (clusterReferenceCase_) {
      case 7:
        if (!getGkeClusterReference().equals(other.getGkeClusterReference())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    switch (clusterReferenceCase_) {
      case 7:
        hash = (37 * hash) + GKE_CLUSTER_REFERENCE_FIELD_NUMBER;
        hash = (53 * hash) + getGkeClusterReference().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.gaming.v1.GameServerClusterConnectionInfo prototype) {
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
   * The game server cluster connection information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1.GameServerClusterConnectionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1.GameServerClusterConnectionInfo)
      com.google.cloud.gaming.v1.GameServerClusterConnectionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1.GameServerClusterConnectionInfo.class,
              com.google.cloud.gaming.v1.GameServerClusterConnectionInfo.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1.GameServerClusterConnectionInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      namespace_ = "";

      clusterReferenceCase_ = 0;
      clusterReference_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_GameServerClusterConnectionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.GameServerClusterConnectionInfo getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1.GameServerClusterConnectionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.GameServerClusterConnectionInfo build() {
      com.google.cloud.gaming.v1.GameServerClusterConnectionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.GameServerClusterConnectionInfo buildPartial() {
      com.google.cloud.gaming.v1.GameServerClusterConnectionInfo result =
          new com.google.cloud.gaming.v1.GameServerClusterConnectionInfo(this);
      if (clusterReferenceCase_ == 7) {
        if (gkeClusterReferenceBuilder_ == null) {
          result.clusterReference_ = clusterReference_;
        } else {
          result.clusterReference_ = gkeClusterReferenceBuilder_.build();
        }
      }
      result.namespace_ = namespace_;
      result.clusterReferenceCase_ = clusterReferenceCase_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.gaming.v1.GameServerClusterConnectionInfo) {
        return mergeFrom((com.google.cloud.gaming.v1.GameServerClusterConnectionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1.GameServerClusterConnectionInfo other) {
      if (other == com.google.cloud.gaming.v1.GameServerClusterConnectionInfo.getDefaultInstance())
        return this;
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        onChanged();
      }
      switch (other.getClusterReferenceCase()) {
        case GKE_CLUSTER_REFERENCE:
          {
            mergeGkeClusterReference(other.getGkeClusterReference());
            break;
          }
        case CLUSTERREFERENCE_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.gaming.v1.GameServerClusterConnectionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1.GameServerClusterConnectionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int clusterReferenceCase_ = 0;
    private java.lang.Object clusterReference_;

    public ClusterReferenceCase getClusterReferenceCase() {
      return ClusterReferenceCase.forNumber(clusterReferenceCase_);
    }

    public Builder clearClusterReference() {
      clusterReferenceCase_ = 0;
      clusterReference_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1.GkeClusterReference,
            com.google.cloud.gaming.v1.GkeClusterReference.Builder,
            com.google.cloud.gaming.v1.GkeClusterReferenceOrBuilder>
        gkeClusterReferenceBuilder_;
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     *
     * @return Whether the gkeClusterReference field is set.
     */
    @java.lang.Override
    public boolean hasGkeClusterReference() {
      return clusterReferenceCase_ == 7;
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     *
     * @return The gkeClusterReference.
     */
    @java.lang.Override
    public com.google.cloud.gaming.v1.GkeClusterReference getGkeClusterReference() {
      if (gkeClusterReferenceBuilder_ == null) {
        if (clusterReferenceCase_ == 7) {
          return (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_;
        }
        return com.google.cloud.gaming.v1.GkeClusterReference.getDefaultInstance();
      } else {
        if (clusterReferenceCase_ == 7) {
          return gkeClusterReferenceBuilder_.getMessage();
        }
        return com.google.cloud.gaming.v1.GkeClusterReference.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     */
    public Builder setGkeClusterReference(com.google.cloud.gaming.v1.GkeClusterReference value) {
      if (gkeClusterReferenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clusterReference_ = value;
        onChanged();
      } else {
        gkeClusterReferenceBuilder_.setMessage(value);
      }
      clusterReferenceCase_ = 7;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     */
    public Builder setGkeClusterReference(
        com.google.cloud.gaming.v1.GkeClusterReference.Builder builderForValue) {
      if (gkeClusterReferenceBuilder_ == null) {
        clusterReference_ = builderForValue.build();
        onChanged();
      } else {
        gkeClusterReferenceBuilder_.setMessage(builderForValue.build());
      }
      clusterReferenceCase_ = 7;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     */
    public Builder mergeGkeClusterReference(com.google.cloud.gaming.v1.GkeClusterReference value) {
      if (gkeClusterReferenceBuilder_ == null) {
        if (clusterReferenceCase_ == 7
            && clusterReference_
                != com.google.cloud.gaming.v1.GkeClusterReference.getDefaultInstance()) {
          clusterReference_ =
              com.google.cloud.gaming.v1.GkeClusterReference.newBuilder(
                      (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          clusterReference_ = value;
        }
        onChanged();
      } else {
        if (clusterReferenceCase_ == 7) {
          gkeClusterReferenceBuilder_.mergeFrom(value);
        } else {
          gkeClusterReferenceBuilder_.setMessage(value);
        }
      }
      clusterReferenceCase_ = 7;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     */
    public Builder clearGkeClusterReference() {
      if (gkeClusterReferenceBuilder_ == null) {
        if (clusterReferenceCase_ == 7) {
          clusterReferenceCase_ = 0;
          clusterReference_ = null;
          onChanged();
        }
      } else {
        if (clusterReferenceCase_ == 7) {
          clusterReferenceCase_ = 0;
          clusterReference_ = null;
        }
        gkeClusterReferenceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     */
    public com.google.cloud.gaming.v1.GkeClusterReference.Builder getGkeClusterReferenceBuilder() {
      return getGkeClusterReferenceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     */
    @java.lang.Override
    public com.google.cloud.gaming.v1.GkeClusterReferenceOrBuilder
        getGkeClusterReferenceOrBuilder() {
      if ((clusterReferenceCase_ == 7) && (gkeClusterReferenceBuilder_ != null)) {
        return gkeClusterReferenceBuilder_.getMessageOrBuilder();
      } else {
        if (clusterReferenceCase_ == 7) {
          return (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_;
        }
        return com.google.cloud.gaming.v1.GkeClusterReference.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Reference to the GKE cluster where the game servers are installed.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1.GkeClusterReference gke_cluster_reference = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1.GkeClusterReference,
            com.google.cloud.gaming.v1.GkeClusterReference.Builder,
            com.google.cloud.gaming.v1.GkeClusterReferenceOrBuilder>
        getGkeClusterReferenceFieldBuilder() {
      if (gkeClusterReferenceBuilder_ == null) {
        if (!(clusterReferenceCase_ == 7)) {
          clusterReference_ = com.google.cloud.gaming.v1.GkeClusterReference.getDefaultInstance();
        }
        gkeClusterReferenceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1.GkeClusterReference,
                com.google.cloud.gaming.v1.GkeClusterReference.Builder,
                com.google.cloud.gaming.v1.GkeClusterReferenceOrBuilder>(
                (com.google.cloud.gaming.v1.GkeClusterReference) clusterReference_,
                getParentForChildren(),
                isClean());
        clusterReference_ = null;
      }
      clusterReferenceCase_ = 7;
      onChanged();
      ;
      return gkeClusterReferenceBuilder_;
    }

    private java.lang.Object namespace_ = "";
    /**
     *
     *
     * <pre>
     * Namespace designated on the game server cluster where the Agones game
     * server instances will be created. Existence of the namespace will be
     * validated during creation.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     *
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace designated on the game server cluster where the Agones game
     * server instances will be created. Existence of the namespace will be
     * validated during creation.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     *
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace designated on the game server cluster where the Agones game
     * server instances will be created. Existence of the namespace will be
     * validated during creation.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     *
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Namespace designated on the game server cluster where the Agones game
     * server instances will be created. Existence of the namespace will be
     * validated during creation.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {

      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Namespace designated on the game server cluster where the Agones game
     * server instances will be created. Existence of the namespace will be
     * validated during creation.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     *
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      namespace_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1.GameServerClusterConnectionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1.GameServerClusterConnectionInfo)
  private static final com.google.cloud.gaming.v1.GameServerClusterConnectionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1.GameServerClusterConnectionInfo();
  }

  public static com.google.cloud.gaming.v1.GameServerClusterConnectionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameServerClusterConnectionInfo> PARSER =
      new com.google.protobuf.AbstractParser<GameServerClusterConnectionInfo>() {
        @java.lang.Override
        public GameServerClusterConnectionInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GameServerClusterConnectionInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GameServerClusterConnectionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameServerClusterConnectionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1.GameServerClusterConnectionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
