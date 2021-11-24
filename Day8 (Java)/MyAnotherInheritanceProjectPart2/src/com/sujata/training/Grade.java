package com.sujata.training;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
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
