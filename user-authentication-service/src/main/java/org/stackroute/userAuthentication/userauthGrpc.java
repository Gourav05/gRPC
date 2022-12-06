package org.stackroute.userAuthentication;

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
    comments = "Source: userAuth.proto")
public final class userauthGrpc {

  private userauthGrpc() {}

  public static final String SERVICE_NAME = "userauth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.userAuthentication.adduser,
      org.stackroute.userAuthentication.APIresponse> getUserRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userRegistration",
      requestType = org.stackroute.userAuthentication.adduser.class,
      responseType = org.stackroute.userAuthentication.APIresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.userAuthentication.adduser,
      org.stackroute.userAuthentication.APIresponse> getUserRegistrationMethod() {
    io.grpc.MethodDescriptor<org.stackroute.userAuthentication.adduser, org.stackroute.userAuthentication.APIresponse> getUserRegistrationMethod;
    if ((getUserRegistrationMethod = userauthGrpc.getUserRegistrationMethod) == null) {
      synchronized (userauthGrpc.class) {
        if ((getUserRegistrationMethod = userauthGrpc.getUserRegistrationMethod) == null) {
          userauthGrpc.getUserRegistrationMethod = getUserRegistrationMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.userAuthentication.adduser, org.stackroute.userAuthentication.APIresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userauth", "userRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.userAuthentication.adduser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.userAuthentication.APIresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userauthMethodDescriptorSupplier("userRegistration"))
                  .build();
          }
        }
     }
     return getUserRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.userAuthentication.checkuser,
      org.stackroute.userAuthentication.checkresponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = org.stackroute.userAuthentication.checkuser.class,
      responseType = org.stackroute.userAuthentication.checkresponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.userAuthentication.checkuser,
      org.stackroute.userAuthentication.checkresponse> getLoginMethod() {
    io.grpc.MethodDescriptor<org.stackroute.userAuthentication.checkuser, org.stackroute.userAuthentication.checkresponse> getLoginMethod;
    if ((getLoginMethod = userauthGrpc.getLoginMethod) == null) {
      synchronized (userauthGrpc.class) {
        if ((getLoginMethod = userauthGrpc.getLoginMethod) == null) {
          userauthGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.userAuthentication.checkuser, org.stackroute.userAuthentication.checkresponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userauth", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.userAuthentication.checkuser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.userAuthentication.checkresponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userauthMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.userAuthentication.request,
      org.stackroute.userAuthentication.response> getForgotPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "forgotPassword",
      requestType = org.stackroute.userAuthentication.request.class,
      responseType = org.stackroute.userAuthentication.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.userAuthentication.request,
      org.stackroute.userAuthentication.response> getForgotPasswordMethod() {
    io.grpc.MethodDescriptor<org.stackroute.userAuthentication.request, org.stackroute.userAuthentication.response> getForgotPasswordMethod;
    if ((getForgotPasswordMethod = userauthGrpc.getForgotPasswordMethod) == null) {
      synchronized (userauthGrpc.class) {
        if ((getForgotPasswordMethod = userauthGrpc.getForgotPasswordMethod) == null) {
          userauthGrpc.getForgotPasswordMethod = getForgotPasswordMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.userAuthentication.request, org.stackroute.userAuthentication.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userauth", "forgotPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.userAuthentication.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.userAuthentication.response.getDefaultInstance()))
                  .setSchemaDescriptor(new userauthMethodDescriptorSupplier("forgotPassword"))
                  .build();
          }
        }
     }
     return getForgotPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userauthStub newStub(io.grpc.Channel channel) {
    return new userauthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userauthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userauthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userauthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userauthFutureStub(channel);
  }

  /**
   */
  public static abstract class userauthImplBase implements io.grpc.BindableService {

    /**
     */
    public void userRegistration(org.stackroute.userAuthentication.adduser request,
        io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.APIresponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserRegistrationMethod(), responseObserver);
    }

    /**
     */
    public void login(org.stackroute.userAuthentication.checkuser request,
        io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.checkresponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void forgotPassword(org.stackroute.userAuthentication.request request,
        io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.response> responseObserver) throws MessagingException {
      asyncUnimplementedUnaryCall(getForgotPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.userAuthentication.adduser,
                org.stackroute.userAuthentication.APIresponse>(
                  this, METHODID_USER_REGISTRATION)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.userAuthentication.checkuser,
                org.stackroute.userAuthentication.checkresponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getForgotPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.userAuthentication.request,
                org.stackroute.userAuthentication.response>(
                  this, METHODID_FORGOT_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class userauthStub extends io.grpc.stub.AbstractStub<userauthStub> {
    private userauthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userauthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userauthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userauthStub(channel, callOptions);
    }

    /**
     */
    public void userRegistration(org.stackroute.userAuthentication.adduser request,
        io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.APIresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(org.stackroute.userAuthentication.checkuser request,
        io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.checkresponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forgotPassword(org.stackroute.userAuthentication.request request,
        io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userauthBlockingStub extends io.grpc.stub.AbstractStub<userauthBlockingStub> {
    private userauthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userauthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userauthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userauthBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.userAuthentication.APIresponse userRegistration(org.stackroute.userAuthentication.adduser request) {
      return blockingUnaryCall(
          getChannel(), getUserRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.userAuthentication.checkresponse login(org.stackroute.userAuthentication.checkuser request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.userAuthentication.response forgotPassword(org.stackroute.userAuthentication.request request) {
      return blockingUnaryCall(
          getChannel(), getForgotPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userauthFutureStub extends io.grpc.stub.AbstractStub<userauthFutureStub> {
    private userauthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userauthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userauthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userauthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.userAuthentication.APIresponse> userRegistration(
        org.stackroute.userAuthentication.adduser request) {
      return futureUnaryCall(
          getChannel().newCall(getUserRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.userAuthentication.checkresponse> login(
        org.stackroute.userAuthentication.checkuser request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.userAuthentication.response> forgotPassword(
        org.stackroute.userAuthentication.request request) {
      return futureUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_FORGOT_PASSWORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userauthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userauthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_REGISTRATION:
          serviceImpl.userRegistration((org.stackroute.userAuthentication.adduser) request,
              (io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.APIresponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((org.stackroute.userAuthentication.checkuser) request,
              (io.grpc.stub.StreamObserver<org.stackroute.userAuthentication.checkresponse>) responseObserver);
          break;
        case METHODID_FORGOT_PASSWORD:
          try {
            serviceImpl.forgotPassword((org.stackroute.userAuthentication.request) request,
                (io.grpc.stub.StreamObserver<response>) responseObserver);
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

  private static abstract class userauthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userauthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.userAuthentication.UserAuth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userauth");
    }
  }

  private static final class userauthFileDescriptorSupplier
      extends userauthBaseDescriptorSupplier {
    userauthFileDescriptorSupplier() {}
  }

  private static final class userauthMethodDescriptorSupplier
      extends userauthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userauthMethodDescriptorSupplier(String methodName) {
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
      synchronized (userauthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userauthFileDescriptorSupplier())
              .addMethod(getUserRegistrationMethod())
              .addMethod(getLoginMethod())
              .addMethod(getForgotPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
