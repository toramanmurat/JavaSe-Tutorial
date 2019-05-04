package _64.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<Integer>();

//		1 tane 100 eklenir
		numbers.add(100);
		numbers.add(100);

		numbers.add(100);
		numbers.add(300);
		numbers.add(50);
		numbers.add(90);

		for (Integer i : numbers) {
			System.out.println(i);
		}
//		elemanlari ekledigimiz siraya gore gelmez

		Iterator<Integer> value = numbers.iterator();

		System.out.println("The iterator values are:");
		while (value.hasNext()) {

			System.out.println(value.next());
		}
		
//		LinkedHashSet
		
		Set<Integer> numbersLinkedHashSet=new LinkedHashSet<Integer>();
		
//		ayni eleman eklenmez
		numbersLinkedHashSet.add(10);
		numbersLinkedHashSet.add(10);
		numbersLinkedHashSet.add(10);
		numbersLinkedHashSet.add(120);
		numbersLinkedHashSet.add(20);
		numbersLinkedHashSet.add(0);
		
//		ekledigimiz sira ile elemanlar eklenir
		System.out.println("numbersLinkedHashSet ");
		for(Integer i:numbersLinkedHashSet) {
			System.out.println(i);
		}
		
		System.out.println("The iterator values are LinkedHashSet:");
		Iterator<Integer> value2=numbersLinkedHashSet.iterator();
		
		while(value2.hasNext()) {
			System.out.println(value2.next());
		}
		
	}
}
