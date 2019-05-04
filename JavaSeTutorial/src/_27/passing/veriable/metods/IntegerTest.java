package _27.passing.veriable.metods;

public class IntegerTest {

	public static void main(String[] args) {
		Integer k=2;
		method(k);
		System.out.println(k);
		
	}
	
	static void method(Integer i) {
		i=i+10;
		System.out.println(i);
	}
}
