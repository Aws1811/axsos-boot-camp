package com.axsos.ninja;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;

@Controller
@RequestMapping("/")
public class ninjaController {
    @RequestMapping("")
    public String index(Model model,HttpSession session){
        Integer total = (Integer) session.getAttribute("total");
        if(total == null){
            total = 0;
            session.setAttribute("total",total);
        }
        String message = (String) session.getAttribute("message");
        if(message == null){
            message = "";
        }
        ArrayList<String> hobby =(ArrayList<String>) session.getAttribute("hobby");
        if(hobby == null){
            hobby = new ArrayList<>();
            session.setAttribute("hobby",hobby);
        }
        model.addAttribute("total", total);

        model.addAttribute("hobby",hobby);
        model.addAttribute("message",message);
        return "index";
    }
    @PostMapping("/gold")
    public String findGold(@RequestParam String place, HttpSession session){
            Random random = new Random();
            Integer total = (Integer) session.getAttribute("total");
            String message ="";
            String  color = "";

            if (total == null){
                total = 0;
            }
            ArrayList<String> hobby =(ArrayList<String>) session.getAttribute("hobby");
            if (hobby == null){
                hobby =new ArrayList<>();
            }
            int amount = 0 ;
            if(total<-100){
                return "lose";
            }
        if(place.equals("farm")){
            amount = random.nextInt(10,20)* (random.nextBoolean() ? -1:1);
            if(amount >0){
                message = "you visited the farm it seems and have a good crop this time so you got an : " + amount;
            }else {
                message = "you visited the farm but an unexpected storm comming so you lost equally an : "+amount;
            }
        }
        if(place.equals( "cave")){
            amount = random.nextInt(5 , 10)*(random.nextBoolean() ? -1:1);
            if(amount>0){
                message = "you went to the cave and find some gold equal to :" +amount;
            }else {
                message = "you went to the cave but didn't find something value there so you lost your travel moeny equal to : " + amount;
            }
        }
        if(place.equals( "house")){
            amount = random.nextInt(2,5)*(random.nextBoolean() ? -1:1);
            if(amount>0){
                message= "while in the way to your house you found some money in the road equal to :"+amount;

            }else {
                message = "while in the way to your house you drop some money without noticing so you lost : "+amount+"of your budget";
            }

        }
        if(place.equals( "quest")){
            amount =random.nextInt(0,50)*(random.nextBoolean() ? -1:1);
            if(amount>0){
                message="you accepted an quest and do it very good so  you win a reward for your victory : "+amount;
            }else {
                message="you accepted an quest but you failed it and lose your Registration fees for it : "+amount;
            }
        }
        if(place.equals("spa")){
            amount = random.nextInt(-20,-5);
            message = "why even i came here ?!";
        }
        total+=amount;
        hobby.add(0,message);

        if(amount >0){
            color = "green";

        }else {
            color = "red";
        }
        session.setAttribute("color",color);
        session.setAttribute("place" , place);
        session.setAttribute("total",total);
        session.setAttribute("hobby",hobby);
        session.setAttribute("message",message);
       return "redirect:/";
    }
    @RequestMapping("/reset")
    public String reset(HttpSession session,Model model){
        Integer total = (Integer) session.getAttribute("total");
        ArrayList<String> hobby = (ArrayList<String>) session.getAttribute("hobby");
        session.setAttribute("total", 0);
        session.setAttribute("hobby",null);

        return "redirect:/";
    }
    @RequestMapping("/loss")
    public String lose(){
        return "lose";
    }
}
