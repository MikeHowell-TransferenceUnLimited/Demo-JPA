package com.example.DemoJPA.service;

import com.example.DemoJPA.entity.Customer;
import com.example.DemoJPA.entity.Product;
import com.example.DemoJPA.model.CustomerDto;
import com.example.DemoJPA.repository.CustomerRepository;
import com.example.DemoJPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    public Customer getCustomerById(String id){
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found: " + id));
    }

    public List<CustomerDto> getAllCustomerDtos() {
        return customerRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private CustomerDto convertToDTO(Customer customer) {
        return new CustomerDto(
                customer.getCustomerId(),
                customer.getCompanyName(),
                customer.getContactName(),
                customer.getContactTitle(),
                customer.getAddress(),
                customer.getCity(),
                customer.getRegion(),
                customer.getPostalCode(),
                customer.getCountry(),
                customer.getPhone(),
                customer.getFax()
        );
    }
    public CustomerDto getCustomerDtoById(String id) {
        Customer c = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found: " + id));

        return new CustomerDto(
                c.getCustomerId(),
                c.getCompanyName(),
                c.getContactName(),
                c.getContactTitle(),
                c.getAddress(),
                c.getCity(),
                c.getRegion(),
                c.getPostalCode(),
                c.getCountry(),
                c.getPhone(),
                c.getFax()
        );
    }

    public void deleteCustomerById(String id){
        if (!customerRepository.existsById(id)) {
            throw new RuntimeException("Customer not found: " + id);
        }

        customerRepository.deleteById(id);
    }

    public Customer createCustomer(Customer customer) {
        // Optionally: check if ID already exists to avoid overwriting
        if (customerRepository.existsById(customer.getCustomerId())) {
            throw new RuntimeException("Customer already exists: " + customer.getCustomerId());
        }

        return customerRepository.save(customer);
    }

    public Customer updateCustomer(String id, Customer updatedData) {
        Customer existing = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found: " + id));

        if (updatedData.getCompanyName() != null) {existing.setCompanyName(updatedData.getCompanyName());};
        if (updatedData.getContactName() != null){existing.setContactName(updatedData.getContactName());};
        if (updatedData.getAddress() != null){existing.setAddress(updatedData.getAddress());};
        if (updatedData.getCity() != null){existing.setCity(updatedData.getCity());};
        if (updatedData.getCountry() != null){existing.setCountry(updatedData.getCountry());};
        if (updatedData.getPhone() != null){existing.setPhone(updatedData.getPhone());};
        if (updatedData.getPostalCode() != null){existing.setPostalCode(updatedData.getPostalCode());};

        return customerRepository.save(existing); // performs update
    }


}

