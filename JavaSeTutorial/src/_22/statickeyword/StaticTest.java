package _22.statickeyword;

public class StaticTest {

	static int staticVeriable=0;
//	static degisken class a aittir.
	
	int instanceVeriable=0;	
//	instance veriable objeye aittir ve heapte yasar
	
	StaticTest(){
		staticVeriable=staticVeriable+1;
		instanceVeriable=instanceVeriable+1;	
	}
	
	public static void main(String[] args) {
		new StaticTest();
		new StaticTest();
		new StaticTest();
		new StaticTest();
		new StaticTest();
		new StaticTest();
		new StaticTest();
		StaticTest staticTest=new StaticTest();
		
		System.out.println(StaticTest.staticVeriable);
		System.out.println(staticTest.staticVeriable);
		System.out.println(staticTest.instanceVeriable);
		
		
		
	
	}
	
}

// 1- static veriable
// 2- static methods
// 3- static block
// 4- static import

// **static metotlarin kullanilmasina uygun yerler; Utility class'lardir
// **Static bir metodtan direk olarak instance veriable a ulasim saglanamaz.
// **static bir metodtan direk olarak instance metodu cagiramayiz. (obje olusturmadan )
// **bir instance metotdan bir instance metot cagilabilir
// **instance metotdan direkt olarak static metod cagrilabilir.
