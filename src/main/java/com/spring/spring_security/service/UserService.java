package com.spring.spring_security.service;

import com.spring.spring_security.dto.UserDto;
import com.spring.spring_security.entity.User;
import com.spring.spring_security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean login(String username, String password){
        User loginUser = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User Not Found"));

        if(!passwordEncoder.matches(password, loginUser.getPassword())) {
            throw new RuntimeException("Password Not Match.");
        }

        return true;
    }

    public void addUser(UserDto userDto){
        User user = User.builder()
                .username(userDto.getUsername())
                .password(passwordEncoder.encode(userDto.getPassword()))
                .role(userDto.getRole())
                .build();

        userRepository.saveAndFlush(user);
    }
}
