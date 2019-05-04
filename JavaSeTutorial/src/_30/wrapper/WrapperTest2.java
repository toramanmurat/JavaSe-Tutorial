package _30.wrapper;

public class WrapperTest2 {

	public static void main(String[] args) {
		
		Integer i=Integer.valueOf(100);
		Integer i2=Integer.valueOf("100");
		
		Float f=Float.valueOf(100.5f);
		
		Boolean b=Boolean.valueOf("true");
		
		//wrapper sinirlar da xxxvalue gibi siniflar var.
		
		byte bt=i.byteValue();
		short st=i.shortValue();
		
		
		int i3=Integer.parseInt("100");
		int i4=Short.parseShort("1000");
	}
}
