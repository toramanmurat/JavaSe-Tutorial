package _36.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyTest {

	public static void main(String[] args) {

		try {
			System.out.println("try ");

		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");

		}

		try {
			System.out.println("try 2");
			String str = null;
			System.out.println(str.length());
			System.out.println("exception!!!");// calismaz
		} catch (Exception e) {
			System.out.println("Exception2");
		} finally {
			System.out.println("Finally2");

		}

		FileReader fr = null;
		try {
			fr = new FileReader("murat.txt");
			fr.read();

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException ");
		} catch (IOException e) {
			System.out.println("IOException");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
//		dosya kapatma gibi islemler icin finally blogunda yazilmasi uygundur

	}
}
//try-finally
//try-catch-finally