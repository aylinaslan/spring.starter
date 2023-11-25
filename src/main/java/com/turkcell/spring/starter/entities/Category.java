package com.turkcell.spring.starter.entities;

import jakarta.persistence.*;

import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Getter
@Setter
@Table(name="categories")
@Entity
public class Category {
    @Id
    @Column(name="category_id")
    private int categoryId;

    @Column(name="category_name")
    private String categoryName;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
