package _10.veriable.declaration;

public class StaticVeriables {
	static int counter = 0;

	// gereksiz yere her seyi static yapmak OO(object oriented) ruhuna terstir!
	// static methodlar Utility mantigi icin uygundur.

	static {
		System.out.println("static block");
		counter++;
	}

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(++counter);

		StaticVeriables sv = new StaticVeriables();
		sv.test();
	}

	void test() {
		System.out.println(++counter);
		System.out.println(counter++);
		System.out.println(counter);
	}

}

//static degiskenler ve static metotlar sinifa aittir. herhangi bir objeye ait degildir.
//butun static degiskenler ve metotlar yeni bir obje olusmadan once hazirdir.
//constructors interface local degiskenler class static olamazlar.