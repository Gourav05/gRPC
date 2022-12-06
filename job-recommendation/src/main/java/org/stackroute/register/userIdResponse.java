// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package org.stackroute.register;

/**
 * Protobuf type {@code userIdResponse}
 */
public  final class userIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:userIdResponse)
    userIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use userIdResponse.newBuilder() to construct.
  private userIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private userIdResponse() {
    userId_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new userIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private userIdResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              userId_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            userId_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              userId_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              userId_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        userId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.stackroute.register.Userservice.internal_static_userIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.stackroute.register.Userservice.internal_static_userIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.stackroute.register.userIdResponse.class, org.stackroute.register.userIdResponse.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList userId_;
  /**
   * <code>repeated int32 userId = 1;</code>
   * @return A list containing the userId.
   */
  public java.util.List<java.lang.Integer>
      getUserIdList() {
    return userId_;
  }
  /**
   * <code>repeated int32 userId = 1;</code>
   * @return The count of userId.
   */
  public int getUserIdCount() {
    return userId_.size();
  }
  /**
   * <code>repeated int32 userId = 1;</code>
   * @param index The index of the element to return.
   * @return The userId at the given index.
   */
  public int getUserId(int index) {
    return userId_.getInt(index);
  }
  private int userIdMemoizedSerializedSize = -1;

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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getUserIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(userIdMemoizedSerializedSize);
    }
    for (int i = 0; i < userId_.size(); i++) {
      output.writeInt32NoTag(userId_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < userId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(userId_.getInt(i));
      }
      size += dataSize;
      if (!getUserIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      userIdMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.stackroute.register.userIdResponse)) {
      return super.equals(obj);
    }
    org.stackroute.register.userIdResponse other = (org.stackroute.register.userIdResponse) obj;

    if (!getUserIdList()
        .equals(other.getUserIdList())) return false;
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
    if (getUserIdCount() > 0) {
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.stackroute.register.userIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.register.userIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.register.userIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.register.userIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.register.userIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.register.userIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.register.userIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stackroute.register.userIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stackroute.register.userIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.stackroute.register.userIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stackroute.register.userIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stackroute.register.userIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.stackroute.register.userIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code userIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:userIdResponse)
      org.stackroute.register.userIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.stackroute.register.Userservice.internal_static_userIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.stackroute.register.Userservice.internal_static_userIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.stackroute.register.userIdResponse.class, org.stackroute.register.userIdResponse.Builder.class);
    }

    // Construct using org.stackroute.register.userIdResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.stackroute.register.Userservice.internal_static_userIdResponse_descriptor;
    }

    @java.lang.Override
    public org.stackroute.register.userIdResponse getDefaultInstanceForType() {
      return org.stackroute.register.userIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.stackroute.register.userIdResponse build() {
      org.stackroute.register.userIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.stackroute.register.userIdResponse buildPartial() {
      org.stackroute.register.userIdResponse result = new org.stackroute.register.userIdResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        userId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.userId_ = userId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.stackroute.register.userIdResponse) {
        return mergeFrom((org.stackroute.register.userIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.stackroute.register.userIdResponse other) {
      if (other == org.stackroute.register.userIdResponse.getDefaultInstance()) return this;
      if (!other.userId_.isEmpty()) {
        if (userId_.isEmpty()) {
          userId_ = other.userId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUserIdIsMutable();
          userId_.addAll(other.userId_);
        }
        onChanged();
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
      org.stackroute.register.userIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.stackroute.register.userIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList userId_ = emptyIntList();
    private void ensureUserIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userId_ = mutableCopy(userId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 userId = 1;</code>
     * @return A list containing the userId.
     */
    public java.util.List<java.lang.Integer>
        getUserIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(userId_) : userId_;
    }
    /**
     * <code>repeated int32 userId = 1;</code>
     * @return The count of userId.
     */
    public int getUserIdCount() {
      return userId_.size();
    }
    /**
     * <code>repeated int32 userId = 1;</code>
     * @param index The index of the element to return.
     * @return The userId at the given index.
     */
    public int getUserId(int index) {
      return userId_.getInt(index);
    }
    /**
     * <code>repeated int32 userId = 1;</code>
     * @param index The index to set the value at.
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        int index, int value) {
      ensureUserIdIsMutable();
      userId_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 userId = 1;</code>
     * @param value The userId to add.
     * @return This builder for chaining.
     */
    public Builder addUserId(int value) {
      ensureUserIdIsMutable();
      userId_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 userId = 1;</code>
     * @param values The userId to add.
     * @return This builder for chaining.
     */
    public Builder addAllUserId(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureUserIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, userId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 userId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:userIdResponse)
  }

  // @@protoc_insertion_point(class_scope:userIdResponse)
  private static final org.stackroute.register.userIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.stackroute.register.userIdResponse();
  }

  public static org.stackroute.register.userIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<userIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<userIdResponse>() {
    @java.lang.Override
    public userIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new userIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<userIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<userIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.stackroute.register.userIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
