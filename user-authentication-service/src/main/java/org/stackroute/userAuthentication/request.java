// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userAuth.proto

package org.stackroute.userAuthentication;

/**
 * Protobuf type {@code request}
 */
public  final class request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:request)
    requestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use request.newBuilder() to construct.
  private request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private request() {
    userEmail_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new request();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private request(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userEmail_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.stackroute.userAuthentication.UserAuth.internal_static_request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.stackroute.userAuthentication.UserAuth.internal_static_request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.stackroute.userAuthentication.request.class, org.stackroute.userAuthentication.request.Builder.class);
  }

  public static final int USEREMAIL_FIELD_NUMBER = 1;
  private volatile java.lang.Object userEmail_;
  /**
   * <code>string userEmail = 1;</code>
   * @return The userEmail.
   */
  public java.lang.String getUserEmail() {
    java.lang.Object ref = userEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userEmail_ = s;
      return s;
    }
  }
  /**
   * <code>string userEmail = 1;</code>
   * @return The bytes for userEmail.
   */
  public com.google.protobuf.ByteString
      getUserEmailBytes() {
    java.lang.Object ref = userEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userEmail_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userEmail_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userEmail_);
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
    if (!(obj instanceof org.stackroute.userAuthentication.request)) {
      return super.equals(obj);
    }
    org.stackroute.userAuthentication.request other = (org.stackroute.userAuthentication.request) obj;

    if (!getUserEmail()
        .equals(other.getUserEmail())) return false;
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
    hash = (37 * hash) + USEREMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getUserEmail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.stackroute.userAuthentication.request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.userAuthentication.request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.userAuthentication.request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.userAuthentication.request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.userAuthentication.request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.userAuthentication.request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.userAuthentication.request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stackroute.userAuthentication.request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stackroute.userAuthentication.request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.stackroute.userAuthentication.request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stackroute.userAuthentication.request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stackroute.userAuthentication.request parseFrom(
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
  public static Builder newBuilder(org.stackroute.userAuthentication.request prototype) {
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
   * Protobuf type {@code request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:request)
      org.stackroute.userAuthentication.requestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.stackroute.userAuthentication.UserAuth.internal_static_request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.stackroute.userAuthentication.UserAuth.internal_static_request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.stackroute.userAuthentication.request.class, org.stackroute.userAuthentication.request.Builder.class);
    }

    // Construct using org.stackroute.userAuthentication.request.newBuilder()
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
      userEmail_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.stackroute.userAuthentication.UserAuth.internal_static_request_descriptor;
    }

    @java.lang.Override
    public org.stackroute.userAuthentication.request getDefaultInstanceForType() {
      return org.stackroute.userAuthentication.request.getDefaultInstance();
    }

    @java.lang.Override
    public org.stackroute.userAuthentication.request build() {
      org.stackroute.userAuthentication.request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.stackroute.userAuthentication.request buildPartial() {
      org.stackroute.userAuthentication.request result = new org.stackroute.userAuthentication.request(this);
      result.userEmail_ = userEmail_;
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
      if (other instanceof org.stackroute.userAuthentication.request) {
        return mergeFrom((org.stackroute.userAuthentication.request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.stackroute.userAuthentication.request other) {
      if (other == org.stackroute.userAuthentication.request.getDefaultInstance()) return this;
      if (!other.getUserEmail().isEmpty()) {
        userEmail_ = other.userEmail_;
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
      org.stackroute.userAuthentication.request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.stackroute.userAuthentication.request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userEmail_ = "";
    /**
     * <code>string userEmail = 1;</code>
     * @return The userEmail.
     */
    public java.lang.String getUserEmail() {
      java.lang.Object ref = userEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userEmail = 1;</code>
     * @return The bytes for userEmail.
     */
    public com.google.protobuf.ByteString
        getUserEmailBytes() {
      java.lang.Object ref = userEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userEmail = 1;</code>
     * @param value The userEmail to set.
     * @return This builder for chaining.
     */
    public Builder setUserEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userEmail_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userEmail = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserEmail() {
      
      userEmail_ = getDefaultInstance().getUserEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string userEmail = 1;</code>
     * @param value The bytes for userEmail to set.
     * @return This builder for chaining.
     */
    public Builder setUserEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userEmail_ = value;
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


    // @@protoc_insertion_point(builder_scope:request)
  }

  // @@protoc_insertion_point(class_scope:request)
  private static final org.stackroute.userAuthentication.request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.stackroute.userAuthentication.request();
  }

  public static org.stackroute.userAuthentication.request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<request>
      PARSER = new com.google.protobuf.AbstractParser<request>() {
    @java.lang.Override
    public request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.stackroute.userAuthentication.request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

