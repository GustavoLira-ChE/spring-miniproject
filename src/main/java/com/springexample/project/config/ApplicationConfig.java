package com.springexample.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.springexample.project.services.GreetingService;
import com.springexample.project.services.OutputService;
import com.springexample.project.services.TimeService;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
    
    @Value("${app.greeting}")
    private String greeting;
    @Value("${app.name}")
    private String name;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private TimeService timeService;

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(greeting);
    }
    @Bean
    @Profile("!dev")
    public TimeService timeService(){
        return new TimeService(false);
    }
    @Bean
    @Profile("dev")
    public TimeService timeService2(){
        return new TimeService(true);
    }
    @Bean 
    public OutputService outputService() {
        return new OutputService(greetingService, timeService,name);
    }
}
