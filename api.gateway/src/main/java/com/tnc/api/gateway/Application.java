package com.tnc.api.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Autowired
//    private TokenRelayGatewayFilterFactory filterFactory;
//
//
//    @Bean
//    public RouteLocator myRoute(RouteLocatorBuilder routeLocatorBuilder) {
//        return routeLocatorBuilder.routes()
//                .route(p -> p
//                        .path("/client/**")
//                        .filters(f->f.filters(filterFactory.apply())
//                                .rewritePath("/client/(?<segment>.*)", "/${segment}")
//                                .removeRequestHeader("Cookie"))
//                        .uri("lb://CLIENT")).build();
//    }
}
