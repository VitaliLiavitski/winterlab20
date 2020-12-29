package com.solvd.farm.animal;

public class Kitty extends Cat {

	private String voice;
	private int size;

	public Kitty() {
		
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public String getVoice() {
		return this.voice;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	public void printFields() {
		System.out.println("Voice: " + this.voice);
		System.out.println("Size: " + this.size);
	}
	
	@Override
	public String voice() {
		return "Piy-piy";
		
	}
	
	@Override
	public String toString() {
		return "Kitty ";
	}
}
