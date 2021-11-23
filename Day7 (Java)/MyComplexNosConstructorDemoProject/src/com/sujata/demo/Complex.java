package com.sujata.demo;
/*
 * Rules for creating constructor
 * 1. Constructor name must be same as that of classname
 * 2. Constructor can be argumented or non Argumented(ZERO Argument)
 * 3. Constructor don't return any value not even void
 * 4. Constructor can exist in any scope (private/public)
 * 
 * ================================================
 * Constructor with ZERO Argument is called default constructor
 * 
 * When the class is constructor challenged (i.e class don't have any constructor),
 *  compiler creates a default constructor for the class 
 *  with default initial values(int : 0, float=0.0,String/Object=null, boolean=false, char=\u0000)
 * 
 */
public class Complex {

	private int real,imagenary;
	/*
	 * default constructor
	 */
	/*
	 * Constructor Overloading : Polymorphism
	 * As we know that constructor name is same as that of class name
	 * so all constructor have same name but
	 * they will differentiate from one another wrt its signature,
	 * signature means number and types of arguments and their sequence
	 */
	private Complex() {
		real=5;
		imagenary=7;
	}
	public Complex(int real) {
		this.real=real;
		imagenary=5;
	}
	
	public Complex(int real, int imagenary) {
		super();
		this.real = real;
		this.imagenary = imagenary;
	}
	
	public void setComplexNumber(int real,int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}
	
//	public Complex getComplexNumber() {
//		return this;
//	}
	
	public void displayComplexNumber() {
		System.out.print(real);
		if(imagenary>0) {
			System.out.println("+"+imagenary+"i");
		}
		else if(imagenary<0) {
			System.out.println(imagenary+"i");
		}
	}
	
	public void addComplexNumbers(Complex complex1,Complex complex2) {
		real=complex1.real+complex2.real;
		imagenary=complex1.imagenary+complex2.imagenary;
	}
	
	public Complex sumComplexNumbers(Complex complex2) {
		Complex sum=new Complex();
		sum.real=real+complex2.real;
		sum.imagenary=imagenary+complex2.imagenary;
		return sum;
	}
}
