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

package com.google.cloud.recommender.v1beta1.samples;

// [START recommender_v1beta1_generated_recommenderclient_listinsights_paged_async]
import com.google.cloud.recommender.v1beta1.Insight;
import com.google.cloud.recommender.v1beta1.InsightTypeName;
import com.google.cloud.recommender.v1beta1.ListInsightsRequest;
import com.google.cloud.recommender.v1beta1.ListInsightsResponse;
import com.google.cloud.recommender.v1beta1.RecommenderClient;
import com.google.common.base.Strings;

public class AsyncListInsightsPaged {

  public static void main(String[] args) throws Exception {
    asyncListInsightsPaged();
  }

  public static void asyncListInsightsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RecommenderClient recommenderClient = RecommenderClient.create()) {
      ListInsightsRequest request =
          ListInsightsRequest.newBuilder()
              .setParent(
                  InsightTypeName.ofProjectLocationInsightTypeName(
                          "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      while (true) {
        ListInsightsResponse response = recommenderClient.listInsightsCallable().call(request);
        for (Insight element : response.getInsightsList()) {
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
// [END recommender_v1beta1_generated_recommenderclient_listinsights_paged_async]
