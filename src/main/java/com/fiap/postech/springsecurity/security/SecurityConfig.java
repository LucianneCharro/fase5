package com.fiap.postech.springsecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private AuthenticationProvider daoProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return http
                .csrf(csrfConfig -> csrfConfig.disable())
                .sessionManagement(sessMagConfig -> sessMagConfig.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(daoProvider)
                .authorizeHttpRequests(authReqConfig -> {

                    authReqConfig.requestMatchers(HttpMethod.POST, "/customers").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.GET, "/products").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.GET, "/products/{productId}").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.PUT, "/products/{productId}").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.POST, "/products").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.GET, "/categories").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.POST, "/categories").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.POST, "/auth/authenticate").permitAll();
                    authReqConfig.requestMatchers(HttpMethod.GET, "/auth/validate-token").permitAll();
                    authReqConfig.anyRequest().authenticated();
                })
                .build();
    }
}
