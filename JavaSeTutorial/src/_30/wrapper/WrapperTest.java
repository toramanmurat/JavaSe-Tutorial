package _30.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		Integer i=new Integer(25);
		Integer i2=new Integer("10");
		
		Boolean b=new Boolean(false);
		Boolean b2=new Boolean("True");
		Boolean b3=new Boolean("TruE");
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
	}
	
}
