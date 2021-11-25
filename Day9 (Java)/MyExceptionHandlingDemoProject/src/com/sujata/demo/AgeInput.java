package com.sujata.demo;

public class AgeInput {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws AgeException {
		if(age<18)
			throw new AgeException("Age cannot be less then 18");
		this.age = age;
	}
	
	
}
