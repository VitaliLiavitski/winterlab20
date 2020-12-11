package com.solvd.farm;

import com.solvd.farm.animal.Cat;
import com.solvd.farm.animal.Dog;

public class Executor {

	public static void main(String[] args) {
		
		
		Cat cat = new Cat();
		cat.printInfo();
		
		Dog dog = new Dog();
		dog.run();
		
		System.out.println(dog.getMilk());
	}

}
