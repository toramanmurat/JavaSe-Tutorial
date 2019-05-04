package _59.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorTest {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

		System.out.println("basit for dongusu");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("gelismis for dongusu");

		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println("Iterator");

		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("List Iterator");

		ListIterator<Integer> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("reverse");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
