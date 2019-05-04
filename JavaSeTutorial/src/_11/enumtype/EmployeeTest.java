package _11.enumtype;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeType employee = EmployeeType.FULL_TIME;
		System.out.println(employee);
		
		for(EmployeeType emptype:EmployeeType.values()) {
			System.out.println(emptype);
		}

	}
}
