package com.shubham.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.shubham.spring.basics.springin5steps.SpringIn5StepsBasicApplication;


@RunWith(MockitoJUnitRunner.class)
public class SomeCdiTest {
	
	//Inject the mock
	@InjectMocks
	SomeCdiBusiness business;
	
	//Create Mock
	@Mock
	SomeCdiDAO daoMock;
	

	@Test
	public void testBasicSenario1() {
		
		//When daoMock.getData() method is called return int[]{2,4}
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		int actualResult = business.findGreatest();
		assertEquals(4, actualResult);
		
	}
	
	@Test
	public void testBasicSenario2() {
		
		//When daoMock.getData() method is called return int[]{2,4}
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		int actualResult = business.findGreatest();
		assertEquals(Integer.MIN_VALUE, actualResult);
		
	}

}
