package org.stackroute.notification;

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
    comments = "Source: notification.proto")
public final class notificationGrpc {

  private notificationGrpc() {}

  public static final String SERVICE_NAME = "notification";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.notification.Notification.notificationMessage,
      org.stackroute.notification.Notification.APIResponse> getRegisterNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerNotification",
      requestType = org.stackroute.notification.Notification.notificationMessage.class,
      responseType = org.stackroute.notification.Notification.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.notification.Notification.notificationMessage,
      org.stackroute.notification.Notification.APIResponse> getRegisterNotificationMethod() {
    io.grpc.MethodDescriptor<org.stackroute.notification.Notification.notificationMessage, org.stackroute.notification.Notification.APIResponse> getRegisterNotificationMethod;
    if ((getRegisterNotificationMethod = notificationGrpc.getRegisterNotificationMethod) == null) {
      synchronized (notificationGrpc.class) {
        if ((getRegisterNotificationMethod = notificationGrpc.getRegisterNotificationMethod) == null) {
          notificationGrpc.getRegisterNotificationMethod = getRegisterNotificationMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.notification.Notification.notificationMessage, org.stackroute.notification.Notification.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "notification", "registerNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.notification.Notification.notificationMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.notification.Notification.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new notificationMethodDescriptorSupplier("registerNotification"))
                  .build();
          }
        }
     }
     return getRegisterNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static notificationStub newStub(io.grpc.Channel channel) {
    return new notificationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static notificationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new notificationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static notificationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new notificationFutureStub(channel);
  }

  /**
   */
  public static abstract class notificationImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerNotification(org.stackroute.notification.Notification.notificationMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.notification.Notification.APIResponse> responseObserver) throws MessagingException {
      asyncUnimplementedUnaryCall(getRegisterNotificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.notification.Notification.notificationMessage,
                org.stackroute.notification.Notification.APIResponse>(
                  this, METHODID_REGISTER_NOTIFICATION)))
          .build();
    }
  }

  /**
   */
  public static final class notificationStub extends io.grpc.stub.AbstractStub<notificationStub> {
    private notificationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private notificationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected notificationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new notificationStub(channel, callOptions);
    }

    /**
     */
    public void registerNotification(org.stackroute.notification.Notification.notificationMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.notification.Notification.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class notificationBlockingStub extends io.grpc.stub.AbstractStub<notificationBlockingStub> {
    private notificationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private notificationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected notificationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new notificationBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.notification.Notification.APIResponse registerNotification(org.stackroute.notification.Notification.notificationMessage request) {
      return blockingUnaryCall(
          getChannel(), getRegisterNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class notificationFutureStub extends io.grpc.stub.AbstractStub<notificationFutureStub> {
    private notificationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private notificationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected notificationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new notificationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.notification.Notification.APIResponse> registerNotification(
        org.stackroute.notification.Notification.notificationMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_NOTIFICATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final notificationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(notificationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_NOTIFICATION:
          try {
            serviceImpl.registerNotification((Notification.notificationMessage) request,
                (io.grpc.stub.StreamObserver<Notification.APIResponse>) responseObserver);
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

  private static abstract class notificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    notificationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.notification.Notification.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("notification");
    }
  }

  private static final class notificationFileDescriptorSupplier
      extends notificationBaseDescriptorSupplier {
    notificationFileDescriptorSupplier() {}
  }

  private static final class notificationMethodDescriptorSupplier
      extends notificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    notificationMethodDescriptorSupplier(String methodName) {
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
      synchronized (notificationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new notificationFileDescriptorSupplier())
              .addMethod(getRegisterNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
