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

package org.springframework.boot.actuate.autoconfigure;

/**
 * Tests for {@link EndpointWebMvcHypermediaManagementContextConfiguration}.
 *
 * @author Andy Wilkinson
 */
public class EndpointWebMvcHypermediaManagementContextConfigurationTests {

	// private AnnotationConfigWebApplicationContext context;
	//
	// @Before
	// public void setRequestAttributes() {
	// RequestContextHolder.setRequestAttributes(
	// new ServletRequestAttributes(new MockHttpServletRequest()));
	// }
	//
	// @After
	// public void resetRequestAttributes() {
	// RequestContextHolder.resetRequestAttributes();
	// }
	//
	// @After
	// public void closeContext() {
	// this.context.close();
	// }
	//
	// @Test
	// public void basicConfiguration() {
	// load();
	// assertThat(this.context.getBeansOfType(ManagementServletContext.class))
	// .hasSize(1);
	// assertThat(this.context.getBeansOfType(HalJsonMvcEndpoint.class)).hasSize(1);
	// assertThat(this.context.getBeansOfType(DocsMvcEndpoint.class)).hasSize(1);
	// assertThat(this.context.getBeansOfType(DefaultCurieProvider.class)).isEmpty();
	// }
	//
	// @Test
	// public void curiesEnabledWithDefaultPorts() {
	// load("endpoints.docs.curies.enabled:true");
	// assertThat(getCurieHref()).isEqualTo(
	// "http://localhost/application/docs/#spring_boot_actuator__{rel}");
	// }
	//
	// @Test
	// public void curiesEnabledWithRandomPorts() {
	// load("endpoints.docs.curies.enabled:true", "server.port:0", "management.port:0");
	// assertThat(getCurieHref()).isEqualTo(
	// "http://localhost/application/docs/#spring_boot_actuator__{rel}");
	// }
	//
	// @Test
	// public void curiesEnabledWithSpecificServerPort() {
	// load("endpoints.docs.curies.enabled:true", "server.port:8080");
	// assertThat(getCurieHref()).isEqualTo(
	// "http://localhost/application/docs/#spring_boot_actuator__{rel}");
	// }
	//
	// @Test
	// public void curiesEnabledWithSpecificManagementPort() {
	// load("endpoints.docs.curies.enabled:true", "management.port:8081");
	// assertThat(getCurieHref()).isEqualTo(
	// "http://localhost/application/docs/#spring_boot_actuator__{rel}");
	// }
	//
	// @Test
	// public void curiesEnabledWithSpecificManagementAndServerPorts() {
	// load("endpoints.docs.curies.enabled:true", "server.port:8080",
	// "management.port:8081");
	// assertThat(getCurieHref()).isEqualTo(
	// "http://localhost/application/docs/#spring_boot_actuator__{rel}");
	// }
	//
	// private void load(String... properties) {
	// this.context = new AnnotationConfigWebApplicationContext();
	// this.context.setClassLoader(new ClassLoader(getClass().getClassLoader()) {
	//
	// @Override
	// public URL getResource(String name) {
	// if ("META-INF/resources/spring-boot-actuator/docs/index.html"
	// .equals(name)) {
	// return super.getResource("actuator-docs-index.html");
	// }
	// return super.getResource(name);
	// }
	//
	// });
	// TestPropertyValues.of(properties).applyTo(this.context);
	// this.context.register(TestConfiguration.class,
	// HttpMessageConvertersAutoConfiguration.class,
	// EndpointWebMvcHypermediaManagementContextConfiguration.class);
	// this.context.refresh();
	// }
	//
	// private String getCurieHref() {
	// DefaultCurieProvider curieProvider = this.context
	// .getBean(DefaultCurieProvider.class);
	// Link link = (Link) curieProvider.getCurieInformation(null).iterator().next();
	// return link.getHref();
	// }
	//
	// @Configuration
	// @EnableConfigurationProperties({ ManagementServerProperties.class,
	// ServerProperties.class })
	// static class TestConfiguration {
	//
	// @Bean
	// public MvcEndpoints mvcEndpoints() {
	// return new MvcEndpoints();
	// }
	//
	// }

}
