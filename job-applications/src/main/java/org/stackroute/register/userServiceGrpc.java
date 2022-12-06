package org.stackroute.register;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *option java_multiple_files = true;
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userservice.proto")
public final class userServiceGrpc {

  private userServiceGrpc() {}

  public static final String SERVICE_NAME = "userService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.adduser,
      org.stackroute.register.Userservice.APIresponse> getAddUserDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUserDetails",
      requestType = org.stackroute.register.Userservice.adduser.class,
      responseType = org.stackroute.register.Userservice.APIresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.adduser,
      org.stackroute.register.Userservice.APIresponse> getAddUserDetailsMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.adduser, org.stackroute.register.Userservice.APIresponse> getAddUserDetailsMethod;
    if ((getAddUserDetailsMethod = userServiceGrpc.getAddUserDetailsMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getAddUserDetailsMethod = userServiceGrpc.getAddUserDetailsMethod) == null) {
          userServiceGrpc.getAddUserDetailsMethod = getAddUserDetailsMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.adduser, org.stackroute.register.Userservice.APIresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "addUserDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.adduser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.APIresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("addUserDetails"))
                  .build();
          }
        }
     }
     return getAddUserDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.updateRequest,
      org.stackroute.register.Userservice.updateResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = org.stackroute.register.Userservice.updateRequest.class,
      responseType = org.stackroute.register.Userservice.updateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.updateRequest,
      org.stackroute.register.Userservice.updateResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.updateRequest, org.stackroute.register.Userservice.updateResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = userServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUpdateUserMethod = userServiceGrpc.getUpdateUserMethod) == null) {
          userServiceGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.updateRequest, org.stackroute.register.Userservice.updateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.updateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.updateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("updateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.deleteRequest,
      org.stackroute.register.Userservice.deleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = org.stackroute.register.Userservice.deleteRequest.class,
      responseType = org.stackroute.register.Userservice.deleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.deleteRequest,
      org.stackroute.register.Userservice.deleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.deleteRequest, org.stackroute.register.Userservice.deleteResponse> getDeleteMethod;
    if ((getDeleteMethod = userServiceGrpc.getDeleteMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getDeleteMethod = userServiceGrpc.getDeleteMethod) == null) {
          userServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.deleteRequest, org.stackroute.register.Userservice.deleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.deleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.deleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.searchMessage,
      org.stackroute.register.Userservice.searchAPIResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = org.stackroute.register.Userservice.searchMessage.class,
      responseType = org.stackroute.register.Userservice.searchAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.searchMessage,
      org.stackroute.register.Userservice.searchAPIResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.searchMessage, org.stackroute.register.Userservice.searchAPIResponse> getSearchMethod;
    if ((getSearchMethod = userServiceGrpc.getSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getSearchMethod = userServiceGrpc.getSearchMethod) == null) {
          userServiceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.searchMessage, org.stackroute.register.Userservice.searchAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.searchMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.searchAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage,
      org.stackroute.register.Userservice.responseMessage> getPrimaryskillSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "primaryskillSearch",
      requestType = org.stackroute.register.Userservice.requestMessage.class,
      responseType = org.stackroute.register.Userservice.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage,
      org.stackroute.register.Userservice.responseMessage> getPrimaryskillSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage, org.stackroute.register.Userservice.responseMessage> getPrimaryskillSearchMethod;
    if ((getPrimaryskillSearchMethod = userServiceGrpc.getPrimaryskillSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getPrimaryskillSearchMethod = userServiceGrpc.getPrimaryskillSearchMethod) == null) {
          userServiceGrpc.getPrimaryskillSearchMethod = getPrimaryskillSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.requestMessage, org.stackroute.register.Userservice.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "primaryskillSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.requestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("primaryskillSearch"))
                  .build();
          }
        }
     }
     return getPrimaryskillSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage1,
      org.stackroute.register.Userservice.responseMessage1> getSecondaryskillSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "secondaryskillSearch",
      requestType = org.stackroute.register.Userservice.requestMessage1.class,
      responseType = org.stackroute.register.Userservice.responseMessage1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage1,
      org.stackroute.register.Userservice.responseMessage1> getSecondaryskillSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage1, org.stackroute.register.Userservice.responseMessage1> getSecondaryskillSearchMethod;
    if ((getSecondaryskillSearchMethod = userServiceGrpc.getSecondaryskillSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getSecondaryskillSearchMethod = userServiceGrpc.getSecondaryskillSearchMethod) == null) {
          userServiceGrpc.getSecondaryskillSearchMethod = getSecondaryskillSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.requestMessage1, org.stackroute.register.Userservice.responseMessage1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "secondaryskillSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.requestMessage1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.responseMessage1.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("secondaryskillSearch"))
                  .build();
          }
        }
     }
     return getSecondaryskillSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage2,
      org.stackroute.register.Userservice.responseMessage2> getUserIDSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userIDSearch",
      requestType = org.stackroute.register.Userservice.requestMessage2.class,
      responseType = org.stackroute.register.Userservice.responseMessage2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage2,
      org.stackroute.register.Userservice.responseMessage2> getUserIDSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage2, org.stackroute.register.Userservice.responseMessage2> getUserIDSearchMethod;
    if ((getUserIDSearchMethod = userServiceGrpc.getUserIDSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUserIDSearchMethod = userServiceGrpc.getUserIDSearchMethod) == null) {
          userServiceGrpc.getUserIDSearchMethod = getUserIDSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.requestMessage2, org.stackroute.register.Userservice.responseMessage2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "userIDSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.requestMessage2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.responseMessage2.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("userIDSearch"))
                  .build();
          }
        }
     }
     return getUserIDSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage3,
      org.stackroute.register.Userservice.responseMessage3> getDesignationSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "designationSearch",
      requestType = org.stackroute.register.Userservice.requestMessage3.class,
      responseType = org.stackroute.register.Userservice.responseMessage3.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage3,
      org.stackroute.register.Userservice.responseMessage3> getDesignationSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.requestMessage3, org.stackroute.register.Userservice.responseMessage3> getDesignationSearchMethod;
    if ((getDesignationSearchMethod = userServiceGrpc.getDesignationSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getDesignationSearchMethod = userServiceGrpc.getDesignationSearchMethod) == null) {
          userServiceGrpc.getDesignationSearchMethod = getDesignationSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.requestMessage3, org.stackroute.register.Userservice.responseMessage3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "designationSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.requestMessage3.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.responseMessage3.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("designationSearch"))
                  .build();
          }
        }
     }
     return getDesignationSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.Userservice.empty,
      org.stackroute.register.Userservice.userIdResponse> getAllUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allUserId",
      requestType = org.stackroute.register.Userservice.empty.class,
      responseType = org.stackroute.register.Userservice.userIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.Userservice.empty,
      org.stackroute.register.Userservice.userIdResponse> getAllUserIdMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.Userservice.empty, org.stackroute.register.Userservice.userIdResponse> getAllUserIdMethod;
    if ((getAllUserIdMethod = userServiceGrpc.getAllUserIdMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getAllUserIdMethod = userServiceGrpc.getAllUserIdMethod) == null) {
          userServiceGrpc.getAllUserIdMethod = getAllUserIdMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.Userservice.empty, org.stackroute.register.Userservice.userIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "allUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.Userservice.userIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("allUserId"))
                  .build();
          }
        }
     }
     return getAllUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userServiceStub newStub(io.grpc.Channel channel) {
    return new userServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userServiceFutureStub(channel);
  }

  /**
   * <pre>
   *option java_multiple_files = true;
   * </pre>
   */
  public static abstract class userServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUserDetails(org.stackroute.register.Userservice.adduser request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.APIresponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserDetailsMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(org.stackroute.register.Userservice.updateRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.updateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void delete(org.stackroute.register.Userservice.deleteRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.deleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void search(org.stackroute.register.Userservice.searchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.searchAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void primaryskillSearch(org.stackroute.register.Userservice.requestMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimaryskillSearchMethod(), responseObserver);
    }

    /**
     */
    public void secondaryskillSearch(org.stackroute.register.Userservice.requestMessage1 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage1> responseObserver) {
      asyncUnimplementedUnaryCall(getSecondaryskillSearchMethod(), responseObserver);
    }

    /**
     */
    public void userIDSearch(org.stackroute.register.Userservice.requestMessage2 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage2> responseObserver) {
      asyncUnimplementedUnaryCall(getUserIDSearchMethod(), responseObserver);
    }

    /**
     */
    public void designationSearch(org.stackroute.register.Userservice.requestMessage3 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage3> responseObserver) {
      asyncUnimplementedUnaryCall(getDesignationSearchMethod(), responseObserver);
    }

    /**
     */
    public void allUserId(org.stackroute.register.Userservice.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.userIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllUserIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.adduser,
                org.stackroute.register.Userservice.APIresponse>(
                  this, METHODID_ADD_USER_DETAILS)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.updateRequest,
                org.stackroute.register.Userservice.updateResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.deleteRequest,
                org.stackroute.register.Userservice.deleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.searchMessage,
                org.stackroute.register.Userservice.searchAPIResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getPrimaryskillSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.requestMessage,
                org.stackroute.register.Userservice.responseMessage>(
                  this, METHODID_PRIMARYSKILL_SEARCH)))
          .addMethod(
            getSecondaryskillSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.requestMessage1,
                org.stackroute.register.Userservice.responseMessage1>(
                  this, METHODID_SECONDARYSKILL_SEARCH)))
          .addMethod(
            getUserIDSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.requestMessage2,
                org.stackroute.register.Userservice.responseMessage2>(
                  this, METHODID_USER_IDSEARCH)))
          .addMethod(
            getDesignationSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.requestMessage3,
                org.stackroute.register.Userservice.responseMessage3>(
                  this, METHODID_DESIGNATION_SEARCH)))
          .addMethod(
            getAllUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.Userservice.empty,
                org.stackroute.register.Userservice.userIdResponse>(
                  this, METHODID_ALL_USER_ID)))
          .build();
    }
  }

  /**
   * <pre>
   *option java_multiple_files = true;
   * </pre>
   */
  public static final class userServiceStub extends io.grpc.stub.AbstractStub<userServiceStub> {
    private userServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUserDetails(org.stackroute.register.Userservice.adduser request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.APIresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(org.stackroute.register.Userservice.updateRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.updateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(org.stackroute.register.Userservice.deleteRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.deleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(org.stackroute.register.Userservice.searchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.searchAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primaryskillSearch(org.stackroute.register.Userservice.requestMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrimaryskillSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void secondaryskillSearch(org.stackroute.register.Userservice.requestMessage1 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecondaryskillSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userIDSearch(org.stackroute.register.Userservice.requestMessage2 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserIDSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void designationSearch(org.stackroute.register.Userservice.requestMessage3 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage3> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDesignationSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allUserId(org.stackroute.register.Userservice.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.userIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *option java_multiple_files = true;
   * </pre>
   */
  public static final class userServiceBlockingStub extends io.grpc.stub.AbstractStub<userServiceBlockingStub> {
    private userServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.register.Userservice.APIresponse addUserDetails(org.stackroute.register.Userservice.adduser request) {
      return blockingUnaryCall(
          getChannel(), getAddUserDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.updateResponse updateUser(org.stackroute.register.Userservice.updateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.deleteResponse delete(org.stackroute.register.Userservice.deleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.searchAPIResponse search(org.stackroute.register.Userservice.searchMessage request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.responseMessage primaryskillSearch(org.stackroute.register.Userservice.requestMessage request) {
      return blockingUnaryCall(
          getChannel(), getPrimaryskillSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.responseMessage1 secondaryskillSearch(org.stackroute.register.Userservice.requestMessage1 request) {
      return blockingUnaryCall(
          getChannel(), getSecondaryskillSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.responseMessage2 userIDSearch(org.stackroute.register.Userservice.requestMessage2 request) {
      return blockingUnaryCall(
          getChannel(), getUserIDSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.responseMessage3 designationSearch(org.stackroute.register.Userservice.requestMessage3 request) {
      return blockingUnaryCall(
          getChannel(), getDesignationSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.Userservice.userIdResponse allUserId(org.stackroute.register.Userservice.empty request) {
      return blockingUnaryCall(
          getChannel(), getAllUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *option java_multiple_files = true;
   * </pre>
   */
  public static final class userServiceFutureStub extends io.grpc.stub.AbstractStub<userServiceFutureStub> {
    private userServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.APIresponse> addUserDetails(
        org.stackroute.register.Userservice.adduser request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.updateResponse> updateUser(
        org.stackroute.register.Userservice.updateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.deleteResponse> delete(
        org.stackroute.register.Userservice.deleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.searchAPIResponse> search(
        org.stackroute.register.Userservice.searchMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.responseMessage> primaryskillSearch(
        org.stackroute.register.Userservice.requestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getPrimaryskillSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.responseMessage1> secondaryskillSearch(
        org.stackroute.register.Userservice.requestMessage1 request) {
      return futureUnaryCall(
          getChannel().newCall(getSecondaryskillSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.responseMessage2> userIDSearch(
        org.stackroute.register.Userservice.requestMessage2 request) {
      return futureUnaryCall(
          getChannel().newCall(getUserIDSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.responseMessage3> designationSearch(
        org.stackroute.register.Userservice.requestMessage3 request) {
      return futureUnaryCall(
          getChannel().newCall(getDesignationSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.Userservice.userIdResponse> allUserId(
        org.stackroute.register.Userservice.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllUserIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER_DETAILS = 0;
  private static final int METHODID_UPDATE_USER = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_SEARCH = 3;
  private static final int METHODID_PRIMARYSKILL_SEARCH = 4;
  private static final int METHODID_SECONDARYSKILL_SEARCH = 5;
  private static final int METHODID_USER_IDSEARCH = 6;
  private static final int METHODID_DESIGNATION_SEARCH = 7;
  private static final int METHODID_ALL_USER_ID = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER_DETAILS:
          serviceImpl.addUserDetails((org.stackroute.register.Userservice.adduser) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.APIresponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((org.stackroute.register.Userservice.updateRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.updateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.stackroute.register.Userservice.deleteRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.deleteResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((org.stackroute.register.Userservice.searchMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.searchAPIResponse>) responseObserver);
          break;
        case METHODID_PRIMARYSKILL_SEARCH:
          serviceImpl.primaryskillSearch((org.stackroute.register.Userservice.requestMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage>) responseObserver);
          break;
        case METHODID_SECONDARYSKILL_SEARCH:
          serviceImpl.secondaryskillSearch((org.stackroute.register.Userservice.requestMessage1) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage1>) responseObserver);
          break;
        case METHODID_USER_IDSEARCH:
          serviceImpl.userIDSearch((org.stackroute.register.Userservice.requestMessage2) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage2>) responseObserver);
          break;
        case METHODID_DESIGNATION_SEARCH:
          serviceImpl.designationSearch((org.stackroute.register.Userservice.requestMessage3) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.responseMessage3>) responseObserver);
          break;
        case METHODID_ALL_USER_ID:
          serviceImpl.allUserId((org.stackroute.register.Userservice.empty) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.Userservice.userIdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.register.Userservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userService");
    }
  }

  private static final class userServiceFileDescriptorSupplier
      extends userServiceBaseDescriptorSupplier {
    userServiceFileDescriptorSupplier() {}
  }

  private static final class userServiceMethodDescriptorSupplier
      extends userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (userServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userServiceFileDescriptorSupplier())
              .addMethod(getAddUserDetailsMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getSearchMethod())
              .addMethod(getPrimaryskillSearchMethod())
              .addMethod(getSecondaryskillSearchMethod())
              .addMethod(getUserIDSearchMethod())
              .addMethod(getDesignationSearchMethod())
              .addMethod(getAllUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
