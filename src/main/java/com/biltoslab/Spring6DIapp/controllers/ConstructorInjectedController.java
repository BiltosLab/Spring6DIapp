package com.biltoslab.Spring6DIapp.controllers;

import com.biltoslab.Spring6DIapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.SayGreeting();
    }
}
