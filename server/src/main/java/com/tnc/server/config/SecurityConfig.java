package com.tnc.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //    @Value("${eureka.username}")
//    private String username;
//    @Value("${eureka.password}")
//    private String password;
    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
                .username("user")
                .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
                .roles("USER")
                .build();
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
//                .roles("USER", "ADMIN")
//                .build();
        return new InMemoryUserDetailsManager(user);
    }
//

//    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder.inMemoryAuthentication()
//                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser("eureka")
//                .password("password")
//                .authorities("USER");
//    }

    @Bean
    public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
        return httpSecurity.build();
    }

















//    @Bean
//    public UserDetailsService users() {
//        // The builder will ensure the passwords are encoded before saving in memory
//        UserBuilder users = User.withDefaultPasswordEncoder();
//        UserDetails user = users
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        UserDetails admin = users
//                .username("admin")
//                .password("password")
//                .roles("USER", "ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user, admin);
//    }
}
