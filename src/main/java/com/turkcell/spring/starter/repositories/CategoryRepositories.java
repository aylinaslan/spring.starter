package com.turkcell.spring.starter.repositories;

import com.turkcell.spring.starter.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository <Category, Integer> {
}
    
