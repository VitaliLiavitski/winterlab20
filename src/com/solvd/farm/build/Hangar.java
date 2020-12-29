package com.solvd.farm.build;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.solvd.farm.animal.Animal;
import com.solvd.farm.bird.Bird;

public class Hangar {

	List<Animal> corral;
	List<Bird> slot;

	Set<Animal> uniqeStorage;

	public  int size = 12;

	public Hangar() {
		corral = new ArrayList<Animal>();
		slot = new LinkedList<Bird>();
		uniqeStorage = new HashSet<Animal>();

	}
	
	public Hangar(Animal animal, Bird bird ) {
		corral = new ArrayList<Animal>();
		slot = new LinkedList<Bird>();
		size ++;
	}

	public void addAnimal(Animal animal) {
		corral.add(animal);
	}

	public void addBird(Bird bird) {
		slot.add(bird);
	}

	public void addUniqeAnimal(Animal animal) {
		uniqeStorage.add(animal);
	}

	public void pritnIfo() {
		System.out.println("=====Animal======");

		for (Animal animal : corral) {
			System.out.println(animal.toString());
		}

		System.out.println("=====Bird======");

		for (Object bird : slot) {
			System.out.println(bird.toString());
		}

		System.out.println("=====Uniqe Animal======");

		for (Animal animal : uniqeStorage) {
			System.out.println(animal.toString());
		}
	}

}
