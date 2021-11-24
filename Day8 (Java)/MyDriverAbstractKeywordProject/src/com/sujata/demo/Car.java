package com.sujata.demo;

/*
 * abstract method is a contract between child and parent class 
 * that child class must give the implementation of abstract method
 * ----------------------------------------------
 * if a class have even a single abstract method is it mandatory to mark class as abstract
 * ---------------------------------------------
 * we can't instantiate ( create object) abstract class, but we can create the reference variable
 * 
 */
abstract public class Car {

	private String model, color;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract public void engine();
}
