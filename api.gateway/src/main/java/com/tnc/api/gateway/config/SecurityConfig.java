package com.tnc.api.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

import static com.tnc.api.gateway.constant.SecurityConstant.PUBLIC_URL;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity serverHttpSecurity) {
        serverHttpSecurity.csrf().disable()
                .authorizeExchange(exchange -> exchange.pathMatchers(PUBLIC_URL).authenticated()
                .anyExchange().authenticated())
                .oauth2Login(Customizer.withDefaults());
        return serverHttpSecurity.build();
    }



//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity serverHttpSecurity) {
//        serverHttpSecurity.csrf().disable()
//                .authorizeExchange().pathMatchers(PUBLIC_URL)
//                .permitAll()
//                .anyExchange()
//                .authenticated()
////                .oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt)
//        ;
//        return serverHttpSecurity.build();
//    }
}
