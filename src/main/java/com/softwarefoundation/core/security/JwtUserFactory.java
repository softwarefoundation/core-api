package com.softwarefoundation.core.security;


import com.softwarefoundation.core.entity.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JwtUserFactory {

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(), user.getEmail(), user.getSenha());
    }

}
