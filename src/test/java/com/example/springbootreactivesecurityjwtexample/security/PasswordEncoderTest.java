package com.example.springbootreactivesecurityjwtexample.security;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordEncoderTest {

    private static final PasswordEncoder PASSWORD_ENCODER = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Test
    public void testDefaultDelegatingPasswordEncoder() {
        assertTrue(
                PASSWORD_ENCODER.matches(
                        "hello",
                        "{bcrypt}$2a$10$xIOG0TuG2l701eC.9WA8DOLxwU/6YaYfmX8Sl5xv5F4UqB0X293QG"
                )
        );
    }
}
