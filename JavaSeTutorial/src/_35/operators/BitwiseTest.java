package _35.operators;

public class BitwiseTest {

	public static void main(String[] args) {

		int a = 12;
		int b = 10;
//		a 1 1 0 0 --12
//		b 1 0 1 0 --10
//		----------
//		  1 0 0 0

		int c = a & b;
		System.out.println(c);
		
//		a 1 1 0 0 --12
//		b 1 0 1 0 --10
//		------------
//		  1 1 1 0
	
		int d = a | b;
		System.out.println(d);
		
		int e= a ^ b;
		
//		a 1 1 0 0 --12
//		b 1 0 1 0 --10
//		------------
//		  0 1 1 0
		System.out.println(e);
		
	}

}
