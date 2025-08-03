package com.example.DemoJPA;

import com.example.DemoJPA.entity.Customer;
import com.example.DemoJPA.entity.OrderDetail;
import com.example.DemoJPA.entity.Product;
import com.example.DemoJPA.repository.CustomerRepository;
import com.example.DemoJPA.repository.ProductRepository;
import com.example.DemoJPA.service.ReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }


/*   @Bean
   public CommandLineRunner displayAllCustomers(CustomerRepository customerRepository) {
       return args -> {
           System.out.println("=== List of all customers ===");
           customerRepository.findAll().forEach(customer ->
                   System.out.printf("Customer ID: %s, Company Name: %s, Contact: %s%n",
                           customer.getCustomerId(),
                           customer.getCompanyName(),
                           customer.getContactName())
           );
       };
   }

    @Bean
    public CommandLineRunner displayCustomerOrders(CustomerRepository customerRepository) {
        return args -> {
            System.out.println("Customer Orders:");
            System.out.println("----------------");

            for (Customer customer : customerRepository.findAllWithOrders()) {
                System.out.printf("Customer ID: %s | Orders: ", customer.getCustomerId());
                if (customer.getOrders() != null && !customer.getOrders().isEmpty()) {
                    String orderIds = customer.getOrders()
                            .stream()
                            .map(order -> String.valueOf(order.getOrderId()))
                            .reduce((a, b) -> a + ", " + b)
                            .orElse("None");
                    // map takes each orderid column of each object and turns it into a string of orderids
                    // reduce takes the comma seprated string from above "10248", "10249", "10250" into
                    // "10248, 10249, 10250".
                    // The orelse is just to make sure if there are no orders it doesn't crash.
                    System.out.println(orderIds);
                } else {
                    System.out.println("No orders");
                }
            }
        };
    }

    @Bean
    public CommandLineRunner countOrdersPerCustomer(CustomerRepository customerRepository) {
        return args -> {
            System.out.println("Orders per Customer:");
            System.out.println("---------------------");

            customerRepository.findAllWithAnOrder().forEach(customer -> {
                int count = customer.getOrders() != null ? customer.getOrders().size() : 0;
                System.out.printf("Customer ID: %s | Orders Count: %d%n", customer.getCustomerId(), count);
            });
        };
    }

*/
}
