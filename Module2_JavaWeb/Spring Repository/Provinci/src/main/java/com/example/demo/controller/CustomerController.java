package com.example.demo.controller;


import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;


@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    ProvinceService provinceService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("/index");
    }

    @GetMapping("/customer")
    public ModelAndView customer(Customer customer) {
        ModelAndView modelAndView = new ModelAndView("/Customer/customer");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("province", provinceService.findAll());
        return modelAndView;
    }

    @PostMapping("/customer/create")
    public ModelAndView createCustomer( @ModelAttribute Customer customer,
                                       RedirectAttributes redirectAttributes ) {
            ModelAndView modelAndView = new ModelAndView("redirect:/customer");
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message","Thêm Thành Công !!!");
            return modelAndView;
    }

    @GetMapping("/customer/list")
    public ModelAndView showAllCustomer(@RequestParam(defaultValue = "") Optional<String> s, @PageableDefault(value = 5) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/Customer/list");

        if(s.isPresent()){
            modelAndView.addObject("customer",customerService.findAllByFullName(s.get(),pageable));
            modelAndView.addObject("s",s.get());
        }else {
            modelAndView.addObject("customer", customerService.findAll(pageable));
        }
        return modelAndView;
    }



    @GetMapping("/customer/delete/{id}")
    public ModelAndView delete(@PathVariable int id, RedirectAttributes redirectAttributes) {
        customerService.delete(id);
        redirectAttributes.addFlashAttribute("message", "Xóa thành công !!!");
        return new ModelAndView("redirect:/customer/list");
    }

    @GetMapping("/customer/edit/{id}")
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/Customer/edit");
        modelAndView.addObject("customer", customerService.findById(id));
        modelAndView.addObject("province",provinceService.findAll());
        return modelAndView;
    }

    @PostMapping("/customer/update")
    public ModelAndView update( @ModelAttribute Customer customer) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer/list");
        customerService.save(customer);
        return modelAndView;

    }
}
