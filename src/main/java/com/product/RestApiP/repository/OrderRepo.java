package com.product.RestApiP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.RestApiP.model.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
