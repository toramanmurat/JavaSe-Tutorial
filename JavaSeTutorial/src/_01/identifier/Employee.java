package _01.identifier;

public class Employee {

	private int age;
	private String name;
	private String surname;
	private boolean gender;

	public Employee(int age, String name, String surname) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public Employee() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

	// boolean degiskenlerin getter metotlari is yada get ile baslayabilir !
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
