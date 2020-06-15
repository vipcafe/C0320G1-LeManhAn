package com.example.demo.controller;

import com.example.demo.model.ProductionModel;
import com.example.demo.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;


@Controller
public class controller {
    @Autowired
    private  ProductionService productionService;

    @GetMapping("/")
    public String String(Model model){
//        int i = 0 ;
//        model.addAttribute("i",i);
        model.addAttribute("productions",productionService.showAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("production" , new ProductionModel());
        return "create";
    }

    @PostMapping("/production/save")
    public String save(ProductionModel production){
        int id = (int) (Math.random()*10000);
        production.setId(id);
        productionService.save(production);
        return ("redirect:/");
    }

    @GetMapping("/production/{id}/edit")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("production",productionService.findById(id));
        return "edit";
    }

    @PostMapping("/production/update")
    public String update (ProductionModel production){
        productionService.update(production.getId() , production);
        return "redirect:/";
    }

    @GetMapping("/production/{id}/delete")
    public String delete(@PathVariable int id ,  Model model){
        model.addAttribute("production" ,productionService.findById(id));
        return "delete";
    }

    @PostMapping("/production/delete")
    public String remove(ProductionModel production){
        productionService.remove(production.getId());
        return "redirect:/";
    }

}
