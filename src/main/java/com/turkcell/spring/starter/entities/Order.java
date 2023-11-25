package com.turkcell.spring.starter.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    public String customer;
    public int numberOfSales;
    public int discount;
    public int id;



}