package com.solvd.farm.bird;

public class Turkey extends Bird {
	
	private String name;

	public Turkey() {
		
	}

	public Turkey(String name) {
		this.name = name;
	}

	@Override
	public void printInfo() {

	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Turkey " + this.name;
	}

}
