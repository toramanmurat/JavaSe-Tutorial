package _09.nonaccessmodifiers;

public abstract class AbsClass {

	public abstract void absTestMethod();
}

//concrete sinif oldugu icin absTestMethod override etmek zorundadir.
class SubAbstract extends AbsClass {

	@Override
	public void absTestMethod() {
		// TODO Auto-generated method stub

	}
}

//abstract sinif oldugu icin absTestMethod override etmek zorunda degildir!
//istersek edebiliriz.
abstract class SubAbstractAbs extends AbsClass {

}
//abstract keyword methodlarla ve class/interface ile kullanilir.
//bir sinifta bir abstract method tanimlandiginda sinif mutlaka abstract
//olmalidir.

//abstract bir sinifi kalitan sinif eger kendisi de abstract degilse concrete sinif ise abstract metotlari override etmek zorundadir.
//eger abstract sinif ise zorunda degildir.