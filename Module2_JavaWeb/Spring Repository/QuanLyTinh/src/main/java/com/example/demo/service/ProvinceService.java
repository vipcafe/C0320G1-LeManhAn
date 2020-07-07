package com.example.demo.service;

import com.example.demo.model.Province;

import java.util.List;
import java.util.Optional;

public interface ProvinceService {
    List<Province> findAll();
    Province findById(Long id);
    void save(Province province);
    void remove(Long id);
}
