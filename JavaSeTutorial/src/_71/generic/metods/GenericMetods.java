package _71.generic.metods;

import java.util.ArrayList;
import java.util.List;

public class GenericMetods {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();

		genericMetod(animalList);
//		genericMetod(dogList);
//		derleme hatasi verir.Animal tipinde ki listeleri gonderebiliriz.

		Animal animal = new Animal();
		Dog dog = new Dog();

		testArray(animal);
		testArray(dog);
	}

	public static void genericMetod(List<Animal> myList) {

	}

	public static void testArray(Animal animal) {

	}

}

class Animal {

	public void eat() {
		System.out.println("animal eat");
	}
}

class Dog extends Animal {

	public void eat() {
		System.out.println("Dog eat");
	}
}
