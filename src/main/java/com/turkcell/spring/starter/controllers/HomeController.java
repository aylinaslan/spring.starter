package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import java.util.ArrayList;
import java.util.List;

//GET: cevap olarak bir kaynak döneceği zaman kullanılır.örn:ürün listeleme fonk.
//POST: Bir kaynak oluşturulması isteği durumlara kullanılır.Örn:ürün ekleme fonk.
//PUT: Bir kaynağın değiştirlmesi isteği Örn;Ürün güncelleme
//DELETE: Bir kaynağın silinmesi isteği .Örn;Ürün silinmesi
@RestController //controller görevi göreceğini springe haber veriyoruz
@RequestMapping("home") //controller http://localhost:8080/home sayfası olduğunu söylüyor
public class HomeController {
  List<Product> productList = new ArrayList<>();
  @GetMapping("index")//http://localhost:8080/home/index
  public  String get(){
    return "merhaba turkcell";
  }
  @PostMapping("index")
  public String getPost(){
    return "merhaba turkcell post";
  }
  @GetMapping("products")
  public List<Product> getProducts(){


    // InMemory

    return productList;
  }

  // Query String =>  localhost:8080/home/getById?id=1&name=deneme
  // Route => localhost:8080/home/getById/1/deneme
  @GetMapping("getById")
  public Product getById(@RequestParam("id") int id){
    Product product = new Product();
    product.setId(id);
    product.setName("Laptop");
    return product;
  }

  @PostMapping("product")
  public ResponseEntity addProduct(@RequestBody Product product){

  if(product.getId()<=0){
    return new ResponseEntity<>("eklenecek id 0 dan büyük olmalıdır", HttpStatus.BAD_GATEWAY);
  }
   productList.add(product);

  return new ResponseEntity<>(product.getName()+ "  ürün eklendi", HttpStatus.CREATED) ;

  }

  // Her bir temel entitynin kendi controllerinin bulunması best practicedir.
  // CREATED
  // 2XX => Başarılı => 200,201
  // 4XX => Başarısız  => 404,401


}
