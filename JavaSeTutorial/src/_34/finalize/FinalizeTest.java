package _34.finalize;

public class FinalizeTest {

	@Override
	protected void finalize() throws Throwable {

		System.out.println("finalize metod");
	}

	public static void main(String[] args) {

		for (int i = 0; i < 1000000000; i++) {
			new FinalizeTest();
		}

		Runtime.getRuntime().gc();

	}

}

// garbage collection mekanizmasi,heapten objeyi silmeden once finalize metodunu cagirir.
// finalize metodu sadece bir kez cagrilabilir.
