package com.shubham.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath math = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	void sum_with3numbers() {
		System.out.println("Test1");
		//Check that the result is 6
		assertEquals(6, math.sum(new int[] {1,2,3}));
	}

	@Test
	void sum_with1numbers() {
		System.out.println("Test2");
		assertEquals(3, math.sum(new int[] {3}));
	}
}
