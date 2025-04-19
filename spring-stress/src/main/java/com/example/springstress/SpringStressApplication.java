package com.example.springstress;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringStressApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStressApplication.class, args);
    }
}
