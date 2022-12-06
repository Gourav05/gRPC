package org.stackroute.register;

import java.sql.SQLException;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userservice.proto")
public final class userServiceGrpc {

  private userServiceGrpc() {}

  public static final String SERVICE_NAME = "userService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.updateRequest,
      org.stackroute.register.updateResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = org.stackroute.register.updateRequest.class,
      responseType = org.stackroute.register.updateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.updateRequest,
      org.stackroute.register.updateResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.updateRequest, org.stackroute.register.updateResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = userServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUpdateUserMethod = userServiceGrpc.getUpdateUserMethod) == null) {
          userServiceGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.updateRequest, org.stackroute.register.updateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.updateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.updateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("updateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.deleteRequest,
      org.stackroute.register.deleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = org.stackroute.register.deleteRequest.class,
      responseType = org.stackroute.register.deleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.deleteRequest,
      org.stackroute.register.deleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.deleteRequest, org.stackroute.register.deleteResponse> getDeleteMethod;
    if ((getDeleteMethod = userServiceGrpc.getDeleteMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getDeleteMethod = userServiceGrpc.getDeleteMethod) == null) {
          userServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.deleteRequest, org.stackroute.register.deleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.deleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.deleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.searchMessage,
      org.stackroute.register.searchAPIResponse> getSearchByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByEmail",
      requestType = org.stackroute.register.searchMessage.class,
      responseType = org.stackroute.register.searchAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.searchMessage,
      org.stackroute.register.searchAPIResponse> getSearchByEmailMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.searchMessage, org.stackroute.register.searchAPIResponse> getSearchByEmailMethod;
    if ((getSearchByEmailMethod = userServiceGrpc.getSearchByEmailMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getSearchByEmailMethod = userServiceGrpc.getSearchByEmailMethod) == null) {
          userServiceGrpc.getSearchByEmailMethod = getSearchByEmailMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.searchMessage, org.stackroute.register.searchAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "searchByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.searchMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.searchAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("searchByEmail"))
                  .build();
          }
        }
     }
     return getSearchByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.requestMessage,
      org.stackroute.register.responseMessager> getPrimaryskillSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "primaryskillSearch",
      requestType = org.stackroute.register.requestMessage.class,
      responseType = org.stackroute.register.responseMessager.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.requestMessage,
      org.stackroute.register.responseMessager> getPrimaryskillSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.requestMessage, org.stackroute.register.responseMessager> getPrimaryskillSearchMethod;
    if ((getPrimaryskillSearchMethod = userServiceGrpc.getPrimaryskillSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getPrimaryskillSearchMethod = userServiceGrpc.getPrimaryskillSearchMethod) == null) {
          userServiceGrpc.getPrimaryskillSearchMethod = getPrimaryskillSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.requestMessage, org.stackroute.register.responseMessager>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "primaryskillSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.requestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.responseMessager.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("primaryskillSearch"))
                  .build();
          }
        }
     }
     return getPrimaryskillSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.requestMessage1,
      org.stackroute.register.responseMessage1> getSecondaryskillSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "secondaryskillSearch",
      requestType = org.stackroute.register.requestMessage1.class,
      responseType = org.stackroute.register.responseMessage1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.requestMessage1,
      org.stackroute.register.responseMessage1> getSecondaryskillSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.requestMessage1, org.stackroute.register.responseMessage1> getSecondaryskillSearchMethod;
    if ((getSecondaryskillSearchMethod = userServiceGrpc.getSecondaryskillSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getSecondaryskillSearchMethod = userServiceGrpc.getSecondaryskillSearchMethod) == null) {
          userServiceGrpc.getSecondaryskillSearchMethod = getSecondaryskillSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.requestMessage1, org.stackroute.register.responseMessage1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "secondaryskillSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.requestMessage1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.responseMessage1.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("secondaryskillSearch"))
                  .build();
          }
        }
     }
     return getSecondaryskillSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.requestMessage2,
      org.stackroute.register.responseMessage2> getUserIDSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userIDSearch",
      requestType = org.stackroute.register.requestMessage2.class,
      responseType = org.stackroute.register.responseMessage2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.requestMessage2,
      org.stackroute.register.responseMessage2> getUserIDSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.requestMessage2, org.stackroute.register.responseMessage2> getUserIDSearchMethod;
    if ((getUserIDSearchMethod = userServiceGrpc.getUserIDSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUserIDSearchMethod = userServiceGrpc.getUserIDSearchMethod) == null) {
          userServiceGrpc.getUserIDSearchMethod = getUserIDSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.requestMessage2, org.stackroute.register.responseMessage2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "userIDSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.requestMessage2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.responseMessage2.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("userIDSearch"))
                  .build();
          }
        }
     }
     return getUserIDSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.requestMessage3,
      org.stackroute.register.responseMessage3> getDesignationSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "designationSearch",
      requestType = org.stackroute.register.requestMessage3.class,
      responseType = org.stackroute.register.responseMessage3.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.requestMessage3,
      org.stackroute.register.responseMessage3> getDesignationSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.requestMessage3, org.stackroute.register.responseMessage3> getDesignationSearchMethod;
    if ((getDesignationSearchMethod = userServiceGrpc.getDesignationSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getDesignationSearchMethod = userServiceGrpc.getDesignationSearchMethod) == null) {
          userServiceGrpc.getDesignationSearchMethod = getDesignationSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.requestMessage3, org.stackroute.register.responseMessage3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "designationSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.requestMessage3.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.responseMessage3.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("designationSearch"))
                  .build();
          }
        }
     }
     return getDesignationSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.empty,
      org.stackroute.register.userIdResponse> getAllUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allUserId",
      requestType = org.stackroute.register.empty.class,
      responseType = org.stackroute.register.userIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.empty,
      org.stackroute.register.userIdResponse> getAllUserIdMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.empty, org.stackroute.register.userIdResponse> getAllUserIdMethod;
    if ((getAllUserIdMethod = userServiceGrpc.getAllUserIdMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getAllUserIdMethod = userServiceGrpc.getAllUserIdMethod) == null) {
          userServiceGrpc.getAllUserIdMethod = getAllUserIdMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.empty, org.stackroute.register.userIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "allUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.userIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("allUserId"))
                  .build();
          }
        }
     }
     return getAllUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.register.allMessage,
      org.stackroute.register.allResponse> getAllSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allSearch",
      requestType = org.stackroute.register.allMessage.class,
      responseType = org.stackroute.register.allResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.register.allMessage,
      org.stackroute.register.allResponse> getAllSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.register.allMessage, org.stackroute.register.allResponse> getAllSearchMethod;
    if ((getAllSearchMethod = userServiceGrpc.getAllSearchMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getAllSearchMethod = userServiceGrpc.getAllSearchMethod) == null) {
          userServiceGrpc.getAllSearchMethod = getAllSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.register.allMessage, org.stackroute.register.allResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "allSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.allMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.register.allResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("allSearch"))
                  .build();
          }
        }
     }
     return getAllSearchMethod;
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
   */
  public static abstract class userServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *rpc addUserDetails(adduser) returns (APIresponse);
     * </pre>
     */
    public void updateUser(org.stackroute.register.updateRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.updateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void delete(org.stackroute.register.deleteRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.deleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void searchByEmail(org.stackroute.register.searchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.searchAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchByEmailMethod(), responseObserver);
    }

    /**
     */
    public void primaryskillSearch(org.stackroute.register.requestMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessager> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimaryskillSearchMethod(), responseObserver);
    }

    /**
     */
    public void secondaryskillSearch(org.stackroute.register.requestMessage1 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage1> responseObserver) {
      asyncUnimplementedUnaryCall(getSecondaryskillSearchMethod(), responseObserver);
    }

    /**
     */
    public void userIDSearch(org.stackroute.register.requestMessage2 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage2> responseObserver) {
      asyncUnimplementedUnaryCall(getUserIDSearchMethod(), responseObserver);
    }

    /**
     */
    public void designationSearch(org.stackroute.register.requestMessage3 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage3> responseObserver) {
      asyncUnimplementedUnaryCall(getDesignationSearchMethod(), responseObserver);
    }

    /**
     */
    public void allUserId(org.stackroute.register.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.register.userIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllUserIdMethod(), responseObserver);
    }

    /**
     */
    public void allSearch(org.stackroute.register.allMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.allResponse> responseObserver) throws SQLException {
      asyncUnimplementedUnaryCall(getAllSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.updateRequest,
                org.stackroute.register.updateResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.deleteRequest,
                org.stackroute.register.deleteResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getSearchByEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.searchMessage,
                org.stackroute.register.searchAPIResponse>(
                  this, METHODID_SEARCH_BY_EMAIL)))
          .addMethod(
            getPrimaryskillSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.requestMessage,
                org.stackroute.register.responseMessager>(
                  this, METHODID_PRIMARYSKILL_SEARCH)))
          .addMethod(
            getSecondaryskillSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.requestMessage1,
                org.stackroute.register.responseMessage1>(
                  this, METHODID_SECONDARYSKILL_SEARCH)))
          .addMethod(
            getUserIDSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.requestMessage2,
                org.stackroute.register.responseMessage2>(
                  this, METHODID_USER_IDSEARCH)))
          .addMethod(
            getDesignationSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.requestMessage3,
                org.stackroute.register.responseMessage3>(
                  this, METHODID_DESIGNATION_SEARCH)))
          .addMethod(
            getAllUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.empty,
                org.stackroute.register.userIdResponse>(
                  this, METHODID_ALL_USER_ID)))
          .addMethod(
            getAllSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.register.allMessage,
                org.stackroute.register.allResponse>(
                  this, METHODID_ALL_SEARCH)))
          .build();
    }
  }

  /**
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
     * <pre>
     *rpc addUserDetails(adduser) returns (APIresponse);
     * </pre>
     */
    public void updateUser(org.stackroute.register.updateRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.updateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(org.stackroute.register.deleteRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.register.deleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchByEmail(org.stackroute.register.searchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.searchAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primaryskillSearch(org.stackroute.register.requestMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessager> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrimaryskillSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void secondaryskillSearch(org.stackroute.register.requestMessage1 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecondaryskillSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userIDSearch(org.stackroute.register.requestMessage2 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserIDSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void designationSearch(org.stackroute.register.requestMessage3 request,
        io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage3> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDesignationSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allUserId(org.stackroute.register.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.register.userIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allSearch(org.stackroute.register.allMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.register.allResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
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
     * <pre>
     *rpc addUserDetails(adduser) returns (APIresponse);
     * </pre>
     */
    public org.stackroute.register.updateResponse updateUser(org.stackroute.register.updateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.deleteResponse delete(org.stackroute.register.deleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.searchAPIResponse searchByEmail(org.stackroute.register.searchMessage request) {
      return blockingUnaryCall(
          getChannel(), getSearchByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.responseMessager primaryskillSearch(org.stackroute.register.requestMessage request) {
      return blockingUnaryCall(
          getChannel(), getPrimaryskillSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.responseMessage1 secondaryskillSearch(org.stackroute.register.requestMessage1 request) {
      return blockingUnaryCall(
          getChannel(), getSecondaryskillSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.responseMessage2 userIDSearch(org.stackroute.register.requestMessage2 request) {
      return blockingUnaryCall(
          getChannel(), getUserIDSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.responseMessage3 designationSearch(org.stackroute.register.requestMessage3 request) {
      return blockingUnaryCall(
          getChannel(), getDesignationSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.userIdResponse allUserId(org.stackroute.register.empty request) {
      return blockingUnaryCall(
          getChannel(), getAllUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.register.allResponse allSearch(org.stackroute.register.allMessage request) {
      return blockingUnaryCall(
          getChannel(), getAllSearchMethod(), getCallOptions(), request);
    }
  }

  /**
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
     * <pre>
     *rpc addUserDetails(adduser) returns (APIresponse);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.updateResponse> updateUser(
        org.stackroute.register.updateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.deleteResponse> delete(
        org.stackroute.register.deleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.searchAPIResponse> searchByEmail(
        org.stackroute.register.searchMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.responseMessager> primaryskillSearch(
        org.stackroute.register.requestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getPrimaryskillSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.responseMessage1> secondaryskillSearch(
        org.stackroute.register.requestMessage1 request) {
      return futureUnaryCall(
          getChannel().newCall(getSecondaryskillSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.responseMessage2> userIDSearch(
        org.stackroute.register.requestMessage2 request) {
      return futureUnaryCall(
          getChannel().newCall(getUserIDSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.responseMessage3> designationSearch(
        org.stackroute.register.requestMessage3 request) {
      return futureUnaryCall(
          getChannel().newCall(getDesignationSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.userIdResponse> allUserId(
        org.stackroute.register.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.register.allResponse> allSearch(
        org.stackroute.register.allMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getAllSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_USER = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_SEARCH_BY_EMAIL = 2;
  private static final int METHODID_PRIMARYSKILL_SEARCH = 3;
  private static final int METHODID_SECONDARYSKILL_SEARCH = 4;
  private static final int METHODID_USER_IDSEARCH = 5;
  private static final int METHODID_DESIGNATION_SEARCH = 6;
  private static final int METHODID_ALL_USER_ID = 7;
  private static final int METHODID_ALL_SEARCH = 8;

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
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((org.stackroute.register.updateRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.updateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.stackroute.register.deleteRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.deleteResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BY_EMAIL:
          serviceImpl.searchByEmail((org.stackroute.register.searchMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.searchAPIResponse>) responseObserver);
          break;
        case METHODID_PRIMARYSKILL_SEARCH:
          serviceImpl.primaryskillSearch((org.stackroute.register.requestMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.responseMessager>) responseObserver);
          break;
        case METHODID_SECONDARYSKILL_SEARCH:
          serviceImpl.secondaryskillSearch((org.stackroute.register.requestMessage1) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage1>) responseObserver);
          break;
        case METHODID_USER_IDSEARCH:
          serviceImpl.userIDSearch((org.stackroute.register.requestMessage2) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage2>) responseObserver);
          break;
        case METHODID_DESIGNATION_SEARCH:
          serviceImpl.designationSearch((org.stackroute.register.requestMessage3) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.responseMessage3>) responseObserver);
          break;
        case METHODID_ALL_USER_ID:
          serviceImpl.allUserId((org.stackroute.register.empty) request,
              (io.grpc.stub.StreamObserver<org.stackroute.register.userIdResponse>) responseObserver);
          break;
        case METHODID_ALL_SEARCH:
          try {
            serviceImpl.allSearch((allMessage) request,
                (io.grpc.stub.StreamObserver<allResponse>) responseObserver);
          } catch (SQLException e) {
            throw new RuntimeException(e);
          }
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
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getSearchByEmailMethod())
              .addMethod(getPrimaryskillSearchMethod())
              .addMethod(getSecondaryskillSearchMethod())
              .addMethod(getUserIDSearchMethod())
              .addMethod(getDesignationSearchMethod())
              .addMethod(getAllUserIdMethod())
              .addMethod(getAllSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
