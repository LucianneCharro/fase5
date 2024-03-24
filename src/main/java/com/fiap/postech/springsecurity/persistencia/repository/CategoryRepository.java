package com.fiap.postech.springsecurity.persistencia.repository;


import com.fiap.postech.springsecurity.persistencia.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
