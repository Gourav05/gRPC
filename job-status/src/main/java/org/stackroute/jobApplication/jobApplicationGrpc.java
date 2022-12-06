package org.stackroute.jobApplication;

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
    comments = "Source: jobApplication.proto")
public final class jobApplicationGrpc {

  private jobApplicationGrpc() {}

  public static final String SERVICE_NAME = "jobApplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.jobApplicationMessage,
      org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse> getJobApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "jobApplication",
      requestType = org.stackroute.jobApplication.JobApplication.jobApplicationMessage.class,
      responseType = org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.jobApplicationMessage,
      org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse> getJobApplicationMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.jobApplicationMessage, org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse> getJobApplicationMethod;
    if ((getJobApplicationMethod = jobApplicationGrpc.getJobApplicationMethod) == null) {
      synchronized (jobApplicationGrpc.class) {
        if ((getJobApplicationMethod = jobApplicationGrpc.getJobApplicationMethod) == null) {
          jobApplicationGrpc.getJobApplicationMethod = getJobApplicationMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobApplication.JobApplication.jobApplicationMessage, org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobApplication", "jobApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobApplication.JobApplication.jobApplicationMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobApplicationMethodDescriptorSupplier("jobApplication"))
                  .build();
          }
        }
     }
     return getJobApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage,
      org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse> getApplicationIdSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "applicationIdSearch",
      requestType = org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage.class,
      responseType = org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage,
      org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse> getApplicationIdSearchMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage, org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse> getApplicationIdSearchMethod;
    if ((getApplicationIdSearchMethod = jobApplicationGrpc.getApplicationIdSearchMethod) == null) {
      synchronized (jobApplicationGrpc.class) {
        if ((getApplicationIdSearchMethod = jobApplicationGrpc.getApplicationIdSearchMethod) == null) {
          jobApplicationGrpc.getApplicationIdSearchMethod = getApplicationIdSearchMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage, org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobApplication", "applicationIdSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobApplicationMethodDescriptorSupplier("applicationIdSearch"))
                  .build();
          }
        }
     }
     return getApplicationIdSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.empty,
      org.stackroute.jobApplication.JobApplication.applicationIdResponse> getAllJobApplicationIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allJobApplicationId",
      requestType = org.stackroute.jobApplication.JobApplication.empty.class,
      responseType = org.stackroute.jobApplication.JobApplication.applicationIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.empty,
      org.stackroute.jobApplication.JobApplication.applicationIdResponse> getAllJobApplicationIdMethod() {
    io.grpc.MethodDescriptor<org.stackroute.jobApplication.JobApplication.empty, org.stackroute.jobApplication.JobApplication.applicationIdResponse> getAllJobApplicationIdMethod;
    if ((getAllJobApplicationIdMethod = jobApplicationGrpc.getAllJobApplicationIdMethod) == null) {
      synchronized (jobApplicationGrpc.class) {
        if ((getAllJobApplicationIdMethod = jobApplicationGrpc.getAllJobApplicationIdMethod) == null) {
          jobApplicationGrpc.getAllJobApplicationIdMethod = getAllJobApplicationIdMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.jobApplication.JobApplication.empty, org.stackroute.jobApplication.JobApplication.applicationIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "jobApplication", "allJobApplicationId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobApplication.JobApplication.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.jobApplication.JobApplication.applicationIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new jobApplicationMethodDescriptorSupplier("allJobApplicationId"))
                  .build();
          }
        }
     }
     return getAllJobApplicationIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static jobApplicationStub newStub(io.grpc.Channel channel) {
    return new jobApplicationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static jobApplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new jobApplicationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static jobApplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new jobApplicationFutureStub(channel);
  }

  /**
   */
  public static abstract class jobApplicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void jobApplication(org.stackroute.jobApplication.JobApplication.jobApplicationMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJobApplicationMethod(), responseObserver);
    }

    /**
     */
    public void applicationIdSearch(org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getApplicationIdSearchMethod(), responseObserver);
    }

    /**
     */
    public void allJobApplicationId(org.stackroute.jobApplication.JobApplication.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.applicationIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllJobApplicationIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJobApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobApplication.JobApplication.jobApplicationMessage,
                org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse>(
                  this, METHODID_JOB_APPLICATION)))
          .addMethod(
            getApplicationIdSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage,
                org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse>(
                  this, METHODID_APPLICATION_ID_SEARCH)))
          .addMethod(
            getAllJobApplicationIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.jobApplication.JobApplication.empty,
                org.stackroute.jobApplication.JobApplication.applicationIdResponse>(
                  this, METHODID_ALL_JOB_APPLICATION_ID)))
          .build();
    }
  }

  /**
   */
  public static final class jobApplicationStub extends io.grpc.stub.AbstractStub<jobApplicationStub> {
    private jobApplicationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private jobApplicationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected jobApplicationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new jobApplicationStub(channel, callOptions);
    }

    /**
     */
    public void jobApplication(org.stackroute.jobApplication.JobApplication.jobApplicationMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJobApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applicationIdSearch(org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplicationIdSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allJobApplicationId(org.stackroute.jobApplication.JobApplication.empty request,
        io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.applicationIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllJobApplicationIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class jobApplicationBlockingStub extends io.grpc.stub.AbstractStub<jobApplicationBlockingStub> {
    private jobApplicationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private jobApplicationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected jobApplicationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new jobApplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse jobApplication(org.stackroute.jobApplication.JobApplication.jobApplicationMessage request) {
      return blockingUnaryCall(
          getChannel(), getJobApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse applicationIdSearch(org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage request) {
      return blockingUnaryCall(
          getChannel(), getApplicationIdSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.jobApplication.JobApplication.applicationIdResponse allJobApplicationId(org.stackroute.jobApplication.JobApplication.empty request) {
      return blockingUnaryCall(
          getChannel(), getAllJobApplicationIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class jobApplicationFutureStub extends io.grpc.stub.AbstractStub<jobApplicationFutureStub> {
    private jobApplicationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private jobApplicationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected jobApplicationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new jobApplicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse> jobApplication(
        org.stackroute.jobApplication.JobApplication.jobApplicationMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getJobApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse> applicationIdSearch(
        org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getApplicationIdSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.jobApplication.JobApplication.applicationIdResponse> allJobApplicationId(
        org.stackroute.jobApplication.JobApplication.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllJobApplicationIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOB_APPLICATION = 0;
  private static final int METHODID_APPLICATION_ID_SEARCH = 1;
  private static final int METHODID_ALL_JOB_APPLICATION_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final jobApplicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(jobApplicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOB_APPLICATION:
          serviceImpl.jobApplication((org.stackroute.jobApplication.JobApplication.jobApplicationMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.ApplicationAPIResponse>) responseObserver);
          break;
        case METHODID_APPLICATION_ID_SEARCH:
          serviceImpl.applicationIdSearch((org.stackroute.jobApplication.JobApplication.applicationIdSearchMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.ApplicationIdSearchResponse>) responseObserver);
          break;
        case METHODID_ALL_JOB_APPLICATION_ID:
          serviceImpl.allJobApplicationId((org.stackroute.jobApplication.JobApplication.empty) request,
              (io.grpc.stub.StreamObserver<org.stackroute.jobApplication.JobApplication.applicationIdResponse>) responseObserver);
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

  private static abstract class jobApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    jobApplicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.jobApplication.JobApplication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("jobApplication");
    }
  }

  private static final class jobApplicationFileDescriptorSupplier
      extends jobApplicationBaseDescriptorSupplier {
    jobApplicationFileDescriptorSupplier() {}
  }

  private static final class jobApplicationMethodDescriptorSupplier
      extends jobApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    jobApplicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (jobApplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new jobApplicationFileDescriptorSupplier())
              .addMethod(getJobApplicationMethod())
              .addMethod(getApplicationIdSearchMethod())
              .addMethod(getAllJobApplicationIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
