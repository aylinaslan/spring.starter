package com.turkcell.spring.starter.business.abstracts;

import com.turkcell.spring.starter.entities.Sales;

import java.util.List;

public interface SalesService {
    void add(Sales sales);
    List<Sales> getAll();
    Sales getById(int id);
    void update (Sales sales);
    void delete(int id);
}
