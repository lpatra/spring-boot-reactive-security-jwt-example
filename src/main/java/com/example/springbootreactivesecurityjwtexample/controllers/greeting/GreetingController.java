package com.example.springbootreactivesecurityjwtexample.controllers.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/greeting")
public class GreetingController {

    @GetMapping("hello")
    public Mono<String> hello() {
        return Mono.just("Hello!");
    }
}
