package com.biltoslab.Spring6DIapp.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"Dev","EN"})
@SpringBootTest
class EnvironmentControllerTest {


    @Autowired
    EnvironmentController controller;


    @Test
    void getEnvironment() {
        System.out.println(controller.GetEnvironment());
    }
}