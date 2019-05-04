package _05.interfacedeclaration;

public interface InterfaceTest {
	void testMethod();
	// bu metot default access level degildir! public access leveldir.
	// interface in metotlari varsayilan olarak publictir!
	// private yada protected olarak tanimlayamayiz derleme hatasi verir!

	int bar = 40;
	// bu degisken aslinda public static final ozellige sahiptir!
	// final oldugu icin biz buna bir baslangic degeri atamamiz gereklidir.

}
