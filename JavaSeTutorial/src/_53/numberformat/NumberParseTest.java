package _53.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberParseTest {

	public static void main(String[] args) throws ParseException {

		NumberFormat numberFormat = NumberFormat.getInstance();

		Number number = numberFormat.parse("7896.546");
//		String-->Number
		System.out.println(number);

	}
}
