package _64.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		System.out.println("LinkedHashSet");
		Set<Integer> numbersLinkedHashSet = new LinkedHashSet<Integer>();

//		ayni eleman eklenmez
		numbersLinkedHashSet.add(10);
		numbersLinkedHashSet.add(10);
		numbersLinkedHashSet.add(10);
		numbersLinkedHashSet.add(120);
		numbersLinkedHashSet.add(20);
		numbersLinkedHashSet.add(0);

		for (Integer i : numbersLinkedHashSet) {
			System.out.print(i + "  ");
		}

		System.out.println();

		System.out.println("TreeSet");
		Set<Integer> treeSet = new TreeSet<Integer>();

//		1 tane 10 ekler
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(20);
		treeSet.add(40);
		treeSet.add(15);
		treeSet.add(-10);

		for (Integer i : treeSet) {
			System.out.print(i + "  ");
		}
		System.out.println();
		Set<Employee> employeeTreeSet = new TreeSet<Employee>();

		Employee employee1 = new Employee("murat", 26);
		Employee employee2 = new Employee("Test", 2);
		Employee employee3 = new Employee("test1", 20);

		employeeTreeSet.add(employee1);
		employeeTreeSet.add(employee2);
		employeeTreeSet.add(employee3);
		employeeTreeSet.add(employee1); // bunu eklemicek

		for (Employee emp : employeeTreeSet) {
			System.out.println(emp);
		}

		Set<Department> departmantTreeSet = new TreeSet<Department>();

		Department department1 = new Department("IT", 1);
		Department department2 = new Department("TEST", 2);

//		departmantTreeSet.add(department1);
//		departmantTreeSet.add(department2);
//		runtime da hata verir.
//		Comparable olmadigi icin.
//		Department class'ına Comparable implements etmemiz gerekir

	}

}

class Employee implements Comparable<Employee> {

	String name;
	Integer age;

	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee employee) {

		return age.compareTo(employee.age);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}

class Department {

	String name;
	Integer id;

	public Department(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", id=" + id + "]";
	}

}
