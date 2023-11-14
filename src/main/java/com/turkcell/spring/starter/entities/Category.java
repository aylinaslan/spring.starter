package com.turkcell.spring.starter.entities;

import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@Data
@Table(name = "categories")
@RestController
@Entity

public class Category {
    @Id
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "description")
    private String description;
}
