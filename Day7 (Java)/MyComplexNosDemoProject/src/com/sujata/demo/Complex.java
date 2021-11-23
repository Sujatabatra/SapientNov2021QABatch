package com.sujata.demo;

public class Complex {

	private int real,imagenary;
	
	public void setComplexNumber(int real,int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}
	
//	public Complex getComplexNumber() {
//		return this;
//	}
	
	public void displayComplexNumber() {
		System.out.print(real);
		if(imagenary>0) {
			System.out.println("+"+imagenary+"i");
		}
		else if(imagenary<0) {
			System.out.println(imagenary+"i");
		}
	}
	
	public void addComplexNumbers(Complex complex1,Complex complex2) {
		real=complex1.real+complex2.real;
		imagenary=complex1.imagenary+complex2.imagenary;
	}
}
