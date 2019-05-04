package _50.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar instanceof GregorianCalendar); // true

		System.out.println(calendar);

		int year = calendar.get(Calendar.YEAR);

		System.out.println(year);

		int month = calendar.get(Calendar.MONTH);

		System.out.println(month);

		int daysOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println(daysOfWeek);

		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(dayOfMonth);

		int hour = calendar.get(Calendar.HOUR);
		System.out.println(hour);

		int minute = calendar.get(Calendar.MINUTE);
		System.out.println(minute);

		int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//		ayin kac gun cektigini bulabiliriz
		System.out.println("**" + lastDayOfMonth);

		calendar.add(Calendar.HOUR, 5);
		System.out.println("5 hour later :" + calendar.getTime());
		calendar.roll(Calendar.MONTH, 2);
		System.out.println("2 month year :" + calendar.getTime());

	}
}

// calendar sinifi abstract sinir oldugu icin yeni bir obje olusturamayiz
