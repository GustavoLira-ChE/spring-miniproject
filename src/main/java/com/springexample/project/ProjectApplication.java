package com.springexample.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springexample.project.config.ApplicationConfig;
import com.springexample.project.services.OutputService;

public class ProjectApplication {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		OutputService outputService = context.getBean(OutputService.class);

		for(int i = 0; i <= 5; i++){
			System.out.println(outputService.getFullGreeting());
			Thread.sleep(5000);
		}
		((AnnotationConfigApplicationContext)context).close();
	}
}
