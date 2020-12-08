package com.solvd.farm.animal;

public class Kitty extends Cat {
	
	private String voice;
	private int size;

	public Kitty() {

	}

	public Kitty(String voice1, int size1) {
		voice = voice1;
		size = size1;
	}
	
	public void setVoice(String voice2) {
		voice = voice2;
	}
	
	
	public String getVoice() {
		return voice;
	}
	
	public void setSize(int size2) {
		size = size2;
	}
	
	
	public int getSize() {
		return size;
	}
	
	public void printFields() {
		System.out.println("Voice: " + voice);
		System.out.println("Size: " + size);
	}
}
