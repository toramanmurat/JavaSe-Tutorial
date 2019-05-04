package _16.override;

class Animal {

	int height = 10;
	static int size = 12;

	public void eat() {
		System.out.println("Animal Class Eat Metod");

	}

	// javada static metotler override edilmezler
	public static void breathe() {
		System.out.println("Animal Class Breathe Metod");

	}

}

class Bird extends Animal {

	int height = 5;
	static int size = 8;

	@Override
	public void eat() {
		System.out.println("Bird Class Eat Metod");

	}

	public static void breathe() {
		System.out.println("Bird Class Breathe Metod");

	}

}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog Class Eat Metod.");
	}

	public void run() {
		System.out.println("Dog Class run Metod ");
	}

}

public class OverrideTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.height);
		System.out.println(animal.size);
		animal.eat();
		animal.breathe();

		Bird bird = new Bird();
		System.out.println(bird.height);
		System.out.println(bird.size);
		bird.eat();
		bird.breathe();

		Animal animalBird = new Bird();
		animalBird.eat();
		animalBird.breathe();

		System.out.println(animalBird.height);
		System.out.println(animalBird.size);
//		instance variable'la static variable'lar override edilmez
//		sadece  instance metotlar override edilir.
//		private metotlar override edilemez
//		override metotlarda metodun parametresi degismez 
//		override metotların donus tipi degismez
//		final tanimli metotlar override edilemez

		animalBird = new Dog();
		animal.eat();
	}

}
