package com.example.DemoJPA.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    public Order() {
    }

    @Id
    @Column(name = "order_id")
    private Short orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    //@JsonIgnore
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    @Column(name = "order_date")
    private LocalDate orderDate;

    public Short getOrderId() {
        return orderId;
    }

    public void setOrderId(Short orderid) {
        this.orderId = orderid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
