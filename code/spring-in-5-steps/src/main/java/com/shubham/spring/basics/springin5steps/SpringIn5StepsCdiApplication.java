package com.shubham.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {
	
	static Logger LOGGER = 
				LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {
		
		/*ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
*/	
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{}", business);

		
	}
}
