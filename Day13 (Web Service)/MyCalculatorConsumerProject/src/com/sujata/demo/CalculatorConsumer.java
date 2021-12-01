package com.sujata.demo;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class CalculatorConsumer {
	
	public static void main(String[] args) {
		
		Calculator serviceName=new Calculator();
		
		CalculatorSoap bindingName=serviceName.getCalculatorSoap();
		
		int response=bindingName.add(20, 30);
		
		System.out.println("Sum : "+response);
	}

}
