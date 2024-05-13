package com.core.coreboard.user.dto;

import com.core.coreboard.user.service.UserInfo;

public record SignUpRequest (
    String username,
    String password,
    String email,
    String phone
) {
    public UserInfo toUserInfo() {
        return new UserInfo(email, password, username);
    }

}
