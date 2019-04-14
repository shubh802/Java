package com.shubham.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO someCDIDAO;

	public SomeCdiDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCdiDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int data[] = someCDIDAO.getData();
		for (int value : data) {
			
			if (value > greatest) {
				greatest = value;
			}
		}
		
		return greatest;
	}
	
}
