package _15.polymorphism;

class Animal {

	public void eat() {
		System.out.println("Animal Eat");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog Eat");
	}

}

class Kangal extends Dog {
	@Override
	public void eat() {
		System.out.println("Kangal Eat");
	}

}

class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("Bird Eat");
	}

}

public class PolymorphismTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		// Java da bir referans degisken, hem kendi tipinde hem de subclass tipinde bir
		// objeyi gosterebilir.

		animal.eat();

		animal = new Dog();
		animal.eat();

		animal = new Bird();
		animal.eat();

		animal = new Kangal();
		animal.eat();

	}
}

//bir referans degisken tek bir tipte olabilir ve tipi degismez!
//bir referans degisken kendi tipinde ya da subclass tipinde bir objeyi gosterebilir/refer.
