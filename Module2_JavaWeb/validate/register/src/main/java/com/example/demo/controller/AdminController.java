package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.model.Customer;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/")
    public ModelAndView home(){
        return  new ModelAndView("index");
    }

    @GetMapping("/admin/list")
    public ModelAndView register(){
        return new ModelAndView("/customer/index");
    }

    @GetMapping("/admin/create")
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("/customer/login");
        modelAndView.addObject("admin",new Admin());
        return modelAndView;
    }

    @PostMapping("/admin/create/add")
    public ModelAndView createAdd(@Validated @ModelAttribute Admin admin, BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("/customer/login");
            return modelAndView;
        }
        else {

            if(adminService.login(admin.getName(), admin.getPassword())){
                return new ModelAndView("/customer/index");
            }
            else {
                ModelAndView modelAndView = new ModelAndView("redirect:/admin/create");
                redirectAttributes.addFlashAttribute("message","Vui lòng kiểm tra lại email hoặc mật khẩu !!!");
                return modelAndView;
            }

        }
    }

}
