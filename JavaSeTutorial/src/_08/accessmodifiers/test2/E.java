package _08.accessmodifiers.test2;

import _08.accessmodifiers.test.B;

public class E extends B {
	public void test() {
		B b = new B();
		// c.protectedVariable=50;
		// obje referansi uzerinde farkli pakette kullanamayiz.

		// kalitim vasitasiyla farkli pakette bu yontemle kullanabiliriz.
		protectedVariable = 60;
	}

}
