package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepositoryImpl customerService;

    @GetMapping("/")
    public String showCreate(Model model){
        model.addAttribute("customer", new Customer());
        return "index";
    }
//    public ModelAndView showCreateForm(){
//        ModelAndView modelAndView = new ModelAndView("/customer/create");
//        modelAndView.addObject("customer", new Customer());
//        return modelAndView;
//    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        if(customer.getFirstName().equals("") && customer.getFirstName().equals("") ){
            ModelAndView modelAndView = new ModelAndView("/index");
            modelAndView.addObject("message", "Not successfully !!");
            return modelAndView ;
        }
        else {
            customerService.save(customer);
            ModelAndView modelAndView = new ModelAndView("/index");
            modelAndView.addObject("customer", new Customer());
            modelAndView.addObject("message", "New customer created successfully");
            return modelAndView;}

    }

    @GetMapping("/customers")
    public ModelAndView listCustomers(){
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public String back(Model model){
        model.addAttribute("customer", new Customer());
        return "index";
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer/{id}/edit")
    public ModelAndView update(@PathVariable Long id ,Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView remover(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("custormer",customer);
        return modelAndView;
    }

    @PostMapping("/delete-customer/{id}/delete")
    public ModelAndView romeve(@PathVariable Long id){
        customerService.remove(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        return modelAndView;
    }
}
