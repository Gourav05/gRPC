package org.stackroute.jobPosting;

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
    comments = "Source: jobposting.proto")
public final class jobPostingGrpc {

  private jobPostingGrpc() {}

  public static final String SERVICE_NAME = "jobPosting";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataAdd,
      org.stackroute.jobPosting.Jobposting.APIResponse> getAddPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPost",
      requestType = org.stackroute.jobPosting.Jobposting.dataAdd.class,
      responseType = org.stackroute.jobPosting.Jobposting.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataAdd,
      org.stackroute.jobPosting.Jobposting.APIResponse> getAddPostMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataAdd, org.stackroute.jobPosting.Jobposting.APIResponse> getAddPostMethod;
    if ((getAddPostMethod = jobPostingGrpc.getAddPostMethod) == null) {
      synchronized (jobPostingGrpc.class) {
        if ((getAddPostMethod = jobPostingGrpc.getAddPostMethod) == null) {
          jobPostingGrpc.getAddPostMethod = getAddPostMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobPosting.Jobposting.dataAdd, org.stackroute.jobPosting.Jobposting.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobPosting", "addPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.dataAdd.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobPostingMethodDescriptorSupplier("addPost"))
                  .build();
          }
        }
     }
     return getAddPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataUpdate,
      org.stackroute.jobPosting.Jobposting.APIResponse> getUpdatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePost",
      requestType = org.stackroute.jobPosting.Jobposting.dataUpdate.class,
      responseType = org.stackroute.jobPosting.Jobposting.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataUpdate,
      org.stackroute.jobPosting.Jobposting.APIResponse> getUpdatePostMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataUpdate, org.stackroute.jobPosting.Jobposting.APIResponse> getUpdatePostMethod;
    if ((getUpdatePostMethod = jobPostingGrpc.getUpdatePostMethod) == null) {
      synchronized (jobPostingGrpc.class) {
        if ((getUpdatePostMethod = jobPostingGrpc.getUpdatePostMethod) == null) {
          jobPostingGrpc.getUpdatePostMethod = getUpdatePostMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobPosting.Jobposting.dataUpdate, org.stackroute.jobPosting.Jobposting.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobPosting", "updatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.dataUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobPostingMethodDescriptorSupplier("updatePost"))
                  .build();
          }
        }
     }
     return getUpdatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataDelete,
      org.stackroute.jobPosting.Jobposting.APIResponse> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePost",
      requestType = org.stackroute.jobPosting.Jobposting.dataDelete.class,
      responseType = org.stackroute.jobPosting.Jobposting.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataDelete,
      org.stackroute.jobPosting.Jobposting.APIResponse> getDeletePostMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.dataDelete, org.stackroute.jobPosting.Jobposting.APIResponse> getDeletePostMethod;
    if ((getDeletePostMethod = jobPostingGrpc.getDeletePostMethod) == null) {
      synchronized (jobPostingGrpc.class) {
        if ((getDeletePostMethod = jobPostingGrpc.getDeletePostMethod) == null) {
          jobPostingGrpc.getDeletePostMethod = getDeletePostMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobPosting.Jobposting.dataDelete, org.stackroute.jobPosting.Jobposting.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobPosting", "deletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.dataDelete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobPostingMethodDescriptorSupplier("deletePost"))
                  .build();
          }
        }
     }
     return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.searchMessage,
      org.stackroute.jobPosting.Jobposting.searchAPIResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = org.stackroute.jobPosting.Jobposting.searchMessage.class,
      responseType = org.stackroute.jobPosting.Jobposting.searchAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.searchMessage,
      org.stackroute.jobPosting.Jobposting.searchAPIResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.searchMessage, org.stackroute.jobPosting.Jobposting.searchAPIResponse> getSearchMethod;
    if ((getSearchMethod = jobPostingGrpc.getSearchMethod) == null) {
      synchronized (jobPostingGrpc.class) {
        if ((getSearchMethod = jobPostingGrpc.getSearchMethod) == null) {
          jobPostingGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobPosting.Jobposting.searchMessage, org.stackroute.jobPosting.Jobposting.searchAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobPosting", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.searchMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.searchAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobPostingMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.empty,
      org.stackroute.jobPosting.Jobposting.jobIdResponse> getAllJobIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allJobId",
      requestType = org.stackroute.jobPosting.Jobposting.empty.class,
      responseType = org.stackroute.jobPosting.Jobposting.jobIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.empty,
      org.stackroute.jobPosting.Jobposting.jobIdResponse> getAllJobIdMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobPosting.Jobposting.empty, org.stackroute.jobPosting.Jobposting.jobIdResponse> getAllJobIdMethod;
    if ((getAllJobIdMethod = jobPostingGrpc.getAllJobIdMethod) == null) {
      synchronized (jobPostingGrpc.class) {
        if ((getAllJobIdMethod = jobPostingGrpc.getAllJobIdMethod) == null) {
          jobPostingGrpc.getAllJobIdMethod = getAllJobIdMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobPosting.Jobposting.empty, org.stackroute.jobPosting.Jobposting.jobIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobPosting", "allJobId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobPosting.Jobposting.jobIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobPostingMethodDescriptorSupplier("allJobId"))
                  .build();
          }
        }
     }
     return getAllJobIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static jobPostingStub newStub(io.grpc.Channel channel) {
    return new jobPostingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static jobPostingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new jobPostingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static jobPostingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new jobPostingFutureStub(channel);
  }

  /**
   */
  public static abstract class jobPostingImplBase implements io.grpc.BindableService {

    /**
     */
    public void addPost(org.stackroute.jobPosting.Jobposting.dataAdd request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPostMethod(), responseObserver);
    }

    /**
     */
    public void updatePost(org.stackroute.jobPosting.Jobposting.dataUpdate request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(org.stackroute.jobPosting.Jobposting.dataDelete request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void search(org.stackroute.jobPosting.Jobposting.searchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.searchAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void allJobId(org.stackroute.jobPosting.Jobposting.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.jobIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllJobIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobPosting.Jobposting.dataAdd,
                org.stackroute.jobPosting.Jobposting.APIResponse>(
                  this, METHODID_ADD_POST)))
          .addMethod(
            getUpdatePostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobPosting.Jobposting.dataUpdate,
                org.stackroute.jobPosting.Jobposting.APIResponse>(
                  this, METHODID_UPDATE_POST)))
          .addMethod(
            getDeletePostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobPosting.Jobposting.dataDelete,
                org.stackroute.jobPosting.Jobposting.APIResponse>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobPosting.Jobposting.searchMessage,
                org.stackroute.jobPosting.Jobposting.searchAPIResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getAllJobIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobPosting.Jobposting.empty,
                org.stackroute.jobPosting.Jobposting.jobIdResponse>(
                  this, METHODID_ALL_JOB_ID)))
          .build();
    }
  }

  /**
   */
  public static final class jobPostingStub extends io.grpc.stub.AbstractStub<jobPostingStub> {
    private jobPostingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private jobPostingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected jobPostingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new jobPostingStub(channel, callOptions);
    }

    /**
     */
    public void addPost(org.stackroute.jobPosting.Jobposting.dataAdd request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePost(org.stackroute.jobPosting.Jobposting.dataUpdate request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(org.stackroute.jobPosting.Jobposting.dataDelete request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(org.stackroute.jobPosting.Jobposting.searchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.searchAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allJobId(org.stackroute.jobPosting.Jobposting.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.jobIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllJobIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class jobPostingBlockingStub extends io.grpc.stub.AbstractStub<jobPostingBlockingStub> {
    private jobPostingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private jobPostingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected jobPostingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new jobPostingBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.jobPosting.Jobposting.APIResponse addPost(org.stackroute.jobPosting.Jobposting.dataAdd request) {
      return blockingUnaryCall(
          getChannel(), getAddPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.jobPosting.Jobposting.APIResponse updatePost(org.stackroute.jobPosting.Jobposting.dataUpdate request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.jobPosting.Jobposting.APIResponse deletePost(org.stackroute.jobPosting.Jobposting.dataDelete request) {
      return blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.jobPosting.Jobposting.searchAPIResponse search(org.stackroute.jobPosting.Jobposting.searchMessage request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.jobPosting.Jobposting.jobIdResponse allJobId(org.stackroute.jobPosting.Jobposting.empty request) {
      return blockingUnaryCall(
          getChannel(), getAllJobIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class jobPostingFutureStub extends io.grpc.stub.AbstractStub<jobPostingFutureStub> {
    private jobPostingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private jobPostingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected jobPostingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new jobPostingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobPosting.Jobposting.APIResponse> addPost(
        org.stackroute.jobPosting.Jobposting.dataAdd request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobPosting.Jobposting.APIResponse> updatePost(
        org.stackroute.jobPosting.Jobposting.dataUpdate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobPosting.Jobposting.APIResponse> deletePost(
        org.stackroute.jobPosting.Jobposting.dataDelete request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobPosting.Jobposting.searchAPIResponse> search(
        org.stackroute.jobPosting.Jobposting.searchMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobPosting.Jobposting.jobIdResponse> allJobId(
        org.stackroute.jobPosting.Jobposting.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllJobIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_POST = 0;
  private static final int METHODID_UPDATE_POST = 1;
  private static final int METHODID_DELETE_POST = 2;
  private static final int METHODID_SEARCH = 3;
  private static final int METHODID_ALL_JOB_ID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final jobPostingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(jobPostingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_POST:
          serviceImpl.addPost((org.stackroute.jobPosting.Jobposting.dataAdd) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((org.stackroute.jobPosting.Jobposting.dataUpdate) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((org.stackroute.jobPosting.Jobposting.dataDelete) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.APIResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((org.stackroute.jobPosting.Jobposting.searchMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.searchAPIResponse>) responseObserver);
          break;
        case METHODID_ALL_JOB_ID:
          serviceImpl.allJobId((org.stackroute.jobPosting.Jobposting.empty) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobPosting.Jobposting.jobIdResponse>) responseObserver);
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

  private static abstract class jobPostingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    jobPostingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.jobPosting.Jobposting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("jobPosting");
    }
  }

  private static final class jobPostingFileDescriptorSupplier
      extends jobPostingBaseDescriptorSupplier {
    jobPostingFileDescriptorSupplier() {}
  }

  private static final class jobPostingMethodDescriptorSupplier
      extends jobPostingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    jobPostingMethodDescriptorSupplier(String methodName) {
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
      synchronized (jobPostingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new jobPostingFileDescriptorSupplier())
              .addMethod(getAddPostMethod())
              .addMethod(getUpdatePostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getSearchMethod())
              .addMethod(getAllJobIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
