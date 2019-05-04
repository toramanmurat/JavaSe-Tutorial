package _31.wrapper.equals;

public class WrapperEqualsTest2 {

	public static void main(String[] args) {

		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
//		new anahtar kelimesiyle olusturdugumuzda obje heapte olusur
//		== kontrollunde farklı objeler gosterdigi icin false doner

		System.out.println(i == i2);
		System.out.println(i.equals(i2));

		Integer i3 = new Integer(999);
		Integer i4 = new Integer(999);

		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));

	}

}
