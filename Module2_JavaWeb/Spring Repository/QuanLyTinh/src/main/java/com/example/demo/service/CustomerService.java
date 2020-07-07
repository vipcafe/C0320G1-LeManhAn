package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
List<Customer> getAllCustomer ();
Customer getCustomerById(Long id);
void saveCustomer(Customer customer);
void deleteCustomer(Long id);
}

