package _64.set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateTest {

	public static void main(String[] args) {
		
		EmployeeDuplicate employee1=new EmployeeDuplicate("Murat", 26, 1000);
		EmployeeDuplicate employee2=new EmployeeDuplicate("Murat", 26, 1000);
		
		System.out.println(employee1.equals(employee2));
//		true oldugu icin equals metodunu override etmemiz gereklidir
//		bu employee1 ve employee2 ayni eleman olarak degerlendirir ve Set'e bir eleman eklenecektir
		
		EmployeeDuplicate employee3=new EmployeeDuplicate("Name", 25, 100);
		EmployeeDuplicate employee4=new EmployeeDuplicate("Name1", 36, 10000);
	
		Set<EmployeeDuplicate> empSet = new HashSet<EmployeeDuplicate>();
		
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		empSet.add(employee4);
	
		
		System.out.println();
		
		for(Object emp:empSet) {
			System.out.println(emp);
		}
		
		System.out.println(empSet.size());
//		equals metodunu override etmezsek tekrar ayni eleman eklenir size =4 olur
//		equequals metodunu override edersek ayni eleman eklenmez ve size=3 olur.
		
		
		
	}
}

class EmployeeDuplicate{
	
	String name;
	Integer age;
	Integer salary;
	
	public EmployeeDuplicate(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeeDuplicate [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		EmployeeDuplicate other = (EmployeeDuplicate) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}


	
	
	
	
	
	
	
	
}

