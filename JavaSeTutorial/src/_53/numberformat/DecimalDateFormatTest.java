package _53.numberformat;

import java.text.DecimalFormat;

public class DecimalDateFormatTest {

	public static void main(String[] args) {

		DecimalFormat decimalFormat = new DecimalFormat("#,###.###");

		System.out.println(decimalFormat.format(8795466.4566));
	}
}
