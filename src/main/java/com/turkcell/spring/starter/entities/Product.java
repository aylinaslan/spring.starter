package com.turkcell.spring.starter.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="products")

public class Product {
    @Id
    @Column(name="product_id")
    private int id;

    @Column(name="product_name")
    private String name;

    @ManyToOne()
    @JoinColumn(name="category_id")
    @JsonIgnore
    private Category category;
}
