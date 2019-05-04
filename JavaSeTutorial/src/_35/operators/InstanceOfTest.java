package _35.operators;

public class InstanceOfTest {

	public static void main(String[] args) {

		String name = "Murat";

		System.out.println(name instanceof String);
		System.out.println(name instanceof Object);

		int i = 10;
//		primitive tipler icin instanceof kontrolu yapilmaz
//		System.out.println(name instanceof Integer);
		System.out.println(i);

		Integer number = 10;
		System.out.println(number instanceof Integer);

	}

}
