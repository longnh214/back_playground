package com.spring.spring_security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final UserDetailsService userDetailsService;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable);

        return httpSecurity
                .authorizeHttpRequests(
                        (authorizeRequests) ->
                                authorizeRequests
                                        // Swagger 관련 경로를 허용
                                        .requestMatchers("/user/add").permitAll()
                                        .requestMatchers("/login").permitAll()
                                        .requestMatchers(
                                                "/swagger/**",       // Swagger UI 정적 리소스
                                                "/v3/api-docs/**",   // OpenAPI 문서
                                                "/swagger-ui/**"     // Swagger UI 경로
                                        )
                                        .permitAll()
                                        .anyRequest()
                                        .authenticated()
                )
                .formLogin(
                        (formLogin) -> formLogin
                                .loginPage("/login")
//                                .loginProcessingUrl("/login")
//                                .usernameParameter("username")
//                                .passwordParameter("password")
                                .defaultSuccessUrl("/hello", true)
                                .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                        .permitAll()
                )
                .build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("*");
        configuration.addAllowedMethod("*");
        configuration.addAllowedHeader("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

//    @Bean
//    public UserDetailsService userDetailService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("naknak").password("$2a$10$PjlNdXXgrgCdUDs11wPNVuiy").build());
//        return manager;
//    }
}
