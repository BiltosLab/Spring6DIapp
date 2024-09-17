package com.biltoslab.Spring6DIapp.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Dev","default"})
@Service("envService")
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String GetEnv() {
        return "Development";
    }
}
