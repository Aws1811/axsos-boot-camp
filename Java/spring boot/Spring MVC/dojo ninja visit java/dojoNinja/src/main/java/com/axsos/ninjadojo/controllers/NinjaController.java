package com.axsos.ninjadojo.controllers;

import com.axsos.ninjadojo.models.Ninja;
import com.axsos.ninjadojo.services.DojoServices;
import com.axsos.ninjadojo.services.NinjaServices;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
    private final NinjaServices ninjaServices;
    private final DojoServices dojoServices;

    public NinjaController(NinjaServices ninjaServices, DojoServices dojoServices){
        this.ninjaServices = ninjaServices;
        this.dojoServices = dojoServices;
    }

    @RequestMapping("")
    public String revealTheCreateNinja(Model model, @ModelAttribute("ninjas") Ninja ninja){
        model.addAttribute("dojos", dojoServices.FindAllDojos());
            return "createNinja";
    }

    @PostMapping("/new")
    public String makeThisNinja(Model model, @Valid @ModelAttribute("ninjas") Ninja ninja, BindingResult result){
        if(result.hasErrors()){
            return "createNinja";
        }
        ninjaServices.createNinja(ninja);
        return "redirect:/ninja";

    }



}
