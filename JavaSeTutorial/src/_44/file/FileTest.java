package _44.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("murat.txt");

		System.out.println(file.exists());
//		murat.txt dosyasi var mi ?

		file.createNewFile();
//		yeni bir dosya olusturur.

		System.out.println(file.exists());
//		true doner

	}
}
// java.io.file