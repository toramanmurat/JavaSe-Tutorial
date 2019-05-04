package _10.veriable.declaration;

public class ShadowingTest {

	int shadow = 10;

	void test() {
		// instance variable ile local variable ayni isimde oldugunda bu duruma
		// shadowing adi verilir.
		int shadow = 20;

		System.out.println(shadow);

		// this anahtar kelimesi bu noktada gecerli olan ShadowingTest objesine
		// referansta bulunur.
		System.out.println(this.shadow);
	}

	public static void main(String[] args) {
		ShadowingTest st = new ShadowingTest();
		st.test();
	} 
}
