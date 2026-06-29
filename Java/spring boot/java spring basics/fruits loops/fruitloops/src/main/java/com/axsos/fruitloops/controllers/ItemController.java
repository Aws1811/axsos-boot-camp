package com.axsos.fruitloops.controllers;

import com.axsos.fruitloops.models.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ItemController {
    @RequestMapping("/")
    public String index(Model model){
        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("kiwi",15));
        fruits.add(new Item("mango",12));
        fruits.add(new Item("gojo berries",40));
        fruits.add(new Item("guava" ,75));
        fruits.add(new Item("devil fruit",99));
        model.addAttribute("fruits",fruits);
    return "index";
    }

}
