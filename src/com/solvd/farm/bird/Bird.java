package com.solvd.farm.bird;

public abstract class Bird {

	private String voice;
	private int size;
	private int wingSize;
	private boolean isFlight = false;

	public Bird() {

	}

	public Bird(String voice, int size, int wingSize) {
		this.voice = voice;
		this.size = size;
		this.wingSize = wingSize;
	}

	public abstract void printInfo();

	public boolean fly(boolean isFlight) {
		this.isFlight = isFlight;
		
		return this.isFlight;
	}
	
	public String getVoice() {
		return voice;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getWingSize() {
		return wingSize;
	}

}
