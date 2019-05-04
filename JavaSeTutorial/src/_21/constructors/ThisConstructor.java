package _21.constructors;

class Animal{
	
	Animal(){
		
		System.out.println("Animal");
	}
}

class Horse extends Animal{
	Horse() {
		this("HorseName");
		System.out.println("Horse no-arg");
	}

//	this anahtar kelimesi kullanarak overloaded yapılandiricilari cagirabiliriz
	Horse(String name) {
		super();
		System.out.println(name);
		

	}

}

public class ThisConstructor {
	public static void main(String[] args) {
		Horse horse = new Horse();

	}

}
