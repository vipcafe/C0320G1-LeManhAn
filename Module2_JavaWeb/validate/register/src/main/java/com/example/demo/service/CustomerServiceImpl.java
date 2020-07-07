package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepositry customerRepositry ;
    @Override
    public void save(Customer customer) {
        customerRepositry.save(customer);
    }

    @Override
    public void delete(int id) {
        customerRepositry.deleteById(id);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepositry.findAll(pageable);
    }
}
