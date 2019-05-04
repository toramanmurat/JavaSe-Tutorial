package _62.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	private String name;
	private Integer age;
	private Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {

		return salary.compareTo(o.salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class ComparableTest {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		Employee employee1 = new Employee("Murat", 24, 2000);
		Employee employee2 = new Employee("Test", 45, 1000);
		Employee employee3 = new Employee("Test1", 4, 1010);
		Employee employee4 = new Employee("Test2", 42, 100);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);

		Collections.sort(employeeList);

		for (Object o : employeeList) {
			System.out.println(o);
		}

	}

}
