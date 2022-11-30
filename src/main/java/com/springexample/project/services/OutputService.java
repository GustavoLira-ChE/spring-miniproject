package com.springexample.project.services;

public class OutputService {
    
    private GreetingService greetingService;
    private TimeService timeService;

    public OutputService(GreetingService greetingService, TimeService timeService) {
        this.greetingService = greetingService;
        this.timeService = timeService;
    }

    public String getFullGreeting(String name){
        return greetingService.getGretting(name) + timeService.getDateForGreeting().toString();
    }

    
}
