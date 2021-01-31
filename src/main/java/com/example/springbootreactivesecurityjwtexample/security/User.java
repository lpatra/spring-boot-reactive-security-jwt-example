package com.example.springbootreactivesecurityjwtexample.security;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
class User {
    private final String username;
    private final String password;
    private final Set<String> refreshTokens;
}