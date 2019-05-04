package _21.constructors;

class A {
	int x;
	int y;

	public A(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public A() {
		super();
		System.out.println("No-arg constructor");
	}
//	java da constructor icerisinde calismasi gerek ilk ifade super() dir.

}

public class ConstructorTest {

	public static void main(String[] args) {
		A a = new A(4, 5);
//		no-arg constructors
		A a1 = new A();
	}

}
