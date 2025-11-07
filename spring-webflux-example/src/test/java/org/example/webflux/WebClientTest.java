package org.example.webflux;

import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class WebClientTest {
    @Test
    void doTest() {
        WebClient client = WebClient
                .create();

        String url = "https://jsonplaceholder.typicode.com/users";
        Flux<Object> objectFlux = client.get()
                .uri(url)
                .retrieve()
                .bodyToFlux(Object.class);

        Mono<Object> objectMono = client.get()
                .uri(url)
                .retrieve()
                .bodyToMono(Object.class);

        objectMono.flux().toStream().forEach(System.out::println);

        objectFlux.toStream().forEach(System.out::println);
    }
}
