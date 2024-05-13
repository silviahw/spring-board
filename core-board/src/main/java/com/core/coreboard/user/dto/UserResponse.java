package com.core.coreboard.user.dto;

public record UserResponse(
        long id,
        String name,
        String email
) {
    public static UserResponse from(UserDomain domain) {
        return new UserResponse(
                domain.id(),
                domain.info().name(),

        )
    }
}


