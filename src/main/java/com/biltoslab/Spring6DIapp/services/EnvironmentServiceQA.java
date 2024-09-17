package com.biltoslab.Spring6DIapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("Qa")
@Service("envService")
public class EnvironmentServiceQA implements EnvironmentService {
    @Override
    public String GetEnv() {
        return "Quality Assurance";
    }
}
