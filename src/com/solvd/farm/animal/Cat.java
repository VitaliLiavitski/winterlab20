package com.solvd.farm.animal;

public class Cat implements Animal {
	
	public Cat() {
	}

	@Override
	public void run() {
		System.out.println("cat runs!!");
	}

	@Override
	public void printInfo() {
		System.out.println("Cat!!!");
	}

}
