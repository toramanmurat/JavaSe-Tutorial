package _35.operators;

public class LogicalOperatorTest {

	public static void main(String[] args) {

		int i = 10;

		if (i > 8 || i / 7 > 2) {
			System.out.println(i);
		}

//		||(veya) mantigi icin tek true yeterlidir.

		if (i > 13 && i / 7 > 2) {
			System.out.println(i);
		}

//		&& (ve) mantigi icin tek false yeterlidir

	}

}
