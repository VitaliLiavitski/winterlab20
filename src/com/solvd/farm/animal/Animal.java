package com.solvd.farm.animal;

public class Animal {
	
	private String voice;
	private int size;
	
	public  Animal() {
		voice = "default";
		size = 1;
	}
	
	public  Animal(String voice1, int size1) {
		voice = voice1;
		size = size1;
	}
	
	public void printFields() {
		System.out.println("Voice: " + voice);
		System.out.println("Size: " + size);
	}
}
