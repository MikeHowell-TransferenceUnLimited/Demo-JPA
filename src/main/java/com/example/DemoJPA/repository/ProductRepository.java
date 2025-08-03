package com.example.DemoJPA.repository;

import com.example.DemoJPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Short> {
    // Optional: Add custom query methods here
}

