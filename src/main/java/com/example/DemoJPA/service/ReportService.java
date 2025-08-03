package com.example.DemoJPA.service;

import com.example.DemoJPA.entity.OrderDetail;
import com.example.DemoJPA.entity.Product;
import com.example.DemoJPA.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ProductRepository productRepository;


}

