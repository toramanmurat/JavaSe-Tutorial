package _10.veriable.declaration;

public class VeriableNotes {

	int primitiveVar = 1;
	// tipi int oldugu icin primitive
	// instance variable dir.

	String str = "test";
	// String primitive degildir! java.lang.String
	// reference type bir degiskendir.

	// myArray bir reference type degiskendir!
	// bu degiskenin tipi int degildir! bu degiskenin tipi int[] dir , elemanlari
	// int tir.
	int[] myArray;

	// bu degisken primitive degildir! reference type degiskendir.
	Integer i = 10;

	// static degiskenler class'a aittir.
	// her obje icin bir instance variable vardir fakat her obje icin sadece bir
	// tane static degisken vardir.
	static int staticVariable = 30;

	public static void main(String[] args) {

		Car car = new Car();
		// local variable
		// reference type variable

		// bir referans degisken objeyi gosterir isaret eder.
		// Java da objeler "Heap"te yasar.
		// instance variable'lar objeye aittir ve obje ile birlikte heap'te yasarlar.

	}
}

// ****Java da degisken 2 ye ayrilir.
//1- primitive type
//2- reference type

//primitive tipler 8 tanedir ; char , boolean ,byte, short int long double float

//bu 8 tip degisken disinda kalan butun degiskenler reference type degiskendir.

// ****Java da degiskenler 3 e ayrilir
//1- class variable (static variable)
//2- instance variable(objeye aittir)
//3- method variable/local variable

//instance variable'lar 4 erisim seviyesine sahip olabilir.
//private protected public keywordleri kullanilabilir.
//final , transient olabilir.
//static anahtar kelimesi kullanildiginda bu degisken artik instance variable degildir! static variable dir.
