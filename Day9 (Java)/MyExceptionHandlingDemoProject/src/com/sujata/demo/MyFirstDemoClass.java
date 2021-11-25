package com.sujata.demo;

import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int location=0;
		try {
		System.out.println("Enter first no : ");
		int no1=scanner.nextInt();
		System.out.println("Enter second no : ");
		int no2=scanner.nextInt();
		
		int divide=no1/no2;
		System.out.println("Result : "+divide);
		
		int arr[];
		System.out.println("Enter No of elements in an array : ");
		int total=scanner.nextInt();
		arr=new int[total];
		for(int index=0;index<total;index++) {
			System.out.println("Enter "+(index+1)+" element : ");
			arr[index]=scanner.nextInt();
		}
		System.out.println("Enter location in an array where you want to view the element :");
		location=scanner.nextInt();
		System.out.println("Element at "+location+" : "+arr[location]);
		System.out.println("Good Bye from try block!");
		}
		//Specific handlers
		catch(ArithmeticException exception) {
			System.out.println("Infinity");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(location +" location does not exist in an array");
		}
		catch(NegativeArraySizeException exception) {
			System.out.println("Array Size can't be negative!");
		}
		//Generic Handler
		catch(Exception exception) {
			System.out.println("Something went wrong , please try after sometime!");
		}
		finally {
			System.out.println("Hi I am finally Block!");
		}
		System.out.println("Good Bye from Main!");
	}

}
