package com.turkcell.spring.starter.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "product_id")
    private int id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "supplier_id")
    private int supplierId;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;
    @Column(name = "unit_price")
    private int unitPrice;
    /*@Column(name="units_in_stock")
    private int unitsInStock;*/

    @Column(name = "units_on_order")
    private String unitsOnOrder;
    @Column(name = "reorder_level")
    private int reorder_level;
    @Column(name = "discontinued")
    private int discontinued;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private Category category;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    @JsonIgnore
    private Supplier supplier;

}
