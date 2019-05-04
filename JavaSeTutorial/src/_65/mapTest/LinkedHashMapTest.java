package _65.mapTest;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap=new LinkedHashMap<Integer , String>();
		
//		index based yapiya sahip
//		elemanlar ekledigimiz sirada yazilacaktir
		linkedHashMap.put(10, "value1");
		linkedHashMap.put(20, "value2");
		linkedHashMap.put(30, "value3");
		linkedHashMap.put(40, "value4");
		linkedHashMap.put(50, "value5");
		linkedHashMap.put(60, "value6");
		linkedHashMap.put(60, "key unique olmali");
		
		for(Integer key:linkedHashMap.keySet()) {
			System.out.println("key :" + key + " value : "+ linkedHashMap.get(key));
		}
		
		Set<?> entrySet = linkedHashMap.entrySet();
		
		Iterator<?> it=entrySet.iterator();
		
		System.out.println("linkedHashMap ");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
