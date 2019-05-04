package _04.nonaccessmodifiers;

public abstract class Test2 {

	public abstract void testMethod();

	public void testMethod2() {
	};

}

//abstract anahtar kelimesi hem siniflarda hem de metotlarda kullanilir.
//abstract siniflarda non-abstract metotlar
//abstract siniflardan obje/instance/nesne/object olusmaz! derleme hatasi verir.
//bir sinifta bir tane bile abstract metot varsa bu sinif abstract olmak zorundadir.
//final ile abstract birbirine zittir.
