package _32.more.overloading;

public class Test4 {

	public static void main(String[] args) {
		
		Integer i = 10;
		overloaded(i);
//		overloaded(Number x) calisir
	}

	static void overloaded(int x) {

		System.out.println("long");
	}

	static void overloaded(Number x) {

		System.out.println("number");
	}
}
