package _65.mapTest;

import java.util.HashMap;
import java.util.Map;


public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "value1");
		map.put(2, "value2");
		map.put(3, "value3");
		map.put(4, "value4");
		map.put(5, "value5");
		map.put(1, "value1 override");
//		override eder add metodu yerine put metodu kullaniriz.
		
		map.put(6, "value1");
//		value unique olmak zorunda degildir. Key unique olmak zorundadir
		
		for(Integer key:map.keySet()) {
			System.out.println("key :"+key+" value :"+map.get(key));
		}
		
		System.out.println(map.isEmpty()); //false
		System.out.println(map.size()); //6
		System.out.println(map.containsKey(1)); //true
		System.out.println(map.containsValue("value1")); //true
		System.out.println(map.containsValue("value")); //false
		
		
		map.clear(); //map clear eder
		System.out.println("Map Clear");
		System.out.println(map.isEmpty()); //true
		System.out.println(map.size()); //0
		
	}
}
