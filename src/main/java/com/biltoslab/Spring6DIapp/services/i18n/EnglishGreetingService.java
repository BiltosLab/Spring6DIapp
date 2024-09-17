package com.biltoslab.Spring6DIapp.services.i18n;

import com.biltoslab.Spring6DIapp.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String SayGreeting() {
        return "Hello World - EN";
    }
}
