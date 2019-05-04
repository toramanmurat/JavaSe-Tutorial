package _47.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutPutStream = new FileOutputStream("stream.txt");
		fileOutPutStream.write(100);

		byte[] b = { 97, 98, 99, 100, 101 };
		fileOutPutStream.write(b);

		fileOutPutStream.close();

		FileInputStream fileInputStream = new FileInputStream("stream.txt");

		while (fileInputStream.available() > 0) {
			int unicode = fileInputStream.read();
			System.out.println(unicode + " " + (char) unicode);
		}

		fileInputStream.close();

	}

}
