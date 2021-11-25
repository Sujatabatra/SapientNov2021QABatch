package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyCheckedException {

	public static void openFile(String name) throws FileNotFoundException{
		FileInputStream fis=new FileInputStream(name);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fileName=null;
		try {
		System.out.println("Enter File Name : ");
		fileName=sc.next();
		openFile(fileName);
		System.out.println("File "+fileName+" opened");
		}
		catch(FileNotFoundException ex) {
			System.out.println("file "+fileName+" does not exist");
		}
	}

}
