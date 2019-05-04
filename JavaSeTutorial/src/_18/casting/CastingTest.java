package _18.casting;

class Animal {
	public void eat() {
		System.out.println("Animal eat.");
	}
}

class Horse extends Animal {

	public void eat() {
		System.out.println("Horse eat.");
	}

	public void run() {
		System.out.println("Horse Run!");
	}

}

class Bird extends Animal {

	public void eat() {

		System.out.println("Bird Eat");
	}

	public void fly() {
		System.out.println("Bird Fly");
	}
}

public class CastingTest {
	
	public static void main(String[] args) {
		Animal horseAnimal=new Horse();
		Horse horse=((Horse)horseAnimal);
		horse.run();
		
		Animal birdAnimal=new Bird();
		
		if(birdAnimal instanceof Horse) {
			System.out.println("it is horse object");
			
		}
		else if(birdAnimal instanceof Bird) {
			System.out.println("it is bird object");
		} 
		
		Horse horse2=new Horse();
		Animal animal=horse2;
		Animal animal2=(Animal)horse2;
		
	}

}
