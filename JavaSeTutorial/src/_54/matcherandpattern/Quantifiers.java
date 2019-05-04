package _54.matcherandpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		// A group of 3 digits followed by 7 digits.
		String regex = "\\b(\\d{3})\\d{7}\\b";

		// Compile the regular expression
		Pattern p = Pattern.compile(regex);

		String source = "12345678, 12345, and 9876543210";

		// Get the Matcher object
		Matcher m = p.matcher(source);

		// Start matching and display the found area codes
		while (m.find()) {
			String phone = m.group();
			String areaCode = m.group(1);
			System.out.println("Phone: " + phone + ", Area  Code:  " + areaCode);

		}
	}

}
//
//	* --> 0 veya daha fazla
//	+ --> 1 veya daha fazla
//	? --> 0 veya 1
//	{n}  --> n sayisi kadar
//	{n, }  --> n veya daha fazla
//	{n, m} -->minimum n maxmimim m