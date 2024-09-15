package com.biltoslab.Spring6DIapp.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Greetings!";
    }
}
