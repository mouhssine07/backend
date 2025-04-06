package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.backend.entity.Product;
import com.example.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;


import java.math.BigDecimal;

@SpringBootApplication
public class BackendApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    // Optional: Add sample data for testing
    @Bean
    public CommandLineRunner demo(ProductRepository repository) {
        return args -> {
            repository.save(new Product("Laptop", new BigDecimal("999.99"), 10));
            repository.save(new Product("Phone", new BigDecimal("499.99"), 20));
            repository.save(new Product("Tablet", new BigDecimal("299.99"), 15));
        };
    }
}
