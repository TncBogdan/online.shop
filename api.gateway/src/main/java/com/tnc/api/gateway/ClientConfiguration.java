//package com.tnc.api.gateway;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ClientConfiguration {
//
//    @Bean
//    public RouteLocator gatewayClientRoute(RouteLocatorBuilder routeLocatorBuilder) {
//        return routeLocatorBuilder.routes()
//                .route(p -> p
//                        .path("client.microservice/**")
//                        .uri("lb://client.microservice")
//                ).build();
//    }
//}
