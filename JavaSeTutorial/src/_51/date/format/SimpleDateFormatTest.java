package _51.date.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {

		Date date = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		System.out.println(simpleDateFormat.format(date));

		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM-dd-yy");
		System.out.println(simpleDateFormat2.format(date));

		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat3.format(date));

		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println(simpleDateFormat4.format(date));

	}

}
