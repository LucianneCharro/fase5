package com.fiap.postech.springsecurity.services;

import com.fiap.postech.springsecurity.dto.SaveUser;
import com.fiap.postech.springsecurity.persistencia.entity.User;

import java.util.Optional;

public interface UserServices {
    User createOneCustomer(SaveUser newUser);

    Optional<User> findOneByUsername(String username);
}
