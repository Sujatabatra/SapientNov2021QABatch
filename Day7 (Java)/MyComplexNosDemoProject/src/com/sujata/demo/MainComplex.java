package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		Complex complexNo1;
		complexNo1=new Complex();
//		complexNo1.displayComplexNumber();
		complexNo1.setComplexNumber(5, 8);
		
		
		Complex complexNo2=new Complex();
		complexNo2.setComplexNumber(7, -4);
		
		Complex sumComplexNos=new Complex();
		sumComplexNos.addComplexNumbers(complexNo1, complexNo2);
		
		System.out.print("Complex No 1 :");
		complexNo1.displayComplexNumber();
		
		System.out.print("Complex No 2 :");
		complexNo2.displayComplexNumber();
		
		System.out.print("Sum : ");
		sumComplexNos.displayComplexNumber();
	}

}
