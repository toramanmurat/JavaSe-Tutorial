package _59.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {

		String[] testArray = { "test1", "test2", "test3", "test4" };

		List<String> testList = Arrays.asList(testArray);
//		Array i List e donusturebiliriz

		for (Object o : testList) {
			System.out.println(o);
		}

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

		Object[] objectArray = arrayList.toArray();

		Integer[] integerArray = new Integer[arrayList.size()];
		integerArray = arrayList.toArray(integerArray);

		for (int i : integerArray) {
			System.out.println(i);
		}

		int index3 = arrayList.get(3);
		System.out.println(index3);

	}
}
