package com.example.DemoJPA.repository;

import com.example.DemoJPA.entity.Customer;
import com.example.DemoJPA.model.CustomerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    @Query("SELECT c FROM Customer c LEFT JOIN FETCH c.orders")
    List<Customer> findAllWithOrders();

    @Query("SELECT DISTINCT c FROM Customer c LEFT JOIN FETCH c.orders")
    List<Customer> findAllWithAnOrder();

    @Query("SELECT new com.example.DemoJPA.model.CustomerDto(c.customerId, c.companyName,c.contactName,c.contactTitle," +
           "c.address,c.city,c.region,c.postalCode,c.country,c.phone,c.fax) FROM Customer c")
    List<CustomerDto> findAllNoOrders();
}