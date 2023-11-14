package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.business.abstracts.CategoryService;
import com.turkcell.spring.starter.entities.Category;
import com.turkcell.spring.starter.repositories.CategoryRepositories;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("categories")
// localhost:8080/categories
public class CategoryController {
    private final CategoryRepositories categoryRepositories;

    @Autowired

    public CategoryController(CategoryRepositories categoryRepositories) {
        this.categoryRepositories = categoryRepositories;
    }

    @GetMapping()
    public List<Category> getCategories() {
        List<Category> categoriesInDb = categoryRepositories.findAll();
        return categoriesInDb;
    }

    @GetMapping("getById")
    public Category getCategoryById(@RequestParam("id") int id) {
        Category category = categoryRepositories.findById(id).orElseThrow();
        return category;
    }

    @PostMapping()
    public ResponseEntity add(@RequestBody Category category) {
        categoryRepositories.save(category);
        return new ResponseEntity("Kategori eklendi", HttpStatus.CREATED);
    }
}
