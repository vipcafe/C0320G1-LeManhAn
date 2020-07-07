package com.codegym.demo_provice.controller;

import com.codegym.demo_provice.service.ProvinceService;
import com.codegym.demo_provice.service.impl.ProvinceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

//    @GetMapping()
}
