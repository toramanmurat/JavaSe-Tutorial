package _44.file;

import java.io.File;
import java.io.IOException;

public class FileDirectoryTest {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		file.createNewFile();

		File directory = new File("directory1");
		directory.mkdir();
//		yeni bir dosya olusturur

		File file2 = new File(directory, "test2.txt");
		file2.createNewFile();
//		directory icerisine test2.txt olusturur

		System.out.println("File icin");
		System.out.println(file.isFile()); // true
		System.out.println(file.isDirectory()); // false

		System.out.println("directory icin");
		System.out.println(directory.isFile()); // false
		System.out.println(directory.isDirectory()); // true

		File file3 = new File("test3.txt");
		file3.createNewFile();
//		test3.txt olusturduk

		file3.delete();
//		test4.txt sildik

		File file4 = new File("test4.txt");

		File file5 = new File("file5.txt");

		file4.renameTo(file5);
//		dosyanin ismini renameTo ile degistirebiliriz.
	}

}
