// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userAuth.proto

package org.stackroute.userAuthentication;

public final class UserAuth {
  private UserAuth() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_adduser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_adduser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_APIresponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_APIresponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_checkuser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_checkuser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_checkresponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_checkresponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016userAuth.proto\"\034\n\007request\022\021\n\tuserEmail" +
      "\030\001 \001(\t\"\027\n\010response\022\013\n\003otp\030\001 \001(\003\".\n\007addus" +
      "er\022\021\n\tuserEmail\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"" +
      "<\n\013APIresponse\022\027\n\017responseMessage\030\001 \001(\t\022" +
      "\024\n\014responseCode\030\002 \001(\005\"0\n\tcheckuser\022\021\n\tus" +
      "erEmail\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\">\n\rcheck" +
      "response\022\027\n\017responseMessage\030\001 \001(\t\022\024\n\014res" +
      "ponseCode\030\002 \001(\0052\202\001\n\010userauth\022*\n\020userRegi" +
      "stration\022\010.adduser\032\014.APIresponse\022#\n\005logi" +
      "n\022\n.checkuser\032\016.checkresponse\022%\n\016forgotP" +
      "assword\022\010.request\032\t.responseB%\n!org.stac" +
      "kroute.userAuthenticationP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_request_descriptor,
        new java.lang.String[] { "UserEmail", });
    internal_static_response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_response_descriptor,
        new java.lang.String[] { "Otp", });
    internal_static_adduser_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_adduser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_adduser_descriptor,
        new java.lang.String[] { "UserEmail", "Password", });
    internal_static_APIresponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_APIresponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_APIresponse_descriptor,
        new java.lang.String[] { "ResponseMessage", "ResponseCode", });
    internal_static_checkuser_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_checkuser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_checkuser_descriptor,
        new java.lang.String[] { "UserEmail", "Password", });
    internal_static_checkresponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_checkresponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_checkresponse_descriptor,
        new java.lang.String[] { "ResponseMessage", "ResponseCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
