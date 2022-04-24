package com.softwarefoundation.core.service;


import com.softwarefoundation.core.entity.User;

import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> findByEmail(final String email);

}
