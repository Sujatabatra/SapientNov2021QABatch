package com.sujata.demo;

import java.util.Scanner;

public class MyThirdDemoClass {

	public static void divide(int number1, int number2) {
		myDivide(number1, number2);
	}
	public static void myDivide(int number1, int number2) {
		int divide = number1 / number2;
		System.out.println("Result of division : " + divide);

		System.out.println("Good Bye from Divide Method");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 1st No : ");
			int no1 = sc.nextInt();
			System.out.println("Enter 2nd No : ");
			int no2 = sc.nextInt();
			
			divide(no1, no2);
		
		} catch (ArithmeticException exception) {
			System.out.println("Infinity from main");
		}
		System.out.println("Good Bye from main");

	}

}
