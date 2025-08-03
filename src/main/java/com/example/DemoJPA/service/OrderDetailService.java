package com.example.DemoJPA.service;

import com.example.DemoJPA.entity.Customer;
import com.example.DemoJPA.entity.OrderDetail;
import com.example.DemoJPA.repository.CustomerRepository;
import com.example.DemoJPA.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }
}

