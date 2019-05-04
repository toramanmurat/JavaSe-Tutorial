package _70.polymorphism.generic;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismGenericTest {

	public static void main(String[] args) {
		Animal animalDog = new Dog();

		List<Animal> animalList = new ArrayList<Animal>();

//		List<Animal> animalList2=new ArrayList<Dog>();
//		derleme hatasi verir

		Animal[] animalArray = new Dog[5];
//		derleme hatasi vermez

	}
}

class Animal {

}

class Dog extends Animal {

}