package com.example.DemoJPA.repository;

import com.example.DemoJPA.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Short> {
    // Additional query methods can go here
}
