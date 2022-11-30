package com.springexample.project.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
    
    @Value("#{new Boolean(environment['spring.profiles.active'] != 'dev')}")
    private Boolean isTomorrow;
    public TimeService(){
    }

    public LocalDate getDateForGreeting(){
        if(isTomorrow){
            return LocalDate.now();
        } else{
            return LocalDate.now().plusDays(1);
        }
    }
}
