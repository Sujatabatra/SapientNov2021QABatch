package com.sujata.demo;

public class MyFirstStaticDemoClass {

	int x;
	int y;
	static int z;
	private static int a;
	
	/*
	 * from non static method , we can access both static as well as non static members
	 */
	public void displayAll() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("z : "+z);
		System.out.println("a : "+a);
		
	}
	/*
	 * from static methods we can only access static data and members
	 */
	static public void displayStaticDataOnly() {
//		System.out.println("x : "+x);
//		System.out.println("y : "+y);
		System.out.println("z : "+z);
		System.out.println("a : "+a);
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		MyFirstStaticDemoClass.a = a;
	}
	
	
}
