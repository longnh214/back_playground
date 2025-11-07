package org.example.webflux.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class JsonHolderService {
    private final WebClient webClient;

    public Mono<Object> getUsersMono(long id){
        return getUserResponseMono(id);
    }

    private Mono<Object> getUserResponseMono(long id) {
        return webClient.get()
                .uri(baseUrl -> baseUrl
                        .path("/users/"+id)
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Object.class)
                .onErrorResume(WebClientException.class, ex -> Mono.empty());
    }

    public Flux<List> getUsersFlux(){
        return getUserResponseFlux();
    }

    private Flux<List> getUserResponseFlux() {
        return webClient.get()
                .uri(baseUrl -> baseUrl
                        .path("/users")
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(List.class)
                .onErrorResume(WebClientException.class, ex -> Flux.empty());
    }
}
