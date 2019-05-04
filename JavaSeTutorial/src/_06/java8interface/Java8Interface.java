package _06.java8interface;

public interface Java8Interface {

	default void defaultMethod() {
		System.out.println("default method1");
	}

	default void defaultMethod2() {
		System.out.println("default method2");
	}

	void abstractMethod();

}

//java8 oncesinde interfaceler sadece abstract metotlara sahip olabilirdi.
//java8le birlikte artik interfaceler govdeli metotlara da sahip olabilirler.
//bunun icin default anahtar kelimesini kullanabiliriz.
