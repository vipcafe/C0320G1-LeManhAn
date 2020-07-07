package com.example.demo.controller;

import com.example.demo.model.Province;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/province")
    public ModelAndView province(){
        ModelAndView modelAndView = new ModelAndView("/province/index");
        modelAndView.addObject("province",new Province());
        return modelAndView;
    }

    @GetMapping("/province/list")
    public ModelAndView listProvince(){
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces",provinceService.findAll());
        return modelAndView;
    }

    @PostMapping("/province/create")
    public String createProvince(Province province, RedirectAttributes redirectAttributes){
        provinceService.save(province);
        redirectAttributes.addFlashAttribute("message","ok!!!");
        return "redirect:/province";
    }
}
