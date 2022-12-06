package org.stackroute.proto;

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
    comments = "Source: search.proto")
public final class searchResourceGrpc {

  private searchResourceGrpc() {}

  public static final String SERVICE_NAME = "searchResource";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.proto.Search.searchRequest,
      org.stackroute.proto.Search.searchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = org.stackroute.proto.Search.searchRequest.class,
      responseType = org.stackroute.proto.Search.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.proto.Search.searchRequest,
      org.stackroute.proto.Search.searchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.proto.Search.searchRequest, org.stackroute.proto.Search.searchResponse> getSearchMethod;
    if ((getSearchMethod = searchResourceGrpc.getSearchMethod) == null) {
      synchronized (searchResourceGrpc.class) {
        if ((getSearchMethod = searchResourceGrpc.getSearchMethod) == null) {
          searchResourceGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.proto.Search.searchRequest, org.stackroute.proto.Search.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "searchResource", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.searchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchResourceMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.proto.Search.primaryRequest,
      org.stackroute.proto.Search.primaryResponse> getPrimaryskillSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "primaryskillSearch",
      requestType = org.stackroute.proto.Search.primaryRequest.class,
      responseType = org.stackroute.proto.Search.primaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.proto.Search.primaryRequest,
      org.stackroute.proto.Search.primaryResponse> getPrimaryskillSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.proto.Search.primaryRequest, org.stackroute.proto.Search.primaryResponse> getPrimaryskillSearchMethod;
    if ((getPrimaryskillSearchMethod = searchResourceGrpc.getPrimaryskillSearchMethod) == null) {
      synchronized (searchResourceGrpc.class) {
        if ((getPrimaryskillSearchMethod = searchResourceGrpc.getPrimaryskillSearchMethod) == null) {
          searchResourceGrpc.getPrimaryskillSearchMethod = getPrimaryskillSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.proto.Search.primaryRequest, org.stackroute.proto.Search.primaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "searchResource", "primaryskillSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.primaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.primaryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchResourceMethodDescriptorSupplier("primaryskillSearch"))
                  .build();
          }
        }
     }
     return getPrimaryskillSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.proto.Search.secondaryRequest,
      org.stackroute.proto.Search.secondaryResponse> getSecondaryskillSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "secondaryskillSearch",
      requestType = org.stackroute.proto.Search.secondaryRequest.class,
      responseType = org.stackroute.proto.Search.secondaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.proto.Search.secondaryRequest,
      org.stackroute.proto.Search.secondaryResponse> getSecondaryskillSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.proto.Search.secondaryRequest, org.stackroute.proto.Search.secondaryResponse> getSecondaryskillSearchMethod;
    if ((getSecondaryskillSearchMethod = searchResourceGrpc.getSecondaryskillSearchMethod) == null) {
      synchronized (searchResourceGrpc.class) {
        if ((getSecondaryskillSearchMethod = searchResourceGrpc.getSecondaryskillSearchMethod) == null) {
          searchResourceGrpc.getSecondaryskillSearchMethod = getSecondaryskillSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.proto.Search.secondaryRequest, org.stackroute.proto.Search.secondaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "searchResource", "secondaryskillSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.secondaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.secondaryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchResourceMethodDescriptorSupplier("secondaryskillSearch"))
                  .build();
          }
        }
     }
     return getSecondaryskillSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.proto.Search.UserIdRequest,
      org.stackroute.proto.Search.userIdResponse> getUserIDSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userIDSearch",
      requestType = org.stackroute.proto.Search.UserIdRequest.class,
      responseType = org.stackroute.proto.Search.userIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.proto.Search.UserIdRequest,
      org.stackroute.proto.Search.userIdResponse> getUserIDSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.proto.Search.UserIdRequest, org.stackroute.proto.Search.userIdResponse> getUserIDSearchMethod;
    if ((getUserIDSearchMethod = searchResourceGrpc.getUserIDSearchMethod) == null) {
      synchronized (searchResourceGrpc.class) {
        if ((getUserIDSearchMethod = searchResourceGrpc.getUserIDSearchMethod) == null) {
          searchResourceGrpc.getUserIDSearchMethod = getUserIDSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.proto.Search.UserIdRequest, org.stackroute.proto.Search.userIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "searchResource", "userIDSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.userIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchResourceMethodDescriptorSupplier("userIDSearch"))
                  .build();
          }
        }
     }
     return getUserIDSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.proto.Search.designationRequest,
      org.stackroute.proto.Search.designationResponse> getDesignationSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "designationSearch",
      requestType = org.stackroute.proto.Search.designationRequest.class,
      responseType = org.stackroute.proto.Search.designationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.proto.Search.designationRequest,
      org.stackroute.proto.Search.designationResponse> getDesignationSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.proto.Search.designationRequest, org.stackroute.proto.Search.designationResponse> getDesignationSearchMethod;
    if ((getDesignationSearchMethod = searchResourceGrpc.getDesignationSearchMethod) == null) {
      synchronized (searchResourceGrpc.class) {
        if ((getDesignationSearchMethod = searchResourceGrpc.getDesignationSearchMethod) == null) {
          searchResourceGrpc.getDesignationSearchMethod = getDesignationSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.proto.Search.designationRequest, org.stackroute.proto.Search.designationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "searchResource", "designationSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.designationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.designationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchResourceMethodDescriptorSupplier("designationSearch"))
                  .build();
          }
        }
     }
     return getDesignationSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.proto.Search.JobRequest,
      org.stackroute.proto.Search.JobResponse> getJobSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "jobSearch",
      requestType = org.stackroute.proto.Search.JobRequest.class,
      responseType = org.stackroute.proto.Search.JobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.proto.Search.JobRequest,
      org.stackroute.proto.Search.JobResponse> getJobSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.proto.Search.JobRequest, org.stackroute.proto.Search.JobResponse> getJobSearchMethod;
    if ((getJobSearchMethod = searchResourceGrpc.getJobSearchMethod) == null) {
      synchronized (searchResourceGrpc.class) {
        if ((getJobSearchMethod = searchResourceGrpc.getJobSearchMethod) == null) {
          searchResourceGrpc.getJobSearchMethod = getJobSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.proto.Search.JobRequest, org.stackroute.proto.Search.JobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "searchResource", "jobSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.JobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.proto.Search.JobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchResourceMethodDescriptorSupplier("jobSearch"))
                  .build();
          }
        }
     }
     return getJobSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static searchResourceStub newStub(io.grpc.Channel channel) {
    return new searchResourceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static searchResourceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new searchResourceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static searchResourceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new searchResourceFutureStub(channel);
  }

  /**
   */
  public static abstract class searchResourceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(org.stackroute.proto.Search.searchRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void primaryskillSearch(org.stackroute.proto.Search.primaryRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.primaryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimaryskillSearchMethod(), responseObserver);
    }

    /**
     */
    public void secondaryskillSearch(org.stackroute.proto.Search.secondaryRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.secondaryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSecondaryskillSearchMethod(), responseObserver);
    }

    /**
     */
    public void userIDSearch(org.stackroute.proto.Search.UserIdRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.userIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserIDSearchMethod(), responseObserver);
    }

    /**
     */
    public void designationSearch(org.stackroute.proto.Search.designationRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.designationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDesignationSearchMethod(), responseObserver);
    }

