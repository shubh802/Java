package com.shubham.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {
	
	@Test
	public void testSize() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(10);
		assertEquals(10, mockList.size());
	}
	
	@Test
	public void testSize_multipleReturns() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, mockList.size());
		assertEquals(20, mockList.size());
	}
	
	@Test
	public void testGet() {
		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("Some String back");
		assertEquals("Some String back", mockList.get(0));
		assertEquals(null, mockList.get(1));
	}
	
	@Test
	public void testGet_GenericParamater() {
		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("Some String back");
		assertEquals("Some String back", mockList.get(0));
		assertEquals("Some String back", mockList.get(1));
	}

}
