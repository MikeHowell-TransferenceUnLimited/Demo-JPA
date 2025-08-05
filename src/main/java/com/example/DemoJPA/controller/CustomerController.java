package com.example.DemoJPA.controller;

import com.example.DemoJPA.entity.Customer;
import com.example.DemoJPA.model.CustomerDto;
import com.example.DemoJPA.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController
{
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    // Get all customers
    @GetMapping()
    public List<CustomerDto> getCustomers() {
        logger.info("Fetching customers from CustomerService...");
        return customerService.getAllCustomerDtos();
    }

    // Get a specific customer
    @GetMapping("/{id}")
    public CustomerDto getCustomers(@PathVariable String id) {
        logger.info("Fetching customer " + id + " from CustomerService...");
        return customerService.getCustomerDtoById(id);
    }

    // Create a new customer
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
    }

    // Update a customer
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id,@RequestBody Customer customerData) {
        Customer updated = customerService.updateCustomer(id, customerData);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomerById(id);
        return ResponseEntity.noContent().build();
    }
}
