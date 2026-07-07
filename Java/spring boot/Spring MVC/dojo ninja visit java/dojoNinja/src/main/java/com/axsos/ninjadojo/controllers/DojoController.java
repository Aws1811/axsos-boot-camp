package com.axsos.ninjadojo.controllers;

import com.axsos.ninjadojo.models.Dojo;
import com.axsos.ninjadojo.services.DojoServices;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DojoController {
    private final DojoServices dojoServices;
    public DojoController(DojoServices dojoServices){
        this.dojoServices = dojoServices;
    }

    @RequestMapping("")
    public String landing(){
        return "landing";
    }
    @RequestMapping("dojos/new")
    public String index(Model model,@ModelAttribute("dojos") Dojo dojo){
        return "index";
    }

    @PostMapping("/create/dojo")
    public String newDojo(Model model, @Valid @ModelAttribute Dojo dojo , BindingResult result){
        if(result.hasErrors()) {
            return "index";
        }
        dojoServices.createDojo(dojo);

        return "redirect:/dojos/new";
    }

    @RequestMapping("/dojos/{dojoId}")
        public String dojoTable(@PathVariable("dojoId") Long dojoId ,Model model){
        Dojo dojo = dojoServices.findDojos(dojoId);
        model.addAttribute("dojo",dojo);
        return "showtable";
        }
    }



