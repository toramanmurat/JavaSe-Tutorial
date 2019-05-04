package _41.string.immutable;

public class ImmutableTest {

	public static void main(String[] args) {
		String name = "murat";

//		name.concat("toraman");

		name = name.concat("toraman");

		System.out.println(name);

		String str = "obje"; // obje olustu
		String str1 = "obje";// obje olusmaz
		System.out.println(str == str1);// truee

		String str3 = new String("test");
		String str4 = new String("test");

		System.out.println(str3 == str4);// false
	}
}

//immutable olması demek , String objelerinin degerinin degismemesi demektir
//her degisiklikte yeni bir obje olusur
