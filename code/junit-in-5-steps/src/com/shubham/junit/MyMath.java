package com.shubham.junit;

public class MyMath {

	public int sum(int[] numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
