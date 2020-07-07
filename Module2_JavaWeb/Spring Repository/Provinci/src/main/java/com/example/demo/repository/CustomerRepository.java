package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
//    Page<Customer> findAllByAgeContaining(Pageable pageable);
}
