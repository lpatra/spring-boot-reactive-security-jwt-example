package com.example.springbootreactivesecurityjwtexample.users;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @Test
    public void testFindByUsername() {
        UserService userService = new UserService(new UserRepository());
        UserDetails userDetails = userService.findByUsername("user").block();
        assertEquals("user", userDetails.getUsername());
    }
}
