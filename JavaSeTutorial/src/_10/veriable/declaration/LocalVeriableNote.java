package _10.veriable.declaration;

public class LocalVeriableNote {
	// instance variablelar icin otomatik olarak initialize islemi yapilir.
	int instanceVariable;

	public static void main(String[] args) {
		// local degisken! metot icerisinde tanimli!
		int localVariable = 0;

		// local degiskenler otomatik olarak initialize edilmez.
		// int localVariable ;
		System.out.println(localVariable);

		LocalVeriableNote localVarNote = new LocalVeriableNote();
		System.out.println(localVarNote.instanceVariable);

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// erisim saglanamz. for dongusu icinde gecerlidir!
		// System.out.println(i);
	}

	void test() {
		// local variable'larin yasam alani tanimlandigi metotla sinirlidir.
		// farkli bir metotta kullanamayiz.
		// localVariable=50;

	}

}
//local variable bir metot icerisinde tanimlanan degiskenlerdir!
//local degiskenlerin scope tanimlandigi metotla sinirlidir.
//local degiskenler "Stack"te yasarlar. methodlar stackte yasarlar.
//instance variable ve objeler heapte yasarlar.
//local degiskenler access modifier almazlar! private public protected kullanilamaz.
//local degiskenler static olmazlar. sadece final olabilirler.
//local degiskenleri kullanmadan once mutlaka initializ etmemiz gereklidir.
