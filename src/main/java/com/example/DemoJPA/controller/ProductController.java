package com.example.DemoJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.DemoJPA.entity.Product;
import com.example.DemoJPA.service.ProductService;


import java.util.List;


@RestController
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("/api/products")
    public List<Product> getProducts() {
        logger.info("Fetching products from ProductService");
        return productService.getAllProducts();
    }
}
