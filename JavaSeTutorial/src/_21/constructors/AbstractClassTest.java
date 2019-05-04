package _21.constructors;

abstract class AbstractClass{
	public AbstractClass() {
		System.out.println("AbstractClass constructors");
	}
}
class NonAbstract extends AbstractClass{
	NonAbstract(){
		super();
		System.out.println("NonAbstract constructors");
	}
}

public class AbstractClassTest {
	
	public static void main(String[] args) {
		NonAbstract nonAbstract=new NonAbstract();
	}

}
