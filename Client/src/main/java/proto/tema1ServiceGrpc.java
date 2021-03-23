package proto;

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
    comments = "Source: Client.proto")
public final class tema1ServiceGrpc {

  private tema1ServiceGrpc() {}

  public static final String SERVICE_NAME = "tema1Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ClientOuterClass.Client,
      proto.ClientOuterClass.ClientResponse> getGetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInfo",
      requestType = proto.ClientOuterClass.Client.class,
      responseType = proto.ClientOuterClass.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ClientOuterClass.Client,
      proto.ClientOuterClass.ClientResponse> getGetInfoMethod() {
    io.grpc.MethodDescriptor<proto.ClientOuterClass.Client, proto.ClientOuterClass.ClientResponse> getGetInfoMethod;
    if ((getGetInfoMethod = tema1ServiceGrpc.getGetInfoMethod) == null) {
      synchronized (tema1ServiceGrpc.class) {
        if ((getGetInfoMethod = tema1ServiceGrpc.getGetInfoMethod) == null) {
          tema1ServiceGrpc.getGetInfoMethod = getGetInfoMethod = 
              io.grpc.MethodDescriptor.<proto.ClientOuterClass.Client, proto.ClientOuterClass.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tema1Service", "getInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ClientOuterClass.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ClientOuterClass.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new tema1ServiceMethodDescriptorSupplier("getInfo"))
                  .build();
          }
        }
     }
     return getGetInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static tema1ServiceStub newStub(io.grpc.Channel channel) {
    return new tema1ServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static tema1ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new tema1ServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static tema1ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new tema1ServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class tema1ServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getInfo(proto.ClientOuterClass.Client request,
        io.grpc.stub.StreamObserver<proto.ClientOuterClass.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ClientOuterClass.Client,
                proto.ClientOuterClass.ClientResponse>(
                  this, METHODID_GET_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class tema1ServiceStub extends io.grpc.stub.AbstractStub<tema1ServiceStub> {
    private tema1ServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tema1ServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tema1ServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tema1ServiceStub(channel, callOptions);
    }

    /**
     */
    public void getInfo(proto.ClientOuterClass.Client request,
        io.grpc.stub.StreamObserver<proto.ClientOuterClass.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class tema1ServiceBlockingStub extends io.grpc.stub.AbstractStub<tema1ServiceBlockingStub> {
    private tema1ServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tema1ServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tema1ServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tema1ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ClientOuterClass.ClientResponse getInfo(proto.ClientOuterClass.Client request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class tema1ServiceFutureStub extends io.grpc.stub.AbstractStub<tema1ServiceFutureStub> {
    private tema1ServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private tema1ServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected tema1ServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new tema1ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ClientOuterClass.ClientResponse> getInfo(
        proto.ClientOuterClass.Client request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final tema1ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(tema1ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INFO:
          serviceImpl.getInfo((proto.ClientOuterClass.Client) request,
              (io.grpc.stub.StreamObserver<proto.ClientOuterClass.ClientResponse>) responseObserver);
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

  private static abstract class tema1ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    tema1ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ClientOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("tema1Service");
    }
  }

  private static final class tema1ServiceFileDescriptorSupplier
      extends tema1ServiceBaseDescriptorSupplier {
    tema1ServiceFileDescriptorSupplier() {}
  }

  private static final class tema1ServiceMethodDescriptorSupplier
      extends tema1ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    tema1ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (tema1ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new tema1ServiceFileDescriptorSupplier())
              .addMethod(getGetInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
