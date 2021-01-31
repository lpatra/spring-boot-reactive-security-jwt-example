package com.example.springbootreactivesecurityjwtexample.users;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

import static java.util.stream.Collectors.toSet;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<UserDetails> findByUsername(String username) {
        Optional<User> user = userRepository.getAll().stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst()
                .map(this::toUser);

        return user.isPresent() ?  Mono.just(user.get()) : Mono.empty();
    }

    private User toUser(UserRecord userRecord) {
        return  User.builder()
                .username(userRecord.getUsername())
                .password(userRecord.getPassword())
                .roles(
                        userRecord.getRoles().stream()
                                .map(s -> "ROLE_" + s)
                                .map(SimpleGrantedAuthority::new)
                                .collect(toSet())
                )
                .active(true)
                .build();
    }
}
