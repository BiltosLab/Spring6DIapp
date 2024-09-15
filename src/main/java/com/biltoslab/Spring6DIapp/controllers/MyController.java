package com.biltoslab.Spring6DIapp.controllers;


import com.biltoslab.Spring6DIapp.services.GreetingService;
import com.biltoslab.Spring6DIapp.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String hello() {
        System.out.println("hello im in the controller");
        return greetingService.SayGreeting();
    }
}
