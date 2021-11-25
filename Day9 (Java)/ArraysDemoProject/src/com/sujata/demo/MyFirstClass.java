package com.sujata.demo;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		int arr[];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Total No of elements : ");
		int total=scanner.nextInt();
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter element : ");
			arr[index]=scanner.nextInt();
		}
		
		for(int element:arr) {
			System.out.println(element);
		}
		

	}

}
