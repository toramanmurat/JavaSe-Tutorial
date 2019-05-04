package _53.numberformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {

		NumberFormat numberFormat = NumberFormat.getInstance();

		System.out.println(numberFormat instanceof DecimalFormat); // true

		double number = 1546.6876;
		System.out.println(number);

		System.out.println("Number Format before :" + numberFormat.format(number));

		Locale localeTr = new Locale("tr", "TR");
		NumberFormat numberFormatTr = NumberFormat.getNumberInstance(localeTr);

		System.out.println("Turkey format :" + numberFormatTr.format(number));

		Locale localeChina = Locale.CHINA;
		NumberFormat numberFormatChina = NumberFormat.getNumberInstance(localeChina);

		System.out.println("China format :" + numberFormatChina.format(number));

	}
}
