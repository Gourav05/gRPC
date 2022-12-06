package org.stackroute.jobStatus;

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
    comments = "Source: jobStatus.proto")
public final class statusGrpc {

  private statusGrpc() {}

  public static final String SERVICE_NAME = "status";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobStatus.JobStatus.statusMessage,
      org.stackroute.jobStatus.JobStatus.StatusAPIResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = org.stackroute.jobStatus.JobStatus.statusMessage.class,
      responseType = org.stackroute.jobStatus.JobStatus.StatusAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobStatus.JobStatus.statusMessage,
      org.stackroute.jobStatus.JobStatus.StatusAPIResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobStatus.JobStatus.statusMessage, org.stackroute.jobStatus.JobStatus.StatusAPIResponse> getGetStatusMethod;
    if ((getGetStatusMethod = statusGrpc.getGetStatusMethod) == null) {
      synchronized (statusGrpc.class) {
        if ((getGetStatusMethod = statusGrpc.getGetStatusMethod) == null) {
          statusGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobStatus.JobStatus.statusMessage, org.stackroute.jobStatus.JobStatus.StatusAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "status", "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobStatus.JobStatus.statusMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobStatus.JobStatus.StatusAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new statusMethodDescriptorSupplier("getStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobStatus.JobStatus.updateStatusMessage,
      org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse> getUpdateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateStatus",
      requestType = org.stackroute.jobStatus.JobStatus.updateStatusMessage.class,
      responseType = org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobStatus.JobStatus.updateStatusMessage,
      org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse> getUpdateStatusMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobStatus.JobStatus.updateStatusMessage, org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse> getUpdateStatusMethod;
    if ((getUpdateStatusMethod = statusGrpc.getUpdateStatusMethod) == null) {
      synchronized (statusGrpc.class) {
        if ((getUpdateStatusMethod = statusGrpc.getUpdateStatusMethod) == null) {
          statusGrpc.getUpdateStatusMethod = getUpdateStatusMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobStatus.JobStatus.updateStatusMessage, org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "status", "updateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobStatus.JobStatus.updateStatusMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new statusMethodDescriptorSupplier("updateStatus"))
                  .build();
          }
        }
     }
     return getUpdateStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static statusStub newStub(io.grpc.Channel channel) {
    return new statusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static statusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new statusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static statusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new statusFutureStub(channel);
  }

  /**
   */
  public static abstract class statusImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatus(org.stackroute.jobStatus.JobStatus.statusMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobStatus.JobStatus.StatusAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     */
    public void updateStatus(org.stackroute.jobStatus.JobStatus.updateStatusMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobStatus.JobStatus.statusMessage,
                org.stackroute.jobStatus.JobStatus.StatusAPIResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getUpdateStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobStatus.JobStatus.updateStatusMessage,
                org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse>(
                  this, METHODID_UPDATE_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class statusStub extends io.grpc.stub.AbstractStub<statusStub> {
    private statusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private statusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected statusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new statusStub(channel, callOptions);
    }

    /**
     */
    public void getStatus(org.stackroute.jobStatus.JobStatus.statusMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobStatus.JobStatus.StatusAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStatus(org.stackroute.jobStatus.JobStatus.updateStatusMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class statusBlockingStub extends io.grpc.stub.AbstractStub<statusBlockingStub> {
    private statusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private statusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected statusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new statusBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.jobStatus.JobStatus.StatusAPIResponse getStatus(org.stackroute.jobStatus.JobStatus.statusMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse updateStatus(org.stackroute.jobStatus.JobStatus.updateStatusMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class statusFutureStub extends io.grpc.stub.AbstractStub<statusFutureStub> {
    private statusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private statusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected statusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new statusFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobStatus.JobStatus.StatusAPIResponse> getStatus(
        org.stackroute.jobStatus.JobStatus.statusMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse> updateStatus(
        org.stackroute.jobStatus.JobStatus.updateStatusMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;
  private static final int METHODID_UPDATE_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final statusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(statusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.stackroute.jobStatus.JobStatus.statusMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobStatus.JobStatus.StatusAPIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STATUS:
          serviceImpl.updateStatus((org.stackroute.jobStatus.JobStatus.updateStatusMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobStatus.JobStatus.UpdateStatusAPIResponse>) responseObserver);
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

  private static abstract class statusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    statusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.jobStatus.JobStatus.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("status");
    }
  }

  private static final class statusFileDescriptorSupplier
      extends statusBaseDescriptorSupplier {
    statusFileDescriptorSupplier() {}
  }

  private static final class statusMethodDescriptorSupplier
      extends statusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    statusMethodDescriptorSupplier(String methodName) {
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
      synchronized (statusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new statusFileDescriptorSupplier())
              .addMethod(getGetStatusMethod())
              .addMethod(getUpdateStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
