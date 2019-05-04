package _31.wrapper.equals;

public class WrapperEqualsTest {

	public static void main(String[] args) {
		Integer i = 10;
		Integer i2 = 10;
		Integer i5 = 10;

		System.out.println(i == i2);
		System.out.println(i.equals(i2));

		System.out.println(i == i5);

		Integer i3 = 999;
		Integer i4 = 999;
//		-128 ile -127 arasinda gecerlidir.
//		heapte yeni objeler olusturur
//		00 ayni objeyi mi gosterir !
		
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));

	}

}
