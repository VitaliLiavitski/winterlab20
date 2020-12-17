package com.solvd.farm.build;

import com.solvd.farm.animal.Animal;
import com.solvd.farm.bird.Bird;

public class Hangar {
	
	private Animal corral;
	private Bird slot;
	
	
	public Hangar() {
		
	}
	
	public Animal addAnimal(Animal animal) {
		this.corral = animal;
		
		return this.corral;
	}
	
	public Bird addBird(Bird bird) {
		this.slot = bird;
		return this.slot;
	}
	
	public void pritnIfo() {
		System.out.println(this.corral.getName());
		System.out.println(this.slot.getName());
	}
	
	
}
