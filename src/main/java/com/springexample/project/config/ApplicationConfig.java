package com.springexample.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springexample.project.services.GreetingService;
import com.springexample.project.services.OutputService;
import com.springexample.project.services.TimeService;

@Configuration
public class ApplicationConfig {
    
    @Value("hello")
    private String greeting;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }
    @Bean
    public TimeService timeService(){
        return new TimeService();
    }
    @Bean 
    public OutputService outputService() {
        return new OutputService(greetingService, timeService);
    }
}
