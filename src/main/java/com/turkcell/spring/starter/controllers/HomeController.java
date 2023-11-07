package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping
public class HomeController {
  @GetMapping("home")
    public String get(){
      return "merhaba turkcell";

  }
@GetMapping("products")
    public List<Product> getProducts(){
      List<Product> productList = new ArrayList<>();
      Product product1 = new Product();
      product1.setId(1);
      product1.setName("leptop");

      productList.add(product1);
      return productList;
  }


}
