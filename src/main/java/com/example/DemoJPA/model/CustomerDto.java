package com.example.DemoJPA.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Use LOMBOK to create the class for you.
@Data                   // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor      // Generates a no-args constructor
@AllArgsConstructor     // Generates a constructor with all fields
public class CustomerDto {
    private String customerId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;
}