package com.sujata.modular;


public class MyModularDemo {

	static int number,factorial;
	static void inputNumber(int n) {
		number=n;
	}
	static void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	static void displayFactorial() {
		System.out.println("Factorial : "+factorial);
	}
	public static void main(String[] args) {
		inputNumber(5);
		calculateFactorial();
		//logical error
		factorial=factorial*number;
		displayFactorial();
	}

}
