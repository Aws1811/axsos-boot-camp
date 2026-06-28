package com.axsos.springboot.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
//	here is the whole thing and how the defult is human otherwise
	@RequestMapping("")
//	can be access like this (http://localhost:8080/?name=aws&last_name=sleebi)
	public String  index(@RequestParam(value="name",required = false,defaultValue = "human")String firstName,
		@RequestParam(value = "last_name",required = false,defaultValue = "lastHuman")String lastName,
		@RequestParam(value = "time",required = false,defaultValue = "1")int num
	){
//	for using the times we can do this 	http://localhost:8080/?name=aws&last_name=sleebi&time=10
		String aws="";
		for(int i = 0;i<num;i++){
		 aws += " (hello) " + firstName+"  "+lastName +"  ";
		}
return aws;
	}

}
