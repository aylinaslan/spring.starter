package com.turkcell.spring.starter.repositories;

import com.turkcell.spring.starter.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositories extends JpaRepository<Product,Integer> {
}