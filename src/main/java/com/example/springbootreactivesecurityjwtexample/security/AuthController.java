package com.example.springbootreactivesecurityjwtexample.security;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("auth")
public class AuthController {

    @PostMapping("login")
    public Mono<ResponseEntity<Void>> login() {
        return null;
    }

    @PostMapping("logout")
    public Mono<ResponseEntity<Void>> logout() {
        return null;
    }

    @PostMapping("refresh-token")
    public Mono<ResponseEntity<Void>> refreshToken() {
        return null;
    }
}