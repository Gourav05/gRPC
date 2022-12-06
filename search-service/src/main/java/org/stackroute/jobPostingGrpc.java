package org.stackroute;

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
  private static volatile io.grpc.MethodDescriptor<org.stackroute.Jobposting.data,
      org.stackroute.Jobposting.APIResponse> getAddDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addDatabase",
      requestType = org.stackroute.Jobposting.data.class,
      responseType = org.stackroute.Jobposting.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.Jobposting.data,
      org.stackroute.Jobposting.APIResponse> getAddDatabaseMethod() {
    io.grpc.MethodDescriptor<org.stackroute.Jobposting.data, org.stackroute.Jobposting.APIResponse> getAddDatabaseMethod;
    if ((getAddDatabaseMethod = jobPostingGrpc.getAddDatabaseMethod) == null) {
      synchronized (jobPostingGrpc.class) {
        if ((getAddDatabaseMethod = jobPostingGrpc.getAddDatabaseMethod) == null) {
          jobPostingGrpc.getAddDatabaseMethod = getAddDatabaseMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.Jobposting.data, org.stackroute.Jobposting.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobPosting", "addDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.Jobposting.data.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.Jobposting.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobPostingMethodDescriptorSupplier("addDatabase"))
                  .build();
          }
        }
     }
     return getAddDatabaseMethod;
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
    public void addDatabase(org.stackroute.Jobposting.data request,
        io.grpc.stub.StreamObserver<org.stackroute.Jobposting.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddDatabaseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddDatabaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.Jobposting.data,
                org.stackroute.Jobposting.APIResponse>(
                  this, METHODID_ADD_DATABASE)))
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
    public void addDatabase(org.stackroute.Jobposting.data request,
        io.grpc.stub.StreamObserver<org.stackroute.Jobposting.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddDatabaseMethod(), getCallOptions()), request, responseObserver);
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
    public org.stackroute.Jobposting.APIResponse addDatabase(org.stackroute.Jobposting.data request) {
      return blockingUnaryCall(
          getChannel(), getAddDatabaseMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.Jobposting.APIResponse> addDatabase(
        org.stackroute.Jobposting.data request) {
      return futureUnaryCall(
          getChannel().newCall(getAddDatabaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_DATABASE = 0;

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
        case METHODID_ADD_DATABASE:
          serviceImpl.addDatabase((org.stackroute.Jobposting.data) request,
              (io.grpc.stub.StreamObserver<org.stackroute.Jobposting.APIResponse>) responseObserver);
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
      return org.stackroute.Jobposting.getDescriptor();
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
              .addMethod(getAddDatabaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
