// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PoPRequest.proto

package cpen431.mp.ProtocolBuffers;

public final class PoPRequest {
  private PoPRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 command = 1;</code>
     * @return The command.
     */
    int getCommand();

    /**
     * <code>string secretCode = 2;</code>
     * @return The secretCode.
     */
    java.lang.String getSecretCode();
    /**
     * <code>string secretCode = 2;</code>
     * @return The bytes for secretCode.
     */
    com.google.protobuf.ByteString
        getSecretCodeBytes();

    /**
     * <code>string hostname = 3;</code>
     * @return The hostname.
     */
    java.lang.String getHostname();
    /**
     * <code>string hostname = 3;</code>
     * @return The bytes for hostname.
     */
    com.google.protobuf.ByteString
        getHostnameBytes();

    /**
     * <code>uint32 port = 4;</code>
     * @return The port.
     */
    int getPort();

    /**
     * <code>string newCommand = 5;</code>
     * @return The newCommand.
     */
    java.lang.String getNewCommand();
    /**
     * <code>string newCommand = 5;</code>
     * @return The bytes for newCommand.
     */
    com.google.protobuf.ByteString
        getNewCommandBytes();

    /**
     * <code>int32 pid = 6;</code>
     * @return The pid.
     */
    int getPid();
  }
  /**
   * Protobuf type {@code PRequest}
   */
  public static final class PRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PRequest)
      PRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PRequest.newBuilder() to construct.
    private PRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PRequest() {
      secretCode_ = "";
      hostname_ = "";
      newCommand_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              command_ = input.readUInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              secretCode_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              hostname_ = s;
              break;
            }
            case 32: {

              port_ = input.readUInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              newCommand_ = s;
              break;
            }
            case 48: {

              pid_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return cpen431.mp.ProtocolBuffers.PoPRequest.internal_static_PRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cpen431.mp.ProtocolBuffers.PoPRequest.internal_static_PRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cpen431.mp.ProtocolBuffers.PoPRequest.PRequest.class, cpen431.mp.ProtocolBuffers.PoPRequest.PRequest.Builder.class);
    }

    public static final int COMMAND_FIELD_NUMBER = 1;
    private int command_;
    /**
     * <code>uint32 command = 1;</code>
     * @return The command.
     */
    @java.lang.Override
    public int getCommand() {
      return command_;
    }

    public static final int SECRETCODE_FIELD_NUMBER = 2;
    private volatile java.lang.Object secretCode_;
    /**
     * <code>string secretCode = 2;</code>
     * @return The secretCode.
     */
    @java.lang.Override
    public java.lang.String getSecretCode() {
      java.lang.Object ref = secretCode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretCode_ = s;
        return s;
      }
    }
    /**
     * <code>string secretCode = 2;</code>
     * @return The bytes for secretCode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSecretCodeBytes() {
      java.lang.Object ref = secretCode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secretCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HOSTNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object hostname_;
    /**
     * <code>string hostname = 3;</code>
     * @return The hostname.
     */
    @java.lang.Override
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      }
    }
    /**
     * <code>string hostname = 3;</code>
     * @return The bytes for hostname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 4;
    private int port_;
    /**
     * <code>uint32 port = 4;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }

    public static final int NEWCOMMAND_FIELD_NUMBER = 5;
    private volatile java.lang.Object newCommand_;
    /**
     * <code>string newCommand = 5;</code>
     * @return The newCommand.
     */
    @java.lang.Override
    public java.lang.String getNewCommand() {
      java.lang.Object ref = newCommand_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newCommand_ = s;
        return s;
      }
    }
    /**
     * <code>string newCommand = 5;</code>
     * @return The bytes for newCommand.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNewCommandBytes() {
      java.lang.Object ref = newCommand_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newCommand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PID_FIELD_NUMBER = 6;
    private int pid_;
    /**
     * <code>int32 pid = 6;</code>
     * @return The pid.
     */
    @java.lang.Override
    public int getPid() {
      return pid_;
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
      if (command_ != 0) {
        output.writeUInt32(1, command_);
      }
      if (!getSecretCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secretCode_);
      }
      if (!getHostnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hostname_);
      }
      if (port_ != 0) {
        output.writeUInt32(4, port_);
      }
      if (!getNewCommandBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, newCommand_);
      }
      if (pid_ != 0) {
        output.writeInt32(6, pid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (command_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, command_);
      }
      if (!getSecretCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secretCode_);
      }
      if (!getHostnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hostname_);
      }
      if (port_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, port_);
      }
      if (!getNewCommandBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, newCommand_);
      }
      if (pid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, pid_);
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
      if (!(obj instanceof cpen431.mp.ProtocolBuffers.PoPRequest.PRequest)) {
        return super.equals(obj);
      }
      cpen431.mp.ProtocolBuffers.PoPRequest.PRequest other = (cpen431.mp.ProtocolBuffers.PoPRequest.PRequest) obj;

      if (getCommand()
          != other.getCommand()) return false;
      if (!getSecretCode()
          .equals(other.getSecretCode())) return false;
      if (!getHostname()
          .equals(other.getHostname())) return false;
      if (getPort()
          != other.getPort()) return false;
      if (!getNewCommand()
          .equals(other.getNewCommand())) return false;
      if (getPid()
          != other.getPid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + COMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getCommand();
      hash = (37 * hash) + SECRETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getSecretCode().hashCode();
      hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
      hash = (53 * hash) + getHostname().hashCode();
      hash = (37 * hash) + PORT_FIELD_NUMBER;
      hash = (53 * hash) + getPort();
      hash = (37 * hash) + NEWCOMMAND_FIELD_NUMBER;
      hash = (53 * hash) + getNewCommand().hashCode();
      hash = (37 * hash) + PID_FIELD_NUMBER;
      hash = (53 * hash) + getPid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parseFrom(
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
    public static Builder newBuilder(cpen431.mp.ProtocolBuffers.PoPRequest.PRequest prototype) {
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
     * Protobuf type {@code PRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PRequest)
        cpen431.mp.ProtocolBuffers.PoPRequest.PRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cpen431.mp.ProtocolBuffers.PoPRequest.internal_static_PRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cpen431.mp.ProtocolBuffers.PoPRequest.internal_static_PRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cpen431.mp.ProtocolBuffers.PoPRequest.PRequest.class, cpen431.mp.ProtocolBuffers.PoPRequest.PRequest.Builder.class);
      }

      // Construct using cpen431.mp.ProtocolBuffers.PoPRequest.PRequest.newBuilder()
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
        command_ = 0;

        secretCode_ = "";

        hostname_ = "";

        port_ = 0;

        newCommand_ = "";

        pid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cpen431.mp.ProtocolBuffers.PoPRequest.internal_static_PRequest_descriptor;
      }

      @java.lang.Override
      public cpen431.mp.ProtocolBuffers.PoPRequest.PRequest getDefaultInstanceForType() {
        return cpen431.mp.ProtocolBuffers.PoPRequest.PRequest.getDefaultInstance();
      }

      @java.lang.Override
      public cpen431.mp.ProtocolBuffers.PoPRequest.PRequest build() {
        cpen431.mp.ProtocolBuffers.PoPRequest.PRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cpen431.mp.ProtocolBuffers.PoPRequest.PRequest buildPartial() {
        cpen431.mp.ProtocolBuffers.PoPRequest.PRequest result = new cpen431.mp.ProtocolBuffers.PoPRequest.PRequest(this);
        result.command_ = command_;
        result.secretCode_ = secretCode_;
        result.hostname_ = hostname_;
        result.port_ = port_;
        result.newCommand_ = newCommand_;
        result.pid_ = pid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cpen431.mp.ProtocolBuffers.PoPRequest.PRequest) {
          return mergeFrom((cpen431.mp.ProtocolBuffers.PoPRequest.PRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cpen431.mp.ProtocolBuffers.PoPRequest.PRequest other) {
        if (other == cpen431.mp.ProtocolBuffers.PoPRequest.PRequest.getDefaultInstance()) return this;
        if (other.getCommand() != 0) {
          setCommand(other.getCommand());
        }
        if (!other.getSecretCode().isEmpty()) {
          secretCode_ = other.secretCode_;
          onChanged();
        }
        if (!other.getHostname().isEmpty()) {
          hostname_ = other.hostname_;
          onChanged();
        }
        if (other.getPort() != 0) {
          setPort(other.getPort());
        }
        if (!other.getNewCommand().isEmpty()) {
          newCommand_ = other.newCommand_;
          onChanged();
        }
        if (other.getPid() != 0) {
          setPid(other.getPid());
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
        cpen431.mp.ProtocolBuffers.PoPRequest.PRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cpen431.mp.ProtocolBuffers.PoPRequest.PRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int command_ ;
      /**
       * <code>uint32 command = 1;</code>
       * @return The command.
       */
      @java.lang.Override
      public int getCommand() {
        return command_;
      }
      /**
       * <code>uint32 command = 1;</code>
       * @param value The command to set.
       * @return This builder for chaining.
       */
      public Builder setCommand(int value) {
        
        command_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 command = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCommand() {
        
        command_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object secretCode_ = "";
      /**
       * <code>string secretCode = 2;</code>
       * @return The secretCode.
       */
      public java.lang.String getSecretCode() {
        java.lang.Object ref = secretCode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          secretCode_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string secretCode = 2;</code>
       * @return The bytes for secretCode.
       */
      public com.google.protobuf.ByteString
          getSecretCodeBytes() {
        java.lang.Object ref = secretCode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          secretCode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string secretCode = 2;</code>
       * @param value The secretCode to set.
       * @return This builder for chaining.
       */
      public Builder setSecretCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        secretCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string secretCode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSecretCode() {
        
        secretCode_ = getDefaultInstance().getSecretCode();
        onChanged();
        return this;
      }
      /**
       * <code>string secretCode = 2;</code>
       * @param value The bytes for secretCode to set.
       * @return This builder for chaining.
       */
      public Builder setSecretCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        secretCode_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object hostname_ = "";
      /**
       * <code>string hostname = 3;</code>
       * @return The hostname.
       */
      public java.lang.String getHostname() {
        java.lang.Object ref = hostname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          hostname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string hostname = 3;</code>
       * @return The bytes for hostname.
       */
      public com.google.protobuf.ByteString
          getHostnameBytes() {
        java.lang.Object ref = hostname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hostname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string hostname = 3;</code>
       * @param value The hostname to set.
       * @return This builder for chaining.
       */
      public Builder setHostname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        hostname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string hostname = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHostname() {
        
        hostname_ = getDefaultInstance().getHostname();
        onChanged();
        return this;
      }
      /**
       * <code>string hostname = 3;</code>
       * @param value The bytes for hostname to set.
       * @return This builder for chaining.
       */
      public Builder setHostnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        hostname_ = value;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>uint32 port = 4;</code>
       * @return The port.
       */
      @java.lang.Override
      public int getPort() {
        return port_;
      }
      /**
       * <code>uint32 port = 4;</code>
       * @param value The port to set.
       * @return This builder for chaining.
       */
      public Builder setPort(int value) {
        
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 port = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPort() {
        
        port_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object newCommand_ = "";
      /**
       * <code>string newCommand = 5;</code>
       * @return The newCommand.
       */
      public java.lang.String getNewCommand() {
        java.lang.Object ref = newCommand_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          newCommand_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string newCommand = 5;</code>
       * @return The bytes for newCommand.
       */
      public com.google.protobuf.ByteString
          getNewCommandBytes() {
        java.lang.Object ref = newCommand_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          newCommand_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string newCommand = 5;</code>
       * @param value The newCommand to set.
       * @return This builder for chaining.
       */
      public Builder setNewCommand(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        newCommand_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string newCommand = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearNewCommand() {
        
        newCommand_ = getDefaultInstance().getNewCommand();
        onChanged();
        return this;
      }
      /**
       * <code>string newCommand = 5;</code>
       * @param value The bytes for newCommand to set.
       * @return This builder for chaining.
       */
      public Builder setNewCommandBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        newCommand_ = value;
        onChanged();
        return this;
      }

      private int pid_ ;
      /**
       * <code>int32 pid = 6;</code>
       * @return The pid.
       */
      @java.lang.Override
      public int getPid() {
        return pid_;
      }
      /**
       * <code>int32 pid = 6;</code>
       * @param value The pid to set.
       * @return This builder for chaining.
       */
      public Builder setPid(int value) {
        
        pid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 pid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPid() {
        
        pid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PRequest)
    }

    // @@protoc_insertion_point(class_scope:PRequest)
    private static final cpen431.mp.ProtocolBuffers.PoPRequest.PRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cpen431.mp.ProtocolBuffers.PoPRequest.PRequest();
    }

    public static cpen431.mp.ProtocolBuffers.PoPRequest.PRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PRequest>
        PARSER = new com.google.protobuf.AbstractParser<PRequest>() {
      @java.lang.Override
      public PRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cpen431.mp.ProtocolBuffers.PoPRequest.PRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020PoPRequest.proto\"p\n\010PRequest\022\017\n\007comman" +
      "d\030\001 \001(\r\022\022\n\nsecretCode\030\002 \001(\t\022\020\n\010hostname\030" +
      "\003 \001(\t\022\014\n\004port\030\004 \001(\r\022\022\n\nnewCommand\030\005 \001(\t\022" +
      "\013\n\003pid\030\006 \001(\005B(\n\032cpen431.mp.ProtocolBuffe" +
      "rsB\nPoPRequestb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PRequest_descriptor,
        new java.lang.String[] { "Command", "SecretCode", "Hostname", "Port", "NewCommand", "Pid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
