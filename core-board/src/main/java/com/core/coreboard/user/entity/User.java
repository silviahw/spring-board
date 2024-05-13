package com.core.coreboard.user.entity;

import com.core.coreboard.user.service.UserDomain;
import com.core.coreboard.user.service.UserInfo;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String password;

    public UserInfo toUserInfo()
    {
        return new UserDomain(
        )
    }
}



