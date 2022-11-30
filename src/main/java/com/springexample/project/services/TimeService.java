package com.springexample.project.services;

import java.time.LocalDate;

public class TimeService {
    
    private final Boolean isTomorrow;
    public TimeService(Boolean isTommorow){
        this.isTomorrow = isTommorow;
    }

    public LocalDate getDateForGreeting(){
        if(isTomorrow){
            return LocalDate.now();
        } else{
            return LocalDate.now().plusDays(1);
        }
    }
}
