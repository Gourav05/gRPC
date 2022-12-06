package org.stackroute.grpc;

import javax.mail.MessagingException;

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
    comments = "Source: recommendation.proto")
public final class recommendationGrpc {

  private recommendationGrpc() {}

  public static final String SERVICE_NAME = "recommendation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.grpc.Recommendation.recommendmessage,
      org.stackroute.grpc.Recommendation.APIresponse> getRecommendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recommend",
      requestType = org.stackroute.grpc.Recommendation.recommendmessage.class,
      responseType = org.stackroute.grpc.Recommendation.APIresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.grpc.Recommendation.recommendmessage,
      org.stackroute.grpc.Recommendation.APIresponse> getRecommendMethod() {
    io.grpc.MethodDescriptor<org.stackroute.grpc.Recommendation.recommendmessage, org.stackroute.grpc.Recommendation.APIresponse> getRecommendMethod;
    if ((getRecommendMethod = recommendationGrpc.getRecommendMethod) == null) {
      synchronized (recommendationGrpc.class) {
        if ((getRecommendMethod = recommendationGrpc.getRecommendMethod) == null) {
          recommendationGrpc.getRecommendMethod = getRecommendMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.grpc.Recommendation.recommendmessage, org.stackroute.grpc.Recommendation.APIresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "recommendation", "recommend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.grpc.Recommendation.recommendmessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.grpc.Recommendation.APIresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new recommendationMethodDescriptorSupplier("recommend"))
                  .build();
          }
        }
     }
     return getRecommendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static recommendationStub newStub(io.grpc.Channel channel) {
    return new recommendationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static recommendationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new recommendationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static recommendationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new recommendationFutureStub(channel);
  }

  /**
   */
  public static abstract class recommendationImplBase implements io.grpc.BindableService {

    /**
     */
    public void recommend(org.stackroute.grpc.Recommendation.recommendmessage request,
        io.grpc.stub.StreamObserver<org.stackroute.grpc.Recommendation.APIresponse> responseObserver) throws MessagingException {
      asyncUnimplementedUnaryCall(getRecommendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecommendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.grpc.Recommendation.recommendmessage,
                org.stackroute.grpc.Recommendation.APIresponse>(
                  this, METHODID_RECOMMEND)))
          .build();
    }
  }

  /**
   */
  public static final class recommendationStub extends io.grpc.stub.AbstractStub<recommendationStub> {
    private recommendationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private recommendationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected recommendationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new recommendationStub(channel, callOptions);
    }

    /**
     */
    public void recommend(org.stackroute.grpc.Recommendation.recommendmessage request,
        io.grpc.stub.StreamObserver<org.stackroute.grpc.Recommendation.APIresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecommendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class recommendationBlockingStub extends io.grpc.stub.AbstractStub<recommendationBlockingStub> {
    private recommendationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private recommendationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected recommendationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new recommendationBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.grpc.Recommendation.APIresponse recommend(org.stackroute.grpc.Recommendation.recommendmessage request) {
      return blockingUnaryCall(
          getChannel(), getRecommendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class recommendationFutureStub extends io.grpc.stub.AbstractStub<recommendationFutureStub> {
    private recommendationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private recommendationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected recommendationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new recommendationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.grpc.Recommendation.APIresponse> recommend(
        org.stackroute.grpc.Recommendation.recommendmessage request) {
      return futureUnaryCall(
          getChannel().newCall(getRecommendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOMMEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final recommendationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(recommendationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOMMEND:
          try {
            serviceImpl.recommend((Recommendation.recommendmessage) request,
                (io.grpc.stub.StreamObserver<Recommendation.APIresponse>) responseObserver);
          } catch (MessagingException e) {
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

  private static abstract class recommendationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    recommendationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.grpc.Recommendation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("recommendation");
    }
  }

  private static final class recommendationFileDescriptorSupplier
      extends recommendationBaseDescriptorSupplier {
    recommendationFileDescriptorSupplier() {}
  }

  private static final class recommendationMethodDescriptorSupplier
      extends recommendationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    recommendationMethodDescriptorSupplier(String methodName) {
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
      synchronized (recommendationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new recommendationFileDescriptorSupplier())
              .addMethod(getRecommendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
