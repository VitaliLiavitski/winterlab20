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
		
		Animal puppy = new Puppy();
		
		Cat cat1 = new Cat("Barsik");
		
		
		Hangar hangar = new Hangar();
		
		hangar.addAnimal(cat);
		hangar.addAnimal(cat);
		hangar.addAnimal(cat);
		hangar.addAnimal(cat);
		hangar.addAnimal(cat);
		hangar.addAnimal(dog);
		hangar.addAnimal(puppy);
		hangar.addAnimal(cat1);
		
		hangar.addBird(chicken);
		hangar.addBird(chicken);
		hangar.addBird(chicken);
		hangar.addBird(chicken);
		hangar.addBird(chicken);
		hangar.addBird(turkey);
		
		
		hangar.addUniqeAnimal(cat);
		hangar.addUniqeAnimal(cat);
		hangar.addUniqeAnimal(cat);
		hangar.addUniqeAnimal(cat);
		hangar.addUniqeAnimal(cat);
		hangar.addUniqeAnimal(dog);
		hangar.addUniqeAnimal(puppy);
		hangar.addUniqeAnimal(cat1);
		hangar.addUniqeAnimal(dog);
		hangar.addUniqeAnimal(puppy);
		hangar.addUniqeAnimal(cat1);
		
		hangar.pritnIfo();
	}

}
