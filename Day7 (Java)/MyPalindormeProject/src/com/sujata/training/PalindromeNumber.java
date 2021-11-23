package com.sujata.training;

import com.sujata.demo.Reverse;

public class PalindromeNumber {

	private int number;
	private boolean palindrome;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPalindrome() {
		findPalindrome();
		return palindrome;
	}
	
	private void findPalindrome() {
		
//		com.sujata.demo.Reverse reverse=new com.sujata.demo.Reverse();
		Reverse reverse=new Reverse();
		reverse.setNumber(number);
		int reverseNumber=reverse.getReverseNumber();
		if(number==reverseNumber)
			palindrome=true;
		else
			palindrome=false;
	}
}
