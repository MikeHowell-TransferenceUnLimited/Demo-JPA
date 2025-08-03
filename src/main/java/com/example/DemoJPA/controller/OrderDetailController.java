package com.example.DemoJPA.controller;

import com.example.DemoJPA.entity.OrderDetail;
import com.example.DemoJPA.entity.Product;
import com.example.DemoJPA.service.OrderDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class OrderDetailController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping("/api/products")
    public List<OrderDetail> getProducts() {
        logger.info("Fetching products from ProductService");
        return orderDetailService.getAllOrderDetails();
    }
}
