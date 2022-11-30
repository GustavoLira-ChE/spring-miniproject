package com.springexample.project.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.springexample.project.aspect.Loggable;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

    public GreetingService(){
    }

    @Loggable
    public String getGretting(String name){
        return this.greeting + " " + name;
    }
}
