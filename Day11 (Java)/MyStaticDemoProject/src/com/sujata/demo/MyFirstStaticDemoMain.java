package com.sujata.demo;

public class MyFirstStaticDemoMain {

	public static void main(String[] args) {
		
		MyFirstStaticDemoClass.z=20;
		System.out.println(" z : "+MyFirstStaticDemoClass.z);
		
		MyFirstStaticDemoClass.setA(10);
		System.out.println(MyFirstStaticDemoClass.getA());
		
		MyFirstStaticDemoClass obj;
		
		obj=new MyFirstStaticDemoClass();
		obj.x=10;
		obj.y=20;
		obj.displayAll();
		System.out.println("z : "+obj.z);
		System.out.println("obj.a : "+obj.getA());
		System.out.println("================");
		MyFirstStaticDemoClass obj1;
		obj1=new MyFirstStaticDemoClass();
		obj1.x=5;
		obj1.y=15;
		obj1.displayAll();
		System.out.println("obj1.z : "+obj1.z);
		System.out.println("obj1.a : "+obj1.getA());
		
		obj.z=20+9;
		System.out.println("obj1.z : "+obj1.z);
		System.out.println("MyFirstStaticDemoClass.z : "+MyFirstStaticDemoClass.z);
		
		
	}

}
