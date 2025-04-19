package com.spring.spring_security.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class AuthRequestDto {
    private String username;
    private String password;
}