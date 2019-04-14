package com.shubham.spring.basics.springin5steps.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class SomeCdiDAO {
	
	public int[] getData() {
		
		return new int[] {5,9,18,100};
	}

}
