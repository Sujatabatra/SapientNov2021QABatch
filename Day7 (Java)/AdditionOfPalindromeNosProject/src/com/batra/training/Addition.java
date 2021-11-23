package com.batra.training;

import com.sujata.training.PalindromeNumber;

public class Addition {

	private int numberOne,numberTwo;
	private int sum;
	private boolean status;
	
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	
	public int getSum() {
		calculateSum();
		return sum;
	}
	
	private void calculateSum() {
		PalindromeNumber palindromeNumber1=new PalindromeNumber();
		PalindromeNumber palindromeNumber2=new PalindromeNumber();
		
		palindromeNumber1.setNumber(numberOne);
		palindromeNumber2.setNumber(numberTwo);
		
		if(palindromeNumber1.isPalindrome() && palindromeNumber2.isPalindrome()) {
			sum=numberOne+numberTwo;
			status=true;
		}
		else {
			sum=0;
			status=false;
		}
		
		
	}

	public boolean isStatus() {
		calculateSum();
		return status;
	}
	
	
}
