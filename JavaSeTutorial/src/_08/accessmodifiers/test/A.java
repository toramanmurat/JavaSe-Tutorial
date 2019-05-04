package _08.accessmodifiers.test;

import _08.accessmodifiers.test2.C;

public class A {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.instanceVeriable2);
		System.out.println(c.intanceVeriable1);
		c.testMethod();

		B b = new B();
//		b.privateIntanceVeriable=20;
//		private degisken oldugu icin erisim farkli siniftan saglanamaz! 

		// bu degisken default/package level oldugu icin ulasim farkli siniftan
		// saglanir! Burada onemli nokta ayni package olmaldiri.
		b.defaultLevelInstanceVariable = 40;

		// protected bir variable a erisim farkli siniftan ayni package olmasi sarti ile
		// erisim saglananir.
		b.protectedVariable = 50;

	}
}
