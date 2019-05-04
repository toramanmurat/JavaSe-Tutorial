package _59.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {

		List myArrayList = new ArrayList();
		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		myArrayList.add(40);
		myArrayList.add(50);

		List myArrayList2 = new ArrayList();
		myArrayList2.addAll(myArrayList);
//		myArrayList'i myArrayList2 ye ekledik
		myArrayList2.add(60);
		myArrayList2.add(70);

		for (Object o : myArrayList2) {
			System.out.println(o);
		}

		myArrayList2.removeAll(myArrayList);
//		myArrayList i myArraList2 den sildik

		System.out.println("--------------");

		for (Object o : myArrayList2) {
			System.out.println(o);
		}

		List subList = myArrayList.subList(2, 5);

		System.out.println("Sub List");

		for (Object o : subList) {
			System.out.println(o);
		}
	}

}
