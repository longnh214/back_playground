package com.spring.spring_security.controller;

import com.spring.spring_security.entity.User;
import com.spring.spring_security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LoginController {
    private final UserService userService;

    @PostMapping("/login")
    public void login(String username, String password){
//        User user = userService.login(username, password);

    }
}
