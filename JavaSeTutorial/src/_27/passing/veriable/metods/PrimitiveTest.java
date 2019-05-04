package _27.passing.veriable.metods;

public class PrimitiveTest {

	public static void main(String[] args) {
		int num=10;
		method(num);
		System.out.println(num);
		
	}
	
	static void method(int number) {
		number=number+5;
		System.out.println(number);
		
	}
}
