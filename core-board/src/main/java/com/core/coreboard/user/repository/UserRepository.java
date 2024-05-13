package com.core.coreboard.user.repository;

import com.core.coreboard.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
