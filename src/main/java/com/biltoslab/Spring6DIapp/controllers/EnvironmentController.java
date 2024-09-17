package com.biltoslab.Spring6DIapp.controllers;


import com.biltoslab.Spring6DIapp.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environment;

    public EnvironmentController(@Qualifier("envService") EnvironmentService environment) {
        this.environment = environment;
    }

    public String GetEnvironment() {
        return "You are in " + environment.GetEnv() + " environment";
    }
}
