package _72.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		genericMetod(animalList);

		genericWildCardMethod(animalList);
		genericWildCardMethod(dogList);

	}

	public static void genericMetod(List<Animal> myList) {
		myList.add(new Animal());
		myList.add(new Dog());
	}

	public static void genericWildCardMethod(List<? extends Animal> myList) {
//		eleman eklememize izin vermez 
//		sadece cagirmamizi saglar

	}

	public static void genericWildCardMethodSuper(List<? super Dog> dogList) {

		dogList.add(new Dog());
		dogList.add(new Pitbull());

//		dogList.add(new Animal());
//		hata verir

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

class Cat extends Animal {

	public void eat() {
		System.out.println("Cat eat");
	}
}

class Pitbull extends Dog {

	public void eat() {
		System.out.println("Pitbull eat");
	}
}
