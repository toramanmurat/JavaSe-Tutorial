package _37.ducked.exception;

public class DuckedExceptionTest {

	public static void main(String[] args) {

		method1();
	}

	static void method1() {
		method2();

	}

	static void method2() {
		method3();
	}

	static void method3() {

		int sayi = 5 / 0;
	}
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at _37.ducked.exception.DuckedExceptionTest.method3(DuckedExceptionTest.java:21)
//		at _37.ducked.exception.DuckedExceptionTest.method2(DuckedExceptionTest.java:16)
//		at _37.ducked.exception.DuckedExceptionTest.method1(DuckedExceptionTest.java:11)
//		at _37.ducked.exception.DuckedExceptionTest.main(DuckedExceptionTest.java:7)

}
