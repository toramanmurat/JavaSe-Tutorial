package _32.more.overloading;

public class Test3 {

	public static void main(String[] args) {
//		overloaded(int x,int y) tercih eder
		byte b = 5;
		overloaded(b, b);

	}

	static void overloaded(byte... x) {

		System.out.println("byte var args");
	}

	static void overloaded(int x, int y) {

		System.out.println("int x,int y");
	}
}
