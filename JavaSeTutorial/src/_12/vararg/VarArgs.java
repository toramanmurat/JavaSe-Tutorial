package _12.vararg;

public class VarArgs {

	static void method(int... x) {
		System.out.println(x.length);

	}

	static void method2(String name, int... x) {
		System.out.println(x.length);

	}

	public static void main(String[] args) {
		method();
		method(1);
		method(1, 2);
		method(1, 2, 3, 4, 5, 6);

	}

}
