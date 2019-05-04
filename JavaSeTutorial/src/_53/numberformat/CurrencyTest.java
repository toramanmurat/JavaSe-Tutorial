package _53.numberformat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

	public static void main(String[] args) {
		NumberFormat numberCurrencyFormat = NumberFormat.getCurrencyInstance();

		double number = 5489.6465;

		System.out.println(" : " + numberCurrencyFormat.format(number));

		NumberFormat currencyFormatGerman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println("German Currency :" + currencyFormatGerman.format(number));

		Locale turkey = new Locale("tr", "TR");
		NumberFormat currencyFormatTurkey = NumberFormat.getCurrencyInstance(turkey);
		System.out.println("Turkey Currency :" + currencyFormatTurkey.format(number));

		NumberFormat currencyFormatJapan = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println("Japan Currency :" + currencyFormatJapan.format(number));

		NumberFormat currencyFormatUk = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("Uk Currency :" + currencyFormatUk.format(number));

		String code = Currency.getInstance(Locale.US).getCurrencyCode();
		String symbol = Currency.getInstance(Locale.US).getSymbol();

		System.out.println(code + " " + symbol);

	}
}
