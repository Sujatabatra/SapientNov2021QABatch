package com.sujata.demo;

/*
 * static block is the very first block which gets executed
 * at the time of class loading
 * 
 * instance block is the block which gets called before every constructor call
 * 
 */
class Base{
	static {
		System.out.println("Hi I am Base class static block");
	}
	//instance block
	{
		System.out.println("Hi I am Base class instance block");
	}
	Base(){
		System.out.println("Hi I am Base class Default constructor");
	}
}
class Derived extends Base{
	static {
		System.out.println("Hi I am Derived class static block");
	}
	//instance block
	{
		System.out.println("Hi I am Derived class instance block");
	}
	Derived(){
		System.out.println("Hi I am Derived class Default constructor");
	}
}

public class StaticBlockDemoClass {

	public static void main(String[] args) {
		Derived dOb1=new Derived();
		System.out.println("======================");
		Derived dOb2=new Derived();
		System.out.println("========================");
		Base obj1=new Base();
//		
//		Base obj2=new Base();

	}

}
