package _46.append.file;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFileTest {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("deneme01.txt", true);
//		true verdigimiz icin dosyayi tekrar yazmaz uzerine ekleme yapar

		fileWriter.write("test1");
		fileWriter.close();

	}
}
