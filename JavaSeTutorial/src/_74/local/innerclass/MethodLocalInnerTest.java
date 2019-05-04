package _74.local.innerclass;

class OuterClass {

	private int privateVar = 50;

	private void outerMethod() {
		System.out.println("outerMethod ");

	}

	void method() {
//		metod local inner classlar icin private,protected gibi access level kullanilmaz
		class LocalInnerClass {

			private void localInnerMetod() {
//				erisim saglayabiliri
				System.out.println(privateVar);
				outerMethod();
			}

		}

		LocalInnerClass local = new LocalInnerClass();
		local.localInnerMetod();
	}

	class RegularInnerClass {

	}
}

public class MethodLocalInnerTest {

	public static void main(String[] args) {

		OuterClass outerClass = new OuterClass();
		outerClass.method();
	}

}
