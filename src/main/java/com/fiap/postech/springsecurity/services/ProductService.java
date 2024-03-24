package com.fiap.postech.springsecurity.services;

import com.fiap.postech.springsecurity.dto.SaveProduct;
import com.fiap.postech.springsecurity.persistencia.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {

    Page<Product> findAll(Pageable pageable);

    Optional<Product> findOneId(Long productId);

    Product createOne(SaveProduct saveProduct);

    Product updateOneById(Long productId, SaveProduct saveProduct);
}
