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

package com.google.cloud.domains.v1.samples;

// [START domains_v1_generated_domainsclient_deleteregistration_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.domains.v1.DeleteRegistrationRequest;
import com.google.cloud.domains.v1.DomainsClient;
import com.google.cloud.domains.v1.RegistrationName;
import com.google.longrunning.Operation;

public class AsyncDeleteRegistration {

  public static void main(String[] args) throws Exception {
    asyncDeleteRegistration();
  }

  public static void asyncDeleteRegistration() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      DeleteRegistrationRequest request =
          DeleteRegistrationRequest.newBuilder()
              .setName(RegistrationName.of("[PROJECT]", "[LOCATION]", "[REGISTRATION]").toString())
              .build();
      ApiFuture<Operation> future = domainsClient.deleteRegistrationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END domains_v1_generated_domainsclient_deleteregistration_async]
