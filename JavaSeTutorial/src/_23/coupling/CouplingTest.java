package _23.coupling;

class Employee{
	private String name;
	private String surname;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

public class CouplingTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("Murat");
		employee.setSurname("Toraman");
		employee.setAge(26);
		
		System.out.println(employee.getName());
		System.out.println(employee.getSurname());
		System.out.println(employee.getAge());
		
	}
}
