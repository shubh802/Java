package com.shubham.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(56, result);
	}

}


class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {24,15,8,56,5};
	
	}
	
}