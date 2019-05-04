package _14.interitance;

class Animal{
	
	public void eat() {
		System.out.println("Animal Eat");
	}
	
}

class Dog extends Animal{
	
	public void run() {
		
		System.out.println("run dog");
	}
}

class Bird extends Animal{
	
	public void fly() {
		System.out.println("Bird fly");
	}
}

public class InteritanceExample {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.run();
		
		Bird bird=new Bird();
		bird.eat();
		bird.fly();
	}

}
