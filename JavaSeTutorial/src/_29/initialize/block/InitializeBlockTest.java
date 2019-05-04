package _29.initialize.block;

public class InitializeBlockTest {
	
	public static void main(String[] args) {
		Animal animal=new Animal();
		Horse horse=new Horse();
	}
	
}

class Animal{
	
	static {
		
		System.out.println("Animal static initialize Block");
	}
	

	static {
		
		System.out.println("Animal static initialize Block2");
	}
	
	{
		System.out.println("Animal init Block");
	}
	
	Animal(){
		System.out.println("Animal constructor");
	}
}

class Horse extends Animal{
	
	static {
		
		System.out.println("Horse static initialize Block");
	}
	

	static {
		
		System.out.println("Horse static initialize Block2");
	}
	
	{
		System.out.println("Horse init Block");
	}
	
	Horse(){
		System.out.println("Horse Constructor");
		
	}
	
}