    /**
     */
    public void jobSearch(org.stackroute.proto.Search.JobRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.JobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJobSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.proto.Search.searchRequest,
                org.stackroute.proto.Search.searchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getPrimaryskillSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.proto.Search.primaryRequest,
                org.stackroute.proto.Search.primaryResponse>(
                  this, METHODID_PRIMARYSKILL_SEARCH)))
          .addMethod(
            getSecondaryskillSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.proto.Search.secondaryRequest,
                org.stackroute.proto.Search.secondaryResponse>(
                  this, METHODID_SECONDARYSKILL_SEARCH)))
          .addMethod(
            getUserIDSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.proto.Search.UserIdRequest,
                org.stackroute.proto.Search.userIdResponse>(
                  this, METHODID_USER_IDSEARCH)))
          .addMethod(
            getDesignationSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.proto.Search.designationRequest,
                org.stackroute.proto.Search.designationResponse>(
                  this, METHODID_DESIGNATION_SEARCH)))
          .addMethod(
            getJobSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.proto.Search.JobRequest,
                org.stackroute.proto.Search.JobResponse>(
                  this, METHODID_JOB_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class searchResourceStub extends io.grpc.stub.AbstractStub<searchResourceStub> {
    private searchResourceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchResourceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchResourceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchResourceStub(channel, callOptions);
    }

    /**
     */
    public void search(org.stackroute.proto.Search.searchRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primaryskillSearch(org.stackroute.proto.Search.primaryRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.primaryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrimaryskillSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void secondaryskillSearch(org.stackroute.proto.Search.secondaryRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.secondaryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecondaryskillSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userIDSearch(org.stackroute.proto.Search.UserIdRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.userIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserIDSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void designationSearch(org.stackroute.proto.Search.designationRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.designationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDesignationSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void jobSearch(org.stackroute.proto.Search.JobRequest request,
        io.grpc.stub.StreamObserver<org.stackroute.proto.Search.JobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJobSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class searchResourceBlockingStub extends io.grpc.stub.AbstractStub<searchResourceBlockingStub> {
    private searchResourceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchResourceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchResourceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchResourceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.proto.Search.searchResponse search(org.stackroute.proto.Search.searchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.proto.Search.primaryResponse primaryskillSearch(org.stackroute.proto.Search.primaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrimaryskillSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.proto.Search.secondaryResponse secondaryskillSearch(org.stackroute.proto.Search.secondaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getSecondaryskillSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.proto.Search.userIdResponse userIDSearch(org.stackroute.proto.Search.UserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getUserIDSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.proto.Search.designationResponse designationSearch(org.stackroute.proto.Search.designationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDesignationSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.proto.Search.JobResponse jobSearch(org.stackroute.proto.Search.JobRequest request) {
      return blockingUnaryCall(
          getChannel(), getJobSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class searchResourceFutureStub extends io.grpc.stub.AbstractStub<searchResourceFutureStub> {
    private searchResourceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchResourceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchResourceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchResourceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.proto.Search.searchResponse> search(
        org.stackroute.proto.Search.searchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.proto.Search.primaryResponse> primaryskillSearch(
        org.stackroute.proto.Search.primaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrimaryskillSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.proto.Search.secondaryResponse> secondaryskillSearch(
        org.stackroute.proto.Search.secondaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSecondaryskillSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.proto.Search.userIdResponse> userIDSearch(
        org.stackroute.proto.Search.UserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUserIDSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.proto.Search.designationResponse> designationSearch(
        org.stackroute.proto.Search.designationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDesignationSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.proto.Search.JobResponse> jobSearch(
        org.stackroute.proto.Search.JobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJobSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;
  private static final int METHODID_PRIMARYSKILL_SEARCH = 1;
  private static final int METHODID_SECONDARYSKILL_SEARCH = 2;
  private static final int METHODID_USER_IDSEARCH = 3;
  private static final int METHODID_DESIGNATION_SEARCH = 4;
  private static final int METHODID_JOB_SEARCH = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final searchResourceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(searchResourceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((org.stackroute.proto.Search.searchRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.proto.Search.searchResponse>) responseObserver);
          break;
        case METHODID_PRIMARYSKILL_SEARCH:
          serviceImpl.primaryskillSearch((org.stackroute.proto.Search.primaryRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.proto.Search.primaryResponse>) responseObserver);
          break;
        case METHODID_SECONDARYSKILL_SEARCH:
          serviceImpl.secondaryskillSearch((org.stackroute.proto.Search.secondaryRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.proto.Search.secondaryResponse>) responseObserver);
          break;
        case METHODID_USER_IDSEARCH:
          serviceImpl.userIDSearch((org.stackroute.proto.Search.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.proto.Search.userIdResponse>) responseObserver);
          break;
        case METHODID_DESIGNATION_SEARCH:
          serviceImpl.designationSearch((org.stackroute.proto.Search.designationRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.proto.Search.designationResponse>) responseObserver);
          break;
        case METHODID_JOB_SEARCH:
          serviceImpl.jobSearch((org.stackroute.proto.Search.JobRequest) request,
              (io.grpc.stub.StreamObserver<org.stackroute.proto.Search.JobResponse>) responseObserver);
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

  private static abstract class searchResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    searchResourceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.proto.Search.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("searchResource");
    }
  }

  private static final class searchResourceFileDescriptorSupplier
      extends searchResourceBaseDescriptorSupplier {
    searchResourceFileDescriptorSupplier() {}
  }

  private static final class searchResourceMethodDescriptorSupplier
      extends searchResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    searchResourceMethodDescriptorSupplier(String methodName) {
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
      synchronized (searchResourceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new searchResourceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .addMethod(getPrimaryskillSearchMethod())
              .addMethod(getSecondaryskillSearchMethod())
              .addMethod(getUserIDSearchMethod())
              .addMethod(getDesignationSearchMethod())
              .addMethod(getJobSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
