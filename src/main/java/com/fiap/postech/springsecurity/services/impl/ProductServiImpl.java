package com.fiap.postech.springsecurity.services.impl;

import com.fiap.postech.springsecurity.dto.SaveProduct;
import com.fiap.postech.springsecurity.persistencia.entity.Category;
import com.fiap.postech.springsecurity.persistencia.entity.Product;
import com.fiap.postech.springsecurity.persistencia.repository.ProductRepository;
import com.fiap.postech.springsecurity.services.ProductService;
import com.fiap.postech.springsecurity.exception.ObjectNorFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findOneId(Long productId) {
        Product productoFromBD = productRepository.findById(productId).orElseThrow(()->new ObjectNorFoundExeption("Product not found with id"+ productId));
        productoFromBD.setStatus(Product.ProductStatus.DISABLED);

        return Optional.of(productRepository.save(productoFromBD));
    }

    @Override
    public Product createOne(SaveProduct saveProduct) {
        Product product = new Product();
        product.setName(saveProduct.getName());
        product.setPrice(saveProduct.getPrice());
        product.setStatus(Product.ProductStatus.ENABLED);
        Category category = new Category();
        category.setId(saveProduct.getCategoryId());
        return productRepository.save(product);
    }

    @Override
    public Product updateOneById(Long productId, SaveProduct saveProduct) {
        Product productoFromBD = productRepository.findById(productId).orElseThrow(()->new ObjectNorFoundExeption("Product not found with id"+ productId));
        productoFromBD.setName(saveProduct.getName());
        productoFromBD.setPrice(saveProduct.getPrice());
        productoFromBD.setStatus(Product.ProductStatus.ENABLED);
        Category category = new Category();
        category.setId(saveProduct.getCategoryId());

        return null;
    }
}
