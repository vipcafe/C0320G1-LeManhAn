package produc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import produc.model.production;
import produc.service.ProductionService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller_production {
    @Autowired
    private ProductionService productionService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("productions", productionService.findAll());
        return "production";
    }

    @GetMapping("/production/create")
    public String create (Model model){
        model.addAttribute("production", new production());
        return "create";
    }

    @PostMapping("/production/save")
    public String save (production production){
        production.setId((int)(Math.random()*1000));
        productionService.save(production);
        return "redirect:/";
    }

    @GetMapping("/production/{id}/edit")
    public String edit(@PathVariable int id ,Model model){
        model.addAttribute("production",productionService.findById(id));
        return "edit";
    }

    @PostMapping("/production/update")
    public String update (production production){
        productionService.update(production.getId(),production);
        return "redirect:/";
    }

    @GetMapping("/production/{id}/delete")
    public String delete(@PathVariable int id , Model model){
        model.addAttribute("production",productionService.findById(id));
        return "delete";
    }
    @PostMapping("/production/remove")
    public String remove(production production){
        productionService.remove(production.getId());
        return "redirect:/";
    }

    @GetMapping("/production/{id}/view")
    public String view (@PathVariable int id , Model model){
        model.addAttribute("production",productionService.findById(id));
        return "view";
    }

}
