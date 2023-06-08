// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of AccountSettings */
@Generated
class AccountSettingsImpl implements AccountSettingsService {
  private final ApiClient apiClient;

  public AccountSettingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ReadPersonalComputeSettingResponse readPersonalComputeSetting(
      ReadPersonalComputeSettingRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/dcp_acct_enable/names/default",
            apiClient.configuredAccountID());
    return apiClient.GET(path, request, ReadPersonalComputeSettingResponse.class);
  }
}
