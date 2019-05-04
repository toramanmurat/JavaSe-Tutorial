package _56.tostring;

class Employee {
	String name = "murat";
	int age = 26;

	@Override
	public String toString() {
		System.out.println("Employee toString()");
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}

public class ToStringTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee2 = new Employee();

		System.out.println(employee);
		System.out.println(employee2);

	}

}
