package _52.locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDateFormat {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(Locale.getDefault());

		Locale localeTR = new Locale("tr", "TR");

		DateFormat trDateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeTR);
		System.out.println(trDateFormat.format(date));

		DateFormat trDateFormat2 = DateFormat.getDateInstance(DateFormat.MEDIUM, localeTR);
		System.out.println(trDateFormat2.format(date));

		Locale localeGermany = Locale.GERMANY;
		DateFormat germanDateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeGermany);
		System.out.println(germanDateFormat.format(date));
	}
}
