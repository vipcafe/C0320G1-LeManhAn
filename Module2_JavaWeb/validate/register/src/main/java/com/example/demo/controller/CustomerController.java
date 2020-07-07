package com.example.demo.controller;


import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
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
public class CustomerController {
    @Autowired
    CustomerService customerService ;

    @GetMapping("/customer/create")
    public ModelAndView registerCustomer(){
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

//    @PostMapping("/custumer/create/add")
//    public ModelAndView createCustomer(@PathVariable String confirmPassword ,
//                                       @Validated @ModelAttribute Customer customer ,
//                                       BindingResult bindingResult ,
//                                       RedirectAttributes redirectAttributes)
//    {
//        if(confirmPassword.equals(customer.getPassword())){
//
//        }
//
//    }
}
