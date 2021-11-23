package com.sujata.training;

public class MainPalindrome {

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber=new PalindromeNumber();
		palindromeNumber.setNumber(1234721);
		if(palindromeNumber.isPalindrome())
			System.out.println("No is Palindorme");
		else
			System.out.println("No is not Palindorme");

	}

}
