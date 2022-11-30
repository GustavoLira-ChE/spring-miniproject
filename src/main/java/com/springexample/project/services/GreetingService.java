package com.springexample.project.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

    public GreetingService(){
    }

    public String getGretting(String name){
        return this.greeting + " " + name;
    }
}
