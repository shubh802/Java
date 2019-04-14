package com.shubham.spring.basics.springin5steps;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shubham.spring.basics.springin5steps.basics.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {
	
	//What are the beans 
	//What are the dependency of a bean
	//Where to search for the bean
	
	public static void main(String[] args) {
	
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] {12,  4, 6}, 6);
//		System.out.println(result);
		
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class);
				
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
//		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
//		System.out.println(binarySearch);		
//		System.out.println(binarySearch1);
//		
//		int result = binarySearch.binarySearch(new int[] {12,  4, 6}, 6);
//		System.out.println(result);
		
		applicationContext.close();
	}
}
