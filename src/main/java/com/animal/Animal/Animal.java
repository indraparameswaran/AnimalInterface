package com.animal.Animal;

public class Animal implements LandAnimal, WaterAnimal {

	@Override
	public void swims() {
		System.out.println("I swim");

	}

	@Override
	public void walks() {
		System.out.println("I walk");

	}

}
