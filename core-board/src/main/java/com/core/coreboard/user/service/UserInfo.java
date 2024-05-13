package com.core.coreboard.user.service;

public record UserInfo(
    String email,
    String password,
    String name
) {
    public static UserInfo from(User user)
}
