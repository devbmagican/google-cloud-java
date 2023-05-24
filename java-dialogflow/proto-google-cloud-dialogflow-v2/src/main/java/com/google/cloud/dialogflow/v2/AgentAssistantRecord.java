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
// source: google/cloud/dialogflow/v2/answer_record.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Represents a record of a human agent assist answer.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.AgentAssistantRecord}
 */
public final class AgentAssistantRecord extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.AgentAssistantRecord)
    AgentAssistantRecordOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AgentAssistantRecord.newBuilder() to construct.
  private AgentAssistantRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AgentAssistantRecord() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AgentAssistantRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.AnswerRecordsProto
        .internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.AnswerRecordsProto
        .internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.AgentAssistantRecord.class,
            com.google.cloud.dialogflow.v2.AgentAssistantRecord.Builder.class);
  }

  private int answerCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object answer_;

  public enum AnswerCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ARTICLE_SUGGESTION_ANSWER(5),
    FAQ_ANSWER(6),
    ANSWER_NOT_SET(0);
    private final int value;

    private AnswerCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AnswerCase valueOf(int value) {
      return forNumber(value);
    }

    public static AnswerCase forNumber(int value) {
      switch (value) {
        case 5:
          return ARTICLE_SUGGESTION_ANSWER;
        case 6:
          return FAQ_ANSWER;
        case 0:
          return ANSWER_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AnswerCase getAnswerCase() {
    return AnswerCase.forNumber(answerCase_);
  }

  public static final int ARTICLE_SUGGESTION_ANSWER_FIELD_NUMBER = 5;
  /**
   *
   *
   * <pre>
   * Output only. The article suggestion answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the articleSuggestionAnswer field is set.
   */
  @java.lang.Override
  public boolean hasArticleSuggestionAnswer() {
    return answerCase_ == 5;
  }
  /**
   *
   *
   * <pre>
   * Output only. The article suggestion answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The articleSuggestionAnswer.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ArticleAnswer getArticleSuggestionAnswer() {
    if (answerCase_ == 5) {
      return (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_;
    }
    return com.google.cloud.dialogflow.v2.ArticleAnswer.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Output only. The article suggestion answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ArticleAnswerOrBuilder
      getArticleSuggestionAnswerOrBuilder() {
    if (answerCase_ == 5) {
      return (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_;
    }
    return com.google.cloud.dialogflow.v2.ArticleAnswer.getDefaultInstance();
  }

  public static final int FAQ_ANSWER_FIELD_NUMBER = 6;
  /**
   *
   *
   * <pre>
   * Output only. The FAQ answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the faqAnswer field is set.
   */
  @java.lang.Override
  public boolean hasFaqAnswer() {
    return answerCase_ == 6;
  }
  /**
   *
   *
   * <pre>
   * Output only. The FAQ answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The faqAnswer.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.FaqAnswer getFaqAnswer() {
    if (answerCase_ == 6) {
      return (com.google.cloud.dialogflow.v2.FaqAnswer) answer_;
    }
    return com.google.cloud.dialogflow.v2.FaqAnswer.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Output only. The FAQ answer.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.FaqAnswerOrBuilder getFaqAnswerOrBuilder() {
    if (answerCase_ == 6) {
      return (com.google.cloud.dialogflow.v2.FaqAnswer) answer_;
    }
    return com.google.cloud.dialogflow.v2.FaqAnswer.getDefaultInstance();
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
    if (answerCase_ == 5) {
      output.writeMessage(5, (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_);
    }
    if (answerCase_ == 6) {
      output.writeMessage(6, (com.google.cloud.dialogflow.v2.FaqAnswer) answer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (answerCase_ == 5) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              5, (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_);
    }
    if (answerCase_ == 6) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              6, (com.google.cloud.dialogflow.v2.FaqAnswer) answer_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.AgentAssistantRecord)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.AgentAssistantRecord other =
        (com.google.cloud.dialogflow.v2.AgentAssistantRecord) obj;

    if (!getAnswerCase().equals(other.getAnswerCase())) return false;
    switch (answerCase_) {
      case 5:
        if (!getArticleSuggestionAnswer().equals(other.getArticleSuggestionAnswer())) return false;
        break;
      case 6:
        if (!getFaqAnswer().equals(other.getFaqAnswer())) return false;
        break;
      case 0:
      default:
    }
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
    switch (answerCase_) {
      case 5:
        hash = (37 * hash) + ARTICLE_SUGGESTION_ANSWER_FIELD_NUMBER;
        hash = (53 * hash) + getArticleSuggestionAnswer().hashCode();
        break;
      case 6:
        hash = (37 * hash) + FAQ_ANSWER_FIELD_NUMBER;
        hash = (53 * hash) + getFaqAnswer().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.AgentAssistantRecord prototype) {
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
   * Represents a record of a human agent assist answer.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.AgentAssistantRecord}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.AgentAssistantRecord)
      com.google.cloud.dialogflow.v2.AgentAssistantRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.AnswerRecordsProto
          .internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.AnswerRecordsProto
          .internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.AgentAssistantRecord.class,
              com.google.cloud.dialogflow.v2.AgentAssistantRecord.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.AgentAssistantRecord.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (articleSuggestionAnswerBuilder_ != null) {
        articleSuggestionAnswerBuilder_.clear();
      }
      if (faqAnswerBuilder_ != null) {
        faqAnswerBuilder_.clear();
      }
      answerCase_ = 0;
      answer_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.AnswerRecordsProto
          .internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AgentAssistantRecord getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.AgentAssistantRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AgentAssistantRecord build() {
      com.google.cloud.dialogflow.v2.AgentAssistantRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.AgentAssistantRecord buildPartial() {
      com.google.cloud.dialogflow.v2.AgentAssistantRecord result =
          new com.google.cloud.dialogflow.v2.AgentAssistantRecord(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.AgentAssistantRecord result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.dialogflow.v2.AgentAssistantRecord result) {
      result.answerCase_ = answerCase_;
      result.answer_ = this.answer_;
      if (answerCase_ == 5 && articleSuggestionAnswerBuilder_ != null) {
        result.answer_ = articleSuggestionAnswerBuilder_.build();
      }
      if (answerCase_ == 6 && faqAnswerBuilder_ != null) {
        result.answer_ = faqAnswerBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.AgentAssistantRecord) {
        return mergeFrom((com.google.cloud.dialogflow.v2.AgentAssistantRecord) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.AgentAssistantRecord other) {
      if (other == com.google.cloud.dialogflow.v2.AgentAssistantRecord.getDefaultInstance())
        return this;
      switch (other.getAnswerCase()) {
        case ARTICLE_SUGGESTION_ANSWER:
          {
            mergeArticleSuggestionAnswer(other.getArticleSuggestionAnswer());
            break;
          }
        case FAQ_ANSWER:
          {
            mergeFaqAnswer(other.getFaqAnswer());
            break;
          }
        case ANSWER_NOT_SET:
          {
            break;
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
            case 42:
              {
                input.readMessage(
                    getArticleSuggestionAnswerFieldBuilder().getBuilder(), extensionRegistry);
                answerCase_ = 5;
                break;
              } // case 42
            case 50:
              {
                input.readMessage(getFaqAnswerFieldBuilder().getBuilder(), extensionRegistry);
                answerCase_ = 6;
                break;
              } // case 50
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

    private int answerCase_ = 0;
    private java.lang.Object answer_;

    public AnswerCase getAnswerCase() {
      return AnswerCase.forNumber(answerCase_);
    }

    public Builder clearAnswer() {
      answerCase_ = 0;
      answer_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ArticleAnswer,
            com.google.cloud.dialogflow.v2.ArticleAnswer.Builder,
            com.google.cloud.dialogflow.v2.ArticleAnswerOrBuilder>
        articleSuggestionAnswerBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the articleSuggestionAnswer field is set.
     */
    @java.lang.Override
    public boolean hasArticleSuggestionAnswer() {
      return answerCase_ == 5;
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The articleSuggestionAnswer.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ArticleAnswer getArticleSuggestionAnswer() {
      if (articleSuggestionAnswerBuilder_ == null) {
        if (answerCase_ == 5) {
          return (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_;
        }
        return com.google.cloud.dialogflow.v2.ArticleAnswer.getDefaultInstance();
      } else {
        if (answerCase_ == 5) {
          return articleSuggestionAnswerBuilder_.getMessage();
        }
        return com.google.cloud.dialogflow.v2.ArticleAnswer.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setArticleSuggestionAnswer(com.google.cloud.dialogflow.v2.ArticleAnswer value) {
      if (articleSuggestionAnswerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        answer_ = value;
        onChanged();
      } else {
        articleSuggestionAnswerBuilder_.setMessage(value);
      }
      answerCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setArticleSuggestionAnswer(
        com.google.cloud.dialogflow.v2.ArticleAnswer.Builder builderForValue) {
      if (articleSuggestionAnswerBuilder_ == null) {
        answer_ = builderForValue.build();
        onChanged();
      } else {
        articleSuggestionAnswerBuilder_.setMessage(builderForValue.build());
      }
      answerCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeArticleSuggestionAnswer(
        com.google.cloud.dialogflow.v2.ArticleAnswer value) {
      if (articleSuggestionAnswerBuilder_ == null) {
        if (answerCase_ == 5
            && answer_ != com.google.cloud.dialogflow.v2.ArticleAnswer.getDefaultInstance()) {
          answer_ =
              com.google.cloud.dialogflow.v2.ArticleAnswer.newBuilder(
                      (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          answer_ = value;
        }
        onChanged();
      } else {
        if (answerCase_ == 5) {
          articleSuggestionAnswerBuilder_.mergeFrom(value);
        } else {
          articleSuggestionAnswerBuilder_.setMessage(value);
        }
      }
      answerCase_ = 5;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearArticleSuggestionAnswer() {
      if (articleSuggestionAnswerBuilder_ == null) {
        if (answerCase_ == 5) {
          answerCase_ = 0;
          answer_ = null;
          onChanged();
        }
      } else {
        if (answerCase_ == 5) {
          answerCase_ = 0;
          answer_ = null;
        }
        articleSuggestionAnswerBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.ArticleAnswer.Builder
        getArticleSuggestionAnswerBuilder() {
      return getArticleSuggestionAnswerFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ArticleAnswerOrBuilder
        getArticleSuggestionAnswerOrBuilder() {
      if ((answerCase_ == 5) && (articleSuggestionAnswerBuilder_ != null)) {
        return articleSuggestionAnswerBuilder_.getMessageOrBuilder();
      } else {
        if (answerCase_ == 5) {
          return (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_;
        }
        return com.google.cloud.dialogflow.v2.ArticleAnswer.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The article suggestion answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.ArticleAnswer article_suggestion_answer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ArticleAnswer,
            com.google.cloud.dialogflow.v2.ArticleAnswer.Builder,
            com.google.cloud.dialogflow.v2.ArticleAnswerOrBuilder>
        getArticleSuggestionAnswerFieldBuilder() {
      if (articleSuggestionAnswerBuilder_ == null) {
        if (!(answerCase_ == 5)) {
          answer_ = com.google.cloud.dialogflow.v2.ArticleAnswer.getDefaultInstance();
        }
        articleSuggestionAnswerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.ArticleAnswer,
                com.google.cloud.dialogflow.v2.ArticleAnswer.Builder,
                com.google.cloud.dialogflow.v2.ArticleAnswerOrBuilder>(
                (com.google.cloud.dialogflow.v2.ArticleAnswer) answer_,
                getParentForChildren(),
                isClean());
        answer_ = null;
      }
      answerCase_ = 5;
      onChanged();
      return articleSuggestionAnswerBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.FaqAnswer,
            com.google.cloud.dialogflow.v2.FaqAnswer.Builder,
            com.google.cloud.dialogflow.v2.FaqAnswerOrBuilder>
        faqAnswerBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the faqAnswer field is set.
     */
    @java.lang.Override
    public boolean hasFaqAnswer() {
      return answerCase_ == 6;
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The faqAnswer.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.FaqAnswer getFaqAnswer() {
      if (faqAnswerBuilder_ == null) {
        if (answerCase_ == 6) {
          return (com.google.cloud.dialogflow.v2.FaqAnswer) answer_;
        }
        return com.google.cloud.dialogflow.v2.FaqAnswer.getDefaultInstance();
      } else {
        if (answerCase_ == 6) {
          return faqAnswerBuilder_.getMessage();
        }
        return com.google.cloud.dialogflow.v2.FaqAnswer.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setFaqAnswer(com.google.cloud.dialogflow.v2.FaqAnswer value) {
      if (faqAnswerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        answer_ = value;
        onChanged();
      } else {
        faqAnswerBuilder_.setMessage(value);
      }
      answerCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setFaqAnswer(com.google.cloud.dialogflow.v2.FaqAnswer.Builder builderForValue) {
      if (faqAnswerBuilder_ == null) {
        answer_ = builderForValue.build();
        onChanged();
      } else {
        faqAnswerBuilder_.setMessage(builderForValue.build());
      }
      answerCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeFaqAnswer(com.google.cloud.dialogflow.v2.FaqAnswer value) {
      if (faqAnswerBuilder_ == null) {
        if (answerCase_ == 6
            && answer_ != com.google.cloud.dialogflow.v2.FaqAnswer.getDefaultInstance()) {
          answer_ =
              com.google.cloud.dialogflow.v2.FaqAnswer.newBuilder(
                      (com.google.cloud.dialogflow.v2.FaqAnswer) answer_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          answer_ = value;
        }
        onChanged();
      } else {
        if (answerCase_ == 6) {
          faqAnswerBuilder_.mergeFrom(value);
        } else {
          faqAnswerBuilder_.setMessage(value);
        }
      }
      answerCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearFaqAnswer() {
      if (faqAnswerBuilder_ == null) {
        if (answerCase_ == 6) {
          answerCase_ = 0;
          answer_ = null;
          onChanged();
        }
      } else {
        if (answerCase_ == 6) {
          answerCase_ = 0;
          answer_ = null;
        }
        faqAnswerBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.FaqAnswer.Builder getFaqAnswerBuilder() {
      return getFaqAnswerFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.FaqAnswerOrBuilder getFaqAnswerOrBuilder() {
      if ((answerCase_ == 6) && (faqAnswerBuilder_ != null)) {
        return faqAnswerBuilder_.getMessageOrBuilder();
      } else {
        if (answerCase_ == 6) {
          return (com.google.cloud.dialogflow.v2.FaqAnswer) answer_;
        }
        return com.google.cloud.dialogflow.v2.FaqAnswer.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The FAQ answer.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.FaqAnswer faq_answer = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.FaqAnswer,
            com.google.cloud.dialogflow.v2.FaqAnswer.Builder,
            com.google.cloud.dialogflow.v2.FaqAnswerOrBuilder>
        getFaqAnswerFieldBuilder() {
      if (faqAnswerBuilder_ == null) {
        if (!(answerCase_ == 6)) {
          answer_ = com.google.cloud.dialogflow.v2.FaqAnswer.getDefaultInstance();
        }
        faqAnswerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.FaqAnswer,
                com.google.cloud.dialogflow.v2.FaqAnswer.Builder,
                com.google.cloud.dialogflow.v2.FaqAnswerOrBuilder>(
                (com.google.cloud.dialogflow.v2.FaqAnswer) answer_,
                getParentForChildren(),
                isClean());
        answer_ = null;
      }
      answerCase_ = 6;
      onChanged();
      return faqAnswerBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.AgentAssistantRecord)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.AgentAssistantRecord)
  private static final com.google.cloud.dialogflow.v2.AgentAssistantRecord DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.AgentAssistantRecord();
  }

  public static com.google.cloud.dialogflow.v2.AgentAssistantRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentAssistantRecord> PARSER =
      new com.google.protobuf.AbstractParser<AgentAssistantRecord>() {
        @java.lang.Override
        public AgentAssistantRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentAssistantRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentAssistantRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.AgentAssistantRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
