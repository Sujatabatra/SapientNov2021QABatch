package com.sujata.training;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	public Grade() {
		/*
		 * child class constructor always gives implicit call to parent class default constructor
		 */
		System.out.println("Hi I am Grade class defualt constructor");
	}
	private void calculateGrade() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		if(percentage>75)
			grade="A Grade";
		else
			grade="B Grade";
	}
	//over riding
	public void display() {
		calculateGrade();
		super.display();
		System.out.println("Percentage : "+percentage);
		System.out.println("Grade : "+grade);
	}
}
