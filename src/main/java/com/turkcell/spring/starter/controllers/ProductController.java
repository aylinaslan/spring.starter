package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
@AllArgsConstructor
public class ProductController {

    @GetMapping("products")
    public List<Product> getProducts() {
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Telefon");

        productList.add(product1);
        productList.add(product2);

        return productList;
    }

    @GetMapping("getById")
    public Product getById(@RequestParam("id") int id){
        Product product = new Product();
        product.setId(id);
        product.setName("Laptop");
        return product;
    }
}