package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
//    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
//    Page<Customer> findByOrderByLastName(Pageable pageable);
}
