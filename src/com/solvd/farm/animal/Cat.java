package com.solvd.farm.animal;

public class Cat implements Animal {

	private String name;

	public Cat() {
		this.name = "default";
	}

	public Cat(String name) {
		this.name = name;
	}

	public void run() {
		run(true);
	}

	public void run(boolean isRun) {
		if (isRun) {
			System.out.println("cat runs!!");
		} else {
			System.out.println("cat can't runs!!");
		}
	}

	public void printInfo() {
		System.out.println("Cat!!!");
	}
	
	@Override
	public String toString() {
		return "Cat " + this.name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String voice() {
		return "Mya-Mya";
	}

}
