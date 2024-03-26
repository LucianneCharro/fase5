package com.fiap.postech.springsecurity.services.impl;

import com.fiap.postech.springsecurity.dto.SaveCategory;
import com.fiap.postech.springsecurity.persistencia.entity.Category;
import com.fiap.postech.springsecurity.exception.ObjectNorFoundExeption;
import com.fiap.postech.springsecurity.persistencia.repository.CategoryRepository;
import com.fiap.postech.springsecurity.services.CategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImp implements CategoriService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findOneId(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    @Override
    public Category createOne(SaveCategory saveCategory) {
        Category category = new Category();
        category.setName(saveCategory.getName());
        category.setStatus(Category.CategoryStatus.ENABLED);
        return categoryRepository.save(category);
    }

    @Override
    public Category updateOneById(Long categoryId, SaveCategory saveCategory) {

        Category categoryFromDb = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ObjectNorFoundExeption("Category not found with id " + categoryId));

        categoryFromDb.setName(saveCategory.getName());
        return categoryRepository.save(categoryFromDb);
    }

    @Override
    public Category disableOneById(Long categoryId) {
        Category categoryFromDb = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ObjectNorFoundExeption("Category not found with id " + categoryId));
        categoryFromDb.setStatus(Category.CategoryStatus.DISABLED);
        return categoryRepository.save(categoryFromDb);
    }

    @Override
    public Optional<Category> findOneById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

}
