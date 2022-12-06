package org.stackroute.commentDetails;

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
    comments = "Source: comment.proto")
public final class commentGrpc {

  private commentGrpc() {}

  public static final String SERVICE_NAME = "comment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentAddMessage,
      org.stackroute.commentDetails.Comment.commentAddAPIResponse> getCommentAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commentAdd",
      requestType = org.stackroute.commentDetails.Comment.commentAddMessage.class,
      responseType = org.stackroute.commentDetails.Comment.commentAddAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentAddMessage,
      org.stackroute.commentDetails.Comment.commentAddAPIResponse> getCommentAddMethod() {
    io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentAddMessage, org.stackroute.commentDetails.Comment.commentAddAPIResponse> getCommentAddMethod;
    if ((getCommentAddMethod = commentGrpc.getCommentAddMethod) == null) {
      synchronized (commentGrpc.class) {
        if ((getCommentAddMethod = commentGrpc.getCommentAddMethod) == null) {
          commentGrpc.getCommentAddMethod = getCommentAddMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.commentDetails.Comment.commentAddMessage, org.stackroute.commentDetails.Comment.commentAddAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "comment", "commentAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.commentDetails.Comment.commentAddMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.commentDetails.Comment.commentAddAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new commentMethodDescriptorSupplier("commentAdd"))
                  .build();
          }
        }
     }
     return getCommentAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentUpdateMessage,
      org.stackroute.commentDetails.Comment.commentUpdateAPIResponse> getCommentUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commentUpdate",
      requestType = org.stackroute.commentDetails.Comment.commentUpdateMessage.class,
      responseType = org.stackroute.commentDetails.Comment.commentUpdateAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentUpdateMessage,
      org.stackroute.commentDetails.Comment.commentUpdateAPIResponse> getCommentUpdateMethod() {
    io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentUpdateMessage, org.stackroute.commentDetails.Comment.commentUpdateAPIResponse> getCommentUpdateMethod;
    if ((getCommentUpdateMethod = commentGrpc.getCommentUpdateMethod) == null) {
      synchronized (commentGrpc.class) {
        if ((getCommentUpdateMethod = commentGrpc.getCommentUpdateMethod) == null) {
          commentGrpc.getCommentUpdateMethod = getCommentUpdateMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.commentDetails.Comment.commentUpdateMessage, org.stackroute.commentDetails.Comment.commentUpdateAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "comment", "commentUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.commentDetails.Comment.commentUpdateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.commentDetails.Comment.commentUpdateAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new commentMethodDescriptorSupplier("commentUpdate"))
                  .build();
          }
        }
     }
     return getCommentUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentDeleteMessage,
      org.stackroute.commentDetails.Comment.commentDeleteAPIResponse> getCommentDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "commentDelete",
      requestType = org.stackroute.commentDetails.Comment.commentDeleteMessage.class,
      responseType = org.stackroute.commentDetails.Comment.commentDeleteAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentDeleteMessage,
      org.stackroute.commentDetails.Comment.commentDeleteAPIResponse> getCommentDeleteMethod() {
    io.grpc.MethodDescriptor<org.stackroute.commentDetails.Comment.commentDeleteMessage, org.stackroute.commentDetails.Comment.commentDeleteAPIResponse> getCommentDeleteMethod;
    if ((getCommentDeleteMethod = commentGrpc.getCommentDeleteMethod) == null) {
      synchronized (commentGrpc.class) {
        if ((getCommentDeleteMethod = commentGrpc.getCommentDeleteMethod) == null) {
          commentGrpc.getCommentDeleteMethod = getCommentDeleteMethod = 
              io.grpc.MethodDescriptor.<org.stackroute.commentDetails.Comment.commentDeleteMessage, org.stackroute.commentDetails.Comment.commentDeleteAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "comment", "commentDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.commentDetails.Comment.commentDeleteMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stackroute.commentDetails.Comment.commentDeleteAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new commentMethodDescriptorSupplier("commentDelete"))
                  .build();
          }
        }
     }
     return getCommentDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static commentStub newStub(io.grpc.Channel channel) {
    return new commentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static commentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new commentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static commentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new commentFutureStub(channel);
  }

  /**
   */
  public static abstract class commentImplBase implements io.grpc.BindableService {

    /**
     */
    public void commentAdd(org.stackroute.commentDetails.Comment.commentAddMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentAddAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommentAddMethod(), responseObserver);
    }

    /**
     */
    public void commentUpdate(org.stackroute.commentDetails.Comment.commentUpdateMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentUpdateAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommentUpdateMethod(), responseObserver);
    }

    /**
     */
    public void commentDelete(org.stackroute.commentDetails.Comment.commentDeleteMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentDeleteAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommentDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommentAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.commentDetails.Comment.commentAddMessage,
                org.stackroute.commentDetails.Comment.commentAddAPIResponse>(
                  this, METHODID_COMMENT_ADD)))
          .addMethod(
            getCommentUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.commentDetails.Comment.commentUpdateMessage,
                org.stackroute.commentDetails.Comment.commentUpdateAPIResponse>(
                  this, METHODID_COMMENT_UPDATE)))
          .addMethod(
            getCommentDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stackroute.commentDetails.Comment.commentDeleteMessage,
                org.stackroute.commentDetails.Comment.commentDeleteAPIResponse>(
                  this, METHODID_COMMENT_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class commentStub extends io.grpc.stub.AbstractStub<commentStub> {
    private commentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private commentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected commentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new commentStub(channel, callOptions);
    }

    /**
     */
    public void commentAdd(org.stackroute.commentDetails.Comment.commentAddMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentAddAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommentAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commentUpdate(org.stackroute.commentDetails.Comment.commentUpdateMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentUpdateAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommentUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commentDelete(org.stackroute.commentDetails.Comment.commentDeleteMessage request,
        io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentDeleteAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommentDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class commentBlockingStub extends io.grpc.stub.AbstractStub<commentBlockingStub> {
    private commentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private commentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected commentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new commentBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stackroute.commentDetails.Comment.commentAddAPIResponse commentAdd(org.stackroute.commentDetails.Comment.commentAddMessage request) {
      return blockingUnaryCall(
          getChannel(), getCommentAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.commentDetails.Comment.commentUpdateAPIResponse commentUpdate(org.stackroute.commentDetails.Comment.commentUpdateMessage request) {
      return blockingUnaryCall(
          getChannel(), getCommentUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stackroute.commentDetails.Comment.commentDeleteAPIResponse commentDelete(org.stackroute.commentDetails.Comment.commentDeleteMessage request) {
      return blockingUnaryCall(
          getChannel(), getCommentDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class commentFutureStub extends io.grpc.stub.AbstractStub<commentFutureStub> {
    private commentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private commentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected commentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new commentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.commentDetails.Comment.commentAddAPIResponse> commentAdd(
        org.stackroute.commentDetails.Comment.commentAddMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCommentAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.commentDetails.Comment.commentUpdateAPIResponse> commentUpdate(
        org.stackroute.commentDetails.Comment.commentUpdateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCommentUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stackroute.commentDetails.Comment.commentDeleteAPIResponse> commentDelete(
        org.stackroute.commentDetails.Comment.commentDeleteMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCommentDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMENT_ADD = 0;
  private static final int METHODID_COMMENT_UPDATE = 1;
  private static final int METHODID_COMMENT_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final commentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(commentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMENT_ADD:
          serviceImpl.commentAdd((org.stackroute.commentDetails.Comment.commentAddMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentAddAPIResponse>) responseObserver);
          break;
        case METHODID_COMMENT_UPDATE:
          serviceImpl.commentUpdate((org.stackroute.commentDetails.Comment.commentUpdateMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentUpdateAPIResponse>) responseObserver);
          break;
        case METHODID_COMMENT_DELETE:
          serviceImpl.commentDelete((org.stackroute.commentDetails.Comment.commentDeleteMessage) request,
              (io.grpc.stub.StreamObserver<org.stackroute.commentDetails.Comment.commentDeleteAPIResponse>) responseObserver);
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

  private static abstract class commentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    commentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stackroute.commentDetails.Comment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("comment");
    }
  }

  private static final class commentFileDescriptorSupplier
      extends commentBaseDescriptorSupplier {
    commentFileDescriptorSupplier() {}
  }

  private static final class commentMethodDescriptorSupplier
      extends commentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    commentMethodDescriptorSupplier(String methodName) {
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
      synchronized (commentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new commentFileDescriptorSupplier())
              .addMethod(getCommentAddMethod())
              .addMethod(getCommentUpdateMethod())
              .addMethod(getCommentDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
