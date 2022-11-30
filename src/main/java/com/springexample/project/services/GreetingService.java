package com.springexample.project.services;

public class GreetingService {

    private String greeting;

    public GreetingService(String greeting){
        this.greeting = greeting;
    }

    public String getGretting(String name){
        return this.greeting + " " + name;
    }
}
