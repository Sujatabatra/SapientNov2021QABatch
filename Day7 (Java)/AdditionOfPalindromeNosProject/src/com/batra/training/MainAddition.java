package com.batra.training;

public class MainAddition {

	public static void main(String[] args) {
		Addition addition=new Addition();
		
		addition.setNumberOne(1231);
		addition.setNumberTwo(131);
		
		if(addition.isStatus())
			System.out.println("Sum of Palindrome Nos : "+addition.getSum());
		else
			System.out.println("One or either both the nos entered might not be palindorme so can't do addition");

	}

}
