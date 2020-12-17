package com.solvd.farm.animal;

public class Dog implements Animal {
	
	private String name;
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Dog runs!!");
		
	}

	@Override
	public void printInfo() {
		System.out.println("Dog!!!!");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String voice() {
		return "Gav-Gav";
	}

}
