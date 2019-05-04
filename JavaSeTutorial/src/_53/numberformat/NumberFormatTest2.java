package _53.numberformat;

import java.text.NumberFormat;

public class NumberFormatTest2 {

	public static void main(String[] args) {

		NumberFormat numberFormat = NumberFormat.getInstance();

		double number = 46568.7879798;

		System.out.println(numberFormat.format(number));

//		virgulden sonra max 5 karakter
		numberFormat.setMaximumFractionDigits(5);
		System.out.println(numberFormat.format(number));

		int number2=26;
//		virgulden sonra min 2 karakter
		numberFormat.setMinimumFractionDigits(2);
		System.out.println(numberFormat.format(number2));
	}

}
