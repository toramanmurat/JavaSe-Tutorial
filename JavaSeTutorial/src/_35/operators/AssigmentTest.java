package _35.operators;

public class AssigmentTest {

	public static void main(String[] args) {

		int i = 900;
//		assignment operator(=)
		byte b = (byte) i;
		System.out.println(b);

		int x = 20;
		x += 4; // x =x+4;
//		Compound operator(+= , -= , *= , /=)
		System.out.println(x);

		int y = 15;
		y -= 5; // y=y-5
		System.out.println(y);

		int z = 10;
		z *= 5 + 10;// z=z*(2+5)

		System.out.println(z);

//		relational operator(> , >= , < , <= ,==)

		boolean bool = metod();

//		if(bool=true) {
//			System.out.println("= atama operatoru. True oldugu icin if calisir");
//		}

		if (bool == false) {
			System.out.println("bool false oldugu icin if calisir");
		}

		if (bool) {
			System.out.println("boolean degiskenleri karsilastirirken == yapmamiza gerek yoktur !");
		}

	}

	static boolean metod() {
		boolean check = false;
		return check;
	}

}
