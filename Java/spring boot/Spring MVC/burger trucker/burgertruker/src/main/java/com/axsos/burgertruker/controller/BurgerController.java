package com.axsos.burgertruker.controller;

import com.axsos.burgertruker.models.Burger;
import com.axsos.burgertruker.services.BurgerServices;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// the controllor with the final value and constracter for DI
@Controller
@RequestMapping("/")
public class BurgerController {
    private final BurgerServices burgerServices;
    public BurgerController(BurgerServices burgerServices){
        this.burgerServices=burgerServices;
    }
//    here to render the main page
    @RequestMapping("")
    public String index(Model model){
        List<Burger> burgers = burgerServices.allBurgers();
        model.addAttribute("burger",new Burger());
        model.addAttribute("burgers",burgers);
        return  "index";

    }

//    here to create a burger
    @PostMapping("")
    public String createBurgerForm(Model model, @Valid @ModelAttribute Burger burger, BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("burgers", burgerServices.allBurgers());
            return "index";
        }
        burgerServices.createBurger(burger);
        return "redirect:/";
    }
//    here to render  update page
    @RequestMapping("update/{id}")
    public String goToUpdate(@PathVariable("id")Long id,@ModelAttribute Burger burger, Model model){
         burger = burgerServices.findBurger(id);
        model.addAttribute("burger",burger);
        return "updatePage";
    }
//    here to update the burger
    @RequestMapping(value = "update/{id}",method = RequestMethod.POST)
    public String updateBurger(Model model, @Valid @ModelAttribute Burger burger, BindingResult result, @PathVariable("id")Long id){
        if(result.hasErrors()){
            model.addAttribute("burgers", burgerServices.findBurger(id));
            return "updatePage";
        }
         burgerServices.updateBurger(id,burger.getBurgerName(),burger.getResturantName(),burger.getRating(),burger.getNote());
        return "redirect:/";

    }
//    here to delete the burger
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id){
        burgerServices.deleteBurger(id);
        return "redirect:/";
    }




}
