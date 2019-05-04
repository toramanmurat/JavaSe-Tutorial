package _27.passing.veriable.metods;

public class StringTest {

	public static void main(String[] args) {
		String s="test";
		method(s);
		System.out.println(s);
	}
	
	static void method(String str) {
		str=str+"Method";
		System.out.println(str);
	}
}
