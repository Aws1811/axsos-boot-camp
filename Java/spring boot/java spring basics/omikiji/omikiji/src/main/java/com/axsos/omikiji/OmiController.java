package com.axsos.omikiji;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class OmiController {
    @RequestMapping("")
    public String index(){
        return "index";
    }
    @PostMapping("/send")
    public String  send(
            @RequestParam int num,
            @RequestParam String city,
            @RequestParam String name,
            @RequestParam String hobby,
            @RequestParam String thing,
            @RequestParam String desc,
            HttpSession session
    )
    {
        session.setAttribute("num",num);
        session.setAttribute("city",city);
        session.setAttribute("name",name);
        session.setAttribute("hobby",hobby);
        session.setAttribute("thing",thing);
        session.setAttribute("desc",desc);
        return "redirect:/omikuji/fortune";

    }
    @RequestMapping("/fortune")
    public String fortune(Model model, HttpSession session){
        model.addAttribute("num"  ,session.getAttribute("num"));
        model.addAttribute("city" ,session.getAttribute("city"));
        model.addAttribute("name" ,session.getAttribute("name"));
        model.addAttribute("hobby",session.getAttribute("hobby"));
        model.addAttribute("thing",session.getAttribute("thing"));
        model.addAttribute("desc" ,session.getAttribute("desc"));
        return "fortune";
    }
}
