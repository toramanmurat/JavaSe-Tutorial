package _33.garbage.collection;

public class GarbageTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "murat";
		person.name = "Toraman";
		person.age = 26;

		person = null;
//		Person objeci garbage collector tarafindan silinmeye uygundur
//		birtane bile referans varsa bu durumda garbage collection tarafindan obje silinemez!

		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total :" + runtime.totalMemory());
		System.out.println("Free memory :" + runtime.freeMemory());

		for (int i = 0; i < 1000000; i++) {
			new Person();
		}

		System.out.println(" After Free memory :" + runtime.freeMemory());

		runtime.gc();
//		JVM e garbage collector calistirmak icin istekte bulunuruz
		System.out.println("After Gc :" + runtime.freeMemory());

	}
}

class Person {

	String name;
	String surname;
	int age;

}