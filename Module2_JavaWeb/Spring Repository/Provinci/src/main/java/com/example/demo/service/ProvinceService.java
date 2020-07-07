package com.example.demo.service;

import com.example.demo.model.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();
    void save(Province province);
    void delete(int id);
}
