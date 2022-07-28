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

package com.google.cloud.websecurityscanner.v1.samples;

// [START websecurityscanner_v1_generated_websecurityscannerclient_listfindings_paged_async]
import com.google.cloud.websecurityscanner.v1.Finding;
import com.google.cloud.websecurityscanner.v1.ListFindingsRequest;
import com.google.cloud.websecurityscanner.v1.ListFindingsResponse;
import com.google.cloud.websecurityscanner.v1.WebSecurityScannerClient;
import com.google.common.base.Strings;

public class AsyncListFindingsPaged {

  public static void main(String[] args) throws Exception {
    asyncListFindingsPaged();
  }

  public static void asyncListFindingsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      ListFindingsRequest request =
          ListFindingsRequest.newBuilder()
              .setParent("parent-995424086")
              .setFilter("filter-1274492040")
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      while (true) {
        ListFindingsResponse response =
            webSecurityScannerClient.listFindingsCallable().call(request);
        for (Finding element : response.getFindingsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END websecurityscanner_v1_generated_websecurityscannerclient_listfindings_paged_async]
