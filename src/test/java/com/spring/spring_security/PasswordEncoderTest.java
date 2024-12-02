package com.spring.spring_security;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PasswordEncoderTest {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Test
    @DisplayName("match 테스트")
    void matchTest(){
        boolean result = passwordEncoder.matches("1234", "$2a$10$MFYmjza/a3TzPynPOt2vL.pHabLTNdqeHDRovinmmY.HGlx2NcNKq");

        assertTrue(result);
    }
}
