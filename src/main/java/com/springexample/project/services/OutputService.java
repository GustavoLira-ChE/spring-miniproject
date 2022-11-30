package com.springexample.project.services;

public class OutputService {
    
    private final String name;

    private final GreetingService greetingService;
    private final TimeService timeService;

    public OutputService(GreetingService greetingService, TimeService timeService, String name) {
        this.greetingService = greetingService;
        this.timeService = timeService;
        this.name = name;
    }

    public String getFullGreeting(){
        return greetingService.getGretting(this.name) + " " + timeService.getDateForGreeting().toString();
    }

    
}
