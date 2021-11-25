package com.sujata.demo;

import java.util.Scanner;

public class MyPersonArrayClass {

	public static void main(String[] args) {
		Person pArr[];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of Persons : ");
		int total=scanner.nextInt();
		pArr=new Person[total];

		for(int index=0;index<total;index++) {
			System.out.println("Enter person id : ");
			int id=scanner.nextInt();
			System.out.println("Enter Person Name : ");
			String na=scanner.next();
			pArr[index]=new Person(id,na);
		}
		
		for(Person person:pArr) {
			/*
			 * Whenever we try to display object with System.out.println()
			 * Object class toString() method gets implicit call
			 * and toString method displays hashcode for the object
			 */
			System.out.println(person); 
		}
	}

}
