package _52.locale;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {

		Locale[] locales = Locale.getAvailableLocales();

		int i = 1;

		for (Locale locale : locales) {
			System.out.println(locale);
			i++;
		}
		System.out.println("total locales :" + i);

		Locale locale = new Locale("tr", "TR");

		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());

		System.out.println(locale.getLanguage());
		System.out.println(locale.getDisplayLanguage());

	}
}
