package _06.java8interface;

public class Java8InterfaceImple implements Java8Interface {

	@Override
	public void abstractMethod() {
		System.out.println("override abstract metot");

	}
	// bir sinif bir arabirimi uyguladiginda(implements) eger sinif abstract
	// degilse
	// bu durumda interface te yer alan abstract metotlari (govdesiz metotlari)
	// override etmek zorundadir!
	// default metotlari istersek override edebiliriz ama zorunda degiliz

	@Override
	public void defaultMethod() {
		System.out.println("override default method");
	}
}
