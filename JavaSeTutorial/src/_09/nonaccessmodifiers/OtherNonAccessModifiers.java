package _09.nonaccessmodifiers;

public class OtherNonAccessModifiers {

	// synchronized bir anahtar kelimedir, methodlarla birlikte kullanilir. non
	// access modifier dir.
	// synchronized tanimlanan bir metoda ayni anda sadece bir tane thread
	// erisebilir.
	public synchronized void test() {
	}

	// native de bir anattar kelimedir. abstract gibi govdesizdir.
	public native void nativeTest();
}
