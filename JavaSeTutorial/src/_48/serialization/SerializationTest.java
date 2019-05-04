package _48.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee employee = new Employee();

		oos.writeObject(employee);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee employee1 = (Employee) ois.readObject();
		System.out.println(employee1.name + " " + employee1.number);

	}

}

class Employee implements Serializable {
	String name = "murat";
	transient Number number = new Number();
//	serilestirme yaparken number instance veriable pas gec

}

class Number {

	String phoneNumber = "3216458";
}