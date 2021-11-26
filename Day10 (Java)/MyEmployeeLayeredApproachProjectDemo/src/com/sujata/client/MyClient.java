package com.sujata.client;

import java.util.Scanner;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class MyClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		EmployeePresentation empPresentation=new EmployeePresentationImpl();
		while(true) {
			empPresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			empPresentation.performMenu(choice);
		}

	}

}
