package _67.treemapnavigate;

import java.util.SortedMap;
import java.util.TreeMap;

public class BackEndMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "bir");
		treeMap.put(2, "iki");
		treeMap.put(30, "otuz");
		treeMap.put(40, "kirk");
		treeMap.put(50, "elli");
		treeMap.put(90, "doksan");
		treeMap.put(100, "yuz");

		SortedMap<Integer, String> headMap1 = treeMap.headMap(40);
//		40 a kadar

		for (Integer key : headMap1.keySet()) {
			System.out.println("key : " + key + " value : " + headMap1.get(key));
		}

		System.out.println("headMap true");

		SortedMap<Integer, String> headMap2 = treeMap.headMap(90, true);
//		90 ve daha kucuk
		for (Integer key : headMap2.keySet()) {
			System.out.println("key : " + key + " value : " + headMap2.get(key));
		}

		System.out.println("tailMap");
		SortedMap<Integer, String> tailMap = treeMap.tailMap(30);
//		30 dan sonra

		for (Integer key : tailMap.keySet()) {
			System.out.println("key : " + key + " value : " + tailMap.get(key));
		}

		System.out.println("subMap");
		SortedMap<Integer, String> subMap = treeMap.subMap(30, 70);
//		30 ile 70 arasi

		for (Integer key : subMap.keySet()) {
			System.out.println("key : " + key + " value : " + subMap.get(key));
		}

	}
}
