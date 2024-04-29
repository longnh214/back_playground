package com.spring.spring_security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(
                        (authorizeRequests) ->
                                    authorizeRequests
                                            .anyRequest()
                                            .authenticated()
                    )
                    .formLogin(
                            (formLogin) -> formLogin
                                    .loginPage("/login")
                                    .permitAll()
                                    .loginProcessingUrl("/login")
                                    .usernameParameter("username")
                                    .passwordParameter("password")
                                    .defaultSuccessUrl("/hello", true)
                    ).build();
    }

    @Bean
    public UserDetailsService userDetailService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("naknak").password("1234").build());
        return manager;
    }
}
