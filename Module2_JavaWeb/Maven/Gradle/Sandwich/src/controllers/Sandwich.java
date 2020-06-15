package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Sandwich {
    @GetMapping("/sandwich")
    public String sandwich() {
        return "sandwich";
    }

    @PostMapping("/sandwich_condiment")
    public String save (@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "sandwich_condiment";
    }

}
