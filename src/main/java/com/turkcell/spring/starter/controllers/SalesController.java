package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Sales;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("sales")
public class SalesController {

    @GetMapping("list")
    public List<Sales> getAll(){
        List<Sales> salesList= new ArrayList<>();
        Sales sales1= new Sales();
        sales1.setId(1);
        sales1.setPrice(1000);

        salesList.add(sales1);
        return  salesList;
    }

    @GetMapping("getById")
    public Sales getById(@RequestParam("id") int id) {
        Sales sales = new Sales();
        sales.setId(id);
        sales.setPrice(15000);
        return sales;
    }

}