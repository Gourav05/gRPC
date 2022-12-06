// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package org.stackroute.register;

/**
 * Protobuf type {@code responseMessager}
 */
public  final class responseMessager extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:responseMessager)
    responseMessagerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use responseMessager.newBuilder() to construct.
  private responseMessager(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private responseMessager() {
    r_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new responseMessager();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private responseMessager(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              r_ = new java.util.ArrayList<org.stackroute.register.rs>();
              mutable_bitField0_ |= 0x00000001;
            }
            r_.add(
                input.readMessage(org.stackroute.register.rs.parser(), extensionRegistry));
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
        r_ = java.util.Collections.unmodifiableList(r_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.stackroute.register.Userservice.internal_static_responseMessager_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.stackroute.register.Userservice.internal_static_responseMessager_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.stackroute.register.responseMessager.class, org.stackroute.register.responseMessager.Builder.class);
  }

  public static final int R_FIELD_NUMBER = 1;
  private java.util.List<org.stackroute.register.rs> r_;
  /**
   * <code>repeated .rs r = 1;</code>
   */
  public java.util.List<org.stackroute.register.rs> getRList() {
    return r_;
  }
  /**
   * <code>repeated .rs r = 1;</code>
   */
  public java.util.List<? extends org.stackroute.register.rsOrBuilder> 
      getROrBuilderList() {
    return r_;
  }
  /**
   * <code>repeated .rs r = 1;</code>
   */
  public int getRCount() {
    return r_.size();
  }
  /**
   * <code>repeated .rs r = 1;</code>
   */
  public org.stackroute.register.rs getR(int index) {
    return r_.get(index);
  }
  /**
   * <code>repeated .rs r = 1;</code>
   */
  public org.stackroute.register.rsOrBuilder getROrBuilder(
      int index) {
    return r_.get(index);
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
    for (int i = 0; i < r_.size(); i++) {
      output.writeMessage(1, r_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < r_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, r_.get(i));
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
    if (!(obj instanceof org.stackroute.register.responseMessager)) {
      return super.equals(obj);
    }
    org.stackroute.register.responseMessager other = (org.stackroute.register.responseMessager) obj;

    if (!getRList()
        .equals(other.getRList())) return false;
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
    if (getRCount() > 0) {
      hash = (37 * hash) + R_FIELD_NUMBER;
      hash = (53 * hash) + getRList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.stackroute.register.responseMessager parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.register.responseMessager parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.register.responseMessager parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.register.responseMessager parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.register.responseMessager parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stackroute.register.responseMessager parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stackroute.register.responseMessager parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stackroute.register.responseMessager parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stackroute.register.responseMessager parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.stackroute.register.responseMessager parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stackroute.register.responseMessager parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stackroute.register.responseMessager parseFrom(
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
  public static Builder newBuilder(org.stackroute.register.responseMessager prototype) {
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
   * Protobuf type {@code responseMessager}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:responseMessager)
      org.stackroute.register.responseMessagerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.stackroute.register.Userservice.internal_static_responseMessager_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.stackroute.register.Userservice.internal_static_responseMessager_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.stackroute.register.responseMessager.class, org.stackroute.register.responseMessager.Builder.class);
    }

    // Construct using org.stackroute.register.responseMessager.newBuilder()
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
        getRFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rBuilder_ == null) {
        r_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        rBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.stackroute.register.Userservice.internal_static_responseMessager_descriptor;
    }

    @java.lang.Override
    public org.stackroute.register.responseMessager getDefaultInstanceForType() {
      return org.stackroute.register.responseMessager.getDefaultInstance();
    }

    @java.lang.Override
    public org.stackroute.register.responseMessager build() {
      org.stackroute.register.responseMessager result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.stackroute.register.responseMessager buildPartial() {
      org.stackroute.register.responseMessager result = new org.stackroute.register.responseMessager(this);
      int from_bitField0_ = bitField0_;
      if (rBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          r_ = java.util.Collections.unmodifiableList(r_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.r_ = r_;
      } else {
        result.r_ = rBuilder_.build();
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
      if (other instanceof org.stackroute.register.responseMessager) {
        return mergeFrom((org.stackroute.register.responseMessager)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.stackroute.register.responseMessager other) {
      if (other == org.stackroute.register.responseMessager.getDefaultInstance()) return this;
      if (rBuilder_ == null) {
        if (!other.r_.isEmpty()) {
          if (r_.isEmpty()) {
            r_ = other.r_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRIsMutable();
            r_.addAll(other.r_);
          }
          onChanged();
        }
      } else {
        if (!other.r_.isEmpty()) {
          if (rBuilder_.isEmpty()) {
            rBuilder_.dispose();
            rBuilder_ = null;
            r_ = other.r_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRFieldBuilder() : null;
          } else {
            rBuilder_.addAllMessages(other.r_);
          }
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
      org.stackroute.register.responseMessager parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.stackroute.register.responseMessager) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.stackroute.register.rs> r_ =
      java.util.Collections.emptyList();
    private void ensureRIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        r_ = new java.util.ArrayList<org.stackroute.register.rs>(r_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.stackroute.register.rs, org.stackroute.register.rs.Builder, org.stackroute.register.rsOrBuilder> rBuilder_;

    /**
     * <code>repeated .rs r = 1;</code>
     */
    public java.util.List<org.stackroute.register.rs> getRList() {
      if (rBuilder_ == null) {
        return java.util.Collections.unmodifiableList(r_);
      } else {
        return rBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public int getRCount() {
      if (rBuilder_ == null) {
        return r_.size();
      } else {
        return rBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public org.stackroute.register.rs getR(int index) {
      if (rBuilder_ == null) {
        return r_.get(index);
      } else {
        return rBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder setR(
        int index, org.stackroute.register.rs value) {
      if (rBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRIsMutable();
        r_.set(index, value);
        onChanged();
      } else {
        rBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder setR(
        int index, org.stackroute.register.rs.Builder builderForValue) {
      if (rBuilder_ == null) {
        ensureRIsMutable();
        r_.set(index, builderForValue.build());
        onChanged();
      } else {
        rBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder addR(org.stackroute.register.rs value) {
      if (rBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRIsMutable();
        r_.add(value);
        onChanged();
      } else {
        rBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder addR(
        int index, org.stackroute.register.rs value) {
      if (rBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRIsMutable();
        r_.add(index, value);
        onChanged();
      } else {
        rBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder addR(
        org.stackroute.register.rs.Builder builderForValue) {
      if (rBuilder_ == null) {
        ensureRIsMutable();
        r_.add(builderForValue.build());
        onChanged();
      } else {
        rBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder addR(
        int index, org.stackroute.register.rs.Builder builderForValue) {
      if (rBuilder_ == null) {
        ensureRIsMutable();
        r_.add(index, builderForValue.build());
        onChanged();
      } else {
        rBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder addAllR(
        java.lang.Iterable<? extends org.stackroute.register.rs> values) {
      if (rBuilder_ == null) {
        ensureRIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, r_);
        onChanged();
      } else {
        rBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder clearR() {
      if (rBuilder_ == null) {
        r_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public Builder removeR(int index) {
      if (rBuilder_ == null) {
        ensureRIsMutable();
        r_.remove(index);
        onChanged();
      } else {
        rBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public org.stackroute.register.rs.Builder getRBuilder(
        int index) {
      return getRFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public org.stackroute.register.rsOrBuilder getROrBuilder(
        int index) {
      if (rBuilder_ == null) {
        return r_.get(index);  } else {
        return rBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public java.util.List<? extends org.stackroute.register.rsOrBuilder> 
         getROrBuilderList() {
      if (rBuilder_ != null) {
        return rBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(r_);
      }
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public org.stackroute.register.rs.Builder addRBuilder() {
      return getRFieldBuilder().addBuilder(
          org.stackroute.register.rs.getDefaultInstance());
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public org.stackroute.register.rs.Builder addRBuilder(
        int index) {
      return getRFieldBuilder().addBuilder(
          index, org.stackroute.register.rs.getDefaultInstance());
    }
    /**
     * <code>repeated .rs r = 1;</code>
     */
    public java.util.List<org.stackroute.register.rs.Builder> 
         getRBuilderList() {
      return getRFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.stackroute.register.rs, org.stackroute.register.rs.Builder, org.stackroute.register.rsOrBuilder> 
        getRFieldBuilder() {
      if (rBuilder_ == null) {
        rBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.stackroute.register.rs, org.stackroute.register.rs.Builder, org.stackroute.register.rsOrBuilder>(
                r_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        r_ = null;
      }
      return rBuilder_;
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


    // @@protoc_insertion_point(builder_scope:responseMessager)
  }

  // @@protoc_insertion_point(class_scope:responseMessager)
  private static final org.stackroute.register.responseMessager DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.stackroute.register.responseMessager();
  }

  public static org.stackroute.register.responseMessager getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<responseMessager>
      PARSER = new com.google.protobuf.AbstractParser<responseMessager>() {
    @java.lang.Override
    public responseMessager parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new responseMessager(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<responseMessager> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<responseMessager> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.stackroute.register.responseMessager getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
