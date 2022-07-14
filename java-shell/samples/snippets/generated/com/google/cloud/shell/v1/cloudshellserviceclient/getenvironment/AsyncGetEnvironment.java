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

package com.google.cloud.shell.v1.samples;

// [START shell_v1_generated_cloudshellserviceclient_getenvironment_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.shell.v1.CloudShellServiceClient;
import com.google.cloud.shell.v1.Environment;
import com.google.cloud.shell.v1.EnvironmentName;
import com.google.cloud.shell.v1.GetEnvironmentRequest;

public class AsyncGetEnvironment {

  public static void main(String[] args) throws Exception {
    asyncGetEnvironment();
  }

  public static void asyncGetEnvironment() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CloudShellServiceClient cloudShellServiceClient = CloudShellServiceClient.create()) {
      GetEnvironmentRequest request =
          GetEnvironmentRequest.newBuilder()
              .setName(EnvironmentName.of("[USER]", "[ENVIRONMENT]").toString())
              .build();
      ApiFuture<Environment> future =
          cloudShellServiceClient.getEnvironmentCallable().futureCall(request);
      // Do something.
      Environment response = future.get();
    }
  }
}
// [END shell_v1_generated_cloudshellserviceclient_getenvironment_async]
