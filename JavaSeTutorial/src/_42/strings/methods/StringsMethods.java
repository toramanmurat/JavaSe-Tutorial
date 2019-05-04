package _42.strings.methods;

public class StringsMethods {

	public static void main(String[] args) {
		String str = "murat";

		if (str != null && str.length() > 3) {

			System.out.println(str.length());

		}
		String str1 = "";
		System.out.println(str1.isEmpty()); // true
		System.out.println(str.isEmpty()); // false

		System.out.println(str.charAt(2)); // r
		System.out.println(str.substring(1, 3)); // ur
//		[) baslangic degeri dahil 
		System.out.println("a".compareTo("b")); // -1
		System.out.println(str.indexOf("a")); // 3

		char[] myArray = "murat".toCharArray(); //String ifadeyi char dizisine atar.
		for (char c : myArray) {
			System.out.print(c + " ");
		}
	}

}
