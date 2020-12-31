package com.animal.Animal;

/**
 * create land animal, water animal interface create class platypus implementing
 * interfaces
 *
 */
public class App
{

	public static void move(Object obj, String ctx) throws Exception {
		if (ctx.equalsIgnoreCase("Land") && obj instanceof LandAnimal) {
			((LandAnimal) obj).walks();
		} else {
			throw new Exception("not supported in this interface");
		}
		if (ctx.equalsIgnoreCase("Water") && obj instanceof WaterAnimal) {
			((WaterAnimal) obj).swims();
		} else {
			throw new Exception("not supported in this interface");
		}
	}

	public static void main(String[] args) throws Exception {
		LandAnimal Ape = new Animal();
		WaterAnimal Fish = new Animal();
		// LandAnimal Platypus = new Animal();
		// WaterAnimal Platypus = new Animal();

		move(Ape, Ape.ctx);
		// move(Fish, Fish.ctx);

	}
}
