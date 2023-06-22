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
// source: google/cloud/securitycenter/v1/contact_details.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Details about specific contacts
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.ContactDetails}
 */
public final class ContactDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.ContactDetails)
    ContactDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ContactDetails.newBuilder() to construct.
  private ContactDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ContactDetails() {
    contacts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ContactDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.ContactDetailsProto
        .internal_static_google_cloud_securitycenter_v1_ContactDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.ContactDetailsProto
        .internal_static_google_cloud_securitycenter_v1_ContactDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.ContactDetails.class,
            com.google.cloud.securitycenter.v1.ContactDetails.Builder.class);
  }

  public static final int CONTACTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.securitycenter.v1.Contact> contacts_;
  /**
   *
   *
   * <pre>
   * A list of contacts
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.securitycenter.v1.Contact> getContactsList() {
    return contacts_;
  }
  /**
   *
   *
   * <pre>
   * A list of contacts
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.securitycenter.v1.ContactOrBuilder>
      getContactsOrBuilderList() {
    return contacts_;
  }
  /**
   *
   *
   * <pre>
   * A list of contacts
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
   */
  @java.lang.Override
  public int getContactsCount() {
    return contacts_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of contacts
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.Contact getContacts(int index) {
    return contacts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of contacts
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.ContactOrBuilder getContactsOrBuilder(int index) {
    return contacts_.get(index);
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
    for (int i = 0; i < contacts_.size(); i++) {
      output.writeMessage(1, contacts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contacts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, contacts_.get(i));
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.ContactDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.ContactDetails other =
        (com.google.cloud.securitycenter.v1.ContactDetails) obj;

    if (!getContactsList().equals(other.getContactsList())) return false;
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
    if (getContactsCount() > 0) {
      hash = (37 * hash) + CONTACTS_FIELD_NUMBER;
      hash = (53 * hash) + getContactsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v1.ContactDetails prototype) {
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
   * Details about specific contacts
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.ContactDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.ContactDetails)
      com.google.cloud.securitycenter.v1.ContactDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.ContactDetailsProto
          .internal_static_google_cloud_securitycenter_v1_ContactDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.ContactDetailsProto
          .internal_static_google_cloud_securitycenter_v1_ContactDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.ContactDetails.class,
              com.google.cloud.securitycenter.v1.ContactDetails.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.ContactDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (contactsBuilder_ == null) {
        contacts_ = java.util.Collections.emptyList();
      } else {
        contacts_ = null;
        contactsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.ContactDetailsProto
          .internal_static_google_cloud_securitycenter_v1_ContactDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ContactDetails getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.ContactDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ContactDetails build() {
      com.google.cloud.securitycenter.v1.ContactDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ContactDetails buildPartial() {
      com.google.cloud.securitycenter.v1.ContactDetails result =
          new com.google.cloud.securitycenter.v1.ContactDetails(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.securitycenter.v1.ContactDetails result) {
      if (contactsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contacts_ = java.util.Collections.unmodifiableList(contacts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contacts_ = contacts_;
      } else {
        result.contacts_ = contactsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.ContactDetails result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.ContactDetails) {
        return mergeFrom((com.google.cloud.securitycenter.v1.ContactDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.ContactDetails other) {
      if (other == com.google.cloud.securitycenter.v1.ContactDetails.getDefaultInstance())
        return this;
      if (contactsBuilder_ == null) {
        if (!other.contacts_.isEmpty()) {
          if (contacts_.isEmpty()) {
            contacts_ = other.contacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContactsIsMutable();
            contacts_.addAll(other.contacts_);
          }
          onChanged();
        }
      } else {
        if (!other.contacts_.isEmpty()) {
          if (contactsBuilder_.isEmpty()) {
            contactsBuilder_.dispose();
            contactsBuilder_ = null;
            contacts_ = other.contacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contactsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getContactsFieldBuilder()
                    : null;
          } else {
            contactsBuilder_.addAllMessages(other.contacts_);
          }
        }
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
                com.google.cloud.securitycenter.v1.Contact m =
                    input.readMessage(
                        com.google.cloud.securitycenter.v1.Contact.parser(), extensionRegistry);
                if (contactsBuilder_ == null) {
                  ensureContactsIsMutable();
                  contacts_.add(m);
                } else {
                  contactsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.securitycenter.v1.Contact> contacts_ =
        java.util.Collections.emptyList();

    private void ensureContactsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contacts_ = new java.util.ArrayList<com.google.cloud.securitycenter.v1.Contact>(contacts_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.v1.Contact,
            com.google.cloud.securitycenter.v1.Contact.Builder,
            com.google.cloud.securitycenter.v1.ContactOrBuilder>
        contactsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.v1.Contact> getContactsList() {
      if (contactsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contacts_);
      } else {
        return contactsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public int getContactsCount() {
      if (contactsBuilder_ == null) {
        return contacts_.size();
      } else {
        return contactsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.Contact getContacts(int index) {
      if (contactsBuilder_ == null) {
        return contacts_.get(index);
      } else {
        return contactsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder setContacts(int index, com.google.cloud.securitycenter.v1.Contact value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactsIsMutable();
        contacts_.set(index, value);
        onChanged();
      } else {
        contactsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder setContacts(
        int index, com.google.cloud.securitycenter.v1.Contact.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.set(index, builderForValue.build());
        onChanged();
      } else {
        contactsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder addContacts(com.google.cloud.securitycenter.v1.Contact value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactsIsMutable();
        contacts_.add(value);
        onChanged();
      } else {
        contactsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder addContacts(int index, com.google.cloud.securitycenter.v1.Contact value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactsIsMutable();
        contacts_.add(index, value);
        onChanged();
      } else {
        contactsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder addContacts(com.google.cloud.securitycenter.v1.Contact.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.add(builderForValue.build());
        onChanged();
      } else {
        contactsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder addContacts(
        int index, com.google.cloud.securitycenter.v1.Contact.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.add(index, builderForValue.build());
        onChanged();
      } else {
        contactsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder addAllContacts(
        java.lang.Iterable<? extends com.google.cloud.securitycenter.v1.Contact> values) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, contacts_);
        onChanged();
      } else {
        contactsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder clearContacts() {
      if (contactsBuilder_ == null) {
        contacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contactsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public Builder removeContacts(int index) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.remove(index);
        onChanged();
      } else {
        contactsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.Contact.Builder getContactsBuilder(int index) {
      return getContactsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.ContactOrBuilder getContactsOrBuilder(int index) {
      if (contactsBuilder_ == null) {
        return contacts_.get(index);
      } else {
        return contactsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.securitycenter.v1.ContactOrBuilder>
        getContactsOrBuilderList() {
      if (contactsBuilder_ != null) {
        return contactsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contacts_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.Contact.Builder addContactsBuilder() {
      return getContactsFieldBuilder()
          .addBuilder(com.google.cloud.securitycenter.v1.Contact.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public com.google.cloud.securitycenter.v1.Contact.Builder addContactsBuilder(int index) {
      return getContactsFieldBuilder()
          .addBuilder(index, com.google.cloud.securitycenter.v1.Contact.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of contacts
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.v1.Contact contacts = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.v1.Contact.Builder>
        getContactsBuilderList() {
      return getContactsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.v1.Contact,
            com.google.cloud.securitycenter.v1.Contact.Builder,
            com.google.cloud.securitycenter.v1.ContactOrBuilder>
        getContactsFieldBuilder() {
      if (contactsBuilder_ == null) {
        contactsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.securitycenter.v1.Contact,
                com.google.cloud.securitycenter.v1.Contact.Builder,
                com.google.cloud.securitycenter.v1.ContactOrBuilder>(
                contacts_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        contacts_ = null;
      }
      return contactsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.ContactDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.ContactDetails)
  private static final com.google.cloud.securitycenter.v1.ContactDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.ContactDetails();
  }

  public static com.google.cloud.securitycenter.v1.ContactDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactDetails> PARSER =
      new com.google.protobuf.AbstractParser<ContactDetails>() {
        @java.lang.Override
        public ContactDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContactDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.ContactDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
