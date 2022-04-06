package com.mackittipat.macbootwebfluxsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequestMapping("cats")
@RestController
public class CatFactController {

    @Autowired
    private WebClient webClient;

    @GetMapping()
    public Mono<String> getCatFacts() {
        return webClient.get().uri("https://catfact.ninja/fact").retrieve().bodyToMono(String.class);
    }

}
