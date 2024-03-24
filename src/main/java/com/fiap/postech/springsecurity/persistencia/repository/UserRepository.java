package com.fiap.postech.springsecurity.persistencia.repository;

import com.fiap.postech.springsecurity.persistencia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);
}
