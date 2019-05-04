package _32.more.overloading;

public class Test2 {
	
	public static void main(String[] args) {
//		long'u tercih eder
		int i=10;
		overloaded(i);
	}


	static void overloaded(long x) {

		System.out.println("long");
	}

	static void overloaded(Integer x) {

		System.out.println("Integer");
	}
}
