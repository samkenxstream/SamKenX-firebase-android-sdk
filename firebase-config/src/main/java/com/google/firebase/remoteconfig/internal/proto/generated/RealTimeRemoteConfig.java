// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RealTimeRemoteConfig.proto

package com.google.firebase.remoteconfig.internal.proto.generated;

public final class RealTimeRemoteConfig {
  private RealTimeRemoteConfig() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_remoteconfig_OpenFetchInvalidationStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_remoteconfig_OpenFetchInvalidationStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_remoteconfig_OpenFetchInvalidationStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_remoteconfig_OpenFetchInvalidationStreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032RealTimeRemoteConfig.proto\022\014remoteconf" +
      "ig\"n\n\"OpenFetchInvalidationStreamRequest" +
      "\022\022\n\nproject_id\030\001 \001(\t\022\021\n\tnamespace\030\002 \001(\t\022" +
      "!\n\031last_known_version_number\030\003 \001(\003\"5\n#Op" +
      "enFetchInvalidationStreamResponse\022\016\n\006upd" +
      "ate\030\001 \001(\0102\234\001\n\021RealTimeRCService\022\206\001\n\033Open" +
      "FetchInvalidationStream\0220.remoteconfig.O" +
      "penFetchInvalidationStreamRequest\0321.remo" +
      "teconfig.OpenFetchInvalidationStreamResp" +
      "onse\"\0000\001B3\n\017com.google.firebase.remoteconfig.internal.proto.generatedB\024RealTimeRem" +
      "oteConfigP\001\210\001\001\242\002\004RTRCb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_remoteconfig_OpenFetchInvalidationStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_remoteconfig_OpenFetchInvalidationStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_remoteconfig_OpenFetchInvalidationStreamRequest_descriptor,
        new java.lang.String[] { "ProjectId", "Namespace", "LastKnownVersionNumber", });
    internal_static_remoteconfig_OpenFetchInvalidationStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_remoteconfig_OpenFetchInvalidationStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_remoteconfig_OpenFetchInvalidationStreamResponse_descriptor,
        new java.lang.String[] { "Update", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}