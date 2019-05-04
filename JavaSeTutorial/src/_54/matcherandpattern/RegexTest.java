package _54.matcherandpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("java");

		while (m.find()) {
			System.out.println(m.start() + " ");
		}

		Pattern p2 = Pattern.compile("ja");
		Matcher m2 = p2.matcher("java");

		while (m2.find()) {
			System.out.println(m2.start() + " " + m2.end());
		}

		Pattern p3 = Pattern.compile("a|t|y");
		Matcher m3 = p3.matcher("java");

		while (m3.find()) {
			System.out.println(m3.start() + " " + m3.end());
		}

		Pattern p4 = Pattern.compile("a-d");
		Matcher m4 = p4.matcher("java");

		while (m4.find()) {
			System.out.println(m4.start() + " " + m4.end());
		}

	}
}
