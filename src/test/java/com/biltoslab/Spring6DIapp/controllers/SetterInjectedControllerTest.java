package com.biltoslab.Spring6DIapp.controllers;

import com.biltoslab.Spring6DIapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {
    @Autowired
    SetterInjectedController setterInjectedController;
//    @BeforeEach
//    void setUp() {
//        setterInjectedController= new SetterInjectedController();
//        setterInjectedController.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void hello() {
        System.out.println(setterInjectedController.hello());
    }
}