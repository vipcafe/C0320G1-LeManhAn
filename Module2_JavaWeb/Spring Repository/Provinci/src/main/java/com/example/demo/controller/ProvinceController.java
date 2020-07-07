package com.example.demo.controller;

import com.example.demo.model.Province;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/province")
    public ModelAndView province(){
        ModelAndView modelAndView = new ModelAndView("/province/province");
        modelAndView.addObject("province",new Province());
        return modelAndView;
    }

    @PostMapping("/province/create")
    public ModelAndView create(@ModelAttribute Province province , RedirectAttributes redirectAttributes){
        ModelAndView modelAndView = new ModelAndView("redirect:/province");
        provinceService.save(province);
        redirectAttributes.addFlashAttribute("message","Thêm Tỉnh thành công !!!");
        return modelAndView;
    }

    @GetMapping("/province/list")
    public ModelAndView listProvince(){
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces",provinceService.findAll());
        return modelAndView;
    }
    @GetMapping("/province/delete/{id}")
    public ModelAndView remove(@PathVariable int id,RedirectAttributes redirectAttributes){
        provinceService.delete(id);
        redirectAttributes.addFlashAttribute("message","Xoá thành công !!!");
        return new ModelAndView("redirect:/province/list");
    }

}
