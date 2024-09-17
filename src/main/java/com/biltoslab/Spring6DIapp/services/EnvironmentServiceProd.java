package com.biltoslab.Spring6DIapp.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service("envService")
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String GetEnv() {
        return "Production";
    }
}
