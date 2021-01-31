package com.example.springbootreactivesecurityjwtexample.users;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class UserRepository {

    private static final List<UserRecord> USERS = staticUsers();

    public List<UserRecord> getAll() {
        return USERS;
    }

    private static List<UserRecord> staticUsers() {
        return List.of(
                UserRecord.builder()
                        .username("user")
                        .password("{bcrypt}$2a$10$XG5ZtYO6SpI2bOzFxkgaz.OaZ67kiJjaHMrmV3Wyexhi1lTqDucqy")
                        .roles(Set.of("USER"))
                        .build(),
                UserRecord.builder()
                        .username("admin")
                        .password("{bcrypt}$2a$10$AH0Ec7HfJdW29PNVSVCd4.UiQkPtH.yVTrhxdrT9Q6yOkJTBXhkiS")
                        .roles(Set.of("USER", "ADMIN"))
                        .build()
        );
    }
}

@Data
@Builder
class UserRecord {
    private String username;
    private String password;
    private Set<String> roles;
}
