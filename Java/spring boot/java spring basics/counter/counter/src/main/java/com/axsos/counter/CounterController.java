package com.axsos.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CounterController {
    private static int count;
@RequestMapping("")
    public String index(Model model){
        count++;
        return "index";
    }
    @RequestMapping("/counter")
    public String counter(Model model){
    model.addAttribute("count",count);
    return "counter";
    }
}
