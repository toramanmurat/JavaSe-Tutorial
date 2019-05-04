package _40checkedanduncheckedexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleOrDeclareTest2 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		method3();
//		handle yada declare etmemize gerek yoktur!
//		derleme hatasi vermez

	}

	static void method1() throws FileNotFoundException {
		method2();

	}

	static void method2() throws FileNotFoundException {
		FileReader fr = new FileReader("murat");
	}

	static void method3() throws NullPointerException {
		throw new NullPointerException();
	}
}
