package com.solvd.farm;

import com.solvd.farm.animal.Animal;
import com.solvd.farm.animal.Cat;
import com.solvd.farm.animal.Dog;
import com.solvd.farm.animal.Puppy;
import com.solvd.farm.bird.Bird;
import com.solvd.farm.bird.Chicken;
import com.solvd.farm.bird.Turkey;
import com.solvd.farm.build.Hangar;

public class Executor {

	public static void main(String[] args) {
		
		Animal cat = new Cat("Barsik");
		Animal dog = new Dog("Sharik");
		
		Bird chicken = new Chicken("Ryba");
		Bird turkey = new Turkey("Pol");
		
		Hangar hangar = new Hangar();
		
		hangar.addAnimal(cat);
		hangar.addBird(chicken);
		hangar.pritnIfo();
		
//		hangar.addAnimal(dog);
//		hangar.pritnIfo();
		
		
		System.out.println(dog.voice());
		
		Animal puppy = new Puppy();
		
		System.out.println(puppy.voice());
		
		
		cat.run();
		
		Cat cat1 = new Cat();
		cat1.run(false);
		
		System.out.println("this is string!");
		
		System.out.println(8);
		
		System.out.println(cat1);
		
	}

}
