package com.sujata.training;

import com.sujata.demo.Student;

public class MyMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(111, "ABC");
		student.display();
		
		System.out.println("=============");
		
		Marks marks=new Marks();
		marks.input(101, "Asha", 67, 90, 78);
		marks.showStudentsWithMarks();
		
		System.out.println("==============");
		
		Grade grade=new Grade();
		grade.input(999, "Bharti", 89, 67, 56);
		grade.showAllDetails();

	}

}
