package com.sujata.misc;

import com.sujata.bean.Person;

public class MyEqualsDemoClass {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		if(x==y)
			System.out.println("Both x and y are equal");
		else
			System.out.println("x and y are not equal");

		Person p1=new Person(101, "AAAAA");
		Person p2=new Person(101, "AAAAA");
		
		if(p1==p2)
			System.out.println("Both p1 and p2 are equal");
		else
			System.out.println("p1 and p2 are not equal");
	}

}
