package com.leeknow.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator gatewayRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/currency-exchange/**").uri("lb://currency-exchange-service"))
                .route(p -> p.path("/currency-conversion/**").uri("lb://currency-conversion-service"))
                .build();
    }
}
