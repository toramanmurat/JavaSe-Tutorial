package _60.arrays.sort;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {

		int[] numbers = { 5, 654, 6, 5, 48, 79, 97, 7654, 45 };

		Arrays.sort(numbers);

		for (int number : numbers) {
			System.out.println(number + " ");
		}

		String[] names = { "a", "B", "A", "z", "Ba", "BB", "BA", "Def", "DEF" };
		Arrays.sort(names);

		System.out.println("String sort");
		for (String name : names) {
			System.out.println(name + " ");
		}
//		unicode degerine gore siralama yapiyor

	}
}
