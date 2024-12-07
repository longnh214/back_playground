package com.spring.spring_security.controller;

import com.spring.spring_security.entity.User;
import com.spring.spring_security.entity.UserDetail;
import com.spring.spring_security.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Log4j2
public class LoginController {
    private final UserService userService;

    @PostMapping("/login")
    public void login(String username, String password){
//        User user = userService.login(username, password);

    }

    @GetMapping("/login/oauth2/code/kakao")
    @ResponseBody
    public String kakaoLogin(@AuthenticationPrincipal UserDetail userDetail){
        log.info("token : {}", userDetail.getAttributes());
//        log.info("token : {}", oAuth.getName());

        return "kakao login success";
    }
}
