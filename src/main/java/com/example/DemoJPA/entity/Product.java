package com.example.DemoJPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    public Product(){
    }

    @Id
    @Column(name = "product_id")
    private Short id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "supplier_id")
    private Short supplierId;

    @Column(name = "category_id")
    private Short categoryId;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column(name = "units_in_stock")
    private Short unitsInStock;

    @Column(name = "units_on_order")
    private Short unitsOnOrder;

    @Column(name = "reorder_level")
    private Short reorderLevel;

    private Integer discontinued;

    @OneToMany(mappedBy = "product")
    //@JsonIgnore
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Product(Short categoryId) {
        this.categoryId = categoryId;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Short supplierId) {
        this.supplierId = supplierId;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Integer getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Integer discontinued) {
        this.discontinued = discontinued;
    }

    // getters and setters
}
