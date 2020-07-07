package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("/index");
    }

    @GetMapping("/customer")
    public ModelAndView HomeCustomer(){
        ModelAndView modelAndView = new ModelAndView("customer/index");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView save( Customer customer, RedirectAttributes redirectAttributes){
        if(customer.getFirstName().equals("") || customer.getLastName().equals("")){
            redirectAttributes.addFlashAttribute("message","Thêm Thất Bại !!! Vui lòng nhập lại");
        }
        else {
            customerService.saveCustomer(customer);
            redirectAttributes.addFlashAttribute("message","Thêm Thành Công");
        }
        ModelAndView modelAndView  = new ModelAndView("redirect:/customer");
        return modelAndView;

    }

    @GetMapping("/customer/list")
    public ModelAndView getAllCustomer(){
        customerService.getAllCustomer();
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customer",customerService.getAllCustomer());
        return modelAndView ;
    }
    @GetMapping("/customer/delete/{id}")
    public ModelAndView remove(@PathVariable Long id ,RedirectAttributes redirectAttributes) {
        customerService.deleteCustomer(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/customer/list");
        redirectAttributes.addFlashAttribute("message","Xóa Thành công !!!");
        return modelAndView;
    }

    @GetMapping("/customer/edit/{id}")
    public ModelAndView edit(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        modelAndView.addObject("customer",customerService.getCustomerById(id));
        return modelAndView;
    }

    @PostMapping("/customer/update")
    public ModelAndView update(Customer customer , RedirectAttributes redirectAttributes){
        customerService.saveCustomer(customer);
        ModelAndView modelAndView = new ModelAndView("redirect:/customer/list");
        redirectAttributes.addFlashAttribute("message","Sửa Thành công !!!");
        return modelAndView;
    }


}
