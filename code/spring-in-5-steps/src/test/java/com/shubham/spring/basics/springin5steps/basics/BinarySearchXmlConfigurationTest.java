package com.shubham.spring.basics.springin5steps.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.shubham.spring.basics.springin5steps.SpringIn5StepsBasicApplication;


//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
public class BinarySearchXmlConfigurationTest {
	
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicSearch() {
		
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, actualResult);
		
		
	}

}
