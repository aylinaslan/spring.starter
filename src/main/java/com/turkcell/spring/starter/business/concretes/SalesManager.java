package com.turkcell.spring.starter.business.concretes;

import com.turkcell.spring.starter.business.abstracts.SalesService;
import com.turkcell.spring.starter.entities.Sales;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SalesManager implements SalesService {
    @Override
    public void add(Sales sales) {

    }

    @Override
    public List<Sales> getAll() {
        return null;
    }

    @Override
    public Sales getById(int id) {
        return null;
    }

    @Override
    public void update(Sales sales) {

    }

    @Override
    public void delete(int id) {

    }
}
