package com.axsos.springboot.pathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    //        welcome route with aa return value
    @RequestMapping("")
    public String welcome(){
        return "welcome";
    }
    @RequestMapping("/today")
    public String today(){
        return "Today you will find luck in all your endeavors";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow(){
        return "Tomorrow, an opportunity will arise , so be sure to be open to new ides!";
    }
//    here we start using the path var.
    @RequestMapping("/travel/{name}")
    public String travel(@PathVariable String name){
        return "Congratulations! You will soon travel to " + name ;
    }
//    this path is for declaering and using the if statment with th routes and path var.
    @RequestMapping("/lotto/{num}")
    public String lotto(@PathVariable int num){
        if(num%2 == 0 ){
            return "You will take a grand journey in the near future , but be wary of the tempting offers";
        }else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
        }
    }
}
