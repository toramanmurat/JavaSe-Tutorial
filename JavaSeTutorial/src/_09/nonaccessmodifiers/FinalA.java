package _09.nonaccessmodifiers;

public class FinalA {

	public void TestMetod() {

	}

	public final void finalTestMethod() {

	}

	final int finalVeriable = 12;

	public static void main(String[] args) {
		FinalA finalA = new FinalA();
//		final veriable'lar sabittir ve degeri degismez.
//		finalA.finalVeriable=40;
	}
}

class SubClassFinalA extends FinalA {

	@Override
	public void TestMetod() {

	}
//	Derleme hatasi
//	@Override
//	public final void finalTestMethod() {
//		
//	}
}
