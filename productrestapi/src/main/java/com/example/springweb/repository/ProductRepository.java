package com.example.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
