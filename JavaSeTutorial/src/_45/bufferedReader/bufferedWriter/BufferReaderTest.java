package _45.bufferedReader.bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderTest {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("deneme.txt");

		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		bufferedWriter.write("test");
		bufferedWriter.write("\t");
		bufferedWriter.write("test2");
		bufferedWriter.write("\n");
		bufferedWriter.write("test3");

		bufferedWriter.close();

		FileReader fileReader = new FileReader("deneme.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String lineContent = null;
		while ((lineContent = bufferedReader.readLine()) != null) {
			System.out.println(lineContent);
		}

		bufferedReader.close();
	}

}
