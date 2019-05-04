package _66.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

//		TreeMap in elemanlari key'e gore siralanir
		treeMap.put(60, "value6");
		treeMap.put(10, "value1");
		treeMap.put(30, "value3");
		treeMap.put(20, "value2");
		treeMap.put(50, "value5");
		treeMap.put(40, "value4");

		for (Integer key : treeMap.keySet()) {
			System.out.println("key :" + key + " value : " + treeMap.get(key));
		}

		Set set = treeMap.entrySet();

		// Get an iterator
		Iterator it = set.iterator();

		System.out.println("treeMap iterator");
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.print("Key is: " + me.getKey() + " & ");
			System.out.println("Value is: " + me.getValue());
		}

		System.out.println("===================================");

		TreeMap<EmployeTreeMap, String> employeeTreeMap = new TreeMap<EmployeTreeMap, String>(new MyAgeComparator());
		employeeTreeMap.put(new EmployeTreeMap("murat", 5000, 28), "Toraman");
		employeeTreeMap.put(new EmployeTreeMap("John", 6000, 28), "John");
		employeeTreeMap.put(new EmployeTreeMap("Crish", 4000, 25), "Crish");

		for (EmployeTreeMap key : employeeTreeMap.keySet()) {
			System.out.println(key + " ==> " + employeeTreeMap.get(key));
		}

	}

}

class EmployeTreeMap {

	private String name;
	private int salary;
	private int age;

//	public EmployeTreeMap(String name, int salary) {
//		super();
//		this.name = name;
//		this.salary = salary;
//	}

	public String getName() {
		return name;
	}

	public EmployeTreeMap(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeTreeMap [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}

class MyNameComparator implements Comparator<EmployeTreeMap> {

	@Override
	public int compare(EmployeTreeMap o1, EmployeTreeMap o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

class MySalaryComparator implements Comparator<EmployeTreeMap> {

	@Override
	public int compare(EmployeTreeMap o1, EmployeTreeMap o2) {

		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class MyAgeComparator implements Comparator<EmployeTreeMap> {

	@Override
	public int compare(EmployeTreeMap o1, EmployeTreeMap o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}

}
