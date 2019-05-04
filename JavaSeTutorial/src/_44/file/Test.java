package _44.file;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		File myDirectory = new File("myDirectort");
		myDirectory.mkdir();

		File subDirectory = new File(myDirectory, "subDirectory");
		subDirectory.mkdir();

		File file1 = new File(myDirectory, "test1.txt");
		file1.createNewFile();

		File file2 = new File(myDirectory, "test2.txt");
		file2.createNewFile();

		File file3 = new File(myDirectory, "test3.txt");
		file3.createNewFile();

		File file4 = new File(myDirectory, "test4.txt");
		file4.createNewFile();

		File file5 = new File(myDirectory, "test5.txt");
		file5.createNewFile();

		String[] listNames = myDirectory.list();

		for (String s : listNames) {
			System.out.println(s);
		}

		File[] files = myDirectory.listFiles();

		for (File f : files) {

			if (f.isFile()) {
				System.out.println("File name: " + f.getName() + " File path: " + f.getAbsolutePath());
			} else if (f.isDirectory()) {

				System.out.println("Directory name:" + f.getName() + " Directory path " + f.getAbsolutePath());
			}

		}
	}

}
