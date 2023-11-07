package com.turkcell.spring.starter.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController

public class Category {
    private int id;
    private String name;
}
