package com.solvd.farm.bird;

public class Chicken extends Bird {

	public Chicken() {
		
	}
	
	public Chicken(String voice, int size, int wingSize) {
		super(voice,  size, wingSize);
	}
	
	@Override
	public void printInfo() {
		System.out.println("Chicken");
		System.out.println("voice: " + getVoice());
		System.out.println("size: " + getSize());
		System.out.println("wingSize: " + getWingSize());
		System.out.println(fly(true));
	}

}