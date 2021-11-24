package com.sujata.demo;
/*
 * Final : variable, method, class

If a variable is final we won't be able to modify that variable.
If a method is final we won't be able to override that method.
If a class is final we won't be able to inherit that class.

 */
public final class MyFirstDemoClass {

	final private int value1=10;
	private int value2;
	
	public void demo() {
		value2=25;
//		value1=56;
	}
	public void show() {
		System.out.println("Hi I am show method");
	}
	final public void dummy() {
		System.out.println("Dummy");
	}
}

class Derived extends MyFirstDemoClass{
	
	public void show() {
		System.out.println("Hello");
	}
//	public void dummy() {
//		System.out.println("Dummy from derived");
//	}
}