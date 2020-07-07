package com.example.demo.service;

import com.example.demo.model.Admin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface AdminService {
    Page<Admin> showAllCustomer(Pageable pageable);
    Optional<Admin> findById(int id );
    void save(Admin admin);
    void delete(int id);
    boolean login(String name , String password);
    
}
