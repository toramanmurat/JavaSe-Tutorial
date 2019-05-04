package _51.date.format;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {

		Date date = new Date();

		DateFormat dateFormat = DateFormat.getInstance();

		System.out.println(date);
		System.out.println(dateFormat.format(date));

		DateFormat shortDateFormat = DateFormat.getDateInstance(DateFormat.SHORT);

		System.out.println("Short Date Format :" + shortDateFormat.format(date));

		DateFormat mediumDateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Medium Date Format :" + mediumDateFormat.format(date));

		DateFormat longDateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Long Date Format :" + longDateFormat.format(date));

		DateFormat fullDateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Full Date Format :" + fullDateFormat.format(date));

	}

}
