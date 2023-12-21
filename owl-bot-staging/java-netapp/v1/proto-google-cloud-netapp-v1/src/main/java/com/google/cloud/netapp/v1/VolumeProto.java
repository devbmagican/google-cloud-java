// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/volume.proto

package com.google.cloud.netapp.v1;

public final class VolumeProto {
  private VolumeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_ListVolumesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_ListVolumesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_GetVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_GetVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_CreateVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_RevertVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_RevertVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_Volume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ExportPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_SnapshotPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_SnapshotPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_HourlySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_DailySchedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DailySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_WeeklySchedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_WeeklySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_MonthlySchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_MountOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_MountOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_RestoreParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_netapp_v1_BackupConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_BackupConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/netapp/v1/volume.proto\022\026g" +
      "oogle.cloud.netapp.v1\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032#google/cloud/netapp/v1/common.proto\032 " +
      "google/protobuf/field_mask.proto\032\037google" +
      "/protobuf/timestamp.proto\"\224\001\n\022ListVolume" +
      "sRequest\0225\n\006parent\030\001 \001(\tB%\342A\001\002\372A\036\022\034netap" +
      "p.googleapis.com/Volume\022\021\n\tpage_size\030\002 \001" +
      "(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020" +
      "\n\010order_by\030\005 \001(\t\"t\n\023ListVolumesResponse\022" +
      "/\n\007volumes\030\001 \003(\0132\036.google.cloud.netapp.v" +
      "1.Volume\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unr" +
      "eachable\030\003 \003(\t\"G\n\020GetVolumeRequest\0223\n\004na" +
      "me\030\001 \001(\tB%\342A\001\002\372A\036\n\034netapp.googleapis.com" +
      "/Volume\"\233\001\n\023CreateVolumeRequest\0225\n\006paren" +
      "t\030\001 \001(\tB%\342A\001\002\372A\036\022\034netapp.googleapis.com/" +
      "Volume\022\027\n\tvolume_id\030\002 \001(\tB\004\342A\001\002\0224\n\006volum" +
      "e\030\003 \001(\0132\036.google.cloud.netapp.v1.VolumeB" +
      "\004\342A\001\002\"\202\001\n\023UpdateVolumeRequest\0225\n\013update_" +
      "mask\030\001 \001(\0132\032.google.protobuf.FieldMaskB\004" +
      "\342A\001\002\0224\n\006volume\030\002 \001(\0132\036.google.cloud.neta" +
      "pp.v1.VolumeB\004\342A\001\002\"Y\n\023DeleteVolumeReques" +
      "t\0223\n\004name\030\001 \001(\tB%\342A\001\002\372A\036\n\034netapp.googlea" +
      "pis.com/Volume\022\r\n\005force\030\002 \001(\010\"e\n\023RevertV" +
      "olumeRequest\0223\n\004name\030\001 \001(\tB%\342A\001\002\372A\036\n\034net" +
      "app.googleapis.com/Volume\022\031\n\013snapshot_id" +
      "\030\002 \001(\tB\004\342A\001\002\"\313\016\n\006Volume\022\022\n\004name\030\001 \001(\tB\004\342" +
      "A\001\010\0229\n\005state\030\002 \001(\0162$.google.cloud.netapp" +
      ".v1.Volume.StateB\004\342A\001\003\022\033\n\rstate_details\030" +
      "\003 \001(\tB\004\342A\001\003\0225\n\013create_time\030\004 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\004\342A\001\003\022\030\n\nshare_name" +
      "\030\005 \001(\tB\004\342A\001\002\022\027\n\tpsa_range\030\006 \001(\tB\004\342A\001\003\022@\n" +
      "\014storage_pool\030\007 \001(\tB*\342A\001\002\372A#\n!netapp.goo" +
      "gleapis.com/StoragePool\0228\n\007network\030\010 \001(\t" +
      "B\'\342A\001\003\372A \n\036compute.googleapis.com/Networ" +
      "k\022A\n\rservice_level\030\t \001(\0162$.google.cloud." +
      "netapp.v1.ServiceLevelB\004\342A\001\003\022\032\n\014capacity" +
      "_gib\030\n \001(\003B\004\342A\001\002\022A\n\rexport_policy\030\013 \001(\0132" +
      "$.google.cloud.netapp.v1.ExportPolicyB\004\342" +
      "A\001\001\022:\n\tprotocols\030\014 \003(\0162!.google.cloud.ne" +
      "tapp.v1.ProtocolsB\004\342A\001\002\022?\n\014smb_settings\030" +
      "\r \003(\0162#.google.cloud.netapp.v1.SMBSettin" +
      "gsB\004\342A\001\001\022@\n\rmount_options\030\016 \003(\0132#.google" +
      ".cloud.netapp.v1.MountOptionB\004\342A\001\003\022\036\n\020un" +
      "ix_permissions\030\017 \001(\tB\004\342A\001\001\022@\n\006labels\030\020 \003" +
      "(\0132*.google.cloud.netapp.v1.Volume.Label" +
      "sEntryB\004\342A\001\001\022\031\n\013description\030\021 \001(\tB\004\342A\001\001\022" +
      "E\n\017snapshot_policy\030\022 \001(\0132&.google.cloud." +
      "netapp.v1.SnapshotPolicyB\004\342A\001\001\022\032\n\014snap_r" +
      "eserve\030\023 \001(\001B\004\342A\001\001\022 \n\022snapshot_directory" +
      "\030\024 \001(\010B\004\342A\001\001\022\026\n\010used_gib\030\025 \001(\003B\004\342A\001\003\022C\n\016" +
      "security_style\030\026 \001(\0162%.google.cloud.neta" +
      "pp.v1.SecurityStyleB\004\342A\001\001\022\036\n\020kerberos_en" +
      "abled\030\027 \001(\010B\004\342A\001\001\022\032\n\014ldap_enabled\030\030 \001(\010B" +
      "\004\342A\001\003\022H\n\020active_directory\030\031 \001(\tB.\342A\001\003\372A\'" +
      "\n%netapp.googleapis.com/ActiveDirectory\022" +
      "K\n\022restore_parameters\030\032 \001(\0132).google.clo" +
      "ud.netapp.v1.RestoreParametersB\004\342A\001\001\022<\n\n" +
      "kms_config\030\033 \001(\tB(\342A\001\003\372A!\n\037netapp.google" +
      "apis.com/KmsConfig\022E\n\017encryption_type\030\034 " +
      "\001(\0162&.google.cloud.netapp.v1.EncryptionT" +
      "ypeB\004\342A\001\003\022\035\n\017has_replication\030\035 \001(\010B\004\342A\001\003" +
      "\022@\n\rbackup_config\030\036 \001(\0132$.google.cloud.n" +
      "etapp.v1.BackupConfigH\000\210\001\001\022J\n\022restricted" +
      "_actions\030\037 \003(\0162(.google.cloud.netapp.v1." +
      "RestrictedActionB\004\342A\001\001\032-\n\013LabelsEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"{\n\005State\022\025" +
      "\n\021STATE_UNSPECIFIED\020\000\022\t\n\005READY\020\001\022\014\n\010CREA" +
      "TING\020\002\022\014\n\010DELETING\020\003\022\014\n\010UPDATING\020\004\022\r\n\tRE" +
      "STORING\020\005\022\014\n\010DISABLED\020\006\022\t\n\005ERROR\020\007:l\352Ai\n" +
      "\034netapp.googleapis.com/Volume\0228projects/" +
      "{project}/locations/{location}/volumes/{" +
      "volume}*\007volumes2\006volumeB\020\n\016_backup_conf" +
      "ig\"S\n\014ExportPolicy\022C\n\005rules\030\001 \003(\0132..goog" +
      "le.cloud.netapp.v1.SimpleExportPolicyRul" +
      "eB\004\342A\001\002\"\374\004\n\026SimpleExportPolicyRule\022\034\n\017al" +
      "lowed_clients\030\001 \001(\tH\000\210\001\001\022\034\n\017has_root_acc" +
      "ess\030\002 \001(\tH\001\210\001\001\022<\n\013access_type\030\003 \001(\0162\".go" +
      "ogle.cloud.netapp.v1.AccessTypeH\002\210\001\001\022\022\n\005" +
      "nfsv3\030\004 \001(\010H\003\210\001\001\022\022\n\005nfsv4\030\005 \001(\010H\004\210\001\001\022!\n\024" +
      "kerberos_5_read_only\030\006 \001(\010H\005\210\001\001\022\"\n\025kerbe" +
      "ros_5_read_write\030\007 \001(\010H\006\210\001\001\022\"\n\025kerberos_" +
      "5i_read_only\030\010 \001(\010H\007\210\001\001\022#\n\026kerberos_5i_r" +
      "ead_write\030\t \001(\010H\010\210\001\001\022\"\n\025kerberos_5p_read" +
      "_only\030\n \001(\010H\t\210\001\001\022#\n\026kerberos_5p_read_wri" +
      "te\030\013 \001(\010H\n\210\001\001B\022\n\020_allowed_clientsB\022\n\020_ha" +
      "s_root_accessB\016\n\014_access_typeB\010\n\006_nfsv3B" +
      "\010\n\006_nfsv4B\027\n\025_kerberos_5_read_onlyB\030\n\026_k" +
      "erberos_5_read_writeB\030\n\026_kerberos_5i_rea" +
      "d_onlyB\031\n\027_kerberos_5i_read_writeB\030\n\026_ke" +
      "rberos_5p_read_onlyB\031\n\027_kerberos_5p_read" +
      "_write\"\232\003\n\016SnapshotPolicy\022\024\n\007enabled\030\001 \001" +
      "(\010H\000\210\001\001\022D\n\017hourly_schedule\030\002 \001(\0132&.googl" +
      "e.cloud.netapp.v1.HourlyScheduleH\001\210\001\001\022B\n" +
      "\016daily_schedule\030\003 \001(\0132%.google.cloud.net" +
      "app.v1.DailyScheduleH\002\210\001\001\022D\n\017weekly_sche" +
      "dule\030\004 \001(\0132&.google.cloud.netapp.v1.Week" +
      "lyScheduleH\003\210\001\001\022F\n\020monthly_schedule\030\005 \001(" +
      "\0132\'.google.cloud.netapp.v1.MonthlySchedu" +
      "leH\004\210\001\001B\n\n\010_enabledB\022\n\020_hourly_scheduleB" +
      "\021\n\017_daily_scheduleB\022\n\020_weekly_scheduleB\023" +
      "\n\021_monthly_schedule\"f\n\016HourlySchedule\022\036\n" +
      "\021snapshots_to_keep\030\001 \001(\001H\000\210\001\001\022\023\n\006minute\030" +
      "\002 \001(\001H\001\210\001\001B\024\n\022_snapshots_to_keepB\t\n\007_min" +
      "ute\"\201\001\n\rDailySchedule\022\036\n\021snapshots_to_ke" +
      "ep\030\001 \001(\001H\000\210\001\001\022\023\n\006minute\030\002 \001(\001H\001\210\001\001\022\021\n\004ho" +
      "ur\030\003 \001(\001H\002\210\001\001B\024\n\022_snapshots_to_keepB\t\n\007_" +
      "minuteB\007\n\005_hour\"\234\001\n\016WeeklySchedule\022\036\n\021sn" +
      "apshots_to_keep\030\001 \001(\001H\000\210\001\001\022\023\n\006minute\030\002 \001" +
      "(\001H\001\210\001\001\022\021\n\004hour\030\003 \001(\001H\002\210\001\001\022\020\n\003day\030\004 \001(\tH" +
      "\003\210\001\001B\024\n\022_snapshots_to_keepB\t\n\007_minuteB\007\n" +
      "\005_hourB\006\n\004_day\"\261\001\n\017MonthlySchedule\022\036\n\021sn" +
      "apshots_to_keep\030\001 \001(\001H\000\210\001\001\022\023\n\006minute\030\002 \001" +
      "(\001H\001\210\001\001\022\021\n\004hour\030\003 \001(\001H\002\210\001\001\022\032\n\rdays_of_mo" +
      "nth\030\004 \001(\tH\003\210\001\001B\024\n\022_snapshots_to_keepB\t\n\007" +
      "_minuteB\007\n\005_hourB\020\n\016_days_of_month\"}\n\013Mo" +
      "untOption\022\016\n\006export\030\001 \001(\t\022\023\n\013export_full" +
      "\030\002 \001(\t\0223\n\010protocol\030\003 \001(\0162!.google.cloud." +
      "netapp.v1.Protocols\022\024\n\014instructions\030\004 \001(" +
      "\t\"Q\n\021RestoreParameters\022\031\n\017source_snapsho" +
      "t\030\001 \001(\tH\000\022\027\n\rsource_backup\030\002 \001(\tH\000B\010\n\006so" +
      "urce\"\340\001\n\014BackupConfig\022D\n\017backup_policies" +
      "\030\001 \003(\tB+\342A\001\001\372A$\n\"netapp.googleapis.com/B" +
      "ackupPolicy\022@\n\014backup_vault\030\002 \001(\tB*\342A\001\001\372" +
      "A#\n!netapp.googleapis.com/BackupVault\022+\n" +
      "\030scheduled_backup_enabled\030\003 \001(\010B\004\342A\001\001H\000\210" +
      "\001\001B\033\n\031_scheduled_backup_enabled*E\n\tProto" +
      "cols\022\031\n\025PROTOCOLS_UNSPECIFIED\020\000\022\t\n\005NFSV3" +
      "\020\001\022\t\n\005NFSV4\020\002\022\007\n\003SMB\020\003*W\n\nAccessType\022\033\n\027" +
      "ACCESS_TYPE_UNSPECIFIED\020\000\022\r\n\tREAD_ONLY\020\001" +
      "\022\016\n\nREAD_WRITE\020\002\022\r\n\tREAD_NONE\020\003*\350\001\n\013SMBS" +
      "ettings\022\034\n\030SMB_SETTINGS_UNSPECIFIED\020\000\022\020\n" +
      "\014ENCRYPT_DATA\020\001\022\r\n\tBROWSABLE\020\002\022\021\n\rCHANGE" +
      "_NOTIFY\020\003\022\021\n\rNON_BROWSABLE\020\004\022\013\n\007OPLOCKS\020" +
      "\005\022\021\n\rSHOW_SNAPSHOT\020\006\022\032\n\026SHOW_PREVIOUS_VE" +
      "RSIONS\020\007\022\034\n\030ACCESS_BASED_ENUMERATION\020\010\022\032" +
      "\n\026CONTINUOUSLY_AVAILABLE\020\t*C\n\rSecuritySt" +
      "yle\022\036\n\032SECURITY_STYLE_UNSPECIFIED\020\000\022\010\n\004N" +
      "TFS\020\001\022\010\n\004UNIX\020\002*A\n\020RestrictedAction\022!\n\035R" +
      "ESTRICTED_ACTION_UNSPECIFIED\020\000\022\n\n\006DELETE" +
      "\020\001B\255\001\n\032com.google.cloud.netapp.v1B\013Volum" +
      "eProtoP\001Z2cloud.google.com/go/netapp/api" +
      "v1/netapppb;netapppb\252\002\026Google.Cloud.NetA" +
      "pp.V1\312\002\026Google\\Cloud\\NetApp\\V1\352\002\031Google:" +
      ":Cloud::NetApp::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.netapp.v1.CommonProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_netapp_v1_ListVolumesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_ListVolumesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_ListVolumesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", "OrderBy", });
    internal_static_google_cloud_netapp_v1_ListVolumesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_netapp_v1_ListVolumesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_ListVolumesResponse_descriptor,
        new java.lang.String[] { "Volumes", "NextPageToken", "Unreachable", });
    internal_static_google_cloud_netapp_v1_GetVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_netapp_v1_GetVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_GetVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_netapp_v1_CreateVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor,
        new java.lang.String[] { "Parent", "VolumeId", "Volume", });
    internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_UpdateVolumeRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "Volume", });
    internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_DeleteVolumeRequest_descriptor,
        new java.lang.String[] { "Name", "Force", });
    internal_static_google_cloud_netapp_v1_RevertVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_netapp_v1_RevertVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_RevertVolumeRequest_descriptor,
        new java.lang.String[] { "Name", "SnapshotId", });
    internal_static_google_cloud_netapp_v1_Volume_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_netapp_v1_Volume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_Volume_descriptor,
        new java.lang.String[] { "Name", "State", "StateDetails", "CreateTime", "ShareName", "PsaRange", "StoragePool", "Network", "ServiceLevel", "CapacityGib", "ExportPolicy", "Protocols", "SmbSettings", "MountOptions", "UnixPermissions", "Labels", "Description", "SnapshotPolicy", "SnapReserve", "SnapshotDirectory", "UsedGib", "SecurityStyle", "KerberosEnabled", "LdapEnabled", "ActiveDirectory", "RestoreParameters", "KmsConfig", "EncryptionType", "HasReplication", "BackupConfig", "RestrictedActions", "BackupConfig", });
    internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_descriptor =
      internal_static_google_cloud_netapp_v1_Volume_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_Volume_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_netapp_v1_ExportPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_ExportPolicy_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_SimpleExportPolicyRule_descriptor,
        new java.lang.String[] { "AllowedClients", "HasRootAccess", "AccessType", "Nfsv3", "Nfsv4", "Kerberos5ReadOnly", "Kerberos5ReadWrite", "Kerberos5IReadOnly", "Kerberos5IReadWrite", "Kerberos5PReadOnly", "Kerberos5PReadWrite", "AllowedClients", "HasRootAccess", "AccessType", "Nfsv3", "Nfsv4", "Kerberos5ReadOnly", "Kerberos5ReadWrite", "Kerberos5IReadOnly", "Kerberos5IReadWrite", "Kerberos5PReadOnly", "Kerberos5PReadWrite", });
    internal_static_google_cloud_netapp_v1_SnapshotPolicy_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_netapp_v1_SnapshotPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_SnapshotPolicy_descriptor,
        new java.lang.String[] { "Enabled", "HourlySchedule", "DailySchedule", "WeeklySchedule", "MonthlySchedule", "Enabled", "HourlySchedule", "DailySchedule", "WeeklySchedule", "MonthlySchedule", });
    internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_netapp_v1_HourlySchedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor,
        new java.lang.String[] { "SnapshotsToKeep", "Minute", "SnapshotsToKeep", "Minute", });
    internal_static_google_cloud_netapp_v1_DailySchedule_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_netapp_v1_DailySchedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_DailySchedule_descriptor,
        new java.lang.String[] { "SnapshotsToKeep", "Minute", "Hour", "SnapshotsToKeep", "Minute", "Hour", });
    internal_static_google_cloud_netapp_v1_WeeklySchedule_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_netapp_v1_WeeklySchedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_WeeklySchedule_descriptor,
        new java.lang.String[] { "SnapshotsToKeep", "Minute", "Hour", "Day", "SnapshotsToKeep", "Minute", "Hour", "Day", });
    internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_netapp_v1_MonthlySchedule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor,
        new java.lang.String[] { "SnapshotsToKeep", "Minute", "Hour", "DaysOfMonth", "SnapshotsToKeep", "Minute", "Hour", "DaysOfMonth", });
    internal_static_google_cloud_netapp_v1_MountOption_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_netapp_v1_MountOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_MountOption_descriptor,
        new java.lang.String[] { "Export", "ExportFull", "Protocol", "Instructions", });
    internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_netapp_v1_RestoreParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor,
        new java.lang.String[] { "SourceSnapshot", "SourceBackup", "Source", });
    internal_static_google_cloud_netapp_v1_BackupConfig_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_netapp_v1_BackupConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_netapp_v1_BackupConfig_descriptor,
        new java.lang.String[] { "BackupPolicies", "BackupVault", "ScheduledBackupEnabled", "ScheduledBackupEnabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.netapp.v1.CommonProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
