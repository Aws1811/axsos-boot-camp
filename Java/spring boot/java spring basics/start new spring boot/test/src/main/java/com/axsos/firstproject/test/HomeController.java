package com.axsos.firstproject.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HomeController {

    @RequestMapping("")
    public String index(@RequestParam(value="q", required=false) String searchQuery) {
        return "You searched for: " + searchQuery;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye World!";
    }
}