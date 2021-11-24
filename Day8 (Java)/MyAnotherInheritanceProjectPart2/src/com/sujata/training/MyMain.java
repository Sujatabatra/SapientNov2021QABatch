package com.sujata.training;

public class MyMain {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.input(111, "ABC");
//		student.display();
//
//		System.out.println("=============");
//
//		Marks marks = new Marks();
//		marks.input(101, "Asha", 67, 90, 78);
//		marks.display();
//
//		System.out.println("==============");
//
//		Grade grade = new Grade();
//		grade.input(999, "Bharti", 89, 67, 56);
//		grade.display();
		/*
		 * Dynamic Method Dispatch : Base class reference variables are type compatible
		 * with derived class(i.e we can store drive class objects in base class
		 * reference variables) and reverse is not true
		 * Polymorphism : over riding as well
		 * Compile Time Polymorphism / Early Binding : Overloading
		 * Run Time Polymorphism / Late Binding : Over riding
		 * 
		 */
		
		Student referenceVariable;

		referenceVariable=new Student();
		referenceVariable.display();   // As reference variable store the reference of Student so Student display() will be called
		
		referenceVariable=new Marks();
		referenceVariable.display();  //As reference variable store the reference of Marks so Marks display() will be called
	
		referenceVariable=new Grade();
		referenceVariable.display();  //As reference variable store the reference of Grade so Grade display() will be called
		
		

	}

}
