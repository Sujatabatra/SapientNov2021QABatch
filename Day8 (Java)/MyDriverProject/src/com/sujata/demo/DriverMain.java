package com.sujata.demo;

public class DriverMain {

	public static void main(String[] args) {
		Audi audi=new Audi();
		audi.setColor("Red");
		audi.setModel("A8");
		
		BMW bmw=new BMW();
		bmw.setColor("Blue");
		bmw.setModel("Q5");
		
		Toyota toyota=new Toyota();
		toyota.setColor("Golden");
		toyota.setModel("Altis");
		
		Driver sonu=new Driver("Sonu");
		Driver suresh=new Driver("Suresh");
		Driver ramesh=new Driver("Ramesh");
		
		suresh.setCar(audi);
		suresh.drive();

	}

}
