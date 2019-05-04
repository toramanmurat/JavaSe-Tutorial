package _69.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List testList = new ArrayList();
		testList.add("test");
		testList.add(10);
		testList.add(false);

		Integer element = (Integer) testList.get(1);
//		generic yapi kullanmadigimiz icin cast etmemiz gerekir

		System.out.println(element);

		List<Integer> genericList = new ArrayList<Integer>();
		genericList.add(10);
		genericList.add(20);
		genericList.add(30);
//		generic oldugu icin cast islemine gerek yoktur

		element = genericList.get(0);
		System.out.println(element);
	}
}
