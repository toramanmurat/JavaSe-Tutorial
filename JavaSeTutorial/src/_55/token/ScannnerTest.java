package _55.token;

import java.util.Scanner;

public class ScannnerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner("test1 test2 test3 test4");

		String token = null;
		while (sc.hasNext()) {
			token = sc.next();
			System.out.println(token);
		}

		Scanner sc2 = new Scanner("false test2 86 test4");

		while (sc2.hasNext()) {
			if (sc2.hasNextInt()) {
				int intToken = sc2.nextInt();
				System.out.println("int token " + intToken);
			} else if (sc2.hasNextBoolean()) {
				boolean booleanToken = sc2.nextBoolean();
				System.out.println("boolean " + booleanToken);
			} else {
				String stringToken = sc2.next();
				System.out.println("string token " + stringToken);
			}

		}

		sc.close();
		sc2.close();

	}
}
