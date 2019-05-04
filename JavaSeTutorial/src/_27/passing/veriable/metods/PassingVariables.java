package _27.passing.veriable.metods;



public class PassingVariables {
	
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.height=5;
		animal.size=15;
		
		method(animal);
		
		System.out.println(animal.height);
		System.out.println(animal.size);
		
	}
	
	public static void method(Animal a) {
		
		a.height=10;
		a.size=20;
	}

}

class Animal{
	
	int size;
	int height;
}
