package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositry extends JpaRepository<Customer,Integer> {
}
