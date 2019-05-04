package _67.treemapnavigate;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapNavigateTest {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "bir");
		treeMap.put(2, "iki");
		treeMap.put(30, "otuz");
		treeMap.put(40, "kirk");
		treeMap.put(50, "elli");
		treeMap.put(90, "doksan");
		treeMap.put(100, "yuz");

		int ceilingKey = treeMap.ceilingKey(30);
//		30 ya da 30 dan buyuk minimum key degerini don
		int ceilingKey2 = treeMap.ceilingKey(35);

		System.out.println(ceilingKey);
		System.out.println(ceilingKey2);

		System.out.println("higherKey");
		int higherKey = treeMap.higherKey(30);
//		30 dan buyuk minimum key degeri >= yerine >
		System.out.println(higherKey);

		System.out.println();

		System.out.println("floorKey");
		int floorKey1 = treeMap.floorKey(39);
		System.out.println(floorKey1);

		int floorKey2 = treeMap.floorKey(40);
		System.out.println(floorKey2);

		int lowerKey1 = treeMap.lowerKey(40);
		// esittir yerine 40tan kucuk minimum key degerini bul.
		System.out.println(lowerKey1);

		Entry<Integer, String> entry = treeMap.ceilingEntry(30);
		Integer key = entry.getKey();
		String value = entry.getValue();
		System.out.println("key: " + key + " value : " + value);

		int firstKey = treeMap.firstKey();
		System.out.println("firstkey :" + firstKey);

	}
}
