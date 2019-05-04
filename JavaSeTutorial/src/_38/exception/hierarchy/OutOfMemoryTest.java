package _38.exception.hierarchy;

public class OutOfMemoryTest {

	public static void main(String[] args) {
		method1();

	}

	static void method1() {
		method2();
	}

	static void method2() {
		method1();
	}
	
}
