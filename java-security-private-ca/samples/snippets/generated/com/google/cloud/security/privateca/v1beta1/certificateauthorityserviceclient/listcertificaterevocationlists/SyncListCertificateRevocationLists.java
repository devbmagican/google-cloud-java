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

package com.google.cloud.security.privateca.v1beta1.samples;

// [START privateca_v1beta1_generated_certificateauthorityserviceclient_listcertificaterevocationlists_sync]
import com.google.cloud.security.privateca.v1beta1.CertificateAuthorityName;
import com.google.cloud.security.privateca.v1beta1.CertificateAuthorityServiceClient;
import com.google.cloud.security.privateca.v1beta1.CertificateRevocationList;
import com.google.cloud.security.privateca.v1beta1.ListCertificateRevocationListsRequest;

public class SyncListCertificateRevocationLists {

  public static void main(String[] args) throws Exception {
    syncListCertificateRevocationLists();
  }

  public static void syncListCertificateRevocationLists() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
        CertificateAuthorityServiceClient.create()) {
      ListCertificateRevocationListsRequest request =
          ListCertificateRevocationListsRequest.newBuilder()
              .setParent(
                  CertificateAuthorityName.of("[PROJECT]", "[LOCATION]", "[CERTIFICATE_AUTHORITY]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      for (CertificateRevocationList element :
          certificateAuthorityServiceClient.listCertificateRevocationLists(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END privateca_v1beta1_generated_certificateauthorityserviceclient_listcertificaterevocationlists_sync]
