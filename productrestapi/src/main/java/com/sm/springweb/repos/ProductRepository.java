package com.sm.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
