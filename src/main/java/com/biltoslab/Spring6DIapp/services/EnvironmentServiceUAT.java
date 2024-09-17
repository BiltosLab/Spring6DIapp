package com.biltoslab.Spring6DIapp.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Uat")
@Service("envService")
public class EnvironmentServiceUAT implements EnvironmentService {
    @Override
    public String GetEnv() {
        return "User Acceptance Testing";
    }
}
