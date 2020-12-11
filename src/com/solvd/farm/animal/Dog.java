package com.solvd.farm.animal;

public class Dog implements Animal, LargeHorred {

	@Override
	public void run() {
		System.out.println("Dog runs!!");
		
	}

	@Override
	public void printInfo() {
		System.out.println("Dog!!!!");
	}

	@Override
	public boolean getMilk() {
		return false;
	}

}
