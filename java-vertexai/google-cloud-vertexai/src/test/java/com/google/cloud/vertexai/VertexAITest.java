/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.vertexai;

import static com.google.common.truth.Truth.assertThat;

import com.google.auth.oauth2.GoogleCredentials;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

@RunWith(JUnit4.class)
public final class VertexAITest {
  private static final String TEST_PROJECT = "test_project";
  private static final String TEST_LOCATION = "test_location";
  private VertexAI vertexAi;
  @Rule public final MockitoRule mocksRule = MockitoJUnit.rule();
  @Mock private GoogleCredentials mockGoogleCredentials;

  @Before
  public void doBeforeEachTest() throws Exception {
    vertexAi = new VertexAI(TEST_PROJECT, TEST_LOCATION, mockGoogleCredentials);
  }

  @Test
  public void testInstantiateVertexAI_shouldContainRightFields() throws IOException {
    assertThat(vertexAi.getProjectId()).isEqualTo("test_project");
  }
}
