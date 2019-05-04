package _61.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(20);
		numberList.add(10);
		numberList.add(40);
		numberList.add(-20);
		numberList.add(4);

		Collections.sort(numberList);

		for (Integer i : numberList) {
			System.out.println(i);
		}
	}
}
