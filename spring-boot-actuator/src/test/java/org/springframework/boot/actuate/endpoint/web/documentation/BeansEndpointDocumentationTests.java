/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.actuate.endpoint.web.documentation;

import org.junit.Test;

import org.springframework.boot.actuate.endpoint.BeansEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Tests for generating documentation describing {@link BeansEndpoint}.
 *
 * @author Andy Wilkinson
 */
public class BeansEndpointDocumentationTests extends AbstractEndpointDocumentationTests {

	@Test
	public void beans() throws Exception {
		this.mockMvc.perform(get("/application/beans")).andExpect(status().isOk())
				.andDo(MockMvcRestDocumentation.document("beans"));
	}

	@Configuration
	@Import(BaseDocumentationConfiguration.class)
	static class TestConfiguration {

		@Bean
		public BeansEndpoint beansEndpoint() {
			return new BeansEndpoint();
		}

	}

}
