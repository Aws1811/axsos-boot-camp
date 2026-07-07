package com.axsos.travels.controllers;

import com.axsos.travels.models.Travel;
import com.axsos.travels.repositires.TravelRepo;
import com.axsos.travels.services.TravelServices;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// first we start the pathes with the main class one and the controller annotion
@Controller
@RequestMapping("/")
public class TravelController {
    private  final TravelServices travelServices;
    public TravelController( TravelServices travelServices){
        this.travelServices = travelServices;
    }
//    render the landing page
    @RequestMapping("")
    public String landingPage(){
        return "landing";
    }
//    render the expenses page
    @RequestMapping("expenses")
    public String index(Model model){
        List<Travel> travels = travelServices.allTravels();
        model.addAttribute("travels",travels);
        model.addAttribute("travel", new Travel());
        return "index";
    }
//    do the post form to create an expense
    @PostMapping("maketravel")
    public String makeTravel(@Valid @ModelAttribute Travel travel, BindingResult result,Model model){
    if(result.hasErrors()){
        model.addAttribute("travels",travelServices.allTravels());
        return "index";
    }
    travelServices.createTravel(travel);
    return "redirect:/";
    }

//render the update page
    @RequestMapping("expenses/edit/{id}")
    public String goToUpdatePage(Model model,@PathVariable("id")Long id,@ModelAttribute Travel travel){
        travel = travelServices.findTravel(id);
        model.addAttribute( "travel",travel);
        return "updateMenu";
    }

//    do the form to update the page
    @PostMapping("update/travel/{id}")
    public String editTheTravel(@Valid @ModelAttribute Travel travel,BindingResult result,Model model,@PathVariable("id") Long id){
        if (result.hasErrors()){
            model.addAttribute("travels",travelServices.findTravel(id));
            return "updateMenu";
        }
        travelServices.updateTravel(id,travel.getExpense(),travel.getVendor(),travel.getAmount(),travel.getDesc());
        return "redirect:/";
    }

//    delete an expense
    @RequestMapping("delete/page/{id}")
    public String  deletePage(@PathVariable("id")Long id){
        travelServices.delete(id);
        return "redirect:/";
    }
//    show the expense
    @RequestMapping("expenses/{id}")
        public String showPage(Model model, @PathVariable("id")Long id){
        Travel travel = travelServices.findTravel(id);
        model.addAttribute("travel",travel);
        return "show";

    }




}
