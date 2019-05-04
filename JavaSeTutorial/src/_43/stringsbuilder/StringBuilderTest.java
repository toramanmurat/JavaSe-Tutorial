package _43.stringsbuilder;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Murat");
		sb.append("Toraman");
		sb.append(26);
		sb.append("M");
		System.out.println(sb);

		StringBuilder sb2 = new StringBuilder("MuratToraman1");
		sb2.delete(3, 6);

		System.out.println(sb2);

		StringBuilder sb3 = new StringBuilder("MuratToraman2");
		sb3.insert(5, 26);

		System.out.println(sb3);

		StringBuilder sb4 = new StringBuilder("MuratToraman3");
		sb4.reverse();

		System.out.println(sb4);

		StringBuffer sb5 = new StringBuffer("MuratToraman4");
		sb5.append("test");
		System.out.println(sb5);

	}

}
