package com.axsos.counter;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CounterController {
    private int count;
    private int count2;
@RequestMapping("")
public String index(HttpSession session){
    session.setAttribute("count",count++);
    return "index";
}
@RequestMapping("/sec")
public String index2(HttpSession session){
    session.setAttribute("count2",count2=count2+2);
    return "index2";
}

    @RequestMapping("/counter")
    public String counter(Model model,HttpSession session){
    model.addAttribute("count",session.getAttribute("count"));
    model.addAttribute("count2",session.getAttribute("count2"));
    return "counter";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session){
        session.setAttribute("count",0);
        session.setAttribute("count2",0);
        return "redirect:/counter";
    }
}
