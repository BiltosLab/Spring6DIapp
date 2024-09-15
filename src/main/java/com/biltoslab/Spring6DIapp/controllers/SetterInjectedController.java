package com.biltoslab.Spring6DIapp.controllers;

import com.biltoslab.Spring6DIapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {

    @Qualifier("setterGreetingBean")
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.SayGreeting();
    }
}
