package com.biltoslab.Spring6DIapp.services;


import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String SayGreeting() {
        return "PropertyInjected Greeting";
    }
}
