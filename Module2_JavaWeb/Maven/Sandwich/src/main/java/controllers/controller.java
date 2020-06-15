package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    @GetMapping("/sandwich")
    public String sandwich(){
        return "index";
    }
    @PostMapping("/sandwich_condiment")
    public String save(@RequestParam(defaultValue = "Null") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "condiment";
    }

    @GetMapping("/caculator")
    public String caculator (){
        return "caculator";
    }

    @GetMapping("/result_caculator")
    public String result(@RequestParam double a ,
                         @RequestParam double b ,
                         @RequestParam String result,
                         Model model){
        double result_caculator ;
        switch (result){
            case "Addtion":
                result_caculator = a+b;
                break;
            case "Subtraction":
                result_caculator = a-b;
                break;
            case "Multiplication":
                result_caculator = a*b;
                break;
            case "Division":
                result_caculator = a/b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + result);
        }

model.addAttribute("result_caculator",result_caculator);
return "caculator";
    }
}
