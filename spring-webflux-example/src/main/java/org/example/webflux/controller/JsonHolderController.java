package org.example.webflux.controller;

import lombok.RequiredArgsConstructor;
import org.example.webflux.service.JsonHolderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class JsonHolderController {
    private final JsonHolderService jsonHolderService;

    @GetMapping("/user/{id}")
    public Mono<ResponseEntity<Object>> getUser(@PathVariable Long id){
        final var response = jsonHolderService.getUsersMono(id);
        return response.map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build());
    }

    @GetMapping("/users")
    public Flux<ResponseEntity<List>> getUsers(){
        final var response = jsonHolderService.getUsersFlux();
        return response.map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build());
    }
}
