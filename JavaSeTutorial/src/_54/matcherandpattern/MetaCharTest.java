package _54.matcherandpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharTest {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher("test123abc test2dcf");

		while (m.find()) {
			System.out.println(m.start() + " ");
		}
		System.out.println("-----------------------------");

		Pattern p2 = Pattern.compile("\\s");
		Matcher m2 = p2.matcher("test123abc test2dcf test123 testt34");

		while (m2.find()) {
			System.out.println(m2.start() + " ");
		}

		Pattern p3 = Pattern.compile("\\s\\d"); // bosluk olsun ve sonradan sayi gelsin
		Matcher m3 = p3.matcher("test123abc test2dcf test123 testt34");

		while (m3.find()) {
			System.out.println(m3.start() + " ");
		}

	}

}

//   \d digit
//   \s bosluk
//   \w harf rakam
//   \D non-digit
//   \S non-whitespace
//   \W non-word