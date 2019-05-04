package _36.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionTest {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("murat.txt");
			fr.read();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ");
		} catch (IOException e) {
			System.out.println("IOException");
		}

	}

}
