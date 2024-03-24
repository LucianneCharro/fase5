package com.fiap.postech.springsecurity.persistencia.repository;

import com.fiap.postech.springsecurity.persistencia.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
