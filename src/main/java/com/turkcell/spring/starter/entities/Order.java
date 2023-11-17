package com.turkcell.spring.starter.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="orders")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @Column(name="order_id")
    private int orderId;
    @Column(name="customer_id")
    private String customerId;
    @Column(name="employee_id")
    private int employeeId;
    @Column(name="order_date")
    private LocalDate orderDate;
    @Column(name="required_date")
    private LocalDate requiredDate;
    @Column(name="shipped_date")
    private LocalDate shippedDate;
    @Column(name="ship_via")
    private int shipVia;
    @Column(name="freight")
    private String freight;
    @Column(name="ship_name")
    private String shipName;
    @Column(name="ship_address")
    private String shipAddress;
    @Column(name="ship_city")
    private String shipCity;
    @Column(name="ship_region")
    private String shipRegion;
    @Column(name="ship_postal_code")
    private String shipPostalCode;
    @Column(name="ship_country")
    private String shipCountry;
    @ManyToOne()
    @JoinColumn(name = "ship_via")
    @JsonIgnore
    private Shipper shipper;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    @JsonIgnore
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}