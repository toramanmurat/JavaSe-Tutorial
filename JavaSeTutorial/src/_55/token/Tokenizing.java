package _55.token;

public class Tokenizing {

	public static void main(String[] args) {
		String test = "test1,test2,test3,test4,test5";

		String[] myArray = test.split(",");

		for (String str : myArray) {
			System.out.println(str);
		}

		System.out.println("--------------------");

		String test2 = "test1,test2:test3@test4&test5";

		String[] myArray2 = test2.split(",|:|@|&");

		for (String str : myArray2) {
			System.out.println(str);
		}

		System.out.println("--------------------");

		String test3 = "test1.test2.test3.test4.test5";

		String[] myArray3 = test3.split("\\.");

		for (String str : myArray3) {
			System.out.println(str);
		}

	}

}
