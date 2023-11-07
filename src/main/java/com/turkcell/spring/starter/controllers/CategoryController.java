package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.business.abstracts.CategoryService;
import com.turkcell.spring.starter.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("category")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;

    @PostMapping("post")
    public void add(@RequestBody Category category){

    }
    @GetMapping("categories")
    public  List<Category> getAll() {

        List<Category> categories = new ArrayList<>();
        Category c1 = new Category();
        Category c2=new Category();

        c1.setId(1);
        c1.setName("deneme");

        c2.setId(2);
        c2.setName("teknoloji");

        categories.add(c1);
        categories.add(c2);
        return  categories;
    }
    @GetMapping("getById")
    public  Category getById(@RequestParam("id") int id){
        Category category=new Category();
        category.setId(1);
        category.setName("deneme2");
        return category;
    }
}
