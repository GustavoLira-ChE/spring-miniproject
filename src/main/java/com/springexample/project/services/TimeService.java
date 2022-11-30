package com.springexample.project.services;

import java.time.LocalDateTime;

public class TimeService {
    
    public TimeService(){
    }

    public LocalDateTime getDateForGreeting(){
        return LocalDateTime.now();
    }
}
