package com.solvd.farm.bird;

import com.solvd.farm.animal.Animal;

public class Chicken extends Bird {
	
	private String name;

	public Chicken() {

	}

	public Chicken(String name) {
		this.name = name;
	}

	public Chicken(String voice, int size, int wingSize) {
		super(voice, size, wingSize);
	}

	@Override
	public void printInfo() {
		System.out.println("Chicken");
		System.out.println("voice: " + getVoice());
		System.out.println("size: " + getSize());
		System.out.println("wingSize: " + getWingSize());
		System.out.println(fly(true));
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Chicken " + this.name;
	}

}