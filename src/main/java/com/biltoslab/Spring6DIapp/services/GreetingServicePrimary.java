package com.biltoslab.Spring6DIapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String SayGreeting() {
        return "Hello from primary bean";
    }
}
