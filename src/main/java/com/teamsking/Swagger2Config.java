package com.teamsking;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * @author ynfeng
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * @return Docket
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.teamsking.api.endpoint"))
            .paths(PathSelectors.any())
            .build()
//            .host(host + ":" + port)
//            .pathMapping(baseUrl)
            .securitySchemes(Lists.newArrayList(apiKey()))
            .protocols(Sets.newHashSet("http", "https"))
            .securityContexts(Lists.newArrayList(securityContext()));
    }

    /**
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("teamsking")
            .description("teamsking")
            .build();
    }

    /**
     * apiKey
     *
     * @return ApiKey
     */
    private ApiKey apiKey() {
        return new ApiKey("Authorization", "Authorization", "header");
    }

    /**
     * securityContext
     *
     * @return SecurityContext
     */
    private SecurityContext securityContext() {
        return SecurityContext.builder()
            .securityReferences(defaultAuth())
            .forPaths(PathSelectors.regex("/anyPath.*"))
            .build();
    }

    /**
     * defaultAuth
     *
     * @return List<SecurityReference>
     */
    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope
            = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(
            new SecurityReference("Authorization", authorizationScopes));
    }
}
