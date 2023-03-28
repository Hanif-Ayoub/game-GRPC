package ma.enset.stubs;

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
    comments = "Source: game.proto")
public final class gameServiceGrpc {

  private gameServiceGrpc() {}

  public static final String SERVICE_NAME = "gameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Game.connect,
      ma.enset.stubs.Game.messageResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = ma.enset.stubs.Game.connect.class,
      responseType = ma.enset.stubs.Game.messageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Game.connect,
      ma.enset.stubs.Game.messageResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Game.connect, ma.enset.stubs.Game.messageResponse> getLoginMethod;
    if ((getLoginMethod = gameServiceGrpc.getLoginMethod) == null) {
      synchronized (gameServiceGrpc.class) {
        if ((getLoginMethod = gameServiceGrpc.getLoginMethod) == null) {
          gameServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Game.connect, ma.enset.stubs.Game.messageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "gameService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Game.connect.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Game.messageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gameServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Game.messageRequest,
      ma.enset.stubs.Game.messageResponse> getGuessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "guess",
      requestType = ma.enset.stubs.Game.messageRequest.class,
      responseType = ma.enset.stubs.Game.messageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Game.messageRequest,
      ma.enset.stubs.Game.messageResponse> getGuessMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Game.messageRequest, ma.enset.stubs.Game.messageResponse> getGuessMethod;
    if ((getGuessMethod = gameServiceGrpc.getGuessMethod) == null) {
      synchronized (gameServiceGrpc.class) {
        if ((getGuessMethod = gameServiceGrpc.getGuessMethod) == null) {
          gameServiceGrpc.getGuessMethod = getGuessMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Game.messageRequest, ma.enset.stubs.Game.messageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gameService", "guess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Game.messageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Game.messageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gameServiceMethodDescriptorSupplier("guess"))
                  .build();
          }
        }
     }
     return getGuessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gameServiceStub newStub(io.grpc.Channel channel) {
    return new gameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class gameServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(ma.enset.stubs.Game.connect request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Game.messageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void guess(ma.enset.stubs.Game.messageRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Game.messageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGuessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Game.connect,
                ma.enset.stubs.Game.messageResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getGuessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.Game.messageRequest,
                ma.enset.stubs.Game.messageResponse>(
                  this, METHODID_GUESS)))
          .build();
    }
  }

  /**
   */
  public static final class gameServiceStub extends io.grpc.stub.AbstractStub<gameServiceStub> {
    private gameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(ma.enset.stubs.Game.connect request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Game.messageResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void guess(ma.enset.stubs.Game.messageRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Game.messageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class gameServiceBlockingStub extends io.grpc.stub.AbstractStub<gameServiceBlockingStub> {
    private gameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ma.enset.stubs.Game.messageResponse> login(
        ma.enset.stubs.Game.connect request) {
      return blockingServerStreamingCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.stubs.Game.messageResponse guess(ma.enset.stubs.Game.messageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGuessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gameServiceFutureStub extends io.grpc.stub.AbstractStub<gameServiceFutureStub> {
    private gameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.Game.messageResponse> guess(
        ma.enset.stubs.Game.messageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_GUESS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((ma.enset.stubs.Game.connect) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Game.messageResponse>) responseObserver);
          break;
        case METHODID_GUESS:
          serviceImpl.guess((ma.enset.stubs.Game.messageRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Game.messageResponse>) responseObserver);
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

  private static abstract class gameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.Game.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gameService");
    }
  }

  private static final class gameServiceFileDescriptorSupplier
      extends gameServiceBaseDescriptorSupplier {
    gameServiceFileDescriptorSupplier() {}
  }

  private static final class gameServiceMethodDescriptorSupplier
      extends gameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (gameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gameServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getGuessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
