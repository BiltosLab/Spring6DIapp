package com.biltoslab.Spring6DIapp.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Setter Injection Greeting";
    }
}
