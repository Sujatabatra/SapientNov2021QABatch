package com.sujata.bean;

public class Country {

	private String name;
	private String shortName;
	
	public Country() {
		
	}

	public Country(String name, String shortName) {
		super();
		this.name = name;
		this.shortName = shortName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", shortName=" + shortName + "]";
	}
	
	
}
