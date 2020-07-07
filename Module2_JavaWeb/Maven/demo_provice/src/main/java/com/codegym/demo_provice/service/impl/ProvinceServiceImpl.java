package com.codegym.demo_provice.service.impl;

import com.codegym.demo_provice.entity.Province;
import com.codegym.demo_provice.repository.ProvinceRepository;
import com.codegym.demo_provice.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> getAllProvince() {
        return provinceRepository.findAllByIsDeleteIsFalse();
    }
}
