package com.example.DemoJPA.repository;

import com.example.DemoJPA.entity.OrderDetail;
import com.example.DemoJPA.entity.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {

}
