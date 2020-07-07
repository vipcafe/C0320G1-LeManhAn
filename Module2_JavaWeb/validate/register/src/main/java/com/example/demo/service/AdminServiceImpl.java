package com.example.demo.service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public Page<Admin> showAllCustomer(Pageable pageable) {
        return adminRepository.findAll(pageable);
    }

    @Override
    public Optional<Admin> findById(int id) {
        return adminRepository.findById(id);
    }

    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void delete(int id) {
        adminRepository.deleteById(id);
    }

    @Override
    public boolean login(String name, String password) {
        if(adminRepository.findByNameAndPassword(name,password) != null){
            return true ;
        }else {
            return false;
        }
    }
}
