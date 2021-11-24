package com.sujata.training;

public class Student {

	private int rollNo;
	private String name;
	
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
		System.out.println("Hi I am Student class argumented constructor");
	}
	
	public Student() {
		System.out.println("Hi I am Student class defualt constructor");
	}
	public void input(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Student Name : "+name);
	}
}
