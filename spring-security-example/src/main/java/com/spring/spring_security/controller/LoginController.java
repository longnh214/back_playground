package com.spring.spring_security.controller;

import com.spring.spring_security.dto.AuthRequestDto;
import com.spring.spring_security.entity.User;
import com.spring.spring_security.entity.UserDetail;
import com.spring.spring_security.service.UserService;
import com.spring.spring_security.util.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Log4j2
public class LoginController {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsService userDetailsService;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequestDto auth) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(auth.getUsername(), auth.getPassword())
        );

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        log.info("id : {}", userDetails.getUsername());
        return jwtTokenUtil.generateToken(userDetails);
    }

    @GetMapping("/login/test")
    public String hello(){
        return "hello";
    }

    @GetMapping("/login/oauth2/code/kakao")
    @ResponseBody
    public String kakaoLogin(@AuthenticationPrincipal UserDetail userDetail){
        log.info("token : {}", userDetail.getAttributes());
//        log.info("token : {}", oAuth.getName());

        return "kakao login success";
    }
}
