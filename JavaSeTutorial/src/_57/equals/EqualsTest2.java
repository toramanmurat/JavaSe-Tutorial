package _57.equals;

class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class EqualsTest2 {

	public static void main(String[] args) {

		Employee employee = new Employee("Murat", 26);
		Employee employee2 = new Employee("Murat", 26);

		System.out.println(employee == employee2); // false
		System.out.println(employee.equals(employee2)); // false --> //true
//		hashcode ve equals override edersek true doner
	}

}
