package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-15T06:02:20.320+02:00")

@Configuration
public class SwaggerDocumentationConfig {

	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("RecycleEasy")
				.description("The 'RecyclEasy' is a web application, that helps people find places near them, where they can dispose recyclabe garbage. As well as, publish advertisements related to recyclable garbage managment and disposal.")
				.license("")
				.licenseUrl("http://unlicense.org")
				.termsOfServiceUrl("")
				.version("1.0.0")
				.contact(new Contact("", "", ""))
				.build();
	}

	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("io.swagger.controllers"))
				.build()
				.apiInfo(apiInfo());
	}

}
