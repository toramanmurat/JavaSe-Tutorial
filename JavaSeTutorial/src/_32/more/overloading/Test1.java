package _32.more.overloading;

public class Test1 {

	public static void main(String[] args) {

		byte b=3;
//		byte(b) olmadigi icin minimum parametreli metoda gider
		short s=10;
		long l=20;
		float f=15.8f;
		overloaded(b);
		overloaded(s);
		overloaded(l);
		overloaded(f);
	}

	static void overloaded(int x) {

		System.out.println("int");
	}

	static void overloaded(long x) {

		System.out.println("long");
	}

	static void overloaded(double x) {

		System.out.println("double");
	}

}
