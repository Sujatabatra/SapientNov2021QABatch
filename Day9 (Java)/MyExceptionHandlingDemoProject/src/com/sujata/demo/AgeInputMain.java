package com.sujata.demo;

import java.util.Scanner;

public class AgeInputMain {

	public static void main(String[] args) {
		AgeInput ageInput=new AgeInput();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age : ");
		try {
			ageInput.setAge(sc.nextInt());
			System.out.println("Entered age : "+ageInput.getAge());
		} catch (AgeException e) {
			System.out.println("Person is not eligible for voting");
		}
		
	}

}
