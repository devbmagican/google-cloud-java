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

package com.google.appengine.v1.samples;

// [START appengine_v1_generated_DomainMappings_CreateDomainMapping_async]
import com.google.api.core.ApiFuture;
import com.google.appengine.v1.CreateDomainMappingRequest;
import com.google.appengine.v1.DomainMapping;
import com.google.appengine.v1.DomainMappingsClient;
import com.google.appengine.v1.DomainOverrideStrategy;
import com.google.longrunning.Operation;

public class AsyncCreateDomainMapping {

  public static void main(String[] args) throws Exception {
    asyncCreateDomainMapping();
  }

  public static void asyncCreateDomainMapping() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DomainMappingsClient domainMappingsClient = DomainMappingsClient.create()) {
      CreateDomainMappingRequest request =
          CreateDomainMappingRequest.newBuilder()
              .setParent("parent-995424086")
              .setDomainMapping(DomainMapping.newBuilder().build())
              .setOverrideStrategy(DomainOverrideStrategy.forNumber(0))
              .build();
      ApiFuture<Operation> future =
          domainMappingsClient.createDomainMappingCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END appengine_v1_generated_DomainMappings_CreateDomainMapping_async]
