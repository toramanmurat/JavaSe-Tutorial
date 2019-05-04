package _57.equals;

public class EqualsTest {

	public static void main(String[] args) {
		Integer i = 100;
		Integer i2 = 100;

		System.out.println(i == i2); // true
		System.out.println(i.equals(i2)); // true

		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);

		System.out.println(i3 == i4); // false
		System.out.println(i3.equals(i4)); // true

		System.out.println();
		System.out.println(i == i3); // false
		System.out.println(i.equals(i3)); // true

		String str = "test";
		String str1 = "test";

		System.out.println("*****");
		System.out.println(str == str1); // true
		System.out.println(str.equals(str1));// true

		String str3 = new String("test");
		String str4 = new String("test");

		System.out.println("---");
		System.out.println(str3 == str4); // false
		System.out.println(str3.equals(str4)); // true

		System.out.println();
		System.out.println(str3 == str); // false
		System.out.println(str3.equals(str1)); // true

	}

}
