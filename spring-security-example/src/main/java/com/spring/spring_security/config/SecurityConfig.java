package com.spring.spring_security.config;

import com.spring.spring_security.filter.JwtAuthenticationFilter;
import com.spring.spring_security.service.OAuthUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final OAuthUserDetailService oAuthUserDetailService;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        //Session 방식 및 OAuth 방식 return
//        return httpSecurity
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(
//                        (authorizeRequests) ->
//                                authorizeRequests
//                                        // Swagger 관련 경로를 허용
//                                        .requestMatchers("/user/add").permitAll()
//                                        .requestMatchers("/login/**", "/oauth2/**").permitAll()
//                                        .requestMatchers(
//                                                "/swagger/**",       // Swagger UI 정적 리소스
//                                                "/v3/api-docs/**",   // OpenAPI 문서
//                                                "/swagger-ui/**"     // Swagger UI 경로
//                                        )
//                                        .permitAll()
//                                        .anyRequest()
//                                        .authenticated()
//                )
//                .formLogin(
//                        (formLogin) -> formLogin
//                                .loginPage("/login")
//                                .loginProcessingUrl("/login")
//                                .usernameParameter("username")
//                                .passwordParameter("password")
//                                .defaultSuccessUrl("/hello", true)
//                                .permitAll()
//                )
//                .oauth2Login(formLogin -> formLogin
//                        .userInfoEndpoint(userInfoEndpointConfig -> userInfoEndpointConfig.userService(oAuthUserDetailService))
//                        .loginPage("/login")
//                        .defaultSuccessUrl("/hello", true)
//                )
//                .logout(logout -> logout
//                        .logoutUrl("/logout")
//                        .logoutSuccessUrl("/login?logout")
//                        .permitAll()
//                )
//                .build();

        //JWT 방식 return
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .cors(httpSecurityCorsConfigurer -> httpSecurityCorsConfigurer
                        .configurationSource(corsConfigurationSource()))
                .sessionManagement(sessionManagement -> sessionManagement
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // 세션 생성 정책 설정
                )
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/login/**").permitAll() // 인증 없이 접근 허용
                        .requestMatchers("/user/**").permitAll()
                        .requestMatchers(
                                "/swagger/**",       // Swagger UI 정적 리소스
                                "/v3/api-docs/**",   // OpenAPI 문서
                                "/swagger-ui/**"     // Swagger UI 경로
                        )
                        .permitAll()
                        .anyRequest().authenticated() // 나머지는 인증 필요
                )
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

//    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowCredentials(true);
        configuration.addAllowedOrigin("http://localhost:5173");
        configuration.addAllowedOrigin("http://localhost:8080");
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