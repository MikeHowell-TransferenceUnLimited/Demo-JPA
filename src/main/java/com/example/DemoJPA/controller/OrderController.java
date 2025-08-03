package com.example.DemoJPA.controller;

import com.example.DemoJPA.entity.Order;
import com.example.DemoJPA.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private OrderService orderService;

    @GetMapping("/api/orders")
    public List<Order> getOrders() {
        logger.info("Fetching products from ProductService");
        return orderService.getAllOrders();
    }
}
