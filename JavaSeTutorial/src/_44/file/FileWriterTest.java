package _44.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {

		File file = new File("murat.txt");
		FileWriter fw = new FileWriter(file);

		fw.write("test1");
		fw.write("test2");

		fw.close();
//		fw.flush();
//		dosyayi yazmasi icin close ya da  flush kullanmamiz gerekli

		FileReader fr = new FileReader(file);
		char[] fileRead = new char[100];
		fr.read(fileRead);

		for (char c : fileRead) {
			System.out.print(c + " ");
		}

		fr.close();

	}
}
