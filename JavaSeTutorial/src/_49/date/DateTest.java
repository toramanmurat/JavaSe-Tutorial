package _49.date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();

		long time = date.getTime();

		System.out.println(time);

		long now = System.currentTimeMillis();

		System.out.println(now);
		
//		date sinifinin cogu metodu Deprecated olmus
	}
}
