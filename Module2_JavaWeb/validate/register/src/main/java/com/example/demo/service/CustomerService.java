package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    void save(Customer customer);
    void delete(int id);
    Page<Customer> findAll(Pageable pageable);
}
