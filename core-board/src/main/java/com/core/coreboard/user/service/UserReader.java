package com.core.coreboard.user.service;


import com.core.coreboard.user.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component

public class UserReader {
    private final UserRepository userRepository;

    public UserDomain read(long userId) {
        User user=userRepository
                .
    }
}
