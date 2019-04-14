package com.shubham.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.shubham.spring.basics.componentscan.ComponentPersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan("com.shubham.spring.basics.componentscan")
public class SpringIn5StepsComponentApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);
	
	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = 
//				SpringApplication.run(SpringIn5StepsComponentApplication.class, args);
	
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class)){
		ComponentPersonDAO componentDAO = applicationContext.getBean(ComponentPersonDAO.class);
		LOGGER.info("{}",componentDAO);
		LOGGER.info("test");
//		System.out.println("test");
		}
//		Or use the new try catch to automatically close the connection		
//		applicationContext.close();
		
	}
}
