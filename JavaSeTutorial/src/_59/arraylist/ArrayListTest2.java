package _59.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List myArrayList = new ArrayList();

		boolean isEmpty = myArrayList.isEmpty(); // bos mu ?
		System.out.println(isEmpty);

		int size = myArrayList.size();

		System.out.println(size);

		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(6);
		myArrayList.add(50);

		System.out.println(size);

		boolean contains = myArrayList.contains(2); // eleman var mi ?
		System.out.println(contains);

		int indexOf = myArrayList.indexOf(3);
//		elemanin index i ni doner yoksa -1 doner
		System.out.println(indexOf);

		myArrayList.remove(3);
//		indexi 3 olan elemani siler

		for (Object o : myArrayList) {
			System.out.println(o);
		}

	}

}
