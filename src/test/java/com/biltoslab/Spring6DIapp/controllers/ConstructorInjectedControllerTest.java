package com.biltoslab.Spring6DIapp.controllers;

import com.biltoslab.Spring6DIapp.services.GreetingService;
import com.biltoslab.Spring6DIapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    ConstructorInjectedController constructorInjectedController;

//    @BeforeEach
//    void setUp() {
//        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
//    }

    @Test
    void hello() {
        System.out.println(constructorInjectedController.hello());
    }
}