package _45.bufferedReader.bufferedWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter printWriter = new PrintWriter("printWriterTest.txt");

		printWriter.println("test1");
		printWriter.println("test2");
		printWriter.println("test3");
		printWriter.println("test4");
		printWriter.close();

	}
}
