package com.solvd.farm;

import com.solvd.farm.animal.Animal;
import com.solvd.farm.animal.Dog;
import com.solvd.farm.animal.Kitty;

public class Executor {

	public static void main(String[] args) {
		
//		System.out.println("======Animal1========");
//		Animal animal1 = new Animal();
//		animal1.printFields();
//		
//		System.out.println("======Animal2========");
//		
//		Animal animal2 = new Animal("AnimalGav-AnimalGav", 3);
//		animal2.printFields();
//		
//		System.out.println("======DOG========");
//		Dog dog = new Dog();
//		dog.printFields();
		
		
		System.out.println("======Kitty========");
		Kitty kitty = new Kitty("Mya-Mya", 1);
		kitty.printFields();
		
		System.out.println("======Kitty2========");
		Kitty kitty2 = new Kitty();
		
		kitty2.setVoice("mya-mya");
		
		System.out.println(kitty2.getVoice());
	}

}
