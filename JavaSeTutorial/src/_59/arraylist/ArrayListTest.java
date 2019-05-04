package _59.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add(50);
		arrayList.add(-5);
		arrayList.add("test");
		arrayList.add(true);
		arrayList.add(50);
		arrayList.add(50);

		arrayList.set(2, "override ");

		arrayList.add(2, "add index 2");

		for (Object o : arrayList) {
			System.out.println(o);
		}

	}
}
