package com.sujata.training;



public class Marks extends Student {

	private int marks1,marks2,marks3;
	
	public void input(int rollNo,String name,int marks1,int marks2,int marks3) {
		input(rollNo, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	//over riding
	/*
	 * 1. overriding can happen in base and derived class
	 * 2. in overriding function name and signature remains same
	 * 3. In overriding we can broader the scope while over riding we can't narrow down the scope
	 * 4. with over riding we modify the behaviour of the class
	 */
	public void display() {
		super.display();
		System.out.println("Marks 1 : "+marks1);
		System.out.println("Marks 2 : "+marks2);
		System.out.println("Marks 3 : "+marks3);
	}

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}
	
}
