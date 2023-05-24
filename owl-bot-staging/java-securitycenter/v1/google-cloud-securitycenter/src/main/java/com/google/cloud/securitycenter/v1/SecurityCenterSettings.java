/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.securitycenter.v1;

import static com.google.cloud.securitycenter.v1.SecurityCenterClient.GroupAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.GroupFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListBigQueryExportsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListMuteConfigsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListNotificationConfigsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListSourcesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.securitycenter.v1.stub.SecurityCenterStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link SecurityCenterClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (securitycenter.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createSecurityHealthAnalyticsCustomModule to 30
 * seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SecurityCenterSettings.Builder securityCenterSettingsBuilder =
 *     SecurityCenterSettings.newBuilder();
 * securityCenterSettingsBuilder
 *     .createSecurityHealthAnalyticsCustomModuleSettings()
 *     .setRetrySettings(
 *         securityCenterSettingsBuilder
 *             .createSecurityHealthAnalyticsCustomModuleSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * SecurityCenterSettings securityCenterSettings = securityCenterSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class SecurityCenterSettings extends ClientSettings<SecurityCenterSettings> {

  /** Returns the object with the settings used for calls to bulkMuteFindings. */
  public UnaryCallSettings<BulkMuteFindingsRequest, Operation> bulkMuteFindingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).bulkMuteFindingsSettings();
  }

  /** Returns the object with the settings used for calls to bulkMuteFindings. */
  public OperationCallSettings<BulkMuteFindingsRequest, BulkMuteFindingsResponse, Empty>
      bulkMuteFindingsOperationSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).bulkMuteFindingsOperationSettings();
  }

  /**
   * Returns the object with the settings used for calls to
   * createSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          CreateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      createSecurityHealthAnalyticsCustomModuleSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .createSecurityHealthAnalyticsCustomModuleSettings();
  }

  /** Returns the object with the settings used for calls to createSource. */
  public UnaryCallSettings<CreateSourceRequest, Source> createSourceSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).createSourceSettings();
  }

  /** Returns the object with the settings used for calls to createFinding. */
  public UnaryCallSettings<CreateFindingRequest, Finding> createFindingSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).createFindingSettings();
  }

  /** Returns the object with the settings used for calls to createMuteConfig. */
  public UnaryCallSettings<CreateMuteConfigRequest, MuteConfig> createMuteConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).createMuteConfigSettings();
  }

  /** Returns the object with the settings used for calls to createNotificationConfig. */
  public UnaryCallSettings<CreateNotificationConfigRequest, NotificationConfig>
      createNotificationConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).createNotificationConfigSettings();
  }

  /** Returns the object with the settings used for calls to deleteMuteConfig. */
  public UnaryCallSettings<DeleteMuteConfigRequest, Empty> deleteMuteConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).deleteMuteConfigSettings();
  }

  /** Returns the object with the settings used for calls to deleteNotificationConfig. */
  public UnaryCallSettings<DeleteNotificationConfigRequest, Empty>
      deleteNotificationConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).deleteNotificationConfigSettings();
  }

  /**
   * Returns the object with the settings used for calls to
   * deleteSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<DeleteSecurityHealthAnalyticsCustomModuleRequest, Empty>
      deleteSecurityHealthAnalyticsCustomModuleSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .deleteSecurityHealthAnalyticsCustomModuleSettings();
  }

  /** Returns the object with the settings used for calls to getBigQueryExport. */
  public UnaryCallSettings<GetBigQueryExportRequest, BigQueryExport> getBigQueryExportSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getBigQueryExportSettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getMuteConfig. */
  public UnaryCallSettings<GetMuteConfigRequest, MuteConfig> getMuteConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getMuteConfigSettings();
  }

  /** Returns the object with the settings used for calls to getNotificationConfig. */
  public UnaryCallSettings<GetNotificationConfigRequest, NotificationConfig>
      getNotificationConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getNotificationConfigSettings();
  }

  /** Returns the object with the settings used for calls to getOrganizationSettings. */
  public UnaryCallSettings<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getOrganizationSettingsSettings();
  }

  /**
   * Returns the object with the settings used for calls to
   * getEffectiveSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          GetEffectiveSecurityHealthAnalyticsCustomModuleRequest,
          EffectiveSecurityHealthAnalyticsCustomModule>
      getEffectiveSecurityHealthAnalyticsCustomModuleSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .getEffectiveSecurityHealthAnalyticsCustomModuleSettings();
  }

  /**
   * Returns the object with the settings used for calls to getSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          GetSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      getSecurityHealthAnalyticsCustomModuleSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .getSecurityHealthAnalyticsCustomModuleSettings();
  }

  /** Returns the object with the settings used for calls to getSource. */
  public UnaryCallSettings<GetSourceRequest, Source> getSourceSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).getSourceSettings();
  }

  /** Returns the object with the settings used for calls to groupAssets. */
  public PagedCallSettings<GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
      groupAssetsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).groupAssetsSettings();
  }

  /** Returns the object with the settings used for calls to groupFindings. */
  public PagedCallSettings<GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
      groupFindingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).groupFindingsSettings();
  }

  /** Returns the object with the settings used for calls to listAssets. */
  public PagedCallSettings<ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
      listAssetsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listAssetsSettings();
  }

  /**
   * Returns the object with the settings used for calls to
   * listDescendantSecurityHealthAnalyticsCustomModules.
   */
  public PagedCallSettings<
          ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
          ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
          ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
      listDescendantSecurityHealthAnalyticsCustomModulesSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .listDescendantSecurityHealthAnalyticsCustomModulesSettings();
  }

  /** Returns the object with the settings used for calls to listFindings. */
  public PagedCallSettings<ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
      listFindingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listFindingsSettings();
  }

  /** Returns the object with the settings used for calls to listMuteConfigs. */
  public PagedCallSettings<
          ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>
      listMuteConfigsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listMuteConfigsSettings();
  }

  /** Returns the object with the settings used for calls to listNotificationConfigs. */
  public PagedCallSettings<
          ListNotificationConfigsRequest,
          ListNotificationConfigsResponse,
          ListNotificationConfigsPagedResponse>
      listNotificationConfigsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listNotificationConfigsSettings();
  }

  /**
   * Returns the object with the settings used for calls to
   * listEffectiveSecurityHealthAnalyticsCustomModules.
   */
  public PagedCallSettings<
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
          ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
          ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
      listEffectiveSecurityHealthAnalyticsCustomModulesSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .listEffectiveSecurityHealthAnalyticsCustomModulesSettings();
  }

  /**
   * Returns the object with the settings used for calls to
   * listSecurityHealthAnalyticsCustomModules.
   */
  public PagedCallSettings<
          ListSecurityHealthAnalyticsCustomModulesRequest,
          ListSecurityHealthAnalyticsCustomModulesResponse,
          ListSecurityHealthAnalyticsCustomModulesPagedResponse>
      listSecurityHealthAnalyticsCustomModulesSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .listSecurityHealthAnalyticsCustomModulesSettings();
  }

  /** Returns the object with the settings used for calls to listSources. */
  public PagedCallSettings<ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
      listSourcesSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listSourcesSettings();
  }

  /** Returns the object with the settings used for calls to runAssetDiscovery. */
  public UnaryCallSettings<RunAssetDiscoveryRequest, Operation> runAssetDiscoverySettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).runAssetDiscoverySettings();
  }

  /** Returns the object with the settings used for calls to runAssetDiscovery. */
  public OperationCallSettings<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
      runAssetDiscoveryOperationSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).runAssetDiscoveryOperationSettings();
  }

  /** Returns the object with the settings used for calls to setFindingState. */
  public UnaryCallSettings<SetFindingStateRequest, Finding> setFindingStateSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).setFindingStateSettings();
  }

  /** Returns the object with the settings used for calls to setMute. */
  public UnaryCallSettings<SetMuteRequest, Finding> setMuteSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).setMuteSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  /** Returns the object with the settings used for calls to updateExternalSystem. */
  public UnaryCallSettings<UpdateExternalSystemRequest, ExternalSystem>
      updateExternalSystemSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateExternalSystemSettings();
  }

  /** Returns the object with the settings used for calls to updateFinding. */
  public UnaryCallSettings<UpdateFindingRequest, Finding> updateFindingSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateFindingSettings();
  }

  /** Returns the object with the settings used for calls to updateMuteConfig. */
  public UnaryCallSettings<UpdateMuteConfigRequest, MuteConfig> updateMuteConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateMuteConfigSettings();
  }

  /** Returns the object with the settings used for calls to updateNotificationConfig. */
  public UnaryCallSettings<UpdateNotificationConfigRequest, NotificationConfig>
      updateNotificationConfigSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateNotificationConfigSettings();
  }

  /** Returns the object with the settings used for calls to updateOrganizationSettings. */
  public UnaryCallSettings<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateOrganizationSettingsSettings();
  }

  /**
   * Returns the object with the settings used for calls to
   * updateSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          UpdateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      updateSecurityHealthAnalyticsCustomModuleSettings() {
    return ((SecurityCenterStubSettings) getStubSettings())
        .updateSecurityHealthAnalyticsCustomModuleSettings();
  }

  /** Returns the object with the settings used for calls to updateSource. */
  public UnaryCallSettings<UpdateSourceRequest, Source> updateSourceSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateSourceSettings();
  }

  /** Returns the object with the settings used for calls to updateSecurityMarks. */
  public UnaryCallSettings<UpdateSecurityMarksRequest, SecurityMarks>
      updateSecurityMarksSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateSecurityMarksSettings();
  }

  /** Returns the object with the settings used for calls to createBigQueryExport. */
  public UnaryCallSettings<CreateBigQueryExportRequest, BigQueryExport>
      createBigQueryExportSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).createBigQueryExportSettings();
  }

  /** Returns the object with the settings used for calls to deleteBigQueryExport. */
  public UnaryCallSettings<DeleteBigQueryExportRequest, Empty> deleteBigQueryExportSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).deleteBigQueryExportSettings();
  }

  /** Returns the object with the settings used for calls to updateBigQueryExport. */
  public UnaryCallSettings<UpdateBigQueryExportRequest, BigQueryExport>
      updateBigQueryExportSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).updateBigQueryExportSettings();
  }

  /** Returns the object with the settings used for calls to listBigQueryExports. */
  public PagedCallSettings<
          ListBigQueryExportsRequest, ListBigQueryExportsResponse, ListBigQueryExportsPagedResponse>
      listBigQueryExportsSettings() {
    return ((SecurityCenterStubSettings) getStubSettings()).listBigQueryExportsSettings();
  }

  public static final SecurityCenterSettings create(SecurityCenterStubSettings stub)
      throws IOException {
    return new SecurityCenterSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return SecurityCenterStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return SecurityCenterStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return SecurityCenterStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return SecurityCenterStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return SecurityCenterStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return SecurityCenterStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return SecurityCenterStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SecurityCenterStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  @BetaApi
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected SecurityCenterSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for SecurityCenterSettings. */
  public static class Builder extends ClientSettings.Builder<SecurityCenterSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(SecurityCenterStubSettings.newBuilder(clientContext));
    }

    protected Builder(SecurityCenterSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(SecurityCenterStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(SecurityCenterStubSettings.newBuilder());
    }

    @BetaApi
    private static Builder createHttpJsonDefault() {
      return new Builder(SecurityCenterStubSettings.newHttpJsonBuilder());
    }

    public SecurityCenterStubSettings.Builder getStubSettingsBuilder() {
      return ((SecurityCenterStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to bulkMuteFindings. */
    public UnaryCallSettings.Builder<BulkMuteFindingsRequest, Operation>
        bulkMuteFindingsSettings() {
      return getStubSettingsBuilder().bulkMuteFindingsSettings();
    }

    /** Returns the builder for the settings used for calls to bulkMuteFindings. */
    public OperationCallSettings.Builder<BulkMuteFindingsRequest, BulkMuteFindingsResponse, Empty>
        bulkMuteFindingsOperationSettings() {
      return getStubSettingsBuilder().bulkMuteFindingsOperationSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * createSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            CreateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        createSecurityHealthAnalyticsCustomModuleSettings() {
      return getStubSettingsBuilder().createSecurityHealthAnalyticsCustomModuleSettings();
    }

    /** Returns the builder for the settings used for calls to createSource. */
    public UnaryCallSettings.Builder<CreateSourceRequest, Source> createSourceSettings() {
      return getStubSettingsBuilder().createSourceSettings();
    }

    /** Returns the builder for the settings used for calls to createFinding. */
    public UnaryCallSettings.Builder<CreateFindingRequest, Finding> createFindingSettings() {
      return getStubSettingsBuilder().createFindingSettings();
    }

    /** Returns the builder for the settings used for calls to createMuteConfig. */
    public UnaryCallSettings.Builder<CreateMuteConfigRequest, MuteConfig>
        createMuteConfigSettings() {
      return getStubSettingsBuilder().createMuteConfigSettings();
    }

    /** Returns the builder for the settings used for calls to createNotificationConfig. */
    public UnaryCallSettings.Builder<CreateNotificationConfigRequest, NotificationConfig>
        createNotificationConfigSettings() {
      return getStubSettingsBuilder().createNotificationConfigSettings();
    }

    /** Returns the builder for the settings used for calls to deleteMuteConfig. */
    public UnaryCallSettings.Builder<DeleteMuteConfigRequest, Empty> deleteMuteConfigSettings() {
      return getStubSettingsBuilder().deleteMuteConfigSettings();
    }

    /** Returns the builder for the settings used for calls to deleteNotificationConfig. */
    public UnaryCallSettings.Builder<DeleteNotificationConfigRequest, Empty>
        deleteNotificationConfigSettings() {
      return getStubSettingsBuilder().deleteNotificationConfigSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * deleteSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<DeleteSecurityHealthAnalyticsCustomModuleRequest, Empty>
        deleteSecurityHealthAnalyticsCustomModuleSettings() {
      return getStubSettingsBuilder().deleteSecurityHealthAnalyticsCustomModuleSettings();
    }

    /** Returns the builder for the settings used for calls to getBigQueryExport. */
    public UnaryCallSettings.Builder<GetBigQueryExportRequest, BigQueryExport>
        getBigQueryExportSettings() {
      return getStubSettingsBuilder().getBigQueryExportSettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getMuteConfig. */
    public UnaryCallSettings.Builder<GetMuteConfigRequest, MuteConfig> getMuteConfigSettings() {
      return getStubSettingsBuilder().getMuteConfigSettings();
    }

    /** Returns the builder for the settings used for calls to getNotificationConfig. */
    public UnaryCallSettings.Builder<GetNotificationConfigRequest, NotificationConfig>
        getNotificationConfigSettings() {
      return getStubSettingsBuilder().getNotificationConfigSettings();
    }

    /** Returns the builder for the settings used for calls to getOrganizationSettings. */
    public UnaryCallSettings.Builder<GetOrganizationSettingsRequest, OrganizationSettings>
        getOrganizationSettingsSettings() {
      return getStubSettingsBuilder().getOrganizationSettingsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * getEffectiveSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            GetEffectiveSecurityHealthAnalyticsCustomModuleRequest,
            EffectiveSecurityHealthAnalyticsCustomModule>
        getEffectiveSecurityHealthAnalyticsCustomModuleSettings() {
      return getStubSettingsBuilder().getEffectiveSecurityHealthAnalyticsCustomModuleSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * getSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            GetSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        getSecurityHealthAnalyticsCustomModuleSettings() {
      return getStubSettingsBuilder().getSecurityHealthAnalyticsCustomModuleSettings();
    }

    /** Returns the builder for the settings used for calls to getSource. */
    public UnaryCallSettings.Builder<GetSourceRequest, Source> getSourceSettings() {
      return getStubSettingsBuilder().getSourceSettings();
    }

    /** Returns the builder for the settings used for calls to groupAssets. */
    public PagedCallSettings.Builder<
            GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
        groupAssetsSettings() {
      return getStubSettingsBuilder().groupAssetsSettings();
    }

    /** Returns the builder for the settings used for calls to groupFindings. */
    public PagedCallSettings.Builder<
            GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
        groupFindingsSettings() {
      return getStubSettingsBuilder().groupFindingsSettings();
    }

    /** Returns the builder for the settings used for calls to listAssets. */
    public PagedCallSettings.Builder<ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
        listAssetsSettings() {
      return getStubSettingsBuilder().listAssetsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * listDescendantSecurityHealthAnalyticsCustomModules.
     */
    public PagedCallSettings.Builder<
            ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
            ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
            ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
        listDescendantSecurityHealthAnalyticsCustomModulesSettings() {
      return getStubSettingsBuilder().listDescendantSecurityHealthAnalyticsCustomModulesSettings();
    }

    /** Returns the builder for the settings used for calls to listFindings. */
    public PagedCallSettings.Builder<
            ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
        listFindingsSettings() {
      return getStubSettingsBuilder().listFindingsSettings();
    }

    /** Returns the builder for the settings used for calls to listMuteConfigs. */
    public PagedCallSettings.Builder<
            ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>
        listMuteConfigsSettings() {
      return getStubSettingsBuilder().listMuteConfigsSettings();
    }

    /** Returns the builder for the settings used for calls to listNotificationConfigs. */
    public PagedCallSettings.Builder<
            ListNotificationConfigsRequest,
            ListNotificationConfigsResponse,
            ListNotificationConfigsPagedResponse>
        listNotificationConfigsSettings() {
      return getStubSettingsBuilder().listNotificationConfigsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * listEffectiveSecurityHealthAnalyticsCustomModules.
     */
    public PagedCallSettings.Builder<
            ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
            ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
            ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
        listEffectiveSecurityHealthAnalyticsCustomModulesSettings() {
      return getStubSettingsBuilder().listEffectiveSecurityHealthAnalyticsCustomModulesSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * listSecurityHealthAnalyticsCustomModules.
     */
    public PagedCallSettings.Builder<
            ListSecurityHealthAnalyticsCustomModulesRequest,
            ListSecurityHealthAnalyticsCustomModulesResponse,
            ListSecurityHealthAnalyticsCustomModulesPagedResponse>
        listSecurityHealthAnalyticsCustomModulesSettings() {
      return getStubSettingsBuilder().listSecurityHealthAnalyticsCustomModulesSettings();
    }

    /** Returns the builder for the settings used for calls to listSources. */
    public PagedCallSettings.Builder<
            ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
        listSourcesSettings() {
      return getStubSettingsBuilder().listSourcesSettings();
    }

    /** Returns the builder for the settings used for calls to runAssetDiscovery. */
    public UnaryCallSettings.Builder<RunAssetDiscoveryRequest, Operation>
        runAssetDiscoverySettings() {
      return getStubSettingsBuilder().runAssetDiscoverySettings();
    }

    /** Returns the builder for the settings used for calls to runAssetDiscovery. */
    public OperationCallSettings.Builder<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
        runAssetDiscoveryOperationSettings() {
      return getStubSettingsBuilder().runAssetDiscoveryOperationSettings();
    }

    /** Returns the builder for the settings used for calls to setFindingState. */
    public UnaryCallSettings.Builder<SetFindingStateRequest, Finding> setFindingStateSettings() {
      return getStubSettingsBuilder().setFindingStateSettings();
    }

    /** Returns the builder for the settings used for calls to setMute. */
    public UnaryCallSettings.Builder<SetMuteRequest, Finding> setMuteSettings() {
      return getStubSettingsBuilder().setMuteSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    /** Returns the builder for the settings used for calls to updateExternalSystem. */
    public UnaryCallSettings.Builder<UpdateExternalSystemRequest, ExternalSystem>
        updateExternalSystemSettings() {
      return getStubSettingsBuilder().updateExternalSystemSettings();
    }

    /** Returns the builder for the settings used for calls to updateFinding. */
    public UnaryCallSettings.Builder<UpdateFindingRequest, Finding> updateFindingSettings() {
      return getStubSettingsBuilder().updateFindingSettings();
    }

    /** Returns the builder for the settings used for calls to updateMuteConfig. */
    public UnaryCallSettings.Builder<UpdateMuteConfigRequest, MuteConfig>
        updateMuteConfigSettings() {
      return getStubSettingsBuilder().updateMuteConfigSettings();
    }

    /** Returns the builder for the settings used for calls to updateNotificationConfig. */
    public UnaryCallSettings.Builder<UpdateNotificationConfigRequest, NotificationConfig>
        updateNotificationConfigSettings() {
      return getStubSettingsBuilder().updateNotificationConfigSettings();
    }

    /** Returns the builder for the settings used for calls to updateOrganizationSettings. */
    public UnaryCallSettings.Builder<UpdateOrganizationSettingsRequest, OrganizationSettings>
        updateOrganizationSettingsSettings() {
      return getStubSettingsBuilder().updateOrganizationSettingsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to
     * updateSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            UpdateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        updateSecurityHealthAnalyticsCustomModuleSettings() {
      return getStubSettingsBuilder().updateSecurityHealthAnalyticsCustomModuleSettings();
    }

    /** Returns the builder for the settings used for calls to updateSource. */
    public UnaryCallSettings.Builder<UpdateSourceRequest, Source> updateSourceSettings() {
      return getStubSettingsBuilder().updateSourceSettings();
    }

    /** Returns the builder for the settings used for calls to updateSecurityMarks. */
    public UnaryCallSettings.Builder<UpdateSecurityMarksRequest, SecurityMarks>
        updateSecurityMarksSettings() {
      return getStubSettingsBuilder().updateSecurityMarksSettings();
    }

    /** Returns the builder for the settings used for calls to createBigQueryExport. */
    public UnaryCallSettings.Builder<CreateBigQueryExportRequest, BigQueryExport>
        createBigQueryExportSettings() {
      return getStubSettingsBuilder().createBigQueryExportSettings();
    }

    /** Returns the builder for the settings used for calls to deleteBigQueryExport. */
    public UnaryCallSettings.Builder<DeleteBigQueryExportRequest, Empty>
        deleteBigQueryExportSettings() {
      return getStubSettingsBuilder().deleteBigQueryExportSettings();
    }

    /** Returns the builder for the settings used for calls to updateBigQueryExport. */
    public UnaryCallSettings.Builder<UpdateBigQueryExportRequest, BigQueryExport>
        updateBigQueryExportSettings() {
      return getStubSettingsBuilder().updateBigQueryExportSettings();
    }

    /** Returns the builder for the settings used for calls to listBigQueryExports. */
    public PagedCallSettings.Builder<
            ListBigQueryExportsRequest,
            ListBigQueryExportsResponse,
            ListBigQueryExportsPagedResponse>
        listBigQueryExportsSettings() {
      return getStubSettingsBuilder().listBigQueryExportsSettings();
    }

    @Override
    public SecurityCenterSettings build() throws IOException {
      return new SecurityCenterSettings(this);
    }
  }
}
