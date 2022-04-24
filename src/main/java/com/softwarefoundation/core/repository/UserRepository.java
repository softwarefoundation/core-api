package com.softwarefoundation.core.repository;

import com.softwarefoundation.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailEquals(final String email);

}
