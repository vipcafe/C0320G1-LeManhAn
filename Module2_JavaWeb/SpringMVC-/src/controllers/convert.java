package controllers;

import models.library;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class convert {
    @GetMapping("/")
    public String convert (){
        return "index";
    }
    @PostMapping("/convert")
    public String result (@RequestParam float rate,@RequestParam float usd , Model model){
        double result = rate * usd ;
        model.addAttribute("result",result);
        return "convert";
    }

    @PostMapping("/search")
    public String search (@RequestParam String search ,Model model){
        String result = library.findMap(search);
        model.addAttribute("result",result);
        return "search";
    }

}
