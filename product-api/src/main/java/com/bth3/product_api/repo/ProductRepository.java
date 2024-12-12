package com.bth3.product_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bth3.product_api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

