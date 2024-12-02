package com.spring.spring_security.controller;

import com.spring.spring_security.dto.UserDto;
import com.spring.spring_security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/add")
    public void addUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
    }
}
