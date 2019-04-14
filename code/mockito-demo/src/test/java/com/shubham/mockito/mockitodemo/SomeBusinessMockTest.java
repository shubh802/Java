package com.shubham.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		
		DataService dataServiceMock = mock(DataService.class);
//		dataServiceMock.retrieveAllData() => new int[] {24,15,58,75};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,58,75});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(75, result);
	}
	
	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		
		DataService dataServiceMock = mock(DataService.class);
//		dataServiceMock.retrieveAllData() => new int[] {24,15,58,75};
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}


}