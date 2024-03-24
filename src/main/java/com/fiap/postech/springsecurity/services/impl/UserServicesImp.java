package com.fiap.postech.springsecurity.services.impl;

import com.fiap.postech.springsecurity.dto.SaveUser;
import com.fiap.postech.springsecurity.exception.InvalidPasswordException;
import com.fiap.postech.springsecurity.persistencia.entity.User;
import com.fiap.postech.springsecurity.persistencia.repository.UserRepository;
import com.fiap.postech.springsecurity.persistencia.util.Role;
import com.fiap.postech.springsecurity.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class UserServicesImp implements UserServices {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User createOneCustomer(SaveUser newUser) {
        validatePassword(newUser);
        User user = new User();
        user.setUsername(newUser.getUsername());
        user.setPassword(passwordEncoder.encode(newUser.getPassword()));
        user.setName(newUser.getUsername());
        user.setRole(Role.ROLE_CUSTOMER);
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findOneByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    private void validatePassword(SaveUser dto) {

        if(!StringUtils.hasText(dto.getPassword()) || !StringUtils.hasText(dto.getRepetedPassword())){
            throw new InvalidPasswordException("Passwords don't match");
        }

        if(!dto.getPassword().equals(dto.getRepetedPassword())){
            throw new InvalidPasswordException("Passwords don't match");
        }

    }
}
