package com.daikichi.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}

	@RequestMapping(value="/daikichi", method=RequestMethod.GET)
    public String welcome(){
    	return "Welcome!";
    }

	@RequestMapping(value="/daikichi/today", method=RequestMethod.GET)
    public String today(){
    	return "Today you will find luck in all your endeavors!";
    }

	@RequestMapping(value="/daikichi/tomorrow", method=RequestMethod.GET)
    public String tomorrow(){
    	return "Tomorrow, an apportunity will arise, so be sure to be open to new ideas!";
    }

}
