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

package com.google.cloud.datastream.v1.samples;

// [START datastream_v1_generated_datastreamclient_getstreamobject_sync]
import com.google.cloud.datastream.v1.DatastreamClient;
import com.google.cloud.datastream.v1.GetStreamObjectRequest;
import com.google.cloud.datastream.v1.StreamObject;
import com.google.cloud.datastream.v1.StreamObjectName;

public class SyncGetStreamObject {

  public static void main(String[] args) throws Exception {
    syncGetStreamObject();
  }

  public static void syncGetStreamObject() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DatastreamClient datastreamClient = DatastreamClient.create()) {
      GetStreamObjectRequest request =
          GetStreamObjectRequest.newBuilder()
              .setName(
                  StreamObjectName.of("[PROJECT]", "[LOCATION]", "[STREAM]", "[OBJECT]").toString())
              .build();
      StreamObject response = datastreamClient.getStreamObject(request);
    }
  }
}
// [END datastream_v1_generated_datastreamclient_getstreamobject_sync]
