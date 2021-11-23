package com.sujata.oop;

/*
 * data to be modifable or readable
 * modifiable : setter method (number)
 * readbale : getter method (factorial)
 */
public class Factorial {

	private int number,factorial;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1)
			factorial*=number--;
	}
	
	
}
