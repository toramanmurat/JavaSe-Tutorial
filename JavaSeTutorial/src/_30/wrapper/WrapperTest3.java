package _30.wrapper;

public class WrapperTest3 {

	public static void main(String[] args) {
		
		Integer autoBoxing=10;
		Integer boxing=new Integer(190);
		
		Integer boxing2=new Integer(15);
		int unboxing=boxing2.intValue();
		
		//wrapper -> primitive unboxing
		// primiteve -> wrapper boxing
		
		Integer autoBoxing2=90;
		int autoUnBoxing=autoBoxing2;
		
		System.out.println(autoBoxing);
		System.out.println(boxing);
		System.out.println(unboxing);
		System.out.println(autoUnBoxing);
	}
}
