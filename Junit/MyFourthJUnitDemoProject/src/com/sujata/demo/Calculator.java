package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class Calculator {

	//add is used to add any integer  number
	public int add(int number1,int number2) {
		return number1+number2;
	}
	/*
	 * divide is use to divide any positive integer number,
	 * if number is negative system will throw NegativeNumberException
	 * Division by Zero will throw Arithmetic Exception
	 */
	public int divide(int number1,int number2) throws NegativeNumberException{
		if(number1>=0 && number2>=0)
			return number1/number2;
		throw new NegativeNumberException("divide will not operate on negative nos");
		
	}
	
	public int calculate(int n) {
		int sum=0;
		while(n!=1) {
			sum=sum+n;
		}
		return sum;
			
	}
}
