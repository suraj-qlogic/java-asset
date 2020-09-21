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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * A request message for [AssetService.ExportIamPolicyAnalysis][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.ExportIamPolicyAnalysisRequest}
 */
public final class ExportIamPolicyAnalysisRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.ExportIamPolicyAnalysisRequest)
    ExportIamPolicyAnalysisRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExportIamPolicyAnalysisRequest.newBuilder() to construct.
  private ExportIamPolicyAnalysisRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportIamPolicyAnalysisRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportIamPolicyAnalysisRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExportIamPolicyAnalysisRequest(
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
          case 10:
            {
              com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Builder subBuilder = null;
              if (analysisQuery_ != null) {
                subBuilder = analysisQuery_.toBuilder();
              }
              analysisQuery_ =
                  input.readMessage(
                      com.google.cloud.asset.v1.IamPolicyAnalysisQuery.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(analysisQuery_);
                analysisQuery_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.Builder subBuilder = null;
              if (outputConfig_ != null) {
                subBuilder = outputConfig_.toBuilder();
              }
              outputConfig_ =
                  input.readMessage(
                      com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(outputConfig_);
                outputConfig_ = subBuilder.buildPartial();
              }

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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_ExportIamPolicyAnalysisRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_ExportIamPolicyAnalysisRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest.class,
            com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest.Builder.class);
  }

  public static final int ANALYSIS_QUERY_FIELD_NUMBER = 1;
  private com.google.cloud.asset.v1.IamPolicyAnalysisQuery analysisQuery_;
  /**
   *
   *
   * <pre>
   * The request query.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the analysisQuery field is set.
   */
  @java.lang.Override
  public boolean hasAnalysisQuery() {
    return analysisQuery_ != null;
  }
  /**
   *
   *
   * <pre>
   * The request query.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The analysisQuery.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.IamPolicyAnalysisQuery getAnalysisQuery() {
    return analysisQuery_ == null
        ? com.google.cloud.asset.v1.IamPolicyAnalysisQuery.getDefaultInstance()
        : analysisQuery_;
  }
  /**
   *
   *
   * <pre>
   * The request query.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.IamPolicyAnalysisQueryOrBuilder getAnalysisQueryOrBuilder() {
    return getAnalysisQuery();
  }

  public static final int OUTPUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig outputConfig_;
  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results will be output to.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the outputConfig field is set.
   */
  @java.lang.Override
  public boolean hasOutputConfig() {
    return outputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results will be output to.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outputConfig.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig getOutputConfig() {
    return outputConfig_ == null
        ? com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.getDefaultInstance()
        : outputConfig_;
  }
  /**
   *
   *
   * <pre>
   * Output configuration indicating where the results will be output to.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfigOrBuilder
      getOutputConfigOrBuilder() {
    return getOutputConfig();
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
    if (analysisQuery_ != null) {
      output.writeMessage(1, getAnalysisQuery());
    }
    if (outputConfig_ != null) {
      output.writeMessage(2, getOutputConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (analysisQuery_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAnalysisQuery());
    }
    if (outputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOutputConfig());
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
    if (!(obj instanceof com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest other =
        (com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest) obj;

    if (hasAnalysisQuery() != other.hasAnalysisQuery()) return false;
    if (hasAnalysisQuery()) {
      if (!getAnalysisQuery().equals(other.getAnalysisQuery())) return false;
    }
    if (hasOutputConfig() != other.hasOutputConfig()) return false;
    if (hasOutputConfig()) {
      if (!getOutputConfig().equals(other.getOutputConfig())) return false;
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
    if (hasAnalysisQuery()) {
      hash = (37 * hash) + ANALYSIS_QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getAnalysisQuery().hashCode();
    }
    if (hasOutputConfig()) {
      hash = (37 * hash) + OUTPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getOutputConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parseFrom(
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
      com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest prototype) {
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
   * A request message for [AssetService.ExportIamPolicyAnalysis][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.ExportIamPolicyAnalysisRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.ExportIamPolicyAnalysisRequest)
      com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_ExportIamPolicyAnalysisRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_ExportIamPolicyAnalysisRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest.class,
              com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest.newBuilder()
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
      if (analysisQueryBuilder_ == null) {
        analysisQuery_ = null;
      } else {
        analysisQuery_ = null;
        analysisQueryBuilder_ = null;
      }
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_ExportIamPolicyAnalysisRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest build() {
      com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest buildPartial() {
      com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest result =
          new com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest(this);
      if (analysisQueryBuilder_ == null) {
        result.analysisQuery_ = analysisQuery_;
      } else {
        result.analysisQuery_ = analysisQueryBuilder_.build();
      }
      if (outputConfigBuilder_ == null) {
        result.outputConfig_ = outputConfig_;
      } else {
        result.outputConfig_ = outputConfigBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest) {
        return mergeFrom((com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest other) {
      if (other == com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest.getDefaultInstance())
        return this;
      if (other.hasAnalysisQuery()) {
        mergeAnalysisQuery(other.getAnalysisQuery());
      }
      if (other.hasOutputConfig()) {
        mergeOutputConfig(other.getOutputConfig());
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
      com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.asset.v1.IamPolicyAnalysisQuery analysisQuery_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.IamPolicyAnalysisQuery,
            com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Builder,
            com.google.cloud.asset.v1.IamPolicyAnalysisQueryOrBuilder>
        analysisQueryBuilder_;
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the analysisQuery field is set.
     */
    public boolean hasAnalysisQuery() {
      return analysisQueryBuilder_ != null || analysisQuery_ != null;
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The analysisQuery.
     */
    public com.google.cloud.asset.v1.IamPolicyAnalysisQuery getAnalysisQuery() {
      if (analysisQueryBuilder_ == null) {
        return analysisQuery_ == null
            ? com.google.cloud.asset.v1.IamPolicyAnalysisQuery.getDefaultInstance()
            : analysisQuery_;
      } else {
        return analysisQueryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAnalysisQuery(com.google.cloud.asset.v1.IamPolicyAnalysisQuery value) {
      if (analysisQueryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        analysisQuery_ = value;
        onChanged();
      } else {
        analysisQueryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAnalysisQuery(
        com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Builder builderForValue) {
      if (analysisQueryBuilder_ == null) {
        analysisQuery_ = builderForValue.build();
        onChanged();
      } else {
        analysisQueryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAnalysisQuery(com.google.cloud.asset.v1.IamPolicyAnalysisQuery value) {
      if (analysisQueryBuilder_ == null) {
        if (analysisQuery_ != null) {
          analysisQuery_ =
              com.google.cloud.asset.v1.IamPolicyAnalysisQuery.newBuilder(analysisQuery_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          analysisQuery_ = value;
        }
        onChanged();
      } else {
        analysisQueryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAnalysisQuery() {
      if (analysisQueryBuilder_ == null) {
        analysisQuery_ = null;
        onChanged();
      } else {
        analysisQuery_ = null;
        analysisQueryBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Builder getAnalysisQueryBuilder() {

      onChanged();
      return getAnalysisQueryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.asset.v1.IamPolicyAnalysisQueryOrBuilder getAnalysisQueryOrBuilder() {
      if (analysisQueryBuilder_ != null) {
        return analysisQueryBuilder_.getMessageOrBuilder();
      } else {
        return analysisQuery_ == null
            ? com.google.cloud.asset.v1.IamPolicyAnalysisQuery.getDefaultInstance()
            : analysisQuery_;
      }
    }
    /**
     *
     *
     * <pre>
     * The request query.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisQuery analysis_query = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.IamPolicyAnalysisQuery,
            com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Builder,
            com.google.cloud.asset.v1.IamPolicyAnalysisQueryOrBuilder>
        getAnalysisQueryFieldBuilder() {
      if (analysisQueryBuilder_ == null) {
        analysisQueryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.asset.v1.IamPolicyAnalysisQuery,
                com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Builder,
                com.google.cloud.asset.v1.IamPolicyAnalysisQueryOrBuilder>(
                getAnalysisQuery(), getParentForChildren(), isClean());
        analysisQuery_ = null;
      }
      return analysisQueryBuilder_;
    }

    private com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig outputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig,
            com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.Builder,
            com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfigOrBuilder>
        outputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the outputConfig field is set.
     */
    public boolean hasOutputConfig() {
      return outputConfigBuilder_ != null || outputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The outputConfig.
     */
    public com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig getOutputConfig() {
      if (outputConfigBuilder_ == null) {
        return outputConfig_ == null
            ? com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.getDefaultInstance()
            : outputConfig_;
      } else {
        return outputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOutputConfig(com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputConfig_ = value;
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setOutputConfig(
        com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.Builder builderForValue) {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = builderForValue.build();
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeOutputConfig(
        com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (outputConfig_ != null) {
          outputConfig_ =
              com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.newBuilder(outputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          outputConfig_ = value;
        }
        onChanged();
      } else {
        outputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearOutputConfig() {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
        onChanged();
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.Builder
        getOutputConfigBuilder() {

      onChanged();
      return getOutputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfigOrBuilder
        getOutputConfigOrBuilder() {
      if (outputConfigBuilder_ != null) {
        return outputConfigBuilder_.getMessageOrBuilder();
      } else {
        return outputConfig_ == null
            ? com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.getDefaultInstance()
            : outputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output configuration indicating where the results will be output to.
     * </pre>
     *
     * <code>
     * .google.cloud.asset.v1.IamPolicyAnalysisOutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig,
            com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.Builder,
            com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfigOrBuilder>
        getOutputConfigFieldBuilder() {
      if (outputConfigBuilder_ == null) {
        outputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig,
                com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.Builder,
                com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfigOrBuilder>(
                getOutputConfig(), getParentForChildren(), isClean());
        outputConfig_ = null;
      }
      return outputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.ExportIamPolicyAnalysisRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.ExportIamPolicyAnalysisRequest)
  private static final com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest();
  }

  public static com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportIamPolicyAnalysisRequest> PARSER =
      new com.google.protobuf.AbstractParser<ExportIamPolicyAnalysisRequest>() {
        @java.lang.Override
        public ExportIamPolicyAnalysisRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExportIamPolicyAnalysisRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExportIamPolicyAnalysisRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportIamPolicyAnalysisRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.ExportIamPolicyAnalysisRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}