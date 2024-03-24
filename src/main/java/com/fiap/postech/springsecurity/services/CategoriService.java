package com.fiap.postech.springsecurity.services;

import com.fiap.postech.springsecurity.dto.SaveCategory;
import com.fiap.postech.springsecurity.persistencia.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CategoriService {
     Page<Category> findAll(Pageable pageable);

     Optional<Category> findOneId(Long categoryId);

     Category createOne(SaveCategory saveCategory);



     Category updateOneById(Long categoryId, SaveCategory saveCategory);

     Category disableOneById(Long categoryId);

    Optional<Category> findOneById(Long categoryId);
}
