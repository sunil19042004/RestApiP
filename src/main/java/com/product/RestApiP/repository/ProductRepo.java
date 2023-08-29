package com.product.RestApiP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.RestApiP.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
