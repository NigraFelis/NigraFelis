package com.hanbit.java;

public class Firstclass {
	
	int number = 1;
	int sum;
	
	int getNumber(){
		return number;
	}

	int addNumber(int add) {
		number += add;
	
		int sum = number;
		this.sum = sum;
		
		return number;
	}
	
	
	
	
	
	
}
