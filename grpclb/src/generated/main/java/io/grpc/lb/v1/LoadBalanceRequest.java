// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lb/v1/load_balancer.proto

package io.grpc.lb.v1;

/**
 * Protobuf type {@code grpc.lb.v1.LoadBalanceRequest}
 */
public  final class LoadBalanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.lb.v1.LoadBalanceRequest)
    LoadBalanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoadBalanceRequest.newBuilder() to construct.
  private LoadBalanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoadBalanceRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoadBalanceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.grpc.lb.v1.InitialLoadBalanceRequest.Builder subBuilder = null;
            if (loadBalanceRequestTypeCase_ == 1) {
              subBuilder = ((io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_).toBuilder();
            }
            loadBalanceRequestType_ =
                input.readMessage(io.grpc.lb.v1.InitialLoadBalanceRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_);
              loadBalanceRequestType_ = subBuilder.buildPartial();
            }
            loadBalanceRequestTypeCase_ = 1;
            break;
          }
          case 18: {
            io.grpc.lb.v1.ClientStats.Builder subBuilder = null;
            if (loadBalanceRequestTypeCase_ == 2) {
              subBuilder = ((io.grpc.lb.v1.ClientStats) loadBalanceRequestType_).toBuilder();
            }
            loadBalanceRequestType_ =
                input.readMessage(io.grpc.lb.v1.ClientStats.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.lb.v1.ClientStats) loadBalanceRequestType_);
              loadBalanceRequestType_ = subBuilder.buildPartial();
            }
            loadBalanceRequestTypeCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.lb.v1.LoadBalanceRequest.class, io.grpc.lb.v1.LoadBalanceRequest.Builder.class);
  }

  private int loadBalanceRequestTypeCase_ = 0;
  private java.lang.Object loadBalanceRequestType_;
  public enum LoadBalanceRequestTypeCase
      implements com.google.protobuf.Internal.EnumLite {
    INITIAL_REQUEST(1),
    CLIENT_STATS(2),
    LOADBALANCEREQUESTTYPE_NOT_SET(0);
    private final int value;
    private LoadBalanceRequestTypeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LoadBalanceRequestTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static LoadBalanceRequestTypeCase forNumber(int value) {
      switch (value) {
        case 1: return INITIAL_REQUEST;
        case 2: return CLIENT_STATS;
        case 0: return LOADBALANCEREQUESTTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public LoadBalanceRequestTypeCase
  getLoadBalanceRequestTypeCase() {
    return LoadBalanceRequestTypeCase.forNumber(
        loadBalanceRequestTypeCase_);
  }

  public static final int INITIAL_REQUEST_FIELD_NUMBER = 1;
  /**
   * <pre>
   * This message should be sent on the first request to the load balancer.
   * </pre>
   *
   * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
   */
  public boolean hasInitialRequest() {
    return loadBalanceRequestTypeCase_ == 1;
  }
  /**
   * <pre>
   * This message should be sent on the first request to the load balancer.
   * </pre>
   *
   * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
   */
  public io.grpc.lb.v1.InitialLoadBalanceRequest getInitialRequest() {
    if (loadBalanceRequestTypeCase_ == 1) {
       return (io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_;
    }
    return io.grpc.lb.v1.InitialLoadBalanceRequest.getDefaultInstance();
  }
  /**
   * <pre>
   * This message should be sent on the first request to the load balancer.
   * </pre>
   *
   * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
   */
  public io.grpc.lb.v1.InitialLoadBalanceRequestOrBuilder getInitialRequestOrBuilder() {
    if (loadBalanceRequestTypeCase_ == 1) {
       return (io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_;
    }
    return io.grpc.lb.v1.InitialLoadBalanceRequest.getDefaultInstance();
  }

  public static final int CLIENT_STATS_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The client stats should be periodically reported to the load balancer
   * based on the duration defined in the InitialLoadBalanceResponse.
   * </pre>
   *
   * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
   */
  public boolean hasClientStats() {
    return loadBalanceRequestTypeCase_ == 2;
  }
  /**
   * <pre>
   * The client stats should be periodically reported to the load balancer
   * based on the duration defined in the InitialLoadBalanceResponse.
   * </pre>
   *
   * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
   */
  public io.grpc.lb.v1.ClientStats getClientStats() {
    if (loadBalanceRequestTypeCase_ == 2) {
       return (io.grpc.lb.v1.ClientStats) loadBalanceRequestType_;
    }
    return io.grpc.lb.v1.ClientStats.getDefaultInstance();
  }
  /**
   * <pre>
   * The client stats should be periodically reported to the load balancer
   * based on the duration defined in the InitialLoadBalanceResponse.
   * </pre>
   *
   * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
   */
  public io.grpc.lb.v1.ClientStatsOrBuilder getClientStatsOrBuilder() {
    if (loadBalanceRequestTypeCase_ == 2) {
       return (io.grpc.lb.v1.ClientStats) loadBalanceRequestType_;
    }
    return io.grpc.lb.v1.ClientStats.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (loadBalanceRequestTypeCase_ == 1) {
      output.writeMessage(1, (io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_);
    }
    if (loadBalanceRequestTypeCase_ == 2) {
      output.writeMessage(2, (io.grpc.lb.v1.ClientStats) loadBalanceRequestType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (loadBalanceRequestTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_);
    }
    if (loadBalanceRequestTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.grpc.lb.v1.ClientStats) loadBalanceRequestType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.lb.v1.LoadBalanceRequest)) {
      return super.equals(obj);
    }
    io.grpc.lb.v1.LoadBalanceRequest other = (io.grpc.lb.v1.LoadBalanceRequest) obj;

    boolean result = true;
    result = result && getLoadBalanceRequestTypeCase().equals(
        other.getLoadBalanceRequestTypeCase());
    if (!result) return false;
    switch (loadBalanceRequestTypeCase_) {
      case 1:
        result = result && getInitialRequest()
            .equals(other.getInitialRequest());
        break;
      case 2:
        result = result && getClientStats()
            .equals(other.getClientStats());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (loadBalanceRequestTypeCase_) {
      case 1:
        hash = (37 * hash) + INITIAL_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + getInitialRequest().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CLIENT_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getClientStats().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.LoadBalanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.lb.v1.LoadBalanceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.lb.v1.LoadBalanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.lb.v1.LoadBalanceRequest)
      io.grpc.lb.v1.LoadBalanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.lb.v1.LoadBalanceRequest.class, io.grpc.lb.v1.LoadBalanceRequest.Builder.class);
    }

    // Construct using io.grpc.lb.v1.LoadBalanceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      loadBalanceRequestTypeCase_ = 0;
      loadBalanceRequestType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor;
    }

    @java.lang.Override
    public io.grpc.lb.v1.LoadBalanceRequest getDefaultInstanceForType() {
      return io.grpc.lb.v1.LoadBalanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.lb.v1.LoadBalanceRequest build() {
      io.grpc.lb.v1.LoadBalanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.lb.v1.LoadBalanceRequest buildPartial() {
      io.grpc.lb.v1.LoadBalanceRequest result = new io.grpc.lb.v1.LoadBalanceRequest(this);
      if (loadBalanceRequestTypeCase_ == 1) {
        if (initialRequestBuilder_ == null) {
          result.loadBalanceRequestType_ = loadBalanceRequestType_;
        } else {
          result.loadBalanceRequestType_ = initialRequestBuilder_.build();
        }
      }
      if (loadBalanceRequestTypeCase_ == 2) {
        if (clientStatsBuilder_ == null) {
          result.loadBalanceRequestType_ = loadBalanceRequestType_;
        } else {
          result.loadBalanceRequestType_ = clientStatsBuilder_.build();
        }
      }
      result.loadBalanceRequestTypeCase_ = loadBalanceRequestTypeCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.lb.v1.LoadBalanceRequest) {
        return mergeFrom((io.grpc.lb.v1.LoadBalanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.lb.v1.LoadBalanceRequest other) {
      if (other == io.grpc.lb.v1.LoadBalanceRequest.getDefaultInstance()) return this;
      switch (other.getLoadBalanceRequestTypeCase()) {
        case INITIAL_REQUEST: {
          mergeInitialRequest(other.getInitialRequest());
          break;
        }
        case CLIENT_STATS: {
          mergeClientStats(other.getClientStats());
          break;
        }
        case LOADBALANCEREQUESTTYPE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.lb.v1.LoadBalanceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.lb.v1.LoadBalanceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int loadBalanceRequestTypeCase_ = 0;
    private java.lang.Object loadBalanceRequestType_;
    public LoadBalanceRequestTypeCase
        getLoadBalanceRequestTypeCase() {
      return LoadBalanceRequestTypeCase.forNumber(
          loadBalanceRequestTypeCase_);
    }

    public Builder clearLoadBalanceRequestType() {
      loadBalanceRequestTypeCase_ = 0;
      loadBalanceRequestType_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.InitialLoadBalanceRequest, io.grpc.lb.v1.InitialLoadBalanceRequest.Builder, io.grpc.lb.v1.InitialLoadBalanceRequestOrBuilder> initialRequestBuilder_;
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public boolean hasInitialRequest() {
      return loadBalanceRequestTypeCase_ == 1;
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public io.grpc.lb.v1.InitialLoadBalanceRequest getInitialRequest() {
      if (initialRequestBuilder_ == null) {
        if (loadBalanceRequestTypeCase_ == 1) {
          return (io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_;
        }
        return io.grpc.lb.v1.InitialLoadBalanceRequest.getDefaultInstance();
      } else {
        if (loadBalanceRequestTypeCase_ == 1) {
          return initialRequestBuilder_.getMessage();
        }
        return io.grpc.lb.v1.InitialLoadBalanceRequest.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public Builder setInitialRequest(io.grpc.lb.v1.InitialLoadBalanceRequest value) {
      if (initialRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loadBalanceRequestType_ = value;
        onChanged();
      } else {
        initialRequestBuilder_.setMessage(value);
      }
      loadBalanceRequestTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public Builder setInitialRequest(
        io.grpc.lb.v1.InitialLoadBalanceRequest.Builder builderForValue) {
      if (initialRequestBuilder_ == null) {
        loadBalanceRequestType_ = builderForValue.build();
        onChanged();
      } else {
        initialRequestBuilder_.setMessage(builderForValue.build());
      }
      loadBalanceRequestTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public Builder mergeInitialRequest(io.grpc.lb.v1.InitialLoadBalanceRequest value) {
      if (initialRequestBuilder_ == null) {
        if (loadBalanceRequestTypeCase_ == 1 &&
            loadBalanceRequestType_ != io.grpc.lb.v1.InitialLoadBalanceRequest.getDefaultInstance()) {
          loadBalanceRequestType_ = io.grpc.lb.v1.InitialLoadBalanceRequest.newBuilder((io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_)
              .mergeFrom(value).buildPartial();
        } else {
          loadBalanceRequestType_ = value;
        }
        onChanged();
      } else {
        if (loadBalanceRequestTypeCase_ == 1) {
          initialRequestBuilder_.mergeFrom(value);
        }
        initialRequestBuilder_.setMessage(value);
      }
      loadBalanceRequestTypeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public Builder clearInitialRequest() {
      if (initialRequestBuilder_ == null) {
        if (loadBalanceRequestTypeCase_ == 1) {
          loadBalanceRequestTypeCase_ = 0;
          loadBalanceRequestType_ = null;
          onChanged();
        }
      } else {
        if (loadBalanceRequestTypeCase_ == 1) {
          loadBalanceRequestTypeCase_ = 0;
          loadBalanceRequestType_ = null;
        }
        initialRequestBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public io.grpc.lb.v1.InitialLoadBalanceRequest.Builder getInitialRequestBuilder() {
      return getInitialRequestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    public io.grpc.lb.v1.InitialLoadBalanceRequestOrBuilder getInitialRequestOrBuilder() {
      if ((loadBalanceRequestTypeCase_ == 1) && (initialRequestBuilder_ != null)) {
        return initialRequestBuilder_.getMessageOrBuilder();
      } else {
        if (loadBalanceRequestTypeCase_ == 1) {
          return (io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_;
        }
        return io.grpc.lb.v1.InitialLoadBalanceRequest.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * This message should be sent on the first request to the load balancer.
     * </pre>
     *
     * <code>.grpc.lb.v1.InitialLoadBalanceRequest initial_request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.InitialLoadBalanceRequest, io.grpc.lb.v1.InitialLoadBalanceRequest.Builder, io.grpc.lb.v1.InitialLoadBalanceRequestOrBuilder> 
        getInitialRequestFieldBuilder() {
      if (initialRequestBuilder_ == null) {
        if (!(loadBalanceRequestTypeCase_ == 1)) {
          loadBalanceRequestType_ = io.grpc.lb.v1.InitialLoadBalanceRequest.getDefaultInstance();
        }
        initialRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.lb.v1.InitialLoadBalanceRequest, io.grpc.lb.v1.InitialLoadBalanceRequest.Builder, io.grpc.lb.v1.InitialLoadBalanceRequestOrBuilder>(
                (io.grpc.lb.v1.InitialLoadBalanceRequest) loadBalanceRequestType_,
                getParentForChildren(),
                isClean());
        loadBalanceRequestType_ = null;
      }
      loadBalanceRequestTypeCase_ = 1;
      onChanged();;
      return initialRequestBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.ClientStats, io.grpc.lb.v1.ClientStats.Builder, io.grpc.lb.v1.ClientStatsOrBuilder> clientStatsBuilder_;
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public boolean hasClientStats() {
      return loadBalanceRequestTypeCase_ == 2;
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public io.grpc.lb.v1.ClientStats getClientStats() {
      if (clientStatsBuilder_ == null) {
        if (loadBalanceRequestTypeCase_ == 2) {
          return (io.grpc.lb.v1.ClientStats) loadBalanceRequestType_;
        }
        return io.grpc.lb.v1.ClientStats.getDefaultInstance();
      } else {
        if (loadBalanceRequestTypeCase_ == 2) {
          return clientStatsBuilder_.getMessage();
        }
        return io.grpc.lb.v1.ClientStats.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public Builder setClientStats(io.grpc.lb.v1.ClientStats value) {
      if (clientStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loadBalanceRequestType_ = value;
        onChanged();
      } else {
        clientStatsBuilder_.setMessage(value);
      }
      loadBalanceRequestTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public Builder setClientStats(
        io.grpc.lb.v1.ClientStats.Builder builderForValue) {
      if (clientStatsBuilder_ == null) {
        loadBalanceRequestType_ = builderForValue.build();
        onChanged();
      } else {
        clientStatsBuilder_.setMessage(builderForValue.build());
      }
      loadBalanceRequestTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public Builder mergeClientStats(io.grpc.lb.v1.ClientStats value) {
      if (clientStatsBuilder_ == null) {
        if (loadBalanceRequestTypeCase_ == 2 &&
            loadBalanceRequestType_ != io.grpc.lb.v1.ClientStats.getDefaultInstance()) {
          loadBalanceRequestType_ = io.grpc.lb.v1.ClientStats.newBuilder((io.grpc.lb.v1.ClientStats) loadBalanceRequestType_)
              .mergeFrom(value).buildPartial();
        } else {
          loadBalanceRequestType_ = value;
        }
        onChanged();
      } else {
        if (loadBalanceRequestTypeCase_ == 2) {
          clientStatsBuilder_.mergeFrom(value);
        }
        clientStatsBuilder_.setMessage(value);
      }
      loadBalanceRequestTypeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public Builder clearClientStats() {
      if (clientStatsBuilder_ == null) {
        if (loadBalanceRequestTypeCase_ == 2) {
          loadBalanceRequestTypeCase_ = 0;
          loadBalanceRequestType_ = null;
          onChanged();
        }
      } else {
        if (loadBalanceRequestTypeCase_ == 2) {
          loadBalanceRequestTypeCase_ = 0;
          loadBalanceRequestType_ = null;
        }
        clientStatsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public io.grpc.lb.v1.ClientStats.Builder getClientStatsBuilder() {
      return getClientStatsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    public io.grpc.lb.v1.ClientStatsOrBuilder getClientStatsOrBuilder() {
      if ((loadBalanceRequestTypeCase_ == 2) && (clientStatsBuilder_ != null)) {
        return clientStatsBuilder_.getMessageOrBuilder();
      } else {
        if (loadBalanceRequestTypeCase_ == 2) {
          return (io.grpc.lb.v1.ClientStats) loadBalanceRequestType_;
        }
        return io.grpc.lb.v1.ClientStats.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The client stats should be periodically reported to the load balancer
     * based on the duration defined in the InitialLoadBalanceResponse.
     * </pre>
     *
     * <code>.grpc.lb.v1.ClientStats client_stats = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.lb.v1.ClientStats, io.grpc.lb.v1.ClientStats.Builder, io.grpc.lb.v1.ClientStatsOrBuilder> 
        getClientStatsFieldBuilder() {
      if (clientStatsBuilder_ == null) {
        if (!(loadBalanceRequestTypeCase_ == 2)) {
          loadBalanceRequestType_ = io.grpc.lb.v1.ClientStats.getDefaultInstance();
        }
        clientStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.lb.v1.ClientStats, io.grpc.lb.v1.ClientStats.Builder, io.grpc.lb.v1.ClientStatsOrBuilder>(
                (io.grpc.lb.v1.ClientStats) loadBalanceRequestType_,
                getParentForChildren(),
                isClean());
        loadBalanceRequestType_ = null;
      }
      loadBalanceRequestTypeCase_ = 2;
      onChanged();;
      return clientStatsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.lb.v1.LoadBalanceRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.lb.v1.LoadBalanceRequest)
  private static final io.grpc.lb.v1.LoadBalanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.lb.v1.LoadBalanceRequest();
  }

  public static io.grpc.lb.v1.LoadBalanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoadBalanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<LoadBalanceRequest>() {
    @java.lang.Override
    public LoadBalanceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoadBalanceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoadBalanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoadBalanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.lb.v1.LoadBalanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

