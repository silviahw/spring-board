package com.core.coreboard.user.service;


import com.core.coreboard.user.entity.User;
import com.core.coreboard.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserAppender userAppender;
    public long singUp(UserInfo userInfo){
        return userAppender.append(userInfo);
    }

    public UserDomain getUserInfo(long userId) {
        userReader.read(userId);
    }
}

