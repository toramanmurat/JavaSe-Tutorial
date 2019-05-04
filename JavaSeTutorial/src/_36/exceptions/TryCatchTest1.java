package _36.exceptions;

public class TryCatchTest1 {

	public static void main(String[] args) {
		int sayi = 40;
		int i = 0;

		try {
			System.out.println(sayi / i);
		} catch (ArithmeticException ae) {
			System.out.println("0 a bolme hatasi");

		}
	}

}

//try-catch
//try-finally
//try-catch-finally
