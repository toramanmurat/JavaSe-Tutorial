package _64.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {

		String[] stringArray = { "Ardahan", "Kars", "Erzurum", "İstanbul" };
		Integer[] integerArray = { 75, 36, 25, 34 };

//		stringArray ve integerArrayi set yapisina donusturduk
		Set<String> setString = new HashSet<String>(Arrays.asList(stringArray));
		Set<Integer> setInteger = new HashSet<Integer>(Arrays.asList(integerArray));

		System.out.println("String Set");
		for (String s : setString) {
			System.out.println(s);
		}
		System.out.println("Integer Set");
		for (Integer i : setInteger) {
			System.out.println(i);
		}

	}

}
